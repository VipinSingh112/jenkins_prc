/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.stage.service.exception.NoSuchMiningApplicationStagesException;
import com.nbp.mining.stage.service.model.MiningApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface MiningApplicationStagesPersistence
	extends BasePersistence<MiningApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningApplicationStagesUtil} to access the mining application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the mining application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the mining application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public MiningApplicationStages[] findByUuid_PrevAndNext(
			long miningStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Removes all the mining application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of mining application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the mining application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the mining application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the mining application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the mining application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application stages that was removed
	 */
	public MiningApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the number of mining application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public MiningApplicationStages[] findByUuid_C_PrevAndNext(
			long miningStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Removes all the mining application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the mining application stages where miningApplicationId = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findBygetMining_By_AI(
			long miningApplicationId)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the mining application stages where miningApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_AI(
		long miningApplicationId);

	/**
	 * Returns the mining application stages where miningApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_AI(
		long miningApplicationId, boolean useFinderCache);

	/**
	 * Removes the mining application stages where miningApplicationId = &#63; from the database.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the mining application stages that was removed
	 */
	public MiningApplicationStages removeBygetMining_By_AI(
			long miningApplicationId)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the number of mining application stageses where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the number of matching mining application stageses
	 */
	public int countBygetMining_By_AI(long miningApplicationId);

	/**
	 * Returns the mining application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findBygetMining_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the mining application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the mining application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the mining application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the mining application stages that was removed
	 */
	public MiningApplicationStages removeBygetMining_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the number of mining application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching mining application stageses
	 */
	public int countBygetMining_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findBygetMining_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the mining application stages that was removed
	 */
	public MiningApplicationStages removeBygetMining_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the number of mining application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching mining application stageses
	 */
	public int countBygetMining_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findBygetMining_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the mining application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the mining application stages that was removed
	 */
	public MiningApplicationStages removeBygetMining_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the number of mining application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching mining application stageses
	 */
	public int countBygetMining_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the mining application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the mining application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the mining application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findBygetMining_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the first mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns the last mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findBygetMining_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the last mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public MiningApplicationStages[] findBygetMining_By_CaseId_PrevAndNext(
			long miningStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Removes all the mining application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetMining_By_CaseId(String caseId);

	/**
	 * Returns the number of mining application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application stageses
	 */
	public int countBygetMining_By_CaseId(String caseId);

	/**
	 * Returns the mining application stages where caseId = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findBygetMiningBy_Case_Id(String caseId)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the mining application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMiningBy_Case_Id(String caseId);

	/**
	 * Returns the mining application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMiningBy_Case_Id(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the mining application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application stages that was removed
	 */
	public MiningApplicationStages removeBygetMiningBy_Case_Id(String caseId)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the number of mining application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application stageses
	 */
	public int countBygetMiningBy_Case_Id(String caseId);

	/**
	 * Returns all the mining application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName);

	/**
	 * Returns a range of all the mining application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the mining application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findBygetMining_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the first mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns the last mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public MiningApplicationStages findBygetMining_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the last mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public MiningApplicationStages fetchBygetMining_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public MiningApplicationStages[] findBygetMining_By_StageName_PrevAndNext(
			long miningStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningApplicationStages> orderByComparator)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Removes all the mining application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetMining_By_StageName(String stageName);

	/**
	 * Returns the number of mining application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching mining application stageses
	 */
	public int countBygetMining_By_StageName(String stageName);

	/**
	 * Caches the mining application stages in the entity cache if it is enabled.
	 *
	 * @param miningApplicationStages the mining application stages
	 */
	public void cacheResult(MiningApplicationStages miningApplicationStages);

	/**
	 * Caches the mining application stageses in the entity cache if it is enabled.
	 *
	 * @param miningApplicationStageses the mining application stageses
	 */
	public void cacheResult(
		java.util.List<MiningApplicationStages> miningApplicationStageses);

	/**
	 * Creates a new mining application stages with the primary key. Does not add the mining application stages to the database.
	 *
	 * @param miningStagesId the primary key for the new mining application stages
	 * @return the new mining application stages
	 */
	public MiningApplicationStages create(long miningStagesId);

	/**
	 * Removes the mining application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages that was removed
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public MiningApplicationStages remove(long miningStagesId)
		throws NoSuchMiningApplicationStagesException;

	public MiningApplicationStages updateImpl(
		MiningApplicationStages miningApplicationStages);

	/**
	 * Returns the mining application stages with the primary key or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public MiningApplicationStages findByPrimaryKey(long miningStagesId)
		throws NoSuchMiningApplicationStagesException;

	/**
	 * Returns the mining application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages, or <code>null</code> if a mining application stages with the primary key could not be found
	 */
	public MiningApplicationStages fetchByPrimaryKey(long miningStagesId);

	/**
	 * Returns all the mining application stageses.
	 *
	 * @return the mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findAll();

	/**
	 * Returns a range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application stageses
	 */
	public java.util.List<MiningApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining application stageses.
	 *
	 * @return the number of mining application stageses
	 */
	public int countAll();

}