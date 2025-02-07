/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OgtApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ogt application service. This utility wraps <code>com.nbp.ogt.application.form.services.service.persistence.impl.OgtApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationPersistence
 * @generated
 */
public class OgtApplicationUtil {

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
	public static void clearCache(OgtApplication ogtApplication) {
		getPersistence().clearCache(ogtApplication);
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
	public static Map<Serializable, OgtApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OgtApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OgtApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OgtApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OgtApplication update(OgtApplication ogtApplication) {
		return getPersistence().update(ogtApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OgtApplication update(
		OgtApplication ogtApplication, ServiceContext serviceContext) {

		return getPersistence().update(ogtApplication, serviceContext);
	}

	/**
	 * Returns all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByS_U(
		long userId, int status) {

		return getPersistence().findBygetOgtByS_U(userId, status);
	}

	/**
	 * Returns a range of all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetOgtByS_U(userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().findBygetOgtByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOgtByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByS_U_First(
			long userId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByS_U_First(
		long userId, int status,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().fetchBygetOgtByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByS_U_Last(
			long userId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByS_U_Last(
		long userId, int status,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().fetchBygetOgtByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public static OgtApplication[] findBygetOgtByS_U_PrevAndNext(
			long ogtApplicationId, long userId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByS_U_PrevAndNext(
			ogtApplicationId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the ogt applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetOgtByS_U(long userId, int status) {
		getPersistence().removeBygetOgtByS_U(userId, status);
	}

	/**
	 * Returns the number of ogt applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching ogt applications
	 */
	public static int countBygetOgtByS_U(long userId, int status) {
		return getPersistence().countBygetOgtByS_U(userId, status);
	}

	/**
	 * Returns all the ogt applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByStatus(int status) {
		return getPersistence().findBygetOgtByStatus(status);
	}

	/**
	 * Returns a range of all the ogt applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetOgtByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByStatus(
		int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().findBygetOgtByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByStatus(
		int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOgtByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByStatus_First(
			int status, OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByStatus_First(
		int status, OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().fetchBygetOgtByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByStatus_Last(
			int status, OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByStatus_Last(
		int status, OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().fetchBygetOgtByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where status = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public static OgtApplication[] findBygetOgtByStatus_PrevAndNext(
			long ogtApplicationId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByStatus_PrevAndNext(
			ogtApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the ogt applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetOgtByStatus(int status) {
		getPersistence().removeBygetOgtByStatus(status);
	}

	/**
	 * Returns the number of ogt applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ogt applications
	 */
	public static int countBygetOgtByStatus(int status) {
		return getPersistence().countBygetOgtByStatus(status);
	}

	/**
	 * Returns the ogt application where applicationNumber = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByAppNum(String applicationNumber)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByAppNum(applicationNumber);
	}

	/**
	 * Returns the ogt application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByAppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetOgtByAppNum(applicationNumber);
	}

	/**
	 * Returns the ogt application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByAppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetOgtByAppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the ogt application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the ogt application that was removed
	 */
	public static OgtApplication removeBygetOgtByAppNum(
			String applicationNumber)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().removeBygetOgtByAppNum(applicationNumber);
	}

	/**
	 * Returns the number of ogt applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ogt applications
	 */
	public static int countBygetOgtByAppNum(String applicationNumber) {
		return getPersistence().countBygetOgtByAppNum(applicationNumber);
	}

	/**
	 * Returns the ogt application where caseId = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByCaseId(String caseId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByCaseId(caseId);
	}

	/**
	 * Returns the ogt application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByCaseId(String caseId) {
		return getPersistence().fetchBygetOgtByCaseId(caseId);
	}

	/**
	 * Returns the ogt application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOgtByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the ogt application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ogt application that was removed
	 */
	public static OgtApplication removeBygetOgtByCaseId(String caseId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().removeBygetOgtByCaseId(caseId);
	}

	/**
	 * Returns the number of ogt applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ogt applications
	 */
	public static int countBygetOgtByCaseId(String caseId) {
		return getPersistence().countBygetOgtByCaseId(caseId);
	}

	/**
	 * Returns all the ogt applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByEntityId(String entityId) {
		return getPersistence().findBygetOgtByEntityId(entityId);
	}

	/**
	 * Returns a range of all the ogt applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByEntityId(
		String entityId, int start, int end) {

		return getPersistence().findBygetOgtByEntityId(entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByEntityId(
		String entityId, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().findBygetOgtByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByEntityId(
		String entityId, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOgtByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByEntityId_First(
			String entityId,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByEntityId_First(
		String entityId, OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().fetchBygetOgtByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByEntityId_Last(
			String entityId,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByEntityId_Last(
		String entityId, OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().fetchBygetOgtByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public static OgtApplication[] findBygetOgtByEntityId_PrevAndNext(
			long ogtApplicationId, String entityId,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByEntityId_PrevAndNext(
			ogtApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the ogt applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetOgtByEntityId(String entityId) {
		getPersistence().removeBygetOgtByEntityId(entityId);
	}

	/**
	 * Returns the number of ogt applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching ogt applications
	 */
	public static int countBygetOgtByEntityId(String entityId) {
		return getPersistence().countBygetOgtByEntityId(entityId);
	}

	/**
	 * Returns all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status) {

		return getPersistence().findBygetOgtByEntityId_Status(entityId, status);
	}

	/**
	 * Returns a range of all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status, int start, int end) {

		return getPersistence().findBygetOgtByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().findBygetOgtByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	public static List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<OgtApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOgtByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().fetchBygetOgtByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().fetchBygetOgtByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public static OgtApplication[] findBygetOgtByEntityId_Status_PrevAndNext(
			long ogtApplicationId, String entityId, int status,
			OrderByComparator<OgtApplication> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByEntityId_Status_PrevAndNext(
			ogtApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the ogt applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetOgtByEntityId_Status(
		String entityId, int status) {

		getPersistence().removeBygetOgtByEntityId_Status(entityId, status);
	}

	/**
	 * Returns the number of ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching ogt applications
	 */
	public static int countBygetOgtByEntityId_Status(
		String entityId, int status) {

		return getPersistence().countBygetOgtByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the ogt application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByEI_CI(
			String entityId, String caseId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the ogt application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByEI_CI(
		String entityId, String caseId) {

		return getPersistence().fetchBygetOgtByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the ogt application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOgtByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the ogt application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the ogt application that was removed
	 */
	public static OgtApplication removeBygetOgtByEI_CI(
			String entityId, String caseId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().removeBygetOgtByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of ogt applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching ogt applications
	 */
	public static int countBygetOgtByEI_CI(String entityId, String caseId) {
		return getPersistence().countBygetOgtByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public static OgtApplication findBygetOgtByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findBygetOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Returns the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Returns the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public static OgtApplication fetchBygetOgtByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the ogt application that was removed
	 */
	public static OgtApplication removeBygetOgtByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().removeBygetOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of ogt applications where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching ogt applications
	 */
	public static int countBygetOgtByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		return getPersistence().countBygetOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Caches the ogt application in the entity cache if it is enabled.
	 *
	 * @param ogtApplication the ogt application
	 */
	public static void cacheResult(OgtApplication ogtApplication) {
		getPersistence().cacheResult(ogtApplication);
	}

	/**
	 * Caches the ogt applications in the entity cache if it is enabled.
	 *
	 * @param ogtApplications the ogt applications
	 */
	public static void cacheResult(List<OgtApplication> ogtApplications) {
		getPersistence().cacheResult(ogtApplications);
	}

	/**
	 * Creates a new ogt application with the primary key. Does not add the ogt application to the database.
	 *
	 * @param ogtApplicationId the primary key for the new ogt application
	 * @return the new ogt application
	 */
	public static OgtApplication create(long ogtApplicationId) {
		return getPersistence().create(ogtApplicationId);
	}

	/**
	 * Removes the ogt application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application that was removed
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public static OgtApplication remove(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().remove(ogtApplicationId);
	}

	public static OgtApplication updateImpl(OgtApplication ogtApplication) {
		return getPersistence().updateImpl(ogtApplication);
	}

	/**
	 * Returns the ogt application with the primary key or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public static OgtApplication findByPrimaryKey(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getPersistence().findByPrimaryKey(ogtApplicationId);
	}

	/**
	 * Returns the ogt application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application, or <code>null</code> if a ogt application with the primary key could not be found
	 */
	public static OgtApplication fetchByPrimaryKey(long ogtApplicationId) {
		return getPersistence().fetchByPrimaryKey(ogtApplicationId);
	}

	/**
	 * Returns all the ogt applications.
	 *
	 * @return the ogt applications
	 */
	public static List<OgtApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of ogt applications
	 */
	public static List<OgtApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt applications
	 */
	public static List<OgtApplication> findAll(
		int start, int end,
		OrderByComparator<OgtApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt applications
	 */
	public static List<OgtApplication> findAll(
		int start, int end, OrderByComparator<OgtApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ogt applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ogt applications.
	 *
	 * @return the number of ogt applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OgtApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(OgtApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile OgtApplicationPersistence _persistence;

}