/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjApplicationStagesException;
import com.nbp.ncbj.stages.services.model.NcbjApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface NcbjApplicationStagesPersistence
	extends BasePersistence<NcbjApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjApplicationStagesUtil} to access the ncbj application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ncbj application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the ncbj application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public NcbjApplicationStages[] findByUuid_PrevAndNext(
			long ncbjStagesApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Removes all the ncbj application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of ncbj application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncbj application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the ncbj application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the ncbj application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the ncbj application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the ncbj application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncbj application stages that was removed
	 */
	public NcbjApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the number of ncbj application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncbj application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public NcbjApplicationStages[] findByUuid_C_PrevAndNext(
			long ncbjStagesApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Removes all the ncbj application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncbj application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the ncbj application stages where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findBygetNcbj_AI(long ncbjApplicationId)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the ncbj application stages where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_AI(long ncbjApplicationId);

	/**
	 * Returns the ncbj application stages where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_AI(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj application stages where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj application stages that was removed
	 */
	public NcbjApplicationStages removeBygetNcbj_AI(long ncbjApplicationId)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the number of ncbj application stageses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj application stageses
	 */
	public int countBygetNcbj_AI(long ncbjApplicationId);

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findBygetNcbj_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the ncbj application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the ncbj application stages that was removed
	 */
	public NcbjApplicationStages removeBygetNcbj_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching ncbj application stageses
	 */
	public int countBygetNcbj_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findBygetNcbj_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the ncbj application stages that was removed
	 */
	public NcbjApplicationStages removeBygetNcbj_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching ncbj application stageses
	 */
	public int countBygetNcbj_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findBygetNcbj_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the ncbj application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the ncbj application stages that was removed
	 */
	public NcbjApplicationStages removeBygetNcbj_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching ncbj application stageses
	 */
	public int countBygetNcbj_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the ncbj application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the ncbj application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findBygetNcbj_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the first ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns the last ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findBygetNcbj_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the last ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public NcbjApplicationStages[] findBygetNcbj_By_CaseId_PrevAndNext(
			long ncbjStagesApplicationId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Removes all the ncbj application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetNcbj_By_CaseId(String caseId);

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj application stageses
	 */
	public int countBygetNcbj_By_CaseId(String caseId);

	/**
	 * Returns the ncbj application stages where caseId = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findBygetNcbj_App_By_CaseId(String caseId)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the ncbj application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_App_By_CaseId(String caseId);

	/**
	 * Returns the ncbj application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetNcbj_App_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncbj application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj application stages that was removed
	 */
	public NcbjApplicationStages removeBygetNcbj_App_By_CaseId(String caseId)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj application stageses
	 */
	public int countBygetNcbj_App_By_CaseId(String caseId);

	/**
	 * Returns all the ncbj application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName);

	/**
	 * Returns a range of all the ncbj application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findBygetQuarry_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the first ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetQuarry_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns the last ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages findBygetQuarry_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the last ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public NcbjApplicationStages fetchBygetQuarry_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public NcbjApplicationStages[] findBygetQuarry_By_StageName_PrevAndNext(
			long ncbjStagesApplicationId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Removes all the ncbj application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetQuarry_By_StageName(String stageName);

	/**
	 * Returns the number of ncbj application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching ncbj application stageses
	 */
	public int countBygetQuarry_By_StageName(String stageName);

	/**
	 * Caches the ncbj application stages in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 */
	public void cacheResult(NcbjApplicationStages ncbjApplicationStages);

	/**
	 * Caches the ncbj application stageses in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationStageses the ncbj application stageses
	 */
	public void cacheResult(
		java.util.List<NcbjApplicationStages> ncbjApplicationStageses);

	/**
	 * Creates a new ncbj application stages with the primary key. Does not add the ncbj application stages to the database.
	 *
	 * @param ncbjStagesApplicationId the primary key for the new ncbj application stages
	 * @return the new ncbj application stages
	 */
	public NcbjApplicationStages create(long ncbjStagesApplicationId);

	/**
	 * Removes the ncbj application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages that was removed
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public NcbjApplicationStages remove(long ncbjStagesApplicationId)
		throws NoSuchNcbjApplicationStagesException;

	public NcbjApplicationStages updateImpl(
		NcbjApplicationStages ncbjApplicationStages);

	/**
	 * Returns the ncbj application stages with the primary key or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public NcbjApplicationStages findByPrimaryKey(long ncbjStagesApplicationId)
		throws NoSuchNcbjApplicationStagesException;

	/**
	 * Returns the ncbj application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages, or <code>null</code> if a ncbj application stages with the primary key could not be found
	 */
	public NcbjApplicationStages fetchByPrimaryKey(
		long ncbjStagesApplicationId);

	/**
	 * Returns all the ncbj application stageses.
	 *
	 * @return the ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findAll();

	/**
	 * Returns a range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj application stageses
	 */
	public java.util.List<NcbjApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj application stageses.
	 *
	 * @return the number of ncbj application stageses
	 */
	public int countAll();

}