/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manufacturing application stages service. This utility wraps <code>com.nbp.manufacturing.application.stages.services.service.persistence.impl.ManufacturingApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManufacturingApplicationStagesPersistence
 * @generated
 */
public class ManufacturingApplicationStagesUtil {

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
		ManufacturingApplicationStages manufacturingApplicationStages) {

		getPersistence().clearCache(manufacturingApplicationStages);
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
	public static Map<Serializable, ManufacturingApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManufacturingApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManufacturingApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManufacturingApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManufacturingApplicationStages update(
		ManufacturingApplicationStages manufacturingApplicationStages) {

		return getPersistence().update(manufacturingApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManufacturingApplicationStages update(
		ManufacturingApplicationStages manufacturingApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			manufacturingApplicationStages, serviceContext);
	}

	/**
	 * Returns the manufacturing application stages where manufacturingApplicationId = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_MAI(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the manufacturing application stages where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_MAI(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetMAS_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the manufacturing application stages where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_MAI(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMAS_MAI(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the manufacturing application stages where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manufacturing application stages that was removed
	 */
	public static ManufacturingApplicationStages removeBygetMAS_MAI(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().removeBygetMAS_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manufacturing application stageses where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manufacturing application stageses
	 */
	public static int countBygetMAS_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMAS_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetMAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetMAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the manufacturing application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the manufacturing application stages that was removed
	 */
	public static ManufacturingApplicationStages removeBygetMAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().removeBygetMAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	public static int countBygetMAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetMAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages
		fetchBygetMAS_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetMAS_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages
		fetchBygetMAS_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName,
			boolean useFinderCache) {

		return getPersistence().fetchBygetMAS_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the manufacturing application stages that was removed
	 */
	public static ManufacturingApplicationStages
			removeBygetMAS_CaseIdStageStatus(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().removeBygetMAS_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	public static int countBygetMAS_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetMAS_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetMAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetMAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the manufacturing application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the manufacturing application stages that was removed
	 */
	public static ManufacturingApplicationStages removeBygetMAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().removeBygetMAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching manufacturing application stageses
	 */
	public static int countBygetMAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetMAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the manufacturing application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId) {

		return getPersistence().findBygetMAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the manufacturing application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetMAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().findBygetMAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_CaseId_First(
			String caseId,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_CaseId_First(
		String caseId,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_CaseId_Last(
			String caseId,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_CaseId_Last(
		String caseId,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the manufacturing application stageses before and after the current manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param manufacturingAppStagesId the primary key of the current manufacturing application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public static ManufacturingApplicationStages[]
			findBygetMAS_CaseId_PrevAndNext(
				long manufacturingAppStagesId, String caseId,
				OrderByComparator<ManufacturingApplicationStages>
					orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_CaseId_PrevAndNext(
			manufacturingAppStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the manufacturing application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetMAS_CaseId(String caseId) {
		getPersistence().removeBygetMAS_CaseId(caseId);
	}

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing application stageses
	 */
	public static int countBygetMAS_CaseId(String caseId) {
		return getPersistence().countBygetMAS_CaseId(caseId);
	}

	/**
	 * Returns all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_SN_Status(
		String stageStatus, String stageName) {

		return getPersistence().findBygetMAS_SN_Status(stageStatus, stageName);
	}

	/**
	 * Returns a range of all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_SN_Status(
		String stageStatus, String stageName, int start, int end) {

		return getPersistence().findBygetMAS_SN_Status(
			stageStatus, stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_SN_Status(
		String stageStatus, String stageName, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().findBygetMAS_SN_Status(
			stageStatus, stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_SN_Status(
		String stageStatus, String stageName, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMAS_SN_Status(
			stageStatus, stageName, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_SN_Status_First(
			String stageStatus, String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_SN_Status_First(
			stageStatus, stageName, orderByComparator);
	}

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_SN_Status_First(
		String stageStatus, String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMAS_SN_Status_First(
			stageStatus, stageName, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_SN_Status_Last(
			String stageStatus, String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_SN_Status_Last(
			stageStatus, stageName, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_SN_Status_Last(
		String stageStatus, String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMAS_SN_Status_Last(
			stageStatus, stageName, orderByComparator);
	}

	/**
	 * Returns the manufacturing application stageses before and after the current manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param manufacturingAppStagesId the primary key of the current manufacturing application stages
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public static ManufacturingApplicationStages[]
			findBygetMAS_SN_Status_PrevAndNext(
				long manufacturingAppStagesId, String stageStatus,
				String stageName,
				OrderByComparator<ManufacturingApplicationStages>
					orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_SN_Status_PrevAndNext(
			manufacturingAppStagesId, stageStatus, stageName,
			orderByComparator);
	}

	/**
	 * Removes all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 */
	public static void removeBygetMAS_SN_Status(
		String stageStatus, String stageName) {

		getPersistence().removeBygetMAS_SN_Status(stageStatus, stageName);
	}

	/**
	 * Returns the number of manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	public static int countBygetMAS_SN_Status(
		String stageStatus, String stageName) {

		return getPersistence().countBygetMAS_SN_Status(stageStatus, stageName);
	}

	/**
	 * Returns all the manufacturing application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_StageName(
		String stageName) {

		return getPersistence().findBygetMAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the manufacturing application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetMAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().findBygetMAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findBygetMAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_StageName_First(
			String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_StageName_First(
		String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages findBygetMAS_StageName_Last(
			String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	public static ManufacturingApplicationStages fetchBygetMAS_StageName_Last(
		String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the manufacturing application stageses before and after the current manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param manufacturingAppStagesId the primary key of the current manufacturing application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public static ManufacturingApplicationStages[]
			findBygetMAS_StageName_PrevAndNext(
				long manufacturingAppStagesId, String stageName,
				OrderByComparator<ManufacturingApplicationStages>
					orderByComparator)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findBygetMAS_StageName_PrevAndNext(
			manufacturingAppStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the manufacturing application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetMAS_StageName(String stageName) {
		getPersistence().removeBygetMAS_StageName(stageName);
	}

	/**
	 * Returns the number of manufacturing application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	public static int countBygetMAS_StageName(String stageName) {
		return getPersistence().countBygetMAS_StageName(stageName);
	}

	/**
	 * Caches the manufacturing application stages in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 */
	public static void cacheResult(
		ManufacturingApplicationStages manufacturingApplicationStages) {

		getPersistence().cacheResult(manufacturingApplicationStages);
	}

	/**
	 * Caches the manufacturing application stageses in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplicationStageses the manufacturing application stageses
	 */
	public static void cacheResult(
		List<ManufacturingApplicationStages> manufacturingApplicationStageses) {

		getPersistence().cacheResult(manufacturingApplicationStageses);
	}

	/**
	 * Creates a new manufacturing application stages with the primary key. Does not add the manufacturing application stages to the database.
	 *
	 * @param manufacturingAppStagesId the primary key for the new manufacturing application stages
	 * @return the new manufacturing application stages
	 */
	public static ManufacturingApplicationStages create(
		long manufacturingAppStagesId) {

		return getPersistence().create(manufacturingAppStagesId);
	}

	/**
	 * Removes the manufacturing application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public static ManufacturingApplicationStages remove(
			long manufacturingAppStagesId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().remove(manufacturingAppStagesId);
	}

	public static ManufacturingApplicationStages updateImpl(
		ManufacturingApplicationStages manufacturingApplicationStages) {

		return getPersistence().updateImpl(manufacturingApplicationStages);
	}

	/**
	 * Returns the manufacturing application stages with the primary key or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	public static ManufacturingApplicationStages findByPrimaryKey(
			long manufacturingAppStagesId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManufacturingApplicationStagesException {

		return getPersistence().findByPrimaryKey(manufacturingAppStagesId);
	}

	/**
	 * Returns the manufacturing application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages, or <code>null</code> if a manufacturing application stages with the primary key could not be found
	 */
	public static ManufacturingApplicationStages fetchByPrimaryKey(
		long manufacturingAppStagesId) {

		return getPersistence().fetchByPrimaryKey(manufacturingAppStagesId);
	}

	/**
	 * Returns all the manufacturing application stageses.
	 *
	 * @return the manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findAll(
		int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing application stageses
	 */
	public static List<ManufacturingApplicationStages> findAll(
		int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manufacturing application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manufacturing application stageses.
	 *
	 * @return the number of manufacturing application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManufacturingApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ManufacturingApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ManufacturingApplicationStagesPersistence
		_persistence;

}