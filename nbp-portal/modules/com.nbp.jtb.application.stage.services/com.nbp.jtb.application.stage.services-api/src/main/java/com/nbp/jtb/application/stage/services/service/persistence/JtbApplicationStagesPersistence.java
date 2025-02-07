/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbApplicationStagesException;
import com.nbp.jtb.application.stage.services.model.JtbApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface JtbApplicationStagesPersistence
	extends BasePersistence<JtbApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbApplicationStagesUtil} to access the jtb application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jtb application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the jtb application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public JtbApplicationStages[] findByUuid_PrevAndNext(
			long jtbApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Removes all the jtb application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jtb application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jtb application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jtb application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the jtb application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jtb application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jtb application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jtb application stages that was removed
	 */
	public JtbApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the number of jtb application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jtb application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public JtbApplicationStages[] findByUuid_C_PrevAndNext(
			long jtbApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Removes all the jtb application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jtb application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the jtb application stages where jtbApplicationId = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findBygetJtb_By_AI(long jtbApplicationId)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the jtb application stages where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_AI(long jtbApplicationId);

	/**
	 * Returns the jtb application stages where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_AI(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the jtb application stages where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb application stages that was removed
	 */
	public JtbApplicationStages removeBygetJtb_By_AI(long jtbApplicationId)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the number of jtb application stageses where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb application stageses
	 */
	public int countBygetJtb_By_AI(long jtbApplicationId);

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findBygetJtb_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the jtb application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the jtb application stages that was removed
	 */
	public JtbApplicationStages removeBygetJtb_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the number of jtb application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching jtb application stageses
	 */
	public int countBygetJtb_By_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the jtb application stages where caseId = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findBygetJtb_By_CI(String caseId)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the jtb application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CI(String caseId);

	/**
	 * Returns the jtb application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jtb application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb application stages that was removed
	 */
	public JtbApplicationStages removeBygetJtb_By_CI(String caseId)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the number of jtb application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb application stageses
	 */
	public int countBygetJtb_By_CI(String caseId);

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findBygetJtb_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the jtb application stages that was removed
	 */
	public JtbApplicationStages removeBygetJtb_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the number of jtb application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching jtb application stageses
	 */
	public int countBygetJtb_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findBygetJtb_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the jtb application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the jtb application stages that was removed
	 */
	public JtbApplicationStages removeBygetJtb_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the number of jtb application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching jtb application stageses
	 */
	public int countBygetJtb_By_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the jtb application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId);

	/**
	 * Returns a range of all the jtb application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findBygetJtb_By_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the first jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns the last jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findBygetJtb_By_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the last jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public JtbApplicationStages[] findBygetJtb_By_CaseId_PrevAndNext(
			long jtbApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Removes all the jtb application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetJtb_By_CaseId(String caseId);

	/**
	 * Returns the number of jtb application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb application stageses
	 */
	public int countBygetJtb_By_CaseId(String caseId);

	/**
	 * Returns all the jtb application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName);

	/**
	 * Returns a range of all the jtb application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the jtb application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findBygetJtb_By_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the first jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns the last jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages findBygetJtb_By_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the last jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public JtbApplicationStages fetchBygetJtb_By_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public JtbApplicationStages[] findBygetJtb_By_StageName_PrevAndNext(
			long jtbApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<JtbApplicationStages> orderByComparator)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Removes all the jtb application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetJtb_By_StageName(String stageName);

	/**
	 * Returns the number of jtb application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching jtb application stageses
	 */
	public int countBygetJtb_By_StageName(String stageName);

	/**
	 * Caches the jtb application stages in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationStages the jtb application stages
	 */
	public void cacheResult(JtbApplicationStages jtbApplicationStages);

	/**
	 * Caches the jtb application stageses in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationStageses the jtb application stageses
	 */
	public void cacheResult(
		java.util.List<JtbApplicationStages> jtbApplicationStageses);

	/**
	 * Creates a new jtb application stages with the primary key. Does not add the jtb application stages to the database.
	 *
	 * @param jtbApplicationStagesId the primary key for the new jtb application stages
	 * @return the new jtb application stages
	 */
	public JtbApplicationStages create(long jtbApplicationStagesId);

	/**
	 * Removes the jtb application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages that was removed
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public JtbApplicationStages remove(long jtbApplicationStagesId)
		throws NoSuchJtbApplicationStagesException;

	public JtbApplicationStages updateImpl(
		JtbApplicationStages jtbApplicationStages);

	/**
	 * Returns the jtb application stages with the primary key or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public JtbApplicationStages findByPrimaryKey(long jtbApplicationStagesId)
		throws NoSuchJtbApplicationStagesException;

	/**
	 * Returns the jtb application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages, or <code>null</code> if a jtb application stages with the primary key could not be found
	 */
	public JtbApplicationStages fetchByPrimaryKey(long jtbApplicationStagesId);

	/**
	 * Returns all the jtb application stageses.
	 *
	 * @return the jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findAll();

	/**
	 * Returns a range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb application stageses
	 */
	public java.util.List<JtbApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb application stageses.
	 *
	 * @return the number of jtb application stageses
	 */
	public int countAll();

}