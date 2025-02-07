/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncra.stages.services.exception.NoSuchNcraApplicationStagesException;
import com.nbp.ncra.stages.services.model.NcraApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncra application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface NcraApplicationStagesPersistence
	extends BasePersistence<NcraApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcraApplicationStagesUtil} to access the ncra application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ncra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the ncra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public NcraApplicationStages[] findByUuid_PrevAndNext(
			long ncraApplciationStage, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Removes all the ncra application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of ncra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncra application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the ncra application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the ncra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the ncra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the ncra application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncra application stages that was removed
	 */
	public NcraApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the number of ncra application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncra application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public NcraApplicationStages[] findByUuid_C_PrevAndNext(
			long ncraApplciationStage, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Removes all the ncra application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncra application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the ncra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId);

	/**
	 * Returns a range of all the ncra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the ncra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByget_NCRA_AppStage_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the first ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_AppStage_By_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns the last ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByget_NCRA_AppStage_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the last ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_AppStage_By_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public NcraApplicationStages[] findByget_NCRA_AppStage_By_CI_PrevAndNext(
			long ncraApplciationStage, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Removes all the ncra application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeByget_NCRA_AppStage_By_CI(String caseId);

	/**
	 * Returns the number of ncra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra application stageses
	 */
	public int countByget_NCRA_AppStage_By_CI(String caseId);

	/**
	 * Returns the ncra application stages where caseId = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByget_NCRA_AppStage_CI(String caseId)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the ncra application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_AppStage_CI(String caseId);

	/**
	 * Returns the ncra application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_AppStage_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncra application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncra application stages that was removed
	 */
	public NcraApplicationStages removeByget_NCRA_AppStage_CI(String caseId)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the number of ncra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra application stageses
	 */
	public int countByget_NCRA_AppStage_CI(String caseId);

	/**
	 * Returns all the ncra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName);

	/**
	 * Returns a range of all the ncra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the ncra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByget_NCRA_By_SN_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the first ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_SN_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns the last ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByget_NCRA_By_SN_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the last ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_SN_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public NcraApplicationStages[] findByget_NCRA_By_SN_PrevAndNext(
			long ncraApplciationStage, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Removes all the ncra application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeByget_NCRA_By_SN(String stageName);

	/**
	 * Returns the number of ncra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching ncra application stageses
	 */
	public int countByget_NCRA_By_SN(String stageName);

	/**
	 * Returns the ncra application stages where stageStatus = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByget_NCRA_By_Status(String stageStatus)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the ncra application stages where stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_Status(String stageStatus);

	/**
	 * Returns the ncra application stages where stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_Status(
		String stageStatus, boolean useFinderCache);

	/**
	 * Removes the ncra application stages where stageStatus = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @return the ncra application stages that was removed
	 */
	public NcraApplicationStages removeByget_NCRA_By_Status(String stageStatus)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the number of ncra application stageses where stageStatus = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @return the number of matching ncra application stageses
	 */
	public int countByget_NCRA_By_Status(String stageStatus);

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByget_NCRA_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the ncra application stages that was removed
	 */
	public NcraApplicationStages removeByget_NCRA_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the number of ncra application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching ncra application stageses
	 */
	public int countByget_NCRA_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByget_NCRA_By_CI_SN(
			String caseId, String stageName)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_CI_SN(
		String caseId, String stageName);

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_CI_SN(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the ncra application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the ncra application stages that was removed
	 */
	public NcraApplicationStages removeByget_NCRA_By_CI_SN(
			String caseId, String stageName)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the number of ncra application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching ncra application stageses
	 */
	public int countByget_NCRA_By_CI_SN(String caseId, String stageName);

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages findByget_NCRA_By_CI_SS(
			String caseId, String stageStatus)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_CI_SS(
		String caseId, String stageStatus);

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public NcraApplicationStages fetchByget_NCRA_By_CI_SS(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the ncra application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the ncra application stages that was removed
	 */
	public NcraApplicationStages removeByget_NCRA_By_CI_SS(
			String caseId, String stageStatus)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the number of ncra application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching ncra application stageses
	 */
	public int countByget_NCRA_By_CI_SS(String caseId, String stageStatus);

	/**
	 * Caches the ncra application stages in the entity cache if it is enabled.
	 *
	 * @param ncraApplicationStages the ncra application stages
	 */
	public void cacheResult(NcraApplicationStages ncraApplicationStages);

	/**
	 * Caches the ncra application stageses in the entity cache if it is enabled.
	 *
	 * @param ncraApplicationStageses the ncra application stageses
	 */
	public void cacheResult(
		java.util.List<NcraApplicationStages> ncraApplicationStageses);

	/**
	 * Creates a new ncra application stages with the primary key. Does not add the ncra application stages to the database.
	 *
	 * @param ncraApplciationStage the primary key for the new ncra application stages
	 * @return the new ncra application stages
	 */
	public NcraApplicationStages create(long ncraApplciationStage);

	/**
	 * Removes the ncra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages that was removed
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public NcraApplicationStages remove(long ncraApplciationStage)
		throws NoSuchNcraApplicationStagesException;

	public NcraApplicationStages updateImpl(
		NcraApplicationStages ncraApplicationStages);

	/**
	 * Returns the ncra application stages with the primary key or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public NcraApplicationStages findByPrimaryKey(long ncraApplciationStage)
		throws NoSuchNcraApplicationStagesException;

	/**
	 * Returns the ncra application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages, or <code>null</code> if a ncra application stages with the primary key could not be found
	 */
	public NcraApplicationStages fetchByPrimaryKey(long ncraApplciationStage);

	/**
	 * Returns all the ncra application stageses.
	 *
	 * @return the ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findAll();

	/**
	 * Returns a range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra application stageses
	 */
	public java.util.List<NcraApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncra application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncra application stageses.
	 *
	 * @return the number of ncra application stageses
	 */
	public int countAll();

}