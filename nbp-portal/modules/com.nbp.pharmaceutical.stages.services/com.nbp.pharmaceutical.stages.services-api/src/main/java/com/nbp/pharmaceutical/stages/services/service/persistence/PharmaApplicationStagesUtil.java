/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma application stages service. This utility wraps <code>com.nbp.pharmaceutical.stages.services.service.persistence.impl.PharmaApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationStagesPersistence
 * @generated
 */
public class PharmaApplicationStagesUtil {

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
		PharmaApplicationStages pharmaApplicationStages) {

		getPersistence().clearCache(pharmaApplicationStages);
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
	public static Map<Serializable, PharmaApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaApplicationStages update(
		PharmaApplicationStages pharmaApplicationStages) {

		return getPersistence().update(pharmaApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaApplicationStages update(
		PharmaApplicationStages pharmaApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(pharmaApplicationStages, serviceContext);
	}

	/**
	 * Returns the pharma application stages where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_CAI(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_CAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application stages where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_CAI(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetPS_CAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application stages where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_CAI(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetPS_CAI(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma application stages where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application stages that was removed
	 */
	public static PharmaApplicationStages removeBygetPS_CAI(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().removeBygetPS_CAI(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma application stageses where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma application stageses
	 */
	public static int countBygetPS_CAI(long pharmaApplicationId) {
		return getPersistence().countBygetPS_CAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetPS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetPS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the pharma application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the pharma application stages that was removed
	 */
	public static PharmaApplicationStages removeBygetPS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().removeBygetPS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of pharma application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching pharma application stageses
	 */
	public static int countBygetPS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetPS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns all the pharma application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName) {

		return getPersistence().findBygetPS_StageName(stageName);
	}

	/**
	 * Returns a range of all the pharma application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetPS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().findBygetPS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_StageName_First(
			String stageName,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_StageName_First(
		String stageName,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetPS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_StageName_Last(
			String stageName,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_StageName_Last(
		String stageName,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetPS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public static PharmaApplicationStages[] findBygetPS_StageName_PrevAndNext(
			long pharmaApplicationstageId, String stageName,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_StageName_PrevAndNext(
			pharmaApplicationstageId, stageName, orderByComparator);
	}

	/**
	 * Removes all the pharma application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetPS_StageName(String stageName) {
		getPersistence().removeBygetPS_StageName(stageName);
	}

	/**
	 * Returns the number of pharma application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching pharma application stageses
	 */
	public static int countBygetPS_StageName(String stageName) {
		return getPersistence().countBygetPS_StageName(stageName);
	}

	/**
	 * Returns all the pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching pharma application stageses
	 */
	public static List<PharmaApplicationStages>
		findBygetPS_StageName_StageStatus(
			String stageName, String stageStatus) {

		return getPersistence().findBygetPS_StageName_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns a range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages>
		findBygetPS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetPS_StageName_StageStatus(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages>
		findBygetPS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().findBygetPS_StageName_StageStatus(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages>
		findBygetPS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<PharmaApplicationStages> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetPS_StageName_StageStatus(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages
			findBygetPS_StageName_StageStatus_First(
				String stageName, String stageStatus,
				OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_StageName_StageStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages
		fetchBygetPS_StageName_StageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetPS_StageName_StageStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages
			findBygetPS_StageName_StageStatus_Last(
				String stageName, String stageStatus,
				OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_StageName_StageStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages
		fetchBygetPS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetPS_StageName_StageStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public static PharmaApplicationStages[]
			findBygetPS_StageName_StageStatus_PrevAndNext(
				long pharmaApplicationstageId, String stageName,
				String stageStatus,
				OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_StageName_StageStatus_PrevAndNext(
			pharmaApplicationstageId, stageName, stageStatus,
			orderByComparator);
	}

	/**
	 * Removes all the pharma application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetPS_StageName_StageStatus(
		String stageName, String stageStatus) {

		getPersistence().removeBygetPS_StageName_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the number of pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching pharma application stageses
	 */
	public static int countBygetPS_StageName_StageStatus(
		String stageName, String stageStatus) {

		return getPersistence().countBygetPS_StageName_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetPS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetPS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the pharma application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the pharma application stages that was removed
	 */
	public static PharmaApplicationStages removeBygetPS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().removeBygetPS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of pharma application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching pharma application stageses
	 */
	public static int countBygetPS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetPS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the pharma application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId) {

		return getPersistence().findBygetPS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the pharma application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetPS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().findBygetPS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_CaseId_First(
			String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_CaseId_First(
		String caseId,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetPS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_CaseId_Last(
			String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_CaseId_Last(
		String caseId,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetPS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public static PharmaApplicationStages[] findBygetPS_CaseId_PrevAndNext(
			long pharmaApplicationstageId, String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_CaseId_PrevAndNext(
			pharmaApplicationstageId, caseId, orderByComparator);
	}

	/**
	 * Removes all the pharma application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetPS_CaseId(String caseId) {
		getPersistence().removeBygetPS_CaseId(caseId);
	}

	/**
	 * Returns the number of pharma application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application stageses
	 */
	public static int countBygetPS_CaseId(String caseId) {
		return getPersistence().countBygetPS_CaseId(caseId);
	}

	/**
	 * Returns all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId) {

		return getPersistence().findBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId);
	}

	/**
	 * Returns a range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId, int start,
		int end) {

		return getPersistence().findBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().findBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application stageses
	 */
	public static List<PharmaApplicationStages> findBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_ByCaseIdStageStatus_First(
			String stageName, String stageStatus, String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_ByCaseIdStageStatus_First(
			stageName, stageStatus, caseId, orderByComparator);
	}

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages
		fetchBygetPS_ByCaseIdStageStatus_First(
			String stageName, String stageStatus, String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetPS_ByCaseIdStageStatus_First(
			stageName, stageStatus, caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_ByCaseIdStageStatus_Last(
			String stageName, String stageStatus, String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_ByCaseIdStageStatus_Last(
			stageName, stageStatus, caseId, orderByComparator);
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_ByCaseIdStageStatus_Last(
		String stageName, String stageStatus, String caseId,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetPS_ByCaseIdStageStatus_Last(
			stageName, stageStatus, caseId, orderByComparator);
	}

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public static PharmaApplicationStages[]
			findBygetPS_ByCaseIdStageStatus_PrevAndNext(
				long pharmaApplicationstageId, String stageName,
				String stageStatus, String caseId,
				OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_ByCaseIdStageStatus_PrevAndNext(
			pharmaApplicationstageId, stageName, stageStatus, caseId,
			orderByComparator);
	}

	/**
	 * Removes all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 */
	public static void removeBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId) {

		getPersistence().removeBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId);
	}

	/**
	 * Returns the number of pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the number of matching pharma application stageses
	 */
	public static int countBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId) {

		return getPersistence().countBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId);
	}

	/**
	 * Returns the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages findBygetPS_ByCaseId_SS_SN(
			String stageName, String stageStatus, String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findBygetPS_ByCaseId_SS_SN(
			stageName, stageStatus, caseId);
	}

	/**
	 * Returns the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_ByCaseId_SS_SN(
		String stageName, String stageStatus, String caseId) {

		return getPersistence().fetchBygetPS_ByCaseId_SS_SN(
			stageName, stageStatus, caseId);
	}

	/**
	 * Returns the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public static PharmaApplicationStages fetchBygetPS_ByCaseId_SS_SN(
		String stageName, String stageStatus, String caseId,
		boolean useFinderCache) {

		return getPersistence().fetchBygetPS_ByCaseId_SS_SN(
			stageName, stageStatus, caseId, useFinderCache);
	}

	/**
	 * Removes the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the pharma application stages that was removed
	 */
	public static PharmaApplicationStages removeBygetPS_ByCaseId_SS_SN(
			String stageName, String stageStatus, String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().removeBygetPS_ByCaseId_SS_SN(
			stageName, stageStatus, caseId);
	}

	/**
	 * Returns the number of pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the number of matching pharma application stageses
	 */
	public static int countBygetPS_ByCaseId_SS_SN(
		String stageName, String stageStatus, String caseId) {

		return getPersistence().countBygetPS_ByCaseId_SS_SN(
			stageName, stageStatus, caseId);
	}

	/**
	 * Caches the pharma application stages in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationStages the pharma application stages
	 */
	public static void cacheResult(
		PharmaApplicationStages pharmaApplicationStages) {

		getPersistence().cacheResult(pharmaApplicationStages);
	}

	/**
	 * Caches the pharma application stageses in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationStageses the pharma application stageses
	 */
	public static void cacheResult(
		List<PharmaApplicationStages> pharmaApplicationStageses) {

		getPersistence().cacheResult(pharmaApplicationStageses);
	}

	/**
	 * Creates a new pharma application stages with the primary key. Does not add the pharma application stages to the database.
	 *
	 * @param pharmaApplicationstageId the primary key for the new pharma application stages
	 * @return the new pharma application stages
	 */
	public static PharmaApplicationStages create(
		long pharmaApplicationstageId) {

		return getPersistence().create(pharmaApplicationstageId);
	}

	/**
	 * Removes the pharma application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages that was removed
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public static PharmaApplicationStages remove(long pharmaApplicationstageId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().remove(pharmaApplicationstageId);
	}

	public static PharmaApplicationStages updateImpl(
		PharmaApplicationStages pharmaApplicationStages) {

		return getPersistence().updateImpl(pharmaApplicationStages);
	}

	/**
	 * Returns the pharma application stages with the primary key or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public static PharmaApplicationStages findByPrimaryKey(
			long pharmaApplicationstageId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaApplicationStagesException {

		return getPersistence().findByPrimaryKey(pharmaApplicationstageId);
	}

	/**
	 * Returns the pharma application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages, or <code>null</code> if a pharma application stages with the primary key could not be found
	 */
	public static PharmaApplicationStages fetchByPrimaryKey(
		long pharmaApplicationstageId) {

		return getPersistence().fetchByPrimaryKey(pharmaApplicationstageId);
	}

	/**
	 * Returns all the pharma application stageses.
	 *
	 * @return the pharma application stageses
	 */
	public static List<PharmaApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of pharma application stageses
	 */
	public static List<PharmaApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application stageses
	 */
	public static List<PharmaApplicationStages> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application stageses
	 */
	public static List<PharmaApplicationStages> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma application stageses.
	 *
	 * @return the number of pharma application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaApplicationStagesPersistence _persistence;

}