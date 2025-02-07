/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.stages.services.exception.NoSuchOsiApplicationStagesException;
import com.nbp.osi.stages.services.model.OsiApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface OsiApplicationStagesPersistence
	extends BasePersistence<OsiApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiApplicationStagesUtil} to access the osi application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the osi application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public OsiApplicationStages[] findByUuid_PrevAndNext(
			long OsiApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Removes all the osi application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the osi application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the osi application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi application stages that was removed
	 */
	public OsiApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the number of osi application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public OsiApplicationStages[] findByUuid_C_PrevAndNext(
			long OsiApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Removes all the osi application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi application stages where osiApplicationId = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetOAS_OAI(long osiApplicationId)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the osi application stages where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_OAI(long osiApplicationId);

	/**
	 * Returns the osi application stages where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_OAI(
		long osiApplicationId, boolean useFinderCache);

	/**
	 * Removes the osi application stages where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the osi application stages that was removed
	 */
	public OsiApplicationStages removeBygetOAS_OAI(long osiApplicationId)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the number of osi application stageses where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi application stageses
	 */
	public int countBygetOAS_OAI(long osiApplicationId);

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the osi application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the osi application stages that was removed
	 */
	public OsiApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the number of osi application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching osi application stageses
	 */
	public int countBygetCAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the osi application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName);

	/**
	 * Returns a range of all the osi application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetOAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetOAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public OsiApplicationStages[] findBygetOAS_StageName_PrevAndNext(
			long OsiApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Removes all the osi application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetOAS_StageName(String stageName);

	/**
	 * Returns the number of osi application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching osi application stageses
	 */
	public int countBygetOAS_StageName(String stageName);

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetOAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the osi application stages that was removed
	 */
	public OsiApplicationStages removeBygetOAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the number of osi application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi application stageses
	 */
	public int countBygetOAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the osi application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetOAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the osi application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the osi application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the osi application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the osi application stages that was removed
	 */
	public OsiApplicationStages removeBygetOAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the number of osi application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching osi application stageses
	 */
	public int countBygetOAS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages>
		findBygetOAS_StageNamendStageStatus(
			String stageName, String stageStatus);

	/**
	 * Returns a range of all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages>
		findBygetOAS_StageNamendStageStatus(
			String stageName, String stageStatus, int start, int end);

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages>
		findBygetOAS_StageNamendStageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages>
		findBygetOAS_StageNamendStageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetOAS_StageNamendStageStatus_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_StageNamendStageStatus_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetOAS_StageNamendStageStatus_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_StageNamendStageStatus_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public OsiApplicationStages[]
			findBygetOAS_StageNamendStageStatus_PrevAndNext(
				long OsiApplicationStagesId, String stageName,
				String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Removes all the osi application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the number of osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi application stageses
	 */
	public int countBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns all the osi application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId);

	/**
	 * Returns a range of all the osi application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the osi application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetOAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the first osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the last osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public OsiApplicationStages findBygetOAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the last osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public OsiApplicationStages fetchBygetOAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public OsiApplicationStages[] findBygetOAS_CaseId_PrevAndNext(
			long OsiApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiApplicationStages> orderByComparator)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Removes all the osi application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetOAS_CaseId(String caseId);

	/**
	 * Returns the number of osi application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi application stageses
	 */
	public int countBygetOAS_CaseId(String caseId);

	/**
	 * Caches the osi application stages in the entity cache if it is enabled.
	 *
	 * @param osiApplicationStages the osi application stages
	 */
	public void cacheResult(OsiApplicationStages osiApplicationStages);

	/**
	 * Caches the osi application stageses in the entity cache if it is enabled.
	 *
	 * @param osiApplicationStageses the osi application stageses
	 */
	public void cacheResult(
		java.util.List<OsiApplicationStages> osiApplicationStageses);

	/**
	 * Creates a new osi application stages with the primary key. Does not add the osi application stages to the database.
	 *
	 * @param OsiApplicationStagesId the primary key for the new osi application stages
	 * @return the new osi application stages
	 */
	public OsiApplicationStages create(long OsiApplicationStagesId);

	/**
	 * Removes the osi application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages that was removed
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public OsiApplicationStages remove(long OsiApplicationStagesId)
		throws NoSuchOsiApplicationStagesException;

	public OsiApplicationStages updateImpl(
		OsiApplicationStages osiApplicationStages);

	/**
	 * Returns the osi application stages with the primary key or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public OsiApplicationStages findByPrimaryKey(long OsiApplicationStagesId)
		throws NoSuchOsiApplicationStagesException;

	/**
	 * Returns the osi application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages, or <code>null</code> if a osi application stages with the primary key could not be found
	 */
	public OsiApplicationStages fetchByPrimaryKey(long OsiApplicationStagesId);

	/**
	 * Returns all the osi application stageses.
	 *
	 * @return the osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findAll();

	/**
	 * Returns a range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi application stageses
	 */
	public java.util.List<OsiApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi application stageses.
	 *
	 * @return the number of osi application stageses
	 */
	public int countAll();

}