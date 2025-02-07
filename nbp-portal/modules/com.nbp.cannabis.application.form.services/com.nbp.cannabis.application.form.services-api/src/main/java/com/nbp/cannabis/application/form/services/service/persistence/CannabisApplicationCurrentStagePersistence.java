/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationCurrentStageException;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCurrentStageUtil
 * @generated
 */
@ProviderType
public interface CannabisApplicationCurrentStagePersistence
	extends BasePersistence<CannabisApplicationCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisApplicationCurrentStageUtil} to access the cannabis application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the cannabis application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of matching cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCurrentStage> orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCurrentStage> orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the cannabis application current stages before and after the current cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisStageId the primary key of the current cannabis application current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	public CannabisApplicationCurrentStage[] findByUuid_PrevAndNext(
			long cannabisStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCurrentStage> orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Removes all the cannabis application current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of cannabis application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the cannabis application current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage findByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Returns the cannabis application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the cannabis application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the cannabis application current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application current stage that was removed
	 */
	public CannabisApplicationCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Returns the number of cannabis application current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of matching cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCurrentStage> orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCurrentStage> orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the cannabis application current stages before and after the current cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisStageId the primary key of the current cannabis application current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	public CannabisApplicationCurrentStage[] findByUuid_C_PrevAndNext(
			long cannabisStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisApplicationCurrentStage> orderByComparator)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Removes all the cannabis application current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the cannabis application current stage where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage findBygetCA_Stage_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Returns the cannabis application current stage where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long cannabisApplicationId);

	/**
	 * Returns the cannabis application current stage where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public CannabisApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long cannabisApplicationId, boolean useFinderCache);

	/**
	 * Removes the cannabis application current stage where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application current stage that was removed
	 */
	public CannabisApplicationCurrentStage removeBygetCA_Stage_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Returns the number of cannabis application current stages where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application current stages
	 */
	public int countBygetCA_Stage_CAI(long cannabisApplicationId);

	/**
	 * Caches the cannabis application current stage in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCurrentStage the cannabis application current stage
	 */
	public void cacheResult(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage);

	/**
	 * Caches the cannabis application current stages in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCurrentStages the cannabis application current stages
	 */
	public void cacheResult(
		java.util.List<CannabisApplicationCurrentStage>
			cannabisApplicationCurrentStages);

	/**
	 * Creates a new cannabis application current stage with the primary key. Does not add the cannabis application current stage to the database.
	 *
	 * @param cannabisStageId the primary key for the new cannabis application current stage
	 * @return the new cannabis application current stage
	 */
	public CannabisApplicationCurrentStage create(long cannabisStageId);

	/**
	 * Removes the cannabis application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage that was removed
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	public CannabisApplicationCurrentStage remove(long cannabisStageId)
		throws NoSuchCannabisApplicationCurrentStageException;

	public CannabisApplicationCurrentStage updateImpl(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage);

	/**
	 * Returns the cannabis application current stage with the primary key or throws a <code>NoSuchCannabisApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	public CannabisApplicationCurrentStage findByPrimaryKey(
			long cannabisStageId)
		throws NoSuchCannabisApplicationCurrentStageException;

	/**
	 * Returns the cannabis application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage, or <code>null</code> if a cannabis application current stage with the primary key could not be found
	 */
	public CannabisApplicationCurrentStage fetchByPrimaryKey(
		long cannabisStageId);

	/**
	 * Returns all the cannabis application current stages.
	 *
	 * @return the cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findAll();

	/**
	 * Returns a range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application current stages
	 */
	public java.util.List<CannabisApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis application current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis application current stages.
	 *
	 * @return the number of cannabis application current stages
	 */
	public int countAll();

}