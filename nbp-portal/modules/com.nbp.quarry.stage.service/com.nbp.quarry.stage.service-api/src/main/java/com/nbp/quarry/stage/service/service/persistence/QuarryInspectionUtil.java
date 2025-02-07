/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quarry.stage.service.model.QuarryInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry inspection service. This utility wraps <code>com.nbp.quarry.stage.service.service.persistence.impl.QuarryInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInspectionPersistence
 * @generated
 */
public class QuarryInspectionUtil {

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
	public static void clearCache(QuarryInspection quarryInspection) {
		getPersistence().clearCache(quarryInspection);
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
	public static Map<Serializable, QuarryInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryInspection update(QuarryInspection quarryInspection) {
		return getPersistence().update(quarryInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryInspection update(
		QuarryInspection quarryInspection, ServiceContext serviceContext) {

		return getPersistence().update(quarryInspection, serviceContext);
	}

	/**
	 * Returns the quarry inspection where caseId = &#63; or throws a <code>NoSuchQuarryInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarryInspectionBy_CI(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarryInspectionBy_CI(caseId);
	}

	/**
	 * Returns the quarry inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarryInspectionBy_CI(
		String caseId) {

		return getPersistence().fetchBygetQuarryInspectionBy_CI(caseId);
	}

	/**
	 * Returns the quarry inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarryInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarryInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the quarry inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry inspection that was removed
	 */
	public static QuarryInspection removeBygetQuarryInspectionBy_CI(
			String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().removeBygetQuarryInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of quarry inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry inspections
	 */
	public static int countBygetQuarryInspectionBy_CI(String caseId) {
		return getPersistence().countBygetQuarryInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId) {

		return getPersistence().findBygetQuarry_FBAI(quarryApplicationId);
	}

	/**
	 * Returns a range of all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId, int start, int end) {

		return getPersistence().findBygetQuarry_FBAI(
			quarryApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().findBygetQuarry_FBAI(
			quarryApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_FBAI(
			quarryApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_FBAI_First(
			long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_FBAI_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_FBAI_First(
		long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_FBAI_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_FBAI_Last(
			long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_FBAI_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_FBAI_Last(
		long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_FBAI_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection[] findBygetQuarry_FBAI_PrevAndNext(
			long quarryInspectionId, long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_FBAI_PrevAndNext(
			quarryInspectionId, quarryApplicationId, orderByComparator);
	}

	/**
	 * Removes all the quarry inspections where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public static void removeBygetQuarry_FBAI(long quarryApplicationId) {
		getPersistence().removeBygetQuarry_FBAI(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry inspections where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry inspections
	 */
	public static int countBygetQuarry_FBAI(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_FBAI(quarryApplicationId);
	}

	/**
	 * Returns all the quarry inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseId(String caseId) {
		return getPersistence().findBygetQuarry_CaseId(caseId);
	}

	/**
	 * Returns a range of all the quarry inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetQuarry_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().findBygetQuarry_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_CaseId_First(
			String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_CaseId_First(
		String caseId, OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_CaseId_Last(
			String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_CaseId_Last(
		String caseId, OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection[] findBygetQuarry_CaseId_PrevAndNext(
			long quarryInspectionId, String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_CaseId_PrevAndNext(
			quarryInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the quarry inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetQuarry_CaseId(String caseId) {
		getPersistence().removeBygetQuarry_CaseId(caseId);
	}

	/**
	 * Returns the number of quarry inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry inspections
	 */
	public static int countBygetQuarry_CaseId(String caseId) {
		return getPersistence().countBygetQuarry_CaseId(caseId);
	}

	/**
	 * Returns all the quarry inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_Status(String status) {
		return getPersistence().findBygetQuarry_Status(status);
	}

	/**
	 * Returns a range of all the quarry inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_Status(
		String status, int start, int end) {

		return getPersistence().findBygetQuarry_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_Status(
		String status, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().findBygetQuarry_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_Status(
		String status, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_Status_First(
			String status,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_Status_First(
		String status, OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_Status_Last(
			String status,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_Status_Last(
		String status, OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection[] findBygetQuarry_Status_PrevAndNext(
			long quarryInspectionId, String status,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_Status_PrevAndNext(
			quarryInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the quarry inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetQuarry_Status(String status) {
		getPersistence().removeBygetQuarry_Status(status);
	}

	/**
	 * Returns the number of quarry inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching quarry inspections
	 */
	public static int countBygetQuarry_Status(String status) {
		return getPersistence().countBygetQuarry_Status(status);
	}

	/**
	 * Returns all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetQuarry_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetQuarry_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().findBygetQuarry_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection[] findBygetQuarry_CaseIdStatus_PrevAndNext(
			long quarryInspectionId, String status, String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_CaseIdStatus_PrevAndNext(
			quarryInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the quarry inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetQuarry_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetQuarry_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching quarry inspections
	 */
	public static int countBygetQuarry_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().countBygetQuarry_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId) {

		return getPersistence().findBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId);
	}

	/**
	 * Returns a range of all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId, int start, int end) {

		return getPersistence().findBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().findBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	public static List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_CaseIdApplicationId_First(
			String status, long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_CaseIdApplicationId_First(
			status, quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_CaseIdApplicationId_First(
		String status, long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_CaseIdApplicationId_First(
			status, quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection findBygetQuarry_CaseIdApplicationId_Last(
			String status, long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_CaseIdApplicationId_Last(
			status, quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection fetchBygetQuarry_CaseIdApplicationId_Last(
		String status, long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().fetchBygetQuarry_CaseIdApplicationId_Last(
			status, quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection[]
			findBygetQuarry_CaseIdApplicationId_PrevAndNext(
				long quarryInspectionId, String status,
				long quarryApplicationId,
				OrderByComparator<QuarryInspection> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findBygetQuarry_CaseIdApplicationId_PrevAndNext(
			quarryInspectionId, status, quarryApplicationId, orderByComparator);
	}

	/**
	 * Removes all the quarry inspections where status = &#63; and quarryApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 */
	public static void removeBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId) {

		getPersistence().removeBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId);
	}

	/**
	 * Returns the number of quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry inspections
	 */
	public static int countBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId) {

		return getPersistence().countBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId);
	}

	/**
	 * Returns the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; or throws a <code>NoSuchQuarryInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	public static QuarryInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long quarryApplicationId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, quarryApplicationId);
	}

	/**
	 * Returns the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long quarryApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, quarryApplicationId);
	}

	/**
	 * Returns the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	public static QuarryInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long quarryApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, quarryApplicationId, useFinderCache);
	}

	/**
	 * Removes the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry inspection that was removed
	 */
	public static QuarryInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long quarryApplicationId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, quarryApplicationId);
	}

	/**
	 * Returns the number of quarry inspections where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long quarryApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, quarryApplicationId);
	}

	/**
	 * Caches the quarry inspection in the entity cache if it is enabled.
	 *
	 * @param quarryInspection the quarry inspection
	 */
	public static void cacheResult(QuarryInspection quarryInspection) {
		getPersistence().cacheResult(quarryInspection);
	}

	/**
	 * Caches the quarry inspections in the entity cache if it is enabled.
	 *
	 * @param quarryInspections the quarry inspections
	 */
	public static void cacheResult(List<QuarryInspection> quarryInspections) {
		getPersistence().cacheResult(quarryInspections);
	}

	/**
	 * Creates a new quarry inspection with the primary key. Does not add the quarry inspection to the database.
	 *
	 * @param quarryInspectionId the primary key for the new quarry inspection
	 * @return the new quarry inspection
	 */
	public static QuarryInspection create(long quarryInspectionId) {
		return getPersistence().create(quarryInspectionId);
	}

	/**
	 * Removes the quarry inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection that was removed
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection remove(long quarryInspectionId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().remove(quarryInspectionId);
	}

	public static QuarryInspection updateImpl(
		QuarryInspection quarryInspection) {

		return getPersistence().updateImpl(quarryInspection);
	}

	/**
	 * Returns the quarry inspection with the primary key or throws a <code>NoSuchQuarryInspectionException</code> if it could not be found.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection findByPrimaryKey(long quarryInspectionId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getPersistence().findByPrimaryKey(quarryInspectionId);
	}

	/**
	 * Returns the quarry inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection, or <code>null</code> if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection fetchByPrimaryKey(long quarryInspectionId) {
		return getPersistence().fetchByPrimaryKey(quarryInspectionId);
	}

	/**
	 * Returns all the quarry inspections.
	 *
	 * @return the quarry inspections
	 */
	public static List<QuarryInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of quarry inspections
	 */
	public static List<QuarryInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry inspections
	 */
	public static List<QuarryInspection> findAll(
		int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry inspections
	 */
	public static List<QuarryInspection> findAll(
		int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry inspections.
	 *
	 * @return the number of quarry inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(QuarryInspectionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile QuarryInspectionPersistence _persistence;

}