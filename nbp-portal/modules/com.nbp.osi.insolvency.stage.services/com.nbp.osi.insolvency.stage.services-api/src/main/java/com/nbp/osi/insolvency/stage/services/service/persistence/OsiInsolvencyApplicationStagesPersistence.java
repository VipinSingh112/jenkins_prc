/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolvencyApplicationStagesException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi insolvency application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface OsiInsolvencyApplicationStagesPersistence
	extends BasePersistence<OsiInsolvencyApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInsolvencyApplicationStagesUtil} to access the osi insolvency application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public OsiInsolvencyApplicationStages[] findByUuid_PrevAndNext(
			long osiInsolveApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Removes all the osi insolvency application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of osi insolvency application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the osi insolvency application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the osi insolvency application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the osi insolvency application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the osi insolvency application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi insolvency application stages that was removed
	 */
	public OsiInsolvencyApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the number of osi insolvency application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public OsiInsolvencyApplicationStages[] findByUuid_C_PrevAndNext(
			long osiInsolveApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Removes all the osi insolvency application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the osi insolvency application stages where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findBygetOIAS_OAI(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the osi insolvency application stages where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_OAI(
		long osiInsolvencyId);

	/**
	 * Returns the osi insolvency application stages where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_OAI(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi insolvency application stages where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency application stages that was removed
	 */
	public OsiInsolvencyApplicationStages removeBygetOIAS_OAI(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the number of osi insolvency application stageses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countBygetOIAS_OAI(long osiInsolvencyId);

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the osi insolvency application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the osi insolvency application stages that was removed
	 */
	public OsiInsolvencyApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countBygetCAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName(String stageName);

	/**
	 * Returns a range of all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName(String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName(
			String stageName, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findBygetOIAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findBygetOIAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public OsiInsolvencyApplicationStages[] findBygetOIAS_StageName_PrevAndNext(
			long osiInsolveApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Removes all the osi insolvency application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetOIAS_StageName(String stageName);

	/**
	 * Returns the number of osi insolvency application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countBygetOIAS_StageName(String stageName);

	/**
	 * Returns all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus);

	/**
	 * Returns a range of all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages
			findBygetOIAS_StageName_StageStatus_First(
				String stageName, String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages
		fetchBygetOIAS_StageName_StageStatus_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages
			findBygetOIAS_StageName_StageStatus_Last(
				String stageName, String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages
		fetchBygetOIAS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public OsiInsolvencyApplicationStages[]
			findBygetOIAS_StageName_StageStatus_PrevAndNext(
				long osiInsolveApplicationStagesId, String stageName,
				String stageStatus,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Removes all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetOIAS_StageName_StageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the number of osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countBygetOIAS_StageName_StageStatus(
		String stageName, String stageStatus);

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findBygetOIAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the osi insolvency application stages that was removed
	 */
	public OsiInsolvencyApplicationStages removeBygetOIAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countBygetOIAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findBygetOIAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the osi insolvency application stages that was removed
	 */
	public OsiInsolvencyApplicationStages removeBygetOIAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countBygetOIAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId);

	/**
	 * Returns a range of all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findBygetOIAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the first osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the last osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages findBygetOIAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the last osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public OsiInsolvencyApplicationStages fetchBygetOIAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public OsiInsolvencyApplicationStages[] findBygetOIAS_CaseId_PrevAndNext(
			long osiInsolveApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplicationStages> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Removes all the osi insolvency application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetOIAS_CaseId(String caseId);

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency application stageses
	 */
	public int countBygetOIAS_CaseId(String caseId);

	/**
	 * Caches the osi insolvency application stages in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationStages the osi insolvency application stages
	 */
	public void cacheResult(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages);

	/**
	 * Caches the osi insolvency application stageses in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationStageses the osi insolvency application stageses
	 */
	public void cacheResult(
		java.util.List<OsiInsolvencyApplicationStages>
			osiInsolvencyApplicationStageses);

	/**
	 * Creates a new osi insolvency application stages with the primary key. Does not add the osi insolvency application stages to the database.
	 *
	 * @param osiInsolveApplicationStagesId the primary key for the new osi insolvency application stages
	 * @return the new osi insolvency application stages
	 */
	public OsiInsolvencyApplicationStages create(
		long osiInsolveApplicationStagesId);

	/**
	 * Removes the osi insolvency application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages that was removed
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public OsiInsolvencyApplicationStages remove(
			long osiInsolveApplicationStagesId)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	public OsiInsolvencyApplicationStages updateImpl(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages);

	/**
	 * Returns the osi insolvency application stages with the primary key or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public OsiInsolvencyApplicationStages findByPrimaryKey(
			long osiInsolveApplicationStagesId)
		throws NoSuchOsiInsolvencyApplicationStagesException;

	/**
	 * Returns the osi insolvency application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages, or <code>null</code> if a osi insolvency application stages with the primary key could not be found
	 */
	public OsiInsolvencyApplicationStages fetchByPrimaryKey(
		long osiInsolveApplicationStagesId);

	/**
	 * Returns all the osi insolvency application stageses.
	 *
	 * @return the osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findAll();

	/**
	 * Returns a range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency application stageses
	 */
	public java.util.List<OsiInsolvencyApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi insolvency application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi insolvency application stageses.
	 *
	 * @return the number of osi insolvency application stageses
	 */
	public int countAll();

}