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

import com.nbp.janaac.application.form.service.exception.NoSuchAddCerApplicationInfoException;
import com.nbp.janaac.application.form.service.model.AddCerApplicationInfo;
import com.nbp.janaac.application.form.service.model.AddCerApplicationInfoTable;
import com.nbp.janaac.application.form.service.model.impl.AddCerApplicationInfoImpl;
import com.nbp.janaac.application.form.service.model.impl.AddCerApplicationInfoModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddCerApplicationInfoPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddCerApplicationInfoUtil;
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
 * The persistence implementation for the add cer application info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddCerApplicationInfoPersistence.class)
public class AddCerApplicationInfoPersistenceImpl
	extends BasePersistenceImpl<AddCerApplicationInfo>
	implements AddCerApplicationInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddCerApplicationInfoUtil</code> to access the add cer application info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddCerApplicationInfoImpl.class.getName();

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
	 * Returns all the add cer application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add cer application infos
	 */
	@Override
	public List<AddCerApplicationInfo> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @return the range of matching add cer application infos
	 */
	@Override
	public List<AddCerApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add cer application infos
	 */
	@Override
	public List<AddCerApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerApplicationInfo> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer application infos where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add cer application infos
	 */
	@Override
	public List<AddCerApplicationInfo> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddCerApplicationInfo> orderByComparator,
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

		List<AddCerApplicationInfo> list = null;

		if (useFinderCache) {
			list = (List<AddCerApplicationInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddCerApplicationInfo addCerApplicationInfo : list) {
					if (janaacApplicationId !=
							addCerApplicationInfo.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDCERAPPLICATIONINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddCerApplicationInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddCerApplicationInfo>)QueryUtil.list(
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
	 * Returns the first add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer application info
	 * @throws NoSuchAddCerApplicationInfoException if a matching add cer application info could not be found
	 */
	@Override
	public AddCerApplicationInfo findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddCerApplicationInfo> orderByComparator)
		throws NoSuchAddCerApplicationInfoException {

		AddCerApplicationInfo addCerApplicationInfo =
			fetchBygetJanaacById_First(janaacApplicationId, orderByComparator);

		if (addCerApplicationInfo != null) {
			return addCerApplicationInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerApplicationInfoException(sb.toString());
	}

	/**
	 * Returns the first add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add cer application info, or <code>null</code> if a matching add cer application info could not be found
	 */
	@Override
	public AddCerApplicationInfo fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddCerApplicationInfo> orderByComparator) {

		List<AddCerApplicationInfo> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer application info
	 * @throws NoSuchAddCerApplicationInfoException if a matching add cer application info could not be found
	 */
	@Override
	public AddCerApplicationInfo findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddCerApplicationInfo> orderByComparator)
		throws NoSuchAddCerApplicationInfoException {

		AddCerApplicationInfo addCerApplicationInfo = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addCerApplicationInfo != null) {
			return addCerApplicationInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddCerApplicationInfoException(sb.toString());
	}

	/**
	 * Returns the last add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add cer application info, or <code>null</code> if a matching add cer application info could not be found
	 */
	@Override
	public AddCerApplicationInfo fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddCerApplicationInfo> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddCerApplicationInfo> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add cer application infos before and after the current add cer application info in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addCerApplicationInfoId the primary key of the current add cer application info
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add cer application info
	 * @throws NoSuchAddCerApplicationInfoException if a add cer application info with the primary key could not be found
	 */
	@Override
	public AddCerApplicationInfo[] findBygetJanaacById_PrevAndNext(
			long addCerApplicationInfoId, long janaacApplicationId,
			OrderByComparator<AddCerApplicationInfo> orderByComparator)
		throws NoSuchAddCerApplicationInfoException {

		AddCerApplicationInfo addCerApplicationInfo = findByPrimaryKey(
			addCerApplicationInfoId);

		Session session = null;

		try {
			session = openSession();

			AddCerApplicationInfo[] array = new AddCerApplicationInfoImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addCerApplicationInfo, janaacApplicationId,
				orderByComparator, true);

			array[1] = addCerApplicationInfo;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addCerApplicationInfo, janaacApplicationId,
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

	protected AddCerApplicationInfo getBygetJanaacById_PrevAndNext(
		Session session, AddCerApplicationInfo addCerApplicationInfo,
		long janaacApplicationId,
		OrderByComparator<AddCerApplicationInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDCERAPPLICATIONINFO_WHERE);

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
			sb.append(AddCerApplicationInfoModelImpl.ORDER_BY_JPQL);
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
						addCerApplicationInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddCerApplicationInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add cer application infos where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddCerApplicationInfo addCerApplicationInfo :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addCerApplicationInfo);
		}
	}

	/**
	 * Returns the number of add cer application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add cer application infos
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDCERAPPLICATIONINFO_WHERE);

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
			"addCerApplicationInfo.janaacApplicationId = ?";

	public AddCerApplicationInfoPersistenceImpl() {
		setModelClass(AddCerApplicationInfo.class);

		setModelImplClass(AddCerApplicationInfoImpl.class);
		setModelPKClass(long.class);

		setTable(AddCerApplicationInfoTable.INSTANCE);
	}

	/**
	 * Caches the add cer application info in the entity cache if it is enabled.
	 *
	 * @param addCerApplicationInfo the add cer application info
	 */
	@Override
	public void cacheResult(AddCerApplicationInfo addCerApplicationInfo) {
		entityCache.putResult(
			AddCerApplicationInfoImpl.class,
			addCerApplicationInfo.getPrimaryKey(), addCerApplicationInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add cer application infos in the entity cache if it is enabled.
	 *
	 * @param addCerApplicationInfos the add cer application infos
	 */
	@Override
	public void cacheResult(
		List<AddCerApplicationInfo> addCerApplicationInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addCerApplicationInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddCerApplicationInfo addCerApplicationInfo :
				addCerApplicationInfos) {

			if (entityCache.getResult(
					AddCerApplicationInfoImpl.class,
					addCerApplicationInfo.getPrimaryKey()) == null) {

				cacheResult(addCerApplicationInfo);
			}
		}
	}

	/**
	 * Clears the cache for all add cer application infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddCerApplicationInfoImpl.class);

		finderCache.clearCache(AddCerApplicationInfoImpl.class);
	}

	/**
	 * Clears the cache for the add cer application info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddCerApplicationInfo addCerApplicationInfo) {
		entityCache.removeResult(
			AddCerApplicationInfoImpl.class, addCerApplicationInfo);
	}

	@Override
	public void clearCache(List<AddCerApplicationInfo> addCerApplicationInfos) {
		for (AddCerApplicationInfo addCerApplicationInfo :
				addCerApplicationInfos) {

			entityCache.removeResult(
				AddCerApplicationInfoImpl.class, addCerApplicationInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddCerApplicationInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddCerApplicationInfoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add cer application info with the primary key. Does not add the add cer application info to the database.
	 *
	 * @param addCerApplicationInfoId the primary key for the new add cer application info
	 * @return the new add cer application info
	 */
	@Override
	public AddCerApplicationInfo create(long addCerApplicationInfoId) {
		AddCerApplicationInfo addCerApplicationInfo =
			new AddCerApplicationInfoImpl();

		addCerApplicationInfo.setNew(true);
		addCerApplicationInfo.setPrimaryKey(addCerApplicationInfoId);

		addCerApplicationInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addCerApplicationInfo;
	}

	/**
	 * Removes the add cer application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addCerApplicationInfoId the primary key of the add cer application info
	 * @return the add cer application info that was removed
	 * @throws NoSuchAddCerApplicationInfoException if a add cer application info with the primary key could not be found
	 */
	@Override
	public AddCerApplicationInfo remove(long addCerApplicationInfoId)
		throws NoSuchAddCerApplicationInfoException {

		return remove((Serializable)addCerApplicationInfoId);
	}

	/**
	 * Removes the add cer application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add cer application info
	 * @return the add cer application info that was removed
	 * @throws NoSuchAddCerApplicationInfoException if a add cer application info with the primary key could not be found
	 */
	@Override
	public AddCerApplicationInfo remove(Serializable primaryKey)
		throws NoSuchAddCerApplicationInfoException {

		Session session = null;

		try {
			session = openSession();

			AddCerApplicationInfo addCerApplicationInfo =
				(AddCerApplicationInfo)session.get(
					AddCerApplicationInfoImpl.class, primaryKey);

			if (addCerApplicationInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddCerApplicationInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addCerApplicationInfo);
		}
		catch (NoSuchAddCerApplicationInfoException noSuchEntityException) {
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
	protected AddCerApplicationInfo removeImpl(
		AddCerApplicationInfo addCerApplicationInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addCerApplicationInfo)) {
				addCerApplicationInfo = (AddCerApplicationInfo)session.get(
					AddCerApplicationInfoImpl.class,
					addCerApplicationInfo.getPrimaryKeyObj());
			}

			if (addCerApplicationInfo != null) {
				session.delete(addCerApplicationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addCerApplicationInfo != null) {
			clearCache(addCerApplicationInfo);
		}

		return addCerApplicationInfo;
	}

	@Override
	public AddCerApplicationInfo updateImpl(
		AddCerApplicationInfo addCerApplicationInfo) {

		boolean isNew = addCerApplicationInfo.isNew();

		if (!(addCerApplicationInfo instanceof
				AddCerApplicationInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addCerApplicationInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addCerApplicationInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addCerApplicationInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddCerApplicationInfo implementation " +
					addCerApplicationInfo.getClass());
		}

		AddCerApplicationInfoModelImpl addCerApplicationInfoModelImpl =
			(AddCerApplicationInfoModelImpl)addCerApplicationInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addCerApplicationInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				addCerApplicationInfo.setCreateDate(date);
			}
			else {
				addCerApplicationInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addCerApplicationInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addCerApplicationInfo.setModifiedDate(date);
			}
			else {
				addCerApplicationInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addCerApplicationInfo);
			}
			else {
				addCerApplicationInfo = (AddCerApplicationInfo)session.merge(
					addCerApplicationInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddCerApplicationInfoImpl.class, addCerApplicationInfoModelImpl,
			false, true);

		if (isNew) {
			addCerApplicationInfo.setNew(false);
		}

		addCerApplicationInfo.resetOriginalValues();

		return addCerApplicationInfo;
	}

	/**
	 * Returns the add cer application info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add cer application info
	 * @return the add cer application info
	 * @throws NoSuchAddCerApplicationInfoException if a add cer application info with the primary key could not be found
	 */
	@Override
	public AddCerApplicationInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddCerApplicationInfoException {

		AddCerApplicationInfo addCerApplicationInfo = fetchByPrimaryKey(
			primaryKey);

		if (addCerApplicationInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddCerApplicationInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addCerApplicationInfo;
	}

	/**
	 * Returns the add cer application info with the primary key or throws a <code>NoSuchAddCerApplicationInfoException</code> if it could not be found.
	 *
	 * @param addCerApplicationInfoId the primary key of the add cer application info
	 * @return the add cer application info
	 * @throws NoSuchAddCerApplicationInfoException if a add cer application info with the primary key could not be found
	 */
	@Override
	public AddCerApplicationInfo findByPrimaryKey(long addCerApplicationInfoId)
		throws NoSuchAddCerApplicationInfoException {

		return findByPrimaryKey((Serializable)addCerApplicationInfoId);
	}

	/**
	 * Returns the add cer application info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addCerApplicationInfoId the primary key of the add cer application info
	 * @return the add cer application info, or <code>null</code> if a add cer application info with the primary key could not be found
	 */
	@Override
	public AddCerApplicationInfo fetchByPrimaryKey(
		long addCerApplicationInfoId) {

		return fetchByPrimaryKey((Serializable)addCerApplicationInfoId);
	}

	/**
	 * Returns all the add cer application infos.
	 *
	 * @return the add cer application infos
	 */
	@Override
	public List<AddCerApplicationInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add cer application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @return the range of add cer application infos
	 */
	@Override
	public List<AddCerApplicationInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add cer application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add cer application infos
	 */
	@Override
	public List<AddCerApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AddCerApplicationInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add cer application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add cer application infos
	 */
	@Override
	public List<AddCerApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AddCerApplicationInfo> orderByComparator,
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

		List<AddCerApplicationInfo> list = null;

		if (useFinderCache) {
			list = (List<AddCerApplicationInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDCERAPPLICATIONINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDCERAPPLICATIONINFO;

				sql = sql.concat(AddCerApplicationInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddCerApplicationInfo>)QueryUtil.list(
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
	 * Removes all the add cer application infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddCerApplicationInfo addCerApplicationInfo : findAll()) {
			remove(addCerApplicationInfo);
		}
	}

	/**
	 * Returns the number of add cer application infos.
	 *
	 * @return the number of add cer application infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_ADDCERAPPLICATIONINFO);

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
		return "addCerApplicationInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDCERAPPLICATIONINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddCerApplicationInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add cer application info persistence.
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

		AddCerApplicationInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddCerApplicationInfoUtil.setPersistence(null);

		entityCache.removeCache(AddCerApplicationInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDCERAPPLICATIONINFO =
		"SELECT addCerApplicationInfo FROM AddCerApplicationInfo addCerApplicationInfo";

	private static final String _SQL_SELECT_ADDCERAPPLICATIONINFO_WHERE =
		"SELECT addCerApplicationInfo FROM AddCerApplicationInfo addCerApplicationInfo WHERE ";

	private static final String _SQL_COUNT_ADDCERAPPLICATIONINFO =
		"SELECT COUNT(addCerApplicationInfo) FROM AddCerApplicationInfo addCerApplicationInfo";

	private static final String _SQL_COUNT_ADDCERAPPLICATIONINFO_WHERE =
		"SELECT COUNT(addCerApplicationInfo) FROM AddCerApplicationInfo addCerApplicationInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addCerApplicationInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddCerApplicationInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddCerApplicationInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddCerApplicationInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}