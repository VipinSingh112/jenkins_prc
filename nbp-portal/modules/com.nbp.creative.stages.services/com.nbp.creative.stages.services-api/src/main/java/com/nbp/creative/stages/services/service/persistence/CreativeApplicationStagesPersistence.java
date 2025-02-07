/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.stages.services.exception.NoSuchCreativeApplicationStagesException;
import com.nbp.creative.stages.services.model.CreativeApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface CreativeApplicationStagesPersistence
	extends BasePersistence<CreativeApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeApplicationStagesUtil} to access the creative application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the creative application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the creative application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public CreativeApplicationStages[] findByUuid_PrevAndNext(
			long creativeApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Removes all the creative application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of creative application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching creative application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the creative application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the creative application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the creative application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the creative application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the creative application stages that was removed
	 */
	public CreativeApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the number of creative application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching creative application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public CreativeApplicationStages[] findByUuid_C_PrevAndNext(
			long creativeApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Removes all the creative application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching creative application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the creative application stages where creativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_CAI(
			long creativeApplicationId)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the creative application stages where creativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CAI(
		long creativeApplicationId);

	/**
	 * Returns the creative application stages where creativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CAI(
		long creativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative application stages where creativeApplicationId = &#63; from the database.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the creative application stages that was removed
	 */
	public CreativeApplicationStages removeBygetCAS_CAI(
			long creativeApplicationId)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the number of creative application stageses where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative application stageses
	 */
	public int countBygetCAS_CAI(long creativeApplicationId);

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the creative application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the creative application stages that was removed
	 */
	public CreativeApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the number of creative application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching creative application stageses
	 */
	public int countBygetCAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the creative application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName);

	/**
	 * Returns a range of all the creative application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public CreativeApplicationStages[] findBygetCAS_StageName_PrevAndNext(
			long creativeApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Removes all the creative application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetCAS_StageName(String stageName);

	/**
	 * Returns the number of creative application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching creative application stageses
	 */
	public int countBygetCAS_StageName(String stageName);

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the creative application stages that was removed
	 */
	public CreativeApplicationStages removeBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the number of creative application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching creative application stageses
	 */
	public int countBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the creative application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the creative application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the creative application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the creative application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the creative application stages that was removed
	 */
	public CreativeApplicationStages removeBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the number of creative application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching creative application stageses
	 */
	public int countBygetCAS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus);

	/**
	 * Returns a range of all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus, int start, int end);

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_SNAndSS_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_SNAndSS_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_SNAndSS_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_SNAndSS_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public CreativeApplicationStages[] findBygetCAS_SNAndSS_PrevAndNext(
			long creativeApplicationStagesId, String stageName,
			String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Removes all the creative application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetCAS_SNAndSS(String stageName, String stageStatus);

	/**
	 * Returns the number of creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching creative application stageses
	 */
	public int countBygetCAS_SNAndSS(String stageName, String stageStatus);

	/**
	 * Returns all the creative application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId);

	/**
	 * Returns a range of all the creative application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the creative application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the creative application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the first creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the last creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the last creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public CreativeApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public CreativeApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long creativeApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Removes all the creative application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCAS_CaseId(String caseId);

	/**
	 * Returns the number of creative application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative application stageses
	 */
	public int countBygetCAS_CaseId(String caseId);

	/**
	 * Caches the creative application stages in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationStages the creative application stages
	 */
	public void cacheResult(
		CreativeApplicationStages creativeApplicationStages);

	/**
	 * Caches the creative application stageses in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationStageses the creative application stageses
	 */
	public void cacheResult(
		java.util.List<CreativeApplicationStages> creativeApplicationStageses);

	/**
	 * Creates a new creative application stages with the primary key. Does not add the creative application stages to the database.
	 *
	 * @param creativeApplicationStagesId the primary key for the new creative application stages
	 * @return the new creative application stages
	 */
	public CreativeApplicationStages create(long creativeApplicationStagesId);

	/**
	 * Removes the creative application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages that was removed
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public CreativeApplicationStages remove(long creativeApplicationStagesId)
		throws NoSuchCreativeApplicationStagesException;

	public CreativeApplicationStages updateImpl(
		CreativeApplicationStages creativeApplicationStages);

	/**
	 * Returns the creative application stages with the primary key or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public CreativeApplicationStages findByPrimaryKey(
			long creativeApplicationStagesId)
		throws NoSuchCreativeApplicationStagesException;

	/**
	 * Returns the creative application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages, or <code>null</code> if a creative application stages with the primary key could not be found
	 */
	public CreativeApplicationStages fetchByPrimaryKey(
		long creativeApplicationStagesId);

	/**
	 * Returns all the creative application stageses.
	 *
	 * @return the creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findAll();

	/**
	 * Returns a range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative application stageses
	 */
	public java.util.List<CreativeApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative application stageses.
	 *
	 * @return the number of creative application stageses
	 */
	public int countAll();

}