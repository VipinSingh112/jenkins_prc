/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi insolvency application service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.OsiInsolvencyApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationPersistence
 * @generated
 */
public class OsiInsolvencyApplicationUtil {

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
		OsiInsolvencyApplication osiInsolvencyApplication) {

		getPersistence().clearCache(osiInsolvencyApplication);
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
	public static Map<Serializable, OsiInsolvencyApplication>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiInsolvencyApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiInsolvencyApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiInsolvencyApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiInsolvencyApplication update(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		return getPersistence().update(osiInsolvencyApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiInsolvencyApplication update(
		OsiInsolvencyApplication osiInsolvencyApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiInsolvencyApplication, serviceContext);
	}

	/**
	 * Returns the osi insolvency application where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication findBygetOsiInsolvencyById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiInsolvencyById(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency application where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication fetchBygetOsiInsolvencyById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiInsolvencyById(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency application where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication fetchBygetOsiInsolvencyById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiInsolvencyById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi insolvency application where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency application that was removed
	 */
	public static OsiInsolvencyApplication removeBygetOsiInsolvencyById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().removeBygetOsiInsolvencyById(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi insolvency applications where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency applications
	 */
	public static int countBygetOsiInsolvencyById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiInsolvencyById(osiInsolvencyId);
	}

	/**
	 * Returns all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status) {

		return getPersistence().findBygetOsiByS_U(userId, status);
	}

	/**
	 * Returns a range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetOsiByS_U(userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().findBygetOsiByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication findBygetOsiByS_U_First(
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication fetchBygetOsiByS_U_First(
		long userId, int status,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication findBygetOsiByS_U_Last(
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication fetchBygetOsiByS_U_Last(
		long userId, int status,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public static OsiInsolvencyApplication[] findBygetOsiByS_U_PrevAndNext(
			long osiInsolvencyId, long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiByS_U_PrevAndNext(
			osiInsolvencyId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the osi insolvency applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetOsiByS_U(long userId, int status) {
		getPersistence().removeBygetOsiByS_U(userId, status);
	}

	/**
	 * Returns the number of osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	public static int countBygetOsiByS_U(long userId, int status) {
		return getPersistence().countBygetOsiByS_U(userId, status);
	}

	/**
	 * Returns the osi insolvency application where applicationNumber = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication findBygetOsiByAppNum(
			String applicationNumber)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiByAppNum(applicationNumber);
	}

	/**
	 * Returns the osi insolvency application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication fetchBygetOsiByAppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetOsiByAppNum(applicationNumber);
	}

	/**
	 * Returns the osi insolvency application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication fetchBygetOsiByAppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiByAppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the osi insolvency application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the osi insolvency application that was removed
	 */
	public static OsiInsolvencyApplication removeBygetOsiByAppNum(
			String applicationNumber)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().removeBygetOsiByAppNum(applicationNumber);
	}

	/**
	 * Returns the number of osi insolvency applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching osi insolvency applications
	 */
	public static int countBygetOsiByAppNum(String applicationNumber) {
		return getPersistence().countBygetOsiByAppNum(applicationNumber);
	}

	/**
	 * Returns the osi insolvency application where caseId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication findBygetOsiByCaseId(String caseId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiByCaseId(caseId);
	}

	/**
	 * Returns the osi insolvency application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication fetchBygetOsiByCaseId(
		String caseId) {

		return getPersistence().fetchBygetOsiByCaseId(caseId);
	}

	/**
	 * Returns the osi insolvency application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication fetchBygetOsiByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the osi insolvency application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi insolvency application that was removed
	 */
	public static OsiInsolvencyApplication removeBygetOsiByCaseId(String caseId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().removeBygetOsiByCaseId(caseId);
	}

	/**
	 * Returns the number of osi insolvency applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency applications
	 */
	public static int countBygetOsiByCaseId(String caseId) {
		return getPersistence().countBygetOsiByCaseId(caseId);
	}

	/**
	 * Returns all the osi insolvency applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus(
		int status) {

		return getPersistence().findBygetOsiInsolvencyByStatus(status);
	}

	/**
	 * Returns a range of all the osi insolvency applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetOsiInsolvencyByStatus(
			status, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus(
		int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().findBygetOsiInsolvencyByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findBygetOsiInsolvencyByStatus(
		int status, int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiInsolvencyByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_First(
			int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiInsolvencyByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByStatus_First(
			int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiInsolvencyByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_Last(
			int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiInsolvencyByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication fetchBygetOsiInsolvencyByStatus_Last(
		int status,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiInsolvencyByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public static OsiInsolvencyApplication[]
			findBygetOsiInsolvencyByStatus_PrevAndNext(
				long osiInsolvencyId, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiInsolvencyByStatus_PrevAndNext(
			osiInsolvencyId, status, orderByComparator);
	}

	/**
	 * Removes all the osi insolvency applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetOsiInsolvencyByStatus(int status) {
		getPersistence().removeBygetOsiInsolvencyByStatus(status);
	}

	/**
	 * Returns the number of osi insolvency applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	public static int countBygetOsiInsolvencyByStatus(int status) {
		return getPersistence().countBygetOsiInsolvencyByStatus(status);
	}

	/**
	 * Returns all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus_UserId(long userId, int status) {

		return getPersistence().findBygetOsiInsolvencyByStatus_UserId(
			userId, status);
	}

	/**
	 * Returns a range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus_UserId(
			long userId, int status, int start, int end) {

		return getPersistence().findBygetOsiInsolvencyByStatus_UserId(
			userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus_UserId(
			long userId, int status, int start, int end,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().findBygetOsiInsolvencyByStatus_UserId(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus_UserId(
			long userId, int status, int start, int end,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetOsiInsolvencyByStatus_UserId(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication
			findBygetOsiInsolvencyByStatus_UserId_First(
				long userId, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiInsolvencyByStatus_UserId_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByStatus_UserId_First(
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiInsolvencyByStatus_UserId_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication
			findBygetOsiInsolvencyByStatus_UserId_Last(
				long userId, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findBygetOsiInsolvencyByStatus_UserId_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByStatus_UserId_Last(
			long userId, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().fetchBygetOsiInsolvencyByStatus_UserId_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public static OsiInsolvencyApplication[]
			findBygetOsiInsolvencyByStatus_UserId_PrevAndNext(
				long osiInsolvencyId, long userId, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().
			findBygetOsiInsolvencyByStatus_UserId_PrevAndNext(
				osiInsolvencyId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the osi insolvency applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetOsiInsolvencyByStatus_UserId(
		long userId, int status) {

		getPersistence().removeBygetOsiInsolvencyByStatus_UserId(
			userId, status);
	}

	/**
	 * Returns the number of osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	public static int countBygetOsiInsolvencyByStatus_UserId(
		long userId, int status) {

		return getPersistence().countBygetOsiInsolvencyByStatus_UserId(
			userId, status);
	}

	/**
	 * Returns all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status) {

		return getPersistence().
			findBygetOsiInsolvencyByApplicationStatus_Status(
				applicantStatus, status);
	}

	/**
	 * Returns a range of all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status, int start, int end) {

		return getPersistence().
			findBygetOsiInsolvencyByApplicationStatus_Status(
				applicantStatus, status, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status, int start, int end,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().
			findBygetOsiInsolvencyByApplicationStatus_Status(
				applicantStatus, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status, int start, int end,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().
			findBygetOsiInsolvencyByApplicationStatus_Status(
				applicantStatus, status, start, end, orderByComparator,
				useFinderCache);
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication
			findBygetOsiInsolvencyByApplicationStatus_Status_First(
				String applicantStatus, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().
			findBygetOsiInsolvencyByApplicationStatus_Status_First(
				applicantStatus, status, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByApplicationStatus_Status_First(
			String applicantStatus, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().
			fetchBygetOsiInsolvencyByApplicationStatus_Status_First(
				applicantStatus, status, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication
			findBygetOsiInsolvencyByApplicationStatus_Status_Last(
				String applicantStatus, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().
			findBygetOsiInsolvencyByApplicationStatus_Status_Last(
				applicantStatus, status, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public static OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByApplicationStatus_Status_Last(
			String applicantStatus, int status,
			OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().
			fetchBygetOsiInsolvencyByApplicationStatus_Status_Last(
				applicantStatus, status, orderByComparator);
	}

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public static OsiInsolvencyApplication[]
			findBygetOsiInsolvencyByApplicationStatus_Status_PrevAndNext(
				long osiInsolvencyId, String applicantStatus, int status,
				OrderByComparator<OsiInsolvencyApplication> orderByComparator)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().
			findBygetOsiInsolvencyByApplicationStatus_Status_PrevAndNext(
				osiInsolvencyId, applicantStatus, status, orderByComparator);
	}

	/**
	 * Removes all the osi insolvency applications where applicantStatus = &#63; and status = &#63; from the database.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 */
	public static void removeBygetOsiInsolvencyByApplicationStatus_Status(
		String applicantStatus, int status) {

		getPersistence().removeBygetOsiInsolvencyByApplicationStatus_Status(
			applicantStatus, status);
	}

	/**
	 * Returns the number of osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	public static int countBygetOsiInsolvencyByApplicationStatus_Status(
		String applicantStatus, int status) {

		return getPersistence().
			countBygetOsiInsolvencyByApplicationStatus_Status(
				applicantStatus, status);
	}

	/**
	 * Caches the osi insolvency application in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplication the osi insolvency application
	 */
	public static void cacheResult(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		getPersistence().cacheResult(osiInsolvencyApplication);
	}

	/**
	 * Caches the osi insolvency applications in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplications the osi insolvency applications
	 */
	public static void cacheResult(
		List<OsiInsolvencyApplication> osiInsolvencyApplications) {

		getPersistence().cacheResult(osiInsolvencyApplications);
	}

	/**
	 * Creates a new osi insolvency application with the primary key. Does not add the osi insolvency application to the database.
	 *
	 * @param osiInsolvencyId the primary key for the new osi insolvency application
	 * @return the new osi insolvency application
	 */
	public static OsiInsolvencyApplication create(long osiInsolvencyId) {
		return getPersistence().create(osiInsolvencyId);
	}

	/**
	 * Removes the osi insolvency application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application that was removed
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public static OsiInsolvencyApplication remove(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().remove(osiInsolvencyId);
	}

	public static OsiInsolvencyApplication updateImpl(
		OsiInsolvencyApplication osiInsolvencyApplication) {

		return getPersistence().updateImpl(osiInsolvencyApplication);
	}

	/**
	 * Returns the osi insolvency application with the primary key or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public static OsiInsolvencyApplication findByPrimaryKey(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiInsolvencyApplicationException {

		return getPersistence().findByPrimaryKey(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application, or <code>null</code> if a osi insolvency application with the primary key could not be found
	 */
	public static OsiInsolvencyApplication fetchByPrimaryKey(
		long osiInsolvencyId) {

		return getPersistence().fetchByPrimaryKey(osiInsolvencyId);
	}

	/**
	 * Returns all the osi insolvency applications.
	 *
	 * @return the osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency applications
	 */
	public static List<OsiInsolvencyApplication> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi insolvency applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi insolvency applications.
	 *
	 * @return the number of osi insolvency applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiInsolvencyApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiInsolvencyApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiInsolvencyApplicationPersistence _persistence;

}