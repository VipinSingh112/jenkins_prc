/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade inspection service. This utility wraps <code>com.nbp.fire.brigade.stage.service.service.persistence.impl.FireBrigadeInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeInspectionPersistence
 * @generated
 */
public class FireBrigadeInspectionUtil {

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
	public static void clearCache(FireBrigadeInspection fireBrigadeInspection) {
		getPersistence().clearCache(fireBrigadeInspection);
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
	public static Map<Serializable, FireBrigadeInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadeInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadeInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadeInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadeInspection update(
		FireBrigadeInspection fireBrigadeInspection) {

		return getPersistence().update(fireBrigadeInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadeInspection update(
		FireBrigadeInspection fireBrigadeInspection,
		ServiceContext serviceContext) {

		return getPersistence().update(fireBrigadeInspection, serviceContext);
	}

	/**
	 * Returns the fire brigade inspection where caseId = &#63; or throws a <code>NoSuchFireBrigadeInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFireBrigadeInspectionBy_CI(
			String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFireBrigadeInspectionBy_CI(caseId);
	}

	/**
	 * Returns the fire brigade inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFireBrigadeInspectionBy_CI(
		String caseId) {

		return getPersistence().fetchBygetFireBrigadeInspectionBy_CI(caseId);
	}

	/**
	 * Returns the fire brigade inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFireBrigadeInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigadeInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the fire brigade inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade inspection that was removed
	 */
	public static FireBrigadeInspection removeBygetFireBrigadeInspectionBy_CI(
			String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().removeBygetFireBrigadeInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of fire brigade inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade inspections
	 */
	public static int countBygetFireBrigadeInspectionBy_CI(String caseId) {
		return getPersistence().countBygetFireBrigadeInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId) {

		return getPersistence().findBygetFBI_FBAI(fireBrigadeApplicationId);
	}

	/**
	 * Returns a range of all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId, int start, int end) {

		return getPersistence().findBygetFBI_FBAI(
			fireBrigadeApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().findBygetFBI_FBAI(
			fireBrigadeApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFBI_FBAI(
			fireBrigadeApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_FBAI_First(
			long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_FBAI_First(
			fireBrigadeApplicationId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_FBAI_First(
		long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_FBAI_First(
			fireBrigadeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_FBAI_Last(
			long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_FBAI_Last(
			fireBrigadeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_FBAI_Last(
		long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_FBAI_Last(
			fireBrigadeApplicationId, orderByComparator);
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public static FireBrigadeInspection[] findBygetFBI_FBAI_PrevAndNext(
			long fireBrigadeInspectionId, long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_FBAI_PrevAndNext(
			fireBrigadeInspectionId, fireBrigadeApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the fire brigade inspections where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 */
	public static void removeBygetFBI_FBAI(long fireBrigadeApplicationId) {
		getPersistence().removeBygetFBI_FBAI(fireBrigadeApplicationId);
	}

	/**
	 * Returns the number of fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade inspections
	 */
	public static int countBygetFBI_FBAI(long fireBrigadeApplicationId) {
		return getPersistence().countBygetFBI_FBAI(fireBrigadeApplicationId);
	}

	/**
	 * Returns all the fire brigade inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId) {

		return getPersistence().findBygetFBI_CaseId(caseId);
	}

	/**
	 * Returns a range of all the fire brigade inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetFBI_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().findBygetFBI_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFBI_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_CaseId_First(
			String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_CaseId_First(
		String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_CaseId_Last(
			String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_CaseId_Last(
		String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public static FireBrigadeInspection[] findBygetFBI_CaseId_PrevAndNext(
			long fireBrigadeInspectionId, String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_CaseId_PrevAndNext(
			fireBrigadeInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the fire brigade inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetFBI_CaseId(String caseId) {
		getPersistence().removeBygetFBI_CaseId(caseId);
	}

	/**
	 * Returns the number of fire brigade inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade inspections
	 */
	public static int countBygetFBI_CaseId(String caseId) {
		return getPersistence().countBygetFBI_CaseId(caseId);
	}

	/**
	 * Returns all the fire brigade inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_Status(
		String status) {

		return getPersistence().findBygetFBI_Status(status);
	}

	/**
	 * Returns a range of all the fire brigade inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_Status(
		String status, int start, int end) {

		return getPersistence().findBygetFBI_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_Status(
		String status, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().findBygetFBI_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_Status(
		String status, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFBI_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_Status_First(
			String status,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_Status_First(
		String status,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_Status_Last(
			String status,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_Status_Last(
		String status,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public static FireBrigadeInspection[] findBygetFBI_Status_PrevAndNext(
			long fireBrigadeInspectionId, String status,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_Status_PrevAndNext(
			fireBrigadeInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the fire brigade inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetFBI_Status(String status) {
		getPersistence().removeBygetFBI_Status(status);
	}

	/**
	 * Returns the number of fire brigade inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching fire brigade inspections
	 */
	public static int countBygetFBI_Status(String status) {
		return getPersistence().countBygetFBI_Status(status);
	}

	/**
	 * Returns all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetFBI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetFBI_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().findBygetFBI_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFBI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public static FireBrigadeInspection[] findBygetFBI_CaseIdStatus_PrevAndNext(
			long fireBrigadeInspectionId, String status, String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_CaseIdStatus_PrevAndNext(
			fireBrigadeInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the fire brigade inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetFBI_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetFBI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching fire brigade inspections
	 */
	public static int countBygetFBI_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetFBI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId) {

		return getPersistence().findBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId);
	}

	/**
	 * Returns a range of all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId, int start, int end) {

		return getPersistence().findBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().findBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_CaseIdApplicationId_First(
			String status, long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_CaseIdApplicationId_First(
			status, fireBrigadeApplicationId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_CaseIdApplicationId_First(
		String status, long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_CaseIdApplicationId_First(
			status, fireBrigadeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection findBygetFBI_CaseIdApplicationId_Last(
			String status, long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_CaseIdApplicationId_Last(
			status, fireBrigadeApplicationId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection fetchBygetFBI_CaseIdApplicationId_Last(
		String status, long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().fetchBygetFBI_CaseIdApplicationId_Last(
			status, fireBrigadeApplicationId, orderByComparator);
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public static FireBrigadeInspection[]
			findBygetFBI_CaseIdApplicationId_PrevAndNext(
				long fireBrigadeInspectionId, String status,
				long fireBrigadeApplicationId,
				OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findBygetFBI_CaseIdApplicationId_PrevAndNext(
			fireBrigadeInspectionId, status, fireBrigadeApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 */
	public static void removeBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId) {

		getPersistence().removeBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId);
	}

	/**
	 * Returns the number of fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade inspections
	 */
	public static int countBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId) {

		return getPersistence().countBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long fireBrigadeApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	public static FireBrigadeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long fireBrigadeApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, fireBrigadeApplicationId,
				useFinderCache);
	}

	/**
	 * Removes the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade inspection that was removed
	 */
	public static FireBrigadeInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, fireBrigadeApplicationId);
	}

	/**
	 * Returns the number of fire brigade inspections where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long fireBrigadeApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, fireBrigadeApplicationId);
	}

	/**
	 * Caches the fire brigade inspection in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeInspection the fire brigade inspection
	 */
	public static void cacheResult(
		FireBrigadeInspection fireBrigadeInspection) {

		getPersistence().cacheResult(fireBrigadeInspection);
	}

	/**
	 * Caches the fire brigade inspections in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeInspections the fire brigade inspections
	 */
	public static void cacheResult(
		List<FireBrigadeInspection> fireBrigadeInspections) {

		getPersistence().cacheResult(fireBrigadeInspections);
	}

	/**
	 * Creates a new fire brigade inspection with the primary key. Does not add the fire brigade inspection to the database.
	 *
	 * @param fireBrigadeInspectionId the primary key for the new fire brigade inspection
	 * @return the new fire brigade inspection
	 */
	public static FireBrigadeInspection create(long fireBrigadeInspectionId) {
		return getPersistence().create(fireBrigadeInspectionId);
	}

	/**
	 * Removes the fire brigade inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection that was removed
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public static FireBrigadeInspection remove(long fireBrigadeInspectionId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().remove(fireBrigadeInspectionId);
	}

	public static FireBrigadeInspection updateImpl(
		FireBrigadeInspection fireBrigadeInspection) {

		return getPersistence().updateImpl(fireBrigadeInspection);
	}

	/**
	 * Returns the fire brigade inspection with the primary key or throws a <code>NoSuchFireBrigadeInspectionException</code> if it could not be found.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	public static FireBrigadeInspection findByPrimaryKey(
			long fireBrigadeInspectionId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return getPersistence().findByPrimaryKey(fireBrigadeInspectionId);
	}

	/**
	 * Returns the fire brigade inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection, or <code>null</code> if a fire brigade inspection with the primary key could not be found
	 */
	public static FireBrigadeInspection fetchByPrimaryKey(
		long fireBrigadeInspectionId) {

		return getPersistence().fetchByPrimaryKey(fireBrigadeInspectionId);
	}

	/**
	 * Returns all the fire brigade inspections.
	 *
	 * @return the fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade inspections
	 */
	public static List<FireBrigadeInspection> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade inspections.
	 *
	 * @return the number of fire brigade inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadeInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadeInspectionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadeInspectionPersistence _persistence;

}