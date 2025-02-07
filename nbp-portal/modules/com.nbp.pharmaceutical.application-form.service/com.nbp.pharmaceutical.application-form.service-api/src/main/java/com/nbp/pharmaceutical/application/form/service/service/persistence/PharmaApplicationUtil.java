/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma application service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationPersistence
 * @generated
 */
public class PharmaApplicationUtil {

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
	public static void clearCache(PharmaApplication pharmaApplication) {
		getPersistence().clearCache(pharmaApplication);
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
	public static Map<Serializable, PharmaApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaApplication update(
		PharmaApplication pharmaApplication) {

		return getPersistence().update(pharmaApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaApplication update(
		PharmaApplication pharmaApplication, ServiceContext serviceContext) {

		return getPersistence().update(pharmaApplication, serviceContext);
	}

	/**
	 * Returns the pharma application where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public static PharmaApplication findBygetPharmaByAppId(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByAppId(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetPharmaByAppId(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma application where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application that was removed
	 */
	public static PharmaApplication removeBygetPharmaByAppId(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().removeBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma applications where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma applications
	 */
	public static int countBygetPharmaByAppId(long pharmaApplicationId) {
		return getPersistence().countBygetPharmaByAppId(pharmaApplicationId);
	}

	/**
	 * Returns all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching pharma applications
	 */
	public static List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId) {

		return getPersistence().findBygetPharmaByStatusUser(status, userId);
	}

	/**
	 * Returns a range of all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of matching pharma applications
	 */
	public static List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetPharmaByStatusUser(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma applications
	 */
	public static List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator) {

		return getPersistence().findBygetPharmaByStatusUser(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma applications
	 */
	public static List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPharmaByStatusUser(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public static PharmaApplication findBygetPharmaByStatusUser_First(
			int status, long userId,
			OrderByComparator<PharmaApplication> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBygetPharmaByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByStatusUser_First(
		int status, long userId,
		OrderByComparator<PharmaApplication> orderByComparator) {

		return getPersistence().fetchBygetPharmaByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public static PharmaApplication findBygetPharmaByStatusUser_Last(
			int status, long userId,
			OrderByComparator<PharmaApplication> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBygetPharmaByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByStatusUser_Last(
		int status, long userId,
		OrderByComparator<PharmaApplication> orderByComparator) {

		return getPersistence().fetchBygetPharmaByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the pharma applications before and after the current pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param pharmaApplicationId the primary key of the current pharma application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	public static PharmaApplication[] findBygetPharmaByStatusUser_PrevAndNext(
			long pharmaApplicationId, int status, long userId,
			OrderByComparator<PharmaApplication> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBygetPharmaByStatusUser_PrevAndNext(
			pharmaApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the pharma applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetPharmaByStatusUser(int status, long userId) {
		getPersistence().removeBygetPharmaByStatusUser(status, userId);
	}

	/**
	 * Returns the number of pharma applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching pharma applications
	 */
	public static int countBygetPharmaByStatusUser(int status, long userId) {
		return getPersistence().countBygetPharmaByStatusUser(status, userId);
	}

	/**
	 * Returns all the pharma applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching pharma applications
	 */
	public static List<PharmaApplication> findBygetPharmaByStatus(int status) {
		return getPersistence().findBygetPharmaByStatus(status);
	}

	/**
	 * Returns a range of all the pharma applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of matching pharma applications
	 */
	public static List<PharmaApplication> findBygetPharmaByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetPharmaByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma applications
	 */
	public static List<PharmaApplication> findBygetPharmaByStatus(
		int status, int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator) {

		return getPersistence().findBygetPharmaByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma applications
	 */
	public static List<PharmaApplication> findBygetPharmaByStatus(
		int status, int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPharmaByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public static PharmaApplication findBygetPharmaByStatus_First(
			int status, OrderByComparator<PharmaApplication> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBygetPharmaByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByStatus_First(
		int status, OrderByComparator<PharmaApplication> orderByComparator) {

		return getPersistence().fetchBygetPharmaByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public static PharmaApplication findBygetPharmaByStatus_Last(
			int status, OrderByComparator<PharmaApplication> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBygetPharmaByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByStatus_Last(
		int status, OrderByComparator<PharmaApplication> orderByComparator) {

		return getPersistence().fetchBygetPharmaByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the pharma applications before and after the current pharma application in the ordered set where status = &#63;.
	 *
	 * @param pharmaApplicationId the primary key of the current pharma application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	public static PharmaApplication[] findBygetPharmaByStatus_PrevAndNext(
			long pharmaApplicationId, int status,
			OrderByComparator<PharmaApplication> orderByComparator)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBygetPharmaByStatus_PrevAndNext(
			pharmaApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the pharma applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetPharmaByStatus(int status) {
		getPersistence().removeBygetPharmaByStatus(status);
	}

	/**
	 * Returns the number of pharma applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching pharma applications
	 */
	public static int countBygetPharmaByStatus(int status) {
		return getPersistence().countBygetPharmaByStatus(status);
	}

	/**
	 * Returns the pharma application where applicationNumber = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public static PharmaApplication findBygetPharmaByAppNum(
			String applicationNumber)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBygetPharmaByAppNum(applicationNumber);
	}

	/**
	 * Returns the pharma application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByAppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetPharmaByAppNum(applicationNumber);
	}

	/**
	 * Returns the pharma application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByAppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetPharmaByAppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the pharma application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the pharma application that was removed
	 */
	public static PharmaApplication removeBygetPharmaByAppNum(
			String applicationNumber)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().removeBygetPharmaByAppNum(applicationNumber);
	}

	/**
	 * Returns the number of pharma applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching pharma applications
	 */
	public static int countBygetPharmaByAppNum(String applicationNumber) {
		return getPersistence().countBygetPharmaByAppNum(applicationNumber);
	}

	/**
	 * Returns the pharma application where caseld = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param caseld the caseld
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public static PharmaApplication findBypharmaApplicationByCaseId(
			String caseld)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBypharmaApplicationByCaseId(caseld);
	}

	/**
	 * Returns the pharma application where caseld = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseld the caseld
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBypharmaApplicationByCaseId(
		String caseld) {

		return getPersistence().fetchBypharmaApplicationByCaseId(caseld);
	}

	/**
	 * Returns the pharma application where caseld = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseld the caseld
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBypharmaApplicationByCaseId(
		String caseld, boolean useFinderCache) {

		return getPersistence().fetchBypharmaApplicationByCaseId(
			caseld, useFinderCache);
	}

	/**
	 * Removes the pharma application where caseld = &#63; from the database.
	 *
	 * @param caseld the caseld
	 * @return the pharma application that was removed
	 */
	public static PharmaApplication removeBypharmaApplicationByCaseId(
			String caseld)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().removeBypharmaApplicationByCaseId(caseld);
	}

	/**
	 * Returns the number of pharma applications where caseld = &#63;.
	 *
	 * @param caseld the caseld
	 * @return the number of matching pharma applications
	 */
	public static int countBypharmaApplicationByCaseId(String caseld) {
		return getPersistence().countBypharmaApplicationByCaseId(caseld);
	}

	/**
	 * Returns the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public static PharmaApplication findBygetPharmaByAT_AppNo(
			String requesttype, String expiredLicenseAppNumber)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findBygetPharmaByAT_AppNo(
			requesttype, expiredLicenseAppNumber);
	}

	/**
	 * Returns the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByAT_AppNo(
		String requesttype, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetPharmaByAT_AppNo(
			requesttype, expiredLicenseAppNumber);
	}

	/**
	 * Returns the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public static PharmaApplication fetchBygetPharmaByAT_AppNo(
		String requesttype, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetPharmaByAT_AppNo(
			requesttype, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the pharma application that was removed
	 */
	public static PharmaApplication removeBygetPharmaByAT_AppNo(
			String requesttype, String expiredLicenseAppNumber)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().removeBygetPharmaByAT_AppNo(
			requesttype, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of pharma applications where requesttype = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching pharma applications
	 */
	public static int countBygetPharmaByAT_AppNo(
		String requesttype, String expiredLicenseAppNumber) {

		return getPersistence().countBygetPharmaByAT_AppNo(
			requesttype, expiredLicenseAppNumber);
	}

	/**
	 * Caches the pharma application in the entity cache if it is enabled.
	 *
	 * @param pharmaApplication the pharma application
	 */
	public static void cacheResult(PharmaApplication pharmaApplication) {
		getPersistence().cacheResult(pharmaApplication);
	}

	/**
	 * Caches the pharma applications in the entity cache if it is enabled.
	 *
	 * @param pharmaApplications the pharma applications
	 */
	public static void cacheResult(List<PharmaApplication> pharmaApplications) {
		getPersistence().cacheResult(pharmaApplications);
	}

	/**
	 * Creates a new pharma application with the primary key. Does not add the pharma application to the database.
	 *
	 * @param pharmaApplicationId the primary key for the new pharma application
	 * @return the new pharma application
	 */
	public static PharmaApplication create(long pharmaApplicationId) {
		return getPersistence().create(pharmaApplicationId);
	}

	/**
	 * Removes the pharma application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application that was removed
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	public static PharmaApplication remove(long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().remove(pharmaApplicationId);
	}

	public static PharmaApplication updateImpl(
		PharmaApplication pharmaApplication) {

		return getPersistence().updateImpl(pharmaApplication);
	}

	/**
	 * Returns the pharma application with the primary key or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	public static PharmaApplication findByPrimaryKey(long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getPersistence().findByPrimaryKey(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application, or <code>null</code> if a pharma application with the primary key could not be found
	 */
	public static PharmaApplication fetchByPrimaryKey(
		long pharmaApplicationId) {

		return getPersistence().fetchByPrimaryKey(pharmaApplicationId);
	}

	/**
	 * Returns all the pharma applications.
	 *
	 * @return the pharma applications
	 */
	public static List<PharmaApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of pharma applications
	 */
	public static List<PharmaApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma applications
	 */
	public static List<PharmaApplication> findAll(
		int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma applications
	 */
	public static List<PharmaApplication> findAll(
		int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma applications.
	 *
	 * @return the number of pharma applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaApplicationPersistence _persistence;

}