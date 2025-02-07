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

import com.nbp.farm.application.stages.service.model.FarmPermit;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farm permit service. This utility wraps <code>com.nbp.farm.application.stages.service.service.persistence.impl.FarmPermitPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmPermitPersistence
 * @generated
 */
public class FarmPermitUtil {

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
	public static void clearCache(FarmPermit farmPermit) {
		getPersistence().clearCache(farmPermit);
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
	public static Map<Serializable, FarmPermit> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmPermit> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmPermit> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmPermit update(FarmPermit farmPermit) {
		return getPersistence().update(farmPermit);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmPermit update(
		FarmPermit farmPermit, ServiceContext serviceContext) {

		return getPersistence().update(farmPermit, serviceContext);
	}

	/**
	 * Returns the farm permit where caseId = &#63; or throws a <code>NoSuchFarmPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching farm permit
	 * @throws NoSuchFarmPermitException if a matching farm permit could not be found
	 */
	public static FarmPermit findBygetFarmBy_CI(String caseId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmPermitException {

		return getPersistence().findBygetFarmBy_CI(caseId);
	}

	/**
	 * Returns the farm permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching farm permit, or <code>null</code> if a matching farm permit could not be found
	 */
	public static FarmPermit fetchBygetFarmBy_CI(String caseId) {
		return getPersistence().fetchBygetFarmBy_CI(caseId);
	}

	/**
	 * Returns the farm permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm permit, or <code>null</code> if a matching farm permit could not be found
	 */
	public static FarmPermit fetchBygetFarmBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFarmBy_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the farm permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the farm permit that was removed
	 */
	public static FarmPermit removeBygetFarmBy_CI(String caseId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmPermitException {

		return getPersistence().removeBygetFarmBy_CI(caseId);
	}

	/**
	 * Returns the number of farm permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching farm permits
	 */
	public static int countBygetFarmBy_CI(String caseId) {
		return getPersistence().countBygetFarmBy_CI(caseId);
	}

	/**
	 * Caches the farm permit in the entity cache if it is enabled.
	 *
	 * @param farmPermit the farm permit
	 */
	public static void cacheResult(FarmPermit farmPermit) {
		getPersistence().cacheResult(farmPermit);
	}

	/**
	 * Caches the farm permits in the entity cache if it is enabled.
	 *
	 * @param farmPermits the farm permits
	 */
	public static void cacheResult(List<FarmPermit> farmPermits) {
		getPersistence().cacheResult(farmPermits);
	}

	/**
	 * Creates a new farm permit with the primary key. Does not add the farm permit to the database.
	 *
	 * @param farmPermitId the primary key for the new farm permit
	 * @return the new farm permit
	 */
	public static FarmPermit create(long farmPermitId) {
		return getPersistence().create(farmPermitId);
	}

	/**
	 * Removes the farm permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit that was removed
	 * @throws NoSuchFarmPermitException if a farm permit with the primary key could not be found
	 */
	public static FarmPermit remove(long farmPermitId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmPermitException {

		return getPersistence().remove(farmPermitId);
	}

	public static FarmPermit updateImpl(FarmPermit farmPermit) {
		return getPersistence().updateImpl(farmPermit);
	}

	/**
	 * Returns the farm permit with the primary key or throws a <code>NoSuchFarmPermitException</code> if it could not be found.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit
	 * @throws NoSuchFarmPermitException if a farm permit with the primary key could not be found
	 */
	public static FarmPermit findByPrimaryKey(long farmPermitId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmPermitException {

		return getPersistence().findByPrimaryKey(farmPermitId);
	}

	/**
	 * Returns the farm permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit, or <code>null</code> if a farm permit with the primary key could not be found
	 */
	public static FarmPermit fetchByPrimaryKey(long farmPermitId) {
		return getPersistence().fetchByPrimaryKey(farmPermitId);
	}

	/**
	 * Returns all the farm permits.
	 *
	 * @return the farm permits
	 */
	public static List<FarmPermit> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @return the range of farm permits
	 */
	public static List<FarmPermit> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm permits
	 */
	public static List<FarmPermit> findAll(
		int start, int end, OrderByComparator<FarmPermit> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm permits
	 */
	public static List<FarmPermit> findAll(
		int start, int end, OrderByComparator<FarmPermit> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farm permits from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farm permits.
	 *
	 * @return the number of farm permits
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmPermitPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmPermitPersistence _persistence;

}