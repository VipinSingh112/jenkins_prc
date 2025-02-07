/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.WRAApplication;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra application service. This utility wraps <code>com.nbp.wra.application.form.service.service.persistence.impl.WRAApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationPersistence
 * @generated
 */
public class WRAApplicationUtil {

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
	public static void clearCache(WRAApplication wraApplication) {
		getPersistence().clearCache(wraApplication);
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
	public static Map<Serializable, WRAApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WRAApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WRAApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WRAApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WRAApplication update(WRAApplication wraApplication) {
		return getPersistence().update(wraApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WRAApplication update(
		WRAApplication wraApplication, ServiceContext serviceContext) {

		return getPersistence().update(wraApplication, serviceContext);
	}

	/**
	 * Returns all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId) {

		return getPersistence().findBygetWRA_ByS_U(status, userId);
	}

	/**
	 * Returns a range of all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetWRA_ByS_U(status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().findBygetWRA_ByS_U(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWRA_ByS_U(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_ByS_U_First(
			int status, long userId,
			OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_ByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_ByS_U_First(
		int status, long userId,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().fetchBygetWRA_ByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_ByS_U_Last(
			int status, long userId,
			OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_ByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_ByS_U_Last(
		int status, long userId,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().fetchBygetWRA_ByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public static WRAApplication[] findBygetWRA_ByS_U_PrevAndNext(
			long wraApplicationId, int status, long userId,
			OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_ByS_U_PrevAndNext(
			wraApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the wra applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetWRA_ByS_U(int status, long userId) {
		getPersistence().removeBygetWRA_ByS_U(status, userId);
	}

	/**
	 * Returns the number of wra applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching wra applications
	 */
	public static int countBygetWRA_ByS_U(int status, long userId) {
		return getPersistence().countBygetWRA_ByS_U(status, userId);
	}

	/**
	 * Returns the wra application where caseId = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_By_CaseId(String caseId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_CaseId(caseId);
	}

	/**
	 * Returns the wra application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_CaseId(String caseId) {
		return getPersistence().fetchBygetWRA_By_CaseId(caseId);
	}

	/**
	 * Returns the wra application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRA_By_CaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the wra application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra application that was removed
	 */
	public static WRAApplication removeBygetWRA_By_CaseId(String caseId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().removeBygetWRA_By_CaseId(caseId);
	}

	/**
	 * Returns the number of wra applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra applications
	 */
	public static int countBygetWRA_By_CaseId(String caseId) {
		return getPersistence().countBygetWRA_By_CaseId(caseId);
	}

	/**
	 * Returns all the wra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_Status(int status) {
		return getPersistence().findBygetWRA_By_Status(status);
	}

	/**
	 * Returns a range of all the wra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_Status(
		int status, int start, int end) {

		return getPersistence().findBygetWRA_By_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the wra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_Status(
		int status, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().findBygetWRA_By_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_Status(
		int status, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWRA_By_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_By_Status_First(
			int status, OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_Status_First(
		int status, OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_By_Status_Last(
			int status, OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_Status_Last(
		int status, OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where status = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public static WRAApplication[] findBygetWRA_By_Status_PrevAndNext(
			long wraApplicationId, int status,
			OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_Status_PrevAndNext(
			wraApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the wra applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetWRA_By_Status(int status) {
		getPersistence().removeBygetWRA_By_Status(status);
	}

	/**
	 * Returns the number of wra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching wra applications
	 */
	public static int countBygetWRA_By_Status(int status) {
		return getPersistence().countBygetWRA_By_Status(status);
	}

	/**
	 * Returns all the wra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_EntityId(Date entityId) {
		return getPersistence().findBygetWRA_By_EntityId(entityId);
	}

	/**
	 * Returns a range of all the wra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId, int start, int end) {

		return getPersistence().findBygetWRA_By_EntityId(entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().findBygetWRA_By_EntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWRA_By_EntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_By_EntityId_First(
			Date entityId, OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_EntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_EntityId_First(
		Date entityId, OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_EntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_By_EntityId_Last(
			Date entityId, OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_EntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_EntityId_Last(
		Date entityId, OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_EntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where entityId = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public static WRAApplication[] findBygetWRA_By_EntityId_PrevAndNext(
			long wraApplicationId, Date entityId,
			OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_EntityId_PrevAndNext(
			wraApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the wra applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetWRA_By_EntityId(Date entityId) {
		getPersistence().removeBygetWRA_By_EntityId(entityId);
	}

	/**
	 * Returns the number of wra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching wra applications
	 */
	public static int countBygetWRA_By_EntityId(Date entityId) {
		return getPersistence().countBygetWRA_By_EntityId(entityId);
	}

	/**
	 * Returns all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status) {

		return getPersistence().findBygetWRA_By_EntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status, int start, int end) {

		return getPersistence().findBygetWRA_By_EntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().findBygetWRA_By_EntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	public static List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWRA_By_EntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_By_EntityId_Status_First(
			Date entityId, int status,
			OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_EntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_EntityId_Status_First(
		Date entityId, int status,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_EntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_By_EntityId_Status_Last(
			Date entityId, int status,
			OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_EntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_EntityId_Status_Last(
		Date entityId, int status,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().fetchBygetWRA_By_EntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public static WRAApplication[] findBygetWRA_By_EntityId_Status_PrevAndNext(
			long wraApplicationId, Date entityId, int status,
			OrderByComparator<WRAApplication> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_EntityId_Status_PrevAndNext(
			wraApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the wra applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetWRA_By_EntityId_Status(
		Date entityId, int status) {

		getPersistence().removeBygetWRA_By_EntityId_Status(entityId, status);
	}

	/**
	 * Returns the number of wra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching wra applications
	 */
	public static int countBygetWRA_By_EntityId_Status(
		Date entityId, int status) {

		return getPersistence().countBygetWRA_By_EntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the wra application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRA_By_EI_CI(
			Date entityId, String caseId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRA_By_EI_CI(entityId, caseId);
	}

	/**
	 * Returns the wra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_EI_CI(
		Date entityId, String caseId) {

		return getPersistence().fetchBygetWRA_By_EI_CI(entityId, caseId);
	}

	/**
	 * Returns the wra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRA_By_EI_CI(
		Date entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetWRA_By_EI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the wra application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the wra application that was removed
	 */
	public static WRAApplication removeBygetWRA_By_EI_CI(
			Date entityId, String caseId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().removeBygetWRA_By_EI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of wra applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching wra applications
	 */
	public static int countBygetWRA_By_EI_CI(Date entityId, String caseId) {
		return getPersistence().countBygetWRA_By_EI_CI(entityId, caseId);
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWRAByAppNo(String applicationNumber)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWRAByAppNo(applicationNumber);
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRAByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetWRAByAppNo(applicationNumber);
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWRAByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetWRAByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the wra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the wra application that was removed
	 */
	public static WRAApplication removeBygetWRAByAppNo(String applicationNumber)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().removeBygetWRAByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of wra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching wra applications
	 */
	public static int countBygetWRAByAppNo(String applicationNumber) {
		return getPersistence().countBygetWRAByAppNo(applicationNumber);
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findByget_WraBy_Case_Id(
			String applicationNumber)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findByget_WraBy_Case_Id(applicationNumber);
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchByget_WraBy_Case_Id(
		String applicationNumber) {

		return getPersistence().fetchByget_WraBy_Case_Id(applicationNumber);
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchByget_WraBy_Case_Id(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchByget_WraBy_Case_Id(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the wra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the wra application that was removed
	 */
	public static WRAApplication removeByget_WraBy_Case_Id(
			String applicationNumber)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().removeByget_WraBy_Case_Id(applicationNumber);
	}

	/**
	 * Returns the number of wra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching wra applications
	 */
	public static int countByget_WraBy_Case_Id(String applicationNumber) {
		return getPersistence().countByget_WraBy_Case_Id(applicationNumber);
	}

	/**
	 * Returns the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public static WRAApplication findBygetWraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findBygetWraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetWraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public static WRAApplication fetchBygetWraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetWraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the wra application that was removed
	 */
	public static WRAApplication removeBygetWraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().removeBygetWraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of wra applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching wra applications
	 */
	public static int countBygetWraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().countBygetWraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Caches the wra application in the entity cache if it is enabled.
	 *
	 * @param wraApplication the wra application
	 */
	public static void cacheResult(WRAApplication wraApplication) {
		getPersistence().cacheResult(wraApplication);
	}

	/**
	 * Caches the wra applications in the entity cache if it is enabled.
	 *
	 * @param wraApplications the wra applications
	 */
	public static void cacheResult(List<WRAApplication> wraApplications) {
		getPersistence().cacheResult(wraApplications);
	}

	/**
	 * Creates a new wra application with the primary key. Does not add the wra application to the database.
	 *
	 * @param wraApplicationId the primary key for the new wra application
	 * @return the new wra application
	 */
	public static WRAApplication create(long wraApplicationId) {
		return getPersistence().create(wraApplicationId);
	}

	/**
	 * Removes the wra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application that was removed
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public static WRAApplication remove(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().remove(wraApplicationId);
	}

	public static WRAApplication updateImpl(WRAApplication wraApplication) {
		return getPersistence().updateImpl(wraApplication);
	}

	/**
	 * Returns the wra application with the primary key or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public static WRAApplication findByPrimaryKey(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAApplicationException {

		return getPersistence().findByPrimaryKey(wraApplicationId);
	}

	/**
	 * Returns the wra application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application, or <code>null</code> if a wra application with the primary key could not be found
	 */
	public static WRAApplication fetchByPrimaryKey(long wraApplicationId) {
		return getPersistence().fetchByPrimaryKey(wraApplicationId);
	}

	/**
	 * Returns all the wra applications.
	 *
	 * @return the wra applications
	 */
	public static List<WRAApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of wra applications
	 */
	public static List<WRAApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra applications
	 */
	public static List<WRAApplication> findAll(
		int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra applications
	 */
	public static List<WRAApplication> findAll(
		int start, int end, OrderByComparator<WRAApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra applications.
	 *
	 * @return the number of wra applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WRAApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(WRAApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile WRAApplicationPersistence _persistence;

}