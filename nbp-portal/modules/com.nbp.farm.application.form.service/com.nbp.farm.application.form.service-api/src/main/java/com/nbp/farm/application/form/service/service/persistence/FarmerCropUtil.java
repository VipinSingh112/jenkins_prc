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

import com.nbp.farm.application.form.service.model.FarmerCrop;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer crop service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerCropPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropPersistence
 * @generated
 */
public class FarmerCropUtil {

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
	public static void clearCache(FarmerCrop farmerCrop) {
		getPersistence().clearCache(farmerCrop);
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
	public static Map<Serializable, FarmerCrop> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerCrop> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerCrop> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerCrop> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerCrop> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerCrop update(FarmerCrop farmerCrop) {
		return getPersistence().update(farmerCrop);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerCrop update(
		FarmerCrop farmerCrop, ServiceContext serviceContext) {

		return getPersistence().update(farmerCrop, serviceContext);
	}

	/**
	 * Returns the farmer crop where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerCropException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop
	 * @throws NoSuchFarmerCropException if a matching farmer crop could not be found
	 */
	public static FarmerCrop findBygetfarmerById(long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropException {

		return getPersistence().findBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer crop where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	public static FarmerCrop fetchBygetfarmerById(long farmerApplicationId) {
		return getPersistence().fetchBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer crop where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	public static FarmerCrop fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetfarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer crop where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer crop that was removed
	 */
	public static FarmerCrop removeBygetfarmerById(long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropException {

		return getPersistence().removeBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer crops where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crops
	 */
	public static int countBygetfarmerById(long farmerApplicationId) {
		return getPersistence().countBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crops
	 */
	public static List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId) {

		return getPersistence().findBygetFA_FC_FAI(farmerApplicationId);
	}

	/**
	 * Returns a range of all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @return the range of matching farmer crops
	 */
	public static List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId, int start, int end) {

		return getPersistence().findBygetFA_FC_FAI(
			farmerApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer crops
	 */
	public static List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerCrop> orderByComparator) {

		return getPersistence().findBygetFA_FC_FAI(
			farmerApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer crops
	 */
	public static List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerCrop> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFA_FC_FAI(
			farmerApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop
	 * @throws NoSuchFarmerCropException if a matching farmer crop could not be found
	 */
	public static FarmerCrop findBygetFA_FC_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerCrop> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropException {

		return getPersistence().findBygetFA_FC_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	public static FarmerCrop fetchBygetFA_FC_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerCrop> orderByComparator) {

		return getPersistence().fetchBygetFA_FC_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop
	 * @throws NoSuchFarmerCropException if a matching farmer crop could not be found
	 */
	public static FarmerCrop findBygetFA_FC_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerCrop> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropException {

		return getPersistence().findBygetFA_FC_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	public static FarmerCrop fetchBygetFA_FC_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerCrop> orderByComparator) {

		return getPersistence().fetchBygetFA_FC_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the farmer crops before and after the current farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerCropId the primary key of the current farmer crop
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer crop
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	public static FarmerCrop[] findBygetFA_FC_FAI_PrevAndNext(
			long farmerCropId, long farmerApplicationId,
			OrderByComparator<FarmerCrop> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropException {

		return getPersistence().findBygetFA_FC_FAI_PrevAndNext(
			farmerCropId, farmerApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farmer crops where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public static void removeBygetFA_FC_FAI(long farmerApplicationId) {
		getPersistence().removeBygetFA_FC_FAI(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer crops where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crops
	 */
	public static int countBygetFA_FC_FAI(long farmerApplicationId) {
		return getPersistence().countBygetFA_FC_FAI(farmerApplicationId);
	}

	/**
	 * Caches the farmer crop in the entity cache if it is enabled.
	 *
	 * @param farmerCrop the farmer crop
	 */
	public static void cacheResult(FarmerCrop farmerCrop) {
		getPersistence().cacheResult(farmerCrop);
	}

	/**
	 * Caches the farmer crops in the entity cache if it is enabled.
	 *
	 * @param farmerCrops the farmer crops
	 */
	public static void cacheResult(List<FarmerCrop> farmerCrops) {
		getPersistence().cacheResult(farmerCrops);
	}

	/**
	 * Creates a new farmer crop with the primary key. Does not add the farmer crop to the database.
	 *
	 * @param farmerCropId the primary key for the new farmer crop
	 * @return the new farmer crop
	 */
	public static FarmerCrop create(long farmerCropId) {
		return getPersistence().create(farmerCropId);
	}

	/**
	 * Removes the farmer crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop that was removed
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	public static FarmerCrop remove(long farmerCropId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropException {

		return getPersistence().remove(farmerCropId);
	}

	public static FarmerCrop updateImpl(FarmerCrop farmerCrop) {
		return getPersistence().updateImpl(farmerCrop);
	}

	/**
	 * Returns the farmer crop with the primary key or throws a <code>NoSuchFarmerCropException</code> if it could not be found.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	public static FarmerCrop findByPrimaryKey(long farmerCropId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropException {

		return getPersistence().findByPrimaryKey(farmerCropId);
	}

	/**
	 * Returns the farmer crop with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop, or <code>null</code> if a farmer crop with the primary key could not be found
	 */
	public static FarmerCrop fetchByPrimaryKey(long farmerCropId) {
		return getPersistence().fetchByPrimaryKey(farmerCropId);
	}

	/**
	 * Returns all the farmer crops.
	 *
	 * @return the farmer crops
	 */
	public static List<FarmerCrop> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @return the range of farmer crops
	 */
	public static List<FarmerCrop> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer crops
	 */
	public static List<FarmerCrop> findAll(
		int start, int end, OrderByComparator<FarmerCrop> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer crops
	 */
	public static List<FarmerCrop> findAll(
		int start, int end, OrderByComparator<FarmerCrop> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer crops from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer crops.
	 *
	 * @return the number of farmer crops
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerCropPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerCropPersistence _persistence;

}