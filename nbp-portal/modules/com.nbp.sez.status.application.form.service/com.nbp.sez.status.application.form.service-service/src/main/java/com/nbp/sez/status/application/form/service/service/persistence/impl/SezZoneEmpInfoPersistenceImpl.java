/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneEmpInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneEmpInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneEmpInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneEmpInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneEmpInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneEmpInfoUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the sez zone emp info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {SezZoneEmpInfoPersistence.class, BasePersistence.class})
public class SezZoneEmpInfoPersistenceImpl
	extends BasePersistenceImpl<SezZoneEmpInfo>
	implements SezZoneEmpInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneEmpInfoUtil</code> to access the sez zone emp info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneEmpInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone emp infos
	 */
	@Override
	public List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @return the range of matching sez zone emp infos
	 */
	@Override
	public List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez zone emp infos
	 */
	@Override
	public List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneEmpInfo> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez zone emp infos
	 */
	@Override
	public List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneEmpInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByAppId;
				finderArgs = new Object[] {sezStatusApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezStatusByAppId;
			finderArgs = new Object[] {
				sezStatusApplicationId, start, end, orderByComparator
			};
		}

		List<SezZoneEmpInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneEmpInfo>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (SezZoneEmpInfo sezZoneEmpInfo : list) {
					if (sezStatusApplicationId !=
							sezZoneEmpInfo.getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZZONEEMPINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezZoneEmpInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezZoneEmpInfo>)QueryUtil.list(
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
	 * Returns the first sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a matching sez zone emp info could not be found
	 */
	@Override
	public SezZoneEmpInfo findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneEmpInfo> orderByComparator)
		throws NoSuchSezZoneEmpInfoException {

		SezZoneEmpInfo sezZoneEmpInfo = fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);

		if (sezZoneEmpInfo != null) {
			return sezZoneEmpInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezZoneEmpInfoException(sb.toString());
	}

	/**
	 * Returns the first sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone emp info, or <code>null</code> if a matching sez zone emp info could not be found
	 */
	@Override
	public SezZoneEmpInfo fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmpInfo> orderByComparator) {

		List<SezZoneEmpInfo> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a matching sez zone emp info could not be found
	 */
	@Override
	public SezZoneEmpInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneEmpInfo> orderByComparator)
		throws NoSuchSezZoneEmpInfoException {

		SezZoneEmpInfo sezZoneEmpInfo = fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);

		if (sezZoneEmpInfo != null) {
			return sezZoneEmpInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezZoneEmpInfoException(sb.toString());
	}

	/**
	 * Returns the last sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone emp info, or <code>null</code> if a matching sez zone emp info could not be found
	 */
	@Override
	public SezZoneEmpInfo fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmpInfo> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezZoneEmpInfo> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez zone emp infos before and after the current sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezZoneEmpInfoId the primary key of the current sez zone emp info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	@Override
	public SezZoneEmpInfo[] findBygetSezStatusByAppId_PrevAndNext(
			long sezZoneEmpInfoId, long sezStatusApplicationId,
			OrderByComparator<SezZoneEmpInfo> orderByComparator)
		throws NoSuchSezZoneEmpInfoException {

		SezZoneEmpInfo sezZoneEmpInfo = findByPrimaryKey(sezZoneEmpInfoId);

		Session session = null;

		try {
			session = openSession();

			SezZoneEmpInfo[] array = new SezZoneEmpInfoImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezZoneEmpInfo, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezZoneEmpInfo;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezZoneEmpInfo, sezStatusApplicationId,
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

	protected SezZoneEmpInfo getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezZoneEmpInfo sezZoneEmpInfo,
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmpInfo> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_SEZZONEEMPINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

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
			sb.append(SezZoneEmpInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(sezStatusApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezZoneEmpInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezZoneEmpInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez zone emp infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezZoneEmpInfo sezZoneEmpInfo :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezZoneEmpInfo);
		}
	}

	/**
	 * Returns the number of sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone emp infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONEEMPINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezZoneEmpInfo.sezStatusApplicationId = ?";

	public SezZoneEmpInfoPersistenceImpl() {
		setModelClass(SezZoneEmpInfo.class);

		setModelImplClass(SezZoneEmpInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneEmpInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez zone emp info in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmpInfo the sez zone emp info
	 */
	@Override
	public void cacheResult(SezZoneEmpInfo sezZoneEmpInfo) {
		entityCache.putResult(
			SezZoneEmpInfoImpl.class, sezZoneEmpInfo.getPrimaryKey(),
			sezZoneEmpInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone emp infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmpInfos the sez zone emp infos
	 */
	@Override
	public void cacheResult(List<SezZoneEmpInfo> sezZoneEmpInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneEmpInfos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneEmpInfo sezZoneEmpInfo : sezZoneEmpInfos) {
			if (entityCache.getResult(
					SezZoneEmpInfoImpl.class, sezZoneEmpInfo.getPrimaryKey()) ==
						null) {

				cacheResult(sezZoneEmpInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone emp infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneEmpInfoImpl.class);

		finderCache.clearCache(SezZoneEmpInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez zone emp info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezZoneEmpInfo sezZoneEmpInfo) {
		entityCache.removeResult(SezZoneEmpInfoImpl.class, sezZoneEmpInfo);
	}

	@Override
	public void clearCache(List<SezZoneEmpInfo> sezZoneEmpInfos) {
		for (SezZoneEmpInfo sezZoneEmpInfo : sezZoneEmpInfos) {
			entityCache.removeResult(SezZoneEmpInfoImpl.class, sezZoneEmpInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneEmpInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SezZoneEmpInfoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez zone emp info with the primary key. Does not add the sez zone emp info to the database.
	 *
	 * @param sezZoneEmpInfoId the primary key for the new sez zone emp info
	 * @return the new sez zone emp info
	 */
	@Override
	public SezZoneEmpInfo create(long sezZoneEmpInfoId) {
		SezZoneEmpInfo sezZoneEmpInfo = new SezZoneEmpInfoImpl();

		sezZoneEmpInfo.setNew(true);
		sezZoneEmpInfo.setPrimaryKey(sezZoneEmpInfoId);

		sezZoneEmpInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezZoneEmpInfo;
	}

	/**
	 * Removes the sez zone emp info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info that was removed
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	@Override
	public SezZoneEmpInfo remove(long sezZoneEmpInfoId)
		throws NoSuchSezZoneEmpInfoException {

		return remove((Serializable)sezZoneEmpInfoId);
	}

	/**
	 * Removes the sez zone emp info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone emp info
	 * @return the sez zone emp info that was removed
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	@Override
	public SezZoneEmpInfo remove(Serializable primaryKey)
		throws NoSuchSezZoneEmpInfoException {

		Session session = null;

		try {
			session = openSession();

			SezZoneEmpInfo sezZoneEmpInfo = (SezZoneEmpInfo)session.get(
				SezZoneEmpInfoImpl.class, primaryKey);

			if (sezZoneEmpInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneEmpInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneEmpInfo);
		}
		catch (NoSuchSezZoneEmpInfoException noSuchEntityException) {
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
	protected SezZoneEmpInfo removeImpl(SezZoneEmpInfo sezZoneEmpInfo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneEmpInfo)) {
				sezZoneEmpInfo = (SezZoneEmpInfo)session.get(
					SezZoneEmpInfoImpl.class,
					sezZoneEmpInfo.getPrimaryKeyObj());
			}

			if (sezZoneEmpInfo != null) {
				session.delete(sezZoneEmpInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneEmpInfo != null) {
			clearCache(sezZoneEmpInfo);
		}

		return sezZoneEmpInfo;
	}

	@Override
	public SezZoneEmpInfo updateImpl(SezZoneEmpInfo sezZoneEmpInfo) {
		boolean isNew = sezZoneEmpInfo.isNew();

		if (!(sezZoneEmpInfo instanceof SezZoneEmpInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezZoneEmpInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneEmpInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneEmpInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneEmpInfo implementation " +
					sezZoneEmpInfo.getClass());
		}

		SezZoneEmpInfoModelImpl sezZoneEmpInfoModelImpl =
			(SezZoneEmpInfoModelImpl)sezZoneEmpInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneEmpInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneEmpInfo.setCreateDate(date);
			}
			else {
				sezZoneEmpInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneEmpInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneEmpInfo.setModifiedDate(date);
			}
			else {
				sezZoneEmpInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneEmpInfo);
			}
			else {
				sezZoneEmpInfo = (SezZoneEmpInfo)session.merge(sezZoneEmpInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneEmpInfoImpl.class, sezZoneEmpInfoModelImpl, false, true);

		if (isNew) {
			sezZoneEmpInfo.setNew(false);
		}

		sezZoneEmpInfo.resetOriginalValues();

		return sezZoneEmpInfo;
	}

	/**
	 * Returns the sez zone emp info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone emp info
	 * @return the sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	@Override
	public SezZoneEmpInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezZoneEmpInfoException {

		SezZoneEmpInfo sezZoneEmpInfo = fetchByPrimaryKey(primaryKey);

		if (sezZoneEmpInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneEmpInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneEmpInfo;
	}

	/**
	 * Returns the sez zone emp info with the primary key or throws a <code>NoSuchSezZoneEmpInfoException</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	@Override
	public SezZoneEmpInfo findByPrimaryKey(long sezZoneEmpInfoId)
		throws NoSuchSezZoneEmpInfoException {

		return findByPrimaryKey((Serializable)sezZoneEmpInfoId);
	}

	/**
	 * Returns the sez zone emp info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info, or <code>null</code> if a sez zone emp info with the primary key could not be found
	 */
	@Override
	public SezZoneEmpInfo fetchByPrimaryKey(long sezZoneEmpInfoId) {
		return fetchByPrimaryKey((Serializable)sezZoneEmpInfoId);
	}

	/**
	 * Returns all the sez zone emp infos.
	 *
	 * @return the sez zone emp infos
	 */
	@Override
	public List<SezZoneEmpInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @return the range of sez zone emp infos
	 */
	@Override
	public List<SezZoneEmpInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone emp infos
	 */
	@Override
	public List<SezZoneEmpInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneEmpInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone emp infos
	 */
	@Override
	public List<SezZoneEmpInfo> findAll(
		int start, int end, OrderByComparator<SezZoneEmpInfo> orderByComparator,
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

		List<SezZoneEmpInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneEmpInfo>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONEEMPINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONEEMPINFO;

				sql = sql.concat(SezZoneEmpInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneEmpInfo>)QueryUtil.list(
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
	 * Removes all the sez zone emp infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneEmpInfo sezZoneEmpInfo : findAll()) {
			remove(sezZoneEmpInfo);
		}
	}

	/**
	 * Returns the number of sez zone emp infos.
	 *
	 * @return the number of sez zone emp infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SEZZONEEMPINFO);

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
		return "sezZoneEmpInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZZONEEMPINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneEmpInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone emp info persistence.
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

		_finderPathWithPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezStatusByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		_setSezZoneEmpInfoUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setSezZoneEmpInfoUtilPersistence(null);

		entityCache.removeCache(SezZoneEmpInfoImpl.class.getName());
	}

	private void _setSezZoneEmpInfoUtilPersistence(
		SezZoneEmpInfoPersistence sezZoneEmpInfoPersistence) {

		try {
			Field field = SezZoneEmpInfoUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, sezZoneEmpInfoPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZZONEEMPINFO =
		"SELECT sezZoneEmpInfo FROM SezZoneEmpInfo sezZoneEmpInfo";

	private static final String _SQL_SELECT_SEZZONEEMPINFO_WHERE =
		"SELECT sezZoneEmpInfo FROM SezZoneEmpInfo sezZoneEmpInfo WHERE ";

	private static final String _SQL_COUNT_SEZZONEEMPINFO =
		"SELECT COUNT(sezZoneEmpInfo) FROM SezZoneEmpInfo sezZoneEmpInfo";

	private static final String _SQL_COUNT_SEZZONEEMPINFO_WHERE =
		"SELECT COUNT(sezZoneEmpInfo) FROM SezZoneEmpInfo sezZoneEmpInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sezZoneEmpInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneEmpInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneEmpInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneEmpInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private SezZoneEmpInfoModelArgumentsResolver
		_sezZoneEmpInfoModelArgumentsResolver;

}