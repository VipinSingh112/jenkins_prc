/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationStagesException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationStagesPersistence
	extends BasePersistence<CannabisApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationStagesUtil} to access the cannabis application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the cannabis application stages where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the cannabis application stages where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CAI(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis application stages where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CAI(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis application stages where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application stages that was removed
	 */
	public CannabisApplicationStages removeBygetCAS_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the number of cannabis application stageses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application stageses
	 */
	public int countBygetCAS_CAI(long cannabisApplicationId);

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the cannabis application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the cannabis application stages that was removed
	 */
	public CannabisApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching cannabis application stageses
	 */
	public int countBygetCAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the cannabis application stages that was removed
	 */
	public CannabisApplicationStages removeBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching cannabis application stageses
	 */
	public int countBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the cannabis application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the cannabis application stages that was removed
	 */
	public CannabisApplicationStages removeBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching cannabis application stageses
	 */
	public int countBygetCAS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the cannabis application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application stageses
	 */
	public java.util.List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId);

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
	public java.util.List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end);

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
	public java.util.List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

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
	public java.util.List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the first cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

	/**
	 * Returns the last cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the last cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public CannabisApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long cannabisApplicationstageId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Removes all the cannabis application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCAS_CaseId(String caseId);

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application stageses
	 */
	public int countBygetCAS_CaseId(String caseId);

	/**
	 * Returns all the cannabis application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching cannabis application stageses
	 */
	public java.util.List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName);

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
	public java.util.List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end);

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
	public java.util.List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

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
	public java.util.List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public CannabisApplicationStages[] findBygetCAS_StageName_PrevAndNext(
			long cannabisApplicationstageId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Removes all the cannabis application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetCAS_StageName(String stageName);

	/**
	 * Returns the number of cannabis application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching cannabis application stageses
	 */
	public int countBygetCAS_StageName(String stageName);

	/**
	 * Returns all the cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching cannabis application stageses
	 */
	public java.util.List<CannabisApplicationStages>
		findBygetCAS_StageName_StageStatus(
			String stageStatus, String stageName);

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
	public java.util.List<CannabisApplicationStages>
		findBygetCAS_StageName_StageStatus(
			String stageStatus, String stageName, int start, int end);

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
	public java.util.List<CannabisApplicationStages>
		findBygetCAS_StageName_StageStatus(
			String stageStatus, String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator);

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
	public java.util.List<CannabisApplicationStages>
		findBygetCAS_StageName_StageStatus(
			String stageStatus, String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_StageName_StageStatus_First(
			String stageStatus, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the first cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_StageName_StageStatus_First(
		String stageStatus, String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

	/**
	 * Returns the last cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_StageName_StageStatus_Last(
			String stageStatus, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the last cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_StageName_StageStatus_Last(
		String stageStatus, String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

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
	public CannabisApplicationStages[]
			findBygetCAS_StageName_StageStatus_PrevAndNext(
				long cannabisApplicationstageId, String stageStatus,
				String stageName,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Removes all the cannabis application stageses where stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 */
	public void removeBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName);

	/**
	 * Returns the number of cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching cannabis application stageses
	 */
	public int countBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName);

	/**
	 * Returns all the cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stageses
	 */
	public java.util.List<CannabisApplicationStages>
		findBygetCAS_StageNameStatus(String stageName, String stageStatus);

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
	public java.util.List<CannabisApplicationStages>
		findBygetCAS_StageNameStatus(
			String stageName, String stageStatus, int start, int end);

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
	public java.util.List<CannabisApplicationStages>
		findBygetCAS_StageNameStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator);

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
	public java.util.List<CannabisApplicationStages>
		findBygetCAS_StageNameStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_StageNameStatus_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_StageNameStatus_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages findBygetCAS_StageNameStatus_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	public CannabisApplicationStages fetchBygetCAS_StageNameStatus_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

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
	public CannabisApplicationStages[] findBygetCAS_StageNameStatus_PrevAndNext(
			long cannabisApplicationstageId, String stageName,
			String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Removes all the cannabis application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetCAS_StageNameStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the number of cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching cannabis application stageses
	 */
	public int countBygetCAS_StageNameStatus(
		String stageName, String stageStatus);

	/**
	 * Caches the cannabis application stages in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationStages the cannabis application stages
	 */
	public void cacheResult(
		CannabisApplicationStages cannabisApplicationStages);

	/**
	 * Caches the cannabis application stageses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationStageses the cannabis application stageses
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationStages> cannabisApplicationStageses);

	/**
	 * Creates a new cannabis application stages with the primary key. Does not add the cannabis application stages to the database.
	 *
	 * @param cannabisApplicationstageId the primary key for the new cannabis application stages
	 * @return the new cannabis application stages
	 */
	public CannabisApplicationStages create(long cannabisApplicationstageId);

	/**
	 * Removes the cannabis application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages that was removed
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public CannabisApplicationStages remove(long cannabisApplicationstageId)
		throws NoSuchCannabisApplicationStagesException;

	public CannabisApplicationStages updateImpl(
		CannabisApplicationStages cannabisApplicationStages);

	/**
	 * Returns the cannabis application stages with the primary key or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	public CannabisApplicationStages findByPrimaryKey(
			long cannabisApplicationstageId)
		throws NoSuchCannabisApplicationStagesException;

	/**
	 * Returns the cannabis application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages, or <code>null</code> if a cannabis application stages with the primary key could not be found
	 */
	public CannabisApplicationStages fetchByPrimaryKey(
		long cannabisApplicationstageId);

	/**
	 * Returns all the cannabis application stageses.
	 *
	 * @return the cannabis application stageses
	 */
	public java.util.List<CannabisApplicationStages> findAll();

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
	public java.util.List<CannabisApplicationStages> findAll(
		int start, int end);

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
	public java.util.List<CannabisApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator);

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
	public java.util.List<CannabisApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application stageses.
	 *
	 * @return the number of cannabis application stageses
	 */
	public int countAll();

}