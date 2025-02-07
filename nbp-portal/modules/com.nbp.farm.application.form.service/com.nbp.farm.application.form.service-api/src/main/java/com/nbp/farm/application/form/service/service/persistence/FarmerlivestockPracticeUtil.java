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

import com.nbp.farm.application.form.service.model.FarmerlivestockPractice;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmerlivestock practice service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerlivestockPracticePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerlivestockPracticePersistence
 * @generated
 */
public class FarmerlivestockPracticeUtil {

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
		FarmerlivestockPractice farmerlivestockPractice) {

		getPersistence().clearCache(farmerlivestockPractice);
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
	public static Map<Serializable, FarmerlivestockPractice> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerlivestockPractice> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerlivestockPractice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerlivestockPractice> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerlivestockPractice> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerlivestockPractice update(
		FarmerlivestockPractice farmerlivestockPractice) {

		return getPersistence().update(farmerlivestockPractice);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerlivestockPractice update(
		FarmerlivestockPractice farmerlivestockPractice,
		ServiceContext serviceContext) {

		return getPersistence().update(farmerlivestockPractice, serviceContext);
	}

	/**
	 * Returns the farmerlivestock practice where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerlivestockPracticeException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a matching farmerlivestock practice could not be found
	 */
	public static FarmerlivestockPractice findBygetfarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerlivestockPracticeException {

		return getPersistence().findBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmerlivestock practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	public static FarmerlivestockPractice fetchBygetfarmerById(
		long farmerApplicationId) {

		return getPersistence().fetchBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmerlivestock practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	public static FarmerlivestockPractice fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetfarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmerlivestock practice where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmerlivestock practice that was removed
	 */
	public static FarmerlivestockPractice removeBygetfarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerlivestockPracticeException {

		return getPersistence().removeBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmerlivestock practices
	 */
	public static int countBygetfarmerById(long farmerApplicationId) {
		return getPersistence().countBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmerlivestock practices
	 */
	public static List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId) {

		return getPersistence().findBygetFA_FLSP_FAI(farmerApplicationId);
	}

	/**
	 * Returns a range of all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @return the range of matching farmerlivestock practices
	 */
	public static List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId, int start, int end) {

		return getPersistence().findBygetFA_FLSP_FAI(
			farmerApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmerlivestock practices
	 */
	public static List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerlivestockPractice> orderByComparator) {

		return getPersistence().findBygetFA_FLSP_FAI(
			farmerApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmerlivestock practices
	 */
	public static List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerlivestockPractice> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFA_FLSP_FAI(
			farmerApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a matching farmerlivestock practice could not be found
	 */
	public static FarmerlivestockPractice findBygetFA_FLSP_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerlivestockPractice> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerlivestockPracticeException {

		return getPersistence().findBygetFA_FLSP_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	public static FarmerlivestockPractice fetchBygetFA_FLSP_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerlivestockPractice> orderByComparator) {

		return getPersistence().fetchBygetFA_FLSP_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a matching farmerlivestock practice could not be found
	 */
	public static FarmerlivestockPractice findBygetFA_FLSP_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerlivestockPractice> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerlivestockPracticeException {

		return getPersistence().findBygetFA_FLSP_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	public static FarmerlivestockPractice fetchBygetFA_FLSP_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerlivestockPractice> orderByComparator) {

		return getPersistence().fetchBygetFA_FLSP_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the farmerlivestock practices before and after the current farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerLivestockPracticeId the primary key of the current farmerlivestock practice
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	public static FarmerlivestockPractice[] findBygetFA_FLSP_FAI_PrevAndNext(
			long farmerLivestockPracticeId, long farmerApplicationId,
			OrderByComparator<FarmerlivestockPractice> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerlivestockPracticeException {

		return getPersistence().findBygetFA_FLSP_FAI_PrevAndNext(
			farmerLivestockPracticeId, farmerApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farmerlivestock practices where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public static void removeBygetFA_FLSP_FAI(long farmerApplicationId) {
		getPersistence().removeBygetFA_FLSP_FAI(farmerApplicationId);
	}

	/**
	 * Returns the number of farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmerlivestock practices
	 */
	public static int countBygetFA_FLSP_FAI(long farmerApplicationId) {
		return getPersistence().countBygetFA_FLSP_FAI(farmerApplicationId);
	}

	/**
	 * Caches the farmerlivestock practice in the entity cache if it is enabled.
	 *
	 * @param farmerlivestockPractice the farmerlivestock practice
	 */
	public static void cacheResult(
		FarmerlivestockPractice farmerlivestockPractice) {

		getPersistence().cacheResult(farmerlivestockPractice);
	}

	/**
	 * Caches the farmerlivestock practices in the entity cache if it is enabled.
	 *
	 * @param farmerlivestockPractices the farmerlivestock practices
	 */
	public static void cacheResult(
		List<FarmerlivestockPractice> farmerlivestockPractices) {

		getPersistence().cacheResult(farmerlivestockPractices);
	}

	/**
	 * Creates a new farmerlivestock practice with the primary key. Does not add the farmerlivestock practice to the database.
	 *
	 * @param farmerLivestockPracticeId the primary key for the new farmerlivestock practice
	 * @return the new farmerlivestock practice
	 */
	public static FarmerlivestockPractice create(
		long farmerLivestockPracticeId) {

		return getPersistence().create(farmerLivestockPracticeId);
	}

	/**
	 * Removes the farmerlivestock practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice that was removed
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	public static FarmerlivestockPractice remove(long farmerLivestockPracticeId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerlivestockPracticeException {

		return getPersistence().remove(farmerLivestockPracticeId);
	}

	public static FarmerlivestockPractice updateImpl(
		FarmerlivestockPractice farmerlivestockPractice) {

		return getPersistence().updateImpl(farmerlivestockPractice);
	}

	/**
	 * Returns the farmerlivestock practice with the primary key or throws a <code>NoSuchFarmerlivestockPracticeException</code> if it could not be found.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	public static FarmerlivestockPractice findByPrimaryKey(
			long farmerLivestockPracticeId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerlivestockPracticeException {

		return getPersistence().findByPrimaryKey(farmerLivestockPracticeId);
	}

	/**
	 * Returns the farmerlivestock practice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice, or <code>null</code> if a farmerlivestock practice with the primary key could not be found
	 */
	public static FarmerlivestockPractice fetchByPrimaryKey(
		long farmerLivestockPracticeId) {

		return getPersistence().fetchByPrimaryKey(farmerLivestockPracticeId);
	}

	/**
	 * Returns all the farmerlivestock practices.
	 *
	 * @return the farmerlivestock practices
	 */
	public static List<FarmerlivestockPractice> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @return the range of farmerlivestock practices
	 */
	public static List<FarmerlivestockPractice> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmerlivestock practices
	 */
	public static List<FarmerlivestockPractice> findAll(
		int start, int end,
		OrderByComparator<FarmerlivestockPractice> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmerlivestock practices
	 */
	public static List<FarmerlivestockPractice> findAll(
		int start, int end,
		OrderByComparator<FarmerlivestockPractice> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmerlivestock practices from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmerlivestock practices.
	 *
	 * @return the number of farmerlivestock practices
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerlivestockPracticePersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerlivestockPracticePersistence _persistence;

}