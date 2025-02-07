/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.agriculture.stages.services.model.AgricultureInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture inspection service. This utility wraps <code>com.nbp.agriculture.stages.services.service.persistence.impl.AgricultureInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureInspectionPersistence
 * @generated
 */
public class AgricultureInspectionUtil {

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
	public static void clearCache(AgricultureInspection agricultureInspection) {
		getPersistence().clearCache(agricultureInspection);
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
	public static Map<Serializable, AgricultureInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureInspection update(
		AgricultureInspection agricultureInspection) {

		return getPersistence().update(agricultureInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureInspection update(
		AgricultureInspection agricultureInspection,
		ServiceContext serviceContext) {

		return getPersistence().update(agricultureInspection, serviceContext);
	}

	/**
	 * Returns the agriculture inspection where caseId = &#63; or throws a <code>NoSuchAgricultureInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetAgricultureInspectionBy_CI(
			String caseId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAgricultureInspectionBy_CI(caseId);
	}

	/**
	 * Returns the agriculture inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAgricultureInspectionBy_CI(
		String caseId) {

		return getPersistence().fetchBygetAgricultureInspectionBy_CI(caseId);
	}

	/**
	 * Returns the agriculture inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAgricultureInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the agriculture inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the agriculture inspection that was removed
	 */
	public static AgricultureInspection removeBygetAgricultureInspectionBy_CI(
			String caseId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().removeBygetAgricultureInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of agriculture inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture inspections
	 */
	public static int countBygetAgricultureInspectionBy_CI(String caseId) {
		return getPersistence().countBygetAgricultureInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the agriculture inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseId(
		String caseId) {

		return getPersistence().findBygetAI_CaseId(caseId);
	}

	/**
	 * Returns a range of all the agriculture inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetAI_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().findBygetAI_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAI_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetAI_CaseId_First(
			String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAI_CaseId_First(
		String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetAI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetAI_CaseId_Last(
			String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAI_CaseId_Last(
		String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetAI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where caseId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection[] findBygetAI_CaseId_PrevAndNext(
			long agricultureInspectionId, String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_CaseId_PrevAndNext(
			agricultureInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the agriculture inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetAI_CaseId(String caseId) {
		getPersistence().removeBygetAI_CaseId(caseId);
	}

	/**
	 * Returns the number of agriculture inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture inspections
	 */
	public static int countBygetAI_CaseId(String caseId) {
		return getPersistence().countBygetAI_CaseId(caseId);
	}

	/**
	 * Returns all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId) {

		return getPersistence().findBygetCI_CAI(agriApplicationId);
	}

	/**
	 * Returns a range of all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId, int start, int end) {

		return getPersistence().findBygetCI_CAI(agriApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().findBygetCI_CAI(
			agriApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetCI_CAI(
		long agriApplicationId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCI_CAI(
			agriApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetCI_CAI_First(
			long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetCI_CAI_First(
			agriApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetCI_CAI_First(
		long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CAI_First(
			agriApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetCI_CAI_Last(
			long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetCI_CAI_Last(
			agriApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetCI_CAI_Last(
		long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetCI_CAI_Last(
			agriApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where agriApplicationId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection[] findBygetCI_CAI_PrevAndNext(
			long agricultureInspectionId, long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetCI_CAI_PrevAndNext(
			agricultureInspectionId, agriApplicationId, orderByComparator);
	}

	/**
	 * Removes all the agriculture inspections where agriApplicationId = &#63; from the database.
	 *
	 * @param agriApplicationId the agri application ID
	 */
	public static void removeBygetCI_CAI(long agriApplicationId) {
		getPersistence().removeBygetCI_CAI(agriApplicationId);
	}

	/**
	 * Returns the number of agriculture inspections where agriApplicationId = &#63;.
	 *
	 * @param agriApplicationId the agri application ID
	 * @return the number of matching agriculture inspections
	 */
	public static int countBygetCI_CAI(long agriApplicationId) {
		return getPersistence().countBygetCI_CAI(agriApplicationId);
	}

	/**
	 * Returns all the agriculture inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_Status(
		String status) {

		return getPersistence().findBygetAI_Status(status);
	}

	/**
	 * Returns a range of all the agriculture inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_Status(
		String status, int start, int end) {

		return getPersistence().findBygetAI_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_Status(
		String status, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().findBygetAI_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_Status(
		String status, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAI_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetAI_Status_First(
			String status,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAI_Status_First(
		String status,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetAI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetAI_Status_Last(
			String status,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAI_Status_Last(
		String status,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetAI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where status = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection[] findBygetAI_Status_PrevAndNext(
			long agricultureInspectionId, String status,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_Status_PrevAndNext(
			agricultureInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the agriculture inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetAI_Status(String status) {
		getPersistence().removeBygetAI_Status(status);
	}

	/**
	 * Returns the number of agriculture inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching agriculture inspections
	 */
	public static int countBygetAI_Status(String status) {
		return getPersistence().countBygetAI_Status(status);
	}

	/**
	 * Returns all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetAI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetAI_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().findBygetAI_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetAI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetAI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetAI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetAI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection[] findBygetAI_CaseIdStatus_PrevAndNext(
			long agricultureInspectionId, String status, String caseId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_CaseIdStatus_PrevAndNext(
			agricultureInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the agriculture inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetAI_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetAI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of agriculture inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching agriculture inspections
	 */
	public static int countBygetAI_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetAI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId) {

		return getPersistence().findBygetAI_CaseIdApplicationId(
			status, agriApplicationId);
	}

	/**
	 * Returns a range of all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId, int start, int end) {

		return getPersistence().findBygetAI_CaseIdApplicationId(
			status, agriApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().findBygetAI_CaseIdApplicationId(
			status, agriApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture inspections
	 */
	public static List<AgricultureInspection> findBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId, int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAI_CaseIdApplicationId(
			status, agriApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetAI_CaseIdApplicationId_First(
			String status, long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_CaseIdApplicationId_First(
			status, agriApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAI_CaseIdApplicationId_First(
		String status, long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetAI_CaseIdApplicationId_First(
			status, agriApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection findBygetAI_CaseIdApplicationId_Last(
			String status, long agriApplicationId,
			OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_CaseIdApplicationId_Last(
			status, agriApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection fetchBygetAI_CaseIdApplicationId_Last(
		String status, long agriApplicationId,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().fetchBygetAI_CaseIdApplicationId_Last(
			status, agriApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriculture inspections before and after the current agriculture inspection in the ordered set where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param agricultureInspectionId the primary key of the current agriculture inspection
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection[]
			findBygetAI_CaseIdApplicationId_PrevAndNext(
				long agricultureInspectionId, String status,
				long agriApplicationId,
				OrderByComparator<AgricultureInspection> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findBygetAI_CaseIdApplicationId_PrevAndNext(
			agricultureInspectionId, status, agriApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the agriculture inspections where status = &#63; and agriApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 */
	public static void removeBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId) {

		getPersistence().removeBygetAI_CaseIdApplicationId(
			status, agriApplicationId);
	}

	/**
	 * Returns the number of agriculture inspections where status = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param agriApplicationId the agri application ID
	 * @return the number of matching agriculture inspections
	 */
	public static int countBygetAI_CaseIdApplicationId(
		String status, long agriApplicationId) {

		return getPersistence().countBygetAI_CaseIdApplicationId(
			status, agriApplicationId);
	}

	/**
	 * Returns the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; or throws a <code>NoSuchAgricultureInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long agriApplicationId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, agriApplicationId);
	}

	/**
	 * Returns the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long agriApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, agriApplicationId);
	}

	/**
	 * Returns the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture inspection, or <code>null</code> if a matching agriculture inspection could not be found
	 */
	public static AgricultureInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long agriApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, agriApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture inspection where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the agriculture inspection that was removed
	 */
	public static AgricultureInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long agriApplicationId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, agriApplicationId);
	}

	/**
	 * Returns the number of agriculture inspections where status = &#63; and slotBookedByUser = &#63; and agriApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param agriApplicationId the agri application ID
	 * @return the number of matching agriculture inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long agriApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, agriApplicationId);
	}

	/**
	 * Caches the agriculture inspection in the entity cache if it is enabled.
	 *
	 * @param agricultureInspection the agriculture inspection
	 */
	public static void cacheResult(
		AgricultureInspection agricultureInspection) {

		getPersistence().cacheResult(agricultureInspection);
	}

	/**
	 * Caches the agriculture inspections in the entity cache if it is enabled.
	 *
	 * @param agricultureInspections the agriculture inspections
	 */
	public static void cacheResult(
		List<AgricultureInspection> agricultureInspections) {

		getPersistence().cacheResult(agricultureInspections);
	}

	/**
	 * Creates a new agriculture inspection with the primary key. Does not add the agriculture inspection to the database.
	 *
	 * @param agricultureInspectionId the primary key for the new agriculture inspection
	 * @return the new agriculture inspection
	 */
	public static AgricultureInspection create(long agricultureInspectionId) {
		return getPersistence().create(agricultureInspectionId);
	}

	/**
	 * Removes the agriculture inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection that was removed
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection remove(long agricultureInspectionId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().remove(agricultureInspectionId);
	}

	public static AgricultureInspection updateImpl(
		AgricultureInspection agricultureInspection) {

		return getPersistence().updateImpl(agricultureInspection);
	}

	/**
	 * Returns the agriculture inspection with the primary key or throws a <code>NoSuchAgricultureInspectionException</code> if it could not be found.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection
	 * @throws NoSuchAgricultureInspectionException if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection findByPrimaryKey(
			long agricultureInspectionId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getPersistence().findByPrimaryKey(agricultureInspectionId);
	}

	/**
	 * Returns the agriculture inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection, or <code>null</code> if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection fetchByPrimaryKey(
		long agricultureInspectionId) {

		return getPersistence().fetchByPrimaryKey(agricultureInspectionId);
	}

	/**
	 * Returns all the agriculture inspections.
	 *
	 * @return the agriculture inspections
	 */
	public static List<AgricultureInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of agriculture inspections
	 */
	public static List<AgricultureInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture inspections
	 */
	public static List<AgricultureInspection> findAll(
		int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture inspections
	 */
	public static List<AgricultureInspection> findAll(
		int start, int end,
		OrderByComparator<AgricultureInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture inspections.
	 *
	 * @return the number of agriculture inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgricultureInspectionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgricultureInspectionPersistence _persistence;

}