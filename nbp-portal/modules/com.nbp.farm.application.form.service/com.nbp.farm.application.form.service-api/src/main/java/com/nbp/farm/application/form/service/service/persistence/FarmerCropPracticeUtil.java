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

import com.nbp.farm.application.form.service.model.FarmerCropPractice;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer crop practice service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerCropPracticePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropPracticePersistence
 * @generated
 */
public class FarmerCropPracticeUtil {

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
	public static void clearCache(FarmerCropPractice farmerCropPractice) {
		getPersistence().clearCache(farmerCropPractice);
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
	public static Map<Serializable, FarmerCropPractice> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerCropPractice> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerCropPractice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerCropPractice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerCropPractice> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerCropPractice update(
		FarmerCropPractice farmerCropPractice) {

		return getPersistence().update(farmerCropPractice);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerCropPractice update(
		FarmerCropPractice farmerCropPractice, ServiceContext serviceContext) {

		return getPersistence().update(farmerCropPractice, serviceContext);
	}

	/**
	 * Returns the farmer crop practice where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerCropPracticeException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a matching farmer crop practice could not be found
	 */
	public static FarmerCropPractice findBygetfarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropPracticeException {

		return getPersistence().findBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer crop practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	public static FarmerCropPractice fetchBygetfarmerById(
		long farmerApplicationId) {

		return getPersistence().fetchBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer crop practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	public static FarmerCropPractice fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetfarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer crop practice where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer crop practice that was removed
	 */
	public static FarmerCropPractice removeBygetfarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropPracticeException {

		return getPersistence().removeBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crop practices
	 */
	public static int countBygetfarmerById(long farmerApplicationId) {
		return getPersistence().countBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop practices
	 */
	public static List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId) {

		return getPersistence().findBygetFA_FCP_FAI(farmerApplicationId);
	}

	/**
	 * Returns a range of all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @return the range of matching farmer crop practices
	 */
	public static List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId, int start, int end) {

		return getPersistence().findBygetFA_FCP_FAI(
			farmerApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer crop practices
	 */
	public static List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerCropPractice> orderByComparator) {

		return getPersistence().findBygetFA_FCP_FAI(
			farmerApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer crop practices
	 */
	public static List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerCropPractice> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFA_FCP_FAI(
			farmerApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a matching farmer crop practice could not be found
	 */
	public static FarmerCropPractice findBygetFA_FCP_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerCropPractice> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropPracticeException {

		return getPersistence().findBygetFA_FCP_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	public static FarmerCropPractice fetchBygetFA_FCP_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerCropPractice> orderByComparator) {

		return getPersistence().fetchBygetFA_FCP_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a matching farmer crop practice could not be found
	 */
	public static FarmerCropPractice findBygetFA_FCP_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerCropPractice> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropPracticeException {

		return getPersistence().findBygetFA_FCP_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	public static FarmerCropPractice fetchBygetFA_FCP_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerCropPractice> orderByComparator) {

		return getPersistence().fetchBygetFA_FCP_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the farmer crop practices before and after the current farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerCropPracticeId the primary key of the current farmer crop practice
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	public static FarmerCropPractice[] findBygetFA_FCP_FAI_PrevAndNext(
			long farmerCropPracticeId, long farmerApplicationId,
			OrderByComparator<FarmerCropPractice> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropPracticeException {

		return getPersistence().findBygetFA_FCP_FAI_PrevAndNext(
			farmerCropPracticeId, farmerApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farmer crop practices where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public static void removeBygetFA_FCP_FAI(long farmerApplicationId) {
		getPersistence().removeBygetFA_FCP_FAI(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crop practices
	 */
	public static int countBygetFA_FCP_FAI(long farmerApplicationId) {
		return getPersistence().countBygetFA_FCP_FAI(farmerApplicationId);
	}

	/**
	 * Caches the farmer crop practice in the entity cache if it is enabled.
	 *
	 * @param farmerCropPractice the farmer crop practice
	 */
	public static void cacheResult(FarmerCropPractice farmerCropPractice) {
		getPersistence().cacheResult(farmerCropPractice);
	}

	/**
	 * Caches the farmer crop practices in the entity cache if it is enabled.
	 *
	 * @param farmerCropPractices the farmer crop practices
	 */
	public static void cacheResult(
		List<FarmerCropPractice> farmerCropPractices) {

		getPersistence().cacheResult(farmerCropPractices);
	}

	/**
	 * Creates a new farmer crop practice with the primary key. Does not add the farmer crop practice to the database.
	 *
	 * @param farmerCropPracticeId the primary key for the new farmer crop practice
	 * @return the new farmer crop practice
	 */
	public static FarmerCropPractice create(long farmerCropPracticeId) {
		return getPersistence().create(farmerCropPracticeId);
	}

	/**
	 * Removes the farmer crop practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice that was removed
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	public static FarmerCropPractice remove(long farmerCropPracticeId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropPracticeException {

		return getPersistence().remove(farmerCropPracticeId);
	}

	public static FarmerCropPractice updateImpl(
		FarmerCropPractice farmerCropPractice) {

		return getPersistence().updateImpl(farmerCropPractice);
	}

	/**
	 * Returns the farmer crop practice with the primary key or throws a <code>NoSuchFarmerCropPracticeException</code> if it could not be found.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	public static FarmerCropPractice findByPrimaryKey(long farmerCropPracticeId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCropPracticeException {

		return getPersistence().findByPrimaryKey(farmerCropPracticeId);
	}

	/**
	 * Returns the farmer crop practice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice, or <code>null</code> if a farmer crop practice with the primary key could not be found
	 */
	public static FarmerCropPractice fetchByPrimaryKey(
		long farmerCropPracticeId) {

		return getPersistence().fetchByPrimaryKey(farmerCropPracticeId);
	}

	/**
	 * Returns all the farmer crop practices.
	 *
	 * @return the farmer crop practices
	 */
	public static List<FarmerCropPractice> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @return the range of farmer crop practices
	 */
	public static List<FarmerCropPractice> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer crop practices
	 */
	public static List<FarmerCropPractice> findAll(
		int start, int end,
		OrderByComparator<FarmerCropPractice> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer crop practices
	 */
	public static List<FarmerCropPractice> findAll(
		int start, int end,
		OrderByComparator<FarmerCropPractice> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer crop practices from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer crop practices.
	 *
	 * @return the number of farmer crop practices
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerCropPracticePersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerCropPracticePersistence _persistence;

}