/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.stage.service.exception.NoSuchWraApplicationStageException;
import com.nbp.wra.stage.service.model.WraApplicationStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationStageUtil
 * @generated
 */
@ProviderType
public interface WraApplicationStagePersistence
	extends BasePersistence<WraApplicationStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WraApplicationStageUtil} to access the wra application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the wra application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the wra application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public WraApplicationStage[] findByUuid_PrevAndNext(
			long wraApplicationStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Removes all the wra application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of wra application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching wra application stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the wra application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the wra application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the wra application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the wra application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the wra application stage that was removed
	 */
	public WraApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the number of wra application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching wra application stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public WraApplicationStage[] findByUuid_C_PrevAndNext(
			long wraApplicationStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Removes all the wra application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching wra application stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the wra application stage where wraApplicationId = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findBygetWra_By_AI(long wraApplicationId)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the wra application stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_AI(long wraApplicationId);

	/**
	 * Returns the wra application stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_AI(
		long wraApplicationId, boolean useFinderCache);

	/**
	 * Removes the wra application stage where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra application stage that was removed
	 */
	public WraApplicationStage removeBygetWra_By_AI(long wraApplicationId)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the number of wra application stages where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra application stages
	 */
	public int countBygetWra_By_AI(long wraApplicationId);

	/**
	 * Returns the wra application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findBygetWra_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the wra application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the wra application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the wra application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the wra application stage that was removed
	 */
	public WraApplicationStage removeBygetWra_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the number of wra application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching wra application stages
	 */
	public int countBygetWra_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findBygetWra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the wra application stage that was removed
	 */
	public WraApplicationStage removeBygetWra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the number of wra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching wra application stages
	 */
	public int countBygetWra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findBygetWra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the wra application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the wra application stage that was removed
	 */
	public WraApplicationStage removeBygetWra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the number of wra application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching wra application stages
	 */
	public int countBygetWra_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the wra application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the wra application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the wra application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findBygetWra_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the first wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns the last wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findBygetWra_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the last wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public WraApplicationStage[] findBygetWra_By_CaseId_PrevAndNext(
			long wraApplicationStageId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Removes all the wra application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetWra_By_CaseId(String caseId);

	/**
	 * Returns the number of wra application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application stages
	 */
	public int countBygetWra_By_CaseId(String caseId);

	/**
	 * Returns the wra application stage where caseId = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findByget_Wra_By_CaseId(String caseId)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the wra application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchByget_Wra_By_CaseId(String caseId);

	/**
	 * Returns the wra application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchByget_Wra_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the wra application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra application stage that was removed
	 */
	public WraApplicationStage removeByget_Wra_By_CaseId(String caseId)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the number of wra application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application stages
	 */
	public int countByget_Wra_By_CaseId(String caseId);

	/**
	 * Returns all the wra application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName);

	/**
	 * Returns a range of all the wra application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the wra application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	public java.util.List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findBygetWra_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the first wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns the last wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public WraApplicationStage findBygetWra_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the last wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public WraApplicationStage fetchBygetWra_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public WraApplicationStage[] findBygetWra_By_StageName_PrevAndNext(
			long wraApplicationStageId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<WraApplicationStage> orderByComparator)
		throws NoSuchWraApplicationStageException;

	/**
	 * Removes all the wra application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetWra_By_StageName(String stageName);

	/**
	 * Returns the number of wra application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching wra application stages
	 */
	public int countBygetWra_By_StageName(String stageName);

	/**
	 * Caches the wra application stage in the entity cache if it is enabled.
	 *
	 * @param wraApplicationStage the wra application stage
	 */
	public void cacheResult(WraApplicationStage wraApplicationStage);

	/**
	 * Caches the wra application stages in the entity cache if it is enabled.
	 *
	 * @param wraApplicationStages the wra application stages
	 */
	public void cacheResult(
		java.util.List<WraApplicationStage> wraApplicationStages);

	/**
	 * Creates a new wra application stage with the primary key. Does not add the wra application stage to the database.
	 *
	 * @param wraApplicationStageId the primary key for the new wra application stage
	 * @return the new wra application stage
	 */
	public WraApplicationStage create(long wraApplicationStageId);

	/**
	 * Removes the wra application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage that was removed
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public WraApplicationStage remove(long wraApplicationStageId)
		throws NoSuchWraApplicationStageException;

	public WraApplicationStage updateImpl(
		WraApplicationStage wraApplicationStage);

	/**
	 * Returns the wra application stage with the primary key or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public WraApplicationStage findByPrimaryKey(long wraApplicationStageId)
		throws NoSuchWraApplicationStageException;

	/**
	 * Returns the wra application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage, or <code>null</code> if a wra application stage with the primary key could not be found
	 */
	public WraApplicationStage fetchByPrimaryKey(long wraApplicationStageId);

	/**
	 * Returns all the wra application stages.
	 *
	 * @return the wra application stages
	 */
	public java.util.List<WraApplicationStage> findAll();

	/**
	 * Returns a range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of wra application stages
	 */
	public java.util.List<WraApplicationStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra application stages
	 */
	public java.util.List<WraApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra application stages
	 */
	public java.util.List<WraApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WraApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra application stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra application stages.
	 *
	 * @return the number of wra application stages
	 */
	public int countAll();

}