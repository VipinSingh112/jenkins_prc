/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.stage.services.model.HsraInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the hsra inspection service. This utility wraps <code>com.nbp.hsra.stage.services.service.persistence.impl.HsraInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraInspectionPersistence
 * @generated
 */
public class HsraInspectionUtil {

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
	public static void clearCache(HsraInspection hsraInspection) {
		getPersistence().clearCache(hsraInspection);
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
	public static Map<Serializable, HsraInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HsraInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HsraInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HsraInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HsraInspection update(HsraInspection hsraInspection) {
		return getPersistence().update(hsraInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HsraInspection update(
		HsraInspection hsraInspection, ServiceContext serviceContext) {

		return getPersistence().update(hsraInspection, serviceContext);
	}

	/**
	 * Returns the hsra inspection where caseId = &#63; or throws a <code>NoSuchHsraInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsraInspectionBy_CI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsraInspectionBy_CI(caseId);
	}

	/**
	 * Returns the hsra inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsraInspectionBy_CI(String caseId) {
		return getPersistence().fetchBygetHsraInspectionBy_CI(caseId);
	}

	/**
	 * Returns the hsra inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsraInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the hsra inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra inspection that was removed
	 */
	public static HsraInspection removeBygetHsraInspectionBy_CI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().removeBygetHsraInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of hsra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra inspections
	 */
	public static int countBygetHsraInspectionBy_CI(String caseId) {
		return getPersistence().countBygetHsraInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId) {

		return getPersistence().findBygetHsra_FBAI(hsraApplicationId);
	}

	/**
	 * Returns a range of all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsra_FBAI(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().findBygetHsra_FBAI(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsra_FBAI(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_FBAI_First(
			long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_FBAI_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_FBAI_First(
		long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_FBAI_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_FBAI_Last(
			long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_FBAI_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_FBAI_Last(
		long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_FBAI_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection[] findBygetHsra_FBAI_PrevAndNext(
			long hsraInspectionId, long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_FBAI_PrevAndNext(
			hsraInspectionId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the hsra inspections where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsra_FBAI(long hsraApplicationId) {
		getPersistence().removeBygetHsra_FBAI(hsraApplicationId);
	}

	/**
	 * Returns the number of hsra inspections where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra inspections
	 */
	public static int countBygetHsra_FBAI(long hsraApplicationId) {
		return getPersistence().countBygetHsra_FBAI(hsraApplicationId);
	}

	/**
	 * Returns all the hsra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseId(String caseId) {
		return getPersistence().findBygetHsra_CaseId(caseId);
	}

	/**
	 * Returns a range of all the hsra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetHsra_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().findBygetHsra_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsra_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_CaseId_First(
			String caseId, OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_CaseId_First(
		String caseId, OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_CaseId_Last(
			String caseId, OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_CaseId_Last(
		String caseId, OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection[] findBygetHsra_CaseId_PrevAndNext(
			long hsraInspectionId, String caseId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_CaseId_PrevAndNext(
			hsraInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the hsra inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetHsra_CaseId(String caseId) {
		getPersistence().removeBygetHsra_CaseId(caseId);
	}

	/**
	 * Returns the number of hsra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra inspections
	 */
	public static int countBygetHsra_CaseId(String caseId) {
		return getPersistence().countBygetHsra_CaseId(caseId);
	}

	/**
	 * Returns all the hsra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_Status(String status) {
		return getPersistence().findBygetHsra_Status(status);
	}

	/**
	 * Returns a range of all the hsra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_Status(
		String status, int start, int end) {

		return getPersistence().findBygetHsra_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_Status(
		String status, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().findBygetHsra_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_Status(
		String status, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsra_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_Status_First(
			String status, OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_Status_First(
		String status, OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_Status_Last(
			String status, OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_Status_Last(
		String status, OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection[] findBygetHsra_Status_PrevAndNext(
			long hsraInspectionId, String status,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_Status_PrevAndNext(
			hsraInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the hsra inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetHsra_Status(String status) {
		getPersistence().removeBygetHsra_Status(status);
	}

	/**
	 * Returns the number of hsra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching hsra inspections
	 */
	public static int countBygetHsra_Status(String status) {
		return getPersistence().countBygetHsra_Status(status);
	}

	/**
	 * Returns all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetHsra_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetHsra_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().findBygetHsra_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsra_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection[] findBygetHsra_CaseIdStatus_PrevAndNext(
			long hsraInspectionId, String status, String caseId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_CaseIdStatus_PrevAndNext(
			hsraInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the hsra inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetHsra_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetHsra_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching hsra inspections
	 */
	public static int countBygetHsra_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().countBygetHsra_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId) {

		return getPersistence().findBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId);
	}

	/**
	 * Returns a range of all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().findBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	public static List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_CaseIdApplicationId_First(
			String status, long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_CaseIdApplicationId_First(
			status, hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_CaseIdApplicationId_First(
		String status, long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_CaseIdApplicationId_First(
			status, hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection findBygetHsra_CaseIdApplicationId_Last(
			String status, long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_CaseIdApplicationId_Last(
			status, hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection fetchBygetHsra_CaseIdApplicationId_Last(
		String status, long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_CaseIdApplicationId_Last(
			status, hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection[]
			findBygetHsra_CaseIdApplicationId_PrevAndNext(
				long hsraInspectionId, String status, long hsraApplicationId,
				OrderByComparator<HsraInspection> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findBygetHsra_CaseIdApplicationId_PrevAndNext(
			hsraInspectionId, status, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the hsra inspections where status = &#63; and hsraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId) {

		getPersistence().removeBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId);
	}

	/**
	 * Returns the number of hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra inspections
	 */
	public static int countBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId) {

		return getPersistence().countBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId);
	}

	/**
	 * Returns the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; or throws a <code>NoSuchHsraInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	public static HsraInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long hsraApplicationId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, hsraApplicationId);
	}

	/**
	 * Returns the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long hsraApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, hsraApplicationId);
	}

	/**
	 * Returns the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	public static HsraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long hsraApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra inspection that was removed
	 */
	public static HsraInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long hsraApplicationId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, hsraApplicationId);
	}

	/**
	 * Returns the number of hsra inspections where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long hsraApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, hsraApplicationId);
	}

	/**
	 * Caches the hsra inspection in the entity cache if it is enabled.
	 *
	 * @param hsraInspection the hsra inspection
	 */
	public static void cacheResult(HsraInspection hsraInspection) {
		getPersistence().cacheResult(hsraInspection);
	}

	/**
	 * Caches the hsra inspections in the entity cache if it is enabled.
	 *
	 * @param hsraInspections the hsra inspections
	 */
	public static void cacheResult(List<HsraInspection> hsraInspections) {
		getPersistence().cacheResult(hsraInspections);
	}

	/**
	 * Creates a new hsra inspection with the primary key. Does not add the hsra inspection to the database.
	 *
	 * @param hsraInspectionId the primary key for the new hsra inspection
	 * @return the new hsra inspection
	 */
	public static HsraInspection create(long hsraInspectionId) {
		return getPersistence().create(hsraInspectionId);
	}

	/**
	 * Removes the hsra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection that was removed
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection remove(long hsraInspectionId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().remove(hsraInspectionId);
	}

	public static HsraInspection updateImpl(HsraInspection hsraInspection) {
		return getPersistence().updateImpl(hsraInspection);
	}

	/**
	 * Returns the hsra inspection with the primary key or throws a <code>NoSuchHsraInspectionException</code> if it could not be found.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection findByPrimaryKey(long hsraInspectionId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getPersistence().findByPrimaryKey(hsraInspectionId);
	}

	/**
	 * Returns the hsra inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection, or <code>null</code> if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection fetchByPrimaryKey(long hsraInspectionId) {
		return getPersistence().fetchByPrimaryKey(hsraInspectionId);
	}

	/**
	 * Returns all the hsra inspections.
	 *
	 * @return the hsra inspections
	 */
	public static List<HsraInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of hsra inspections
	 */
	public static List<HsraInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra inspections
	 */
	public static List<HsraInspection> findAll(
		int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra inspections
	 */
	public static List<HsraInspection> findAll(
		int start, int end, OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the hsra inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of hsra inspections.
	 *
	 * @return the number of hsra inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HsraInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(HsraInspectionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile HsraInspectionPersistence _persistence;

}