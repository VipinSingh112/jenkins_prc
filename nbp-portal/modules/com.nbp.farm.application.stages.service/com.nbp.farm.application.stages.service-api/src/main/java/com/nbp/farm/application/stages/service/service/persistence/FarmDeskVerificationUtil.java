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

import com.nbp.farm.application.stages.service.model.FarmDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farm desk verification service. This utility wraps <code>com.nbp.farm.application.stages.service.service.persistence.impl.FarmDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmDeskVerificationPersistence
 * @generated
 */
public class FarmDeskVerificationUtil {

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
	public static void clearCache(FarmDeskVerification farmDeskVerification) {
		getPersistence().clearCache(farmDeskVerification);
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
	public static Map<Serializable, FarmDeskVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmDeskVerification update(
		FarmDeskVerification farmDeskVerification) {

		return getPersistence().update(farmDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmDeskVerification update(
		FarmDeskVerification farmDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(farmDeskVerification, serviceContext);
	}

	/**
	 * Returns all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farm desk verifications
	 */
	public static List<FarmDeskVerification> findBygetDeskVerificationFarmById(
		long farmerApplicationId) {

		return getPersistence().findBygetDeskVerificationFarmById(
			farmerApplicationId);
	}

	/**
	 * Returns a range of all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @return the range of matching farm desk verifications
	 */
	public static List<FarmDeskVerification> findBygetDeskVerificationFarmById(
		long farmerApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationFarmById(
			farmerApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm desk verifications
	 */
	public static List<FarmDeskVerification> findBygetDeskVerificationFarmById(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationFarmById(
			farmerApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm desk verifications
	 */
	public static List<FarmDeskVerification> findBygetDeskVerificationFarmById(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationFarmById(
			farmerApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a matching farm desk verification could not be found
	 */
	public static FarmDeskVerification findBygetDeskVerificationFarmById_First(
			long farmerApplicationId,
			OrderByComparator<FarmDeskVerification> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmDeskVerificationException {

		return getPersistence().findBygetDeskVerificationFarmById_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm desk verification, or <code>null</code> if a matching farm desk verification could not be found
	 */
	public static FarmDeskVerification fetchBygetDeskVerificationFarmById_First(
		long farmerApplicationId,
		OrderByComparator<FarmDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationFarmById_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a matching farm desk verification could not be found
	 */
	public static FarmDeskVerification findBygetDeskVerificationFarmById_Last(
			long farmerApplicationId,
			OrderByComparator<FarmDeskVerification> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmDeskVerificationException {

		return getPersistence().findBygetDeskVerificationFarmById_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm desk verification, or <code>null</code> if a matching farm desk verification could not be found
	 */
	public static FarmDeskVerification fetchBygetDeskVerificationFarmById_Last(
		long farmerApplicationId,
		OrderByComparator<FarmDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationFarmById_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the farm desk verifications before and after the current farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmDeskVerificationId the primary key of the current farm desk verification
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	public static FarmDeskVerification[]
			findBygetDeskVerificationFarmById_PrevAndNext(
				long farmDeskVerificationId, long farmerApplicationId,
				OrderByComparator<FarmDeskVerification> orderByComparator)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmDeskVerificationException {

		return getPersistence().findBygetDeskVerificationFarmById_PrevAndNext(
			farmDeskVerificationId, farmerApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farm desk verifications where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public static void removeBygetDeskVerificationFarmById(
		long farmerApplicationId) {

		getPersistence().removeBygetDeskVerificationFarmById(
			farmerApplicationId);
	}

	/**
	 * Returns the number of farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farm desk verifications
	 */
	public static int countBygetDeskVerificationFarmById(
		long farmerApplicationId) {

		return getPersistence().countBygetDeskVerificationFarmById(
			farmerApplicationId);
	}

	/**
	 * Caches the farm desk verification in the entity cache if it is enabled.
	 *
	 * @param farmDeskVerification the farm desk verification
	 */
	public static void cacheResult(FarmDeskVerification farmDeskVerification) {
		getPersistence().cacheResult(farmDeskVerification);
	}

	/**
	 * Caches the farm desk verifications in the entity cache if it is enabled.
	 *
	 * @param farmDeskVerifications the farm desk verifications
	 */
	public static void cacheResult(
		List<FarmDeskVerification> farmDeskVerifications) {

		getPersistence().cacheResult(farmDeskVerifications);
	}

	/**
	 * Creates a new farm desk verification with the primary key. Does not add the farm desk verification to the database.
	 *
	 * @param farmDeskVerificationId the primary key for the new farm desk verification
	 * @return the new farm desk verification
	 */
	public static FarmDeskVerification create(long farmDeskVerificationId) {
		return getPersistence().create(farmDeskVerificationId);
	}

	/**
	 * Removes the farm desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification that was removed
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	public static FarmDeskVerification remove(long farmDeskVerificationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmDeskVerificationException {

		return getPersistence().remove(farmDeskVerificationId);
	}

	public static FarmDeskVerification updateImpl(
		FarmDeskVerification farmDeskVerification) {

		return getPersistence().updateImpl(farmDeskVerification);
	}

	/**
	 * Returns the farm desk verification with the primary key or throws a <code>NoSuchFarmDeskVerificationException</code> if it could not be found.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	public static FarmDeskVerification findByPrimaryKey(
			long farmDeskVerificationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmDeskVerificationException {

		return getPersistence().findByPrimaryKey(farmDeskVerificationId);
	}

	/**
	 * Returns the farm desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification, or <code>null</code> if a farm desk verification with the primary key could not be found
	 */
	public static FarmDeskVerification fetchByPrimaryKey(
		long farmDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(farmDeskVerificationId);
	}

	/**
	 * Returns all the farm desk verifications.
	 *
	 * @return the farm desk verifications
	 */
	public static List<FarmDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @return the range of farm desk verifications
	 */
	public static List<FarmDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm desk verifications
	 */
	public static List<FarmDeskVerification> findAll(
		int start, int end,
		OrderByComparator<FarmDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm desk verifications
	 */
	public static List<FarmDeskVerification> findAll(
		int start, int end,
		OrderByComparator<FarmDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farm desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farm desk verifications.
	 *
	 * @return the number of farm desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmDeskVerificationPersistence _persistence;

}