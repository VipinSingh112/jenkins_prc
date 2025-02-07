/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManuInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu inspection service. This utility wraps <code>com.nbp.manufacturing.application.stages.services.service.persistence.impl.ManuInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuInspectionPersistence
 * @generated
 */
public class ManuInspectionUtil {

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
	public static void clearCache(ManuInspection manuInspection) {
		getPersistence().clearCache(manuInspection);
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
	public static Map<Serializable, ManuInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuInspection update(ManuInspection manuInspection) {
		return getPersistence().update(manuInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuInspection update(
		ManuInspection manuInspection, ServiceContext serviceContext) {

		return getPersistence().update(manuInspection, serviceContext);
	}

	/**
	 * Returns the manu inspection where caseId = &#63; or throws a <code>NoSuchManuInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetManuInspectionBy_CI(String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetManuInspectionBy_CI(caseId);
	}

	/**
	 * Returns the manu inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetManuInspectionBy_CI(String caseId) {
		return getPersistence().fetchBygetManuInspectionBy_CI(caseId);
	}

	/**
	 * Returns the manu inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetManuInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetManuInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the manu inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the manu inspection that was removed
	 */
	public static ManuInspection removeBygetManuInspectionBy_CI(String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().removeBygetManuInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of manu inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manu inspections
	 */
	public static int countBygetManuInspectionBy_CI(String caseId) {
		return getPersistence().countBygetManuInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMI_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMI_MAI(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().findBygetMI_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection[] findBygetMI_MAI_PrevAndNext(
			long manuInspectionId, long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_MAI_PrevAndNext(
			manuInspectionId, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Removes all the manu inspections where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMI_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMI_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu inspections where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu inspections
	 */
	public static int countBygetMI_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMI_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns all the manu inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseId(String caseId) {
		return getPersistence().findBygetMI_CaseId(caseId);
	}

	/**
	 * Returns a range of all the manu inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetMI_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().findBygetMI_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_CaseId_First(
			String caseId, OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_CaseId_First(
		String caseId, OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_CaseId_Last(
			String caseId, OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_CaseId_Last(
		String caseId, OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where caseId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection[] findBygetMI_CaseId_PrevAndNext(
			long manuInspectionId, String caseId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_CaseId_PrevAndNext(
			manuInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the manu inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetMI_CaseId(String caseId) {
		getPersistence().removeBygetMI_CaseId(caseId);
	}

	/**
	 * Returns the number of manu inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manu inspections
	 */
	public static int countBygetMI_CaseId(String caseId) {
		return getPersistence().countBygetMI_CaseId(caseId);
	}

	/**
	 * Returns all the manu inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_Status(String status) {
		return getPersistence().findBygetMI_Status(status);
	}

	/**
	 * Returns a range of all the manu inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_Status(
		String status, int start, int end) {

		return getPersistence().findBygetMI_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().findBygetMI_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_Status_First(
			String status, OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_Status_First(
		String status, OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_Status_Last(
			String status, OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_Status_Last(
		String status, OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where status = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection[] findBygetMI_Status_PrevAndNext(
			long manuInspectionId, String status,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_Status_PrevAndNext(
			manuInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the manu inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetMI_Status(String status) {
		getPersistence().removeBygetMI_Status(status);
	}

	/**
	 * Returns the number of manu inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching manu inspections
	 */
	public static int countBygetMI_Status(String status) {
		return getPersistence().countBygetMI_Status(status);
	}

	/**
	 * Returns all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetMI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetMI_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().findBygetMI_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection[] findBygetMI_CaseIdStatus_PrevAndNext(
			long manuInspectionId, String status, String caseId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_CaseIdStatus_PrevAndNext(
			manuInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the manu inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetMI_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetMI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of manu inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching manu inspections
	 */
	public static int countBygetMI_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetMI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId) {

		return getPersistence().findBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().findBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu inspections
	 */
	public static List<ManuInspection> findBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_CaseIdApplicationId_First(
			String status, long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_CaseIdApplicationId_First(
			status, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_CaseIdApplicationId_First(
		String status, long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseIdApplicationId_First(
			status, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection findBygetMI_CaseIdApplicationId_Last(
			String status, long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_CaseIdApplicationId_Last(
			status, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection fetchBygetMI_CaseIdApplicationId_Last(
		String status, long manufacturingApplicationId,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseIdApplicationId_Last(
			status, manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu inspections before and after the current manu inspection in the ordered set where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param manuInspectionId the primary key of the current manu inspection
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection[] findBygetMI_CaseIdApplicationId_PrevAndNext(
			long manuInspectionId, String status,
			long manufacturingApplicationId,
			OrderByComparator<ManuInspection> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findBygetMI_CaseIdApplicationId_PrevAndNext(
			manuInspectionId, status, manufacturingApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the manu inspections where status = &#63; and manufacturingApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId) {

		getPersistence().removeBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu inspections where status = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu inspections
	 */
	public static int countBygetMI_CaseIdApplicationId(
		String status, long manufacturingApplicationId) {

		return getPersistence().countBygetMI_CaseIdApplicationId(
			status, manufacturingApplicationId);
	}

	/**
	 * Returns the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; or throws a <code>NoSuchManuInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspection
	 * @throws NoSuchManuInspectionException if a matching manu inspection could not be found
	 */
	public static ManuInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, manufacturingApplicationId);
	}

	/**
	 * Returns the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long manufacturingApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, manufacturingApplicationId);
	}

	/**
	 * Returns the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu inspection, or <code>null</code> if a matching manu inspection could not be found
	 */
	public static ManuInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, manufacturingApplicationId,
				useFinderCache);
	}

	/**
	 * Removes the manu inspection where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu inspection that was removed
	 */
	public static ManuInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu inspections where status = &#63; and slotBookedByUser = &#63; and manufacturingApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long manufacturingApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, manufacturingApplicationId);
	}

	/**
	 * Caches the manu inspection in the entity cache if it is enabled.
	 *
	 * @param manuInspection the manu inspection
	 */
	public static void cacheResult(ManuInspection manuInspection) {
		getPersistence().cacheResult(manuInspection);
	}

	/**
	 * Caches the manu inspections in the entity cache if it is enabled.
	 *
	 * @param manuInspections the manu inspections
	 */
	public static void cacheResult(List<ManuInspection> manuInspections) {
		getPersistence().cacheResult(manuInspections);
	}

	/**
	 * Creates a new manu inspection with the primary key. Does not add the manu inspection to the database.
	 *
	 * @param manuInspectionId the primary key for the new manu inspection
	 * @return the new manu inspection
	 */
	public static ManuInspection create(long manuInspectionId) {
		return getPersistence().create(manuInspectionId);
	}

	/**
	 * Removes the manu inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection that was removed
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection remove(long manuInspectionId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().remove(manuInspectionId);
	}

	public static ManuInspection updateImpl(ManuInspection manuInspection) {
		return getPersistence().updateImpl(manuInspection);
	}

	/**
	 * Returns the manu inspection with the primary key or throws a <code>NoSuchManuInspectionException</code> if it could not be found.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection
	 * @throws NoSuchManuInspectionException if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection findByPrimaryKey(long manuInspectionId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getPersistence().findByPrimaryKey(manuInspectionId);
	}

	/**
	 * Returns the manu inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection, or <code>null</code> if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection fetchByPrimaryKey(long manuInspectionId) {
		return getPersistence().fetchByPrimaryKey(manuInspectionId);
	}

	/**
	 * Returns all the manu inspections.
	 *
	 * @return the manu inspections
	 */
	public static List<ManuInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of manu inspections
	 */
	public static List<ManuInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu inspections
	 */
	public static List<ManuInspection> findAll(
		int start, int end,
		OrderByComparator<ManuInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu inspections
	 */
	public static List<ManuInspection> findAll(
		int start, int end, OrderByComparator<ManuInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu inspections.
	 *
	 * @return the number of manu inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ManuInspectionPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ManuInspectionPersistence _persistence;

}