/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.model.NcbjInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj inspection service. This utility wraps <code>com.nbp.ncbj.stages.services.service.persistence.impl.NcbjInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjInspectionPersistence
 * @generated
 */
public class NcbjInspectionUtil {

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
	public static void clearCache(NcbjInspection ncbjInspection) {
		getPersistence().clearCache(ncbjInspection);
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
	public static Map<Serializable, NcbjInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjInspection update(NcbjInspection ncbjInspection) {
		return getPersistence().update(ncbjInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjInspection update(
		NcbjInspection ncbjInspection, ServiceContext serviceContext) {

		return getPersistence().update(ncbjInspection, serviceContext);
	}

	/**
	 * Returns the ncbj inspection where caseId = &#63; or throws a <code>NoSuchNcbjInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbjInspectionBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbjInspectionBy_CI(caseId);
	}

	/**
	 * Returns the ncbj inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbjInspectionBy_CI(String caseId) {
		return getPersistence().fetchBygetNcbjInspectionBy_CI(caseId);
	}

	/**
	 * Returns the ncbj inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbjInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbjInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the ncbj inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj inspection that was removed
	 */
	public static NcbjInspection removeBygetNcbjInspectionBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().removeBygetNcbjInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of ncbj inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj inspections
	 */
	public static int countBygetNcbjInspectionBy_CI(String caseId) {
		return getPersistence().countBygetNcbjInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId) {

		return getPersistence().findBygetNcbj_FBAI(ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetNcbj_FBAI(
			ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().findBygetNcbj_FBAI(
			ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbj_FBAI(
			ncbjApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_FBAI_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_FBAI_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_FBAI_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_FBAI_First(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_FBAI_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_FBAI_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_FBAI_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_FBAI_Last(
			ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public static NcbjInspection[] findBygetNcbj_FBAI_PrevAndNext(
			long ncbjInspectionId, long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_FBAI_PrevAndNext(
			ncbjInspectionId, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj inspections where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetNcbj_FBAI(long ncbjApplicationId) {
		getPersistence().removeBygetNcbj_FBAI(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj inspections
	 */
	public static int countBygetNcbj_FBAI(long ncbjApplicationId) {
		return getPersistence().countBygetNcbj_FBAI(ncbjApplicationId);
	}

	/**
	 * Returns all the ncbj inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseId(String caseId) {
		return getPersistence().findBygetNcbj_CaseId(caseId);
	}

	/**
	 * Returns a range of all the ncbj inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetNcbj_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().findBygetNcbj_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbj_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_CaseId_First(
			String caseId, OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_CaseId_First(
		String caseId, OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_CaseId_Last(
			String caseId, OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_CaseId_Last(
		String caseId, OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public static NcbjInspection[] findBygetNcbj_CaseId_PrevAndNext(
			long ncbjInspectionId, String caseId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_CaseId_PrevAndNext(
			ncbjInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the ncbj inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetNcbj_CaseId(String caseId) {
		getPersistence().removeBygetNcbj_CaseId(caseId);
	}

	/**
	 * Returns the number of ncbj inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj inspections
	 */
	public static int countBygetNcbj_CaseId(String caseId) {
		return getPersistence().countBygetNcbj_CaseId(caseId);
	}

	/**
	 * Returns all the ncbj inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_Status(String status) {
		return getPersistence().findBygetNcbj_Status(status);
	}

	/**
	 * Returns a range of all the ncbj inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_Status(
		String status, int start, int end) {

		return getPersistence().findBygetNcbj_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_Status(
		String status, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().findBygetNcbj_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_Status(
		String status, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbj_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_Status_First(
			String status, OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_Status_First(
		String status, OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_Status_Last(
			String status, OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_Status_Last(
		String status, OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public static NcbjInspection[] findBygetNcbj_Status_PrevAndNext(
			long ncbjInspectionId, String status,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_Status_PrevAndNext(
			ncbjInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the ncbj inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetNcbj_Status(String status) {
		getPersistence().removeBygetNcbj_Status(status);
	}

	/**
	 * Returns the number of ncbj inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncbj inspections
	 */
	public static int countBygetNcbj_Status(String status) {
		return getPersistence().countBygetNcbj_Status(status);
	}

	/**
	 * Returns all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetNcbj_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetNcbj_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().findBygetNcbj_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbj_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public static NcbjInspection[] findBygetNcbj_CaseIdStatus_PrevAndNext(
			long ncbjInspectionId, String status, String caseId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_CaseIdStatus_PrevAndNext(
			ncbjInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the ncbj inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetNcbj_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetNcbj_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching ncbj inspections
	 */
	public static int countBygetNcbj_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().countBygetNcbj_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId) {

		return getPersistence().findBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId);
	}

	/**
	 * Returns a range of all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId, int start, int end) {

		return getPersistence().findBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().findBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	public static List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_CaseIdAppId_First(
			String status, long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_CaseIdAppId_First(
			status, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_CaseIdAppId_First(
		String status, long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_CaseIdAppId_First(
			status, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetNcbj_CaseIdAppId_Last(
			String status, long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_CaseIdAppId_Last(
			status, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetNcbj_CaseIdAppId_Last(
		String status, long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().fetchBygetNcbj_CaseIdAppId_Last(
			status, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public static NcbjInspection[] findBygetNcbj_CaseIdAppId_PrevAndNext(
			long ncbjInspectionId, String status, long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetNcbj_CaseIdAppId_PrevAndNext(
			ncbjInspectionId, status, ncbjApplicationId, orderByComparator);
	}

	/**
	 * Removes all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 */
	public static void removeBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId) {

		getPersistence().removeBygetNcbj_CaseIdAppId(status, ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj inspections
	 */
	public static int countBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId) {

		return getPersistence().countBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId);
	}

	/**
	 * Returns the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection findBygetInspecByStatus_SlotBook_AppId(
			String status, long slotBookedByUser, long ncbjApplicationId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findBygetInspecByStatus_SlotBook_AppId(
			status, slotBookedByUser, ncbjApplicationId);
	}

	/**
	 * Returns the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetInspecByStatus_SlotBook_AppId(
		String status, long slotBookedByUser, long ncbjApplicationId) {

		return getPersistence().fetchBygetInspecByStatus_SlotBook_AppId(
			status, slotBookedByUser, ncbjApplicationId);
	}

	/**
	 * Returns the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	public static NcbjInspection fetchBygetInspecByStatus_SlotBook_AppId(
		String status, long slotBookedByUser, long ncbjApplicationId,
		boolean useFinderCache) {

		return getPersistence().fetchBygetInspecByStatus_SlotBook_AppId(
			status, slotBookedByUser, ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj inspection that was removed
	 */
	public static NcbjInspection removeBygetInspecByStatus_SlotBook_AppId(
			String status, long slotBookedByUser, long ncbjApplicationId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().removeBygetInspecByStatus_SlotBook_AppId(
			status, slotBookedByUser, ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj inspections where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj inspections
	 */
	public static int countBygetInspecByStatus_SlotBook_AppId(
		String status, long slotBookedByUser, long ncbjApplicationId) {

		return getPersistence().countBygetInspecByStatus_SlotBook_AppId(
			status, slotBookedByUser, ncbjApplicationId);
	}

	/**
	 * Caches the ncbj inspection in the entity cache if it is enabled.
	 *
	 * @param ncbjInspection the ncbj inspection
	 */
	public static void cacheResult(NcbjInspection ncbjInspection) {
		getPersistence().cacheResult(ncbjInspection);
	}

	/**
	 * Caches the ncbj inspections in the entity cache if it is enabled.
	 *
	 * @param ncbjInspections the ncbj inspections
	 */
	public static void cacheResult(List<NcbjInspection> ncbjInspections) {
		getPersistence().cacheResult(ncbjInspections);
	}

	/**
	 * Creates a new ncbj inspection with the primary key. Does not add the ncbj inspection to the database.
	 *
	 * @param ncbjInspectionId the primary key for the new ncbj inspection
	 * @return the new ncbj inspection
	 */
	public static NcbjInspection create(long ncbjInspectionId) {
		return getPersistence().create(ncbjInspectionId);
	}

	/**
	 * Removes the ncbj inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection that was removed
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public static NcbjInspection remove(long ncbjInspectionId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().remove(ncbjInspectionId);
	}

	public static NcbjInspection updateImpl(NcbjInspection ncbjInspection) {
		return getPersistence().updateImpl(ncbjInspection);
	}

	/**
	 * Returns the ncbj inspection with the primary key or throws a <code>NoSuchNcbjInspectionException</code> if it could not be found.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	public static NcbjInspection findByPrimaryKey(long ncbjInspectionId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjInspectionException {

		return getPersistence().findByPrimaryKey(ncbjInspectionId);
	}

	/**
	 * Returns the ncbj inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection, or <code>null</code> if a ncbj inspection with the primary key could not be found
	 */
	public static NcbjInspection fetchByPrimaryKey(long ncbjInspectionId) {
		return getPersistence().fetchByPrimaryKey(ncbjInspectionId);
	}

	/**
	 * Returns all the ncbj inspections.
	 *
	 * @return the ncbj inspections
	 */
	public static List<NcbjInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of ncbj inspections
	 */
	public static List<NcbjInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj inspections
	 */
	public static List<NcbjInspection> findAll(
		int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj inspections
	 */
	public static List<NcbjInspection> findAll(
		int start, int end, OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj inspections.
	 *
	 * @return the number of ncbj inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcbjInspectionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcbjInspectionPersistence _persistence;

}