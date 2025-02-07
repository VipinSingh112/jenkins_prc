/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManufacturingApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manufacturing application service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManufacturingApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationPersistence
 * @generated
 */
public class ManufacturingApplicationUtil {

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
		ManufacturingApplication manufacturingApplication) {

		getPersistence().clearCache(manufacturingApplication);
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
	public static Map<Serializable, ManufacturingApplication>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManufacturingApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManufacturingApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManufacturingApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManufacturingApplication update(
		ManufacturingApplication manufacturingApplication) {

		return getPersistence().update(manufacturingApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManufacturingApplication update(
		ManufacturingApplication manufacturingApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(
			manufacturingApplication, serviceContext);
	}

	/**
	 * Returns all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching manufacturing applications
	 */
	public static List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status) {

		return getPersistence().findBygetManuafactureByS_U(userId, status);
	}

	/**
	 * Returns a range of all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of matching manufacturing applications
	 */
	public static List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetManuafactureByS_U(
			userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing applications
	 */
	public static List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return getPersistence().findBygetManuafactureByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing applications
	 */
	public static List<ManufacturingApplication> findBygetManuafactureByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetManuafactureByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication findBygetManuafactureByS_U_First(
			long userId, int status,
			OrderByComparator<ManufacturingApplication> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findBygetManuafactureByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication fetchBygetManuafactureByS_U_First(
		long userId, int status,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return getPersistence().fetchBygetManuafactureByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication findBygetManuafactureByS_U_Last(
			long userId, int status,
			OrderByComparator<ManufacturingApplication> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findBygetManuafactureByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication fetchBygetManuafactureByS_U_Last(
		long userId, int status,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return getPersistence().fetchBygetManuafactureByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the manufacturing applications before and after the current manufacturing application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param manufacturingApplicationId the primary key of the current manufacturing application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	public static ManufacturingApplication[]
			findBygetManuafactureByS_U_PrevAndNext(
				long manufacturingApplicationId, long userId, int status,
				OrderByComparator<ManufacturingApplication> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findBygetManuafactureByS_U_PrevAndNext(
			manufacturingApplicationId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the manufacturing applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetManuafactureByS_U(long userId, int status) {
		getPersistence().removeBygetManuafactureByS_U(userId, status);
	}

	/**
	 * Returns the number of manufacturing applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching manufacturing applications
	 */
	public static int countBygetManuafactureByS_U(long userId, int status) {
		return getPersistence().countBygetManuafactureByS_U(userId, status);
	}

	/**
	 * Returns all the manufacturing applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching manufacturing applications
	 */
	public static List<ManufacturingApplication> findBygetManufacturingByStatus(
		int status) {

		return getPersistence().findBygetManufacturingByStatus(status);
	}

	/**
	 * Returns a range of all the manufacturing applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of matching manufacturing applications
	 */
	public static List<ManufacturingApplication> findBygetManufacturingByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetManufacturingByStatus(
			status, start, end);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing applications
	 */
	public static List<ManufacturingApplication> findBygetManufacturingByStatus(
		int status, int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return getPersistence().findBygetManufacturingByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing applications
	 */
	public static List<ManufacturingApplication> findBygetManufacturingByStatus(
		int status, int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetManufacturingByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication findBygetManufacturingByStatus_First(
			int status,
			OrderByComparator<ManufacturingApplication> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findBygetManufacturingByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication
		fetchBygetManufacturingByStatus_First(
			int status,
			OrderByComparator<ManufacturingApplication> orderByComparator) {

		return getPersistence().fetchBygetManufacturingByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication findBygetManufacturingByStatus_Last(
			int status,
			OrderByComparator<ManufacturingApplication> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findBygetManufacturingByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication fetchBygetManufacturingByStatus_Last(
		int status,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return getPersistence().fetchBygetManufacturingByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the manufacturing applications before and after the current manufacturing application in the ordered set where status = &#63;.
	 *
	 * @param manufacturingApplicationId the primary key of the current manufacturing application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	public static ManufacturingApplication[]
			findBygetManufacturingByStatus_PrevAndNext(
				long manufacturingApplicationId, int status,
				OrderByComparator<ManufacturingApplication> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findBygetManufacturingByStatus_PrevAndNext(
			manufacturingApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the manufacturing applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetManufacturingByStatus(int status) {
		getPersistence().removeBygetManufacturingByStatus(status);
	}

	/**
	 * Returns the number of manufacturing applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching manufacturing applications
	 */
	public static int countBygetManufacturingByStatus(int status) {
		return getPersistence().countBygetManufacturingByStatus(status);
	}

	/**
	 * Returns the manufacturing application where applicationNumber = &#63; or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication findBygetManufacturingByAppNum(
			String applicationNumber)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findBygetManufacturingByAppNum(
			applicationNumber);
	}

	/**
	 * Returns the manufacturing application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication fetchBygetManufacturingByAppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetManufacturingByAppNum(
			applicationNumber);
	}

	/**
	 * Returns the manufacturing application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication fetchBygetManufacturingByAppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetManufacturingByAppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the manufacturing application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the manufacturing application that was removed
	 */
	public static ManufacturingApplication removeBygetManufacturingByAppNum(
			String applicationNumber)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().removeBygetManufacturingByAppNum(
			applicationNumber);
	}

	/**
	 * Returns the number of manufacturing applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching manufacturing applications
	 */
	public static int countBygetManufacturingByAppNum(
		String applicationNumber) {

		return getPersistence().countBygetManufacturingByAppNum(
			applicationNumber);
	}

	/**
	 * Returns the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication findBygetManufacturingByRT_AppNo(
			String licenseRequest, String expiredLicenseAppNumber)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findBygetManufacturingByRT_AppNo(
			licenseRequest, expiredLicenseAppNumber);
	}

	/**
	 * Returns the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication fetchBygetManufacturingByRT_AppNo(
		String licenseRequest, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetManufacturingByRT_AppNo(
			licenseRequest, expiredLicenseAppNumber);
	}

	/**
	 * Returns the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication fetchBygetManufacturingByRT_AppNo(
		String licenseRequest, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetManufacturingByRT_AppNo(
			licenseRequest, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the manufacturing application where licenseRequest = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the manufacturing application that was removed
	 */
	public static ManufacturingApplication removeBygetManufacturingByRT_AppNo(
			String licenseRequest, String expiredLicenseAppNumber)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().removeBygetManufacturingByRT_AppNo(
			licenseRequest, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of manufacturing applications where licenseRequest = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param licenseRequest the license request
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching manufacturing applications
	 */
	public static int countBygetManufacturingByRT_AppNo(
		String licenseRequest, String expiredLicenseAppNumber) {

		return getPersistence().countBygetManufacturingByRT_AppNo(
			licenseRequest, expiredLicenseAppNumber);
	}

	/**
	 * Returns the manufacturing application where caseId = &#63; or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication findBygetManufacturingByCaseId(
			String caseId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findBygetManufacturingByCaseId(caseId);
	}

	/**
	 * Returns the manufacturing application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication fetchBygetManufacturingByCaseId(
		String caseId) {

		return getPersistence().fetchBygetManufacturingByCaseId(caseId);
	}

	/**
	 * Returns the manufacturing application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application, or <code>null</code> if a matching manufacturing application could not be found
	 */
	public static ManufacturingApplication fetchBygetManufacturingByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufacturingByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the manufacturing application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manufacturing application that was removed
	 */
	public static ManufacturingApplication removeBygetManufacturingByCaseId(
			String caseId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().removeBygetManufacturingByCaseId(caseId);
	}

	/**
	 * Returns the number of manufacturing applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing applications
	 */
	public static int countBygetManufacturingByCaseId(String caseId) {
		return getPersistence().countBygetManufacturingByCaseId(caseId);
	}

	/**
	 * Caches the manufacturing application in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplication the manufacturing application
	 */
	public static void cacheResult(
		ManufacturingApplication manufacturingApplication) {

		getPersistence().cacheResult(manufacturingApplication);
	}

	/**
	 * Caches the manufacturing applications in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplications the manufacturing applications
	 */
	public static void cacheResult(
		List<ManufacturingApplication> manufacturingApplications) {

		getPersistence().cacheResult(manufacturingApplications);
	}

	/**
	 * Creates a new manufacturing application with the primary key. Does not add the manufacturing application to the database.
	 *
	 * @param manufacturingApplicationId the primary key for the new manufacturing application
	 * @return the new manufacturing application
	 */
	public static ManufacturingApplication create(
		long manufacturingApplicationId) {

		return getPersistence().create(manufacturingApplicationId);
	}

	/**
	 * Removes the manufacturing application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application that was removed
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	public static ManufacturingApplication remove(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().remove(manufacturingApplicationId);
	}

	public static ManufacturingApplication updateImpl(
		ManufacturingApplication manufacturingApplication) {

		return getPersistence().updateImpl(manufacturingApplication);
	}

	/**
	 * Returns the manufacturing application with the primary key or throws a <code>NoSuchManufacturingApplicationException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application
	 * @throws NoSuchManufacturingApplicationException if a manufacturing application with the primary key could not be found
	 */
	public static ManufacturingApplication findByPrimaryKey(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManufacturingApplicationException {

		return getPersistence().findByPrimaryKey(manufacturingApplicationId);
	}

	/**
	 * Returns the manufacturing application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the primary key of the manufacturing application
	 * @return the manufacturing application, or <code>null</code> if a manufacturing application with the primary key could not be found
	 */
	public static ManufacturingApplication fetchByPrimaryKey(
		long manufacturingApplicationId) {

		return getPersistence().fetchByPrimaryKey(manufacturingApplicationId);
	}

	/**
	 * Returns all the manufacturing applications.
	 *
	 * @return the manufacturing applications
	 */
	public static List<ManufacturingApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @return the range of manufacturing applications
	 */
	public static List<ManufacturingApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing applications
	 */
	public static List<ManufacturingApplication> findAll(
		int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manufacturing applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing applications
	 * @param end the upper bound of the range of manufacturing applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing applications
	 */
	public static List<ManufacturingApplication> findAll(
		int start, int end,
		OrderByComparator<ManufacturingApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manufacturing applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manufacturing applications.
	 *
	 * @return the number of manufacturing applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManufacturingApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ManufacturingApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ManufacturingApplicationPersistence _persistence;

}