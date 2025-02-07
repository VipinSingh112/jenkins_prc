/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining lease application service. This utility wraps <code>com.nbp.mining.lease.application.service.service.persistence.impl.MiningLeaseApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningLeaseApplicationPersistence
 * @generated
 */
public class MiningLeaseApplicationUtil {

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
		MiningLeaseApplication miningLeaseApplication) {

		getPersistence().clearCache(miningLeaseApplication);
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
	public static Map<Serializable, MiningLeaseApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningLeaseApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningLeaseApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningLeaseApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningLeaseApplication update(
		MiningLeaseApplication miningLeaseApplication) {

		return getPersistence().update(miningLeaseApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningLeaseApplication update(
		MiningLeaseApplication miningLeaseApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(miningLeaseApplication, serviceContext);
	}

	/**
	 * Returns all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status) {

		return getPersistence().findBygetMiningByS_U(userId, status);
	}

	/**
	 * Returns a range of all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetMiningByS_U(
			userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().findBygetMiningByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMiningByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByS_U_First(
			long userId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByS_U_First(
		long userId, int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().fetchBygetMiningByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByS_U_Last(
			long userId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByS_U_Last(
		long userId, int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().fetchBygetMiningByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public static MiningLeaseApplication[] findBygetMiningByS_U_PrevAndNext(
			long miningLeaseApplicationId, long userId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByS_U_PrevAndNext(
			miningLeaseApplicationId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the mining lease applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetMiningByS_U(long userId, int status) {
		getPersistence().removeBygetMiningByS_U(userId, status);
	}

	/**
	 * Returns the number of mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching mining lease applications
	 */
	public static int countBygetMiningByS_U(long userId, int status) {
		return getPersistence().countBygetMiningByS_U(userId, status);
	}

	/**
	 * Returns all the mining lease applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByStatus(
		int status) {

		return getPersistence().findBygetMiningByStatus(status);
	}

	/**
	 * Returns a range of all the mining lease applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetMiningByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByStatus(
		int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().findBygetMiningByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByStatus(
		int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMiningByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByStatus_First(
			int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByStatus_First(
		int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().fetchBygetMiningByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByStatus_Last(
			int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByStatus_Last(
		int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().fetchBygetMiningByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where status = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public static MiningLeaseApplication[] findBygetMiningByStatus_PrevAndNext(
			long miningLeaseApplicationId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByStatus_PrevAndNext(
			miningLeaseApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the mining lease applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetMiningByStatus(int status) {
		getPersistence().removeBygetMiningByStatus(status);
	}

	/**
	 * Returns the number of mining lease applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching mining lease applications
	 */
	public static int countBygetMiningByStatus(int status) {
		return getPersistence().countBygetMiningByStatus(status);
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByAppNum(
			String applicationNumber)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByAppNum(applicationNumber);
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByAppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetMiningByAppNum(applicationNumber);
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByAppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningByAppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the mining lease application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the mining lease application that was removed
	 */
	public static MiningLeaseApplication removeBygetMiningByAppNum(
			String applicationNumber)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().removeBygetMiningByAppNum(applicationNumber);
	}

	/**
	 * Returns the number of mining lease applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching mining lease applications
	 */
	public static int countBygetMiningByAppNum(String applicationNumber) {
		return getPersistence().countBygetMiningByAppNum(applicationNumber);
	}

	/**
	 * Returns the mining lease application where caseId = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByCaseId(String caseId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByCaseId(caseId);
	}

	/**
	 * Returns the mining lease application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByCaseId(
		String caseId) {

		return getPersistence().fetchBygetMiningByCaseId(caseId);
	}

	/**
	 * Returns the mining lease application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the mining lease application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining lease application that was removed
	 */
	public static MiningLeaseApplication removeBygetMiningByCaseId(
			String caseId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().removeBygetMiningByCaseId(caseId);
	}

	/**
	 * Returns the number of mining lease applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining lease applications
	 */
	public static int countBygetMiningByCaseId(String caseId) {
		return getPersistence().countBygetMiningByCaseId(caseId);
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication
			findBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				String applicationNumber, String prospRightsNum)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().
			findBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				applicationNumber, prospRightsNum);
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication
		fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			String applicationNumber, String prospRightsNum) {

		return getPersistence().
			fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				applicationNumber, prospRightsNum);
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication
		fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			String applicationNumber, String prospRightsNum,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				applicationNumber, prospRightsNum, useFinderCache);
	}

	/**
	 * Removes the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the mining lease application that was removed
	 */
	public static MiningLeaseApplication
			removeBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				String applicationNumber, String prospRightsNum)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().
			removeBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				applicationNumber, prospRightsNum);
	}

	/**
	 * Returns the number of mining lease applications where applicationNumber = &#63; and prospRightsNum = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the number of matching mining lease applications
	 */
	public static int
		countBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			String applicationNumber, String prospRightsNum) {

		return getPersistence().
			countBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				applicationNumber, prospRightsNum);
	}

	/**
	 * Returns all the mining lease applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId) {

		return getPersistence().findBygetMiningByEntityId(entityId);
	}

	/**
	 * Returns a range of all the mining lease applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId, int start, int end) {

		return getPersistence().findBygetMiningByEntityId(entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().findBygetMiningByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMiningByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByEntityId_First(
			String entityId,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByEntityId_First(
		String entityId,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().fetchBygetMiningByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByEntityId_Last(
			String entityId,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByEntityId_Last(
		String entityId,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().fetchBygetMiningByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public static MiningLeaseApplication[]
			findBygetMiningByEntityId_PrevAndNext(
				long miningLeaseApplicationId, String entityId,
				OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByEntityId_PrevAndNext(
			miningLeaseApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the mining lease applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetMiningByEntityId(String entityId) {
		getPersistence().removeBygetMiningByEntityId(entityId);
	}

	/**
	 * Returns the number of mining lease applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching mining lease applications
	 */
	public static int countBygetMiningByEntityId(String entityId) {
		return getPersistence().countBygetMiningByEntityId(entityId);
	}

	/**
	 * Returns all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByEntityId_Status(
		String entityId, int status) {

		return getPersistence().findBygetMiningByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByEntityId_Status(
		String entityId, int status, int start, int end) {

		return getPersistence().findBygetMiningByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().findBygetMiningByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	public static List<MiningLeaseApplication> findBygetMiningByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMiningByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication
		fetchBygetMiningByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().fetchBygetMiningByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().fetchBygetMiningByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public static MiningLeaseApplication[]
			findBygetMiningByEntityId_Status_PrevAndNext(
				long miningLeaseApplicationId, String entityId, int status,
				OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByEntityId_Status_PrevAndNext(
			miningLeaseApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the mining lease applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetMiningByEntityId_Status(
		String entityId, int status) {

		getPersistence().removeBygetMiningByEntityId_Status(entityId, status);
	}

	/**
	 * Returns the number of mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching mining lease applications
	 */
	public static int countBygetMiningByEntityId_Status(
		String entityId, int status) {

		return getPersistence().countBygetMiningByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the mining lease application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByEI_CI(
			String entityId, String caseId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the mining lease application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByEI_CI(
		String entityId, String caseId) {

		return getPersistence().fetchBygetMiningByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the mining lease application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the mining lease application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the mining lease application that was removed
	 */
	public static MiningLeaseApplication removeBygetMiningByEI_CI(
			String entityId, String caseId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().removeBygetMiningByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of mining lease applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching mining lease applications
	 */
	public static int countBygetMiningByEI_CI(String entityId, String caseId) {
		return getPersistence().countBygetMiningByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication findBygetMiningByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findBygetMiningByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Returns the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetMiningByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Returns the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	public static MiningLeaseApplication fetchBygetMiningByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetMiningByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the mining lease application that was removed
	 */
	public static MiningLeaseApplication removeBygetMiningByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().removeBygetMiningByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of mining lease applications where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching mining lease applications
	 */
	public static int countBygetMiningByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		return getPersistence().countBygetMiningByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Caches the mining lease application in the entity cache if it is enabled.
	 *
	 * @param miningLeaseApplication the mining lease application
	 */
	public static void cacheResult(
		MiningLeaseApplication miningLeaseApplication) {

		getPersistence().cacheResult(miningLeaseApplication);
	}

	/**
	 * Caches the mining lease applications in the entity cache if it is enabled.
	 *
	 * @param miningLeaseApplications the mining lease applications
	 */
	public static void cacheResult(
		List<MiningLeaseApplication> miningLeaseApplications) {

		getPersistence().cacheResult(miningLeaseApplications);
	}

	/**
	 * Creates a new mining lease application with the primary key. Does not add the mining lease application to the database.
	 *
	 * @param miningLeaseApplicationId the primary key for the new mining lease application
	 * @return the new mining lease application
	 */
	public static MiningLeaseApplication create(long miningLeaseApplicationId) {
		return getPersistence().create(miningLeaseApplicationId);
	}

	/**
	 * Removes the mining lease application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application that was removed
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public static MiningLeaseApplication remove(long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().remove(miningLeaseApplicationId);
	}

	public static MiningLeaseApplication updateImpl(
		MiningLeaseApplication miningLeaseApplication) {

		return getPersistence().updateImpl(miningLeaseApplication);
	}

	/**
	 * Returns the mining lease application with the primary key or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	public static MiningLeaseApplication findByPrimaryKey(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningLeaseApplicationException {

		return getPersistence().findByPrimaryKey(miningLeaseApplicationId);
	}

	/**
	 * Returns the mining lease application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application, or <code>null</code> if a mining lease application with the primary key could not be found
	 */
	public static MiningLeaseApplication fetchByPrimaryKey(
		long miningLeaseApplicationId) {

		return getPersistence().fetchByPrimaryKey(miningLeaseApplicationId);
	}

	/**
	 * Returns all the mining lease applications.
	 *
	 * @return the mining lease applications
	 */
	public static List<MiningLeaseApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of mining lease applications
	 */
	public static List<MiningLeaseApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining lease applications
	 */
	public static List<MiningLeaseApplication> findAll(
		int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining lease applications
	 */
	public static List<MiningLeaseApplication> findAll(
		int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining lease applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining lease applications.
	 *
	 * @return the number of mining lease applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningLeaseApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningLeaseApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningLeaseApplicationPersistence _persistence;

}