/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.stages.services.model.NcraInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncra inspection service. This utility wraps <code>com.nbp.ncra.stages.services.service.persistence.impl.NcraInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraInspectionPersistence
 * @generated
 */
public class NcraInspectionUtil {

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
	public static void clearCache(NcraInspection ncraInspection) {
		getPersistence().clearCache(ncraInspection);
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
	public static Map<Serializable, NcraInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcraInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcraInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcraInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcraInspection update(NcraInspection ncraInspection) {
		return getPersistence().update(ncraInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcraInspection update(
		NcraInspection ncraInspection, ServiceContext serviceContext) {

		return getPersistence().update(ncraInspection, serviceContext);
	}

	/**
	 * Returns the ncra inspection where caseId = &#63; or throws a <code>NoSuchNcraInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetNcraInspectionBy_CI(String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcraInspectionBy_CI(caseId);
	}

	/**
	 * Returns the ncra inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcraInspectionBy_CI(String caseId) {
		return getPersistence().fetchBygetNcraInspectionBy_CI(caseId);
	}

	/**
	 * Returns the ncra inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcraInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcraInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the ncra inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncra inspection that was removed
	 */
	public static NcraInspection removeBygetNcraInspectionBy_CI(String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().removeBygetNcraInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of ncra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra inspections
	 */
	public static int countBygetNcraInspectionBy_CI(String caseId) {
		return getPersistence().countBygetNcraInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId) {

		return getPersistence().findBygetNcra_AI(ncraApplicationId);
	}

	/**
	 * Returns a range of all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId, int start, int end) {

		return getPersistence().findBygetNcra_AI(ncraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().findBygetNcra_AI(
			ncraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcra_AI(
			ncraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetNcra_AI_First(
			long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_AI_First(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcra_AI_First(
		long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetNcra_AI_First(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetNcra_AI_Last(
			long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_AI_Last(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcra_AI_Last(
		long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetNcra_AI_Last(
			ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection[] findBygetNcra_AI_PrevAndNext(
			long ncraInspectionId, long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_AI_PrevAndNext(
			ncraInspectionId, ncraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncra inspections where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 */
	public static void removeBygetNcra_AI(long ncraApplicationId) {
		getPersistence().removeBygetNcra_AI(ncraApplicationId);
	}

	/**
	 * Returns the number of ncra inspections where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra inspections
	 */
	public static int countBygetNcra_AI(long ncraApplicationId) {
		return getPersistence().countBygetNcra_AI(ncraApplicationId);
	}

	/**
	 * Returns all the ncra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_by_CaseId(String caseId) {
		return getPersistence().findBygetNcra_by_CaseId(caseId);
	}

	/**
	 * Returns a range of all the ncra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetNcra_by_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().findBygetNcra_by_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcra_by_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetNcra_by_CaseId_First(
			String caseId, OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_by_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcra_by_CaseId_First(
		String caseId, OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetNcra_by_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetNcra_by_CaseId_Last(
			String caseId, OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_by_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcra_by_CaseId_Last(
		String caseId, OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetNcra_by_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection[] findBygetNcra_by_CaseId_PrevAndNext(
			long ncraInspectionId, String caseId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_by_CaseId_PrevAndNext(
			ncraInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the ncra inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetNcra_by_CaseId(String caseId) {
		getPersistence().removeBygetNcra_by_CaseId(caseId);
	}

	/**
	 * Returns the number of ncra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra inspections
	 */
	public static int countBygetNcra_by_CaseId(String caseId) {
		return getPersistence().countBygetNcra_by_CaseId(caseId);
	}

	/**
	 * Returns all the ncra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncra inspections
	 */
	public static List<NcraInspection> findBygetHsra_Status(String status) {
		return getPersistence().findBygetHsra_Status(status);
	}

	/**
	 * Returns a range of all the ncra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetHsra_Status(
		String status, int start, int end) {

		return getPersistence().findBygetHsra_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetHsra_Status(
		String status, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().findBygetHsra_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetHsra_Status(
		String status, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsra_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetHsra_Status_First(
			String status, OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetHsra_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetHsra_Status_First(
		String status, OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetHsra_Status_Last(
			String status, OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetHsra_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetHsra_Status_Last(
		String status, OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetHsra_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection[] findBygetHsra_Status_PrevAndNext(
			long ncraInspectionId, String status,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetHsra_Status_PrevAndNext(
			ncraInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the ncra inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetHsra_Status(String status) {
		getPersistence().removeBygetHsra_Status(status);
	}

	/**
	 * Returns the number of ncra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncra inspections
	 */
	public static int countBygetHsra_Status(String status) {
		return getPersistence().countBygetHsra_Status(status);
	}

	/**
	 * Returns all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetNcra_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetNcra_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().findBygetNcra_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcra_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetNcra_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcra_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetNcra_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetNcra_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcra_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetNcra_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection[] findBygetNcra_CaseIdStatus_PrevAndNext(
			long ncraInspectionId, String status, String caseId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_CaseIdStatus_PrevAndNext(
			ncraInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the ncra inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetNcra_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetNcra_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching ncra inspections
	 */
	public static int countBygetNcra_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().countBygetNcra_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId) {

		return getPersistence().findBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId);
	}

	/**
	 * Returns a range of all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId, int start, int end) {

		return getPersistence().findBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().findBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	public static List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetNcra_CaseIdApplicationId_First(
			String status, long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_CaseIdApplicationId_First(
			status, ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcra_CaseIdApplicationId_First(
		String status, long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetNcra_CaseIdApplicationId_First(
			status, ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection findBygetNcra_CaseIdApplicationId_Last(
			String status, long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_CaseIdApplicationId_Last(
			status, ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection fetchBygetNcra_CaseIdApplicationId_Last(
		String status, long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().fetchBygetNcra_CaseIdApplicationId_Last(
			status, ncraApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection[]
			findBygetNcra_CaseIdApplicationId_PrevAndNext(
				long ncraInspectionId, String status, long ncraApplicationId,
				OrderByComparator<NcraInspection> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findBygetNcra_CaseIdApplicationId_PrevAndNext(
			ncraInspectionId, status, ncraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncra inspections where status = &#63; and ncraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 */
	public static void removeBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId) {

		getPersistence().removeBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId);
	}

	/**
	 * Returns the number of ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra inspections
	 */
	public static int countBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId) {

		return getPersistence().countBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId);
	}

	/**
	 * Returns the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; or throws a <code>NoSuchNcraInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	public static NcraInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long ncraApplicationId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, ncraApplicationId);
	}

	/**
	 * Returns the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long ncraApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, ncraApplicationId);
	}

	/**
	 * Returns the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	public static NcraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long ncraApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, ncraApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra inspection that was removed
	 */
	public static NcraInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long ncraApplicationId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, ncraApplicationId);
	}

	/**
	 * Returns the number of ncra inspections where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long ncraApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, ncraApplicationId);
	}

	/**
	 * Caches the ncra inspection in the entity cache if it is enabled.
	 *
	 * @param ncraInspection the ncra inspection
	 */
	public static void cacheResult(NcraInspection ncraInspection) {
		getPersistence().cacheResult(ncraInspection);
	}

	/**
	 * Caches the ncra inspections in the entity cache if it is enabled.
	 *
	 * @param ncraInspections the ncra inspections
	 */
	public static void cacheResult(List<NcraInspection> ncraInspections) {
		getPersistence().cacheResult(ncraInspections);
	}

	/**
	 * Creates a new ncra inspection with the primary key. Does not add the ncra inspection to the database.
	 *
	 * @param ncraInspectionId the primary key for the new ncra inspection
	 * @return the new ncra inspection
	 */
	public static NcraInspection create(long ncraInspectionId) {
		return getPersistence().create(ncraInspectionId);
	}

	/**
	 * Removes the ncra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection that was removed
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection remove(long ncraInspectionId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().remove(ncraInspectionId);
	}

	public static NcraInspection updateImpl(NcraInspection ncraInspection) {
		return getPersistence().updateImpl(ncraInspection);
	}

	/**
	 * Returns the ncra inspection with the primary key or throws a <code>NoSuchNcraInspectionException</code> if it could not be found.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection findByPrimaryKey(long ncraInspectionId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getPersistence().findByPrimaryKey(ncraInspectionId);
	}

	/**
	 * Returns the ncra inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection, or <code>null</code> if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection fetchByPrimaryKey(long ncraInspectionId) {
		return getPersistence().fetchByPrimaryKey(ncraInspectionId);
	}

	/**
	 * Returns all the ncra inspections.
	 *
	 * @return the ncra inspections
	 */
	public static List<NcraInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of ncra inspections
	 */
	public static List<NcraInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra inspections
	 */
	public static List<NcraInspection> findAll(
		int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra inspections
	 */
	public static List<NcraInspection> findAll(
		int start, int end, OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncra inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncra inspections.
	 *
	 * @return the number of ncra inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcraInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcraInspectionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcraInspectionPersistence _persistence;

}