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

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabAppliInfoException;
import com.nbp.janaac.application.form.service.model.AddLabAppliInfo;
import com.nbp.janaac.application.form.service.model.AddLabAppliInfoTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabAppliInfoModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabAppliInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabAppliInfoUtil;
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
 * The persistence implementation for the add lab appli info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabAppliInfoPersistence.class)
public class AddLabAppliInfoPersistenceImpl
	extends BasePersistenceImpl<AddLabAppliInfo>
	implements AddLabAppliInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabAppliInfoUtil</code> to access the add lab appli info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabAppliInfoImpl.class.getName();

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
	 * Returns all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab appli infos
	 */
	@Override
	public List<AddLabAppliInfo> findBygetJanaacById(long janaacApplicationId) {
		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @return the range of matching add lab appli infos
	 */
	@Override
	public List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab appli infos
	 */
	@Override
	public List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabAppliInfo> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab appli infos
	 */
	@Override
	public List<AddLabAppliInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabAppliInfo> orderByComparator,
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

		List<AddLabAppliInfo> list = null;

		if (useFinderCache) {
			list = (List<AddLabAppliInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabAppliInfo addLabAppliInfo : list) {
					if (janaacApplicationId !=
							addLabAppliInfo.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABAPPLIINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabAppliInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabAppliInfo>)QueryUtil.list(
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
	 * Returns the first add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a matching add lab appli info could not be found
	 */
	@Override
	public AddLabAppliInfo findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabAppliInfo> orderByComparator)
		throws NoSuchAddLabAppliInfoException {

		AddLabAppliInfo addLabAppliInfo = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addLabAppliInfo != null) {
			return addLabAppliInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabAppliInfoException(sb.toString());
	}

	/**
	 * Returns the first add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab appli info, or <code>null</code> if a matching add lab appli info could not be found
	 */
	@Override
	public AddLabAppliInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabAppliInfo> orderByComparator) {

		List<AddLabAppliInfo> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a matching add lab appli info could not be found
	 */
	@Override
	public AddLabAppliInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabAppliInfo> orderByComparator)
		throws NoSuchAddLabAppliInfoException {

		AddLabAppliInfo addLabAppliInfo = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addLabAppliInfo != null) {
			return addLabAppliInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabAppliInfoException(sb.toString());
	}

	/**
	 * Returns the last add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab appli info, or <code>null</code> if a matching add lab appli info could not be found
	 */
	@Override
	public AddLabAppliInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabAppliInfo> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabAppliInfo> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab appli infos before and after the current add lab appli info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabAppliInfoId the primary key of the current add lab appli info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	@Override
	public AddLabAppliInfo[] findBygetJanaacById_PrevAndNext(
			long addLabAppliInfoId, long janaacApplicationId,
			OrderByComparator<AddLabAppliInfo> orderByComparator)
		throws NoSuchAddLabAppliInfoException {

		AddLabAppliInfo addLabAppliInfo = findByPrimaryKey(addLabAppliInfoId);

		Session session = null;

		try {
			session = openSession();

			AddLabAppliInfo[] array = new AddLabAppliInfoImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabAppliInfo, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabAppliInfo;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabAppliInfo, janaacApplicationId,
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

	protected AddLabAppliInfo getBygetJanaacById_PrevAndNext(
		Session session, AddLabAppliInfo addLabAppliInfo,
		long janaacApplicationId,
		OrderByComparator<AddLabAppliInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABAPPLIINFO_WHERE);

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
			sb.append(AddLabAppliInfoModelImpl.ORDER_BY_JPQL);
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
						addLabAppliInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabAppliInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab appli infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabAppliInfo addLabAppliInfo :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabAppliInfo);
		}
	}

	/**
	 * Returns the number of add lab appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab appli infos
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABAPPLIINFO_WHERE);

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
			"addLabAppliInfo.janaacApplicationId = ?";

	public AddLabAppliInfoPersistenceImpl() {
		setModelClass(AddLabAppliInfo.class);

		setModelImplClass(AddLabAppliInfoImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabAppliInfoTable.INSTANCE);
	}

	/**
	 * Caches the add lab appli info in the entity cache if it is enabled.
	 *
	 * @param addLabAppliInfo the add lab appli info
	 */
	@Override
	public void cacheResult(AddLabAppliInfo addLabAppliInfo) {
		entityCache.putResult(
			AddLabAppliInfoImpl.class, addLabAppliInfo.getPrimaryKey(),
			addLabAppliInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab appli infos in the entity cache if it is enabled.
	 *
	 * @param addLabAppliInfos the add lab appli infos
	 */
	@Override
	public void cacheResult(List<AddLabAppliInfo> addLabAppliInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabAppliInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabAppliInfo addLabAppliInfo : addLabAppliInfos) {
			if (entityCache.getResult(
					AddLabAppliInfoImpl.class,
					addLabAppliInfo.getPrimaryKey()) == null) {

				cacheResult(addLabAppliInfo);
			}
		}
	}

	/**
	 * Clears the cache for all add lab appli infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabAppliInfoImpl.class);

		finderCache.clearCache(AddLabAppliInfoImpl.class);
	}

	/**
	 * Clears the cache for the add lab appli info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddLabAppliInfo addLabAppliInfo) {
		entityCache.removeResult(AddLabAppliInfoImpl.class, addLabAppliInfo);
	}

	@Override
	public void clearCache(List<AddLabAppliInfo> addLabAppliInfos) {
		for (AddLabAppliInfo addLabAppliInfo : addLabAppliInfos) {
			entityCache.removeResult(
				AddLabAppliInfoImpl.class, addLabAppliInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabAppliInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AddLabAppliInfoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab appli info with the primary key. Does not add the add lab appli info to the database.
	 *
	 * @param addLabAppliInfoId the primary key for the new add lab appli info
	 * @return the new add lab appli info
	 */
	@Override
	public AddLabAppliInfo create(long addLabAppliInfoId) {
		AddLabAppliInfo addLabAppliInfo = new AddLabAppliInfoImpl();

		addLabAppliInfo.setNew(true);
		addLabAppliInfo.setPrimaryKey(addLabAppliInfoId);

		addLabAppliInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addLabAppliInfo;
	}

	/**
	 * Removes the add lab appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info that was removed
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	@Override
	public AddLabAppliInfo remove(long addLabAppliInfoId)
		throws NoSuchAddLabAppliInfoException {

		return remove((Serializable)addLabAppliInfoId);
	}

	/**
	 * Removes the add lab appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab appli info
	 * @return the add lab appli info that was removed
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	@Override
	public AddLabAppliInfo remove(Serializable primaryKey)
		throws NoSuchAddLabAppliInfoException {

		Session session = null;

		try {
			session = openSession();

			AddLabAppliInfo addLabAppliInfo = (AddLabAppliInfo)session.get(
				AddLabAppliInfoImpl.class, primaryKey);

			if (addLabAppliInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabAppliInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabAppliInfo);
		}
		catch (NoSuchAddLabAppliInfoException noSuchEntityException) {
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
	protected AddLabAppliInfo removeImpl(AddLabAppliInfo addLabAppliInfo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabAppliInfo)) {
				addLabAppliInfo = (AddLabAppliInfo)session.get(
					AddLabAppliInfoImpl.class,
					addLabAppliInfo.getPrimaryKeyObj());
			}

			if (addLabAppliInfo != null) {
				session.delete(addLabAppliInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabAppliInfo != null) {
			clearCache(addLabAppliInfo);
		}

		return addLabAppliInfo;
	}

	@Override
	public AddLabAppliInfo updateImpl(AddLabAppliInfo addLabAppliInfo) {
		boolean isNew = addLabAppliInfo.isNew();

		if (!(addLabAppliInfo instanceof AddLabAppliInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabAppliInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabAppliInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabAppliInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabAppliInfo implementation " +
					addLabAppliInfo.getClass());
		}

		AddLabAppliInfoModelImpl addLabAppliInfoModelImpl =
			(AddLabAppliInfoModelImpl)addLabAppliInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabAppliInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabAppliInfo.setCreateDate(date);
			}
			else {
				addLabAppliInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabAppliInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabAppliInfo.setModifiedDate(date);
			}
			else {
				addLabAppliInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabAppliInfo);
			}
			else {
				addLabAppliInfo = (AddLabAppliInfo)session.merge(
					addLabAppliInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabAppliInfoImpl.class, addLabAppliInfoModelImpl, false, true);

		if (isNew) {
			addLabAppliInfo.setNew(false);
		}

		addLabAppliInfo.resetOriginalValues();

		return addLabAppliInfo;
	}

	/**
	 * Returns the add lab appli info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab appli info
	 * @return the add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	@Override
	public AddLabAppliInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabAppliInfoException {

		AddLabAppliInfo addLabAppliInfo = fetchByPrimaryKey(primaryKey);

		if (addLabAppliInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabAppliInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabAppliInfo;
	}

	/**
	 * Returns the add lab appli info with the primary key or throws a <code>NoSuchAddLabAppliInfoException</code> if it could not be found.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info
	 * @throws NoSuchAddLabAppliInfoException if a add lab appli info with the primary key could not be found
	 */
	@Override
	public AddLabAppliInfo findByPrimaryKey(long addLabAppliInfoId)
		throws NoSuchAddLabAppliInfoException {

		return findByPrimaryKey((Serializable)addLabAppliInfoId);
	}

	/**
	 * Returns the add lab appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabAppliInfoId the primary key of the add lab appli info
	 * @return the add lab appli info, or <code>null</code> if a add lab appli info with the primary key could not be found
	 */
	@Override
	public AddLabAppliInfo fetchByPrimaryKey(long addLabAppliInfoId) {
		return fetchByPrimaryKey((Serializable)addLabAppliInfoId);
	}

	/**
	 * Returns all the add lab appli infos.
	 *
	 * @return the add lab appli infos
	 */
	@Override
	public List<AddLabAppliInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @return the range of add lab appli infos
	 */
	@Override
	public List<AddLabAppliInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab appli infos
	 */
	@Override
	public List<AddLabAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AddLabAppliInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab appli infos
	 * @param end the upper bound of the range of add lab appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab appli infos
	 */
	@Override
	public List<AddLabAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AddLabAppliInfo> orderByComparator,
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

		List<AddLabAppliInfo> list = null;

		if (useFinderCache) {
			list = (List<AddLabAppliInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABAPPLIINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABAPPLIINFO;

				sql = sql.concat(AddLabAppliInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabAppliInfo>)QueryUtil.list(
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
	 * Removes all the add lab appli infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabAppliInfo addLabAppliInfo : findAll()) {
			remove(addLabAppliInfo);
		}
	}

	/**
	 * Returns the number of add lab appli infos.
	 *
	 * @return the number of add lab appli infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_ADDLABAPPLIINFO);

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
		return "addLabAppliInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABAPPLIINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabAppliInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab appli info persistence.
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

		AddLabAppliInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabAppliInfoUtil.setPersistence(null);

		entityCache.removeCache(AddLabAppliInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDLABAPPLIINFO =
		"SELECT addLabAppliInfo FROM AddLabAppliInfo addLabAppliInfo";

	private static final String _SQL_SELECT_ADDLABAPPLIINFO_WHERE =
		"SELECT addLabAppliInfo FROM AddLabAppliInfo addLabAppliInfo WHERE ";

	private static final String _SQL_COUNT_ADDLABAPPLIINFO =
		"SELECT COUNT(addLabAppliInfo) FROM AddLabAppliInfo addLabAppliInfo";

	private static final String _SQL_COUNT_ADDLABAPPLIINFO_WHERE =
		"SELECT COUNT(addLabAppliInfo) FROM AddLabAppliInfo addLabAppliInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "addLabAppliInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabAppliInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabAppliInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabAppliInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}