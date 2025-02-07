/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quarry.stage.service.exception.NoSuchQuarryApplicationStageException;
import com.nbp.quarry.stage.service.model.QuarryApplicationStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationStageUtil
 * @generated
 */
@ProviderType
public interface QuarryApplicationStagePersistence
	extends BasePersistence<QuarryApplicationStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryApplicationStageUtil} to access the quarry application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the quarry application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the quarry application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public QuarryApplicationStage[] findByUuid_PrevAndNext(
			long quarryAppStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Removes all the quarry application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of quarry application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quarry application stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the quarry application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the quarry application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the quarry application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the quarry application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quarry application stage that was removed
	 */
	public QuarryApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the number of quarry application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quarry application stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public QuarryApplicationStage[] findByUuid_C_PrevAndNext(
			long quarryAppStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Removes all the quarry application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quarry application stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the quarry application stage where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findBygetQuarry_AI(long quarryApplicationId)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the quarry application stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_AI(long quarryApplicationId);

	/**
	 * Returns the quarry application stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_AI(
		long quarryApplicationId, boolean useFinderCache);

	/**
	 * Removes the quarry application stage where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry application stage that was removed
	 */
	public QuarryApplicationStage removeBygetQuarry_AI(long quarryApplicationId)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the number of quarry application stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry application stages
	 */
	public int countBygetQuarry_AI(long quarryApplicationId);

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findBygetQuarry_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the quarry application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the quarry application stage that was removed
	 */
	public QuarryApplicationStage removeBygetQuarry_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the number of quarry application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching quarry application stages
	 */
	public int countBygetQuarry_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findBygetQuarry_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the quarry application stage that was removed
	 */
	public QuarryApplicationStage removeBygetQuarry_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the number of quarry application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching quarry application stages
	 */
	public int countBygetQuarry_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findBygetQuarry_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the quarry application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the quarry application stage that was removed
	 */
	public QuarryApplicationStage removeBygetQuarry_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the number of quarry application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching quarry application stages
	 */
	public int countBygetQuarry_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the quarry application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the quarry application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findBygetQuarry_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the first quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns the last quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findBygetQuarry_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the last quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public QuarryApplicationStage[] findBygetQuarry_By_CaseId_PrevAndNext(
			long quarryAppStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Removes all the quarry application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetQuarry_By_CaseId(String caseId);

	/**
	 * Returns the number of quarry application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry application stages
	 */
	public int countBygetQuarry_By_CaseId(String caseId);

	/**
	 * Returns all the quarry application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName);

	/**
	 * Returns a range of all the quarry application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the quarry application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findBygetQuarry_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the first quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns the last quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findBygetQuarry_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the last quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public QuarryApplicationStage[] findBygetQuarry_By_StageName_PrevAndNext(
			long quarryAppStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<QuarryApplicationStage> orderByComparator)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Removes all the quarry application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetQuarry_By_StageName(String stageName);

	/**
	 * Returns the number of quarry application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching quarry application stages
	 */
	public int countBygetQuarry_By_StageName(String stageName);

	/**
	 * Returns the quarry application stage where caseId = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage findBygetQuarry_CaseId(String caseId)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the quarry application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_CaseId(String caseId);

	/**
	 * Returns the quarry application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public QuarryApplicationStage fetchBygetQuarry_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the quarry application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry application stage that was removed
	 */
	public QuarryApplicationStage removeBygetQuarry_CaseId(String caseId)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the number of quarry application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry application stages
	 */
	public int countBygetQuarry_CaseId(String caseId);

	/**
	 * Caches the quarry application stage in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationStage the quarry application stage
	 */
	public void cacheResult(QuarryApplicationStage quarryApplicationStage);

	/**
	 * Caches the quarry application stages in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationStages the quarry application stages
	 */
	public void cacheResult(
		java.util.List<QuarryApplicationStage> quarryApplicationStages);

	/**
	 * Creates a new quarry application stage with the primary key. Does not add the quarry application stage to the database.
	 *
	 * @param quarryAppStagesId the primary key for the new quarry application stage
	 * @return the new quarry application stage
	 */
	public QuarryApplicationStage create(long quarryAppStagesId);

	/**
	 * Removes the quarry application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage that was removed
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public QuarryApplicationStage remove(long quarryAppStagesId)
		throws NoSuchQuarryApplicationStageException;

	public QuarryApplicationStage updateImpl(
		QuarryApplicationStage quarryApplicationStage);

	/**
	 * Returns the quarry application stage with the primary key or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public QuarryApplicationStage findByPrimaryKey(long quarryAppStagesId)
		throws NoSuchQuarryApplicationStageException;

	/**
	 * Returns the quarry application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage, or <code>null</code> if a quarry application stage with the primary key could not be found
	 */
	public QuarryApplicationStage fetchByPrimaryKey(long quarryAppStagesId);

	/**
	 * Returns all the quarry application stages.
	 *
	 * @return the quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findAll();

	/**
	 * Returns a range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry application stages
	 */
	public java.util.List<QuarryApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry application stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry application stages.
	 *
	 * @return the number of quarry application stages
	 */
	public int countAll();

}