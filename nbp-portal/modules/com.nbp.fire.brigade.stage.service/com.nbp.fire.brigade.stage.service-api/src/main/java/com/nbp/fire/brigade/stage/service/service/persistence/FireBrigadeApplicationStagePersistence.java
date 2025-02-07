/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeApplicationStageException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationStageUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeApplicationStagePersistence
	extends BasePersistence<FireBrigadeApplicationStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeApplicationStageUtil} to access the fire brigade application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the fire brigade application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the fire brigade application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public FireBrigadeApplicationStage[] findByUuid_PrevAndNext(
			long fireBrigadeAppStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Removes all the fire brigade application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of fire brigade application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fire brigade application stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the fire brigade application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the fire brigade application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the fire brigade application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the fire brigade application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the fire brigade application stage that was removed
	 */
	public FireBrigadeApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the number of fire brigade application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching fire brigade application stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public FireBrigadeApplicationStage[] findByUuid_C_PrevAndNext(
			long fireBrigadeAppStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Removes all the fire brigade application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching fire brigade application stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the fire brigade application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage>
		findByget_FB_AppStage_By_CI(String caseId);

	/**
	 * Returns a range of all the fire brigade application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage>
		findByget_FB_AppStage_By_CI(String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage>
		findByget_FB_AppStage_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage>
		findByget_FB_AppStage_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByget_FB_AppStage_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the first fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_AppStage_By_CI_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns the last fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByget_FB_AppStage_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the last fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_AppStage_By_CI_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public FireBrigadeApplicationStage[]
			findByget_FB_AppStage_By_CI_PrevAndNext(
				long fireBrigadeAppStageId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Removes all the fire brigade application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeByget_FB_AppStage_By_CI(String caseId);

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade application stages
	 */
	public int countByget_FB_AppStage_By_CI(String caseId);

	/**
	 * Returns the fire brigade application stage where caseId = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByget_FB_AppStage_CI(String caseId)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the fire brigade application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_AppStage_CI(String caseId);

	/**
	 * Returns the fire brigade application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_AppStage_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the fire brigade application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade application stage that was removed
	 */
	public FireBrigadeApplicationStage removeByget_FB_AppStage_CI(String caseId)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade application stages
	 */
	public int countByget_FB_AppStage_CI(String caseId);

	/**
	 * Returns all the fire brigade application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName);

	/**
	 * Returns a range of all the fire brigade application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByget_FB_By_SN_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the first fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_SN_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns the last fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByget_FB_By_SN_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the last fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_SN_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public FireBrigadeApplicationStage[] findByget_FB_By_SN_PrevAndNext(
			long fireBrigadeAppStageId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Removes all the fire brigade application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeByget_FB_By_SN(String stageName);

	/**
	 * Returns the number of fire brigade application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching fire brigade application stages
	 */
	public int countByget_FB_By_SN(String stageName);

	/**
	 * Returns the fire brigade application stage where stageStatus = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByget_FB_By_Status(
			String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the fire brigade application stage where stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_Status(
		String stageStatus);

	/**
	 * Returns the fire brigade application stage where stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_Status(
		String stageStatus, boolean useFinderCache);

	/**
	 * Removes the fire brigade application stage where stageStatus = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @return the fire brigade application stage that was removed
	 */
	public FireBrigadeApplicationStage removeByget_FB_By_Status(
			String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the number of fire brigade application stages where stageStatus = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @return the number of matching fire brigade application stages
	 */
	public int countByget_FB_By_Status(String stageStatus);

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByget_FB_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the fire brigade application stage that was removed
	 */
	public FireBrigadeApplicationStage removeByget_FB_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching fire brigade application stages
	 */
	public int countByget_FB_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByget_FB_By_CI_SN(
			String caseId, String stageName)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SN(
		String caseId, String stageName);

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SN(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the fire brigade application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the fire brigade application stage that was removed
	 */
	public FireBrigadeApplicationStage removeByget_FB_By_CI_SN(
			String caseId, String stageName)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching fire brigade application stages
	 */
	public int countByget_FB_By_CI_SN(String caseId, String stageName);

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage findByget_FB_By_CI_SS(
			String caseId, String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SS(
		String caseId, String stageStatus);

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SS(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the fire brigade application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the fire brigade application stage that was removed
	 */
	public FireBrigadeApplicationStage removeByget_FB_By_CI_SS(
			String caseId, String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching fire brigade application stages
	 */
	public int countByget_FB_By_CI_SS(String caseId, String stageStatus);

	/**
	 * Caches the fire brigade application stage in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 */
	public void cacheResult(
		FireBrigadeApplicationStage fireBrigadeApplicationStage);

	/**
	 * Caches the fire brigade application stages in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplicationStages the fire brigade application stages
	 */
	public void cacheResult(
		java.util.List<FireBrigadeApplicationStage>
			fireBrigadeApplicationStages);

	/**
	 * Creates a new fire brigade application stage with the primary key. Does not add the fire brigade application stage to the database.
	 *
	 * @param fireBrigadeAppStageId the primary key for the new fire brigade application stage
	 * @return the new fire brigade application stage
	 */
	public FireBrigadeApplicationStage create(long fireBrigadeAppStageId);

	/**
	 * Removes the fire brigade application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public FireBrigadeApplicationStage remove(long fireBrigadeAppStageId)
		throws NoSuchFireBrigadeApplicationStageException;

	public FireBrigadeApplicationStage updateImpl(
		FireBrigadeApplicationStage fireBrigadeApplicationStage);

	/**
	 * Returns the fire brigade application stage with the primary key or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public FireBrigadeApplicationStage findByPrimaryKey(
			long fireBrigadeAppStageId)
		throws NoSuchFireBrigadeApplicationStageException;

	/**
	 * Returns the fire brigade application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage, or <code>null</code> if a fire brigade application stage with the primary key could not be found
	 */
	public FireBrigadeApplicationStage fetchByPrimaryKey(
		long fireBrigadeAppStageId);

	/**
	 * Returns all the fire brigade application stages.
	 *
	 * @return the fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findAll();

	/**
	 * Returns a range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade application stages
	 */
	public java.util.List<FireBrigadeApplicationStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade application stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade application stages.
	 *
	 * @return the number of fire brigade application stages
	 */
	public int countAll();

}