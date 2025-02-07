/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.stages.services.model.CreativeInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative inspection service. This utility wraps <code>com.nbp.creative.stages.services.service.persistence.impl.CreativeInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeInspectionPersistence
 * @generated
 */
public class CreativeInspectionUtil {

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
	public static void clearCache(CreativeInspection creativeInspection) {
		getPersistence().clearCache(creativeInspection);
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
	public static Map<Serializable, CreativeInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeInspection update(
		CreativeInspection creativeInspection) {

		return getPersistence().update(creativeInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeInspection update(
		CreativeInspection creativeInspection, ServiceContext serviceContext) {

		return getPersistence().update(creativeInspection, serviceContext);
	}

	/**
	 * Returns the creative inspection where caseId = &#63; or throws a <code>NoSuchCreativeInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCreativeInspectionBy_CI(
			String caseId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCreativeInspectionBy_CI(caseId);
	}

	/**
	 * Returns the creative inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCreativeInspectionBy_CI(
		String caseId) {

		return getPersistence().fetchBygetCreativeInspectionBy_CI(caseId);
	}

	/**
	 * Returns the creative inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCreativeInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the creative inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the creative inspection that was removed
	 */
	public static CreativeInspection removeBygetCreativeInspectionBy_CI(
			String caseId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().removeBygetCreativeInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of creative inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative inspections
	 */
	public static int countBygetCreativeInspectionBy_CI(String caseId) {
		return getPersistence().countBygetCreativeInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId) {

		return getPersistence().findBygetCI_CAI(creativeApplicationId);
	}

	/**
	 * Returns a range of all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId, int start, int end) {

		return getPersistence().findBygetCI_CAI(
			creativeApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().findBygetCI_CAI(
			creativeApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative inspections where creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CAI(
		long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CAI(
			creativeApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_CAI_First(
			long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CAI_First(
			creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the first creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_CAI_First(
		long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CAI_First(
			creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_CAI_Last(
			long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CAI_Last(
			creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_CAI_Last(
		long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CAI_Last(
			creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where creativeApplicationId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection[] findBygetCI_CAI_PrevAndNext(
			long creativeInspectionId, long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CAI_PrevAndNext(
			creativeInspectionId, creativeApplicationId, orderByComparator);
	}

	/**
	 * Removes all the creative inspections where creativeApplicationId = &#63; from the database.
	 *
	 * @param creativeApplicationId the creative application ID
	 */
	public static void removeBygetCI_CAI(long creativeApplicationId) {
		getPersistence().removeBygetCI_CAI(creativeApplicationId);
	}

	/**
	 * Returns the number of creative inspections where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative inspections
	 */
	public static int countBygetCI_CAI(long creativeApplicationId) {
		return getPersistence().countBygetCI_CAI(creativeApplicationId);
	}

	/**
	 * Returns all the creative inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseId(String caseId) {
		return getPersistence().findBygetCI_CaseId(caseId);
	}

	/**
	 * Returns a range of all the creative inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetCI_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().findBygetCI_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_CaseId_First(
			String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_CaseId_First(
		String caseId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_CaseId_Last(
			String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_CaseId_Last(
		String caseId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where caseId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection[] findBygetCI_CaseId_PrevAndNext(
			long creativeInspectionId, String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CaseId_PrevAndNext(
			creativeInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the creative inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCI_CaseId(String caseId) {
		getPersistence().removeBygetCI_CaseId(caseId);
	}

	/**
	 * Returns the number of creative inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative inspections
	 */
	public static int countBygetCI_CaseId(String caseId) {
		return getPersistence().countBygetCI_CaseId(caseId);
	}

	/**
	 * Returns all the creative inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_Status(String status) {
		return getPersistence().findBygetCI_Status(status);
	}

	/**
	 * Returns a range of all the creative inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_Status(
		String status, int start, int end) {

		return getPersistence().findBygetCI_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().findBygetCI_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_Status_First(
			String status,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_Status_First(
		String status,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_Status_Last(
			String status,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_Status_Last(
		String status,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where status = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection[] findBygetCI_Status_PrevAndNext(
			long creativeInspectionId, String status,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_Status_PrevAndNext(
			creativeInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the creative inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetCI_Status(String status) {
		getPersistence().removeBygetCI_Status(status);
	}

	/**
	 * Returns the number of creative inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching creative inspections
	 */
	public static int countBygetCI_Status(String status) {
		return getPersistence().countBygetCI_Status(status);
	}

	/**
	 * Returns all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetCI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetCI_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection[] findBygetCI_CaseIdStatus_PrevAndNext(
			long creativeInspectionId, String status, String caseId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CaseIdStatus_PrevAndNext(
			creativeInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the creative inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetCI_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetCI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of creative inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching creative inspections
	 */
	public static int countBygetCI_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetCI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, creativeApplicationId);
	}

	/**
	 * Returns a range of all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId, int start, int end) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, creativeApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, creativeApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative inspections
	 */
	public static List<CreativeInspection> findBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId, int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CaseIdApplicationId(
			status, creativeApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_CaseIdApplicationId_First(
			String status, long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CaseIdApplicationId_First(
			status, creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the first creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_CaseIdApplicationId_First(
		String status, long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdApplicationId_First(
			status, creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection findBygetCI_CaseIdApplicationId_Last(
			String status, long creativeApplicationId,
			OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CaseIdApplicationId_Last(
			status, creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection fetchBygetCI_CaseIdApplicationId_Last(
		String status, long creativeApplicationId,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CaseIdApplicationId_Last(
			status, creativeApplicationId, orderByComparator);
	}

	/**
	 * Returns the creative inspections before and after the current creative inspection in the ordered set where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param creativeInspectionId the primary key of the current creative inspection
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection[]
			findBygetCI_CaseIdApplicationId_PrevAndNext(
				long creativeInspectionId, String status,
				long creativeApplicationId,
				OrderByComparator<CreativeInspection> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findBygetCI_CaseIdApplicationId_PrevAndNext(
			creativeInspectionId, status, creativeApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the creative inspections where status = &#63; and creativeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 */
	public static void removeBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId) {

		getPersistence().removeBygetCI_CaseIdApplicationId(
			status, creativeApplicationId);
	}

	/**
	 * Returns the number of creative inspections where status = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative inspections
	 */
	public static int countBygetCI_CaseIdApplicationId(
		String status, long creativeApplicationId) {

		return getPersistence().countBygetCI_CaseIdApplicationId(
			status, creativeApplicationId);
	}

	/**
	 * Returns the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; or throws a <code>NoSuchCreativeInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspection
	 * @throws NoSuchCreativeInspectionException if a matching creative inspection could not be found
	 */
	public static CreativeInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long creativeApplicationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, creativeApplicationId);
	}

	/**
	 * Returns the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long creativeApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, creativeApplicationId);
	}

	/**
	 * Returns the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative inspection, or <code>null</code> if a matching creative inspection could not be found
	 */
	public static CreativeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long creativeApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, creativeApplicationId,
				useFinderCache);
	}

	/**
	 * Removes the creative inspection where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the creative inspection that was removed
	 */
	public static CreativeInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long creativeApplicationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, creativeApplicationId);
	}

	/**
	 * Returns the number of creative inspections where status = &#63; and slotBookedByUser = &#63; and creativeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long creativeApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, creativeApplicationId);
	}

	/**
	 * Caches the creative inspection in the entity cache if it is enabled.
	 *
	 * @param creativeInspection the creative inspection
	 */
	public static void cacheResult(CreativeInspection creativeInspection) {
		getPersistence().cacheResult(creativeInspection);
	}

	/**
	 * Caches the creative inspections in the entity cache if it is enabled.
	 *
	 * @param creativeInspections the creative inspections
	 */
	public static void cacheResult(
		List<CreativeInspection> creativeInspections) {

		getPersistence().cacheResult(creativeInspections);
	}

	/**
	 * Creates a new creative inspection with the primary key. Does not add the creative inspection to the database.
	 *
	 * @param creativeInspectionId the primary key for the new creative inspection
	 * @return the new creative inspection
	 */
	public static CreativeInspection create(long creativeInspectionId) {
		return getPersistence().create(creativeInspectionId);
	}

	/**
	 * Removes the creative inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection that was removed
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection remove(long creativeInspectionId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().remove(creativeInspectionId);
	}

	public static CreativeInspection updateImpl(
		CreativeInspection creativeInspection) {

		return getPersistence().updateImpl(creativeInspection);
	}

	/**
	 * Returns the creative inspection with the primary key or throws a <code>NoSuchCreativeInspectionException</code> if it could not be found.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection
	 * @throws NoSuchCreativeInspectionException if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection findByPrimaryKey(long creativeInspectionId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getPersistence().findByPrimaryKey(creativeInspectionId);
	}

	/**
	 * Returns the creative inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection, or <code>null</code> if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection fetchByPrimaryKey(
		long creativeInspectionId) {

		return getPersistence().fetchByPrimaryKey(creativeInspectionId);
	}

	/**
	 * Returns all the creative inspections.
	 *
	 * @return the creative inspections
	 */
	public static List<CreativeInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of creative inspections
	 */
	public static List<CreativeInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative inspections
	 */
	public static List<CreativeInspection> findAll(
		int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative inspections
	 */
	public static List<CreativeInspection> findAll(
		int start, int end,
		OrderByComparator<CreativeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative inspections.
	 *
	 * @return the number of creative inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeInspectionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeInspectionPersistence _persistence;

}