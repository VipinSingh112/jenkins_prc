/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.OsiApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi application service. This utility wraps <code>com.nbp.osi.application.form.services.service.persistence.impl.OsiApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationPersistence
 * @generated
 */
public class OsiApplicationUtil {

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
	public static void clearCache(OsiApplication osiApplication) {
		getPersistence().clearCache(osiApplication);
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
	public static Map<Serializable, OsiApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiApplication update(OsiApplication osiApplication) {
		return getPersistence().update(osiApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiApplication update(
		OsiApplication osiApplication, ServiceContext serviceContext) {

		return getPersistence().update(osiApplication, serviceContext);
	}

	/**
	 * Returns all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByS_U(
		long userId, int status) {

		return getPersistence().findBygetOsiByS_U(userId, status);
	}

	/**
	 * Returns a range of all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetOsiByS_U(userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().findBygetOsiByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByS_U_First(
			long userId, int status,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByS_U_First(
		long userId, int status,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByS_U_Last(
			long userId, int status,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByS_U_Last(
		long userId, int status,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public static OsiApplication[] findBygetOsiByS_U_PrevAndNext(
			long osiApplicationId, long userId, int status,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByS_U_PrevAndNext(
			osiApplicationId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the osi applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetOsiByS_U(long userId, int status) {
		getPersistence().removeBygetOsiByS_U(userId, status);
	}

	/**
	 * Returns the number of osi applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching osi applications
	 */
	public static int countBygetOsiByS_U(long userId, int status) {
		return getPersistence().countBygetOsiByS_U(userId, status);
	}

	/**
	 * Returns all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @return the matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus) {

		return getPersistence().findBygetOsiByStatus_UserId(
			userId, applicationStatus);
	}

	/**
	 * Returns a range of all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus, int start, int end) {

		return getPersistence().findBygetOsiByStatus_UserId(
			userId, applicationStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().findBygetOsiByStatus_UserId(
			userId, applicationStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiByStatus_UserId(
			userId, applicationStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByStatus_UserId_First(
			long userId, int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByStatus_UserId_First(
			userId, applicationStatus, orderByComparator);
	}

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByStatus_UserId_First(
		long userId, int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByStatus_UserId_First(
			userId, applicationStatus, orderByComparator);
	}

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByStatus_UserId_Last(
			long userId, int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByStatus_UserId_Last(
			userId, applicationStatus, orderByComparator);
	}

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByStatus_UserId_Last(
		long userId, int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByStatus_UserId_Last(
			userId, applicationStatus, orderByComparator);
	}

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public static OsiApplication[] findBygetOsiByStatus_UserId_PrevAndNext(
			long osiApplicationId, long userId, int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByStatus_UserId_PrevAndNext(
			osiApplicationId, userId, applicationStatus, orderByComparator);
	}

	/**
	 * Removes all the osi applications where userId = &#63; and applicationStatus = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 */
	public static void removeBygetOsiByStatus_UserId(
		long userId, int applicationStatus) {

		getPersistence().removeBygetOsiByStatus_UserId(
			userId, applicationStatus);
	}

	/**
	 * Returns the number of osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @return the number of matching osi applications
	 */
	public static int countBygetOsiByStatus_UserId(
		long userId, int applicationStatus) {

		return getPersistence().countBygetOsiByStatus_UserId(
			userId, applicationStatus);
	}

	/**
	 * Returns all the osi applications where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @return the matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus) {

		return getPersistence().findBygetOsiByAppStatus(applicationStatus);
	}

	/**
	 * Returns a range of all the osi applications where applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus, int start, int end) {

		return getPersistence().findBygetOsiByAppStatus(
			applicationStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the osi applications where applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().findBygetOsiByAppStatus(
			applicationStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi applications where applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiByAppStatus(
			applicationStatus, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByAppStatus_First(
			int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByAppStatus_First(
			applicationStatus, orderByComparator);
	}

	/**
	 * Returns the first osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByAppStatus_First(
		int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByAppStatus_First(
			applicationStatus, orderByComparator);
	}

	/**
	 * Returns the last osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByAppStatus_Last(
			int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByAppStatus_Last(
			applicationStatus, orderByComparator);
	}

	/**
	 * Returns the last osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByAppStatus_Last(
		int applicationStatus,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByAppStatus_Last(
			applicationStatus, orderByComparator);
	}

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public static OsiApplication[] findBygetOsiByAppStatus_PrevAndNext(
			long osiApplicationId, int applicationStatus,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByAppStatus_PrevAndNext(
			osiApplicationId, applicationStatus, orderByComparator);
	}

	/**
	 * Removes all the osi applications where applicationStatus = &#63; from the database.
	 *
	 * @param applicationStatus the application status
	 */
	public static void removeBygetOsiByAppStatus(int applicationStatus) {
		getPersistence().removeBygetOsiByAppStatus(applicationStatus);
	}

	/**
	 * Returns the number of osi applications where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @return the number of matching osi applications
	 */
	public static int countBygetOsiByAppStatus(int applicationStatus) {
		return getPersistence().countBygetOsiByAppStatus(applicationStatus);
	}

	/**
	 * Returns all the osi applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByStatus(int status) {
		return getPersistence().findBygetOsiByStatus(status);
	}

	/**
	 * Returns a range of all the osi applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetOsiByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the osi applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByStatus(
		int status, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().findBygetOsiByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	public static List<OsiApplication> findBygetOsiByStatus(
		int status, int start, int end,
		OrderByComparator<OsiApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByStatus_First(
			int status, OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByStatus_First(
		int status, OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByStatus_Last(
			int status, OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByStatus_Last(
		int status, OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where status = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public static OsiApplication[] findBygetOsiByStatus_PrevAndNext(
			long osiApplicationId, int status,
			OrderByComparator<OsiApplication> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByStatus_PrevAndNext(
			osiApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the osi applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetOsiByStatus(int status) {
		getPersistence().removeBygetOsiByStatus(status);
	}

	/**
	 * Returns the number of osi applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi applications
	 */
	public static int countBygetOsiByStatus(int status) {
		return getPersistence().countBygetOsiByStatus(status);
	}

	/**
	 * Returns the osi application where applicationNumber = &#63; or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByAppNum(String applicationNumber)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByAppNum(applicationNumber);
	}

	/**
	 * Returns the osi application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByAppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetOsiByAppNum(applicationNumber);
	}

	/**
	 * Returns the osi application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByAppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiByAppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the osi application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the osi application that was removed
	 */
	public static OsiApplication removeBygetOsiByAppNum(
			String applicationNumber)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().removeBygetOsiByAppNum(applicationNumber);
	}

	/**
	 * Returns the number of osi applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching osi applications
	 */
	public static int countBygetOsiByAppNum(String applicationNumber) {
		return getPersistence().countBygetOsiByAppNum(applicationNumber);
	}

	/**
	 * Returns the osi application where caseId = &#63; or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByCaseId(String caseId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByCaseId(caseId);
	}

	/**
	 * Returns the osi application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByCaseId(String caseId) {
		return getPersistence().fetchBygetOsiByCaseId(caseId);
	}

	/**
	 * Returns the osi application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the osi application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi application that was removed
	 */
	public static OsiApplication removeBygetOsiByCaseId(String caseId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().removeBygetOsiByCaseId(caseId);
	}

	/**
	 * Returns the number of osi applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi applications
	 */
	public static int countBygetOsiByCaseId(String caseId) {
		return getPersistence().countBygetOsiByCaseId(caseId);
	}

	/**
	 * Returns the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public static OsiApplication findBygetOsiByAT_AppNo(
			String applicationType, String expiredLicenseAppNumber)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findBygetOsiByAT_AppNo(
			applicationType, expiredLicenseAppNumber);
	}

	/**
	 * Returns the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByAT_AppNo(
		String applicationType, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetOsiByAT_AppNo(
			applicationType, expiredLicenseAppNumber);
	}

	/**
	 * Returns the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public static OsiApplication fetchBygetOsiByAT_AppNo(
		String applicationType, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetOsiByAT_AppNo(
			applicationType, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the osi application that was removed
	 */
	public static OsiApplication removeBygetOsiByAT_AppNo(
			String applicationType, String expiredLicenseAppNumber)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().removeBygetOsiByAT_AppNo(
			applicationType, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of osi applications where applicationType = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching osi applications
	 */
	public static int countBygetOsiByAT_AppNo(
		String applicationType, String expiredLicenseAppNumber) {

		return getPersistence().countBygetOsiByAT_AppNo(
			applicationType, expiredLicenseAppNumber);
	}

	/**
	 * Caches the osi application in the entity cache if it is enabled.
	 *
	 * @param osiApplication the osi application
	 */
	public static void cacheResult(OsiApplication osiApplication) {
		getPersistence().cacheResult(osiApplication);
	}

	/**
	 * Caches the osi applications in the entity cache if it is enabled.
	 *
	 * @param osiApplications the osi applications
	 */
	public static void cacheResult(List<OsiApplication> osiApplications) {
		getPersistence().cacheResult(osiApplications);
	}

	/**
	 * Creates a new osi application with the primary key. Does not add the osi application to the database.
	 *
	 * @param osiApplicationId the primary key for the new osi application
	 * @return the new osi application
	 */
	public static OsiApplication create(long osiApplicationId) {
		return getPersistence().create(osiApplicationId);
	}

	/**
	 * Removes the osi application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application that was removed
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public static OsiApplication remove(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().remove(osiApplicationId);
	}

	public static OsiApplication updateImpl(OsiApplication osiApplication) {
		return getPersistence().updateImpl(osiApplication);
	}

	/**
	 * Returns the osi application with the primary key or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public static OsiApplication findByPrimaryKey(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiApplicationException {

		return getPersistence().findByPrimaryKey(osiApplicationId);
	}

	/**
	 * Returns the osi application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application, or <code>null</code> if a osi application with the primary key could not be found
	 */
	public static OsiApplication fetchByPrimaryKey(long osiApplicationId) {
		return getPersistence().fetchByPrimaryKey(osiApplicationId);
	}

	/**
	 * Returns all the osi applications.
	 *
	 * @return the osi applications
	 */
	public static List<OsiApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of osi applications
	 */
	public static List<OsiApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi applications
	 */
	public static List<OsiApplication> findAll(
		int start, int end,
		OrderByComparator<OsiApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi applications
	 */
	public static List<OsiApplication> findAll(
		int start, int end, OrderByComparator<OsiApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi applications.
	 *
	 * @return the number of osi applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(OsiApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile OsiApplicationPersistence _persistence;

}