/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care application service. This utility wraps <code>com.nbp.healthcare.application.form.service.service.persistence.impl.HealthCareApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationPersistence
 * @generated
 */
public class HealthCareApplicationUtil {

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
	public static void clearCache(HealthCareApplication healthCareApplication) {
		getPersistence().clearCache(healthCareApplication);
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
	public static Map<Serializable, HealthCareApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCareApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCareApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCareApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCareApplication update(
		HealthCareApplication healthCareApplication) {

		return getPersistence().update(healthCareApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCareApplication update(
		HealthCareApplication healthCareApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(healthCareApplication, serviceContext);
	}

	/**
	 * Returns the health care application where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public static HealthCareApplication findBygetHealthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care application where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareById(
		long healthCareApplicationId) {

		return getPersistence().fetchBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care application where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareById(
			healthCareApplicationId, useFinderCache);
	}

	/**
	 * Removes the health care application where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care application that was removed
	 */
	public static HealthCareApplication removeBygetHealthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().removeBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the number of health care applications where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care applications
	 */
	public static int countBygetHealthCareById(long healthCareApplicationId) {
		return getPersistence().countBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching health care applications
	 */
	public static List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId) {

		return getPersistence().findBygetHealthCareByS_U(status, userId);
	}

	/**
	 * Returns a range of all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of matching health care applications
	 */
	public static List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetHealthCareByS_U(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health care applications
	 */
	public static List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return getPersistence().findBygetHealthCareByS_U(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health care applications
	 */
	public static List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHealthCareByS_U(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public static HealthCareApplication findBygetHealthCareByS_U_First(
			int status, long userId,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findBygetHealthCareByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareByS_U_First(
		int status, long userId,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return getPersistence().fetchBygetHealthCareByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public static HealthCareApplication findBygetHealthCareByS_U_Last(
			int status, long userId,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findBygetHealthCareByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareByS_U_Last(
		int status, long userId,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return getPersistence().fetchBygetHealthCareByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the health care applications before and after the current health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param healthCareApplicationId the primary key of the current health care application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	public static HealthCareApplication[] findBygetHealthCareByS_U_PrevAndNext(
			long healthCareApplicationId, int status, long userId,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findBygetHealthCareByS_U_PrevAndNext(
			healthCareApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the health care applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetHealthCareByS_U(int status, long userId) {
		getPersistence().removeBygetHealthCareByS_U(status, userId);
	}

	/**
	 * Returns the number of health care applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching health care applications
	 */
	public static int countBygetHealthCareByS_U(int status, long userId) {
		return getPersistence().countBygetHealthCareByS_U(status, userId);
	}

	/**
	 * Returns the health care application where applicationNumber = &#63; or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public static HealthCareApplication findBygetHealthCareByAppNo(
			String applicationNumber)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findBygetHealthCareByAppNo(applicationNumber);
	}

	/**
	 * Returns the health care application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetHealthCareByAppNo(applicationNumber);
	}

	/**
	 * Returns the health care application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the health care application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the health care application that was removed
	 */
	public static HealthCareApplication removeBygetHealthCareByAppNo(
			String applicationNumber)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().removeBygetHealthCareByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of health care applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching health care applications
	 */
	public static int countBygetHealthCareByAppNo(String applicationNumber) {
		return getPersistence().countBygetHealthCareByAppNo(applicationNumber);
	}

	/**
	 * Returns all the health care applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching health care applications
	 */
	public static List<HealthCareApplication> findBygetHealthCareByStatus(
		int status) {

		return getPersistence().findBygetHealthCareByStatus(status);
	}

	/**
	 * Returns a range of all the health care applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of matching health care applications
	 */
	public static List<HealthCareApplication> findBygetHealthCareByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetHealthCareByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the health care applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health care applications
	 */
	public static List<HealthCareApplication> findBygetHealthCareByStatus(
		int status, int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return getPersistence().findBygetHealthCareByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health care applications
	 */
	public static List<HealthCareApplication> findBygetHealthCareByStatus(
		int status, int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHealthCareByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public static HealthCareApplication findBygetHealthCareByStatus_First(
			int status,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findBygetHealthCareByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareByStatus_First(
		int status,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return getPersistence().fetchBygetHealthCareByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public static HealthCareApplication findBygetHealthCareByStatus_Last(
			int status,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findBygetHealthCareByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareByStatus_Last(
		int status,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return getPersistence().fetchBygetHealthCareByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the health care applications before and after the current health care application in the ordered set where status = &#63;.
	 *
	 * @param healthCareApplicationId the primary key of the current health care application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	public static HealthCareApplication[]
			findBygetHealthCareByStatus_PrevAndNext(
				long healthCareApplicationId, int status,
				OrderByComparator<HealthCareApplication> orderByComparator)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findBygetHealthCareByStatus_PrevAndNext(
			healthCareApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the health care applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetHealthCareByStatus(int status) {
		getPersistence().removeBygetHealthCareByStatus(status);
	}

	/**
	 * Returns the number of health care applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching health care applications
	 */
	public static int countBygetHealthCareByStatus(int status) {
		return getPersistence().countBygetHealthCareByStatus(status);
	}

	/**
	 * Returns the health care application where caseId = &#63; or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public static HealthCareApplication findBygetHealthCareByCaseId(
			String caseId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findBygetHealthCareByCaseId(caseId);
	}

	/**
	 * Returns the health care application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareByCaseId(
		String caseId) {

		return getPersistence().fetchBygetHealthCareByCaseId(caseId);
	}

	/**
	 * Returns the health care application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public static HealthCareApplication fetchBygetHealthCareByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the health care application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the health care application that was removed
	 */
	public static HealthCareApplication removeBygetHealthCareByCaseId(
			String caseId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().removeBygetHealthCareByCaseId(caseId);
	}

	/**
	 * Returns the number of health care applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health care applications
	 */
	public static int countBygetHealthCareByCaseId(String caseId) {
		return getPersistence().countBygetHealthCareByCaseId(caseId);
	}

	/**
	 * Caches the health care application in the entity cache if it is enabled.
	 *
	 * @param healthCareApplication the health care application
	 */
	public static void cacheResult(
		HealthCareApplication healthCareApplication) {

		getPersistence().cacheResult(healthCareApplication);
	}

	/**
	 * Caches the health care applications in the entity cache if it is enabled.
	 *
	 * @param healthCareApplications the health care applications
	 */
	public static void cacheResult(
		List<HealthCareApplication> healthCareApplications) {

		getPersistence().cacheResult(healthCareApplications);
	}

	/**
	 * Creates a new health care application with the primary key. Does not add the health care application to the database.
	 *
	 * @param healthCareApplicationId the primary key for the new health care application
	 * @return the new health care application
	 */
	public static HealthCareApplication create(long healthCareApplicationId) {
		return getPersistence().create(healthCareApplicationId);
	}

	/**
	 * Removes the health care application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application that was removed
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	public static HealthCareApplication remove(long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().remove(healthCareApplicationId);
	}

	public static HealthCareApplication updateImpl(
		HealthCareApplication healthCareApplication) {

		return getPersistence().updateImpl(healthCareApplication);
	}

	/**
	 * Returns the health care application with the primary key or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	public static HealthCareApplication findByPrimaryKey(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareApplicationException {

		return getPersistence().findByPrimaryKey(healthCareApplicationId);
	}

	/**
	 * Returns the health care application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application, or <code>null</code> if a health care application with the primary key could not be found
	 */
	public static HealthCareApplication fetchByPrimaryKey(
		long healthCareApplicationId) {

		return getPersistence().fetchByPrimaryKey(healthCareApplicationId);
	}

	/**
	 * Returns all the health care applications.
	 *
	 * @return the health care applications
	 */
	public static List<HealthCareApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of health care applications
	 */
	public static List<HealthCareApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care applications
	 */
	public static List<HealthCareApplication> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care applications
	 */
	public static List<HealthCareApplication> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care applications.
	 *
	 * @return the number of health care applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCareApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthCareApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthCareApplicationPersistence _persistence;

}