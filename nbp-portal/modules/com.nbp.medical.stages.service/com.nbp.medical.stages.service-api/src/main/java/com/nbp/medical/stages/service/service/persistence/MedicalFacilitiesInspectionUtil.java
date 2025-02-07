/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.stages.service.model.MedicalFacilitiesInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical facilities inspection service. This utility wraps <code>com.nbp.medical.stages.service.service.persistence.impl.MedicalFacilitiesInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesInspectionPersistence
 * @generated
 */
public class MedicalFacilitiesInspectionUtil {

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
		MedicalFacilitiesInspection medicalFacilitiesInspection) {

		getPersistence().clearCache(medicalFacilitiesInspection);
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
	public static Map<Serializable, MedicalFacilitiesInspection>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalFacilitiesInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalFacilitiesInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalFacilitiesInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalFacilitiesInspection update(
		MedicalFacilitiesInspection medicalFacilitiesInspection) {

		return getPersistence().update(medicalFacilitiesInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalFacilitiesInspection update(
		MedicalFacilitiesInspection medicalFacilitiesInspection,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalFacilitiesInspection, serviceContext);
	}

	/**
	 * Returns the medical facilities inspection where caseId = &#63; or throws a <code>NoSuchMedicalFacilitiesInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection findBygetMedicalInspectionBy_CI(
			String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMedicalInspectionBy_CI(caseId);
	}

	/**
	 * Returns the medical facilities inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMedicalInspectionBy_CI(
		String caseId) {

		return getPersistence().fetchBygetMedicalInspectionBy_CI(caseId);
	}

	/**
	 * Returns the medical facilities inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMedicalInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMedicalInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the medical facilities inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical facilities inspection that was removed
	 */
	public static MedicalFacilitiesInspection removeBygetMedicalInspectionBy_CI(
			String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().removeBygetMedicalInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of medical facilities inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical facilities inspections
	 */
	public static int countBygetMedicalInspectionBy_CI(String caseId) {
		return getPersistence().countBygetMedicalInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId) {

		return getPersistence().findBygetMed_FBAI(medicalApplicationId);
	}

	/**
	 * Returns a range of all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId, int start, int end) {

		return getPersistence().findBygetMed_FBAI(
			medicalApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().findBygetMed_FBAI(
			medicalApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_FBAI(
		long medicalApplicationId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMed_FBAI(
			medicalApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection findBygetMed_FBAI_First(
			long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_FBAI_First(
			medicalApplicationId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMed_FBAI_First(
		long medicalApplicationId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_FBAI_First(
			medicalApplicationId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection findBygetMed_FBAI_Last(
			long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_FBAI_Last(
			medicalApplicationId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMed_FBAI_Last(
		long medicalApplicationId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_FBAI_Last(
			medicalApplicationId, orderByComparator);
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where medicalApplicationId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public static MedicalFacilitiesInspection[] findBygetMed_FBAI_PrevAndNext(
			long medicalInspectionId, long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_FBAI_PrevAndNext(
			medicalInspectionId, medicalApplicationId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities inspections where medicalApplicationId = &#63; from the database.
	 *
	 * @param medicalApplicationId the medical application ID
	 */
	public static void removeBygetMed_FBAI(long medicalApplicationId) {
		getPersistence().removeBygetMed_FBAI(medicalApplicationId);
	}

	/**
	 * Returns the number of medical facilities inspections where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical facilities inspections
	 */
	public static int countBygetMed_FBAI(long medicalApplicationId) {
		return getPersistence().countBygetMed_FBAI(medicalApplicationId);
	}

	/**
	 * Returns all the medical facilities inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId) {

		return getPersistence().findBygetMed_CaseId(caseId);
	}

	/**
	 * Returns a range of all the medical facilities inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetMed_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().findBygetMed_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMed_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection findBygetMed_CaseId_First(
			String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMed_CaseId_First(
		String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection findBygetMed_CaseId_Last(
			String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMed_CaseId_Last(
		String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where caseId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public static MedicalFacilitiesInspection[] findBygetMed_CaseId_PrevAndNext(
			long medicalInspectionId, String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_CaseId_PrevAndNext(
			medicalInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetMed_CaseId(String caseId) {
		getPersistence().removeBygetMed_CaseId(caseId);
	}

	/**
	 * Returns the number of medical facilities inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical facilities inspections
	 */
	public static int countBygetMed_CaseId(String caseId) {
		return getPersistence().countBygetMed_CaseId(caseId);
	}

	/**
	 * Returns all the medical facilities inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status) {

		return getPersistence().findBygetMed_Status(status);
	}

	/**
	 * Returns a range of all the medical facilities inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status, int start, int end) {

		return getPersistence().findBygetMed_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().findBygetMed_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_Status(
		String status, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMed_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection findBygetMed_Status_First(
			String status,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMed_Status_First(
		String status,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection findBygetMed_Status_Last(
			String status,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMed_Status_Last(
		String status,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where status = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public static MedicalFacilitiesInspection[] findBygetMed_Status_PrevAndNext(
			long medicalInspectionId, String status,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_Status_PrevAndNext(
			medicalInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the medical facilities inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetMed_Status(String status) {
		getPersistence().removeBygetMed_Status(status);
	}

	/**
	 * Returns the number of medical facilities inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching medical facilities inspections
	 */
	public static int countBygetMed_Status(String status) {
		return getPersistence().countBygetMed_Status(status);
	}

	/**
	 * Returns all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetMed_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetMed_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().findBygetMed_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findBygetMed_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMed_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection findBygetMed_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMed_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection findBygetMed_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection fetchBygetMed_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public static MedicalFacilitiesInspection[]
			findBygetMed_CaseIdStatus_PrevAndNext(
				long medicalInspectionId, String status, String caseId,
				OrderByComparator<MedicalFacilitiesInspection>
					orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_CaseIdStatus_PrevAndNext(
			medicalInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetMed_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetMed_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of medical facilities inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching medical facilities inspections
	 */
	public static int countBygetMed_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetMed_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdApplicationId(
			String status, long medicalApplicationId) {

		return getPersistence().findBygetMed_CaseIdApplicationId(
			status, medicalApplicationId);
	}

	/**
	 * Returns a range of all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdApplicationId(
			String status, long medicalApplicationId, int start, int end) {

		return getPersistence().findBygetMed_CaseIdApplicationId(
			status, medicalApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdApplicationId(
			String status, long medicalApplicationId, int start, int end,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().findBygetMed_CaseIdApplicationId(
			status, medicalApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection>
		findBygetMed_CaseIdApplicationId(
			String status, long medicalApplicationId, int start, int end,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetMed_CaseIdApplicationId(
			status, medicalApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection
			findBygetMed_CaseIdApplicationId_First(
				String status, long medicalApplicationId,
				OrderByComparator<MedicalFacilitiesInspection>
					orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_CaseIdApplicationId_First(
			status, medicalApplicationId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection
		fetchBygetMed_CaseIdApplicationId_First(
			String status, long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_CaseIdApplicationId_First(
			status, medicalApplicationId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection
			findBygetMed_CaseIdApplicationId_Last(
				String status, long medicalApplicationId,
				OrderByComparator<MedicalFacilitiesInspection>
					orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_CaseIdApplicationId_Last(
			status, medicalApplicationId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection
		fetchBygetMed_CaseIdApplicationId_Last(
			String status, long medicalApplicationId,
			OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().fetchBygetMed_CaseIdApplicationId_Last(
			status, medicalApplicationId, orderByComparator);
	}

	/**
	 * Returns the medical facilities inspections before and after the current medical facilities inspection in the ordered set where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param medicalInspectionId the primary key of the current medical facilities inspection
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public static MedicalFacilitiesInspection[]
			findBygetMed_CaseIdApplicationId_PrevAndNext(
				long medicalInspectionId, String status,
				long medicalApplicationId,
				OrderByComparator<MedicalFacilitiesInspection>
					orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findBygetMed_CaseIdApplicationId_PrevAndNext(
			medicalInspectionId, status, medicalApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the medical facilities inspections where status = &#63; and medicalApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 */
	public static void removeBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId) {

		getPersistence().removeBygetMed_CaseIdApplicationId(
			status, medicalApplicationId);
	}

	/**
	 * Returns the number of medical facilities inspections where status = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical facilities inspections
	 */
	public static int countBygetMed_CaseIdApplicationId(
		String status, long medicalApplicationId) {

		return getPersistence().countBygetMed_CaseIdApplicationId(
			status, medicalApplicationId);
	}

	/**
	 * Returns the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; or throws a <code>NoSuchMedicalFacilitiesInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long medicalApplicationId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, medicalApplicationId);
	}

	/**
	 * Returns the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long medicalApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, medicalApplicationId);
	}

	/**
	 * Returns the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities inspection, or <code>null</code> if a matching medical facilities inspection could not be found
	 */
	public static MedicalFacilitiesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long medicalApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, medicalApplicationId, useFinderCache);
	}

	/**
	 * Removes the medical facilities inspection where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the medical facilities inspection that was removed
	 */
	public static MedicalFacilitiesInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long medicalApplicationId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, medicalApplicationId);
	}

	/**
	 * Returns the number of medical facilities inspections where status = &#63; and slotBookedByUser = &#63; and medicalApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical facilities inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long medicalApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, medicalApplicationId);
	}

	/**
	 * Caches the medical facilities inspection in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesInspection the medical facilities inspection
	 */
	public static void cacheResult(
		MedicalFacilitiesInspection medicalFacilitiesInspection) {

		getPersistence().cacheResult(medicalFacilitiesInspection);
	}

	/**
	 * Caches the medical facilities inspections in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesInspections the medical facilities inspections
	 */
	public static void cacheResult(
		List<MedicalFacilitiesInspection> medicalFacilitiesInspections) {

		getPersistence().cacheResult(medicalFacilitiesInspections);
	}

	/**
	 * Creates a new medical facilities inspection with the primary key. Does not add the medical facilities inspection to the database.
	 *
	 * @param medicalInspectionId the primary key for the new medical facilities inspection
	 * @return the new medical facilities inspection
	 */
	public static MedicalFacilitiesInspection create(long medicalInspectionId) {
		return getPersistence().create(medicalInspectionId);
	}

	/**
	 * Removes the medical facilities inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection that was removed
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public static MedicalFacilitiesInspection remove(long medicalInspectionId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().remove(medicalInspectionId);
	}

	public static MedicalFacilitiesInspection updateImpl(
		MedicalFacilitiesInspection medicalFacilitiesInspection) {

		return getPersistence().updateImpl(medicalFacilitiesInspection);
	}

	/**
	 * Returns the medical facilities inspection with the primary key or throws a <code>NoSuchMedicalFacilitiesInspectionException</code> if it could not be found.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection
	 * @throws NoSuchMedicalFacilitiesInspectionException if a medical facilities inspection with the primary key could not be found
	 */
	public static MedicalFacilitiesInspection findByPrimaryKey(
			long medicalInspectionId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return getPersistence().findByPrimaryKey(medicalInspectionId);
	}

	/**
	 * Returns the medical facilities inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection, or <code>null</code> if a medical facilities inspection with the primary key could not be found
	 */
	public static MedicalFacilitiesInspection fetchByPrimaryKey(
		long medicalInspectionId) {

		return getPersistence().fetchByPrimaryKey(medicalInspectionId);
	}

	/**
	 * Returns all the medical facilities inspections.
	 *
	 * @return the medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities inspections
	 */
	public static List<MedicalFacilitiesInspection> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical facilities inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical facilities inspections.
	 *
	 * @return the number of medical facilities inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalFacilitiesInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalFacilitiesInspectionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalFacilitiesInspectionPersistence _persistence;

}