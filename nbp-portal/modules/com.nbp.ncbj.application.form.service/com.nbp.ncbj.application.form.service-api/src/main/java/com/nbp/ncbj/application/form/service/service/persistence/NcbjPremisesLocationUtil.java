/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj premises location service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjPremisesLocationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPremisesLocationPersistence
 * @generated
 */
public class NcbjPremisesLocationUtil {

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
	public static void clearCache(NcbjPremisesLocation ncbjPremisesLocation) {
		getPersistence().clearCache(ncbjPremisesLocation);
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
	public static Map<Serializable, NcbjPremisesLocation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjPremisesLocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjPremisesLocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjPremisesLocation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjPremisesLocation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjPremisesLocation update(
		NcbjPremisesLocation ncbjPremisesLocation) {

		return getPersistence().update(ncbjPremisesLocation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjPremisesLocation update(
		NcbjPremisesLocation ncbjPremisesLocation,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjPremisesLocation, serviceContext);
	}

	/**
	 * Returns the ncbj premises location where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjPremisesLocationException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj premises location
	 * @throws NoSuchNcbjPremisesLocationException if a matching ncbj premises location could not be found
	 */
	public static NcbjPremisesLocation findBygetNCBJ_ById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjPremisesLocationException {

		return getPersistence().findBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj premises location where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj premises location, or <code>null</code> if a matching ncbj premises location could not be found
	 */
	public static NcbjPremisesLocation fetchBygetNCBJ_ById(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj premises location where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj premises location, or <code>null</code> if a matching ncbj premises location could not be found
	 */
	public static NcbjPremisesLocation fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJ_ById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj premises location where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj premises location that was removed
	 */
	public static NcbjPremisesLocation removeBygetNCBJ_ById(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjPremisesLocationException {

		return getPersistence().removeBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj premises locations where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj premises locations
	 */
	public static int countBygetNCBJ_ById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJ_ById(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj premises location in the entity cache if it is enabled.
	 *
	 * @param ncbjPremisesLocation the ncbj premises location
	 */
	public static void cacheResult(NcbjPremisesLocation ncbjPremisesLocation) {
		getPersistence().cacheResult(ncbjPremisesLocation);
	}

	/**
	 * Caches the ncbj premises locations in the entity cache if it is enabled.
	 *
	 * @param ncbjPremisesLocations the ncbj premises locations
	 */
	public static void cacheResult(
		List<NcbjPremisesLocation> ncbjPremisesLocations) {

		getPersistence().cacheResult(ncbjPremisesLocations);
	}

	/**
	 * Creates a new ncbj premises location with the primary key. Does not add the ncbj premises location to the database.
	 *
	 * @param ncbjPremisesLocationId the primary key for the new ncbj premises location
	 * @return the new ncbj premises location
	 */
	public static NcbjPremisesLocation create(long ncbjPremisesLocationId) {
		return getPersistence().create(ncbjPremisesLocationId);
	}

	/**
	 * Removes the ncbj premises location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location that was removed
	 * @throws NoSuchNcbjPremisesLocationException if a ncbj premises location with the primary key could not be found
	 */
	public static NcbjPremisesLocation remove(long ncbjPremisesLocationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjPremisesLocationException {

		return getPersistence().remove(ncbjPremisesLocationId);
	}

	public static NcbjPremisesLocation updateImpl(
		NcbjPremisesLocation ncbjPremisesLocation) {

		return getPersistence().updateImpl(ncbjPremisesLocation);
	}

	/**
	 * Returns the ncbj premises location with the primary key or throws a <code>NoSuchNcbjPremisesLocationException</code> if it could not be found.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location
	 * @throws NoSuchNcbjPremisesLocationException if a ncbj premises location with the primary key could not be found
	 */
	public static NcbjPremisesLocation findByPrimaryKey(
			long ncbjPremisesLocationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjPremisesLocationException {

		return getPersistence().findByPrimaryKey(ncbjPremisesLocationId);
	}

	/**
	 * Returns the ncbj premises location with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location, or <code>null</code> if a ncbj premises location with the primary key could not be found
	 */
	public static NcbjPremisesLocation fetchByPrimaryKey(
		long ncbjPremisesLocationId) {

		return getPersistence().fetchByPrimaryKey(ncbjPremisesLocationId);
	}

	/**
	 * Returns all the ncbj premises locations.
	 *
	 * @return the ncbj premises locations
	 */
	public static List<NcbjPremisesLocation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @return the range of ncbj premises locations
	 */
	public static List<NcbjPremisesLocation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj premises locations
	 */
	public static List<NcbjPremisesLocation> findAll(
		int start, int end,
		OrderByComparator<NcbjPremisesLocation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj premises locations
	 */
	public static List<NcbjPremisesLocation> findAll(
		int start, int end,
		OrderByComparator<NcbjPremisesLocation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj premises locations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj premises locations.
	 *
	 * @return the number of ncbj premises locations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjPremisesLocationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjPremisesLocationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjPremisesLocationPersistence _persistence;

}