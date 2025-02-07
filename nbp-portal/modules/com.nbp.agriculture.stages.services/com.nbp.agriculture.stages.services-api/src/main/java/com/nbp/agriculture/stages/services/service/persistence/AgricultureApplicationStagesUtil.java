/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.agriculture.stages.services.model.AgricultureApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture application stages service. This utility wraps <code>com.nbp.agriculture.stages.services.service.persistence.impl.AgricultureApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationStagesPersistence
 * @generated
 */
public class AgricultureApplicationStagesUtil {

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
		AgricultureApplicationStages agricultureApplicationStages) {

		getPersistence().clearCache(agricultureApplicationStages);
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
	public static Map<Serializable, AgricultureApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureApplicationStages update(
		AgricultureApplicationStages agricultureApplicationStages) {

		return getPersistence().update(agricultureApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureApplicationStages update(
		AgricultureApplicationStages agricultureApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			agricultureApplicationStages, serviceContext);
	}

	/**
	 * Returns the agriculture application stages where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages findByAAS_CAI(
			long agricultureApplicationId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_CAI(agricultureApplicationId);
	}

	/**
	 * Returns the agriculture application stages where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CAI(
		long agricultureApplicationId) {

		return getPersistence().fetchByAAS_CAI(agricultureApplicationId);
	}

	/**
	 * Returns the agriculture application stages where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CAI(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchByAAS_CAI(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture application stages where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture application stages that was removed
	 */
	public static AgricultureApplicationStages removeByAAS_CAI(
			long agricultureApplicationId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().removeByAAS_CAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture application stageses where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture application stageses
	 */
	public static int countByAAS_CAI(long agricultureApplicationId) {
		return getPersistence().countByAAS_CAI(agricultureApplicationId);
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages findByAAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchByAAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchByAAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the agriculture application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the agriculture application stages that was removed
	 */
	public static AgricultureApplicationStages removeByAAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().removeByAAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the number of agriculture application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching agriculture application stageses
	 */
	public static int countByAAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countByAAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns all the agriculture application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName) {

		return getPersistence().findByAAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the agriculture application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findByAAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().findByAAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages findByAAS_StageName_First(
			String stageName,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_StageName_First(
		String stageName,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().fetchByAAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages findByAAS_StageName_Last(
			String stageName,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_StageName_Last(
		String stageName,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().fetchByAAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the agriculture application stageses before and after the current agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param agricultureApplicationstageId the primary key of the current agriculture application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	public static AgricultureApplicationStages[]
			findByAAS_StageName_PrevAndNext(
				long agricultureApplicationstageId, String stageName,
				OrderByComparator<AgricultureApplicationStages>
					orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_StageName_PrevAndNext(
			agricultureApplicationstageId, stageName, orderByComparator);
	}

	/**
	 * Removes all the agriculture application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeByAAS_StageName(String stageName) {
		getPersistence().removeByAAS_StageName(stageName);
	}

	/**
	 * Returns the number of agriculture application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching agriculture application stageses
	 */
	public static int countByAAS_StageName(String stageName) {
		return getPersistence().countByAAS_StageName(stageName);
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages findByAAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchByAAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchByAAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the agriculture application stages that was removed
	 */
	public static AgricultureApplicationStages removeByAAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().removeByAAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of agriculture application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching agriculture application stageses
	 */
	public static int countByAAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countByAAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the agriculture application stages where stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages findByAAS_CaseIdAndStatus(
			String stageName, String stageStatus)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_CaseIdAndStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the agriculture application stages where stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CaseIdAndStatus(
		String stageName, String stageStatus) {

		return getPersistence().fetchByAAS_CaseIdAndStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the agriculture application stages where stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CaseIdAndStatus(
		String stageName, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchByAAS_CaseIdAndStatus(
			stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the agriculture application stages where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the agriculture application stages that was removed
	 */
	public static AgricultureApplicationStages removeByAAS_CaseIdAndStatus(
			String stageName, String stageStatus)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().removeByAAS_CaseIdAndStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the number of agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching agriculture application stageses
	 */
	public static int countByAAS_CaseIdAndStatus(
		String stageName, String stageStatus) {

		return getPersistence().countByAAS_CaseIdAndStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns all the agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages>
		findBygetAgricultureBy_SN_SS(String stageName, String stageStatus) {

		return getPersistence().findBygetAgricultureBy_SN_SS(
			stageName, stageStatus);
	}

	/**
	 * Returns a range of all the agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages>
		findBygetAgricultureBy_SN_SS(
			String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetAgricultureBy_SN_SS(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages>
		findBygetAgricultureBy_SN_SS(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().findBygetAgricultureBy_SN_SS(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages>
		findBygetAgricultureBy_SN_SS(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<AgricultureApplicationStages> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetAgricultureBy_SN_SS(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages
			findBygetAgricultureBy_SN_SS_First(
				String stageName, String stageStatus,
				OrderByComparator<AgricultureApplicationStages>
					orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findBygetAgricultureBy_SN_SS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages
		fetchBygetAgricultureBy_SN_SS_First(
			String stageName, String stageStatus,
			OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetAgricultureBy_SN_SS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages
			findBygetAgricultureBy_SN_SS_Last(
				String stageName, String stageStatus,
				OrderByComparator<AgricultureApplicationStages>
					orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findBygetAgricultureBy_SN_SS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages
		fetchBygetAgricultureBy_SN_SS_Last(
			String stageName, String stageStatus,
			OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetAgricultureBy_SN_SS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the agriculture application stageses before and after the current agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param agricultureApplicationstageId the primary key of the current agriculture application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	public static AgricultureApplicationStages[]
			findBygetAgricultureBy_SN_SS_PrevAndNext(
				long agricultureApplicationstageId, String stageName,
				String stageStatus,
				OrderByComparator<AgricultureApplicationStages>
					orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findBygetAgricultureBy_SN_SS_PrevAndNext(
			agricultureApplicationstageId, stageName, stageStatus,
			orderByComparator);
	}

	/**
	 * Removes all the agriculture application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus) {

		getPersistence().removeBygetAgricultureBy_SN_SS(stageName, stageStatus);
	}

	/**
	 * Returns the number of agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching agriculture application stageses
	 */
	public static int countBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus) {

		return getPersistence().countBygetAgricultureBy_SN_SS(
			stageName, stageStatus);
	}

	/**
	 * Returns all the agriculture application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId) {

		return getPersistence().findByAAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the agriculture application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findByAAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().findByAAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages findByAAS_CaseId_First(
			String caseId,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CaseId_First(
		String caseId,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().fetchByAAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages findByAAS_CaseId_Last(
			String caseId,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public static AgricultureApplicationStages fetchByAAS_CaseId_Last(
		String caseId,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().fetchByAAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the agriculture application stageses before and after the current agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param agricultureApplicationstageId the primary key of the current agriculture application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	public static AgricultureApplicationStages[] findByAAS_CaseId_PrevAndNext(
			long agricultureApplicationstageId, String caseId,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByAAS_CaseId_PrevAndNext(
			agricultureApplicationstageId, caseId, orderByComparator);
	}

	/**
	 * Removes all the agriculture application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeByAAS_CaseId(String caseId) {
		getPersistence().removeByAAS_CaseId(caseId);
	}

	/**
	 * Returns the number of agriculture application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture application stageses
	 */
	public static int countByAAS_CaseId(String caseId) {
		return getPersistence().countByAAS_CaseId(caseId);
	}

	/**
	 * Caches the agriculture application stages in the entity cache if it is enabled.
	 *
	 * @param agricultureApplicationStages the agriculture application stages
	 */
	public static void cacheResult(
		AgricultureApplicationStages agricultureApplicationStages) {

		getPersistence().cacheResult(agricultureApplicationStages);
	}

	/**
	 * Caches the agriculture application stageses in the entity cache if it is enabled.
	 *
	 * @param agricultureApplicationStageses the agriculture application stageses
	 */
	public static void cacheResult(
		List<AgricultureApplicationStages> agricultureApplicationStageses) {

		getPersistence().cacheResult(agricultureApplicationStageses);
	}

	/**
	 * Creates a new agriculture application stages with the primary key. Does not add the agriculture application stages to the database.
	 *
	 * @param agricultureApplicationstageId the primary key for the new agriculture application stages
	 * @return the new agriculture application stages
	 */
	public static AgricultureApplicationStages create(
		long agricultureApplicationstageId) {

		return getPersistence().create(agricultureApplicationstageId);
	}

	/**
	 * Removes the agriculture application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages that was removed
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	public static AgricultureApplicationStages remove(
			long agricultureApplicationstageId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().remove(agricultureApplicationstageId);
	}

	public static AgricultureApplicationStages updateImpl(
		AgricultureApplicationStages agricultureApplicationStages) {

		return getPersistence().updateImpl(agricultureApplicationStages);
	}

	/**
	 * Returns the agriculture application stages with the primary key or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	public static AgricultureApplicationStages findByPrimaryKey(
			long agricultureApplicationstageId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureApplicationStagesException {

		return getPersistence().findByPrimaryKey(agricultureApplicationstageId);
	}

	/**
	 * Returns the agriculture application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages, or <code>null</code> if a agriculture application stages with the primary key could not be found
	 */
	public static AgricultureApplicationStages fetchByPrimaryKey(
		long agricultureApplicationstageId) {

		return getPersistence().fetchByPrimaryKey(
			agricultureApplicationstageId);
	}

	/**
	 * Returns all the agriculture application stageses.
	 *
	 * @return the agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findAll(
		int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture application stageses
	 */
	public static List<AgricultureApplicationStages> findAll(
		int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture application stageses.
	 *
	 * @return the number of agriculture application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgricultureApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgricultureApplicationStagesPersistence
		_persistence;

}