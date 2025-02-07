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

import com.nbp.farm.application.form.service.model.FarmerProperty;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer property service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerPropertyPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerPropertyPersistence
 * @generated
 */
public class FarmerPropertyUtil {

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
	public static void clearCache(FarmerProperty farmerProperty) {
		getPersistence().clearCache(farmerProperty);
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
	public static Map<Serializable, FarmerProperty> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerProperty> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerProperty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerProperty> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerProperty> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerProperty update(FarmerProperty farmerProperty) {
		return getPersistence().update(farmerProperty);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerProperty update(
		FarmerProperty farmerProperty, ServiceContext serviceContext) {

		return getPersistence().update(farmerProperty, serviceContext);
	}

	/**
	 * Returns the farmer property where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerPropertyException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer property
	 * @throws NoSuchFarmerPropertyException if a matching farmer property could not be found
	 */
	public static FarmerProperty findBygetfarmerById(long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerPropertyException {

		return getPersistence().findBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer property where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	public static FarmerProperty fetchBygetfarmerById(
		long farmerApplicationId) {

		return getPersistence().fetchBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer property where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	public static FarmerProperty fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetfarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer property where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer property that was removed
	 */
	public static FarmerProperty removeBygetfarmerById(long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerPropertyException {

		return getPersistence().removeBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer properties where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer properties
	 */
	public static int countBygetfarmerById(long farmerApplicationId) {
		return getPersistence().countBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer properties
	 */
	public static List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId) {

		return getPersistence().findBygetFA_FPR_FAI(farmerApplicationId);
	}

	/**
	 * Returns a range of all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @return the range of matching farmer properties
	 */
	public static List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId, int start, int end) {

		return getPersistence().findBygetFA_FPR_FAI(
			farmerApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer properties
	 */
	public static List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerProperty> orderByComparator) {

		return getPersistence().findBygetFA_FPR_FAI(
			farmerApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer properties
	 */
	public static List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerProperty> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFA_FPR_FAI(
			farmerApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer property
	 * @throws NoSuchFarmerPropertyException if a matching farmer property could not be found
	 */
	public static FarmerProperty findBygetFA_FPR_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerProperty> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerPropertyException {

		return getPersistence().findBygetFA_FPR_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	public static FarmerProperty fetchBygetFA_FPR_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerProperty> orderByComparator) {

		return getPersistence().fetchBygetFA_FPR_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer property
	 * @throws NoSuchFarmerPropertyException if a matching farmer property could not be found
	 */
	public static FarmerProperty findBygetFA_FPR_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerProperty> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerPropertyException {

		return getPersistence().findBygetFA_FPR_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	public static FarmerProperty fetchBygetFA_FPR_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerProperty> orderByComparator) {

		return getPersistence().fetchBygetFA_FPR_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the farmer properties before and after the current farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerPropertyId the primary key of the current farmer property
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer property
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	public static FarmerProperty[] findBygetFA_FPR_FAI_PrevAndNext(
			long farmerPropertyId, long farmerApplicationId,
			OrderByComparator<FarmerProperty> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerPropertyException {

		return getPersistence().findBygetFA_FPR_FAI_PrevAndNext(
			farmerPropertyId, farmerApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farmer properties where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public static void removeBygetFA_FPR_FAI(long farmerApplicationId) {
		getPersistence().removeBygetFA_FPR_FAI(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer properties where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer properties
	 */
	public static int countBygetFA_FPR_FAI(long farmerApplicationId) {
		return getPersistence().countBygetFA_FPR_FAI(farmerApplicationId);
	}

	/**
	 * Caches the farmer property in the entity cache if it is enabled.
	 *
	 * @param farmerProperty the farmer property
	 */
	public static void cacheResult(FarmerProperty farmerProperty) {
		getPersistence().cacheResult(farmerProperty);
	}

	/**
	 * Caches the farmer properties in the entity cache if it is enabled.
	 *
	 * @param farmerProperties the farmer properties
	 */
	public static void cacheResult(List<FarmerProperty> farmerProperties) {
		getPersistence().cacheResult(farmerProperties);
	}

	/**
	 * Creates a new farmer property with the primary key. Does not add the farmer property to the database.
	 *
	 * @param farmerPropertyId the primary key for the new farmer property
	 * @return the new farmer property
	 */
	public static FarmerProperty create(long farmerPropertyId) {
		return getPersistence().create(farmerPropertyId);
	}

	/**
	 * Removes the farmer property with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property that was removed
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	public static FarmerProperty remove(long farmerPropertyId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerPropertyException {

		return getPersistence().remove(farmerPropertyId);
	}

	public static FarmerProperty updateImpl(FarmerProperty farmerProperty) {
		return getPersistence().updateImpl(farmerProperty);
	}

	/**
	 * Returns the farmer property with the primary key or throws a <code>NoSuchFarmerPropertyException</code> if it could not be found.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	public static FarmerProperty findByPrimaryKey(long farmerPropertyId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerPropertyException {

		return getPersistence().findByPrimaryKey(farmerPropertyId);
	}

	/**
	 * Returns the farmer property with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property, or <code>null</code> if a farmer property with the primary key could not be found
	 */
	public static FarmerProperty fetchByPrimaryKey(long farmerPropertyId) {
		return getPersistence().fetchByPrimaryKey(farmerPropertyId);
	}

	/**
	 * Returns all the farmer properties.
	 *
	 * @return the farmer properties
	 */
	public static List<FarmerProperty> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @return the range of farmer properties
	 */
	public static List<FarmerProperty> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer properties
	 */
	public static List<FarmerProperty> findAll(
		int start, int end,
		OrderByComparator<FarmerProperty> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer properties
	 */
	public static List<FarmerProperty> findAll(
		int start, int end, OrderByComparator<FarmerProperty> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer properties from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer properties.
	 *
	 * @return the number of farmer properties
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerPropertyPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerPropertyPersistence _persistence;

}