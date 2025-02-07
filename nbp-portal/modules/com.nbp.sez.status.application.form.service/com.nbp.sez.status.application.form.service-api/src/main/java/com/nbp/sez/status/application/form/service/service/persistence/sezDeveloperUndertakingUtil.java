/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.sezDeveloperUndertaking;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez developer undertaking service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.sezDeveloperUndertakingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sezDeveloperUndertakingPersistence
 * @generated
 */
public class sezDeveloperUndertakingUtil {

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
		sezDeveloperUndertaking sezDeveloperUndertaking) {

		getPersistence().clearCache(sezDeveloperUndertaking);
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
	public static Map<Serializable, sezDeveloperUndertaking> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<sezDeveloperUndertaking> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<sezDeveloperUndertaking> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<sezDeveloperUndertaking> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<sezDeveloperUndertaking> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static sezDeveloperUndertaking update(
		sezDeveloperUndertaking sezDeveloperUndertaking) {

		return getPersistence().update(sezDeveloperUndertaking);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static sezDeveloperUndertaking update(
		sezDeveloperUndertaking sezDeveloperUndertaking,
		ServiceContext serviceContext) {

		return getPersistence().update(sezDeveloperUndertaking, serviceContext);
	}

	/**
	 * Returns the sez developer undertaking where sezStatusApplicationId = &#63; or throws a <code>NoSuchsezDeveloperUndertakingException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer undertaking
	 * @throws NoSuchsezDeveloperUndertakingException if a matching sez developer undertaking could not be found
	 */
	public static sezDeveloperUndertaking findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchsezDeveloperUndertakingException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez developer undertaking where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer undertaking, or <code>null</code> if a matching sez developer undertaking could not be found
	 */
	public static sezDeveloperUndertaking fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez developer undertaking where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez developer undertaking, or <code>null</code> if a matching sez developer undertaking could not be found
	 */
	public static sezDeveloperUndertaking fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez developer undertaking where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez developer undertaking that was removed
	 */
	public static sezDeveloperUndertaking removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchsezDeveloperUndertakingException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez developer undertakings where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez developer undertakings
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez developer undertaking in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperUndertaking the sez developer undertaking
	 */
	public static void cacheResult(
		sezDeveloperUndertaking sezDeveloperUndertaking) {

		getPersistence().cacheResult(sezDeveloperUndertaking);
	}

	/**
	 * Caches the sez developer undertakings in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperUndertakings the sez developer undertakings
	 */
	public static void cacheResult(
		List<sezDeveloperUndertaking> sezDeveloperUndertakings) {

		getPersistence().cacheResult(sezDeveloperUndertakings);
	}

	/**
	 * Creates a new sez developer undertaking with the primary key. Does not add the sez developer undertaking to the database.
	 *
	 * @param sezDeveloperUndertakingId the primary key for the new sez developer undertaking
	 * @return the new sez developer undertaking
	 */
	public static sezDeveloperUndertaking create(
		long sezDeveloperUndertakingId) {

		return getPersistence().create(sezDeveloperUndertakingId);
	}

	/**
	 * Removes the sez developer undertaking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking that was removed
	 * @throws NoSuchsezDeveloperUndertakingException if a sez developer undertaking with the primary key could not be found
	 */
	public static sezDeveloperUndertaking remove(long sezDeveloperUndertakingId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchsezDeveloperUndertakingException {

		return getPersistence().remove(sezDeveloperUndertakingId);
	}

	public static sezDeveloperUndertaking updateImpl(
		sezDeveloperUndertaking sezDeveloperUndertaking) {

		return getPersistence().updateImpl(sezDeveloperUndertaking);
	}

	/**
	 * Returns the sez developer undertaking with the primary key or throws a <code>NoSuchsezDeveloperUndertakingException</code> if it could not be found.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking
	 * @throws NoSuchsezDeveloperUndertakingException if a sez developer undertaking with the primary key could not be found
	 */
	public static sezDeveloperUndertaking findByPrimaryKey(
			long sezDeveloperUndertakingId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchsezDeveloperUndertakingException {

		return getPersistence().findByPrimaryKey(sezDeveloperUndertakingId);
	}

	/**
	 * Returns the sez developer undertaking with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDeveloperUndertakingId the primary key of the sez developer undertaking
	 * @return the sez developer undertaking, or <code>null</code> if a sez developer undertaking with the primary key could not be found
	 */
	public static sezDeveloperUndertaking fetchByPrimaryKey(
		long sezDeveloperUndertakingId) {

		return getPersistence().fetchByPrimaryKey(sezDeveloperUndertakingId);
	}

	/**
	 * Returns all the sez developer undertakings.
	 *
	 * @return the sez developer undertakings
	 */
	public static List<sezDeveloperUndertaking> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @return the range of sez developer undertakings
	 */
	public static List<sezDeveloperUndertaking> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez developer undertakings
	 */
	public static List<sezDeveloperUndertaking> findAll(
		int start, int end,
		OrderByComparator<sezDeveloperUndertaking> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez developer undertakings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>sezDeveloperUndertakingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer undertakings
	 * @param end the upper bound of the range of sez developer undertakings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez developer undertakings
	 */
	public static List<sezDeveloperUndertaking> findAll(
		int start, int end,
		OrderByComparator<sezDeveloperUndertaking> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez developer undertakings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez developer undertakings.
	 *
	 * @return the number of sez developer undertakings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static sezDeveloperUndertakingPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		sezDeveloperUndertakingPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile sezDeveloperUndertakingPersistence _persistence;

}