/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezStatusApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status application service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezStatusApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationPersistence
 * @generated
 */
public class SezStatusApplicationUtil {

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
	public static void clearCache(SezStatusApplication sezStatusApplication) {
		getPersistence().clearCache(sezStatusApplication);
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
	public static Map<Serializable, SezStatusApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusApplication update(
		SezStatusApplication sezStatusApplication) {

		return getPersistence().update(sezStatusApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusApplication update(
		SezStatusApplication sezStatusApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(sezStatusApplication, serviceContext);
	}

	/**
	 * Returns all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId) {

		return getPersistence().findBygetSezByS_U(status, userId);
	}

	/**
	 * Returns a range of all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetSezByS_U(status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().findBygetSezByS_U(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezByS_U(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezByS_U_First(
			int status, long userId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezByS_U_First(
		int status, long userId,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSezByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezByS_U_Last(
			int status, long userId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezByS_U_Last(
		int status, long userId,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSezByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication[] findBygetSezByS_U_PrevAndNext(
			long sezStatusApplicationId, int status, long userId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezByS_U_PrevAndNext(
			sezStatusApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the sez status applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetSezByS_U(int status, long userId) {
		getPersistence().removeBygetSezByS_U(status, userId);
	}

	/**
	 * Returns the number of sez status applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching sez status applications
	 */
	public static int countBygetSezByS_U(int status, long userId) {
		return getPersistence().countBygetSezByS_U(status, userId);
	}

	/**
	 * Returns the sez status application where caseId = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezStatusByCaseId(String caseId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByCaseId(caseId);
	}

	/**
	 * Returns the sez status application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByCaseId(
		String caseId) {

		return getPersistence().fetchBygetSezStatusByCaseId(caseId);
	}

	/**
	 * Returns the sez status application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the sez status application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status application that was removed
	 */
	public static SezStatusApplication removeBygetSezStatusByCaseId(
			String caseId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().removeBygetSezStatusByCaseId(caseId);
	}

	/**
	 * Returns the number of sez status applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status applications
	 */
	public static int countBygetSezStatusByCaseId(String caseId) {
		return getPersistence().countBygetSezStatusByCaseId(caseId);
	}

	/**
	 * Returns all the sez status applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezByStatus(int status) {
		return getPersistence().findBygetSezByStatus(status);
	}

	/**
	 * Returns a range of all the sez status applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetSezByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezByStatus(
		int status, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().findBygetSezByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezByStatus(
		int status, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezByStatus_First(
			int status,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezByStatus_First(
		int status, OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSezByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezByStatus_Last(
			int status,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezByStatus_Last(
		int status, OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSezByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where status = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication[] findBygetSezByStatus_PrevAndNext(
			long sezStatusApplicationId, int status,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezByStatus_PrevAndNext(
			sezStatusApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the sez status applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetSezByStatus(int status) {
		getPersistence().removeBygetSezByStatus(status);
	}

	/**
	 * Returns the number of sez status applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching sez status applications
	 */
	public static int countBygetSezByStatus(int status) {
		return getPersistence().countBygetSezByStatus(status);
	}

	/**
	 * Returns all the sez status applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId) {

		return getPersistence().findBygetSezStatusByEntityId(entityId);
	}

	/**
	 * Returns a range of all the sez status applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId, int start, int end) {

		return getPersistence().findBygetSezStatusByEntityId(
			entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().findBygetSezStatusByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezStatusByEntityId_First(
			String entityId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByEntityId_First(
		String entityId,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezStatusByEntityId_Last(
			String entityId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByEntityId_Last(
		String entityId,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication[]
			findBygetSezStatusByEntityId_PrevAndNext(
				long sezStatusApplicationId, String entityId,
				OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByEntityId_PrevAndNext(
			sezStatusApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the sez status applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetSezStatusByEntityId(String entityId) {
		getPersistence().removeBygetSezStatusByEntityId(entityId);
	}

	/**
	 * Returns the number of sez status applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching sez status applications
	 */
	public static int countBygetSezStatusByEntityId(String entityId) {
		return getPersistence().countBygetSezStatusByEntityId(entityId);
	}

	/**
	 * Returns all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching sez status applications
	 */
	public static List<SezStatusApplication>
		findBygetSezStatusByEntityId_Status(String entityId, int status) {

		return getPersistence().findBygetSezStatusByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public static List<SezStatusApplication>
		findBygetSezStatusByEntityId_Status(
			String entityId, int status, int start, int end) {

		return getPersistence().findBygetSezStatusByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication>
		findBygetSezStatusByEntityId_Status(
			String entityId, int status, int start, int end,
			OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().findBygetSezStatusByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication>
		findBygetSezStatusByEntityId_Status(
			String entityId, int status, int start, int end,
			OrderByComparator<SezStatusApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication
			findBygetSezStatusByEntityId_Status_First(
				String entityId, int status,
				OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication
		fetchBygetSezStatusByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezStatusByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication
		fetchBygetSezStatusByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication[]
			findBygetSezStatusByEntityId_Status_PrevAndNext(
				long sezStatusApplicationId, String entityId, int status,
				OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByEntityId_Status_PrevAndNext(
			sezStatusApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the sez status applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetSezStatusByEntityId_Status(
		String entityId, int status) {

		getPersistence().removeBygetSezStatusByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the number of sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching sez status applications
	 */
	public static int countBygetSezStatusByEntityId_Status(
		String entityId, int status) {

		return getPersistence().countBygetSezStatusByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the sez status application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezStatusByEI_CI(
			String entityId, String caseId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the sez status application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByEI_CI(
		String entityId, String caseId) {

		return getPersistence().fetchBygetSezStatusByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the sez status application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the sez status application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the sez status application that was removed
	 */
	public static SezStatusApplication removeBygetSezStatusByEI_CI(
			String entityId, String caseId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().removeBygetSezStatusByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of sez status applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching sez status applications
	 */
	public static int countBygetSezStatusByEI_CI(
		String entityId, String caseId) {

		return getPersistence().countBygetSezStatusByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the sez status application where applicationNumber = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezStatusByAppNo(
			String applicationNumber)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByAppNo(applicationNumber);
	}

	/**
	 * Returns the sez status application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetSezStatusByAppNo(applicationNumber);
	}

	/**
	 * Returns the sez status application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the sez status application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the sez status application that was removed
	 */
	public static SezStatusApplication removeBygetSezStatusByAppNo(
			String applicationNumber)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().removeBygetSezStatusByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of sez status applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching sez status applications
	 */
	public static int countBygetSezStatusByAppNo(String applicationNumber) {
		return getPersistence().countBygetSezStatusByAppNo(applicationNumber);
	}

	/**
	 * Returns the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSezStatusByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSezStatusByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetSezStatusByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSezStatusByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the sez status application that was removed
	 */
	public static SezStatusApplication removeBygetSezStatusByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().removeBygetSezStatusByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of sez status applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching sez status applications
	 */
	public static int countBygetSezStatusByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().countBygetSezStatusByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @return the matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo) {

		return getPersistence().findBygetSez_By_App_Status(status, doYouWantTo);
	}

	/**
	 * Returns a range of all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo, int start, int end) {

		return getPersistence().findBygetSez_By_App_Status(
			status, doYouWantTo, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().findBygetSez_By_App_Status(
			status, doYouWantTo, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public static List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSez_By_App_Status(
			status, doYouWantTo, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSez_By_App_Status_First(
			int status, String doYouWantTo,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSez_By_App_Status_First(
			status, doYouWantTo, orderByComparator);
	}

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSez_By_App_Status_First(
		int status, String doYouWantTo,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSez_By_App_Status_First(
			status, doYouWantTo, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public static SezStatusApplication findBygetSez_By_App_Status_Last(
			int status, String doYouWantTo,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSez_By_App_Status_Last(
			status, doYouWantTo, orderByComparator);
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public static SezStatusApplication fetchBygetSez_By_App_Status_Last(
		int status, String doYouWantTo,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().fetchBygetSez_By_App_Status_Last(
			status, doYouWantTo, orderByComparator);
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication[] findBygetSez_By_App_Status_PrevAndNext(
			long sezStatusApplicationId, int status, String doYouWantTo,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findBygetSez_By_App_Status_PrevAndNext(
			sezStatusApplicationId, status, doYouWantTo, orderByComparator);
	}

	/**
	 * Removes all the sez status applications where status = &#63; and doYouWantTo = &#63; from the database.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 */
	public static void removeBygetSez_By_App_Status(
		int status, String doYouWantTo) {

		getPersistence().removeBygetSez_By_App_Status(status, doYouWantTo);
	}

	/**
	 * Returns the number of sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @return the number of matching sez status applications
	 */
	public static int countBygetSez_By_App_Status(
		int status, String doYouWantTo) {

		return getPersistence().countBygetSez_By_App_Status(
			status, doYouWantTo);
	}

	/**
	 * Caches the sez status application in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplication the sez status application
	 */
	public static void cacheResult(SezStatusApplication sezStatusApplication) {
		getPersistence().cacheResult(sezStatusApplication);
	}

	/**
	 * Caches the sez status applications in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplications the sez status applications
	 */
	public static void cacheResult(
		List<SezStatusApplication> sezStatusApplications) {

		getPersistence().cacheResult(sezStatusApplications);
	}

	/**
	 * Creates a new sez status application with the primary key. Does not add the sez status application to the database.
	 *
	 * @param sezStatusApplicationId the primary key for the new sez status application
	 * @return the new sez status application
	 */
	public static SezStatusApplication create(long sezStatusApplicationId) {
		return getPersistence().create(sezStatusApplicationId);
	}

	/**
	 * Removes the sez status application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application that was removed
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication remove(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().remove(sezStatusApplicationId);
	}

	public static SezStatusApplication updateImpl(
		SezStatusApplication sezStatusApplication) {

		return getPersistence().updateImpl(sezStatusApplication);
	}

	/**
	 * Returns the sez status application with the primary key or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication findByPrimaryKey(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getPersistence().findByPrimaryKey(sezStatusApplicationId);
	}

	/**
	 * Returns the sez status application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application, or <code>null</code> if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication fetchByPrimaryKey(
		long sezStatusApplicationId) {

		return getPersistence().fetchByPrimaryKey(sezStatusApplicationId);
	}

	/**
	 * Returns all the sez status applications.
	 *
	 * @return the sez status applications
	 */
	public static List<SezStatusApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of sez status applications
	 */
	public static List<SezStatusApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status applications
	 */
	public static List<SezStatusApplication> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status applications
	 */
	public static List<SezStatusApplication> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status applications.
	 *
	 * @return the number of sez status applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusApplicationPersistence _persistence;

}