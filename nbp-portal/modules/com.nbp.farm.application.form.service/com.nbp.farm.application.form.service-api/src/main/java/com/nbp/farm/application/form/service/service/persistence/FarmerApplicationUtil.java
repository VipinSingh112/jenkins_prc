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

package com.nbp.farm.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.form.service.model.FarmerApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer application service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationPersistence
 * @generated
 */
public class FarmerApplicationUtil {

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
	public static void clearCache(FarmerApplication farmerApplication) {
		getPersistence().clearCache(farmerApplication);
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
	public static Map<Serializable, FarmerApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerApplication update(
		FarmerApplication farmerApplication) {

		return getPersistence().update(farmerApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerApplication update(
		FarmerApplication farmerApplication, ServiceContext serviceContext) {

		return getPersistence().update(farmerApplication, serviceContext);
	}

	/**
	 * Returns the farmer application where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public static FarmerApplication findBygetFarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer application where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerById(
		long farmerApplicationId) {

		return getPersistence().fetchBygetFarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer application where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer application where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer application that was removed
	 */
	public static FarmerApplication removeBygetFarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().removeBygetFarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer applications where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer applications
	 */
	public static int countBygetFarmerById(long farmerApplicationId) {
		return getPersistence().countBygetFarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public static FarmerApplication findBygetFarmerByRT_AppNo(
			String expiredLicenseappNumber, String requestType)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerByRT_AppNo(
			expiredLicenseappNumber, requestType);
	}

	/**
	 * Returns the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerByRT_AppNo(
		String expiredLicenseappNumber, String requestType) {

		return getPersistence().fetchBygetFarmerByRT_AppNo(
			expiredLicenseappNumber, requestType);
	}

	/**
	 * Returns the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerByRT_AppNo(
		String expiredLicenseappNumber, String requestType,
		boolean useFinderCache) {

		return getPersistence().fetchBygetFarmerByRT_AppNo(
			expiredLicenseappNumber, requestType, useFinderCache);
	}

	/**
	 * Removes the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; from the database.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the farmer application that was removed
	 */
	public static FarmerApplication removeBygetFarmerByRT_AppNo(
			String expiredLicenseappNumber, String requestType)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().removeBygetFarmerByRT_AppNo(
			expiredLicenseappNumber, requestType);
	}

	/**
	 * Returns the number of farmer applications where expiredLicenseappNumber = &#63; and requestType = &#63;.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the number of matching farmer applications
	 */
	public static int countBygetFarmerByRT_AppNo(
		String expiredLicenseappNumber, String requestType) {

		return getPersistence().countBygetFarmerByRT_AppNo(
			expiredLicenseappNumber, requestType);
	}

	/**
	 * Returns all the farmer applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching farmer applications
	 */
	public static List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status) {

		return getPersistence().findBygetFarmerApplicationByStatus(status);
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
	public static List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetFarmerApplicationByStatus(
			status, start, end);
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
	public static List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().findBygetFarmerApplicationByStatus(
			status, start, end, orderByComparator);
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
	public static List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFarmerApplicationByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public static FarmerApplication findBygetFarmerApplicationByStatus_First(
			int status, OrderByComparator<FarmerApplication> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerApplicationByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerApplicationByStatus_First(
		int status, OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().fetchBygetFarmerApplicationByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public static FarmerApplication findBygetFarmerApplicationByStatus_Last(
			int status, OrderByComparator<FarmerApplication> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerApplicationByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerApplicationByStatus_Last(
		int status, OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().fetchBygetFarmerApplicationByStatus_Last(
			status, orderByComparator);
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
	public static FarmerApplication[]
			findBygetFarmerApplicationByStatus_PrevAndNext(
				long farmerApplicationId, int status,
				OrderByComparator<FarmerApplication> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerApplicationByStatus_PrevAndNext(
			farmerApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the farmer applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetFarmerApplicationByStatus(int status) {
		getPersistence().removeBygetFarmerApplicationByStatus(status);
	}

	/**
	 * Returns the number of farmer applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching farmer applications
	 */
	public static int countBygetFarmerApplicationByStatus(int status) {
		return getPersistence().countBygetFarmerApplicationByStatus(status);
	}

	/**
	 * Returns all the farmer applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching farmer applications
	 */
	public static List<FarmerApplication>
		findBygetFarmerApplicationByStatusUser(int status, long userId) {

		return getPersistence().findBygetFarmerApplicationByStatusUser(
			status, userId);
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
	public static List<FarmerApplication>
		findBygetFarmerApplicationByStatusUser(
			int status, long userId, int start, int end) {

		return getPersistence().findBygetFarmerApplicationByStatusUser(
			status, userId, start, end);
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
	public static List<FarmerApplication>
		findBygetFarmerApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().findBygetFarmerApplicationByStatusUser(
			status, userId, start, end, orderByComparator);
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
	public static List<FarmerApplication>
		findBygetFarmerApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<FarmerApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetFarmerApplicationByStatusUser(
			status, userId, start, end, orderByComparator, useFinderCache);
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
	public static FarmerApplication
			findBygetFarmerApplicationByStatusUser_First(
				int status, long userId,
				OrderByComparator<FarmerApplication> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication
		fetchBygetFarmerApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().fetchBygetFarmerApplicationByStatusUser_First(
			status, userId, orderByComparator);
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
	public static FarmerApplication findBygetFarmerApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<FarmerApplication> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication
		fetchBygetFarmerApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().fetchBygetFarmerApplicationByStatusUser_Last(
			status, userId, orderByComparator);
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
	public static FarmerApplication[]
			findBygetFarmerApplicationByStatusUser_PrevAndNext(
				long farmerApplicationId, int status, long userId,
				OrderByComparator<FarmerApplication> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().
			findBygetFarmerApplicationByStatusUser_PrevAndNext(
				farmerApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the farmer applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetFarmerApplicationByStatusUser(
		int status, long userId) {

		getPersistence().removeBygetFarmerApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns the number of farmer applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching farmer applications
	 */
	public static int countBygetFarmerApplicationByStatusUser(
		int status, long userId) {

		return getPersistence().countBygetFarmerApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns all the farmer applications where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching farmer applications
	 */
	public static List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId) {

		return getPersistence().findBygetFarmerApplicationByUser(userId);
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
	public static List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId, int start, int end) {

		return getPersistence().findBygetFarmerApplicationByUser(
			userId, start, end);
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
	public static List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().findBygetFarmerApplicationByUser(
			userId, start, end, orderByComparator);
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
	public static List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId, int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFarmerApplicationByUser(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public static FarmerApplication findBygetFarmerApplicationByUser_First(
			long userId, OrderByComparator<FarmerApplication> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerApplicationByUser_First(
			userId, orderByComparator);
	}

	/**
	 * Returns the first farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerApplicationByUser_First(
		long userId, OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().fetchBygetFarmerApplicationByUser_First(
			userId, orderByComparator);
	}

	/**
	 * Returns the last farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public static FarmerApplication findBygetFarmerApplicationByUser_Last(
			long userId, OrderByComparator<FarmerApplication> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerApplicationByUser_Last(
			userId, orderByComparator);
	}

	/**
	 * Returns the last farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerApplicationByUser_Last(
		long userId, OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().fetchBygetFarmerApplicationByUser_Last(
			userId, orderByComparator);
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
	public static FarmerApplication[]
			findBygetFarmerApplicationByUser_PrevAndNext(
				long farmerApplicationId, long userId,
				OrderByComparator<FarmerApplication> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerApplicationByUser_PrevAndNext(
			farmerApplicationId, userId, orderByComparator);
	}

	/**
	 * Removes all the farmer applications where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeBygetFarmerApplicationByUser(long userId) {
		getPersistence().removeBygetFarmerApplicationByUser(userId);
	}

	/**
	 * Returns the number of farmer applications where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching farmer applications
	 */
	public static int countBygetFarmerApplicationByUser(long userId) {
		return getPersistence().countBygetFarmerApplicationByUser(userId);
	}

	/**
	 * Returns the farmer application where applicationNumber = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public static FarmerApplication findBygetFarmerApplicationAppNo(
			String applicationNumber)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findBygetFarmerApplicationAppNo(
			applicationNumber);
	}

	/**
	 * Returns the farmer application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerApplicationAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetFarmerApplicationAppNo(
			applicationNumber);
	}

	/**
	 * Returns the farmer application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchBygetFarmerApplicationAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetFarmerApplicationAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the farmer application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the farmer application that was removed
	 */
	public static FarmerApplication removeBygetFarmerApplicationAppNo(
			String applicationNumber)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().removeBygetFarmerApplicationAppNo(
			applicationNumber);
	}

	/**
	 * Returns the number of farmer applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching farmer applications
	 */
	public static int countBygetFarmerApplicationAppNo(
		String applicationNumber) {

		return getPersistence().countBygetFarmerApplicationAppNo(
			applicationNumber);
	}

	/**
	 * Returns the farmer application where caseld = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param caseld the caseld
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public static FarmerApplication findByfarmerApplicationByCaseId(
			String caseld)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findByfarmerApplicationByCaseId(caseld);
	}

	/**
	 * Returns the farmer application where caseld = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseld the caseld
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchByfarmerApplicationByCaseId(
		String caseld) {

		return getPersistence().fetchByfarmerApplicationByCaseId(caseld);
	}

	/**
	 * Returns the farmer application where caseld = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseld the caseld
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public static FarmerApplication fetchByfarmerApplicationByCaseId(
		String caseld, boolean useFinderCache) {

		return getPersistence().fetchByfarmerApplicationByCaseId(
			caseld, useFinderCache);
	}

	/**
	 * Removes the farmer application where caseld = &#63; from the database.
	 *
	 * @param caseld the caseld
	 * @return the farmer application that was removed
	 */
	public static FarmerApplication removeByfarmerApplicationByCaseId(
			String caseld)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().removeByfarmerApplicationByCaseId(caseld);
	}

	/**
	 * Returns the number of farmer applications where caseld = &#63;.
	 *
	 * @param caseld the caseld
	 * @return the number of matching farmer applications
	 */
	public static int countByfarmerApplicationByCaseId(String caseld) {
		return getPersistence().countByfarmerApplicationByCaseId(caseld);
	}

	/**
	 * Caches the farmer application in the entity cache if it is enabled.
	 *
	 * @param farmerApplication the farmer application
	 */
	public static void cacheResult(FarmerApplication farmerApplication) {
		getPersistence().cacheResult(farmerApplication);
	}

	/**
	 * Caches the farmer applications in the entity cache if it is enabled.
	 *
	 * @param farmerApplications the farmer applications
	 */
	public static void cacheResult(List<FarmerApplication> farmerApplications) {
		getPersistence().cacheResult(farmerApplications);
	}

	/**
	 * Creates a new farmer application with the primary key. Does not add the farmer application to the database.
	 *
	 * @param farmerApplicationId the primary key for the new farmer application
	 * @return the new farmer application
	 */
	public static FarmerApplication create(long farmerApplicationId) {
		return getPersistence().create(farmerApplicationId);
	}

	/**
	 * Removes the farmer application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application that was removed
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	public static FarmerApplication remove(long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().remove(farmerApplicationId);
	}

	public static FarmerApplication updateImpl(
		FarmerApplication farmerApplication) {

		return getPersistence().updateImpl(farmerApplication);
	}

	/**
	 * Returns the farmer application with the primary key or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	public static FarmerApplication findByPrimaryKey(long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationException {

		return getPersistence().findByPrimaryKey(farmerApplicationId);
	}

	/**
	 * Returns the farmer application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application, or <code>null</code> if a farmer application with the primary key could not be found
	 */
	public static FarmerApplication fetchByPrimaryKey(
		long farmerApplicationId) {

		return getPersistence().fetchByPrimaryKey(farmerApplicationId);
	}

	/**
	 * Returns all the farmer applications.
	 *
	 * @return the farmer applications
	 */
	public static List<FarmerApplication> findAll() {
		return getPersistence().findAll();
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
	public static List<FarmerApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<FarmerApplication> findAll(
		int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<FarmerApplication> findAll(
		int start, int end,
		OrderByComparator<FarmerApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer applications.
	 *
	 * @return the number of farmer applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerApplicationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerApplicationPersistence _persistence;

}