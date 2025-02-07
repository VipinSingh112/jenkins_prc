/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.stages.service.exception.NoSuchAcquireApplicationStagesException;
import com.nbp.acquire.stages.service.model.AcquireApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface AcquireApplicationStagesPersistence
	extends BasePersistence<AcquireApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireApplicationStagesUtil} to access the acquire application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the acquire application stages where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages findBygetAcquireApplicationBy_AppId(
			long acquireApplicationId)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the acquire application stages where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_AppId(
		long acquireApplicationId);

	/**
	 * Returns the acquire application stages where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_AppId(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire application stages where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire application stages that was removed
	 */
	public AcquireApplicationStages removeBygetAcquireApplicationBy_AppId(
			long acquireApplicationId)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the number of acquire application stageses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire application stageses
	 */
	public int countBygetAcquireApplicationBy_AppId(long acquireApplicationId);

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
			findBygetAcquireApplicationBy_CaseId_StageName(
				String caseId, String stageName)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName(
			String caseId, String stageName);

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName(
			String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the acquire application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the acquire application stages that was removed
	 */
	public AcquireApplicationStages
			removeBygetAcquireApplicationBy_CaseId_StageName(
				String caseId, String stageName)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the number of acquire application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching acquire application stageses
	 */
	public int countBygetAcquireApplicationBy_CaseId_StageName(
		String caseId, String stageName);

	/**
	 * Returns all the acquire application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching acquire application stageses
	 */
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN(String stageName);

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
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN(String stageName, int start, int end);

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
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator);

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
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages findBygetAcquireApplication_By_SN_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages fetchBygetAcquireApplication_By_SN_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireApplicationStages> orderByComparator);

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages findBygetAcquireApplication_By_SN_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages fetchBygetAcquireApplication_By_SN_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireApplicationStages> orderByComparator);

	/**
	 * Returns the acquire application stageses before and after the current acquire application stages in the ordered set where stageName = &#63;.
	 *
	 * @param acquireApplicationStagesId the primary key of the current acquire application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	public AcquireApplicationStages[]
			findBygetAcquireApplication_By_SN_PrevAndNext(
				long acquireApplicationStagesId, String stageName,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Removes all the acquire application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetAcquireApplication_By_SN(String stageName);

	/**
	 * Returns the number of acquire application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching acquire application stageses
	 */
	public int countBygetAcquireApplication_By_SN(String stageName);

	/**
	 * Returns all the acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching acquire application stageses
	 */
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus);

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
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus, int start, int end);

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
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator);

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
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplication_By_SN_StageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
			findBygetAcquireApplication_By_SN_StageStatus_First(
				String stageName, String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the first acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
		fetchBygetAcquireApplication_By_SN_StageStatus_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator);

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
			findBygetAcquireApplication_By_SN_StageStatus_Last(
				String stageName, String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the last acquire application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
		fetchBygetAcquireApplication_By_SN_StageStatus_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator);

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
	public AcquireApplicationStages[]
			findBygetAcquireApplication_By_SN_StageStatus_PrevAndNext(
				long acquireApplicationStagesId, String stageName,
				String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Removes all the acquire application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetAcquireApplication_By_SN_StageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the number of acquire application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching acquire application stageses
	 */
	public int countBygetAcquireApplication_By_SN_StageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
			findBygetAcquireApplicationBy_CaseId_StageName_Status(
				String caseId, String stageName, String stageStatus)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
			String caseId, String stageName, String stageStatus);

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_StageName_Status(
			String caseId, String stageName, String stageStatus,
			boolean useFinderCache);

	/**
	 * Removes the acquire application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the acquire application stages that was removed
	 */
	public AcquireApplicationStages
			removeBygetAcquireApplicationBy_CaseId_StageName_Status(
				String caseId, String stageName, String stageStatus)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the number of acquire application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching acquire application stageses
	 */
	public int countBygetAcquireApplicationBy_CaseId_StageName_Status(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages findBygetAcquireApplicationBy_CaseId_Status(
			String caseId, String stageStatus)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_Status(
			String caseId, String stageStatus);

	/**
	 * Returns the acquire application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages
		fetchBygetAcquireApplicationBy_CaseId_Status(
			String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the acquire application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the acquire application stages that was removed
	 */
	public AcquireApplicationStages
			removeBygetAcquireApplicationBy_CaseId_Status(
				String caseId, String stageStatus)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the number of acquire application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching acquire application stageses
	 */
	public int countBygetAcquireApplicationBy_CaseId_Status(
		String caseId, String stageStatus);

	/**
	 * Returns all the acquire application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application stageses
	 */
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplicationBy_CaseId(String caseId);

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
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplicationBy_CaseId(String caseId, int start, int end);

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
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplicationBy_CaseId(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator);

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
	public java.util.List<AcquireApplicationStages>
		findBygetAcquireApplicationBy_CaseId(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages findBygetAcquireApplicationBy_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the first acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireApplicationStages> orderByComparator);

	/**
	 * Returns the last acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages findBygetAcquireApplicationBy_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the last acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireApplicationStages> orderByComparator);

	/**
	 * Returns the acquire application stageses before and after the current acquire application stages in the ordered set where caseId = &#63;.
	 *
	 * @param acquireApplicationStagesId the primary key of the current acquire application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	public AcquireApplicationStages[]
			findBygetAcquireApplicationBy_CaseId_PrevAndNext(
				long acquireApplicationStagesId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquireApplicationStages> orderByComparator)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Removes all the acquire application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetAcquireApplicationBy_CaseId(String caseId);

	/**
	 * Returns the number of acquire application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire application stageses
	 */
	public int countBygetAcquireApplicationBy_CaseId(String caseId);

	/**
	 * Returns the acquire application stages where caseId = &#63; or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages findBygetAcquireApplicationBy_CI(
			String caseId)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the acquire application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_CI(
		String caseId);

	/**
	 * Returns the acquire application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application stages, or <code>null</code> if a matching acquire application stages could not be found
	 */
	public AcquireApplicationStages fetchBygetAcquireApplicationBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire application stages that was removed
	 */
	public AcquireApplicationStages removeBygetAcquireApplicationBy_CI(
			String caseId)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the number of acquire application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire application stageses
	 */
	public int countBygetAcquireApplicationBy_CI(String caseId);

	/**
	 * Caches the acquire application stages in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationStages the acquire application stages
	 */
	public void cacheResult(AcquireApplicationStages acquireApplicationStages);

	/**
	 * Caches the acquire application stageses in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationStageses the acquire application stageses
	 */
	public void cacheResult(
		java.util.List<AcquireApplicationStages> acquireApplicationStageses);

	/**
	 * Creates a new acquire application stages with the primary key. Does not add the acquire application stages to the database.
	 *
	 * @param acquireApplicationStagesId the primary key for the new acquire application stages
	 * @return the new acquire application stages
	 */
	public AcquireApplicationStages create(long acquireApplicationStagesId);

	/**
	 * Removes the acquire application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages that was removed
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	public AcquireApplicationStages remove(long acquireApplicationStagesId)
		throws NoSuchAcquireApplicationStagesException;

	public AcquireApplicationStages updateImpl(
		AcquireApplicationStages acquireApplicationStages);

	/**
	 * Returns the acquire application stages with the primary key or throws a <code>NoSuchAcquireApplicationStagesException</code> if it could not be found.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages
	 * @throws NoSuchAcquireApplicationStagesException if a acquire application stages with the primary key could not be found
	 */
	public AcquireApplicationStages findByPrimaryKey(
			long acquireApplicationStagesId)
		throws NoSuchAcquireApplicationStagesException;

	/**
	 * Returns the acquire application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireApplicationStagesId the primary key of the acquire application stages
	 * @return the acquire application stages, or <code>null</code> if a acquire application stages with the primary key could not be found
	 */
	public AcquireApplicationStages fetchByPrimaryKey(
		long acquireApplicationStagesId);

	/**
	 * Returns all the acquire application stageses.
	 *
	 * @return the acquire application stageses
	 */
	public java.util.List<AcquireApplicationStages> findAll();

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
	public java.util.List<AcquireApplicationStages> findAll(int start, int end);

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
	public java.util.List<AcquireApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireApplicationStages> orderByComparator);

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
	public java.util.List<AcquireApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<AcquireApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire application stageses.
	 *
	 * @return the number of acquire application stageses
	 */
	public int countAll();

}