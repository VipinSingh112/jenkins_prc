/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgricultureApplication;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture application service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgricultureApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationPersistence
 * @generated
 */
public class AgricultureApplicationUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		AgricultureApplication agricultureApplication) {

		getPersistence().clearCache(agricultureApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, AgricultureApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureApplication update(
		AgricultureApplication agricultureApplication) {

		return getPersistence().update(agricultureApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureApplication update(
		AgricultureApplication agricultureApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(agricultureApplication, serviceContext);
	}

	/**
	 * Returns the agriculture application where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public static AgricultureApplication findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture application where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture application where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture application where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture application that was removed
	 */
	public static AgricultureApplication removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture applications where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture applications
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching agriculture applications
	 */
	public static List<AgricultureApplication>
		findBygetAgriApplicationByStatusUser(int status, long userId) {

		return getPersistence().findBygetAgriApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns a range of all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of matching agriculture applications
	 */
	public static List<AgricultureApplication>
		findBygetAgriApplicationByStatusUser(
			int status, long userId, int start, int end) {

		return getPersistence().findBygetAgriApplicationByStatusUser(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture applications
	 */
	public static List<AgricultureApplication>
		findBygetAgriApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<AgricultureApplication> orderByComparator) {

		return getPersistence().findBygetAgriApplicationByStatusUser(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture applications
	 */
	public static List<AgricultureApplication>
		findBygetAgriApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<AgricultureApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetAgriApplicationByStatusUser(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public static AgricultureApplication
			findBygetAgriApplicationByStatusUser_First(
				int status, long userId,
				OrderByComparator<AgricultureApplication> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findBygetAgriApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication
		fetchBygetAgriApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<AgricultureApplication> orderByComparator) {

		return getPersistence().fetchBygetAgriApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public static AgricultureApplication
			findBygetAgriApplicationByStatusUser_Last(
				int status, long userId,
				OrderByComparator<AgricultureApplication> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findBygetAgriApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication
		fetchBygetAgriApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<AgricultureApplication> orderByComparator) {

		return getPersistence().fetchBygetAgriApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the agriculture applications before and after the current agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param agricultureApplicationId the primary key of the current agriculture application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	public static AgricultureApplication[]
			findBygetAgriApplicationByStatusUser_PrevAndNext(
				long agricultureApplicationId, int status, long userId,
				OrderByComparator<AgricultureApplication> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().
			findBygetAgriApplicationByStatusUser_PrevAndNext(
				agricultureApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the agriculture applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetAgriApplicationByStatusUser(
		int status, long userId) {

		getPersistence().removeBygetAgriApplicationByStatusUser(status, userId);
	}

	/**
	 * Returns the number of agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching agriculture applications
	 */
	public static int countBygetAgriApplicationByStatusUser(
		int status, long userId) {

		return getPersistence().countBygetAgriApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public static AgricultureApplication findBygetAgriApplicationByRT_AppNo(
			String expiredLicenseAppNo, String requestType)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findBygetAgriApplicationByRT_AppNo(
			expiredLicenseAppNo, requestType);
	}

	/**
	 * Returns the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgriApplicationByRT_AppNo(
		String expiredLicenseAppNo, String requestType) {

		return getPersistence().fetchBygetAgriApplicationByRT_AppNo(
			expiredLicenseAppNo, requestType);
	}

	/**
	 * Returns the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgriApplicationByRT_AppNo(
		String expiredLicenseAppNo, String requestType,
		boolean useFinderCache) {

		return getPersistence().fetchBygetAgriApplicationByRT_AppNo(
			expiredLicenseAppNo, requestType, useFinderCache);
	}

	/**
	 * Removes the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; from the database.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the agriculture application that was removed
	 */
	public static AgricultureApplication removeBygetAgriApplicationByRT_AppNo(
			String expiredLicenseAppNo, String requestType)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().removeBygetAgriApplicationByRT_AppNo(
			expiredLicenseAppNo, requestType);
	}

	/**
	 * Returns the number of agriculture applications where expiredLicenseAppNo = &#63; and requestType = &#63;.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the number of matching agriculture applications
	 */
	public static int countBygetAgriApplicationByRT_AppNo(
		String expiredLicenseAppNo, String requestType) {

		return getPersistence().countBygetAgriApplicationByRT_AppNo(
			expiredLicenseAppNo, requestType);
	}

	/**
	 * Returns all the agriculture applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching agriculture applications
	 */
	public static List<AgricultureApplication> findBygetAgricultureByStatus(
		int status) {

		return getPersistence().findBygetAgricultureByStatus(status);
	}

	/**
	 * Returns a range of all the agriculture applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of matching agriculture applications
	 */
	public static List<AgricultureApplication> findBygetAgricultureByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetAgricultureByStatus(
			status, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture applications
	 */
	public static List<AgricultureApplication> findBygetAgricultureByStatus(
		int status, int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		return getPersistence().findBygetAgricultureByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture applications
	 */
	public static List<AgricultureApplication> findBygetAgricultureByStatus(
		int status, int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAgricultureByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public static AgricultureApplication findBygetAgricultureByStatus_First(
			int status,
			OrderByComparator<AgricultureApplication> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findBygetAgricultureByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgricultureByStatus_First(
		int status,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		return getPersistence().fetchBygetAgricultureByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public static AgricultureApplication findBygetAgricultureByStatus_Last(
			int status,
			OrderByComparator<AgricultureApplication> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findBygetAgricultureByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgricultureByStatus_Last(
		int status,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		return getPersistence().fetchBygetAgricultureByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the agriculture applications before and after the current agriculture application in the ordered set where status = &#63;.
	 *
	 * @param agricultureApplicationId the primary key of the current agriculture application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	public static AgricultureApplication[]
			findBygetAgricultureByStatus_PrevAndNext(
				long agricultureApplicationId, int status,
				OrderByComparator<AgricultureApplication> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findBygetAgricultureByStatus_PrevAndNext(
			agricultureApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the agriculture applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetAgricultureByStatus(int status) {
		getPersistence().removeBygetAgricultureByStatus(status);
	}

	/**
	 * Returns the number of agriculture applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching agriculture applications
	 */
	public static int countBygetAgricultureByStatus(int status) {
		return getPersistence().countBygetAgricultureByStatus(status);
	}

	/**
	 * Returns the agriculture application where applicationNumber = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public static AgricultureApplication findBygetAgricultureByAppNo(
			String applicationNumber)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findBygetAgricultureByAppNo(applicationNumber);
	}

	/**
	 * Returns the agriculture application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgricultureByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetAgricultureByAppNo(applicationNumber);
	}

	/**
	 * Returns the agriculture application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgricultureByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the agriculture application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the agriculture application that was removed
	 */
	public static AgricultureApplication removeBygetAgricultureByAppNo(
			String applicationNumber)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().removeBygetAgricultureByAppNo(
			applicationNumber);
	}

	/**
	 * Returns the number of agriculture applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching agriculture applications
	 */
	public static int countBygetAgricultureByAppNo(String applicationNumber) {
		return getPersistence().countBygetAgricultureByAppNo(applicationNumber);
	}

	/**
	 * Returns the agriculture application where caseId = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public static AgricultureApplication findBygetAgricultureBy_CI(
			String caseId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findBygetAgricultureBy_CI(caseId);
	}

	/**
	 * Returns the agriculture application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgricultureBy_CI(
		String caseId) {

		return getPersistence().fetchBygetAgricultureBy_CI(caseId);
	}

	/**
	 * Returns the agriculture application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public static AgricultureApplication fetchBygetAgricultureBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the agriculture application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the agriculture application that was removed
	 */
	public static AgricultureApplication removeBygetAgricultureBy_CI(
			String caseId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().removeBygetAgricultureBy_CI(caseId);
	}

	/**
	 * Returns the number of agriculture applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture applications
	 */
	public static int countBygetAgricultureBy_CI(String caseId) {
		return getPersistence().countBygetAgricultureBy_CI(caseId);
	}

	/**
	 * Caches the agriculture application in the entity cache if it is enabled.
	 *
	 * @param agricultureApplication the agriculture application
	 */
	public static void cacheResult(
		AgricultureApplication agricultureApplication) {

		getPersistence().cacheResult(agricultureApplication);
	}

	/**
	 * Caches the agriculture applications in the entity cache if it is enabled.
	 *
	 * @param agricultureApplications the agriculture applications
	 */
	public static void cacheResult(
		List<AgricultureApplication> agricultureApplications) {

		getPersistence().cacheResult(agricultureApplications);
	}

	/**
	 * Creates a new agriculture application with the primary key. Does not add the agriculture application to the database.
	 *
	 * @param agricultureApplicationId the primary key for the new agriculture application
	 * @return the new agriculture application
	 */
	public static AgricultureApplication create(long agricultureApplicationId) {
		return getPersistence().create(agricultureApplicationId);
	}

	/**
	 * Removes the agriculture application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application that was removed
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	public static AgricultureApplication remove(long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().remove(agricultureApplicationId);
	}

	public static AgricultureApplication updateImpl(
		AgricultureApplication agricultureApplication) {

		return getPersistence().updateImpl(agricultureApplication);
	}

	/**
	 * Returns the agriculture application with the primary key or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	public static AgricultureApplication findByPrimaryKey(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureApplicationException {

		return getPersistence().findByPrimaryKey(agricultureApplicationId);
	}

	/**
	 * Returns the agriculture application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application, or <code>null</code> if a agriculture application with the primary key could not be found
	 */
	public static AgricultureApplication fetchByPrimaryKey(
		long agricultureApplicationId) {

		return getPersistence().fetchByPrimaryKey(agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture applications.
	 *
	 * @return the agriculture applications
	 */
	public static List<AgricultureApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of agriculture applications
	 */
	public static List<AgricultureApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture applications
	 */
	public static List<AgricultureApplication> findAll(
		int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture applications
	 */
	public static List<AgricultureApplication> findAll(
		int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture applications.
	 *
	 * @return the number of agriculture applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgricultureApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgricultureApplicationPersistence _persistence;

}