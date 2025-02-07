/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ogt.stages.services.exception.NoSuchOgtApplicationStageException;
import com.nbp.ogt.stages.services.model.OgtApplicationStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ogt application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationStageUtil
 * @generated
 */
@ProviderType
public interface OgtApplicationStagePersistence
	extends BasePersistence<OgtApplicationStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OgtApplicationStageUtil} to access the ogt application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ogt application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the ogt application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public OgtApplicationStage[] findByUuid_PrevAndNext(
			long ogtStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Removes all the ogt application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of ogt application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ogt application stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the ogt application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the ogt application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the ogt application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the ogt application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ogt application stage that was removed
	 */
	public OgtApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the number of ogt application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ogt application stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public OgtApplicationStage[] findByUuid_C_PrevAndNext(
			long ogtStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Removes all the ogt application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ogt application stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the ogt application stage where ogtApplicationId = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findBygetOgt_AI(long ogtApplicationId)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the ogt application stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_AI(long ogtApplicationId);

	/**
	 * Returns the ogt application stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_AI(
		long ogtApplicationId, boolean useFinderCache);

	/**
	 * Removes the ogt application stage where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt application stage that was removed
	 */
	public OgtApplicationStage removeBygetOgt_AI(long ogtApplicationId)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the number of ogt application stages where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt application stages
	 */
	public int countBygetOgt_AI(long ogtApplicationId);

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findBygetOgt_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the ogt application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the ogt application stage that was removed
	 */
	public OgtApplicationStage removeBygetOgt_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the number of ogt application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching ogt application stages
	 */
	public int countBygetOgt_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findBygetOgt_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the ogt application stage that was removed
	 */
	public OgtApplicationStage removeBygetOgt_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the number of ogt application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching ogt application stages
	 */
	public int countBygetOgt_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findBygetOgt_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the ogt application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the ogt application stage that was removed
	 */
	public OgtApplicationStage removeBygetOgt_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the number of ogt application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching ogt application stages
	 */
	public int countBygetOgt_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the ogt application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the ogt application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the ogt application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findBygetOgt_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the first ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns the last ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findBygetOgt_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the last ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public OgtApplicationStage[] findBygetOgt_By_CaseId_PrevAndNext(
			long ogtStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Removes all the ogt application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetOgt_By_CaseId(String caseId);

	/**
	 * Returns the number of ogt application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ogt application stages
	 */
	public int countBygetOgt_By_CaseId(String caseId);

	/**
	 * Returns all the ogt application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName);

	/**
	 * Returns a range of all the ogt application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the ogt application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findBygetOgt_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the first ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns the last ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findBygetOgt_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the last ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public OgtApplicationStage[] findBygetOgt_By_StageName_PrevAndNext(
			long ogtStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<OgtApplicationStage> orderByComparator)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Removes all the ogt application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetOgt_By_StageName(String stageName);

	/**
	 * Returns the number of ogt application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching ogt application stages
	 */
	public int countBygetOgt_By_StageName(String stageName);

	/**
	 * Returns the ogt application stage where caseId = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage findBygetOgt_By_CI(String caseId)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the ogt application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CI(String caseId);

	/**
	 * Returns the ogt application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public OgtApplicationStage fetchBygetOgt_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ogt application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ogt application stage that was removed
	 */
	public OgtApplicationStage removeBygetOgt_By_CI(String caseId)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the number of ogt application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ogt application stages
	 */
	public int countBygetOgt_By_CI(String caseId);

	/**
	 * Caches the ogt application stage in the entity cache if it is enabled.
	 *
	 * @param ogtApplicationStage the ogt application stage
	 */
	public void cacheResult(OgtApplicationStage ogtApplicationStage);

	/**
	 * Caches the ogt application stages in the entity cache if it is enabled.
	 *
	 * @param ogtApplicationStages the ogt application stages
	 */
	public void cacheResult(
		java.util.List<OgtApplicationStage> ogtApplicationStages);

	/**
	 * Creates a new ogt application stage with the primary key. Does not add the ogt application stage to the database.
	 *
	 * @param ogtStagesId the primary key for the new ogt application stage
	 * @return the new ogt application stage
	 */
	public OgtApplicationStage create(long ogtStagesId);

	/**
	 * Removes the ogt application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage that was removed
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public OgtApplicationStage remove(long ogtStagesId)
		throws NoSuchOgtApplicationStageException;

	public OgtApplicationStage updateImpl(
		OgtApplicationStage ogtApplicationStage);

	/**
	 * Returns the ogt application stage with the primary key or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public OgtApplicationStage findByPrimaryKey(long ogtStagesId)
		throws NoSuchOgtApplicationStageException;

	/**
	 * Returns the ogt application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage, or <code>null</code> if a ogt application stage with the primary key could not be found
	 */
	public OgtApplicationStage fetchByPrimaryKey(long ogtStagesId);

	/**
	 * Returns all the ogt application stages.
	 *
	 * @return the ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findAll();

	/**
	 * Returns a range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt application stages
	 */
	public java.util.List<OgtApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ogt application stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ogt application stages.
	 *
	 * @return the number of ogt application stages
	 */
	public int countAll();

}