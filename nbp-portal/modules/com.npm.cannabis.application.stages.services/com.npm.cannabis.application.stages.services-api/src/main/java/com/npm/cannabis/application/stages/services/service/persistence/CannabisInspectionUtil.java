/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis inspection service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisInspectionPersistence
 * @generated
 */
public class CannabisInspectionUtil {

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
	public static void clearCache(CannabisInspection cannabisInspection) {
		getPersistence().clearCache(cannabisInspection);
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
	public static Map<Serializable, CannabisInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisInspection update(
		CannabisInspection cannabisInspection) {

		return getPersistence().update(cannabisInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisInspection update(
		CannabisInspection cannabisInspection, ServiceContext serviceContext) {

		return getPersistence().update(cannabisInspection, serviceContext);
	}

	/**
	 * Returns all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId) {

		return getPersistence().findBygetCI_CAI(cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCI_CAI(
			cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().findBygetCI_CAI(
			cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CAI(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection[] findBygetCI_CAI_PrevAndNext(
			long cannabisInspectionId, long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CAI_PrevAndNext(
			cannabisInspectionId, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Removes all the cannabis inspections where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCI_CAI(long cannabisApplicationId) {
		getPersistence().removeBygetCI_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis inspections where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis inspections
	 */
	public static int countBygetCI_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCI_CAI(cannabisApplicationId);
	}

	/**
	 * Returns all the cannabis inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseId(String caseId) {
		return getPersistence().findBygetCI_CaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetCI_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().findBygetCI_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_CaseId_First(
			String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_CaseId_First(
		String caseId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_CaseId_Last(
			String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_CaseId_Last(
		String caseId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection[] findBygetCI_CaseId_PrevAndNext(
			long cannabisInspectionId, String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CaseId_PrevAndNext(
			cannabisInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the cannabis inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCI_CaseId(String caseId) {
		getPersistence().removeBygetCI_CaseId(caseId);
	}

	/**
	 * Returns the number of cannabis inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis inspections
	 */
	public static int countBygetCI_CaseId(String caseId) {
		return getPersistence().countBygetCI_CaseId(caseId);
	}

	/**
	 * Returns all the cannabis inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_Status(String status) {
		return getPersistence().findBygetCI_Status(status);
	}

	/**
	 * Returns a range of all the cannabis inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_Status(
		String status, int start, int end) {

		return getPersistence().findBygetCI_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().findBygetCI_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_Status_First(
			String status,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_Status_First(
		String status,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_Status_Last(
			String status,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_Status_Last(
		String status,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where status = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection[] findBygetCI_Status_PrevAndNext(
			long cannabisInspectionId, String status,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_Status_PrevAndNext(
			cannabisInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the cannabis inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetCI_Status(String status) {
		getPersistence().removeBygetCI_Status(status);
	}

	/**
	 * Returns the number of cannabis inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis inspections
	 */
	public static int countBygetCI_Status(String status) {
		return getPersistence().countBygetCI_Status(status);
	}

	/**
	 * Returns all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetCI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetCI_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection[] findBygetCI_CaseIdStatus_PrevAndNext(
			long cannabisInspectionId, String status, String caseId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CaseIdStatus_PrevAndNext(
			cannabisInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the cannabis inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetCI_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetCI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of cannabis inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching cannabis inspections
	 */
	public static int countBygetCI_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetCI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis inspections
	 */
	public static List<CannabisInspection> findBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_CaseIdApplicationId_First(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CaseIdApplicationId_First(
			status, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_CaseIdApplicationId_First(
		String status, long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdApplicationId_First(
			status, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection findBygetCI_CaseIdApplicationId_Last(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CaseIdApplicationId_Last(
			status, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection fetchBygetCI_CaseIdApplicationId_Last(
		String status, long cannabisApplicationId,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdApplicationId_Last(
			status, cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis inspections before and after the current cannabis inspection in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param cannabisInspectionId the primary key of the current cannabis inspection
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection[]
			findBygetCI_CaseIdApplicationId_PrevAndNext(
				long cannabisInspectionId, String status,
				long cannabisApplicationId,
				OrderByComparator<CannabisInspection> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findBygetCI_CaseIdApplicationId_PrevAndNext(
			cannabisInspectionId, status, cannabisApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis inspections where status = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		getPersistence().removeBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis inspections where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis inspections
	 */
	public static int countBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		return getPersistence().countBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId);
	}

	/**
	 * Returns the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, cannabisApplicationId);
	}

	/**
	 * Returns the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long cannabisApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, cannabisApplicationId);
	}

	/**
	 * Returns the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis inspection, or <code>null</code> if a matching cannabis inspection could not be found
	 */
	public static CannabisInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long cannabisApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, cannabisApplicationId,
				useFinderCache);
	}

	/**
	 * Removes the cannabis inspection where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis inspection that was removed
	 */
	public static CannabisInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis inspections where status = &#63; and slotBookedByUser = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long cannabisApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, cannabisApplicationId);
	}

	/**
	 * Caches the cannabis inspection in the entity cache if it is enabled.
	 *
	 * @param cannabisInspection the cannabis inspection
	 */
	public static void cacheResult(CannabisInspection cannabisInspection) {
		getPersistence().cacheResult(cannabisInspection);
	}

	/**
	 * Caches the cannabis inspections in the entity cache if it is enabled.
	 *
	 * @param cannabisInspections the cannabis inspections
	 */
	public static void cacheResult(
		List<CannabisInspection> cannabisInspections) {

		getPersistence().cacheResult(cannabisInspections);
	}

	/**
	 * Creates a new cannabis inspection with the primary key. Does not add the cannabis inspection to the database.
	 *
	 * @param cannabisInspectionId the primary key for the new cannabis inspection
	 * @return the new cannabis inspection
	 */
	public static CannabisInspection create(long cannabisInspectionId) {
		return getPersistence().create(cannabisInspectionId);
	}

	/**
	 * Removes the cannabis inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection that was removed
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection remove(long cannabisInspectionId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().remove(cannabisInspectionId);
	}

	public static CannabisInspection updateImpl(
		CannabisInspection cannabisInspection) {

		return getPersistence().updateImpl(cannabisInspection);
	}

	/**
	 * Returns the cannabis inspection with the primary key or throws a <code>NoSuchCannabisInspectionException</code> if it could not be found.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection
	 * @throws NoSuchCannabisInspectionException if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection findByPrimaryKey(long cannabisInspectionId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getPersistence().findByPrimaryKey(cannabisInspectionId);
	}

	/**
	 * Returns the cannabis inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection, or <code>null</code> if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection fetchByPrimaryKey(
		long cannabisInspectionId) {

		return getPersistence().fetchByPrimaryKey(cannabisInspectionId);
	}

	/**
	 * Returns all the cannabis inspections.
	 *
	 * @return the cannabis inspections
	 */
	public static List<CannabisInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of cannabis inspections
	 */
	public static List<CannabisInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis inspections
	 */
	public static List<CannabisInspection> findAll(
		int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis inspections
	 */
	public static List<CannabisInspection> findAll(
		int start, int end,
		OrderByComparator<CannabisInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis inspections.
	 *
	 * @return the number of cannabis inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisInspectionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisInspectionPersistence _persistence;

}