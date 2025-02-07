/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.stages.services.exception.NoSuchJanaacApplicationStagesException;
import com.nbp.janaac.stages.services.model.JanaacApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the janaac application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface JanaacApplicationStagesPersistence
	extends BasePersistence<JanaacApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JanaacApplicationStagesUtil} to access the janaac application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the janaac application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the janaac application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public JanaacApplicationStages[] findByUuid_PrevAndNext(
			long janaacApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Removes all the janaac application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of janaac application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching janaac application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the janaac application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the janaac application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the janaac application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the janaac application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the janaac application stages that was removed
	 */
	public JanaacApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the number of janaac application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching janaac application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public JanaacApplicationStages[] findByUuid_C_PrevAndNext(
			long janaacApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Removes all the janaac application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching janaac application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the janaac application stages where janaacApplicationId = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findBygetJanaac_By_AI(
			long janaacApplicationId)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the janaac application stages where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_AI(
		long janaacApplicationId);

	/**
	 * Returns the janaac application stages where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_AI(
		long janaacApplicationId, boolean useFinderCache);

	/**
	 * Removes the janaac application stages where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac application stages that was removed
	 */
	public JanaacApplicationStages removeBygetJanaac_By_AI(
			long janaacApplicationId)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the number of janaac application stageses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac application stageses
	 */
	public int countBygetJanaac_By_AI(long janaacApplicationId);

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findBygetJanaac_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the janaac application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the janaac application stages that was removed
	 */
	public JanaacApplicationStages removeBygetJanaac_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the number of janaac application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching janaac application stageses
	 */
	public int countBygetJanaac_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findBygetJanaac_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the janaac application stages that was removed
	 */
	public JanaacApplicationStages removeBygetJanaac_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the number of janaac application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching janaac application stageses
	 */
	public int countBygetJanaac_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findBygetJanaac_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the janaac application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the janaac application stages that was removed
	 */
	public JanaacApplicationStages removeBygetJanaac_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the number of janaac application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching janaac application stageses
	 */
	public int countBygetJanaac_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the janaac application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the janaac application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the janaac application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findBygetJanaac_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the first janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns the last janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findBygetJanaac_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the last janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public JanaacApplicationStages[] findBygetJanaac_By_CaseId_PrevAndNext(
			long janaacApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Removes all the janaac application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetJanaac_By_CaseId(String caseId);

	/**
	 * Returns the number of janaac application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac application stageses
	 */
	public int countBygetJanaac_By_CaseId(String caseId);

	/**
	 * Returns the janaac application stages where caseId = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findBygetJanaac_ByCaseId(String caseId)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the janaac application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_ByCaseId(String caseId);

	/**
	 * Returns the janaac application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_ByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the janaac application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac application stages that was removed
	 */
	public JanaacApplicationStages removeBygetJanaac_ByCaseId(String caseId)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the number of janaac application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac application stageses
	 */
	public int countBygetJanaac_ByCaseId(String caseId);

	/**
	 * Returns all the janaac application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName);

	/**
	 * Returns a range of all the janaac application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the janaac application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findBygetJanaac_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the first janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns the last janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages findBygetJanaac_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the last janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public JanaacApplicationStages fetchBygetJanaac_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public JanaacApplicationStages[] findBygetJanaac_By_StageName_PrevAndNext(
			long janaacApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<JanaacApplicationStages> orderByComparator)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Removes all the janaac application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetJanaac_By_StageName(String stageName);

	/**
	 * Returns the number of janaac application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching janaac application stageses
	 */
	public int countBygetJanaac_By_StageName(String stageName);

	/**
	 * Caches the janaac application stages in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationStages the janaac application stages
	 */
	public void cacheResult(JanaacApplicationStages janaacApplicationStages);

	/**
	 * Caches the janaac application stageses in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationStageses the janaac application stageses
	 */
	public void cacheResult(
		java.util.List<JanaacApplicationStages> janaacApplicationStageses);

	/**
	 * Creates a new janaac application stages with the primary key. Does not add the janaac application stages to the database.
	 *
	 * @param janaacApplicationStagesId the primary key for the new janaac application stages
	 * @return the new janaac application stages
	 */
	public JanaacApplicationStages create(long janaacApplicationStagesId);

	/**
	 * Removes the janaac application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages that was removed
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public JanaacApplicationStages remove(long janaacApplicationStagesId)
		throws NoSuchJanaacApplicationStagesException;

	public JanaacApplicationStages updateImpl(
		JanaacApplicationStages janaacApplicationStages);

	/**
	 * Returns the janaac application stages with the primary key or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public JanaacApplicationStages findByPrimaryKey(
			long janaacApplicationStagesId)
		throws NoSuchJanaacApplicationStagesException;

	/**
	 * Returns the janaac application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages, or <code>null</code> if a janaac application stages with the primary key could not be found
	 */
	public JanaacApplicationStages fetchByPrimaryKey(
		long janaacApplicationStagesId);

	/**
	 * Returns all the janaac application stageses.
	 *
	 * @return the janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findAll();

	/**
	 * Returns a range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac application stageses
	 */
	public java.util.List<JanaacApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the janaac application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of janaac application stageses.
	 *
	 * @return the number of janaac application stageses
	 */
	public int countAll();

}