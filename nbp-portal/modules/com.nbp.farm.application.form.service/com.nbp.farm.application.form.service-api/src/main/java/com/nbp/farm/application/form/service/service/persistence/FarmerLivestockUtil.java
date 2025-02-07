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

import com.nbp.farm.application.form.service.model.FarmerLivestock;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer livestock service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerLivestockPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerLivestockPersistence
 * @generated
 */
public class FarmerLivestockUtil {

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
	public static void clearCache(FarmerLivestock farmerLivestock) {
		getPersistence().clearCache(farmerLivestock);
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
	public static Map<Serializable, FarmerLivestock> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerLivestock> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerLivestock> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerLivestock> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerLivestock> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerLivestock update(FarmerLivestock farmerLivestock) {
		return getPersistence().update(farmerLivestock);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerLivestock update(
		FarmerLivestock farmerLivestock, ServiceContext serviceContext) {

		return getPersistence().update(farmerLivestock, serviceContext);
	}

	/**
	 * Returns the farmer livestock where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerLivestockException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer livestock
	 * @throws NoSuchFarmerLivestockException if a matching farmer livestock could not be found
	 */
	public static FarmerLivestock findBygetfarmerById(long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerLivestockException {

		return getPersistence().findBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer livestock where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	public static FarmerLivestock fetchBygetfarmerById(
		long farmerApplicationId) {

		return getPersistence().fetchBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer livestock where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	public static FarmerLivestock fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetfarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer livestock where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer livestock that was removed
	 */
	public static FarmerLivestock removeBygetfarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerLivestockException {

		return getPersistence().removeBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer livestocks
	 */
	public static int countBygetfarmerById(long farmerApplicationId) {
		return getPersistence().countBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer livestocks
	 */
	public static List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId) {

		return getPersistence().findBygetFA_FLS_FAI(farmerApplicationId);
	}

	/**
	 * Returns a range of all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @return the range of matching farmer livestocks
	 */
	public static List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId, int start, int end) {

		return getPersistence().findBygetFA_FLS_FAI(
			farmerApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer livestocks
	 */
	public static List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerLivestock> orderByComparator) {

		return getPersistence().findBygetFA_FLS_FAI(
			farmerApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer livestocks
	 */
	public static List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerLivestock> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFA_FLS_FAI(
			farmerApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer livestock
	 * @throws NoSuchFarmerLivestockException if a matching farmer livestock could not be found
	 */
	public static FarmerLivestock findBygetFA_FLS_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerLivestock> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerLivestockException {

		return getPersistence().findBygetFA_FLS_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	public static FarmerLivestock fetchBygetFA_FLS_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerLivestock> orderByComparator) {

		return getPersistence().fetchBygetFA_FLS_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer livestock
	 * @throws NoSuchFarmerLivestockException if a matching farmer livestock could not be found
	 */
	public static FarmerLivestock findBygetFA_FLS_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerLivestock> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerLivestockException {

		return getPersistence().findBygetFA_FLS_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	public static FarmerLivestock fetchBygetFA_FLS_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerLivestock> orderByComparator) {

		return getPersistence().fetchBygetFA_FLS_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the farmer livestocks before and after the current farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerLiveStockId the primary key of the current farmer livestock
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer livestock
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	public static FarmerLivestock[] findBygetFA_FLS_FAI_PrevAndNext(
			long farmerLiveStockId, long farmerApplicationId,
			OrderByComparator<FarmerLivestock> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerLivestockException {

		return getPersistence().findBygetFA_FLS_FAI_PrevAndNext(
			farmerLiveStockId, farmerApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farmer livestocks where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public static void removeBygetFA_FLS_FAI(long farmerApplicationId) {
		getPersistence().removeBygetFA_FLS_FAI(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer livestocks
	 */
	public static int countBygetFA_FLS_FAI(long farmerApplicationId) {
		return getPersistence().countBygetFA_FLS_FAI(farmerApplicationId);
	}

	/**
	 * Caches the farmer livestock in the entity cache if it is enabled.
	 *
	 * @param farmerLivestock the farmer livestock
	 */
	public static void cacheResult(FarmerLivestock farmerLivestock) {
		getPersistence().cacheResult(farmerLivestock);
	}

	/**
	 * Caches the farmer livestocks in the entity cache if it is enabled.
	 *
	 * @param farmerLivestocks the farmer livestocks
	 */
	public static void cacheResult(List<FarmerLivestock> farmerLivestocks) {
		getPersistence().cacheResult(farmerLivestocks);
	}

	/**
	 * Creates a new farmer livestock with the primary key. Does not add the farmer livestock to the database.
	 *
	 * @param farmerLiveStockId the primary key for the new farmer livestock
	 * @return the new farmer livestock
	 */
	public static FarmerLivestock create(long farmerLiveStockId) {
		return getPersistence().create(farmerLiveStockId);
	}

	/**
	 * Removes the farmer livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock that was removed
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	public static FarmerLivestock remove(long farmerLiveStockId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerLivestockException {

		return getPersistence().remove(farmerLiveStockId);
	}

	public static FarmerLivestock updateImpl(FarmerLivestock farmerLivestock) {
		return getPersistence().updateImpl(farmerLivestock);
	}

	/**
	 * Returns the farmer livestock with the primary key or throws a <code>NoSuchFarmerLivestockException</code> if it could not be found.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	public static FarmerLivestock findByPrimaryKey(long farmerLiveStockId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerLivestockException {

		return getPersistence().findByPrimaryKey(farmerLiveStockId);
	}

	/**
	 * Returns the farmer livestock with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock, or <code>null</code> if a farmer livestock with the primary key could not be found
	 */
	public static FarmerLivestock fetchByPrimaryKey(long farmerLiveStockId) {
		return getPersistence().fetchByPrimaryKey(farmerLiveStockId);
	}

	/**
	 * Returns all the farmer livestocks.
	 *
	 * @return the farmer livestocks
	 */
	public static List<FarmerLivestock> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @return the range of farmer livestocks
	 */
	public static List<FarmerLivestock> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer livestocks
	 */
	public static List<FarmerLivestock> findAll(
		int start, int end,
		OrderByComparator<FarmerLivestock> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer livestocks
	 */
	public static List<FarmerLivestock> findAll(
		int start, int end,
		OrderByComparator<FarmerLivestock> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer livestocks from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer livestocks.
	 *
	 * @return the number of farmer livestocks
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerLivestockPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerLivestockPersistence _persistence;

}