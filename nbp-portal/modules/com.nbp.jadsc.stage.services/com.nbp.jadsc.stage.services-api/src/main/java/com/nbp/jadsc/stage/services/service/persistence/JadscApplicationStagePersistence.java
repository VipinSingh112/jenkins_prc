/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jadsc.stage.services.exception.NoSuchJadscApplicationStageException;
import com.nbp.jadsc.stage.services.model.JadscApplicationStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jadsc application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationStageUtil
 * @generated
 */
@ProviderType
public interface JadscApplicationStagePersistence
	extends BasePersistence<JadscApplicationStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JadscApplicationStageUtil} to access the jadsc application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jadsc application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the jadsc application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public JadscApplicationStage[] findByUuid_PrevAndNext(
			long jadscAppStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Removes all the jadsc application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jadsc application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc application stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jadsc application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the jadsc application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jadsc application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jadsc application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc application stage that was removed
	 */
	public JadscApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the number of jadsc application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc application stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public JadscApplicationStage[] findByUuid_C_PrevAndNext(
			long jadscAppStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Removes all the jadsc application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc application stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the jadsc application stage where jadscApplicationId = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findBygetJadsc_By_AI(long jadscApplicationId)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the jadsc application stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_AI(long jadscApplicationId);

	/**
	 * Returns the jadsc application stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_AI(
		long jadscApplicationId, boolean useFinderCache);

	/**
	 * Removes the jadsc application stage where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc application stage that was removed
	 */
	public JadscApplicationStage removeBygetJadsc_By_AI(long jadscApplicationId)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the number of jadsc application stages where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc application stages
	 */
	public int countBygetJadsc_By_AI(long jadscApplicationId);

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findBygetJadsc_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the jadsc application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the jadsc application stage that was removed
	 */
	public JadscApplicationStage removeBygetJadsc_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the number of jadsc application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching jadsc application stages
	 */
	public int countBygetJadsc_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findBygetJadsc_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the jadsc application stage that was removed
	 */
	public JadscApplicationStage removeBygetJadsc_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the number of jadsc application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching jadsc application stages
	 */
	public int countBygetJadsc_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findBygetJadsc_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the jadsc application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the jadsc application stage that was removed
	 */
	public JadscApplicationStage removeBygetJadsc_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the number of jadsc application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching jadsc application stages
	 */
	public int countBygetJadsc_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the jadsc application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the jadsc application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findBygetJadsc_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the first jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns the last jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findBygetJadsc_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the last jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public JadscApplicationStage[] findBygetJadsc_By_CaseId_PrevAndNext(
			long jadscAppStageId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Removes all the jadsc application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetJadsc_By_CaseId(String caseId);

	/**
	 * Returns the number of jadsc application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application stages
	 */
	public int countBygetJadsc_By_CaseId(String caseId);

	/**
	 * Returns the jadsc application stage where caseId = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findBygetJadsc_ByCaseId(String caseId)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the jadsc application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_ByCaseId(String caseId);

	/**
	 * Returns the jadsc application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_ByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jadsc application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application stage that was removed
	 */
	public JadscApplicationStage removeBygetJadsc_ByCaseId(String caseId)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the number of jadsc application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application stages
	 */
	public int countBygetJadsc_ByCaseId(String caseId);

	/**
	 * Returns all the jadsc application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName);

	/**
	 * Returns a range of all the jadsc application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the jadsc application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findBygetJadsc_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the first jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns the last jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage findBygetJadsc_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the last jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public JadscApplicationStage fetchBygetJadsc_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public JadscApplicationStage[] findBygetJadsc_By_StageName_PrevAndNext(
			long jadscAppStageId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<JadscApplicationStage> orderByComparator)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Removes all the jadsc application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetJadsc_By_StageName(String stageName);

	/**
	 * Returns the number of jadsc application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching jadsc application stages
	 */
	public int countBygetJadsc_By_StageName(String stageName);

	/**
	 * Caches the jadsc application stage in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 */
	public void cacheResult(JadscApplicationStage jadscApplicationStage);

	/**
	 * Caches the jadsc application stages in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationStages the jadsc application stages
	 */
	public void cacheResult(
		java.util.List<JadscApplicationStage> jadscApplicationStages);

	/**
	 * Creates a new jadsc application stage with the primary key. Does not add the jadsc application stage to the database.
	 *
	 * @param jadscAppStageId the primary key for the new jadsc application stage
	 * @return the new jadsc application stage
	 */
	public JadscApplicationStage create(long jadscAppStageId);

	/**
	 * Removes the jadsc application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage that was removed
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public JadscApplicationStage remove(long jadscAppStageId)
		throws NoSuchJadscApplicationStageException;

	public JadscApplicationStage updateImpl(
		JadscApplicationStage jadscApplicationStage);

	/**
	 * Returns the jadsc application stage with the primary key or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public JadscApplicationStage findByPrimaryKey(long jadscAppStageId)
		throws NoSuchJadscApplicationStageException;

	/**
	 * Returns the jadsc application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage, or <code>null</code> if a jadsc application stage with the primary key could not be found
	 */
	public JadscApplicationStage fetchByPrimaryKey(long jadscAppStageId);

	/**
	 * Returns all the jadsc application stages.
	 *
	 * @return the jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findAll();

	/**
	 * Returns a range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc application stages
	 */
	public java.util.List<JadscApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JadscApplicationStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jadsc application stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jadsc application stages.
	 *
	 * @return the number of jadsc application stages
	 */
	public int countAll();

}