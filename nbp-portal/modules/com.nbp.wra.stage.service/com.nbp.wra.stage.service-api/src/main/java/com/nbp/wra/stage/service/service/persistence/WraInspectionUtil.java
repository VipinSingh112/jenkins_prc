/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WraInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra inspection service. This utility wraps <code>com.nbp.wra.stage.service.service.persistence.impl.WraInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraInspectionPersistence
 * @generated
 */
public class WraInspectionUtil {

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
	public static void clearCache(WraInspection wraInspection) {
		getPersistence().clearCache(wraInspection);
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
	public static Map<Serializable, WraInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WraInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WraInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WraInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WraInspection update(WraInspection wraInspection) {
		return getPersistence().update(wraInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WraInspection update(
		WraInspection wraInspection, ServiceContext serviceContext) {

		return getPersistence().update(wraInspection, serviceContext);
	}

	/**
	 * Returns the wra inspection where caseId = &#63; or throws a <code>NoSuchWraInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWraInspectionBy_CI(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWraInspectionBy_CI(caseId);
	}

	/**
	 * Returns the wra inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWraInspectionBy_CI(String caseId) {
		return getPersistence().fetchBygetWraInspectionBy_CI(caseId);
	}

	/**
	 * Returns the wra inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWraInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetWraInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the wra inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra inspection that was removed
	 */
	public static WraInspection removeBygetWraInspectionBy_CI(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().removeBygetWraInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of wra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra inspections
	 */
	public static int countBygetWraInspectionBy_CI(String caseId) {
		return getPersistence().countBygetWraInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the wra inspections where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspections
	 */
	public static List<WraInspection> findBygetWraById(long wraApplicationId) {
		return getPersistence().findBygetWraById(wraApplicationId);
	}

	/**
	 * Returns a range of all the wra inspections where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWraById(
		long wraApplicationId, int start, int end) {

		return getPersistence().findBygetWraById(wraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra inspections where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWraById(
		long wraApplicationId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().findBygetWraById(
			wraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra inspections where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWraById(
		long wraApplicationId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWraById(
			wraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWraById_First(
			long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWraById_First(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWraById_First(
		long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWraById_First(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWraById_Last(
			long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWraById_Last(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWraById_Last(
		long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWraById_Last(
			wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public static WraInspection[] findBygetWraById_PrevAndNext(
			long wraInspectionId, long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWraById_PrevAndNext(
			wraInspectionId, wraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the wra inspections where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	public static void removeBygetWraById(long wraApplicationId) {
		getPersistence().removeBygetWraById(wraApplicationId);
	}

	/**
	 * Returns the number of wra inspections where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra inspections
	 */
	public static int countBygetWraById(long wraApplicationId) {
		return getPersistence().countBygetWraById(wraApplicationId);
	}

	/**
	 * Returns all the wra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CaseId(String caseId) {
		return getPersistence().findBygetWra_CaseId(caseId);
	}

	/**
	 * Returns a range of all the wra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetWra_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().findBygetWra_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWra_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWra_CaseId_First(
			String caseId, OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWra_CaseId_First(
		String caseId, OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWra_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWra_CaseId_Last(
			String caseId, OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWra_CaseId_Last(
		String caseId, OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWra_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public static WraInspection[] findBygetWra_CaseId_PrevAndNext(
			long wraInspectionId, String caseId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_CaseId_PrevAndNext(
			wraInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the wra inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetWra_CaseId(String caseId) {
		getPersistence().removeBygetWra_CaseId(caseId);
	}

	/**
	 * Returns the number of wra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra inspections
	 */
	public static int countBygetWra_CaseId(String caseId) {
		return getPersistence().countBygetWra_CaseId(caseId);
	}

	/**
	 * Returns all the wra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_Status(String status) {
		return getPersistence().findBygetWra_Status(status);
	}

	/**
	 * Returns a range of all the wra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_Status(
		String status, int start, int end) {

		return getPersistence().findBygetWra_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_Status(
		String status, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().findBygetWra_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_Status(
		String status, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWra_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWra_Status_First(
			String status, OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWra_Status_First(
		String status, OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWra_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWra_Status_Last(
			String status, OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWra_Status_Last(
		String status, OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWra_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where status = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public static WraInspection[] findBygetWra_Status_PrevAndNext(
			long wraInspectionId, String status,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_Status_PrevAndNext(
			wraInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the wra inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetWra_Status(String status) {
		getPersistence().removeBygetWra_Status(status);
	}

	/**
	 * Returns the number of wra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching wra inspections
	 */
	public static int countBygetWra_Status(String status) {
		return getPersistence().countBygetWra_Status(status);
	}

	/**
	 * Returns all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId) {

		return getPersistence().findBygetWra_CI_Status(status, caseId);
	}

	/**
	 * Returns a range of all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetWra_CI_Status(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().findBygetWra_CI_Status(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWra_CI_Status(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWra_CI_Status_First(
			String status, String caseId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_CI_Status_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWra_CI_Status_First(
		String status, String caseId,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWra_CI_Status_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWra_CI_Status_Last(
			String status, String caseId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_CI_Status_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWra_CI_Status_Last(
		String status, String caseId,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWra_CI_Status_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public static WraInspection[] findBygetWra_CI_Status_PrevAndNext(
			long wraInspectionId, String status, String caseId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_CI_Status_PrevAndNext(
			wraInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the wra inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetWra_CI_Status(String status, String caseId) {
		getPersistence().removeBygetWra_CI_Status(status, caseId);
	}

	/**
	 * Returns the number of wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching wra inspections
	 */
	public static int countBygetWra_CI_Status(String status, String caseId) {
		return getPersistence().countBygetWra_CI_Status(status, caseId);
	}

	/**
	 * Returns all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId) {

		return getPersistence().findBygetWra_CI_AppId(status, wraApplicationId);
	}

	/**
	 * Returns a range of all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId, int start, int end) {

		return getPersistence().findBygetWra_CI_AppId(
			status, wraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().findBygetWra_CI_AppId(
			status, wraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	public static List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWra_CI_AppId(
			status, wraApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWra_CI_AppId_First(
			String status, long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_CI_AppId_First(
			status, wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWra_CI_AppId_First(
		String status, long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWra_CI_AppId_First(
			status, wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetWra_CI_AppId_Last(
			String status, long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_CI_AppId_Last(
			status, wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetWra_CI_AppId_Last(
		String status, long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().fetchBygetWra_CI_AppId_Last(
			status, wraApplicationId, orderByComparator);
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public static WraInspection[] findBygetWra_CI_AppId_PrevAndNext(
			long wraInspectionId, String status, long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetWra_CI_AppId_PrevAndNext(
			wraInspectionId, status, wraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the wra inspections where status = &#63; and wraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 */
	public static void removeBygetWra_CI_AppId(
		String status, long wraApplicationId) {

		getPersistence().removeBygetWra_CI_AppId(status, wraApplicationId);
	}

	/**
	 * Returns the number of wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra inspections
	 */
	public static int countBygetWra_CI_AppId(
		String status, long wraApplicationId) {

		return getPersistence().countBygetWra_CI_AppId(
			status, wraApplicationId);
	}

	/**
	 * Returns the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; or throws a <code>NoSuchWraInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	public static WraInspection findBygetInspecByST_Slot_AppId(
			String status, long slotBookedByUser, long wraApplicationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findBygetInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId);
	}

	/**
	 * Returns the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetInspecByST_Slot_AppId(
		String status, long slotBookedByUser, long wraApplicationId) {

		return getPersistence().fetchBygetInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId);
	}

	/**
	 * Returns the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	public static WraInspection fetchBygetInspecByST_Slot_AppId(
		String status, long slotBookedByUser, long wraApplicationId,
		boolean useFinderCache) {

		return getPersistence().fetchBygetInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the wra inspection that was removed
	 */
	public static WraInspection removeBygetInspecByST_Slot_AppId(
			String status, long slotBookedByUser, long wraApplicationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().removeBygetInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId);
	}

	/**
	 * Returns the number of wra inspections where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra inspections
	 */
	public static int countBygetInspecByST_Slot_AppId(
		String status, long slotBookedByUser, long wraApplicationId) {

		return getPersistence().countBygetInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId);
	}

	/**
	 * Caches the wra inspection in the entity cache if it is enabled.
	 *
	 * @param wraInspection the wra inspection
	 */
	public static void cacheResult(WraInspection wraInspection) {
		getPersistence().cacheResult(wraInspection);
	}

	/**
	 * Caches the wra inspections in the entity cache if it is enabled.
	 *
	 * @param wraInspections the wra inspections
	 */
	public static void cacheResult(List<WraInspection> wraInspections) {
		getPersistence().cacheResult(wraInspections);
	}

	/**
	 * Creates a new wra inspection with the primary key. Does not add the wra inspection to the database.
	 *
	 * @param wraInspectionId the primary key for the new wra inspection
	 * @return the new wra inspection
	 */
	public static WraInspection create(long wraInspectionId) {
		return getPersistence().create(wraInspectionId);
	}

	/**
	 * Removes the wra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection that was removed
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public static WraInspection remove(long wraInspectionId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().remove(wraInspectionId);
	}

	public static WraInspection updateImpl(WraInspection wraInspection) {
		return getPersistence().updateImpl(wraInspection);
	}

	/**
	 * Returns the wra inspection with the primary key or throws a <code>NoSuchWraInspectionException</code> if it could not be found.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	public static WraInspection findByPrimaryKey(long wraInspectionId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getPersistence().findByPrimaryKey(wraInspectionId);
	}

	/**
	 * Returns the wra inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection, or <code>null</code> if a wra inspection with the primary key could not be found
	 */
	public static WraInspection fetchByPrimaryKey(long wraInspectionId) {
		return getPersistence().fetchByPrimaryKey(wraInspectionId);
	}

	/**
	 * Returns all the wra inspections.
	 *
	 * @return the wra inspections
	 */
	public static List<WraInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of wra inspections
	 */
	public static List<WraInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra inspections
	 */
	public static List<WraInspection> findAll(
		int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra inspections
	 */
	public static List<WraInspection> findAll(
		int start, int end, OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra inspections.
	 *
	 * @return the number of wra inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WraInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(WraInspectionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile WraInspectionPersistence _persistence;

}