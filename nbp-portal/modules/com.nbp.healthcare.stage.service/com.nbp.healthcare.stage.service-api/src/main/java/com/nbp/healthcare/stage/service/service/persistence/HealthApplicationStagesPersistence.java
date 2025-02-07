/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.stage.service.exception.NoSuchHealthApplicationStagesException;
import com.nbp.healthcare.stage.service.model.HealthApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface HealthApplicationStagesPersistence
	extends BasePersistence<HealthApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthApplicationStagesUtil} to access the health application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the health application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the health application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public HealthApplicationStages[] findByUuid_PrevAndNext(
			long healthApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Removes all the health application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of health application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching health application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the health application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the health application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the health application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the health application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the health application stages that was removed
	 */
	public HealthApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the number of health application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching health application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public HealthApplicationStages[] findByUuid_C_PrevAndNext(
			long healthApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Removes all the health application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching health application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the health application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId);

	/**
	 * Returns a range of all the health application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the health application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the health application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the first health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the last health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the last health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public HealthApplicationStages[] findBygetHAS_BY_CI_PrevAndNext(
			long healthApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Removes all the health application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetHAS_BY_CI(String caseId);

	/**
	 * Returns the number of health application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health application stageses
	 */
	public int countBygetHAS_BY_CI(String caseId);

	/**
	 * Returns the health application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_CI_SN(
			String caseId, String stageName)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the health application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_CI_SN(
		String caseId, String stageName);

	/**
	 * Returns the health application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_CI_SN(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the health application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the health application stages that was removed
	 */
	public HealthApplicationStages removeBygetHAS_BY_CI_SN(
			String caseId, String stageName)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the number of health application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching health application stageses
	 */
	public int countBygetHAS_BY_CI_SN(String caseId, String stageName);

	/**
	 * Returns all the health application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName);

	/**
	 * Returns a range of all the health application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public HealthApplicationStages[] findBygetHAS_BY_StageName_PrevAndNext(
			long healthApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Removes all the health application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetHAS_BY_StageName(String stageName);

	/**
	 * Returns the number of health application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching health application stageses
	 */
	public int countBygetHAS_BY_StageName(String stageName);

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_CI_ST(
			String caseId, String stageStatus)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_CI_ST(
		String caseId, String stageStatus);

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_CI_ST(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the health application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the health application stages that was removed
	 */
	public HealthApplicationStages removeBygetHAS_BY_CI_ST(
			String caseId, String stageStatus)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the number of health application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching health application stageses
	 */
	public int countBygetHAS_BY_CI_ST(String caseId, String stageStatus);

	/**
	 * Returns all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus);

	/**
	 * Returns a range of all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus, int start, int end);

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public java.util.List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_SN_SS_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_SN_SS_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_SN_SS_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_SN_SS_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public HealthApplicationStages[] findBygetHAS_BY_SN_SS_PrevAndNext(
			long healthApplicationStagesId, String stageName,
			String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Removes all the health application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetHAS_BY_SN_SS(String stageName, String stageStatus);

	/**
	 * Returns the number of health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching health application stageses
	 */
	public int countBygetHAS_BY_SN_SS(String stageName, String stageStatus);

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_CI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_CI_ST_SN(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_CI_ST_SN(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache);

	/**
	 * Removes the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the health application stages that was removed
	 */
	public HealthApplicationStages removeBygetHAS_BY_CI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the number of health application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching health application stageses
	 */
	public int countBygetHAS_BY_CI_ST_SN(
		String caseId, String stageStatus, String stageName);

	/**
	 * Returns the health application stages where healthApplicationId = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public HealthApplicationStages findBygetHAS_BY_FAI(long healthApplicationId)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the health application stages where healthApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_FAI(
		long healthApplicationId);

	/**
	 * Returns the health application stages where healthApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthApplicationId the health application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public HealthApplicationStages fetchBygetHAS_BY_FAI(
		long healthApplicationId, boolean useFinderCache);

	/**
	 * Removes the health application stages where healthApplicationId = &#63; from the database.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the health application stages that was removed
	 */
	public HealthApplicationStages removeBygetHAS_BY_FAI(
			long healthApplicationId)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the number of health application stageses where healthApplicationId = &#63;.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the number of matching health application stageses
	 */
	public int countBygetHAS_BY_FAI(long healthApplicationId);

	/**
	 * Caches the health application stages in the entity cache if it is enabled.
	 *
	 * @param healthApplicationStages the health application stages
	 */
	public void cacheResult(HealthApplicationStages healthApplicationStages);

	/**
	 * Caches the health application stageses in the entity cache if it is enabled.
	 *
	 * @param healthApplicationStageses the health application stageses
	 */
	public void cacheResult(
		java.util.List<HealthApplicationStages> healthApplicationStageses);

	/**
	 * Creates a new health application stages with the primary key. Does not add the health application stages to the database.
	 *
	 * @param healthApplicationStagesId the primary key for the new health application stages
	 * @return the new health application stages
	 */
	public HealthApplicationStages create(long healthApplicationStagesId);

	/**
	 * Removes the health application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages that was removed
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public HealthApplicationStages remove(long healthApplicationStagesId)
		throws NoSuchHealthApplicationStagesException;

	public HealthApplicationStages updateImpl(
		HealthApplicationStages healthApplicationStages);

	/**
	 * Returns the health application stages with the primary key or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public HealthApplicationStages findByPrimaryKey(
			long healthApplicationStagesId)
		throws NoSuchHealthApplicationStagesException;

	/**
	 * Returns the health application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages, or <code>null</code> if a health application stages with the primary key could not be found
	 */
	public HealthApplicationStages fetchByPrimaryKey(
		long healthApplicationStagesId);

	/**
	 * Returns all the health application stageses.
	 *
	 * @return the health application stageses
	 */
	public java.util.List<HealthApplicationStages> findAll();

	/**
	 * Returns a range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of health application stageses
	 */
	public java.util.List<HealthApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health application stageses
	 */
	public java.util.List<HealthApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator);

	/**
	 * Returns an ordered range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health application stageses
	 */
	public java.util.List<HealthApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<HealthApplicationStages> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health application stageses.
	 *
	 * @return the number of health application stageses
	 */
	public int countAll();

}