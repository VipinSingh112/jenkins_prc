/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.stages.services.model.OsiInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi inspection service. This utility wraps <code>com.nbp.osi.stages.services.service.persistence.impl.OsiInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInspectionPersistence
 * @generated
 */
public class OsiInspectionUtil {

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
	public static void clearCache(OsiInspection osiInspection) {
		getPersistence().clearCache(osiInspection);
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
	public static Map<Serializable, OsiInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiInspection update(OsiInspection osiInspection) {
		return getPersistence().update(osiInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiInspection update(
		OsiInspection osiInspection, ServiceContext serviceContext) {

		return getPersistence().update(osiInspection, serviceContext);
	}

	/**
	 * Returns the osi inspection where caseId = &#63; or throws a <code>NoSuchOsiInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetOsiInspectionBy_CI(String caseId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOsiInspectionBy_CI(caseId);
	}

	/**
	 * Returns the osi inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOsiInspectionBy_CI(String caseId) {
		return getPersistence().fetchBygetOsiInspectionBy_CI(caseId);
	}

	/**
	 * Returns the osi inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOsiInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the osi inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi inspection that was removed
	 */
	public static OsiInspection removeBygetOsiInspectionBy_CI(String caseId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().removeBygetOsiInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of osi inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi inspections
	 */
	public static int countBygetOsiInspectionBy_CI(String caseId) {
		return getPersistence().countBygetOsiInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the osi inspections where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_OAI(long osiApplicationId) {
		return getPersistence().findBygetOSI_OAI(osiApplicationId);
	}

	/**
	 * Returns a range of all the osi inspections where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId, int start, int end) {

		return getPersistence().findBygetOSI_OAI(osiApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi inspections where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().findBygetOSI_OAI(
			osiApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi inspections where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSI_OAI(
			osiApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetOSI_OAI_First(
			long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_OAI_First(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the first osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOSI_OAI_First(
		long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetOSI_OAI_First(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetOSI_OAI_Last(
			long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_OAI_Last(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOSI_OAI_Last(
		long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetOSI_OAI_Last(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection[] findBygetOSI_OAI_PrevAndNext(
			long osiInspectionId, long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_OAI_PrevAndNext(
			osiInspectionId, osiApplicationId, orderByComparator);
	}

	/**
	 * Removes all the osi inspections where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	public static void removeBygetOSI_OAI(long osiApplicationId) {
		getPersistence().removeBygetOSI_OAI(osiApplicationId);
	}

	/**
	 * Returns the number of osi inspections where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi inspections
	 */
	public static int countBygetOSI_OAI(long osiApplicationId) {
		return getPersistence().countBygetOSI_OAI(osiApplicationId);
	}

	/**
	 * Returns all the osi inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseId(String caseId) {
		return getPersistence().findBygetOSI_CaseId(caseId);
	}

	/**
	 * Returns a range of all the osi inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetOSI_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().findBygetOSI_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSI_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetOSI_CaseId_First(
			String caseId, OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOSI_CaseId_First(
		String caseId, OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetOSI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetOSI_CaseId_Last(
			String caseId, OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOSI_CaseId_Last(
		String caseId, OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetOSI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection[] findBygetOSI_CaseId_PrevAndNext(
			long osiInspectionId, String caseId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_CaseId_PrevAndNext(
			osiInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the osi inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetOSI_CaseId(String caseId) {
		getPersistence().removeBygetOSI_CaseId(caseId);
	}

	/**
	 * Returns the number of osi inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi inspections
	 */
	public static int countBygetOSI_CaseId(String caseId) {
		return getPersistence().countBygetOSI_CaseId(caseId);
	}

	/**
	 * Returns all the osi inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi inspections
	 */
	public static List<OsiInspection> findBygetMI_Status(String status) {
		return getPersistence().findBygetMI_Status(status);
	}

	/**
	 * Returns a range of all the osi inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetMI_Status(
		String status, int start, int end) {

		return getPersistence().findBygetMI_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().findBygetMI_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetMI_Status_First(
			String status, OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetMI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetMI_Status_First(
		String status, OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetMI_Status_Last(
			String status, OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetMI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetMI_Status_Last(
		String status, OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where status = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection[] findBygetMI_Status_PrevAndNext(
			long osiInspectionId, String status,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetMI_Status_PrevAndNext(
			osiInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the osi inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetMI_Status(String status) {
		getPersistence().removeBygetMI_Status(status);
	}

	/**
	 * Returns the number of osi inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi inspections
	 */
	public static int countBygetMI_Status(String status) {
		return getPersistence().countBygetMI_Status(status);
	}

	/**
	 * Returns all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetOSI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetOSI_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().findBygetOSI_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetOSI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOSI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetOSI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetOSI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOSI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetOSI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection[] findBygetOSI_CaseIdStatus_PrevAndNext(
			long osiInspectionId, String status, String caseId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_CaseIdStatus_PrevAndNext(
			osiInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the osi inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetOSI_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetOSI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching osi inspections
	 */
	public static int countBygetOSI_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetOSI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId) {

		return getPersistence().findBygetOSI_CaseIdApplicationId(
			status, osiApplicationId);
	}

	/**
	 * Returns a range of all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId, int start, int end) {

		return getPersistence().findBygetOSI_CaseIdApplicationId(
			status, osiApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().findBygetOSI_CaseIdApplicationId(
			status, osiApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	public static List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSI_CaseIdApplicationId(
			status, osiApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetOSI_CaseIdApplicationId_First(
			String status, long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_CaseIdApplicationId_First(
			status, osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOSI_CaseIdApplicationId_First(
		String status, long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetOSI_CaseIdApplicationId_First(
			status, osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection findBygetOSI_CaseIdApplicationId_Last(
			String status, long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_CaseIdApplicationId_Last(
			status, osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection fetchBygetOSI_CaseIdApplicationId_Last(
		String status, long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().fetchBygetOSI_CaseIdApplicationId_Last(
			status, osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection[] findBygetOSI_CaseIdApplicationId_PrevAndNext(
			long osiInspectionId, String status, long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findBygetOSI_CaseIdApplicationId_PrevAndNext(
			osiInspectionId, status, osiApplicationId, orderByComparator);
	}

	/**
	 * Removes all the osi inspections where status = &#63; and osiApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 */
	public static void removeBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId) {

		getPersistence().removeBygetOSI_CaseIdApplicationId(
			status, osiApplicationId);
	}

	/**
	 * Returns the number of osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi inspections
	 */
	public static int countBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId) {

		return getPersistence().countBygetOSI_CaseIdApplicationId(
			status, osiApplicationId);
	}

	/**
	 * Returns the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; or throws a <code>NoSuchOsiInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	public static OsiInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long osiApplicationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, osiApplicationId);
	}

	/**
	 * Returns the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long osiApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, osiApplicationId);
	}

	/**
	 * Returns the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	public static OsiInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long osiApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, osiApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the osi inspection that was removed
	 */
	public static OsiInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long osiApplicationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, osiApplicationId);
	}

	/**
	 * Returns the number of osi inspections where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long osiApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, osiApplicationId);
	}

	/**
	 * Caches the osi inspection in the entity cache if it is enabled.
	 *
	 * @param osiInspection the osi inspection
	 */
	public static void cacheResult(OsiInspection osiInspection) {
		getPersistence().cacheResult(osiInspection);
	}

	/**
	 * Caches the osi inspections in the entity cache if it is enabled.
	 *
	 * @param osiInspections the osi inspections
	 */
	public static void cacheResult(List<OsiInspection> osiInspections) {
		getPersistence().cacheResult(osiInspections);
	}

	/**
	 * Creates a new osi inspection with the primary key. Does not add the osi inspection to the database.
	 *
	 * @param osiInspectionId the primary key for the new osi inspection
	 * @return the new osi inspection
	 */
	public static OsiInspection create(long osiInspectionId) {
		return getPersistence().create(osiInspectionId);
	}

	/**
	 * Removes the osi inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection that was removed
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection remove(long osiInspectionId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().remove(osiInspectionId);
	}

	public static OsiInspection updateImpl(OsiInspection osiInspection) {
		return getPersistence().updateImpl(osiInspection);
	}

	/**
	 * Returns the osi inspection with the primary key or throws a <code>NoSuchOsiInspectionException</code> if it could not be found.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection findByPrimaryKey(long osiInspectionId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getPersistence().findByPrimaryKey(osiInspectionId);
	}

	/**
	 * Returns the osi inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection, or <code>null</code> if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection fetchByPrimaryKey(long osiInspectionId) {
		return getPersistence().fetchByPrimaryKey(osiInspectionId);
	}

	/**
	 * Returns all the osi inspections.
	 *
	 * @return the osi inspections
	 */
	public static List<OsiInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of osi inspections
	 */
	public static List<OsiInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi inspections
	 */
	public static List<OsiInspection> findAll(
		int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi inspections
	 */
	public static List<OsiInspection> findAll(
		int start, int end, OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi inspections.
	 *
	 * @return the number of osi inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(OsiInspectionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile OsiInspectionPersistence _persistence;

}