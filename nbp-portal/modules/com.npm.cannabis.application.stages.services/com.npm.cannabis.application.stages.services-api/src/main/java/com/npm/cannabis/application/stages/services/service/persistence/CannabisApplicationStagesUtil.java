/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application stages service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationStagesPersistence
 * @generated
 */
public class CannabisApplicationStagesUtil {

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
		CannabisApplicationStages cannabisApplicationStages) {

		getPersistence().clearCache(cannabisApplicationStages);
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
	public static Map<Serializable, CannabisApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationStages update(
		CannabisApplicationStages cannabisApplicationStages) {

		return getPersistence().update(cannabisApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationStages update(
		CannabisApplicationStages cannabisApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationStages, serviceContext);
	}

	/**
	 * Returns the cannabis application stages where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_CAI(
			long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application stages where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CAI(
		long cannabisApplicationId) {

		return getPersistence().fetchBygetCAS_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application stages where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CAI(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis application stages where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application stages that was removed
	 */
	public static CannabisApplicationStages removeBygetCAS_CAI(
			long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().removeBygetCAS_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis application stageses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application stageses
	 */
	public static int countBygetCAS_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCAS_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the cannabis application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the cannabis application stages that was removed
	 */
	public static CannabisApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().removeBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching cannabis application stageses
	 */
	public static int countBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the cannabis application stages that was removed
	 */
	public static CannabisApplicationStages removeBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().removeBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching cannabis application stageses
	 */
	public static int countBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetCAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the cannabis application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the cannabis application stages that was removed
	 */
	public static CannabisApplicationStages removeBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().removeBygetCAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching cannabis application stageses
	 */
	public static int countBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetCAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the cannabis application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId) {

		return getPersistence().findBygetCAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetCAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().findBygetCAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public static CannabisApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long cannabisApplicationstageId, String caseId,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_PrevAndNext(
			cannabisApplicationstageId, caseId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCAS_CaseId(String caseId) {
		getPersistence().removeBygetCAS_CaseId(caseId);
	}

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application stageses
	 */
	public static int countBygetCAS_CaseId(String caseId) {
		return getPersistence().countBygetCAS_CaseId(caseId);
	}

	/**
	 * Returns all the cannabis application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName) {

		return getPersistence().findBygetCAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the cannabis application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetCAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().findBygetCAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_StageName_First(
			String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_StageName_First(
		String stageName,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_StageName_Last(
			String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_StageName_Last(
		String stageName,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public static CannabisApplicationStages[]
			findBygetCAS_StageName_PrevAndNext(
				long cannabisApplicationstageId, String stageName,
				OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_StageName_PrevAndNext(
			cannabisApplicationstageId, stageName, orderByComparator);
	}

	/**
	 * Removes all the cannabis application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetCAS_StageName(String stageName) {
		getPersistence().removeBygetCAS_StageName(stageName);
	}

	/**
	 * Returns the number of cannabis application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching cannabis application stageses
	 */
	public static int countBygetCAS_StageName(String stageName) {
		return getPersistence().countBygetCAS_StageName(stageName);
	}

	/**
	 * Returns all the cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages>
		findBygetCAS_StageName_StageStatus(
			String stageStatus, String stageName) {

		return getPersistence().findBygetCAS_StageName_StageStatus(
			stageStatus, stageName);
	}

	/**
	 * Returns a range of all the cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages>
		findBygetCAS_StageName_StageStatus(
			String stageStatus, String stageName, int start, int end) {

		return getPersistence().findBygetCAS_StageName_StageStatus(
			stageStatus, stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages>
		findBygetCAS_StageName_StageStatus(
			String stageStatus, String stageName, int start, int end,
			OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().findBygetCAS_StageName_StageStatus(
			stageStatus, stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages>
		findBygetCAS_StageName_StageStatus(
			String stageStatus, String stageName, int start, int end,
			OrderByComparator<CannabisApplicationStages> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCAS_StageName_StageStatus(
			stageStatus, stageName, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages
			findBygetCAS_StageName_StageStatus_First(
				String stageStatus, String stageName,
				OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_StageName_StageStatus_First(
			stageStatus, stageName, orderByComparator);
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages
		fetchBygetCAS_StageName_StageStatus_First(
			String stageStatus, String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_StageName_StageStatus_First(
			stageStatus, stageName, orderByComparator);
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages
			findBygetCAS_StageName_StageStatus_Last(
				String stageStatus, String stageName,
				OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_StageName_StageStatus_Last(
			stageStatus, stageName, orderByComparator);
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages
		fetchBygetCAS_StageName_StageStatus_Last(
			String stageStatus, String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_StageName_StageStatus_Last(
			stageStatus, stageName, orderByComparator);
	}

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public static CannabisApplicationStages[]
			findBygetCAS_StageName_StageStatus_PrevAndNext(
				long cannabisApplicationstageId, String stageStatus,
				String stageName,
				OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_StageName_StageStatus_PrevAndNext(
			cannabisApplicationstageId, stageStatus, stageName,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis application stageses where stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 */
	public static void removeBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName) {

		getPersistence().removeBygetCAS_StageName_StageStatus(
			stageStatus, stageName);
	}

	/**
	 * Returns the number of cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching cannabis application stageses
	 */
	public static int countBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName) {

		return getPersistence().countBygetCAS_StageName_StageStatus(
			stageStatus, stageName);
	}

	/**
	 * Returns all the cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_StageNameStatus(
		String stageName, String stageStatus) {

		return getPersistence().findBygetCAS_StageNameStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns a range of all the cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_StageNameStatus(
		String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetCAS_StageNameStatus(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_StageNameStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().findBygetCAS_StageNameStatus(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findBygetCAS_StageNameStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCAS_StageNameStatus(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_StageNameStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_StageNameStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_StageNameStatus_First(
		String stageName, String stageStatus,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_StageNameStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages findBygetCAS_StageNameStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_StageNameStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public static CannabisApplicationStages fetchBygetCAS_StageNameStatus_Last(
		String stageName, String stageStatus,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_StageNameStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public static CannabisApplicationStages[]
			findBygetCAS_StageNameStatus_PrevAndNext(
				long cannabisApplicationstageId, String stageName,
				String stageStatus,
				OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findBygetCAS_StageNameStatus_PrevAndNext(
			cannabisApplicationstageId, stageName, stageStatus,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetCAS_StageNameStatus(
		String stageName, String stageStatus) {

		getPersistence().removeBygetCAS_StageNameStatus(stageName, stageStatus);
	}

	/**
	 * Returns the number of cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching cannabis application stageses
	 */
	public static int countBygetCAS_StageNameStatus(
		String stageName, String stageStatus) {

		return getPersistence().countBygetCAS_StageNameStatus(
			stageName, stageStatus);
	}

	/**
	 * Caches the cannabis application stages in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationStages the cannabis application stages
	 */
	public static void cacheResult(
		CannabisApplicationStages cannabisApplicationStages) {

		getPersistence().cacheResult(cannabisApplicationStages);
	}

	/**
	 * Caches the cannabis application stageses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationStageses the cannabis application stageses
	 */
	public static void cacheResult(
		List<CannabisApplicationStages> cannabisApplicationStageses) {

		getPersistence().cacheResult(cannabisApplicationStageses);
	}

	/**
	 * Creates a new cannabis application stages with the primary key. Does not add the cannabis application stages to the database.
	 *
	 * @param cannabisApplicationstageId the primary key for the new cannabis application stages
	 * @return the new cannabis application stages
	 */
	public static CannabisApplicationStages create(
		long cannabisApplicationstageId) {

		return getPersistence().create(cannabisApplicationstageId);
	}

	/**
	 * Removes the cannabis application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages that was removed
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public static CannabisApplicationStages remove(
			long cannabisApplicationstageId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().remove(cannabisApplicationstageId);
	}

	public static CannabisApplicationStages updateImpl(
		CannabisApplicationStages cannabisApplicationStages) {

		return getPersistence().updateImpl(cannabisApplicationStages);
	}

	/**
	 * Returns the cannabis application stages with the primary key or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public static CannabisApplicationStages findByPrimaryKey(
			long cannabisApplicationstageId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisApplicationStagesException {

		return getPersistence().findByPrimaryKey(cannabisApplicationstageId);
	}

	/**
	 * Returns the cannabis application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages, or <code>null</code> if a cannabis application stages with the primary key could not be found
	 */
	public static CannabisApplicationStages fetchByPrimaryKey(
		long cannabisApplicationstageId) {

		return getPersistence().fetchByPrimaryKey(cannabisApplicationstageId);
	}

	/**
	 * Returns all the cannabis application stageses.
	 *
	 * @return the cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application stageses
	 */
	public static List<CannabisApplicationStages> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application stageses.
	 *
	 * @return the number of cannabis application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationStagesPersistence _persistence;

}