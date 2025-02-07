/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezStatusWorkFromHome;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status work from home service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezStatusWorkFromHomePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusWorkFromHomePersistence
 * @generated
 */
public class SezStatusWorkFromHomeUtil {

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
	public static void clearCache(SezStatusWorkFromHome sezStatusWorkFromHome) {
		getPersistence().clearCache(sezStatusWorkFromHome);
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
	public static Map<Serializable, SezStatusWorkFromHome> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusWorkFromHome> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusWorkFromHome> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusWorkFromHome> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusWorkFromHome> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusWorkFromHome update(
		SezStatusWorkFromHome sezStatusWorkFromHome) {

		return getPersistence().update(sezStatusWorkFromHome);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusWorkFromHome update(
		SezStatusWorkFromHome sezStatusWorkFromHome,
		ServiceContext serviceContext) {

		return getPersistence().update(sezStatusWorkFromHome, serviceContext);
	}

	/**
	 * Returns the sez status work from home where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusWorkFromHomeException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status work from home
	 * @throws NoSuchSezStatusWorkFromHomeException if a matching sez status work from home could not be found
	 */
	public static SezStatusWorkFromHome findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWorkFromHomeException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez status work from home where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status work from home, or <code>null</code> if a matching sez status work from home could not be found
	 */
	public static SezStatusWorkFromHome fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez status work from home where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status work from home, or <code>null</code> if a matching sez status work from home could not be found
	 */
	public static SezStatusWorkFromHome fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez status work from home where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status work from home that was removed
	 */
	public static SezStatusWorkFromHome removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWorkFromHomeException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez status work from homes where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status work from homes
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez status work from home in the entity cache if it is enabled.
	 *
	 * @param sezStatusWorkFromHome the sez status work from home
	 */
	public static void cacheResult(
		SezStatusWorkFromHome sezStatusWorkFromHome) {

		getPersistence().cacheResult(sezStatusWorkFromHome);
	}

	/**
	 * Caches the sez status work from homes in the entity cache if it is enabled.
	 *
	 * @param sezStatusWorkFromHomes the sez status work from homes
	 */
	public static void cacheResult(
		List<SezStatusWorkFromHome> sezStatusWorkFromHomes) {

		getPersistence().cacheResult(sezStatusWorkFromHomes);
	}

	/**
	 * Creates a new sez status work from home with the primary key. Does not add the sez status work from home to the database.
	 *
	 * @param sezStatusWorkFromHomeId the primary key for the new sez status work from home
	 * @return the new sez status work from home
	 */
	public static SezStatusWorkFromHome create(long sezStatusWorkFromHomeId) {
		return getPersistence().create(sezStatusWorkFromHomeId);
	}

	/**
	 * Removes the sez status work from home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home that was removed
	 * @throws NoSuchSezStatusWorkFromHomeException if a sez status work from home with the primary key could not be found
	 */
	public static SezStatusWorkFromHome remove(long sezStatusWorkFromHomeId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWorkFromHomeException {

		return getPersistence().remove(sezStatusWorkFromHomeId);
	}

	public static SezStatusWorkFromHome updateImpl(
		SezStatusWorkFromHome sezStatusWorkFromHome) {

		return getPersistence().updateImpl(sezStatusWorkFromHome);
	}

	/**
	 * Returns the sez status work from home with the primary key or throws a <code>NoSuchSezStatusWorkFromHomeException</code> if it could not be found.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home
	 * @throws NoSuchSezStatusWorkFromHomeException if a sez status work from home with the primary key could not be found
	 */
	public static SezStatusWorkFromHome findByPrimaryKey(
			long sezStatusWorkFromHomeId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusWorkFromHomeException {

		return getPersistence().findByPrimaryKey(sezStatusWorkFromHomeId);
	}

	/**
	 * Returns the sez status work from home with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusWorkFromHomeId the primary key of the sez status work from home
	 * @return the sez status work from home, or <code>null</code> if a sez status work from home with the primary key could not be found
	 */
	public static SezStatusWorkFromHome fetchByPrimaryKey(
		long sezStatusWorkFromHomeId) {

		return getPersistence().fetchByPrimaryKey(sezStatusWorkFromHomeId);
	}

	/**
	 * Returns all the sez status work from homes.
	 *
	 * @return the sez status work from homes
	 */
	public static List<SezStatusWorkFromHome> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @return the range of sez status work from homes
	 */
	public static List<SezStatusWorkFromHome> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status work from homes
	 */
	public static List<SezStatusWorkFromHome> findAll(
		int start, int end,
		OrderByComparator<SezStatusWorkFromHome> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status work from homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWorkFromHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status work from homes
	 * @param end the upper bound of the range of sez status work from homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status work from homes
	 */
	public static List<SezStatusWorkFromHome> findAll(
		int start, int end,
		OrderByComparator<SezStatusWorkFromHome> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status work from homes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status work from homes.
	 *
	 * @return the number of sez status work from homes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusWorkFromHomePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusWorkFromHomePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusWorkFromHomePersistence _persistence;

}