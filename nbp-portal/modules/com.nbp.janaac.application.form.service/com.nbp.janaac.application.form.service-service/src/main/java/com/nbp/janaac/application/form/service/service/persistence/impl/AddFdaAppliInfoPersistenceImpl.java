/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.janaac.application.form.service.exception.NoSuchAddFdaAppliInfoException;
import com.nbp.janaac.application.form.service.model.AddFdaAppliInfo;
import com.nbp.janaac.application.form.service.model.AddFdaAppliInfoTable;
import com.nbp.janaac.application.form.service.model.impl.AddFdaAppliInfoImpl;
import com.nbp.janaac.application.form.service.model.impl.AddFdaAppliInfoModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaAppliInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddFdaAppliInfoUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add fda appli info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddFdaAppliInfoPersistence.class)
public class AddFdaAppliInfoPersistenceImpl
	extends BasePersistenceImpl<AddFdaAppliInfo>
	implements AddFdaAppliInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddFdaAppliInfoUtil</code> to access the add fda appli info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddFdaAppliInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add fda appli infos
	 */
	@Override
	public List<AddFdaAppliInfo> findBygetJanaacById(long janaacApplicationId) {
		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @return the range of matching add fda appli infos
	 */
	@Override
	public List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add fda appli infos
	 */
	@Override
	public List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaAppliInfo> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add fda appli infos
	 */
	@Override
	public List<AddFdaAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddFdaAppliInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddFdaAppliInfo> list = null;

		if (useFinderCache) {
			list = (List<AddFdaAppliInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddFdaAppliInfo addFdaAppliInfo : list) {
					if (janaacApplicationId !=
							addFdaAppliInfo.getJanaacApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_ADDFDAAPPLIINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddFdaAppliInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddFdaAppliInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a matching add fda appli info could not be found
	 */
	@Override
	public AddFdaAppliInfo findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddFdaAppliInfo> orderByComparator)
		throws NoSuchAddFdaAppliInfoException {

		AddFdaAppliInfo addFdaAppliInfo = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addFdaAppliInfo != null) {
			return addFdaAppliInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaAppliInfoException(sb.toString());
	}

	/**
	 * Returns the first add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add fda appli info, or <code>null</code> if a matching add fda appli info could not be found
	 */
	@Override
	public AddFdaAppliInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddFdaAppliInfo> orderByComparator) {

		List<AddFdaAppliInfo> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a matching add fda appli info could not be found
	 */
	@Override
	public AddFdaAppliInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddFdaAppliInfo> orderByComparator)
		throws NoSuchAddFdaAppliInfoException {

		AddFdaAppliInfo addFdaAppliInfo = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addFdaAppliInfo != null) {
			return addFdaAppliInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddFdaAppliInfoException(sb.toString());
	}

	/**
	 * Returns the last add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add fda appli info, or <code>null</code> if a matching add fda appli info could not be found
	 */
	@Override
	public AddFdaAppliInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddFdaAppliInfo> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddFdaAppliInfo> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add fda appli infos before and after the current add fda appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addFdaAppliInfoId the primary key of the current add fda appli info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	@Override
	public AddFdaAppliInfo[] findBygetJanaacById_PrevAndNext(
			long addFdaAppliInfoId, long janaacApplicationId,
			OrderByComparator<AddFdaAppliInfo> orderByComparator)
		throws NoSuchAddFdaAppliInfoException {

		AddFdaAppliInfo addFdaAppliInfo = findByPrimaryKey(addFdaAppliInfoId);

		Session session = null;

		try {
			session = openSession();

			AddFdaAppliInfo[] array = new AddFdaAppliInfoImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addFdaAppliInfo, janaacApplicationId,
				orderByComparator, true);

			array[1] = addFdaAppliInfo;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addFdaAppliInfo, janaacApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AddFdaAppliInfo getBygetJanaacById_PrevAndNext(
		Session session, AddFdaAppliInfo addFdaAppliInfo,
		long janaacApplicationId,
		OrderByComparator<AddFdaAppliInfo> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_ADDFDAAPPLIINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AddFdaAppliInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addFdaAppliInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddFdaAppliInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add fda appli infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddFdaAppliInfo addFdaAppliInfo :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addFdaAppliInfo);
		}
	}

	/**
	 * Returns the number of add fda appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add fda appli infos
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDFDAAPPLIINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addFdaAppliInfo.janaacApplicationId = ?";

	public AddFdaAppliInfoPersistenceImpl() {
		setModelClass(AddFdaAppliInfo.class);

		setModelImplClass(AddFdaAppliInfoImpl.class);
		setModelPKClass(long.class);

		setTable(AddFdaAppliInfoTable.INSTANCE);
	}

	/**
	 * Caches the add fda appli info in the entity cache if it is enabled.
	 *
	 * @param addFdaAppliInfo the add fda appli info
	 */
	@Override
	public void cacheResult(AddFdaAppliInfo addFdaAppliInfo) {
		entityCache.putResult(
			AddFdaAppliInfoImpl.class, addFdaAppliInfo.getPrimaryKey(),
			addFdaAppliInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add fda appli infos in the entity cache if it is enabled.
	 *
	 * @param addFdaAppliInfos the add fda appli infos
	 */
	@Override
	public void cacheResult(List<AddFdaAppliInfo> addFdaAppliInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addFdaAppliInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddFdaAppliInfo addFdaAppliInfo : addFdaAppliInfos) {
			if (entityCache.getResult(
					AddFdaAppliInfoImpl.class,
					addFdaAppliInfo.getPrimaryKey()) == null) {

				cacheResult(addFdaAppliInfo);
			}
		}
	}

	/**
	 * Clears the cache for all add fda appli infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddFdaAppliInfoImpl.class);

		finderCache.clearCache(AddFdaAppliInfoImpl.class);
	}

	/**
	 * Clears the cache for the add fda appli info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddFdaAppliInfo addFdaAppliInfo) {
		entityCache.removeResult(AddFdaAppliInfoImpl.class, addFdaAppliInfo);
	}

	@Override
	public void clearCache(List<AddFdaAppliInfo> addFdaAppliInfos) {
		for (AddFdaAppliInfo addFdaAppliInfo : addFdaAppliInfos) {
			entityCache.removeResult(
				AddFdaAppliInfoImpl.class, addFdaAppliInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddFdaAppliInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddFdaAppliInfoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add fda appli info with the primary key. Does not add the add fda appli info to the database.
	 *
	 * @param addFdaAppliInfoId the primary key for the new add fda appli info
	 * @return the new add fda appli info
	 */
	@Override
	public AddFdaAppliInfo create(long addFdaAppliInfoId) {
		AddFdaAppliInfo addFdaAppliInfo = new AddFdaAppliInfoImpl();

		addFdaAppliInfo.setNew(true);
		addFdaAppliInfo.setPrimaryKey(addFdaAppliInfoId);

		addFdaAppliInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addFdaAppliInfo;
	}

	/**
	 * Removes the add fda appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info that was removed
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	@Override
	public AddFdaAppliInfo remove(long addFdaAppliInfoId)
		throws NoSuchAddFdaAppliInfoException {

		return remove((Serializable)addFdaAppliInfoId);
	}

	/**
	 * Removes the add fda appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add fda appli info
	 * @return the add fda appli info that was removed
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	@Override
	public AddFdaAppliInfo remove(Serializable primaryKey)
		throws NoSuchAddFdaAppliInfoException {

		Session session = null;

		try {
			session = openSession();

			AddFdaAppliInfo addFdaAppliInfo = (AddFdaAppliInfo)session.get(
				AddFdaAppliInfoImpl.class, primaryKey);

			if (addFdaAppliInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddFdaAppliInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addFdaAppliInfo);
		}
		catch (NoSuchAddFdaAppliInfoException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AddFdaAppliInfo removeImpl(AddFdaAppliInfo addFdaAppliInfo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addFdaAppliInfo)) {
				addFdaAppliInfo = (AddFdaAppliInfo)session.get(
					AddFdaAppliInfoImpl.class,
					addFdaAppliInfo.getPrimaryKeyObj());
			}

			if (addFdaAppliInfo != null) {
				session.delete(addFdaAppliInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addFdaAppliInfo != null) {
			clearCache(addFdaAppliInfo);
		}

		return addFdaAppliInfo;
	}

	@Override
	public AddFdaAppliInfo updateImpl(AddFdaAppliInfo addFdaAppliInfo) {
		boolean isNew = addFdaAppliInfo.isNew();

		if (!(addFdaAppliInfo instanceof AddFdaAppliInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addFdaAppliInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addFdaAppliInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addFdaAppliInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddFdaAppliInfo implementation " +
					addFdaAppliInfo.getClass());
		}

		AddFdaAppliInfoModelImpl addFdaAppliInfoModelImpl =
			(AddFdaAppliInfoModelImpl)addFdaAppliInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addFdaAppliInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				addFdaAppliInfo.setCreateDate(date);
			}
			else {
				addFdaAppliInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addFdaAppliInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addFdaAppliInfo.setModifiedDate(date);
			}
			else {
				addFdaAppliInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addFdaAppliInfo);
			}
			else {
				addFdaAppliInfo = (AddFdaAppliInfo)session.merge(
					addFdaAppliInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddFdaAppliInfoImpl.class, addFdaAppliInfoModelImpl, false, true);

		if (isNew) {
			addFdaAppliInfo.setNew(false);
		}

		addFdaAppliInfo.resetOriginalValues();

		return addFdaAppliInfo;
	}

	/**
	 * Returns the add fda appli info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add fda appli info
	 * @return the add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	@Override
	public AddFdaAppliInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddFdaAppliInfoException {

		AddFdaAppliInfo addFdaAppliInfo = fetchByPrimaryKey(primaryKey);

		if (addFdaAppliInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddFdaAppliInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addFdaAppliInfo;
	}

	/**
	 * Returns the add fda appli info with the primary key or throws a <code>NoSuchAddFdaAppliInfoException</code> if it could not be found.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info
	 * @throws NoSuchAddFdaAppliInfoException if a add fda appli info with the primary key could not be found
	 */
	@Override
	public AddFdaAppliInfo findByPrimaryKey(long addFdaAppliInfoId)
		throws NoSuchAddFdaAppliInfoException {

		return findByPrimaryKey((Serializable)addFdaAppliInfoId);
	}

	/**
	 * Returns the add fda appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info, or <code>null</code> if a add fda appli info with the primary key could not be found
	 */
	@Override
	public AddFdaAppliInfo fetchByPrimaryKey(long addFdaAppliInfoId) {
		return fetchByPrimaryKey((Serializable)addFdaAppliInfoId);
	}

	/**
	 * Returns all the add fda appli infos.
	 *
	 * @return the add fda appli infos
	 */
	@Override
	public List<AddFdaAppliInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @return the range of add fda appli infos
	 */
	@Override
	public List<AddFdaAppliInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add fda appli infos
	 */
	@Override
	public List<AddFdaAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AddFdaAppliInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add fda appli infos
	 */
	@Override
	public List<AddFdaAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AddFdaAppliInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<AddFdaAppliInfo> list = null;

		if (useFinderCache) {
			list = (List<AddFdaAppliInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDFDAAPPLIINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDFDAAPPLIINFO;

				sql = sql.concat(AddFdaAppliInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddFdaAppliInfo>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the add fda appli infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddFdaAppliInfo addFdaAppliInfo : findAll()) {
			remove(addFdaAppliInfo);
		}
	}

	/**
	 * Returns the number of add fda appli infos.
	 *
	 * @return the number of add fda appli infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ADDFDAAPPLIINFO);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "addFdaAppliInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDFDAAPPLIINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddFdaAppliInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add fda appli info persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddFdaAppliInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddFdaAppliInfoUtil.setPersistence(null);

		entityCache.removeCache(AddFdaAppliInfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDFDAAPPLIINFO =
		"SELECT addFdaAppliInfo FROM AddFdaAppliInfo addFdaAppliInfo";

	private static final String _SQL_SELECT_ADDFDAAPPLIINFO_WHERE =
		"SELECT addFdaAppliInfo FROM AddFdaAppliInfo addFdaAppliInfo WHERE ";

	private static final String _SQL_COUNT_ADDFDAAPPLIINFO =
		"SELECT COUNT(addFdaAppliInfo) FROM AddFdaAppliInfo addFdaAppliInfo";

	private static final String _SQL_COUNT_ADDFDAAPPLIINFO_WHERE =
		"SELECT COUNT(addFdaAppliInfo) FROM AddFdaAppliInfo addFdaAppliInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addFdaAppliInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddFdaAppliInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddFdaAppliInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddFdaAppliInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}