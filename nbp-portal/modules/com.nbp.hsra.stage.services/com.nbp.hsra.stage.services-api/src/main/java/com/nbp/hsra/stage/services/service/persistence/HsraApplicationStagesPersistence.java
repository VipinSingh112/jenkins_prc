/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.stage.services.exception.NoSuchHsraApplicationStagesException;
import com.nbp.hsra.stage.services.model.HsraApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hsra application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface HsraApplicationStagesPersistence
	extends BasePersistence<HsraApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HsraApplicationStagesUtil} to access the hsra application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the hsra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the hsra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public HsraApplicationStages[] findByUuid_PrevAndNext(
			long hsraApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Removes all the hsra application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of hsra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching hsra application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the hsra application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the hsra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the hsra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the hsra application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the hsra application stages that was removed
	 */
	public HsraApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the number of hsra application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching hsra application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public HsraApplicationStages[] findByUuid_C_PrevAndNext(
			long hsraApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Removes all the hsra application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching hsra application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the hsra application stages where hsraApplicationId = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findBygetHsra_By_AI(long hsraApplicationId)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the hsra application stages where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_AI(long hsraApplicationId);

	/**
	 * Returns the hsra application stages where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_AI(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the hsra application stages where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application stages that was removed
	 */
	public HsraApplicationStages removeBygetHsra_By_AI(long hsraApplicationId)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the number of hsra application stageses where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application stageses
	 */
	public int countBygetHsra_By_AI(long hsraApplicationId);

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findBygetHsra_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the hsra application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the hsra application stages that was removed
	 */
	public HsraApplicationStages removeBygetHsra_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the number of hsra application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching hsra application stageses
	 */
	public int countBygetHsra_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findBygetHsra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the hsra application stages that was removed
	 */
	public HsraApplicationStages removeBygetHsra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the number of hsra application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching hsra application stageses
	 */
	public int countBygetHsra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findBygetHsra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the hsra application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the hsra application stages that was removed
	 */
	public HsraApplicationStages removeBygetHsra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the number of hsra application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching hsra application stageses
	 */
	public int countBygetHsra_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the hsra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the hsra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findBygetHsra_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the first hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns the last hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findBygetHsra_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the last hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public HsraApplicationStages[] findBygetHsra_By_CaseId_PrevAndNext(
			long hsraApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Removes all the hsra application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetHsra_By_CaseId(String caseId);

	/**
	 * Returns the number of hsra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application stageses
	 */
	public int countBygetHsra_By_CaseId(String caseId);

	/**
	 * Returns the hsra application stages where caseId = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findBygetHsraApp_By_CaseId(String caseId)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the hsra application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsraApp_By_CaseId(String caseId);

	/**
	 * Returns the hsra application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsraApp_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the hsra application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application stages that was removed
	 */
	public HsraApplicationStages removeBygetHsraApp_By_CaseId(String caseId)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the number of hsra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application stageses
	 */
	public int countBygetHsraApp_By_CaseId(String caseId);

	/**
	 * Returns all the hsra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName);

	/**
	 * Returns a range of all the hsra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the hsra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findBygetHsra_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the first hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns the last hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages findBygetHsra_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the last hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public HsraApplicationStages fetchBygetHsra_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public HsraApplicationStages[] findBygetHsra_By_StageName_PrevAndNext(
			long hsraApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Removes all the hsra application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetHsra_By_StageName(String stageName);

	/**
	 * Returns the number of hsra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching hsra application stageses
	 */
	public int countBygetHsra_By_StageName(String stageName);

	/**
	 * Caches the hsra application stages in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationStages the hsra application stages
	 */
	public void cacheResult(HsraApplicationStages hsraApplicationStages);

	/**
	 * Caches the hsra application stageses in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationStageses the hsra application stageses
	 */
	public void cacheResult(
		java.util.List<HsraApplicationStages> hsraApplicationStageses);

	/**
	 * Creates a new hsra application stages with the primary key. Does not add the hsra application stages to the database.
	 *
	 * @param hsraApplicationStagesId the primary key for the new hsra application stages
	 * @return the new hsra application stages
	 */
	public HsraApplicationStages create(long hsraApplicationStagesId);

	/**
	 * Removes the hsra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages that was removed
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public HsraApplicationStages remove(long hsraApplicationStagesId)
		throws NoSuchHsraApplicationStagesException;

	public HsraApplicationStages updateImpl(
		HsraApplicationStages hsraApplicationStages);

	/**
	 * Returns the hsra application stages with the primary key or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public HsraApplicationStages findByPrimaryKey(long hsraApplicationStagesId)
		throws NoSuchHsraApplicationStagesException;

	/**
	 * Returns the hsra application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages, or <code>null</code> if a hsra application stages with the primary key could not be found
	 */
	public HsraApplicationStages fetchByPrimaryKey(
		long hsraApplicationStagesId);

	/**
	 * Returns all the hsra application stageses.
	 *
	 * @return the hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findAll();

	/**
	 * Returns a range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application stageses
	 */
	public java.util.List<HsraApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the hsra application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of hsra application stageses.
	 *
	 * @return the number of hsra application stageses
	 */
	public int countAll();

}