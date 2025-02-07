/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire application stages service. This utility wraps <code>com.nbp.acquire.stages.service.service.persistence.impl.AcquireApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationStagesPersistence
 * @generated
 */
public class AcquireApplicationStagesUtil {

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
		AcquireApplicationStages acquireApplicationStages) {

		getPersistence().clearCache(acquireApplicationStages);
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
	public static Map<Serializable, AcquireApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireApplicationStages update(
		AcquireApplicationStages acquireApplicationStages) {

		return getPersistence().update(acquireApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireApplicationStages update(
		AcquireApplicationStages acquireApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			acquireApplicationStages, serviceContext);
	}

	/**
	 * Returns the acquire application stages where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages findBygetAcquireApplicationBy_AppId(
			long acquireApplicationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findBygetAcquireApplicationBy_AppId(
			acquireApplicationId);
	}

	/**
	 * Returns the acquire application stages where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages fetchBygetAcquireApplicationBy_AppId(
		long acquireApplicationId) {

		return getPersistence().fetchBygetAcquireApplicationBy_AppId(
			acquireApplicationId);
	}

	/**
	 * Returns the acquire application stages where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages fetchBygetAcquireApplicationBy_AppId(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireApplicationBy_AppId(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire application stages where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire application stages that was removed
	 */
	public static AcquireApplicationStages
			removeBygetAcquireApplicationBy_AppId(long acquireApplicationId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().removeBygetAcquireApplicationBy_AppId(
			acquireApplicationId);
	}

	/**
	 * Returns the number of acquire application stageses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire application stageses
	 */
	public static int countBygetAcquireApplicationBy_AppId(
		long acquireApplicationId) {

		return getPersistence().countBygetAcquireApplicationBy_AppId(
			acquireApplicationId);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
			findBygetAcquireApplicationBy_CaseId_StageName(
				String caseId, String stageName)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findBygetAcquireApplicationBy_CaseId_StageName(
			caseId, stageName);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName(
			String caseId, String stageName) {

		return getPersistence().fetchBygetAcquireApplicationBy_CaseId_StageName(
			caseId, stageName);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName(
			String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireApplicationBy_CaseId_StageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the acquire application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the acquire application stages that was removed
	 */
	public static AcquireApplicationStages
			removeBygetAcquireApplicationBy_CaseId_StageName(
				String caseId, String stageName)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().
			removeBygetAcquireApplicationBy_CaseId_StageName(caseId, stageName);
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching acquire application stageses
	 */
	public static int countBygetAcquireApplicationBy_CaseId_StageName(
		String caseId, String stageName) {

		return getPersistence().countBygetAcquireApplicationBy_CaseId_StageName(
			caseId, stageName);
	}

	/**
	 * Returns all the acquire application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN(String stageName) {

		return getPersistence().findBygetAcquireApplication_By_SN(stageName);
	}

	/**
	 * Returns a range of all the acquire application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN(
			String stageName, int start, int end) {

		return getPersistence().findBygetAcquireApplication_By_SN(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN(
			String stageName, int start, int end,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().findBygetAcquireApplication_By_SN(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN(
			String stageName, int start, int end,
			OrderByComparator<AcquireApplicationStages> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetAcquireApplication_By_SN(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
			findBygetAcquireApplication_By_SN_First(
				String stageName,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findBygetAcquireApplication_By_SN_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplication_By_SN_First(
			String stageName,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetAcquireApplication_By_SN_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
			findBygetAcquireApplication_By_SN_Last(
				String stageName,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findBygetAcquireApplication_By_SN_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplication_By_SN_Last(
			String stageName,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetAcquireApplication_By_SN_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the acquire application stageses before and after the current acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param acquireApplicationStagesId the primary key of the current acquire application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	public static AcquireApplicationStages[]
			findBygetAcquireApplication_By_SN_PrevAndNext(
				long acquireApplicationStagesId, String stageName,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findBygetAcquireApplication_By_SN_PrevAndNext(
			acquireApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the acquire application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetAcquireApplication_By_SN(String stageName) {
		getPersistence().removeBygetAcquireApplication_By_SN(stageName);
	}

	/**
	 * Returns the number of acquire application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching acquire application stageses
	 */
	public static int countBygetAcquireApplication_By_SN(String stageName) {
		return getPersistence().countBygetAcquireApplication_By_SN(stageName);
	}

	/**
	 * Returns all the acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus) {

		return getPersistence().findBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns a range of all the acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().findBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<AcquireApplicationStages> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
			findBygetAcquireApplication_By_SN_StageStatus_First(
				String stageName, String stageStatus,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().
			findBygetAcquireApplication_By_SN_StageStatus_First(
				stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplication_By_SN_StageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().
			fetchBygetAcquireApplication_By_SN_StageStatus_First(
				stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
			findBygetAcquireApplication_By_SN_StageStatus_Last(
				String stageName, String stageStatus,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().
			findBygetAcquireApplication_By_SN_StageStatus_Last(
				stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplication_By_SN_StageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().
			fetchBygetAcquireApplication_By_SN_StageStatus_Last(
				stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the acquire application stageses before and after the current acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param acquireApplicationStagesId the primary key of the current acquire application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	public static AcquireApplicationStages[]
			findBygetAcquireApplication_By_SN_StageStatus_PrevAndNext(
				long acquireApplicationStagesId, String stageName,
				String stageStatus,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().
			findBygetAcquireApplication_By_SN_StageStatus_PrevAndNext(
				acquireApplicationStagesId, stageName, stageStatus,
				orderByComparator);
	}

	/**
	 * Removes all the acquire application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetAcquireApplication_By_SN_StageStatus(
		String stageName, String stageStatus) {

		getPersistence().removeBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the number of acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching acquire application stageses
	 */
	public static int countBygetAcquireApplication_By_SN_StageStatus(
		String stageName, String stageStatus) {

		return getPersistence().countBygetAcquireApplication_By_SN_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
			findBygetAcquireApplicationBy_CaseId_StageName_Status(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().
			findBygetAcquireApplicationBy_CaseId_StageName_Status(
				caseId, stageName, stageStatus);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
			String caseId, String stageName, String stageStatus) {

		return getPersistence().
			fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
				caseId, stageName, stageStatus);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
			String caseId, String stageName, String stageStatus,
			boolean useFinderCache) {

		return getPersistence().
			fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
				caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the acquire application stages that was removed
	 */
	public static AcquireApplicationStages
			removeBygetAcquireApplicationBy_CaseId_StageName_Status(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().
			removeBygetAcquireApplicationBy_CaseId_StageName_Status(
				caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching acquire application stageses
	 */
	public static int countBygetAcquireApplicationBy_CaseId_StageName_Status(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().
			countBygetAcquireApplicationBy_CaseId_StageName_Status(
				caseId, stageName, stageStatus);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
			findBygetAcquireApplicationBy_CaseId_Status(
				String caseId, String stageStatus)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findBygetAcquireApplicationBy_CaseId_Status(
			caseId, stageStatus);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_Status(
			String caseId, String stageStatus) {

		return getPersistence().fetchBygetAcquireApplicationBy_CaseId_Status(
			caseId, stageStatus);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_Status(
			String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireApplicationBy_CaseId_Status(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the acquire application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the acquire application stages that was removed
	 */
	public static AcquireApplicationStages
			removeBygetAcquireApplicationBy_CaseId_Status(
				String caseId, String stageStatus)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().removeBygetAcquireApplicationBy_CaseId_Status(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching acquire application stageses
	 */
	public static int countBygetAcquireApplicationBy_CaseId_Status(
		String caseId, String stageStatus) {

		return getPersistence().countBygetAcquireApplicationBy_CaseId_Status(
			caseId, stageStatus);
	}

	/**
	 * Returns all the acquire application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplicationBy_CaseId(String caseId) {

		return getPersistence().findBygetAcquireApplicationBy_CaseId(caseId);
	}

	/**
	 * Returns a range of all the acquire application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplicationBy_CaseId(
			String caseId, int start, int end) {

		return getPersistence().findBygetAcquireApplicationBy_CaseId(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplicationBy_CaseId(
			String caseId, int start, int end,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().findBygetAcquireApplicationBy_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire application stageses
	 */
	public static List<AcquireApplicationStages>
		findBygetAcquireApplicationBy_CaseId(
			String caseId, int start, int end,
			OrderByComparator<AcquireApplicationStages> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetAcquireApplicationBy_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
			findBygetAcquireApplicationBy_CaseId_First(
				String caseId,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findBygetAcquireApplicationBy_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_First(
			String caseId,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetAcquireApplicationBy_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
			findBygetAcquireApplicationBy_CaseId_Last(
				String caseId,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findBygetAcquireApplicationBy_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_Last(
			String caseId,
			OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetAcquireApplicationBy_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the acquire application stageses before and after the current acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param acquireApplicationStagesId the primary key of the current acquire application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	public static AcquireApplicationStages[]
			findBygetAcquireApplicationBy_CaseId_PrevAndNext(
				long acquireApplicationStagesId, String caseId,
				OrderByComparator<AcquireApplicationStages> orderByComparator)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().
			findBygetAcquireApplicationBy_CaseId_PrevAndNext(
				acquireApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the acquire application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetAcquireApplicationBy_CaseId(String caseId) {
		getPersistence().removeBygetAcquireApplicationBy_CaseId(caseId);
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire application stageses
	 */
	public static int countBygetAcquireApplicationBy_CaseId(String caseId) {
		return getPersistence().countBygetAcquireApplicationBy_CaseId(caseId);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages findBygetAcquireApplicationBy_CI(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findBygetAcquireApplicationBy_CI(caseId);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages fetchBygetAcquireApplicationBy_CI(
		String caseId) {

		return getPersistence().fetchBygetAcquireApplicationBy_CI(caseId);
	}

	/**
	 * Returns the acquire application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public static AcquireApplicationStages fetchBygetAcquireApplicationBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireApplicationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire application stages that was removed
	 */
	public static AcquireApplicationStages removeBygetAcquireApplicationBy_CI(
			String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().removeBygetAcquireApplicationBy_CI(caseId);
	}

	/**
	 * Returns the number of acquire application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire application stageses
	 */
	public static int countBygetAcquireApplicationBy_CI(String caseId) {
		return getPersistence().countBygetAcquireApplicationBy_CI(caseId);
	}

	/**
	 * Caches the acquire application stages in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationStages the acquire application stages
	 */
	public static void cacheResult(
		AcquireApplicationStages acquireApplicationStages) {

		getPersistence().cacheResult(acquireApplicationStages);
	}

	/**
	 * Caches the acquire application stageses in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationStageses the acquire application stageses
	 */
	public static void cacheResult(
		List<AcquireApplicationStages> acquireApplicationStageses) {

		getPersistence().cacheResult(acquireApplicationStageses);
	}

	/**
	 * Creates a new acquire application stages with the primary key. Does not add the acquire application stages to the database.
	 *
	 * @param acquireApplicationStagesId the primary key for the new acquire application stages
	 * @return the new acquire application stages
	 */
	public static AcquireApplicationStages create(
		long acquireApplicationStagesId) {

		return getPersistence().create(acquireApplicationStagesId);
	}

	/**
	 * Removes the acquire application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages that was removed
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	public static AcquireApplicationStages remove(
			long acquireApplicationStagesId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().remove(acquireApplicationStagesId);
	}

	public static AcquireApplicationStages updateImpl(
		AcquireApplicationStages acquireApplicationStages) {

		return getPersistence().updateImpl(acquireApplicationStages);
	}

	/**
	 * Returns the acquire application stages with the primary key or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	public static AcquireApplicationStages findByPrimaryKey(
			long acquireApplicationStagesId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireApplicationStagesException {

		return getPersistence().findByPrimaryKey(acquireApplicationStagesId);
	}

	/**
	 * Returns the acquire application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages, or <code>null</code> if a acquire application stages with the primary key could not be found
	 */
	public static AcquireApplicationStages fetchByPrimaryKey(
		long acquireApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(acquireApplicationStagesId);
	}

	/**
	 * Returns all the acquire application stageses.
	 *
	 * @return the acquire application stageses
	 */
	public static List<AcquireApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @return the range of acquire application stageses
	 */
	public static List<AcquireApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire application stageses
	 */
	public static List<AcquireApplicationStages> findAll(
		int start, int end,
		OrderByComparator<AcquireApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application stageses
	 * @param end the upper bound of the range of acquire application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire application stageses
	 */
	public static List<AcquireApplicationStages> findAll(
		int start, int end,
		OrderByComparator<AcquireApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire application stageses.
	 *
	 * @return the number of acquire application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireApplicationStagesPersistence _persistence;

}