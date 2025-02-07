/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.application.form.service.model.NcraApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncra application service. This utility wraps <code>com.nbp.ncra.application.form.service.service.persistence.impl.NcraApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationPersistence
 * @generated
 */
public class NcraApplicationUtil {

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
	public static void clearCache(NcraApplication ncraApplication) {
		getPersistence().clearCache(ncraApplication);
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
	public static Map<Serializable, NcraApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcraApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcraApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcraApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcraApplication update(NcraApplication ncraApplication) {
		return getPersistence().update(ncraApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcraApplication update(
		NcraApplication ncraApplication, ServiceContext serviceContext) {

		return getPersistence().update(ncraApplication, serviceContext);
	}

	/**
	 * Returns all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByS_U(
		long userId, int status) {

		return getPersistence().findBygetNcraByS_U(userId, status);
	}

	/**
	 * Returns a range of all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetNcraByS_U(userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().findBygetNcraByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcraByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByS_U_First(
			long userId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByS_U_First(
		long userId, int status,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().fetchBygetNcraByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByS_U_Last(
			long userId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByS_U_Last(
		long userId, int status,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().fetchBygetNcraByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public static NcraApplication[] findBygetNcraByS_U_PrevAndNext(
			long ncraApplicationId, long userId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByS_U_PrevAndNext(
			ncraApplicationId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the ncra applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetNcraByS_U(long userId, int status) {
		getPersistence().removeBygetNcraByS_U(userId, status);
	}

	/**
	 * Returns the number of ncra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching ncra applications
	 */
	public static int countBygetNcraByS_U(long userId, int status) {
		return getPersistence().countBygetNcraByS_U(userId, status);
	}

	/**
	 * Returns all the ncra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByStatus(int status) {
		return getPersistence().findBygetNcraByStatus(status);
	}

	/**
	 * Returns a range of all the ncra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetNcraByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByStatus(
		int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().findBygetNcraByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByStatus(
		int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcraByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByStatus_First(
			int status, OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByStatus_First(
		int status, OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().fetchBygetNcraByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByStatus_Last(
			int status, OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByStatus_Last(
		int status, OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().fetchBygetNcraByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where status = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public static NcraApplication[] findBygetNcraByStatus_PrevAndNext(
			long ncraApplicationId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByStatus_PrevAndNext(
			ncraApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the ncra applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetNcraByStatus(int status) {
		getPersistence().removeBygetNcraByStatus(status);
	}

	/**
	 * Returns the number of ncra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncra applications
	 */
	public static int countBygetNcraByStatus(int status) {
		return getPersistence().countBygetNcraByStatus(status);
	}

	/**
	 * Returns the ncra application where applicationNumber = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByAppNum(
			String applicationNumber)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByAppNum(applicationNumber);
	}

	/**
	 * Returns the ncra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByAppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetNcraByAppNum(applicationNumber);
	}

	/**
	 * Returns the ncra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByAppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetNcraByAppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the ncra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the ncra application that was removed
	 */
	public static NcraApplication removeBygetNcraByAppNum(
			String applicationNumber)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().removeBygetNcraByAppNum(applicationNumber);
	}

	/**
	 * Returns the number of ncra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ncra applications
	 */
	public static int countBygetNcraByAppNum(String applicationNumber) {
		return getPersistence().countBygetNcraByAppNum(applicationNumber);
	}

	/**
	 * Returns the ncra application where caseId = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByCaseId(String caseId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByCaseId(caseId);
	}

	/**
	 * Returns the ncra application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByCaseId(String caseId) {
		return getPersistence().fetchBygetNcraByCaseId(caseId);
	}

	/**
	 * Returns the ncra application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcraByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the ncra application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncra application that was removed
	 */
	public static NcraApplication removeBygetNcraByCaseId(String caseId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().removeBygetNcraByCaseId(caseId);
	}

	/**
	 * Returns the number of ncra applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra applications
	 */
	public static int countBygetNcraByCaseId(String caseId) {
		return getPersistence().countBygetNcraByCaseId(caseId);
	}

	/**
	 * Returns all the ncra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByEntityId(
		String entityId) {

		return getPersistence().findBygetNcraByEntityId(entityId);
	}

	/**
	 * Returns a range of all the ncra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByEntityId(
		String entityId, int start, int end) {

		return getPersistence().findBygetNcraByEntityId(entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByEntityId(
		String entityId, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().findBygetNcraByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByEntityId(
		String entityId, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcraByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByEntityId_First(
			String entityId,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByEntityId_First(
		String entityId, OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().fetchBygetNcraByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByEntityId_Last(
			String entityId,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByEntityId_Last(
		String entityId, OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().fetchBygetNcraByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public static NcraApplication[] findBygetNcraByEntityId_PrevAndNext(
			long ncraApplicationId, String entityId,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByEntityId_PrevAndNext(
			ncraApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the ncra applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetNcraByEntityId(String entityId) {
		getPersistence().removeBygetNcraByEntityId(entityId);
	}

	/**
	 * Returns the number of ncra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching ncra applications
	 */
	public static int countBygetNcraByEntityId(String entityId) {
		return getPersistence().countBygetNcraByEntityId(entityId);
	}

	/**
	 * Returns all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status) {

		return getPersistence().findBygetNcraByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status, int start, int end) {

		return getPersistence().findBygetNcraByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().findBygetNcraByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	public static List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcraByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().fetchBygetNcraByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().fetchBygetNcraByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public static NcraApplication[] findBygetNcraByEntityId_Status_PrevAndNext(
			long ncraApplicationId, String entityId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByEntityId_Status_PrevAndNext(
			ncraApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the ncra applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetNcraByEntityId_Status(
		String entityId, int status) {

		getPersistence().removeBygetNcraByEntityId_Status(entityId, status);
	}

	/**
	 * Returns the number of ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching ncra applications
	 */
	public static int countBygetNcraByEntityId_Status(
		String entityId, int status) {

		return getPersistence().countBygetNcraByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the ncra application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByEI_CI(
			String entityId, String caseId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the ncra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByEI_CI(
		String entityId, String caseId) {

		return getPersistence().fetchBygetNcraByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the ncra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcraByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the ncra application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the ncra application that was removed
	 */
	public static NcraApplication removeBygetNcraByEI_CI(
			String entityId, String caseId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().removeBygetNcraByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of ncra applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching ncra applications
	 */
	public static int countBygetNcraByEI_CI(String entityId, String caseId) {
		return getPersistence().countBygetNcraByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public static NcraApplication findBygetNcraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findBygetNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public static NcraApplication fetchBygetNcraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the ncra application that was removed
	 */
	public static NcraApplication removeBygetNcraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().removeBygetNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of ncra applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching ncra applications
	 */
	public static int countBygetNcraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().countBygetNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Caches the ncra application in the entity cache if it is enabled.
	 *
	 * @param ncraApplication the ncra application
	 */
	public static void cacheResult(NcraApplication ncraApplication) {
		getPersistence().cacheResult(ncraApplication);
	}

	/**
	 * Caches the ncra applications in the entity cache if it is enabled.
	 *
	 * @param ncraApplications the ncra applications
	 */
	public static void cacheResult(List<NcraApplication> ncraApplications) {
		getPersistence().cacheResult(ncraApplications);
	}

	/**
	 * Creates a new ncra application with the primary key. Does not add the ncra application to the database.
	 *
	 * @param ncraApplicationId the primary key for the new ncra application
	 * @return the new ncra application
	 */
	public static NcraApplication create(long ncraApplicationId) {
		return getPersistence().create(ncraApplicationId);
	}

	/**
	 * Removes the ncra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application that was removed
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public static NcraApplication remove(long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().remove(ncraApplicationId);
	}

	public static NcraApplication updateImpl(NcraApplication ncraApplication) {
		return getPersistence().updateImpl(ncraApplication);
	}

	/**
	 * Returns the ncra application with the primary key or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public static NcraApplication findByPrimaryKey(long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getPersistence().findByPrimaryKey(ncraApplicationId);
	}

	/**
	 * Returns the ncra application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application, or <code>null</code> if a ncra application with the primary key could not be found
	 */
	public static NcraApplication fetchByPrimaryKey(long ncraApplicationId) {
		return getPersistence().fetchByPrimaryKey(ncraApplicationId);
	}

	/**
	 * Returns all the ncra applications.
	 *
	 * @return the ncra applications
	 */
	public static List<NcraApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of ncra applications
	 */
	public static List<NcraApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra applications
	 */
	public static List<NcraApplication> findAll(
		int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra applications
	 */
	public static List<NcraApplication> findAll(
		int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncra applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncra applications.
	 *
	 * @return the number of ncra applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcraApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcraApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcraApplicationPersistence _persistence;

}