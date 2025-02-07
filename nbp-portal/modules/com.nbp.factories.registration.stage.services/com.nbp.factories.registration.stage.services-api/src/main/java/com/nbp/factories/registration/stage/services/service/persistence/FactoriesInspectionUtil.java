/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.stage.services.model.FactoriesInspection;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories inspection service. This utility wraps <code>com.nbp.factories.registration.stage.services.service.persistence.impl.FactoriesInspectionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesInspectionPersistence
 * @generated
 */
public class FactoriesInspectionUtil {

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
	public static void clearCache(FactoriesInspection factoriesInspection) {
		getPersistence().clearCache(factoriesInspection);
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
	public static Map<Serializable, FactoriesInspection> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesInspection> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesInspection update(
		FactoriesInspection factoriesInspection) {

		return getPersistence().update(factoriesInspection);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesInspection update(
		FactoriesInspection factoriesInspection,
		ServiceContext serviceContext) {

		return getPersistence().update(factoriesInspection, serviceContext);
	}

	/**
	 * Returns the factories inspection where caseId = &#63; or throws a <code>NoSuchFactoriesInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetFactoryInspectionBy_CI(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetFactoryInspectionBy_CI(caseId);
	}

	/**
	 * Returns the factories inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetFactoryInspectionBy_CI(
		String caseId) {

		return getPersistence().fetchBygetFactoryInspectionBy_CI(caseId);
	}

	/**
	 * Returns the factories inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetFactoryInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoryInspectionBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the factories inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories inspection that was removed
	 */
	public static FactoriesInspection removeBygetFactoryInspectionBy_CI(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().removeBygetFactoryInspectionBy_CI(caseId);
	}

	/**
	 * Returns the number of factories inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories inspections
	 */
	public static int countBygetFactoryInspectionBy_CI(String caseId) {
		return getPersistence().countBygetFactoryInspectionBy_CI(caseId);
	}

	/**
	 * Returns all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId) {

		return getPersistence().findBygetFI_FAI(factoriesApplicationId);
	}

	/**
	 * Returns a range of all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId, int start, int end) {

		return getPersistence().findBygetFI_FAI(
			factoriesApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().findBygetFI_FAI(
			factoriesApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories inspections where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetFI_FAI(
		long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFI_FAI(
			factoriesApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetFI_FAI_First(
			long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetFI_FAI_First(
			factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the first factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetFI_FAI_First(
		long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_FAI_First(
			factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetFI_FAI_Last(
			long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetFI_FAI_Last(
			factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetFI_FAI_Last(
		long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetFI_FAI_Last(
			factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection[] findBygetFI_FAI_PrevAndNext(
			long factoriesInspectionId, long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetFI_FAI_PrevAndNext(
			factoriesInspectionId, factoriesApplicationId, orderByComparator);
	}

	/**
	 * Removes all the factories inspections where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 */
	public static void removeBygetFI_FAI(long factoriesApplicationId) {
		getPersistence().removeBygetFI_FAI(factoriesApplicationId);
	}

	/**
	 * Returns the number of factories inspections where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories inspections
	 */
	public static int countBygetFI_FAI(long factoriesApplicationId) {
		return getPersistence().countBygetFI_FAI(factoriesApplicationId);
	}

	/**
	 * Returns all the factories inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseId(String caseId) {
		return getPersistence().findBygetMI_CaseId(caseId);
	}

	/**
	 * Returns a range of all the factories inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetMI_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().findBygetMI_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetMI_CaseId_First(
			String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetMI_CaseId_First(
		String caseId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetMI_CaseId_Last(
			String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetMI_CaseId_Last(
		String caseId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where caseId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection[] findBygetMI_CaseId_PrevAndNext(
			long factoriesInspectionId, String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_CaseId_PrevAndNext(
			factoriesInspectionId, caseId, orderByComparator);
	}

	/**
	 * Removes all the factories inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetMI_CaseId(String caseId) {
		getPersistence().removeBygetMI_CaseId(caseId);
	}

	/**
	 * Returns the number of factories inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories inspections
	 */
	public static int countBygetMI_CaseId(String caseId) {
		return getPersistence().countBygetMI_CaseId(caseId);
	}

	/**
	 * Returns all the factories inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_Status(String status) {
		return getPersistence().findBygetMI_Status(status);
	}

	/**
	 * Returns a range of all the factories inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_Status(
		String status, int start, int end) {

		return getPersistence().findBygetMI_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().findBygetMI_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetMI_Status_First(
			String status,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetMI_Status_First(
		String status,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetMI_Status_Last(
			String status,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetMI_Status_Last(
		String status,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where status = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection[] findBygetMI_Status_PrevAndNext(
			long factoriesInspectionId, String status,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_Status_PrevAndNext(
			factoriesInspectionId, status, orderByComparator);
	}

	/**
	 * Removes all the factories inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetMI_Status(String status) {
		getPersistence().removeBygetMI_Status(status);
	}

	/**
	 * Returns the number of factories inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching factories inspections
	 */
	public static int countBygetMI_Status(String status) {
		return getPersistence().countBygetMI_Status(status);
	}

	/**
	 * Returns all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId) {

		return getPersistence().findBygetMI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns a range of all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return getPersistence().findBygetMI_CaseIdStatus(
			status, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().findBygetMI_CaseIdStatus(
			status, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetMI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetMI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseIdStatus_First(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetMI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetMI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseIdStatus_Last(
			status, caseId, orderByComparator);
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection[] findBygetMI_CaseIdStatus_PrevAndNext(
			long factoriesInspectionId, String status, String caseId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_CaseIdStatus_PrevAndNext(
			factoriesInspectionId, status, caseId, orderByComparator);
	}

	/**
	 * Removes all the factories inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	public static void removeBygetMI_CaseIdStatus(
		String status, String caseId) {

		getPersistence().removeBygetMI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns the number of factories inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching factories inspections
	 */
	public static int countBygetMI_CaseIdStatus(String status, String caseId) {
		return getPersistence().countBygetMI_CaseIdStatus(status, caseId);
	}

	/**
	 * Returns all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId) {

		return getPersistence().findBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId);
	}

	/**
	 * Returns a range of all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId, int start, int end) {

		return getPersistence().findBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().findBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories inspections
	 */
	public static List<FactoriesInspection> findBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetMI_CaseIdApplicationId_First(
			String status, long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_CaseIdApplicationId_First(
			status, factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the first factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetMI_CaseIdApplicationId_First(
		String status, long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseIdApplicationId_First(
			status, factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection findBygetMI_CaseIdApplicationId_Last(
			String status, long factoriesApplicationId,
			OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_CaseIdApplicationId_Last(
			status, factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection fetchBygetMI_CaseIdApplicationId_Last(
		String status, long factoriesApplicationId,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().fetchBygetMI_CaseIdApplicationId_Last(
			status, factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the factories inspections before and after the current factories inspection in the ordered set where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param factoriesInspectionId the primary key of the current factories inspection
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection[]
			findBygetMI_CaseIdApplicationId_PrevAndNext(
				long factoriesInspectionId, String status,
				long factoriesApplicationId,
				OrderByComparator<FactoriesInspection> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findBygetMI_CaseIdApplicationId_PrevAndNext(
			factoriesInspectionId, status, factoriesApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the factories inspections where status = &#63; and factoriesApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 */
	public static void removeBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId) {

		getPersistence().removeBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId);
	}

	/**
	 * Returns the number of factories inspections where status = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories inspections
	 */
	public static int countBygetMI_CaseIdApplicationId(
		String status, long factoriesApplicationId) {

		return getPersistence().countBygetMI_CaseIdApplicationId(
			status, factoriesApplicationId);
	}

	/**
	 * Returns the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspection
	 * @throws NoSuchFactoriesInspectionException if a matching factories inspection could not be found
	 */
	public static FactoriesInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long factoriesApplicationId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, factoriesApplicationId);
	}

	/**
	 * Returns the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long factoriesApplicationId) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, factoriesApplicationId);
	}

	/**
	 * Returns the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories inspection, or <code>null</code> if a matching factories inspection could not be found
	 */
	public static FactoriesInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long factoriesApplicationId,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, factoriesApplicationId,
				useFinderCache);
	}

	/**
	 * Removes the factories inspection where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories inspection that was removed
	 */
	public static FactoriesInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long factoriesApplicationId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, factoriesApplicationId);
	}

	/**
	 * Returns the number of factories inspections where status = &#63; and slotBookedByUser = &#63; and factoriesApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories inspections
	 */
	public static int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long factoriesApplicationId) {

		return getPersistence().
			countBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, factoriesApplicationId);
	}

	/**
	 * Caches the factories inspection in the entity cache if it is enabled.
	 *
	 * @param factoriesInspection the factories inspection
	 */
	public static void cacheResult(FactoriesInspection factoriesInspection) {
		getPersistence().cacheResult(factoriesInspection);
	}

	/**
	 * Caches the factories inspections in the entity cache if it is enabled.
	 *
	 * @param factoriesInspections the factories inspections
	 */
	public static void cacheResult(
		List<FactoriesInspection> factoriesInspections) {

		getPersistence().cacheResult(factoriesInspections);
	}

	/**
	 * Creates a new factories inspection with the primary key. Does not add the factories inspection to the database.
	 *
	 * @param factoriesInspectionId the primary key for the new factories inspection
	 * @return the new factories inspection
	 */
	public static FactoriesInspection create(long factoriesInspectionId) {
		return getPersistence().create(factoriesInspectionId);
	}

	/**
	 * Removes the factories inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection that was removed
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection remove(long factoriesInspectionId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().remove(factoriesInspectionId);
	}

	public static FactoriesInspection updateImpl(
		FactoriesInspection factoriesInspection) {

		return getPersistence().updateImpl(factoriesInspection);
	}

	/**
	 * Returns the factories inspection with the primary key or throws a <code>NoSuchFactoriesInspectionException</code> if it could not be found.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection
	 * @throws NoSuchFactoriesInspectionException if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection findByPrimaryKey(
			long factoriesInspectionId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getPersistence().findByPrimaryKey(factoriesInspectionId);
	}

	/**
	 * Returns the factories inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection, or <code>null</code> if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection fetchByPrimaryKey(
		long factoriesInspectionId) {

		return getPersistence().fetchByPrimaryKey(factoriesInspectionId);
	}

	/**
	 * Returns all the factories inspections.
	 *
	 * @return the factories inspections
	 */
	public static List<FactoriesInspection> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of factories inspections
	 */
	public static List<FactoriesInspection> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories inspections
	 */
	public static List<FactoriesInspection> findAll(
		int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories inspections
	 */
	public static List<FactoriesInspection> findAll(
		int start, int end,
		OrderByComparator<FactoriesInspection> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories inspections from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories inspections.
	 *
	 * @return the number of factories inspections
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesInspectionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesInspectionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesInspectionPersistence _persistence;

}