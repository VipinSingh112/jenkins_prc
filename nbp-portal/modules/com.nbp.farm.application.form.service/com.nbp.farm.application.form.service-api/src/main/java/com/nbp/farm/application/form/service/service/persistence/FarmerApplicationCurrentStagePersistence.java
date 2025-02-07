/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.farm.application.form.service.exception.NoSuchFarmerApplicationCurrentStageException;
import com.nbp.farm.application.form.service.model.FarmerApplicationCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationCurrentStageUtil
 * @generated
 */
@ProviderType
public interface FarmerApplicationCurrentStagePersistence
	extends BasePersistence<FarmerApplicationCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerApplicationCurrentStageUtil} to access the farmer application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the farmer application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findByUuid(
		String uuid);

	/**
	 * Returns a range of all the farmer application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @return the range of matching farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the farmer application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the farmer application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the farmer application current stages before and after the current farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param farmerCurrentStageId the primary key of the current farmer application current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	public FarmerApplicationCurrentStage[] findByUuid_PrevAndNext(
			long farmerCurrentStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Removes all the farmer application current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of farmer application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching farmer application current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the farmer application current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFarmerApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Returns the farmer application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId);

	/**
	 * Returns the farmer application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the farmer application current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the farmer application current stage that was removed
	 */
	public FarmerApplicationCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Returns the number of farmer application current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching farmer application current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @return the range of matching farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator);

	/**
	 * Returns the farmer application current stages before and after the current farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param farmerCurrentStageId the primary key of the current farmer application current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	public FarmerApplicationCurrentStage[] findByUuid_C_PrevAndNext(
			long farmerCurrentStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Removes all the farmer application current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching farmer application current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the farmer application current stage where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage findBygetfarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Returns the farmer application current stage where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage fetchBygetfarmerById(
		long farmerApplicationId);

	/**
	 * Returns the farmer application current stage where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public FarmerApplicationCurrentStage fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer application current stage where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer application current stage that was removed
	 */
	public FarmerApplicationCurrentStage removeBygetfarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Returns the number of farmer application current stages where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer application current stages
	 */
	public int countBygetfarmerById(long farmerApplicationId);

	/**
	 * Caches the farmer application current stage in the entity cache if it is enabled.
	 *
	 * @param farmerApplicationCurrentStage the farmer application current stage
	 */
	public void cacheResult(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage);

	/**
	 * Caches the farmer application current stages in the entity cache if it is enabled.
	 *
	 * @param farmerApplicationCurrentStages the farmer application current stages
	 */
	public void cacheResult(
		java.util.List<FarmerApplicationCurrentStage>
			farmerApplicationCurrentStages);

	/**
	 * Creates a new farmer application current stage with the primary key. Does not add the farmer application current stage to the database.
	 *
	 * @param farmerCurrentStageId the primary key for the new farmer application current stage
	 * @return the new farmer application current stage
	 */
	public FarmerApplicationCurrentStage create(long farmerCurrentStageId);

	/**
	 * Removes the farmer application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage that was removed
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	public FarmerApplicationCurrentStage remove(long farmerCurrentStageId)
		throws NoSuchFarmerApplicationCurrentStageException;

	public FarmerApplicationCurrentStage updateImpl(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage);

	/**
	 * Returns the farmer application current stage with the primary key or throws a <code>NoSuchFarmerApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	public FarmerApplicationCurrentStage findByPrimaryKey(
			long farmerCurrentStageId)
		throws NoSuchFarmerApplicationCurrentStageException;

	/**
	 * Returns the farmer application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage, or <code>null</code> if a farmer application current stage with the primary key could not be found
	 */
	public FarmerApplicationCurrentStage fetchByPrimaryKey(
		long farmerCurrentStageId);

	/**
	 * Returns all the farmer application current stages.
	 *
	 * @return the farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findAll();

	/**
	 * Returns a range of all the farmer application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @return the range of farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the farmer application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator);

	/**
	 * Returns an ordered range of all the farmer application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer application current stages
	 */
	public java.util.List<FarmerApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer application current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer application current stages.
	 *
	 * @return the number of farmer application current stages
	 */
	public int countAll();

}