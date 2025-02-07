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

package com.nbp.farm.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.farm.application.form.service.exception.NoSuchFarmerStakeholderInfoException;
import com.nbp.farm.application.form.service.model.FarmerStakeholderInfo;
import com.nbp.farm.application.form.service.model.FarmerStakeholderInfoTable;
import com.nbp.farm.application.form.service.model.impl.FarmerStakeholderInfoImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerStakeholderInfoModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerStakeholderInfoPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerStakeholderInfoUtil;
import com.nbp.farm.application.form.service.service.persistence.impl.constants.FARMERAPPLICATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the farmer stakeholder info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {FarmerStakeholderInfoPersistence.class, BasePersistence.class}
)
public class FarmerStakeholderInfoPersistenceImpl
	extends BasePersistenceImpl<FarmerStakeholderInfo>
	implements FarmerStakeholderInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerStakeholderInfoUtil</code> to access the farmer stakeholder info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerStakeholderInfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetfarmerById;
	private FinderPath _finderPathCountBygetfarmerById;

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerStakeholderInfoException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerStakeholderInfoException {

		FarmerStakeholderInfo farmerStakeholderInfo = fetchBygetfarmerById(
			farmerApplicationId);

		if (farmerStakeholderInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerStakeholderInfoException(sb.toString());
		}

		return farmerStakeholderInfo;
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo fetchBygetfarmerById(
		long farmerApplicationId) {

		return fetchBygetfarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {farmerApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetfarmerById, finderArgs,this);
		}

		if (result instanceof FarmerStakeholderInfo) {
			FarmerStakeholderInfo farmerStakeholderInfo =
				(FarmerStakeholderInfo)result;

			if (farmerApplicationId !=
					farmerStakeholderInfo.getFarmerApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERSTAKEHOLDERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerStakeholderInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetfarmerById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {farmerApplicationId};
							}

							_log.warn(
								"FarmerStakeholderInfoPersistenceImpl.fetchBygetfarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerStakeholderInfo farmerStakeholderInfo = list.get(0);

					result = farmerStakeholderInfo;

					cacheResult(farmerStakeholderInfo);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FarmerStakeholderInfo)result;
		}
	}

	/**
	 * Removes the farmer stakeholder info where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer stakeholder info that was removed
	 */
	@Override
	public FarmerStakeholderInfo removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerStakeholderInfoException {

		FarmerStakeholderInfo farmerStakeholderInfo = findBygetfarmerById(
			farmerApplicationId);

		return remove(farmerStakeholderInfo);
	}

	/**
	 * Returns the number of farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder infos
	 */
	@Override
	public int countBygetfarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetfarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERSTAKEHOLDERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

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
		_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2 =
			"farmerStakeholderInfo.farmerApplicationId = ?";

	private FinderPath _finderPathFetchBygetFA_FSH_by_AppId;
	private FinderPath _finderPathCountBygetFA_FSH_by_AppId;

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerStakeholderInfoException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo findBygetFA_FSH_by_AppId(
			long farmerApplicationId)
		throws NoSuchFarmerStakeholderInfoException {

		FarmerStakeholderInfo farmerStakeholderInfo = fetchBygetFA_FSH_by_AppId(
			farmerApplicationId);

		if (farmerStakeholderInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerStakeholderInfoException(sb.toString());
		}

		return farmerStakeholderInfo;
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo fetchBygetFA_FSH_by_AppId(
		long farmerApplicationId) {

		return fetchBygetFA_FSH_by_AppId(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo fetchBygetFA_FSH_by_AppId(
		long farmerApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {farmerApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFA_FSH_by_AppId, finderArgs,this);
		}

		if (result instanceof FarmerStakeholderInfo) {
			FarmerStakeholderInfo farmerStakeholderInfo =
				(FarmerStakeholderInfo)result;

			if (farmerApplicationId !=
					farmerStakeholderInfo.getFarmerApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERSTAKEHOLDERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FSH_BY_APPID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerStakeholderInfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFA_FSH_by_AppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {farmerApplicationId};
							}

							_log.warn(
								"FarmerStakeholderInfoPersistenceImpl.fetchBygetFA_FSH_by_AppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerStakeholderInfo farmerStakeholderInfo = list.get(0);

					result = farmerStakeholderInfo;

					cacheResult(farmerStakeholderInfo);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FarmerStakeholderInfo)result;
		}
	}

	/**
	 * Removes the farmer stakeholder info where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer stakeholder info that was removed
	 */
	@Override
	public FarmerStakeholderInfo removeBygetFA_FSH_by_AppId(
			long farmerApplicationId)
		throws NoSuchFarmerStakeholderInfoException {

		FarmerStakeholderInfo farmerStakeholderInfo = findBygetFA_FSH_by_AppId(
			farmerApplicationId);

		return remove(farmerStakeholderInfo);
	}

	/**
	 * Returns the number of farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder infos
	 */
	@Override
	public int countBygetFA_FSH_by_AppId(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFA_FSH_by_AppId;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERSTAKEHOLDERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FSH_BY_APPID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

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
		_FINDER_COLUMN_GETFA_FSH_BY_APPID_FARMERAPPLICATIONID_2 =
			"farmerStakeholderInfo.farmerApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFA_SH_FAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFA_SH_FAI;
	private FinderPath _finderPathCountBygetFA_SH_FAI;

	/**
	 * Returns all the farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder infos
	 */
	@Override
	public List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId) {

		return findBygetFA_SH_FAI(
			farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @return the range of matching farmer stakeholder infos
	 */
	@Override
	public List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId, int start, int end) {

		return findBygetFA_SH_FAI(farmerApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer stakeholder infos
	 */
	@Override
	public List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator) {

		return findBygetFA_SH_FAI(
			farmerApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer stakeholder infos
	 */
	@Override
	public List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFA_SH_FAI;
				finderArgs = new Object[] {farmerApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFA_SH_FAI;
			finderArgs = new Object[] {
				farmerApplicationId, start, end, orderByComparator
			};
		}

		List<FarmerStakeholderInfo> list = null;

		if (useFinderCache) {
			list = (List<FarmerStakeholderInfo>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerStakeholderInfo farmerStakeholderInfo : list) {
					if (farmerApplicationId !=
							farmerStakeholderInfo.getFarmerApplicationId()) {

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

			sb.append(_SQL_SELECT_FARMERSTAKEHOLDERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_SH_FAI_FARMERAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerStakeholderInfoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				list = (List<FarmerStakeholderInfo>)QueryUtil.list(
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
	 * Returns the first farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo findBygetFA_SH_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerStakeholderInfo> orderByComparator)
		throws NoSuchFarmerStakeholderInfoException {

		FarmerStakeholderInfo farmerStakeholderInfo = fetchBygetFA_SH_FAI_First(
			farmerApplicationId, orderByComparator);

		if (farmerStakeholderInfo != null) {
			return farmerStakeholderInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerStakeholderInfoException(sb.toString());
	}

	/**
	 * Returns the first farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo fetchBygetFA_SH_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator) {

		List<FarmerStakeholderInfo> list = findBygetFA_SH_FAI(
			farmerApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo findBygetFA_SH_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerStakeholderInfo> orderByComparator)
		throws NoSuchFarmerStakeholderInfoException {

		FarmerStakeholderInfo farmerStakeholderInfo = fetchBygetFA_SH_FAI_Last(
			farmerApplicationId, orderByComparator);

		if (farmerStakeholderInfo != null) {
			return farmerStakeholderInfo;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerStakeholderInfoException(sb.toString());
	}

	/**
	 * Returns the last farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	@Override
	public FarmerStakeholderInfo fetchBygetFA_SH_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator) {

		int count = countBygetFA_SH_FAI(farmerApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmerStakeholderInfo> list = findBygetFA_SH_FAI(
			farmerApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer stakeholder infos before and after the current farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the primary key of the current farmer stakeholder info
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderInfo[] findBygetFA_SH_FAI_PrevAndNext(
			long farmerStakeholderInfoId, long farmerApplicationId,
			OrderByComparator<FarmerStakeholderInfo> orderByComparator)
		throws NoSuchFarmerStakeholderInfoException {

		FarmerStakeholderInfo farmerStakeholderInfo = findByPrimaryKey(
			farmerStakeholderInfoId);

		Session session = null;

		try {
			session = openSession();

			FarmerStakeholderInfo[] array = new FarmerStakeholderInfoImpl[3];

			array[0] = getBygetFA_SH_FAI_PrevAndNext(
				session, farmerStakeholderInfo, farmerApplicationId,
				orderByComparator, true);

			array[1] = farmerStakeholderInfo;

			array[2] = getBygetFA_SH_FAI_PrevAndNext(
				session, farmerStakeholderInfo, farmerApplicationId,
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

	protected FarmerStakeholderInfo getBygetFA_SH_FAI_PrevAndNext(
		Session session, FarmerStakeholderInfo farmerStakeholderInfo,
		long farmerApplicationId,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMERSTAKEHOLDERINFO_WHERE);

		sb.append(_FINDER_COLUMN_GETFA_SH_FAI_FARMERAPPLICATIONID_2);

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
			sb.append(FarmerStakeholderInfoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(farmerApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmerStakeholderInfo)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerStakeholderInfo> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer stakeholder infos where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	@Override
	public void removeBygetFA_SH_FAI(long farmerApplicationId) {
		for (FarmerStakeholderInfo farmerStakeholderInfo :
				findBygetFA_SH_FAI(
					farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmerStakeholderInfo);
		}
	}

	/**
	 * Returns the number of farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder infos
	 */
	@Override
	public int countBygetFA_SH_FAI(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFA_SH_FAI;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERSTAKEHOLDERINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_SH_FAI_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

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
		_FINDER_COLUMN_GETFA_SH_FAI_FARMERAPPLICATIONID_2 =
			"farmerStakeholderInfo.farmerApplicationId = ?";

	public FarmerStakeholderInfoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("alias", "alias_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FarmerStakeholderInfo.class);

		setModelImplClass(FarmerStakeholderInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerStakeholderInfoTable.INSTANCE);
	}

	/**
	 * Caches the farmer stakeholder info in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderInfo the farmer stakeholder info
	 */
	@Override
	public void cacheResult(FarmerStakeholderInfo farmerStakeholderInfo) {
		entityCache.putResult(
			FarmerStakeholderInfoImpl.class,
			farmerStakeholderInfo.getPrimaryKey(), farmerStakeholderInfo);

		finderCache.putResult(
			_finderPathFetchBygetfarmerById,
			new Object[] {farmerStakeholderInfo.getFarmerApplicationId()},
			farmerStakeholderInfo);

		finderCache.putResult(
			_finderPathFetchBygetFA_FSH_by_AppId,
			new Object[] {farmerStakeholderInfo.getFarmerApplicationId()},
			farmerStakeholderInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer stakeholder infos in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderInfos the farmer stakeholder infos
	 */
	@Override
	public void cacheResult(
		List<FarmerStakeholderInfo> farmerStakeholderInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerStakeholderInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerStakeholderInfo farmerStakeholderInfo :
				farmerStakeholderInfos) {

			if (entityCache.getResult(
					FarmerStakeholderInfoImpl.class,
					farmerStakeholderInfo.getPrimaryKey()) == null) {

				cacheResult(farmerStakeholderInfo);
			}
		}
	}

	/**
	 * Clears the cache for all farmer stakeholder infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerStakeholderInfoImpl.class);

		finderCache.clearCache(FarmerStakeholderInfoImpl.class);
	}

	/**
	 * Clears the cache for the farmer stakeholder info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerStakeholderInfo farmerStakeholderInfo) {
		entityCache.removeResult(
			FarmerStakeholderInfoImpl.class, farmerStakeholderInfo);
	}

	@Override
	public void clearCache(List<FarmerStakeholderInfo> farmerStakeholderInfos) {
		for (FarmerStakeholderInfo farmerStakeholderInfo :
				farmerStakeholderInfos) {

			entityCache.removeResult(
				FarmerStakeholderInfoImpl.class, farmerStakeholderInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerStakeholderInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FarmerStakeholderInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerStakeholderInfoModelImpl farmerStakeholderInfoModelImpl) {

		Object[] args = new Object[] {
			farmerStakeholderInfoModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetfarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetfarmerById, args,
			farmerStakeholderInfoModelImpl);

		args = new Object[] {
			farmerStakeholderInfoModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFA_FSH_by_AppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFA_FSH_by_AppId, args,
			farmerStakeholderInfoModelImpl);
	}

	/**
	 * Creates a new farmer stakeholder info with the primary key. Does not add the farmer stakeholder info to the database.
	 *
	 * @param farmerStakeholderInfoId the primary key for the new farmer stakeholder info
	 * @return the new farmer stakeholder info
	 */
	@Override
	public FarmerStakeholderInfo create(long farmerStakeholderInfoId) {
		FarmerStakeholderInfo farmerStakeholderInfo =
			new FarmerStakeholderInfoImpl();

		farmerStakeholderInfo.setNew(true);
		farmerStakeholderInfo.setPrimaryKey(farmerStakeholderInfoId);

		farmerStakeholderInfo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmerStakeholderInfo;
	}

	/**
	 * Removes the farmer stakeholder info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info that was removed
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderInfo remove(long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderInfoException {

		return remove((Serializable)farmerStakeholderInfoId);
	}

	/**
	 * Removes the farmer stakeholder info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info that was removed
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderInfo remove(Serializable primaryKey)
		throws NoSuchFarmerStakeholderInfoException {

		Session session = null;

		try {
			session = openSession();

			FarmerStakeholderInfo farmerStakeholderInfo =
				(FarmerStakeholderInfo)session.get(
					FarmerStakeholderInfoImpl.class, primaryKey);

			if (farmerStakeholderInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerStakeholderInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerStakeholderInfo);
		}
		catch (NoSuchFarmerStakeholderInfoException noSuchEntityException) {
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
	protected FarmerStakeholderInfo removeImpl(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerStakeholderInfo)) {
				farmerStakeholderInfo = (FarmerStakeholderInfo)session.get(
					FarmerStakeholderInfoImpl.class,
					farmerStakeholderInfo.getPrimaryKeyObj());
			}

			if (farmerStakeholderInfo != null) {
				session.delete(farmerStakeholderInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerStakeholderInfo != null) {
			clearCache(farmerStakeholderInfo);
		}

		return farmerStakeholderInfo;
	}

	@Override
	public FarmerStakeholderInfo updateImpl(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		boolean isNew = farmerStakeholderInfo.isNew();

		if (!(farmerStakeholderInfo instanceof
				FarmerStakeholderInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerStakeholderInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerStakeholderInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerStakeholderInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerStakeholderInfo implementation " +
					farmerStakeholderInfo.getClass());
		}

		FarmerStakeholderInfoModelImpl farmerStakeholderInfoModelImpl =
			(FarmerStakeholderInfoModelImpl)farmerStakeholderInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerStakeholderInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerStakeholderInfo.setCreateDate(date);
			}
			else {
				farmerStakeholderInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmerStakeholderInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerStakeholderInfo.setModifiedDate(date);
			}
			else {
				farmerStakeholderInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerStakeholderInfo);
			}
			else {
				farmerStakeholderInfo = (FarmerStakeholderInfo)session.merge(
					farmerStakeholderInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerStakeholderInfoImpl.class, farmerStakeholderInfoModelImpl,
			false, true);

		cacheUniqueFindersCache(farmerStakeholderInfoModelImpl);

		if (isNew) {
			farmerStakeholderInfo.setNew(false);
		}

		farmerStakeholderInfo.resetOriginalValues();

		return farmerStakeholderInfo;
	}

	/**
	 * Returns the farmer stakeholder info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerStakeholderInfoException {

		FarmerStakeholderInfo farmerStakeholderInfo = fetchByPrimaryKey(
			primaryKey);

		if (farmerStakeholderInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerStakeholderInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerStakeholderInfo;
	}

	/**
	 * Returns the farmer stakeholder info with the primary key or throws a <code>NoSuchFarmerStakeholderInfoException</code> if it could not be found.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderInfo findByPrimaryKey(long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderInfoException {

		return findByPrimaryKey((Serializable)farmerStakeholderInfoId);
	}

	/**
	 * Returns the farmer stakeholder info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info, or <code>null</code> if a farmer stakeholder info with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderInfo fetchByPrimaryKey(
		long farmerStakeholderInfoId) {

		return fetchByPrimaryKey((Serializable)farmerStakeholderInfoId);
	}

	/**
	 * Returns all the farmer stakeholder infos.
	 *
	 * @return the farmer stakeholder infos
	 */
	@Override
	public List<FarmerStakeholderInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer stakeholder infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @return the range of farmer stakeholder infos
	 */
	@Override
	public List<FarmerStakeholderInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer stakeholder infos
	 */
	@Override
	public List<FarmerStakeholderInfo> findAll(
		int start, int end,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer stakeholder infos
	 */
	@Override
	public List<FarmerStakeholderInfo> findAll(
		int start, int end,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator,
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

		List<FarmerStakeholderInfo> list = null;

		if (useFinderCache) {
			list = (List<FarmerStakeholderInfo>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERSTAKEHOLDERINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERSTAKEHOLDERINFO;

				sql = sql.concat(FarmerStakeholderInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerStakeholderInfo>)QueryUtil.list(
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
	 * Removes all the farmer stakeholder infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerStakeholderInfo farmerStakeholderInfo : findAll()) {
			remove(farmerStakeholderInfo);
		}
	}

	/**
	 * Returns the number of farmer stakeholder infos.
	 *
	 * @return the number of farmer stakeholder infos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FARMERSTAKEHOLDERINFO);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "farmerStakeholderInfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERSTAKEHOLDERINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerStakeholderInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer stakeholder info persistence.
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

		_finderPathFetchBygetfarmerById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetfarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetfarmerById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetfarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_finderPathFetchBygetFA_FSH_by_AppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFA_FSH_by_AppId",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFA_FSH_by_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFA_FSH_by_AppId", new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_finderPathWithPaginationFindBygetFA_SH_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFA_SH_FAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"farmerApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFA_SH_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFA_SH_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFA_SH_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFA_SH_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_setFarmerStakeholderInfoUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerStakeholderInfoUtilPersistence(null);

		entityCache.removeCache(FarmerStakeholderInfoImpl.class.getName());
	}

	private void _setFarmerStakeholderInfoUtilPersistence(
		FarmerStakeholderInfoPersistence farmerStakeholderInfoPersistence) {

		try {
			Field field = FarmerStakeholderInfoUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmerStakeholderInfoPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FARMERSTAKEHOLDERINFO =
		"SELECT farmerStakeholderInfo FROM FarmerStakeholderInfo farmerStakeholderInfo";

	private static final String _SQL_SELECT_FARMERSTAKEHOLDERINFO_WHERE =
		"SELECT farmerStakeholderInfo FROM FarmerStakeholderInfo farmerStakeholderInfo WHERE ";

	private static final String _SQL_COUNT_FARMERSTAKEHOLDERINFO =
		"SELECT COUNT(farmerStakeholderInfo) FROM FarmerStakeholderInfo farmerStakeholderInfo";

	private static final String _SQL_COUNT_FARMERSTAKEHOLDERINFO_WHERE =
		"SELECT COUNT(farmerStakeholderInfo) FROM FarmerStakeholderInfo farmerStakeholderInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"farmerStakeholderInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerStakeholderInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerStakeholderInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerStakeholderInfoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"alias"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerStakeholderInfoModelArgumentsResolver
		_farmerStakeholderInfoModelArgumentsResolver;

}