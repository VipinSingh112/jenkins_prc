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

package com.nbp.farm.application.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.farm.application.stages.service.exception.NoSuchFarmApplicationStagesException;
import com.nbp.farm.application.stages.service.model.FarmApplicationStages;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farm application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmApplicationStagesUtil
 * @generated
 */
@ProviderType
public interface FarmApplicationStagesPersistence
	extends BasePersistence<FarmApplicationStages> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmApplicationStagesUtil} to access the farm application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the farm application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findByUuid(String uuid);

	/**
	 * Returns a range of all the farm application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the farm application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public FarmApplicationStages[] findByUuid_PrevAndNext(
			long farmApplicationStagesId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Removes all the farm application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of farm application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching farm application stageses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the farm application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the farm application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the farm application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the farm application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the farm application stages that was removed
	 */
	public FarmApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the number of farm application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching farm application stageses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public FarmApplicationStages[] findByUuid_C_PrevAndNext(
			long farmApplicationStagesId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Removes all the farm application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching farm application stageses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the farm application stages where farmApplicationId = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetFAS_CAI(long farmApplicationId)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the farm application stages where farmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_CAI(long farmApplicationId);

	/**
	 * Returns the farm application stages where farmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_CAI(
		long farmApplicationId, boolean useFinderCache);

	/**
	 * Removes the farm application stages where farmApplicationId = &#63; from the database.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the farm application stages that was removed
	 */
	public FarmApplicationStages removeBygetFAS_CAI(long farmApplicationId)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the number of farm application stageses where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm application stageses
	 */
	public int countBygetFAS_CAI(long farmApplicationId);

	/**
	 * Returns all the farm application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName);

	/**
	 * Returns a range of all the farm application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end);

	/**
	 * Returns an ordered range of all the farm application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetFAS_StageName_First(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_StageName_First(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetFAS_StageName_Last(
			String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_StageName_Last(
		String stageName,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public FarmApplicationStages[] findBygetFAS_StageName_PrevAndNext(
			long farmApplicationStagesId, String stageName,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Removes all the farm application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public void removeBygetFAS_StageName(String stageName);

	/**
	 * Returns the number of farm application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching farm application stageses
	 */
	public int countBygetFAS_StageName(String stageName);

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName);

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache);

	/**
	 * Removes the farm application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the farm application stages that was removed
	 */
	public FarmApplicationStages removeBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the number of farm application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching farm application stageses
	 */
	public int countBygetFAS_CaseIdStageName(String caseId, String stageName);

	/**
	 * Returns all the farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus);

	/**
	 * Returns a range of all the farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus, int start, int end);

	/**
	 * Returns an ordered range of all the farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetFAS_StageName_Status_First(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_StageName_Status_First(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetFAS_StageName_Status_Last(
			String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_StageName_Status_Last(
		String stageName, String stageStatus,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public FarmApplicationStages[] findBygetFAS_StageName_Status_PrevAndNext(
			long farmApplicationStagesId, String stageName, String stageStatus,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Removes all the farm application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public void removeBygetFAS_StageName_Status(
		String stageName, String stageStatus);

	/**
	 * Returns the number of farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching farm application stageses
	 */
	public int countBygetFAS_StageName_Status(
		String stageName, String stageStatus);

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache);

	/**
	 * Removes the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the farm application stages that was removed
	 */
	public FarmApplicationStages removeBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the number of farm application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching farm application stageses
	 */
	public int countBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus);

	/**
	 * Returns the farm application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the farm application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus);

	/**
	 * Returns the farm application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache);

	/**
	 * Removes the farm application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the farm application stages that was removed
	 */
	public FarmApplicationStages removeBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the number of farm application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching farm application stageses
	 */
	public int countBygetFAS_CaseIdAndStatus(String caseId, String stageStatus);

	/**
	 * Returns all the farm application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId);

	/**
	 * Returns a range of all the farm application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the farm application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the first farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the last farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public FarmApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the last farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public FarmApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public FarmApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long farmApplicationStagesId, String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Removes all the farm application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetCAS_CaseId(String caseId);

	/**
	 * Returns the number of farm application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching farm application stageses
	 */
	public int countBygetCAS_CaseId(String caseId);

	/**
	 * Caches the farm application stages in the entity cache if it is enabled.
	 *
	 * @param farmApplicationStages the farm application stages
	 */
	public void cacheResult(FarmApplicationStages farmApplicationStages);

	/**
	 * Caches the farm application stageses in the entity cache if it is enabled.
	 *
	 * @param farmApplicationStageses the farm application stageses
	 */
	public void cacheResult(
		java.util.List<FarmApplicationStages> farmApplicationStageses);

	/**
	 * Creates a new farm application stages with the primary key. Does not add the farm application stages to the database.
	 *
	 * @param farmApplicationStagesId the primary key for the new farm application stages
	 * @return the new farm application stages
	 */
	public FarmApplicationStages create(long farmApplicationStagesId);

	/**
	 * Removes the farm application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages that was removed
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public FarmApplicationStages remove(long farmApplicationStagesId)
		throws NoSuchFarmApplicationStagesException;

	public FarmApplicationStages updateImpl(
		FarmApplicationStages farmApplicationStages);

	/**
	 * Returns the farm application stages with the primary key or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public FarmApplicationStages findByPrimaryKey(long farmApplicationStagesId)
		throws NoSuchFarmApplicationStagesException;

	/**
	 * Returns the farm application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages, or <code>null</code> if a farm application stages with the primary key could not be found
	 */
	public FarmApplicationStages fetchByPrimaryKey(
		long farmApplicationStagesId);

	/**
	 * Returns all the farm application stageses.
	 *
	 * @return the farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findAll();

	/**
	 * Returns a range of all the farm application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farm application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm application stageses
	 */
	public java.util.List<FarmApplicationStages> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmApplicationStages>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farm application stageses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farm application stageses.
	 *
	 * @return the number of farm application stageses
	 */
	public int countAll();

}