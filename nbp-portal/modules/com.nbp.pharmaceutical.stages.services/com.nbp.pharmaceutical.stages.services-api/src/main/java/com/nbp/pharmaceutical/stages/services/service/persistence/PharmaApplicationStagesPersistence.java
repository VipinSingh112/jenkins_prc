/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationStagesException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface PharmaApplicationStagesPersistence
	extends BasePersistence<PharmaApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaApplicationStagesUtil} to access the pharma application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma application stages where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_CAI(long pharmaApplicationId)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the pharma application stages where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_CAI(long pharmaApplicationId);

	/**
	 * Returns the pharma application stages where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_CAI(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma application stages where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application stages that was removed
	 */
	public PharmaApplicationStages removeBygetPS_CAI(long pharmaApplicationId)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the number of pharma application stageses where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma application stageses
	 */
	public int countBygetPS_CAI(long pharmaApplicationId);

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the pharma application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the pharma application stages that was removed
	 */
	public PharmaApplicationStages removeBygetPS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the number of pharma application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching pharma application stageses
	 */
	public int countBygetPS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the pharma application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching pharma application stageses
	 */
	public java.util.List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName);

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
	public java.util.List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName, int start, int end);

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
	public java.util.List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

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
	public java.util.List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public PharmaApplicationStages[] findBygetPS_StageName_PrevAndNext(
			long pharmaApplicationstageId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Removes all the pharma application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetPS_StageName(String stageName);

	/**
	 * Returns the number of pharma application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching pharma application stageses
	 */
	public int countBygetPS_StageName(String stageName);

	/**
	 * Returns all the pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching pharma application stageses
	 */
	public java.util.List<PharmaApplicationStages>
		findBygetPS_StageName_StageStatus(String stageName, String stageStatus);

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
	public java.util.List<PharmaApplicationStages>
		findBygetPS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end);

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
	public java.util.List<PharmaApplicationStages>
		findBygetPS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator);

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
	public java.util.List<PharmaApplicationStages>
		findBygetPS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_StageName_StageStatus_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_StageName_StageStatus_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_StageName_StageStatus_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

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
	public PharmaApplicationStages[]
			findBygetPS_StageName_StageStatus_PrevAndNext(
				long pharmaApplicationstageId, String stageName,
				String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Removes all the pharma application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetPS_StageName_StageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the number of pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching pharma application stageses
	 */
	public int countBygetPS_StageName_StageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the pharma application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the pharma application stages that was removed
	 */
	public PharmaApplicationStages removeBygetPS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the number of pharma application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching pharma application stageses
	 */
	public int countBygetPS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the pharma application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application stageses
	 */
	public java.util.List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId);

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
	public java.util.List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId, int start, int end);

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
	public java.util.List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

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
	public java.util.List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the first pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

	/**
	 * Returns the last pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the last pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public PharmaApplicationStages[] findBygetPS_CaseId_PrevAndNext(
			long pharmaApplicationstageId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Removes all the pharma application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetPS_CaseId(String caseId);

	/**
	 * Returns the number of pharma application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application stageses
	 */
	public int countBygetPS_CaseId(String caseId);

	/**
	 * Returns all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the matching pharma application stageses
	 */
	public java.util.List<PharmaApplicationStages>
		findBygetPS_ByCaseIdStageStatus(
			String stageName, String stageStatus, String caseId);

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
	public java.util.List<PharmaApplicationStages>
		findBygetPS_ByCaseIdStageStatus(
			String stageName, String stageStatus, String caseId, int start,
			int end);

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
	public java.util.List<PharmaApplicationStages>
		findBygetPS_ByCaseIdStageStatus(
			String stageName, String stageStatus, String caseId, int start,
			int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator);

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
	public java.util.List<PharmaApplicationStages>
		findBygetPS_ByCaseIdStageStatus(
			String stageName, String stageStatus, String caseId, int start,
			int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator,
			boolean useFinderCache);

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
	public PharmaApplicationStages findBygetPS_ByCaseIdStageStatus_First(
			String stageName, String stageStatus, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_ByCaseIdStageStatus_First(
		String stageName, String stageStatus, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

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
	public PharmaApplicationStages findBygetPS_ByCaseIdStageStatus_Last(
			String stageName, String stageStatus, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_ByCaseIdStageStatus_Last(
		String stageName, String stageStatus, String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

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
	public PharmaApplicationStages[]
			findBygetPS_ByCaseIdStageStatus_PrevAndNext(
				long pharmaApplicationstageId, String stageName,
				String stageStatus, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Removes all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 */
	public void removeBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId);

	/**
	 * Returns the number of pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the number of matching pharma application stageses
	 */
	public int countBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId);

	/**
	 * Returns the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages findBygetPS_ByCaseId_SS_SN(
			String stageName, String stageStatus, String caseId)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_ByCaseId_SS_SN(
		String stageName, String stageStatus, String caseId);

	/**
	 * Returns the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	public PharmaApplicationStages fetchBygetPS_ByCaseId_SS_SN(
		String stageName, String stageStatus, String caseId,
		boolean useFinderCache);

	/**
	 * Removes the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the pharma application stages that was removed
	 */
	public PharmaApplicationStages removeBygetPS_ByCaseId_SS_SN(
			String stageName, String stageStatus, String caseId)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the number of pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the number of matching pharma application stageses
	 */
	public int countBygetPS_ByCaseId_SS_SN(
		String stageName, String stageStatus, String caseId);

	/**
	 * Caches the pharma application stages in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationStages the pharma application stages
	 */
	public void cacheResult(PharmaApplicationStages pharmaApplicationStages);

	/**
	 * Caches the pharma application stageses in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationStageses the pharma application stageses
	 */
	public void cacheResult(
		java.util.List<PharmaApplicationStages> pharmaApplicationStageses);

	/**
	 * Creates a new pharma application stages with the primary key. Does not add the pharma application stages to the database.
	 *
	 * @param pharmaApplicationstageId the primary key for the new pharma application stages
	 * @return the new pharma application stages
	 */
	public PharmaApplicationStages create(long pharmaApplicationstageId);

	/**
	 * Removes the pharma application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages that was removed
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public PharmaApplicationStages remove(long pharmaApplicationstageId)
		throws NoSuchPharmaApplicationStagesException;

	public PharmaApplicationStages updateImpl(
		PharmaApplicationStages pharmaApplicationStages);

	/**
	 * Returns the pharma application stages with the primary key or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	public PharmaApplicationStages findByPrimaryKey(
			long pharmaApplicationstageId)
		throws NoSuchPharmaApplicationStagesException;

	/**
	 * Returns the pharma application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages, or <code>null</code> if a pharma application stages with the primary key could not be found
	 */
	public PharmaApplicationStages fetchByPrimaryKey(
		long pharmaApplicationstageId);

	/**
	 * Returns all the pharma application stageses.
	 *
	 * @return the pharma application stageses
	 */
	public java.util.List<PharmaApplicationStages> findAll();

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
	public java.util.List<PharmaApplicationStages> findAll(int start, int end);

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
	public java.util.List<PharmaApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator);

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
	public java.util.List<PharmaApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma application stageses.
	 *
	 * @return the number of pharma application stageses
	 */
	public int countAll();

}