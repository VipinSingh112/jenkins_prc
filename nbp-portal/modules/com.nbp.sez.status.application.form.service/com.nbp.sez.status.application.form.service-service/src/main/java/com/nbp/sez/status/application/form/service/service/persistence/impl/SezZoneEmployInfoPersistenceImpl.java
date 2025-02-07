/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneEmployInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo;
import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneEmployInfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneEmployInfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneEmployInfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneEmployInfoUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez zone employ info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezZoneEmployInfoPersistence.class)
public class SezZoneEmployInfoPersistenceImpl
	extends BasePersistenceImpl<SezZoneEmployInfo>
	implements SezZoneEmployInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneEmployInfoUtil</code> to access the sez zone employ info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneEmployInfoImpl.class.getName();

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
	 * Returns all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone employ infos
	 */
	@Override
	public List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @return the range of matching sez zone employ infos
	 */
	@Override
	public List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez zone employ infos
	 */
	@Override
	public List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneEmployInfo> orderByComparator) {

		return findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez zone employ infos
	 */
	@Override
	public List<SezZoneEmployInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneEmployInfo> orderByComparator,
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

		List<SezZoneEmployInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneEmployInfo>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezZoneEmployInfo sezZoneEmployInfo : list) {
					if (sezStatusApplicationId !=
							sezZoneEmployInfo.getSezStatusApplicationId()) {

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

			sb.append(_SQL_SELECT_SEZZONEEMPLOYINFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezZoneEmployInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				list = (List<SezZoneEmployInfo>)QueryUtil.list(
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
	 * Returns the first sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a matching sez zone employ info could not be found
	 */
	@Override
	public SezZoneEmployInfo findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneEmployInfo> orderByComparator)
		throws NoSuchSezZoneEmployInfoException {

		SezZoneEmployInfo sezZoneEmployInfo = fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);

		if (sezZoneEmployInfo != null) {
			return sezZoneEmployInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezZoneEmployInfoException(sb.toString());
	}

	/**
	 * Returns the first sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone employ info, or <code>null</code> if a matching sez zone employ info could not be found
	 */
	@Override
	public SezZoneEmployInfo fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmployInfo> orderByComparator) {

		List<SezZoneEmployInfo> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a matching sez zone employ info could not be found
	 */
	@Override
	public SezZoneEmployInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneEmployInfo> orderByComparator)
		throws NoSuchSezZoneEmployInfoException {

		SezZoneEmployInfo sezZoneEmployInfo = fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);

		if (sezZoneEmployInfo != null) {
			return sezZoneEmployInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("sezStatusApplicationId=");
		sb.append(sezStatusApplicationId);

		sb.append("}");

		throw new NoSuchSezZoneEmployInfoException(sb.toString());
	}

	/**
	 * Returns the last sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone employ info, or <code>null</code> if a matching sez zone employ info could not be found
	 */
	@Override
	public SezZoneEmployInfo fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmployInfo> orderByComparator) {

		int count = countBygetSezStatusByAppId(sezStatusApplicationId);

		if (count == 0) {
			return null;
		}

		List<SezZoneEmployInfo> list = findBygetSezStatusByAppId(
			sezStatusApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez zone employ infos before and after the current sez zone employ info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezZoneEmpInfoId the primary key of the current sez zone employ info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	@Override
	public SezZoneEmployInfo[] findBygetSezStatusByAppId_PrevAndNext(
			long sezZoneEmpInfoId, long sezStatusApplicationId,
			OrderByComparator<SezZoneEmployInfo> orderByComparator)
		throws NoSuchSezZoneEmployInfoException {

		SezZoneEmployInfo sezZoneEmployInfo = findByPrimaryKey(
			sezZoneEmpInfoId);

		Session session = null;

		try {
			session = openSession();

			SezZoneEmployInfo[] array = new SezZoneEmployInfoImpl[3];

			array[0] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezZoneEmployInfo, sezStatusApplicationId,
				orderByComparator, true);

			array[1] = sezZoneEmployInfo;

			array[2] = getBygetSezStatusByAppId_PrevAndNext(
				session, sezZoneEmployInfo, sezStatusApplicationId,
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

	protected SezZoneEmployInfo getBygetSezStatusByAppId_PrevAndNext(
		Session session, SezZoneEmployInfo sezZoneEmployInfo,
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmployInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZZONEEMPLOYINFO_WHERE);

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
			sb.append(SezZoneEmployInfoModelImpl.ORDER_BY_JPQL);
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
						sezZoneEmployInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezZoneEmployInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez zone employ infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	@Override
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId) {
		for (SezZoneEmployInfo sezZoneEmployInfo :
				findBygetSezStatusByAppId(
					sezStatusApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(sezZoneEmployInfo);
		}
	}

	/**
	 * Returns the number of sez zone employ infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone employ infos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONEEMPLOYINFO_WHERE);

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
			"sezZoneEmployInfo.sezStatusApplicationId = ?";

	public SezZoneEmployInfoPersistenceImpl() {
		setModelClass(SezZoneEmployInfo.class);

		setModelImplClass(SezZoneEmployInfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneEmployInfoTable.INSTANCE);
	}

	/**
	 * Caches the sez zone employ info in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmployInfo the sez zone employ info
	 */
	@Override
	public void cacheResult(SezZoneEmployInfo sezZoneEmployInfo) {
		entityCache.putResult(
			SezZoneEmployInfoImpl.class, sezZoneEmployInfo.getPrimaryKey(),
			sezZoneEmployInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone employ infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmployInfos the sez zone employ infos
	 */
	@Override
	public void cacheResult(List<SezZoneEmployInfo> sezZoneEmployInfos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneEmployInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneEmployInfo sezZoneEmployInfo : sezZoneEmployInfos) {
			if (entityCache.getResult(
					SezZoneEmployInfoImpl.class,
					sezZoneEmployInfo.getPrimaryKey()) == null) {

				cacheResult(sezZoneEmployInfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone employ infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneEmployInfoImpl.class);

		finderCache.clearCache(SezZoneEmployInfoImpl.class);
	}

	/**
	 * Clears the cache for the sez zone employ info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezZoneEmployInfo sezZoneEmployInfo) {
		entityCache.removeResult(
			SezZoneEmployInfoImpl.class, sezZoneEmployInfo);
	}

	@Override
	public void clearCache(List<SezZoneEmployInfo> sezZoneEmployInfos) {
		for (SezZoneEmployInfo sezZoneEmployInfo : sezZoneEmployInfos) {
			entityCache.removeResult(
				SezZoneEmployInfoImpl.class, sezZoneEmployInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneEmployInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SezZoneEmployInfoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new sez zone employ info with the primary key. Does not add the sez zone employ info to the database.
	 *
	 * @param sezZoneEmpInfoId the primary key for the new sez zone employ info
	 * @return the new sez zone employ info
	 */
	@Override
	public SezZoneEmployInfo create(long sezZoneEmpInfoId) {
		SezZoneEmployInfo sezZoneEmployInfo = new SezZoneEmployInfoImpl();

		sezZoneEmployInfo.setNew(true);
		sezZoneEmployInfo.setPrimaryKey(sezZoneEmpInfoId);

		sezZoneEmployInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezZoneEmployInfo;
	}

	/**
	 * Removes the sez zone employ info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info that was removed
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	@Override
	public SezZoneEmployInfo remove(long sezZoneEmpInfoId)
		throws NoSuchSezZoneEmployInfoException {

		return remove((Serializable)sezZoneEmpInfoId);
	}

	/**
	 * Removes the sez zone employ info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone employ info
	 * @return the sez zone employ info that was removed
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	@Override
	public SezZoneEmployInfo remove(Serializable primaryKey)
		throws NoSuchSezZoneEmployInfoException {

		Session session = null;

		try {
			session = openSession();

			SezZoneEmployInfo sezZoneEmployInfo =
				(SezZoneEmployInfo)session.get(
					SezZoneEmployInfoImpl.class, primaryKey);

			if (sezZoneEmployInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneEmployInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneEmployInfo);
		}
		catch (NoSuchSezZoneEmployInfoException noSuchEntityException) {
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
	protected SezZoneEmployInfo removeImpl(
		SezZoneEmployInfo sezZoneEmployInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneEmployInfo)) {
				sezZoneEmployInfo = (SezZoneEmployInfo)session.get(
					SezZoneEmployInfoImpl.class,
					sezZoneEmployInfo.getPrimaryKeyObj());
			}

			if (sezZoneEmployInfo != null) {
				session.delete(sezZoneEmployInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneEmployInfo != null) {
			clearCache(sezZoneEmployInfo);
		}

		return sezZoneEmployInfo;
	}

	@Override
	public SezZoneEmployInfo updateImpl(SezZoneEmployInfo sezZoneEmployInfo) {
		boolean isNew = sezZoneEmployInfo.isNew();

		if (!(sezZoneEmployInfo instanceof SezZoneEmployInfoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezZoneEmployInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneEmployInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneEmployInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneEmployInfo implementation " +
					sezZoneEmployInfo.getClass());
		}

		SezZoneEmployInfoModelImpl sezZoneEmployInfoModelImpl =
			(SezZoneEmployInfoModelImpl)sezZoneEmployInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneEmployInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneEmployInfo.setCreateDate(date);
			}
			else {
				sezZoneEmployInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneEmployInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneEmployInfo.setModifiedDate(date);
			}
			else {
				sezZoneEmployInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneEmployInfo);
			}
			else {
				sezZoneEmployInfo = (SezZoneEmployInfo)session.merge(
					sezZoneEmployInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneEmployInfoImpl.class, sezZoneEmployInfoModelImpl, false,
			true);

		if (isNew) {
			sezZoneEmployInfo.setNew(false);
		}

		sezZoneEmployInfo.resetOriginalValues();

		return sezZoneEmployInfo;
	}

	/**
	 * Returns the sez zone employ info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone employ info
	 * @return the sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	@Override
	public SezZoneEmployInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezZoneEmployInfoException {

		SezZoneEmployInfo sezZoneEmployInfo = fetchByPrimaryKey(primaryKey);

		if (sezZoneEmployInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneEmployInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneEmployInfo;
	}

	/**
	 * Returns the sez zone employ info with the primary key or throws a <code>NoSuchSezZoneEmployInfoException</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info
	 * @throws NoSuchSezZoneEmployInfoException if a sez zone employ info with the primary key could not be found
	 */
	@Override
	public SezZoneEmployInfo findByPrimaryKey(long sezZoneEmpInfoId)
		throws NoSuchSezZoneEmployInfoException {

		return findByPrimaryKey((Serializable)sezZoneEmpInfoId);
	}

	/**
	 * Returns the sez zone employ info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info, or <code>null</code> if a sez zone employ info with the primary key could not be found
	 */
	@Override
	public SezZoneEmployInfo fetchByPrimaryKey(long sezZoneEmpInfoId) {
		return fetchByPrimaryKey((Serializable)sezZoneEmpInfoId);
	}

	/**
	 * Returns all the sez zone employ infos.
	 *
	 * @return the sez zone employ infos
	 */
	@Override
	public List<SezZoneEmployInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @return the range of sez zone employ infos
	 */
	@Override
	public List<SezZoneEmployInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone employ infos
	 */
	@Override
	public List<SezZoneEmployInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneEmployInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone employ infos
	 */
	@Override
	public List<SezZoneEmployInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneEmployInfo> orderByComparator,
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

		List<SezZoneEmployInfo> list = null;

		if (useFinderCache) {
			list = (List<SezZoneEmployInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONEEMPLOYINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONEEMPLOYINFO;

				sql = sql.concat(SezZoneEmployInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneEmployInfo>)QueryUtil.list(
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
	 * Removes all the sez zone employ infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneEmployInfo sezZoneEmployInfo : findAll()) {
			remove(sezZoneEmployInfo);
		}
	}

	/**
	 * Returns the number of sez zone employ infos.
	 *
	 * @return the number of sez zone employ infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_SEZZONEEMPLOYINFO);

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
		return _SQL_SELECT_SEZZONEEMPLOYINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneEmployInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone employ info persistence.
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

		SezZoneEmployInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezZoneEmployInfoUtil.setPersistence(null);

		entityCache.removeCache(SezZoneEmployInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZZONEEMPLOYINFO =
		"SELECT sezZoneEmployInfo FROM SezZoneEmployInfo sezZoneEmployInfo";

	private static final String _SQL_SELECT_SEZZONEEMPLOYINFO_WHERE =
		"SELECT sezZoneEmployInfo FROM SezZoneEmployInfo sezZoneEmployInfo WHERE ";

	private static final String _SQL_COUNT_SEZZONEEMPLOYINFO =
		"SELECT COUNT(sezZoneEmployInfo) FROM SezZoneEmployInfo sezZoneEmployInfo";

	private static final String _SQL_COUNT_SEZZONEEMPLOYINFO_WHERE =
		"SELECT COUNT(sezZoneEmployInfo) FROM SezZoneEmployInfo sezZoneEmployInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sezZoneEmployInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneEmployInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneEmployInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneEmployInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}