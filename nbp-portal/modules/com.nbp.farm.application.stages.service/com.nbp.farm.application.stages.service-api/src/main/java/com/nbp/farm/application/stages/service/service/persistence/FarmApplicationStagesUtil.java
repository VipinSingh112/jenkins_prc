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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.stages.service.model.FarmApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farm application stages service. This utility wraps <code>com.nbp.farm.application.stages.service.service.persistence.impl.FarmApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmApplicationStagesPersistence
 * @generated
 */
public class FarmApplicationStagesUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(FarmApplicationStages farmApplicationStages) {
		getPersistence().clearCache(farmApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, FarmApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmApplicationStages update(
		FarmApplicationStages farmApplicationStages) {

		return getPersistence().update(farmApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmApplicationStages update(
		FarmApplicationStages farmApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(farmApplicationStages, serviceContext);
	}

	/**
	 * Returns all the farm application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching farm application stageses
	 */
	public static List<FarmApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<FarmApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<FarmApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<FarmApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public static FarmApplicationStages[] findByUuid_PrevAndNext(
			long farmApplicationStagesId, String uuid,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			farmApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the farm application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of farm application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching farm application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the farm application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findByUUID_G(String uuid, long groupId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the farm application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the farm application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the farm application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the farm application stages that was removed
	 */
	public static FarmApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of farm application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching farm application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching farm application stageses
	 */
	public static List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static FarmApplicationStages[] findByUuid_C_PrevAndNext(
			long farmApplicationStagesId, String uuid, long companyId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			farmApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the farm application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching farm application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the farm application stages where farmApplicationId = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetFAS_CAI(long farmApplicationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_CAI(farmApplicationId);
	}

	/**
	 * Returns the farm application stages where farmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_CAI(
		long farmApplicationId) {

		return getPersistence().fetchBygetFAS_CAI(farmApplicationId);
	}

	/**
	 * Returns the farm application stages where farmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_CAI(
		long farmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFAS_CAI(
			farmApplicationId, useFinderCache);
	}

	/**
	 * Removes the farm application stages where farmApplicationId = &#63; from the database.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the farm application stages that was removed
	 */
	public static FarmApplicationStages removeBygetFAS_CAI(
			long farmApplicationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().removeBygetFAS_CAI(farmApplicationId);
	}

	/**
	 * Returns the number of farm application stageses where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm application stageses
	 */
	public static int countBygetFAS_CAI(long farmApplicationId) {
		return getPersistence().countBygetFAS_CAI(farmApplicationId);
	}

	/**
	 * Returns all the farm application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching farm application stageses
	 */
	public static List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName) {

		return getPersistence().findBygetFAS_StageName(stageName);
	}

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
	public static List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetFAS_StageName(stageName, start, end);
	}

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
	public static List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().findBygetFAS_StageName(
			stageName, start, end, orderByComparator);
	}

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
	public static List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetFAS_StageName_First(
			String stageName,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_StageName_First(
		String stageName,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetFAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetFAS_StageName_Last(
			String stageName,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_StageName_Last(
		String stageName,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetFAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public static FarmApplicationStages[] findBygetFAS_StageName_PrevAndNext(
			long farmApplicationStagesId, String stageName,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_PrevAndNext(
			farmApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the farm application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetFAS_StageName(String stageName) {
		getPersistence().removeBygetFAS_StageName(stageName);
	}

	/**
	 * Returns the number of farm application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching farm application stageses
	 */
	public static int countBygetFAS_StageName(String stageName) {
		return getPersistence().countBygetFAS_StageName(stageName);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetFAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetFAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the farm application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the farm application stages that was removed
	 */
	public static FarmApplicationStages removeBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().removeBygetFAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of farm application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching farm application stageses
	 */
	public static int countBygetFAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetFAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns all the farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching farm application stageses
	 */
	public static List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus) {

		return getPersistence().findBygetFAS_StageName_Status(
			stageName, stageStatus);
	}

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
	public static List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetFAS_StageName_Status(
			stageName, stageStatus, start, end);
	}

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
	public static List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().findBygetFAS_StageName_Status(
			stageName, stageStatus, start, end, orderByComparator);
	}

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
	public static List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFAS_StageName_Status(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetFAS_StageName_Status_First(
			String stageName, String stageStatus,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_Status_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_StageName_Status_First(
		String stageName, String stageStatus,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetFAS_StageName_Status_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetFAS_StageName_Status_Last(
			String stageName, String stageStatus,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_Status_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_StageName_Status_Last(
		String stageName, String stageStatus,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetFAS_StageName_Status_Last(
			stageName, stageStatus, orderByComparator);
	}

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
	public static FarmApplicationStages[]
			findBygetFAS_StageName_Status_PrevAndNext(
				long farmApplicationStagesId, String stageName,
				String stageStatus,
				OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_StageName_Status_PrevAndNext(
			farmApplicationStagesId, stageName, stageStatus, orderByComparator);
	}

	/**
	 * Removes all the farm application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetFAS_StageName_Status(
		String stageName, String stageStatus) {

		getPersistence().removeBygetFAS_StageName_Status(
			stageName, stageStatus);
	}

	/**
	 * Returns the number of farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching farm application stageses
	 */
	public static int countBygetFAS_StageName_Status(
		String stageName, String stageStatus) {

		return getPersistence().countBygetFAS_StageName_Status(
			stageName, stageStatus);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the farm application stages that was removed
	 */
	public static FarmApplicationStages removeBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().removeBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of farm application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching farm application stageses
	 */
	public static int countBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetFAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetFAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetFAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the farm application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the farm application stages that was removed
	 */
	public static FarmApplicationStages removeBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().removeBygetFAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of farm application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching farm application stageses
	 */
	public static int countBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetFAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the farm application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching farm application stageses
	 */
	public static List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId) {

		return getPersistence().findBygetCAS_CaseId(caseId);
	}

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
	public static List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetCAS_CaseId(caseId, start, end);
	}

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
	public static List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().findBygetCAS_CaseId(
			caseId, start, end, orderByComparator);
	}

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
	public static List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	public static FarmApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public static FarmApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long farmApplicationStagesId, String caseId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_PrevAndNext(
			farmApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the farm application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCAS_CaseId(String caseId) {
		getPersistence().removeBygetCAS_CaseId(caseId);
	}

	/**
	 * Returns the number of farm application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching farm application stageses
	 */
	public static int countBygetCAS_CaseId(String caseId) {
		return getPersistence().countBygetCAS_CaseId(caseId);
	}

	/**
	 * Caches the farm application stages in the entity cache if it is enabled.
	 *
	 * @param farmApplicationStages the farm application stages
	 */
	public static void cacheResult(
		FarmApplicationStages farmApplicationStages) {

		getPersistence().cacheResult(farmApplicationStages);
	}

	/**
	 * Caches the farm application stageses in the entity cache if it is enabled.
	 *
	 * @param farmApplicationStageses the farm application stageses
	 */
	public static void cacheResult(
		List<FarmApplicationStages> farmApplicationStageses) {

		getPersistence().cacheResult(farmApplicationStageses);
	}

	/**
	 * Creates a new farm application stages with the primary key. Does not add the farm application stages to the database.
	 *
	 * @param farmApplicationStagesId the primary key for the new farm application stages
	 * @return the new farm application stages
	 */
	public static FarmApplicationStages create(long farmApplicationStagesId) {
		return getPersistence().create(farmApplicationStagesId);
	}

	/**
	 * Removes the farm application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages that was removed
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public static FarmApplicationStages remove(long farmApplicationStagesId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().remove(farmApplicationStagesId);
	}

	public static FarmApplicationStages updateImpl(
		FarmApplicationStages farmApplicationStages) {

		return getPersistence().updateImpl(farmApplicationStages);
	}

	/**
	 * Returns the farm application stages with the primary key or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	public static FarmApplicationStages findByPrimaryKey(
			long farmApplicationStagesId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmApplicationStagesException {

		return getPersistence().findByPrimaryKey(farmApplicationStagesId);
	}

	/**
	 * Returns the farm application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages, or <code>null</code> if a farm application stages with the primary key could not be found
	 */
	public static FarmApplicationStages fetchByPrimaryKey(
		long farmApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(farmApplicationStagesId);
	}

	/**
	 * Returns all the farm application stageses.
	 *
	 * @return the farm application stageses
	 */
	public static List<FarmApplicationStages> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<FarmApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<FarmApplicationStages> findAll(
		int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<FarmApplicationStages> findAll(
		int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farm application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farm application stageses.
	 *
	 * @return the number of farm application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmApplicationStagesPersistence _persistence;

}