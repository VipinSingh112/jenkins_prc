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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.farm.application.form.service.exception.NoSuchFarmerApplicationException;
import com.nbp.farm.application.form.service.model.FarmerApplication;
import com.nbp.farm.application.form.service.model.FarmerApplicationTable;
import com.nbp.farm.application.form.service.model.impl.FarmerApplicationImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerApplicationModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerApplicationPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerApplicationUtil;
import com.nbp.farm.application.form.service.service.persistence.impl.constants.FARMERAPPLICATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the farmer application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {FarmerApplicationPersistence.class, BasePersistence.class}
)
public class FarmerApplicationPersistenceImpl
	extends BasePersistenceImpl<FarmerApplication>
	implements FarmerApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerApplicationUtil</code> to access the farmer application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFarmerById;
	private FinderPath _finderPathCountBygetFarmerById;

	/**
	 * Returns the farmer application where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findBygetFarmerById(long farmerApplicationId)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = fetchBygetFarmerById(
			farmerApplicationId);

		if (farmerApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerApplicationException(sb.toString());
		}

		return farmerApplication;
	}

	/**
	 * Returns the farmer application where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerById(long farmerApplicationId) {
		return fetchBygetFarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer application where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {farmerApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFarmerById, finderArgs,this);
		}

		if (result instanceof FarmerApplication) {
			FarmerApplication farmerApplication = (FarmerApplication)result;

			if (farmerApplicationId !=
					farmerApplication.getFarmerApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFarmerById, finderArgs, list);
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
								"FarmerApplicationPersistenceImpl.fetchBygetFarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerApplication farmerApplication = list.get(0);

					result = farmerApplication;

					cacheResult(farmerApplication);
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
			return (FarmerApplication)result;
		}
	}

	/**
	 * Removes the farmer application where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer application that was removed
	 */
	@Override
	public FarmerApplication removeBygetFarmerById(long farmerApplicationId)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = findBygetFarmerById(
			farmerApplicationId);

		return remove(farmerApplication);
	}

	/**
	 * Returns the number of farmer applications where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer applications
	 */
	@Override
	public int countBygetFarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERAPPLICATION_WHERE);

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
			"farmerApplication.farmerApplicationId = ?";

	private FinderPath _finderPathFetchBygetFarmerByRT_AppNo;
	private FinderPath _finderPathCountBygetFarmerByRT_AppNo;

	/**
	 * Returns the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findBygetFarmerByRT_AppNo(
			String expiredLicenseappNumber, String requestType)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = fetchBygetFarmerByRT_AppNo(
			expiredLicenseappNumber, requestType);

		if (farmerApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("expiredLicenseappNumber=");
			sb.append(expiredLicenseappNumber);

			sb.append(", requestType=");
			sb.append(requestType);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerApplicationException(sb.toString());
		}

		return farmerApplication;
	}

	/**
	 * Returns the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerByRT_AppNo(
		String expiredLicenseappNumber, String requestType) {

		return fetchBygetFarmerByRT_AppNo(
			expiredLicenseappNumber, requestType, true);
	}

	/**
	 * Returns the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerByRT_AppNo(
		String expiredLicenseappNumber, String requestType,
		boolean useFinderCache) {

		expiredLicenseappNumber = Objects.toString(expiredLicenseappNumber, "");
		requestType = Objects.toString(requestType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {expiredLicenseappNumber, requestType};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFarmerByRT_AppNo, finderArgs,this);
		}

		if (result instanceof FarmerApplication) {
			FarmerApplication farmerApplication = (FarmerApplication)result;

			if (!Objects.equals(
					expiredLicenseappNumber,
					farmerApplication.getExpiredLicenseappNumber()) ||
				!Objects.equals(
					requestType, farmerApplication.getRequestType())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

			boolean bindExpiredLicenseappNumber = false;

			if (expiredLicenseappNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFARMERBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseappNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFARMERBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			boolean bindRequestType = false;

			if (requestType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFARMERBYRT_APPNO_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				sb.append(_FINDER_COLUMN_GETFARMERBYRT_APPNO_REQUESTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindExpiredLicenseappNumber) {
					queryPos.add(expiredLicenseappNumber);
				}

				if (bindRequestType) {
					queryPos.add(requestType);
				}

				List<FarmerApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFarmerByRT_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									expiredLicenseappNumber, requestType
								};
							}

							_log.warn(
								"FarmerApplicationPersistenceImpl.fetchBygetFarmerByRT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerApplication farmerApplication = list.get(0);

					result = farmerApplication;

					cacheResult(farmerApplication);
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
			return (FarmerApplication)result;
		}
	}

	/**
	 * Removes the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; from the database.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the farmer application that was removed
	 */
	@Override
	public FarmerApplication removeBygetFarmerByRT_AppNo(
			String expiredLicenseappNumber, String requestType)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = findBygetFarmerByRT_AppNo(
			expiredLicenseappNumber, requestType);

		return remove(farmerApplication);
	}

	/**
	 * Returns the number of farmer applications where expiredLicenseappNumber = &#63; and requestType = &#63;.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the number of matching farmer applications
	 */
	@Override
	public int countBygetFarmerByRT_AppNo(
		String expiredLicenseappNumber, String requestType) {

		expiredLicenseappNumber = Objects.toString(expiredLicenseappNumber, "");
		requestType = Objects.toString(requestType, "");

		FinderPath finderPath = _finderPathCountBygetFarmerByRT_AppNo;

		Object[] finderArgs = new Object[] {
			expiredLicenseappNumber, requestType
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMERAPPLICATION_WHERE);

			boolean bindExpiredLicenseappNumber = false;

			if (expiredLicenseappNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFARMERBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseappNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFARMERBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			boolean bindRequestType = false;

			if (requestType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFARMERBYRT_APPNO_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				sb.append(_FINDER_COLUMN_GETFARMERBYRT_APPNO_REQUESTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindExpiredLicenseappNumber) {
					queryPos.add(expiredLicenseappNumber);
				}

				if (bindRequestType) {
					queryPos.add(requestType);
				}

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
		_FINDER_COLUMN_GETFARMERBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"farmerApplication.expiredLicenseappNumber = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFARMERBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(farmerApplication.expiredLicenseappNumber IS NULL OR farmerApplication.expiredLicenseappNumber = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFARMERBYRT_APPNO_REQUESTTYPE_2 =
			"farmerApplication.requestType = ?";

	private static final String
		_FINDER_COLUMN_GETFARMERBYRT_APPNO_REQUESTTYPE_3 =
			"(farmerApplication.requestType IS NULL OR farmerApplication.requestType = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetFarmerApplicationByStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFarmerApplicationByStatus;
	private FinderPath _finderPathCountBygetFarmerApplicationByStatus;

	/**
	 * Returns all the farmer applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status) {

		return findBygetFarmerApplicationByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status, int start, int end) {

		return findBygetFarmerApplicationByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator) {

		return findBygetFarmerApplicationByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFarmerApplicationByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFarmerApplicationByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<FarmerApplication> list = null;

		if (useFinderCache) {
			list = (List<FarmerApplication>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerApplication farmerApplication : list) {
					if (status != farmerApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<FarmerApplication>)QueryUtil.list(
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
	 * Returns the first farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findBygetFarmerApplicationByStatus_First(
			int status, OrderByComparator<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication =
			fetchBygetFarmerApplicationByStatus_First(
				status, orderByComparator);

		if (farmerApplication != null) {
			return farmerApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFarmerApplicationException(sb.toString());
	}

	/**
	 * Returns the first farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerApplicationByStatus_First(
		int status, OrderByComparator<FarmerApplication> orderByComparator) {

		List<FarmerApplication> list = findBygetFarmerApplicationByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findBygetFarmerApplicationByStatus_Last(
			int status, OrderByComparator<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication =
			fetchBygetFarmerApplicationByStatus_Last(status, orderByComparator);

		if (farmerApplication != null) {
			return farmerApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFarmerApplicationException(sb.toString());
	}

	/**
	 * Returns the last farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerApplicationByStatus_Last(
		int status, OrderByComparator<FarmerApplication> orderByComparator) {

		int count = countBygetFarmerApplicationByStatus(status);

		if (count == 0) {
			return null;
		}

		List<FarmerApplication> list = findBygetFarmerApplicationByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer applications before and after the current farmer application in the ordered set where status = &#63;.
	 *
	 * @param farmerApplicationId the primary key of the current farmer application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	@Override
	public FarmerApplication[] findBygetFarmerApplicationByStatus_PrevAndNext(
			long farmerApplicationId, int status,
			OrderByComparator<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = findByPrimaryKey(
			farmerApplicationId);

		Session session = null;

		try {
			session = openSession();

			FarmerApplication[] array = new FarmerApplicationImpl[3];

			array[0] = getBygetFarmerApplicationByStatus_PrevAndNext(
				session, farmerApplication, status, orderByComparator, true);

			array[1] = farmerApplication;

			array[2] = getBygetFarmerApplicationByStatus_PrevAndNext(
				session, farmerApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmerApplication getBygetFarmerApplicationByStatus_PrevAndNext(
		Session session, FarmerApplication farmerApplication, int status,
		OrderByComparator<FarmerApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUS_STATUS_2);

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
			sb.append(FarmerApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmerApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetFarmerApplicationByStatus(int status) {
		for (FarmerApplication farmerApplication :
				findBygetFarmerApplicationByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(farmerApplication);
		}
	}

	/**
	 * Returns the number of farmer applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching farmer applications
	 */
	@Override
	public int countBygetFarmerApplicationByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetFarmerApplicationByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

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
		_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUS_STATUS_2 =
			"farmerApplication.status = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetFarmerApplicationByStatusUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFarmerApplicationByStatusUser;
	private FinderPath _finderPathCountBygetFarmerApplicationByStatusUser;

	/**
	 * Returns all the farmer applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByStatusUser(
		int status, long userId) {

		return findBygetFarmerApplicationByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByStatusUser(
		int status, long userId, int start, int end) {

		return findBygetFarmerApplicationByStatusUser(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator) {

		return findBygetFarmerApplicationByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFarmerApplicationByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFarmerApplicationByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<FarmerApplication> list = null;

		if (useFinderCache) {
			list = (List<FarmerApplication>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerApplication farmerApplication : list) {
					if ((status != farmerApplication.getStatus()) ||
						(userId != farmerApplication.getUserId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<FarmerApplication>)QueryUtil.list(
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
	 * Returns the first farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findBygetFarmerApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication =
			fetchBygetFarmerApplicationByStatusUser_First(
				status, userId, orderByComparator);

		if (farmerApplication != null) {
			return farmerApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFarmerApplicationException(sb.toString());
	}

	/**
	 * Returns the first farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerApplicationByStatusUser_First(
		int status, long userId,
		OrderByComparator<FarmerApplication> orderByComparator) {

		List<FarmerApplication> list = findBygetFarmerApplicationByStatusUser(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findBygetFarmerApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication =
			fetchBygetFarmerApplicationByStatusUser_Last(
				status, userId, orderByComparator);

		if (farmerApplication != null) {
			return farmerApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFarmerApplicationException(sb.toString());
	}

	/**
	 * Returns the last farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerApplicationByStatusUser_Last(
		int status, long userId,
		OrderByComparator<FarmerApplication> orderByComparator) {

		int count = countBygetFarmerApplicationByStatusUser(status, userId);

		if (count == 0) {
			return null;
		}

		List<FarmerApplication> list = findBygetFarmerApplicationByStatusUser(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer applications before and after the current farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param farmerApplicationId the primary key of the current farmer application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	@Override
	public FarmerApplication[]
			findBygetFarmerApplicationByStatusUser_PrevAndNext(
				long farmerApplicationId, int status, long userId,
				OrderByComparator<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = findByPrimaryKey(
			farmerApplicationId);

		Session session = null;

		try {
			session = openSession();

			FarmerApplication[] array = new FarmerApplicationImpl[3];

			array[0] = getBygetFarmerApplicationByStatusUser_PrevAndNext(
				session, farmerApplication, status, userId, orderByComparator,
				true);

			array[1] = farmerApplication;

			array[2] = getBygetFarmerApplicationByStatusUser_PrevAndNext(
				session, farmerApplication, status, userId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmerApplication
		getBygetFarmerApplicationByStatusUser_PrevAndNext(
			Session session, FarmerApplication farmerApplication, int status,
			long userId, OrderByComparator<FarmerApplication> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUSUSER_STATUS_2);

		sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUSUSER_USERID_2);

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
			sb.append(FarmerApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmerApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetFarmerApplicationByStatusUser(
		int status, long userId) {

		for (FarmerApplication farmerApplication :
				findBygetFarmerApplicationByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmerApplication);
		}
	}

	/**
	 * Returns the number of farmer applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching farmer applications
	 */
	@Override
	public int countBygetFarmerApplicationByStatusUser(
		int status, long userId) {

		FinderPath finderPath =
			_finderPathCountBygetFarmerApplicationByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMERAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUSUSER_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

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
		_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUSUSER_STATUS_2 =
			"farmerApplication.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFARMERAPPLICATIONBYSTATUSUSER_USERID_2 =
			"farmerApplication.userId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetFarmerApplicationByUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFarmerApplicationByUser;
	private FinderPath _finderPathCountBygetFarmerApplicationByUser;

	/**
	 * Returns all the farmer applications where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId) {

		return findBygetFarmerApplicationByUser(
			userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer applications where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId, int start, int end) {

		return findBygetFarmerApplicationByUser(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer applications where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator) {

		return findBygetFarmerApplicationByUser(
			userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer applications where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer applications
	 */
	@Override
	public List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFarmerApplicationByUser;
				finderArgs = new Object[] {userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFarmerApplicationByUser;
			finderArgs = new Object[] {userId, start, end, orderByComparator};
		}

		List<FarmerApplication> list = null;

		if (useFinderCache) {
			list = (List<FarmerApplication>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerApplication farmerApplication : list) {
					if (userId != farmerApplication.getUserId()) {
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

			sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<FarmerApplication>)QueryUtil.list(
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
	 * Returns the first farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findBygetFarmerApplicationByUser_First(
			long userId, OrderByComparator<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication =
			fetchBygetFarmerApplicationByUser_First(userId, orderByComparator);

		if (farmerApplication != null) {
			return farmerApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFarmerApplicationException(sb.toString());
	}

	/**
	 * Returns the first farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerApplicationByUser_First(
		long userId, OrderByComparator<FarmerApplication> orderByComparator) {

		List<FarmerApplication> list = findBygetFarmerApplicationByUser(
			userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findBygetFarmerApplicationByUser_Last(
			long userId, OrderByComparator<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication =
			fetchBygetFarmerApplicationByUser_Last(userId, orderByComparator);

		if (farmerApplication != null) {
			return farmerApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFarmerApplicationException(sb.toString());
	}

	/**
	 * Returns the last farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerApplicationByUser_Last(
		long userId, OrderByComparator<FarmerApplication> orderByComparator) {

		int count = countBygetFarmerApplicationByUser(userId);

		if (count == 0) {
			return null;
		}

		List<FarmerApplication> list = findBygetFarmerApplicationByUser(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer applications before and after the current farmer application in the ordered set where userId = &#63;.
	 *
	 * @param farmerApplicationId the primary key of the current farmer application
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	@Override
	public FarmerApplication[] findBygetFarmerApplicationByUser_PrevAndNext(
			long farmerApplicationId, long userId,
			OrderByComparator<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = findByPrimaryKey(
			farmerApplicationId);

		Session session = null;

		try {
			session = openSession();

			FarmerApplication[] array = new FarmerApplicationImpl[3];

			array[0] = getBygetFarmerApplicationByUser_PrevAndNext(
				session, farmerApplication, userId, orderByComparator, true);

			array[1] = farmerApplication;

			array[2] = getBygetFarmerApplicationByUser_PrevAndNext(
				session, farmerApplication, userId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmerApplication getBygetFarmerApplicationByUser_PrevAndNext(
		Session session, FarmerApplication farmerApplication, long userId,
		OrderByComparator<FarmerApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYUSER_USERID_2);

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
			sb.append(FarmerApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmerApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer applications where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetFarmerApplicationByUser(long userId) {
		for (FarmerApplication farmerApplication :
				findBygetFarmerApplicationByUser(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(farmerApplication);
		}
	}

	/**
	 * Returns the number of farmer applications where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching farmer applications
	 */
	@Override
	public int countBygetFarmerApplicationByUser(long userId) {
		FinderPath finderPath = _finderPathCountBygetFarmerApplicationByUser;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERAPPLICATIONBYUSER_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

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
		_FINDER_COLUMN_GETFARMERAPPLICATIONBYUSER_USERID_2 =
			"farmerApplication.userId = ?";

	private FinderPath _finderPathFetchBygetFarmerApplicationAppNo;
	private FinderPath _finderPathCountBygetFarmerApplicationAppNo;

	/**
	 * Returns the farmer application where applicationNumber = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findBygetFarmerApplicationAppNo(
			String applicationNumber)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = fetchBygetFarmerApplicationAppNo(
			applicationNumber);

		if (farmerApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerApplicationException(sb.toString());
		}

		return farmerApplication;
	}

	/**
	 * Returns the farmer application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerApplicationAppNo(
		String applicationNumber) {

		return fetchBygetFarmerApplicationAppNo(applicationNumber, true);
	}

	/**
	 * Returns the farmer application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchBygetFarmerApplicationAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFarmerApplicationAppNo, finderArgs,this);
		}

		if (result instanceof FarmerApplication) {
			FarmerApplication farmerApplication = (FarmerApplication)result;

			if (!Objects.equals(
					applicationNumber,
					farmerApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFARMERAPPLICATIONAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFARMERAPPLICATIONAPPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<FarmerApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFarmerApplicationAppNo,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {applicationNumber};
							}

							_log.warn(
								"FarmerApplicationPersistenceImpl.fetchBygetFarmerApplicationAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerApplication farmerApplication = list.get(0);

					result = farmerApplication;

					cacheResult(farmerApplication);
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
			return (FarmerApplication)result;
		}
	}

	/**
	 * Removes the farmer application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the farmer application that was removed
	 */
	@Override
	public FarmerApplication removeBygetFarmerApplicationAppNo(
			String applicationNumber)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = findBygetFarmerApplicationAppNo(
			applicationNumber);

		return remove(farmerApplication);
	}

	/**
	 * Returns the number of farmer applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching farmer applications
	 */
	@Override
	public int countBygetFarmerApplicationAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetFarmerApplicationAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFARMERAPPLICATIONAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFARMERAPPLICATIONAPPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

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
		_FINDER_COLUMN_GETFARMERAPPLICATIONAPPNO_APPLICATIONNUMBER_2 =
			"farmerApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETFARMERAPPLICATIONAPPNO_APPLICATIONNUMBER_3 =
			"(farmerApplication.applicationNumber IS NULL OR farmerApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchByfarmerApplicationByCaseId;
	private FinderPath _finderPathCountByfarmerApplicationByCaseId;

	/**
	 * Returns the farmer application where caseld = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param caseld the caseld
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication findByfarmerApplicationByCaseId(String caseld)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = fetchByfarmerApplicationByCaseId(
			caseld);

		if (farmerApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseld=");
			sb.append(caseld);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerApplicationException(sb.toString());
		}

		return farmerApplication;
	}

	/**
	 * Returns the farmer application where caseld = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseld the caseld
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchByfarmerApplicationByCaseId(String caseld) {
		return fetchByfarmerApplicationByCaseId(caseld, true);
	}

	/**
	 * Returns the farmer application where caseld = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseld the caseld
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	@Override
	public FarmerApplication fetchByfarmerApplicationByCaseId(
		String caseld, boolean useFinderCache) {

		caseld = Objects.toString(caseld, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseld};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByfarmerApplicationByCaseId, finderArgs,this);
		}

		if (result instanceof FarmerApplication) {
			FarmerApplication farmerApplication = (FarmerApplication)result;

			if (!Objects.equals(caseld, farmerApplication.getCaseld())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERAPPLICATION_WHERE);

			boolean bindCaseld = false;

			if (caseld.isEmpty()) {
				sb.append(_FINDER_COLUMN_FARMERAPPLICATIONBYCASEID_CASELD_3);
			}
			else {
				bindCaseld = true;

				sb.append(_FINDER_COLUMN_FARMERAPPLICATIONBYCASEID_CASELD_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseld) {
					queryPos.add(caseld);
				}

				List<FarmerApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByfarmerApplicationByCaseId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseld};
							}

							_log.warn(
								"FarmerApplicationPersistenceImpl.fetchByfarmerApplicationByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerApplication farmerApplication = list.get(0);

					result = farmerApplication;

					cacheResult(farmerApplication);
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
			return (FarmerApplication)result;
		}
	}

	/**
	 * Removes the farmer application where caseld = &#63; from the database.
	 *
	 * @param caseld the caseld
	 * @return the farmer application that was removed
	 */
	@Override
	public FarmerApplication removeByfarmerApplicationByCaseId(String caseld)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = findByfarmerApplicationByCaseId(
			caseld);

		return remove(farmerApplication);
	}

	/**
	 * Returns the number of farmer applications where caseld = &#63;.
	 *
	 * @param caseld the caseld
	 * @return the number of matching farmer applications
	 */
	@Override
	public int countByfarmerApplicationByCaseId(String caseld) {
		caseld = Objects.toString(caseld, "");

		FinderPath finderPath = _finderPathCountByfarmerApplicationByCaseId;

		Object[] finderArgs = new Object[] {caseld};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERAPPLICATION_WHERE);

			boolean bindCaseld = false;

			if (caseld.isEmpty()) {
				sb.append(_FINDER_COLUMN_FARMERAPPLICATIONBYCASEID_CASELD_3);
			}
			else {
				bindCaseld = true;

				sb.append(_FINDER_COLUMN_FARMERAPPLICATIONBYCASEID_CASELD_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseld) {
					queryPos.add(caseld);
				}

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
		_FINDER_COLUMN_FARMERAPPLICATIONBYCASEID_CASELD_2 =
			"farmerApplication.caseld = ?";

	private static final String
		_FINDER_COLUMN_FARMERAPPLICATIONBYCASEID_CASELD_3 =
			"(farmerApplication.caseld IS NULL OR farmerApplication.caseld = '')";

	public FarmerApplicationPersistenceImpl() {
		setModelClass(FarmerApplication.class);

		setModelImplClass(FarmerApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerApplicationTable.INSTANCE);
	}

	/**
	 * Caches the farmer application in the entity cache if it is enabled.
	 *
	 * @param farmerApplication the farmer application
	 */
	@Override
	public void cacheResult(FarmerApplication farmerApplication) {
		entityCache.putResult(
			FarmerApplicationImpl.class, farmerApplication.getPrimaryKey(),
			farmerApplication);

		finderCache.putResult(
			_finderPathFetchBygetFarmerById,
			new Object[] {farmerApplication.getFarmerApplicationId()},
			farmerApplication);

		finderCache.putResult(
			_finderPathFetchBygetFarmerByRT_AppNo,
			new Object[] {
				farmerApplication.getExpiredLicenseappNumber(),
				farmerApplication.getRequestType()
			},
			farmerApplication);

		finderCache.putResult(
			_finderPathFetchBygetFarmerApplicationAppNo,
			new Object[] {farmerApplication.getApplicationNumber()},
			farmerApplication);

		finderCache.putResult(
			_finderPathFetchByfarmerApplicationByCaseId,
			new Object[] {farmerApplication.getCaseld()}, farmerApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer applications in the entity cache if it is enabled.
	 *
	 * @param farmerApplications the farmer applications
	 */
	@Override
	public void cacheResult(List<FarmerApplication> farmerApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerApplication farmerApplication : farmerApplications) {
			if (entityCache.getResult(
					FarmerApplicationImpl.class,
					farmerApplication.getPrimaryKey()) == null) {

				cacheResult(farmerApplication);
			}
		}
	}

	/**
	 * Clears the cache for all farmer applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerApplicationImpl.class);

		finderCache.clearCache(FarmerApplicationImpl.class);
	}

	/**
	 * Clears the cache for the farmer application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerApplication farmerApplication) {
		entityCache.removeResult(
			FarmerApplicationImpl.class, farmerApplication);
	}

	@Override
	public void clearCache(List<FarmerApplication> farmerApplications) {
		for (FarmerApplication farmerApplication : farmerApplications) {
			entityCache.removeResult(
				FarmerApplicationImpl.class, farmerApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FarmerApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerApplicationModelImpl farmerApplicationModelImpl) {

		Object[] args = new Object[] {
			farmerApplicationModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFarmerById, args, farmerApplicationModelImpl);

		args = new Object[] {
			farmerApplicationModelImpl.getExpiredLicenseappNumber(),
			farmerApplicationModelImpl.getRequestType()
		};

		finderCache.putResult(
			_finderPathCountBygetFarmerByRT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFarmerByRT_AppNo, args,
			farmerApplicationModelImpl);

		args = new Object[] {farmerApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetFarmerApplicationAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFarmerApplicationAppNo, args,
			farmerApplicationModelImpl);

		args = new Object[] {farmerApplicationModelImpl.getCaseld()};

		finderCache.putResult(
			_finderPathCountByfarmerApplicationByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByfarmerApplicationByCaseId, args,
			farmerApplicationModelImpl);
	}

	/**
	 * Creates a new farmer application with the primary key. Does not add the farmer application to the database.
	 *
	 * @param farmerApplicationId the primary key for the new farmer application
	 * @return the new farmer application
	 */
	@Override
	public FarmerApplication create(long farmerApplicationId) {
		FarmerApplication farmerApplication = new FarmerApplicationImpl();

		farmerApplication.setNew(true);
		farmerApplication.setPrimaryKey(farmerApplicationId);

		farmerApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmerApplication;
	}

	/**
	 * Removes the farmer application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application that was removed
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	@Override
	public FarmerApplication remove(long farmerApplicationId)
		throws NoSuchFarmerApplicationException {

		return remove((Serializable)farmerApplicationId);
	}

	/**
	 * Removes the farmer application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer application
	 * @return the farmer application that was removed
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	@Override
	public FarmerApplication remove(Serializable primaryKey)
		throws NoSuchFarmerApplicationException {

		Session session = null;

		try {
			session = openSession();

			FarmerApplication farmerApplication =
				(FarmerApplication)session.get(
					FarmerApplicationImpl.class, primaryKey);

			if (farmerApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerApplication);
		}
		catch (NoSuchFarmerApplicationException noSuchEntityException) {
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
	protected FarmerApplication removeImpl(
		FarmerApplication farmerApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerApplication)) {
				farmerApplication = (FarmerApplication)session.get(
					FarmerApplicationImpl.class,
					farmerApplication.getPrimaryKeyObj());
			}

			if (farmerApplication != null) {
				session.delete(farmerApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerApplication != null) {
			clearCache(farmerApplication);
		}

		return farmerApplication;
	}

	@Override
	public FarmerApplication updateImpl(FarmerApplication farmerApplication) {
		boolean isNew = farmerApplication.isNew();

		if (!(farmerApplication instanceof FarmerApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerApplication implementation " +
					farmerApplication.getClass());
		}

		FarmerApplicationModelImpl farmerApplicationModelImpl =
			(FarmerApplicationModelImpl)farmerApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerApplication.setCreateDate(date);
			}
			else {
				farmerApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmerApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerApplication.setModifiedDate(date);
			}
			else {
				farmerApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerApplication);
			}
			else {
				farmerApplication = (FarmerApplication)session.merge(
					farmerApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerApplicationImpl.class, farmerApplicationModelImpl, false,
			true);

		cacheUniqueFindersCache(farmerApplicationModelImpl);

		if (isNew) {
			farmerApplication.setNew(false);
		}

		farmerApplication.resetOriginalValues();

		return farmerApplication;
	}

	/**
	 * Returns the farmer application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer application
	 * @return the farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	@Override
	public FarmerApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerApplicationException {

		FarmerApplication farmerApplication = fetchByPrimaryKey(primaryKey);

		if (farmerApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerApplication;
	}

	/**
	 * Returns the farmer application with the primary key or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	@Override
	public FarmerApplication findByPrimaryKey(long farmerApplicationId)
		throws NoSuchFarmerApplicationException {

		return findByPrimaryKey((Serializable)farmerApplicationId);
	}

	/**
	 * Returns the farmer application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application, or <code>null</code> if a farmer application with the primary key could not be found
	 */
	@Override
	public FarmerApplication fetchByPrimaryKey(long farmerApplicationId) {
		return fetchByPrimaryKey((Serializable)farmerApplicationId);
	}

	/**
	 * Returns all the farmer applications.
	 *
	 * @return the farmer applications
	 */
	@Override
	public List<FarmerApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of farmer applications
	 */
	@Override
	public List<FarmerApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer applications
	 */
	@Override
	public List<FarmerApplication> findAll(
		int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer applications
	 */
	@Override
	public List<FarmerApplication> findAll(
		int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator,
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

		List<FarmerApplication> list = null;

		if (useFinderCache) {
			list = (List<FarmerApplication>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERAPPLICATION;

				sql = sql.concat(FarmerApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerApplication>)QueryUtil.list(
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
	 * Removes all the farmer applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerApplication farmerApplication : findAll()) {
			remove(farmerApplication);
		}
	}

	/**
	 * Returns the number of farmer applications.
	 *
	 * @return the number of farmer applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FARMERAPPLICATION);

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
		return "farmerApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer application persistence.
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

		_finderPathFetchBygetFarmerById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFarmerById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_finderPathFetchBygetFarmerByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFarmerByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"expiredLicenseappNumber", "requestType"}, true);

		_finderPathCountBygetFarmerByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFarmerByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"expiredLicenseappNumber", "requestType"}, false);

		_finderPathWithPaginationFindBygetFarmerApplicationByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFarmerApplicationByStatus",
				new String[] {
					Integer.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetFarmerApplicationByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFarmerApplicationByStatus",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetFarmerApplicationByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFarmerApplicationByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetFarmerApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFarmerApplicationByStatusUser",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetFarmerApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFarmerApplicationByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetFarmerApplicationByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFarmerApplicationByStatusUser",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathWithPaginationFindBygetFarmerApplicationByUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFarmerApplicationByUser",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"userId"}, true);

		_finderPathWithoutPaginationFindBygetFarmerApplicationByUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFarmerApplicationByUser",
				new String[] {Long.class.getName()}, new String[] {"userId"},
				true);

		_finderPathCountBygetFarmerApplicationByUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFarmerApplicationByUser",
			new String[] {Long.class.getName()}, new String[] {"userId"},
			false);

		_finderPathFetchBygetFarmerApplicationAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFarmerApplicationAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetFarmerApplicationAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFarmerApplicationAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchByfarmerApplicationByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByfarmerApplicationByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseld"},
			true);

		_finderPathCountByfarmerApplicationByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByfarmerApplicationByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseld"},
			false);

		_setFarmerApplicationUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerApplicationUtilPersistence(null);

		entityCache.removeCache(FarmerApplicationImpl.class.getName());
	}

	private void _setFarmerApplicationUtilPersistence(
		FarmerApplicationPersistence farmerApplicationPersistence) {

		try {
			Field field = FarmerApplicationUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmerApplicationPersistence);
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

	private static final String _SQL_SELECT_FARMERAPPLICATION =
		"SELECT farmerApplication FROM FarmerApplication farmerApplication";

	private static final String _SQL_SELECT_FARMERAPPLICATION_WHERE =
		"SELECT farmerApplication FROM FarmerApplication farmerApplication WHERE ";

	private static final String _SQL_COUNT_FARMERAPPLICATION =
		"SELECT COUNT(farmerApplication) FROM FarmerApplication farmerApplication";

	private static final String _SQL_COUNT_FARMERAPPLICATION_WHERE =
		"SELECT COUNT(farmerApplication) FROM FarmerApplication farmerApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "farmerApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerApplicationModelArgumentsResolver
		_farmerApplicationModelArgumentsResolver;

}