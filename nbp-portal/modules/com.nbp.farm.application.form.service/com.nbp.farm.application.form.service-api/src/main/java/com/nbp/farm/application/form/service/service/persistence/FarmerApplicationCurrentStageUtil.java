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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.form.service.model.FarmerApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer application current stage service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationCurrentStagePersistence
 * @generated
 */
public class FarmerApplicationCurrentStageUtil {

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
	public static void clearCache(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage) {

		getPersistence().clearCache(farmerApplicationCurrentStage);
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
	public static Map<Serializable, FarmerApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerApplicationCurrentStage update(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage) {

		return getPersistence().update(farmerApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerApplicationCurrentStage update(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			farmerApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns all the farmer application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching farmer application current stages
	 */
	public static List<FarmerApplicationCurrentStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<FarmerApplicationCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<FarmerApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<FarmerApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage fetchByUuid_First(
		String uuid,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the farmer application current stages before and after the current farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param farmerCurrentStageId the primary key of the current farmer application current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	public static FarmerApplicationCurrentStage[] findByUuid_PrevAndNext(
			long farmerCurrentStageId, String uuid,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			farmerCurrentStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the farmer application current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of farmer application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching farmer application current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the farmer application current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFarmerApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the farmer application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the farmer application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the farmer application current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the farmer application current stage that was removed
	 */
	public static FarmerApplicationCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of farmer application current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching farmer application current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching farmer application current stages
	 */
	public static List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static FarmerApplicationCurrentStage[] findByUuid_C_PrevAndNext(
			long farmerCurrentStageId, String uuid, long companyId,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			farmerCurrentStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the farmer application current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching farmer application current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the farmer application current stage where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage findBygetfarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().findBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer application current stage where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage fetchBygetfarmerById(
		long farmerApplicationId) {

		return getPersistence().fetchBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer application current stage where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	public static FarmerApplicationCurrentStage fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetfarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer application current stage where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer application current stage that was removed
	 */
	public static FarmerApplicationCurrentStage removeBygetfarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().removeBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer application current stages where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer application current stages
	 */
	public static int countBygetfarmerById(long farmerApplicationId) {
		return getPersistence().countBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Caches the farmer application current stage in the entity cache if it is enabled.
	 *
	 * @param farmerApplicationCurrentStage the farmer application current stage
	 */
	public static void cacheResult(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage) {

		getPersistence().cacheResult(farmerApplicationCurrentStage);
	}

	/**
	 * Caches the farmer application current stages in the entity cache if it is enabled.
	 *
	 * @param farmerApplicationCurrentStages the farmer application current stages
	 */
	public static void cacheResult(
		List<FarmerApplicationCurrentStage> farmerApplicationCurrentStages) {

		getPersistence().cacheResult(farmerApplicationCurrentStages);
	}

	/**
	 * Creates a new farmer application current stage with the primary key. Does not add the farmer application current stage to the database.
	 *
	 * @param farmerCurrentStageId the primary key for the new farmer application current stage
	 * @return the new farmer application current stage
	 */
	public static FarmerApplicationCurrentStage create(
		long farmerCurrentStageId) {

		return getPersistence().create(farmerCurrentStageId);
	}

	/**
	 * Removes the farmer application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage that was removed
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	public static FarmerApplicationCurrentStage remove(
			long farmerCurrentStageId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().remove(farmerCurrentStageId);
	}

	public static FarmerApplicationCurrentStage updateImpl(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage) {

		return getPersistence().updateImpl(farmerApplicationCurrentStage);
	}

	/**
	 * Returns the farmer application current stage with the primary key or throws a <code>NoSuchFarmerApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	public static FarmerApplicationCurrentStage findByPrimaryKey(
			long farmerCurrentStageId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(farmerCurrentStageId);
	}

	/**
	 * Returns the farmer application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage, or <code>null</code> if a farmer application current stage with the primary key could not be found
	 */
	public static FarmerApplicationCurrentStage fetchByPrimaryKey(
		long farmerCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(farmerCurrentStageId);
	}

	/**
	 * Returns all the farmer application current stages.
	 *
	 * @return the farmer application current stages
	 */
	public static List<FarmerApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<FarmerApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

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
	public static List<FarmerApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<FarmerApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer application current stages.
	 *
	 * @return the number of farmer application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerApplicationCurrentStagePersistence
		_persistence;

}