/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism application service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationPersistence
 * @generated
 */
public class TourismApplicationUtil {

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
	public static void clearCache(TourismApplication tourismApplication) {
		getPersistence().clearCache(tourismApplication);
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
	public static Map<Serializable, TourismApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismApplication update(
		TourismApplication tourismApplication) {

		return getPersistence().update(tourismApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismApplication update(
		TourismApplication tourismApplication, ServiceContext serviceContext) {

		return getPersistence().update(tourismApplication, serviceContext);
	}

	/**
	 * Returns the tourism application where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public static TourismApplication findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism application where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism application where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism application where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application that was removed
	 */
	public static TourismApplication removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism applications where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism applications
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching tourism applications
	 */
	public static List<TourismApplication>
		findBygetTourismApplicationByStatusUser(int status, long userId) {

		return getPersistence().findBygetTourismApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns a range of all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of matching tourism applications
	 */
	public static List<TourismApplication>
		findBygetTourismApplicationByStatusUser(
			int status, long userId, int start, int end) {

		return getPersistence().findBygetTourismApplicationByStatusUser(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism applications
	 */
	public static List<TourismApplication>
		findBygetTourismApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<TourismApplication> orderByComparator) {

		return getPersistence().findBygetTourismApplicationByStatusUser(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism applications
	 */
	public static List<TourismApplication>
		findBygetTourismApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<TourismApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetTourismApplicationByStatusUser(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public static TourismApplication
			findBygetTourismApplicationByStatusUser_First(
				int status, long userId,
				OrderByComparator<TourismApplication> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().findBygetTourismApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication
		fetchBygetTourismApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<TourismApplication> orderByComparator) {

		return getPersistence().fetchBygetTourismApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public static TourismApplication
			findBygetTourismApplicationByStatusUser_Last(
				int status, long userId,
				OrderByComparator<TourismApplication> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().findBygetTourismApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication
		fetchBygetTourismApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<TourismApplication> orderByComparator) {

		return getPersistence().fetchBygetTourismApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the tourism applications before and after the current tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param tourismApplicationId the primary key of the current tourism application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	public static TourismApplication[]
			findBygetTourismApplicationByStatusUser_PrevAndNext(
				long tourismApplicationId, int status, long userId,
				OrderByComparator<TourismApplication> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().
			findBygetTourismApplicationByStatusUser_PrevAndNext(
				tourismApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the tourism applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetTourismApplicationByStatusUser(
		int status, long userId) {

		getPersistence().removeBygetTourismApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns the number of tourism applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching tourism applications
	 */
	public static int countBygetTourismApplicationByStatusUser(
		int status, long userId) {

		return getPersistence().countBygetTourismApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns all the tourism applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching tourism applications
	 */
	public static List<TourismApplication> findBygetTourismByStatus(
		int status) {

		return getPersistence().findBygetTourismByStatus(status);
	}

	/**
	 * Returns a range of all the tourism applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of matching tourism applications
	 */
	public static List<TourismApplication> findBygetTourismByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetTourismByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism applications
	 */
	public static List<TourismApplication> findBygetTourismByStatus(
		int status, int start, int end,
		OrderByComparator<TourismApplication> orderByComparator) {

		return getPersistence().findBygetTourismByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism applications
	 */
	public static List<TourismApplication> findBygetTourismByStatus(
		int status, int start, int end,
		OrderByComparator<TourismApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetTourismByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public static TourismApplication findBygetTourismByStatus_First(
			int status, OrderByComparator<TourismApplication> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().findBygetTourismByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication fetchBygetTourismByStatus_First(
		int status, OrderByComparator<TourismApplication> orderByComparator) {

		return getPersistence().fetchBygetTourismByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public static TourismApplication findBygetTourismByStatus_Last(
			int status, OrderByComparator<TourismApplication> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().findBygetTourismByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication fetchBygetTourismByStatus_Last(
		int status, OrderByComparator<TourismApplication> orderByComparator) {

		return getPersistence().fetchBygetTourismByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the tourism applications before and after the current tourism application in the ordered set where status = &#63;.
	 *
	 * @param tourismApplicationId the primary key of the current tourism application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	public static TourismApplication[] findBygetTourismByStatus_PrevAndNext(
			long tourismApplicationId, int status,
			OrderByComparator<TourismApplication> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().findBygetTourismByStatus_PrevAndNext(
			tourismApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the tourism applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetTourismByStatus(int status) {
		getPersistence().removeBygetTourismByStatus(status);
	}

	/**
	 * Returns the number of tourism applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching tourism applications
	 */
	public static int countBygetTourismByStatus(int status) {
		return getPersistence().countBygetTourismByStatus(status);
	}

	/**
	 * Returns the tourism application where applicationNumber = &#63; or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public static TourismApplication findBygetTourismByAppNo(
			String applicationNumber)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().findBygetTourismByAppNo(applicationNumber);
	}

	/**
	 * Returns the tourism application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication fetchBygetTourismByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetTourismByAppNo(applicationNumber);
	}

	/**
	 * Returns the tourism application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication fetchBygetTourismByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the tourism application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the tourism application that was removed
	 */
	public static TourismApplication removeBygetTourismByAppNo(
			String applicationNumber)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().removeBygetTourismByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of tourism applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching tourism applications
	 */
	public static int countBygetTourismByAppNo(String applicationNumber) {
		return getPersistence().countBygetTourismByAppNo(applicationNumber);
	}

	/**
	 * Returns the tourism application where caseId = &#63; or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public static TourismApplication findBygetTourismByCaseId(String caseId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().findBygetTourismByCaseId(caseId);
	}

	/**
	 * Returns the tourism application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication fetchBygetTourismByCaseId(String caseId) {
		return getPersistence().fetchBygetTourismByCaseId(caseId);
	}

	/**
	 * Returns the tourism application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public static TourismApplication fetchBygetTourismByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the tourism application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the tourism application that was removed
	 */
	public static TourismApplication removeBygetTourismByCaseId(String caseId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().removeBygetTourismByCaseId(caseId);
	}

	/**
	 * Returns the number of tourism applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism applications
	 */
	public static int countBygetTourismByCaseId(String caseId) {
		return getPersistence().countBygetTourismByCaseId(caseId);
	}

	/**
	 * Caches the tourism application in the entity cache if it is enabled.
	 *
	 * @param tourismApplication the tourism application
	 */
	public static void cacheResult(TourismApplication tourismApplication) {
		getPersistence().cacheResult(tourismApplication);
	}

	/**
	 * Caches the tourism applications in the entity cache if it is enabled.
	 *
	 * @param tourismApplications the tourism applications
	 */
	public static void cacheResult(
		List<TourismApplication> tourismApplications) {

		getPersistence().cacheResult(tourismApplications);
	}

	/**
	 * Creates a new tourism application with the primary key. Does not add the tourism application to the database.
	 *
	 * @param tourismApplicationId the primary key for the new tourism application
	 * @return the new tourism application
	 */
	public static TourismApplication create(long tourismApplicationId) {
		return getPersistence().create(tourismApplicationId);
	}

	/**
	 * Removes the tourism application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application that was removed
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	public static TourismApplication remove(long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().remove(tourismApplicationId);
	}

	public static TourismApplication updateImpl(
		TourismApplication tourismApplication) {

		return getPersistence().updateImpl(tourismApplication);
	}

	/**
	 * Returns the tourism application with the primary key or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	public static TourismApplication findByPrimaryKey(long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationException {

		return getPersistence().findByPrimaryKey(tourismApplicationId);
	}

	/**
	 * Returns the tourism application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application, or <code>null</code> if a tourism application with the primary key could not be found
	 */
	public static TourismApplication fetchByPrimaryKey(
		long tourismApplicationId) {

		return getPersistence().fetchByPrimaryKey(tourismApplicationId);
	}

	/**
	 * Returns all the tourism applications.
	 *
	 * @return the tourism applications
	 */
	public static List<TourismApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of tourism applications
	 */
	public static List<TourismApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism applications
	 */
	public static List<TourismApplication> findAll(
		int start, int end,
		OrderByComparator<TourismApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism applications
	 */
	public static List<TourismApplication> findAll(
		int start, int end,
		OrderByComparator<TourismApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism applications.
	 *
	 * @return the number of tourism applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismApplicationPersistence _persistence;

}