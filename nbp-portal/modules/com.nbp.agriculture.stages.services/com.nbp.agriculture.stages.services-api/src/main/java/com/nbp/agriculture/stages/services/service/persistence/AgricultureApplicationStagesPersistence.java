/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.agriculture.stages.services.exception.NoSuchAgricultureApplicationStagesException;
import com.nbp.agriculture.stages.services.model.AgricultureApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface AgricultureApplicationStagesPersistence
	extends BasePersistence<AgricultureApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureApplicationStagesUtil} to access the agriculture application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture application stages where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findByAAS_CAI(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the agriculture application stages where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CAI(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture application stages where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CAI(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture application stages where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture application stages that was removed
	 */
	public AgricultureApplicationStages removeByAAS_CAI(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the number of agriculture application stageses where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture application stageses
	 */
	public int countByAAS_CAI(long agricultureApplicationId);

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findByAAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the agriculture application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the agriculture application stages that was removed
	 */
	public AgricultureApplicationStages removeByAAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the number of agriculture application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching agriculture application stageses
	 */
	public int countByAAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the agriculture application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching agriculture application stageses
	 */
	public java.util.List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName);

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
	public java.util.List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName, int start, int end);

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
	public java.util.List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator);

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
	public java.util.List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findByAAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator);

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findByAAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator);

	/**
	 * Returns the agriculture application stageses before and after the current agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param agricultureApplicationstageId the primary key of the current agriculture application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	public AgricultureApplicationStages[] findByAAS_StageName_PrevAndNext(
			long agricultureApplicationstageId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Removes all the agriculture application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeByAAS_StageName(String stageName);

	/**
	 * Returns the number of agriculture application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching agriculture application stageses
	 */
	public int countByAAS_StageName(String stageName);

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findByAAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the agriculture application stages that was removed
	 */
	public AgricultureApplicationStages removeByAAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the number of agriculture application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching agriculture application stageses
	 */
	public int countByAAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the agriculture application stages where stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findByAAS_CaseIdAndStatus(
			String stageName, String stageStatus)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the agriculture application stages where stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CaseIdAndStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the agriculture application stages where stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CaseIdAndStatus(
		String stageName, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the agriculture application stages where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the agriculture application stages that was removed
	 */
	public AgricultureApplicationStages removeByAAS_CaseIdAndStatus(
			String stageName, String stageStatus)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the number of agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching agriculture application stageses
	 */
	public int countByAAS_CaseIdAndStatus(String stageName, String stageStatus);

	/**
	 * Returns all the agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stageses
	 */
	public java.util.List<AgricultureApplicationStages>
		findBygetAgricultureBy_SN_SS(String stageName, String stageStatus);

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
	public java.util.List<AgricultureApplicationStages>
		findBygetAgricultureBy_SN_SS(
			String stageName, String stageStatus, int start, int end);

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
	public java.util.List<AgricultureApplicationStages>
		findBygetAgricultureBy_SN_SS(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator);

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
	public java.util.List<AgricultureApplicationStages>
		findBygetAgricultureBy_SN_SS(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findBygetAgricultureBy_SN_SS_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchBygetAgricultureBy_SN_SS_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator);

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findBygetAgricultureBy_SN_SS_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchBygetAgricultureBy_SN_SS_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator);

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
	public AgricultureApplicationStages[]
			findBygetAgricultureBy_SN_SS_PrevAndNext(
				long agricultureApplicationstageId, String stageName,
				String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Removes all the agriculture application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus);

	/**
	 * Returns the number of agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching agriculture application stageses
	 */
	public int countBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus);

	/**
	 * Returns all the agriculture application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture application stageses
	 */
	public java.util.List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId);

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
	public java.util.List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId, int start, int end);

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
	public java.util.List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator);

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
	public java.util.List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findByAAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the first agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator);

	/**
	 * Returns the last agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages findByAAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the last agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	public AgricultureApplicationStages fetchByAAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator);

	/**
	 * Returns the agriculture application stageses before and after the current agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param agricultureApplicationstageId the primary key of the current agriculture application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	public AgricultureApplicationStages[] findByAAS_CaseId_PrevAndNext(
			long agricultureApplicationstageId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Removes all the agriculture application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeByAAS_CaseId(String caseId);

	/**
	 * Returns the number of agriculture application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture application stageses
	 */
	public int countByAAS_CaseId(String caseId);

	/**
	 * Caches the agriculture application stages in the entity cache if it is enabled.
	 *
	 * @param agricultureApplicationStages the agriculture application stages
	 */
	public void cacheResult(
		AgricultureApplicationStages agricultureApplicationStages);

	/**
	 * Caches the agriculture application stageses in the entity cache if it is enabled.
	 *
	 * @param agricultureApplicationStageses the agriculture application stageses
	 */
	public void cacheResult(
		java.util.List<AgricultureApplicationStages>
			agricultureApplicationStageses);

	/**
	 * Creates a new agriculture application stages with the primary key. Does not add the agriculture application stages to the database.
	 *
	 * @param agricultureApplicationstageId the primary key for the new agriculture application stages
	 * @return the new agriculture application stages
	 */
	public AgricultureApplicationStages create(
		long agricultureApplicationstageId);

	/**
	 * Removes the agriculture application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages that was removed
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	public AgricultureApplicationStages remove(
			long agricultureApplicationstageId)
		throws NoSuchAgricultureApplicationStagesException;

	public AgricultureApplicationStages updateImpl(
		AgricultureApplicationStages agricultureApplicationStages);

	/**
	 * Returns the agriculture application stages with the primary key or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	public AgricultureApplicationStages findByPrimaryKey(
			long agricultureApplicationstageId)
		throws NoSuchAgricultureApplicationStagesException;

	/**
	 * Returns the agriculture application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages, or <code>null</code> if a agriculture application stages with the primary key could not be found
	 */
	public AgricultureApplicationStages fetchByPrimaryKey(
		long agricultureApplicationstageId);

	/**
	 * Returns all the agriculture application stageses.
	 *
	 * @return the agriculture application stageses
	 */
	public java.util.List<AgricultureApplicationStages> findAll();

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
	public java.util.List<AgricultureApplicationStages> findAll(
		int start, int end);

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
	public java.util.List<AgricultureApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator);

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
	public java.util.List<AgricultureApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AgricultureApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture application stageses.
	 *
	 * @return the number of agriculture application stageses
	 */
	public int countAll();

}