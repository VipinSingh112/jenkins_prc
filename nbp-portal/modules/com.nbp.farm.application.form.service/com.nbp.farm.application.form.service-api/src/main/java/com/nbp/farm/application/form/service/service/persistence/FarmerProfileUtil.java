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

import com.nbp.farm.application.form.service.model.FarmerProfile;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer profile service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerProfilePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerProfilePersistence
 * @generated
 */
public class FarmerProfileUtil {

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
	public static void clearCache(FarmerProfile farmerProfile) {
		getPersistence().clearCache(farmerProfile);
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
	public static Map<Serializable, FarmerProfile> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerProfile> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerProfile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerProfile> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerProfile> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerProfile update(FarmerProfile farmerProfile) {
		return getPersistence().update(farmerProfile);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerProfile update(
		FarmerProfile farmerProfile, ServiceContext serviceContext) {

		return getPersistence().update(farmerProfile, serviceContext);
	}

	/**
	 * Returns the farmer profile where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerProfileException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer profile
	 * @throws NoSuchFarmerProfileException if a matching farmer profile could not be found
	 */
	public static FarmerProfile findBygetfarmerById(long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerProfileException {

		return getPersistence().findBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer profile where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	public static FarmerProfile fetchBygetfarmerById(long farmerApplicationId) {
		return getPersistence().fetchBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer profile where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	public static FarmerProfile fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetfarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer profile where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer profile that was removed
	 */
	public static FarmerProfile removeBygetfarmerById(long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerProfileException {

		return getPersistence().removeBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer profiles where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer profiles
	 */
	public static int countBygetfarmerById(long farmerApplicationId) {
		return getPersistence().countBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer profiles
	 */
	public static List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId) {

		return getPersistence().findBygetFA_FP_FAI(farmerApplicationId);
	}

	/**
	 * Returns a range of all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @return the range of matching farmer profiles
	 */
	public static List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId, int start, int end) {

		return getPersistence().findBygetFA_FP_FAI(
			farmerApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer profiles
	 */
	public static List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerProfile> orderByComparator) {

		return getPersistence().findBygetFA_FP_FAI(
			farmerApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer profiles
	 */
	public static List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerProfile> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFA_FP_FAI(
			farmerApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer profile
	 * @throws NoSuchFarmerProfileException if a matching farmer profile could not be found
	 */
	public static FarmerProfile findBygetFA_FP_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerProfile> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerProfileException {

		return getPersistence().findBygetFA_FP_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	public static FarmerProfile fetchBygetFA_FP_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerProfile> orderByComparator) {

		return getPersistence().fetchBygetFA_FP_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer profile
	 * @throws NoSuchFarmerProfileException if a matching farmer profile could not be found
	 */
	public static FarmerProfile findBygetFA_FP_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerProfile> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerProfileException {

		return getPersistence().findBygetFA_FP_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	public static FarmerProfile fetchBygetFA_FP_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerProfile> orderByComparator) {

		return getPersistence().fetchBygetFA_FP_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the farmer profiles before and after the current farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerProfileId the primary key of the current farmer profile
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer profile
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	public static FarmerProfile[] findBygetFA_FP_FAI_PrevAndNext(
			long farmerProfileId, long farmerApplicationId,
			OrderByComparator<FarmerProfile> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerProfileException {

		return getPersistence().findBygetFA_FP_FAI_PrevAndNext(
			farmerProfileId, farmerApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farmer profiles where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public static void removeBygetFA_FP_FAI(long farmerApplicationId) {
		getPersistence().removeBygetFA_FP_FAI(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer profiles where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer profiles
	 */
	public static int countBygetFA_FP_FAI(long farmerApplicationId) {
		return getPersistence().countBygetFA_FP_FAI(farmerApplicationId);
	}

	/**
	 * Caches the farmer profile in the entity cache if it is enabled.
	 *
	 * @param farmerProfile the farmer profile
	 */
	public static void cacheResult(FarmerProfile farmerProfile) {
		getPersistence().cacheResult(farmerProfile);
	}

	/**
	 * Caches the farmer profiles in the entity cache if it is enabled.
	 *
	 * @param farmerProfiles the farmer profiles
	 */
	public static void cacheResult(List<FarmerProfile> farmerProfiles) {
		getPersistence().cacheResult(farmerProfiles);
	}

	/**
	 * Creates a new farmer profile with the primary key. Does not add the farmer profile to the database.
	 *
	 * @param farmerProfileId the primary key for the new farmer profile
	 * @return the new farmer profile
	 */
	public static FarmerProfile create(long farmerProfileId) {
		return getPersistence().create(farmerProfileId);
	}

	/**
	 * Removes the farmer profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile that was removed
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	public static FarmerProfile remove(long farmerProfileId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerProfileException {

		return getPersistence().remove(farmerProfileId);
	}

	public static FarmerProfile updateImpl(FarmerProfile farmerProfile) {
		return getPersistence().updateImpl(farmerProfile);
	}

	/**
	 * Returns the farmer profile with the primary key or throws a <code>NoSuchFarmerProfileException</code> if it could not be found.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	public static FarmerProfile findByPrimaryKey(long farmerProfileId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerProfileException {

		return getPersistence().findByPrimaryKey(farmerProfileId);
	}

	/**
	 * Returns the farmer profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile, or <code>null</code> if a farmer profile with the primary key could not be found
	 */
	public static FarmerProfile fetchByPrimaryKey(long farmerProfileId) {
		return getPersistence().fetchByPrimaryKey(farmerProfileId);
	}

	/**
	 * Returns all the farmer profiles.
	 *
	 * @return the farmer profiles
	 */
	public static List<FarmerProfile> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @return the range of farmer profiles
	 */
	public static List<FarmerProfile> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer profiles
	 */
	public static List<FarmerProfile> findAll(
		int start, int end,
		OrderByComparator<FarmerProfile> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer profiles
	 */
	public static List<FarmerProfile> findAll(
		int start, int end, OrderByComparator<FarmerProfile> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer profiles from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer profiles.
	 *
	 * @return the number of farmer profiles
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerProfilePersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerProfilePersistence _persistence;

}