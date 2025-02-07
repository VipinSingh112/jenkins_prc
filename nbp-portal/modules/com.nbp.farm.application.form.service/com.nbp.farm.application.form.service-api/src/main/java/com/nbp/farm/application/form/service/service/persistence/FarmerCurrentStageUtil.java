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

import com.nbp.farm.application.form.service.model.FarmerCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer current stage service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCurrentStagePersistence
 * @generated
 */
public class FarmerCurrentStageUtil {

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
	public static void clearCache(FarmerCurrentStage farmerCurrentStage) {
		getPersistence().clearCache(farmerCurrentStage);
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
	public static Map<Serializable, FarmerCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerCurrentStage update(
		FarmerCurrentStage farmerCurrentStage) {

		return getPersistence().update(farmerCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerCurrentStage update(
		FarmerCurrentStage farmerCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(farmerCurrentStage, serviceContext);
	}

	/**
	 * Caches the farmer current stage in the entity cache if it is enabled.
	 *
	 * @param farmerCurrentStage the farmer current stage
	 */
	public static void cacheResult(FarmerCurrentStage farmerCurrentStage) {
		getPersistence().cacheResult(farmerCurrentStage);
	}

	/**
	 * Caches the farmer current stages in the entity cache if it is enabled.
	 *
	 * @param farmerCurrentStages the farmer current stages
	 */
	public static void cacheResult(
		List<FarmerCurrentStage> farmerCurrentStages) {

		getPersistence().cacheResult(farmerCurrentStages);
	}

	/**
	 * Creates a new farmer current stage with the primary key. Does not add the farmer current stage to the database.
	 *
	 * @param farmerCurrentStageId the primary key for the new farmer current stage
	 * @return the new farmer current stage
	 */
	public static FarmerCurrentStage create(long farmerCurrentStageId) {
		return getPersistence().create(farmerCurrentStageId);
	}

	/**
	 * Removes the farmer current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage that was removed
	 * @throws NoSuchFarmerCurrentStageException if a farmer current stage with the primary key could not be found
	 */
	public static FarmerCurrentStage remove(long farmerCurrentStageId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCurrentStageException {

		return getPersistence().remove(farmerCurrentStageId);
	}

	public static FarmerCurrentStage updateImpl(
		FarmerCurrentStage farmerCurrentStage) {

		return getPersistence().updateImpl(farmerCurrentStage);
	}

	/**
	 * Returns the farmer current stage with the primary key or throws a <code>NoSuchFarmerCurrentStageException</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage
	 * @throws NoSuchFarmerCurrentStageException if a farmer current stage with the primary key could not be found
	 */
	public static FarmerCurrentStage findByPrimaryKey(long farmerCurrentStageId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerCurrentStageException {

		return getPersistence().findByPrimaryKey(farmerCurrentStageId);
	}

	/**
	 * Returns the farmer current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer current stage
	 * @return the farmer current stage, or <code>null</code> if a farmer current stage with the primary key could not be found
	 */
	public static FarmerCurrentStage fetchByPrimaryKey(
		long farmerCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(farmerCurrentStageId);
	}

	/**
	 * Returns all the farmer current stages.
	 *
	 * @return the farmer current stages
	 */
	public static List<FarmerCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @return the range of farmer current stages
	 */
	public static List<FarmerCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer current stages
	 */
	public static List<FarmerCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FarmerCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer current stages
	 * @param end the upper bound of the range of farmer current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer current stages
	 */
	public static List<FarmerCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FarmerCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer current stages.
	 *
	 * @return the number of farmer current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerCurrentStagePersistence _persistence;

}