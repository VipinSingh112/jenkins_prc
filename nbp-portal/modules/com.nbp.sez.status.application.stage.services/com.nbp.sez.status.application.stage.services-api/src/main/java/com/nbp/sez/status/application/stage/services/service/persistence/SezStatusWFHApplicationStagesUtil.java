/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status wfh application stages service. This utility wraps <code>com.nbp.sez.status.application.stage.services.service.persistence.impl.SezStatusWFHApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWFHApplicationStagesPersistence
 * @generated
 */
public class SezStatusWFHApplicationStagesUtil {

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
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		getPersistence().clearCache(sezStatusWFHApplicationStages);
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
	public static Map<Serializable, SezStatusWFHApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusWFHApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusWFHApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusWFHApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusWFHApplicationStages update(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		return getPersistence().update(sezStatusWFHApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusWFHApplicationStages update(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezStatusWFHApplicationStages, serviceContext);
	}

	/**
	 * Returns the sez status wfh application stages where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages findBygetSAS_SAI(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the sez status wfh application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSAS_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the sez status wfh application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSAS_SAI(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez status wfh application stages where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status wfh application stages that was removed
	 */
	public static SezStatusWFHApplicationStages removeBygetSAS_SAI(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().removeBygetSAS_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez status wfh application stageses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status wfh application stageses
	 */
	public static int countBygetSAS_SAI(long sezStatusApplicationId) {
		return getPersistence().countBygetSAS_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages findBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetSAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetSAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the sez status wfh application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the sez status wfh application stages that was removed
	 */
	public static SezStatusWFHApplicationStages removeBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().removeBygetSAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching sez status wfh application stageses
	 */
	public static int countBygetSAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetSAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName) {

		return getPersistence().findBygetSAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of matching sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetSAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return getPersistence().findBygetSAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages findBygetSAS_StageName_First(
			String stageName,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_StageName_First(
		String stageName,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetSAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages findBygetSAS_StageName_Last(
			String stageName,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_StageName_Last(
		String stageName,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetSAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the sez status wfh application stageses before and after the current sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param sezWFHAppStagesId the primary key of the current sez status wfh application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	public static SezStatusWFHApplicationStages[]
			findBygetSAS_StageName_PrevAndNext(
				long sezWFHAppStagesId, String stageName,
				OrderByComparator<SezStatusWFHApplicationStages>
					orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_StageName_PrevAndNext(
			sezWFHAppStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the sez status wfh application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetSAS_StageName(String stageName) {
		getPersistence().removeBygetSAS_StageName(stageName);
	}

	/**
	 * Returns the number of sez status wfh application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching sez status wfh application stageses
	 */
	public static int countBygetSAS_StageName(String stageName) {
		return getPersistence().countBygetSAS_StageName(stageName);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages findBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the sez status wfh application stages that was removed
	 */
	public static SezStatusWFHApplicationStages
			removeBygetSAS_CaseIdStageStatus(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().removeBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching sez status wfh application stageses
	 */
	public static int countBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages findBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetSAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetSAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the sez status wfh application stages that was removed
	 */
	public static SezStatusWFHApplicationStages removeBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().removeBygetSAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching sez status wfh application stageses
	 */
	public static int countBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetSAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId) {

		return getPersistence().findBygetSAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of matching sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetSAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return getPersistence().findBygetSAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages findBygetSAS_CaseId_First(
			String caseId,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_CaseId_First(
		String caseId,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetSAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages findBygetSAS_CaseId_Last(
			String caseId,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	public static SezStatusWFHApplicationStages fetchBygetSAS_CaseId_Last(
		String caseId,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetSAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the sez status wfh application stageses before and after the current sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param sezWFHAppStagesId the primary key of the current sez status wfh application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	public static SezStatusWFHApplicationStages[]
			findBygetSAS_CaseId_PrevAndNext(
				long sezWFHAppStagesId, String caseId,
				OrderByComparator<SezStatusWFHApplicationStages>
					orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findBygetSAS_CaseId_PrevAndNext(
			sezWFHAppStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the sez status wfh application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetSAS_CaseId(String caseId) {
		getPersistence().removeBygetSAS_CaseId(caseId);
	}

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status wfh application stageses
	 */
	public static int countBygetSAS_CaseId(String caseId) {
		return getPersistence().countBygetSAS_CaseId(caseId);
	}

	/**
	 * Caches the sez status wfh application stages in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFHApplicationStages the sez status wfh application stages
	 */
	public static void cacheResult(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		getPersistence().cacheResult(sezStatusWFHApplicationStages);
	}

	/**
	 * Caches the sez status wfh application stageses in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFHApplicationStageses the sez status wfh application stageses
	 */
	public static void cacheResult(
		List<SezStatusWFHApplicationStages> sezStatusWFHApplicationStageses) {

		getPersistence().cacheResult(sezStatusWFHApplicationStageses);
	}

	/**
	 * Creates a new sez status wfh application stages with the primary key. Does not add the sez status wfh application stages to the database.
	 *
	 * @param sezWFHAppStagesId the primary key for the new sez status wfh application stages
	 * @return the new sez status wfh application stages
	 */
	public static SezStatusWFHApplicationStages create(long sezWFHAppStagesId) {
		return getPersistence().create(sezWFHAppStagesId);
	}

	/**
	 * Removes the sez status wfh application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages that was removed
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	public static SezStatusWFHApplicationStages remove(long sezWFHAppStagesId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().remove(sezWFHAppStagesId);
	}

	public static SezStatusWFHApplicationStages updateImpl(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		return getPersistence().updateImpl(sezStatusWFHApplicationStages);
	}

	/**
	 * Returns the sez status wfh application stages with the primary key or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	public static SezStatusWFHApplicationStages findByPrimaryKey(
			long sezWFHAppStagesId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusWFHApplicationStagesException {

		return getPersistence().findByPrimaryKey(sezWFHAppStagesId);
	}

	/**
	 * Returns the sez status wfh application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages, or <code>null</code> if a sez status wfh application stages with the primary key could not be found
	 */
	public static SezStatusWFHApplicationStages fetchByPrimaryKey(
		long sezWFHAppStagesId) {

		return getPersistence().fetchByPrimaryKey(sezWFHAppStagesId);
	}

	/**
	 * Returns all the sez status wfh application stageses.
	 *
	 * @return the sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findAll(
		int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status wfh application stageses
	 */
	public static List<SezStatusWFHApplicationStages> findAll(
		int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status wfh application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status wfh application stageses.
	 *
	 * @return the number of sez status wfh application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusWFHApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusWFHApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusWFHApplicationStagesPersistence
		_persistence;

}