/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionTravelHaltApp;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction travel halt app service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionTravelHaltAppPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionTravelHaltAppPersistence
 * @generated
 */
public class AttractionTravelHaltAppUtil {

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
		AttractionTravelHaltApp attractionTravelHaltApp) {

		getPersistence().clearCache(attractionTravelHaltApp);
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
	public static Map<Serializable, AttractionTravelHaltApp> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionTravelHaltApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionTravelHaltApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionTravelHaltApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionTravelHaltApp> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionTravelHaltApp update(
		AttractionTravelHaltApp attractionTravelHaltApp) {

		return getPersistence().update(attractionTravelHaltApp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionTravelHaltApp update(
		AttractionTravelHaltApp attractionTravelHaltApp,
		ServiceContext serviceContext) {

		return getPersistence().update(attractionTravelHaltApp, serviceContext);
	}

	/**
	 * Returns the attraction travel halt app where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionTravelHaltAppException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel halt app
	 * @throws NoSuchAttractionTravelHaltAppException if a matching attraction travel halt app could not be found
	 */
	public static AttractionTravelHaltApp findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelHaltAppException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction travel halt app where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction travel halt app, or <code>null</code> if a matching attraction travel halt app could not be found
	 */
	public static AttractionTravelHaltApp fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction travel halt app where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction travel halt app, or <code>null</code> if a matching attraction travel halt app could not be found
	 */
	public static AttractionTravelHaltApp fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction travel halt app where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction travel halt app that was removed
	 */
	public static AttractionTravelHaltApp removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelHaltAppException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction travel halt apps where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction travel halt apps
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction travel halt app in the entity cache if it is enabled.
	 *
	 * @param attractionTravelHaltApp the attraction travel halt app
	 */
	public static void cacheResult(
		AttractionTravelHaltApp attractionTravelHaltApp) {

		getPersistence().cacheResult(attractionTravelHaltApp);
	}

	/**
	 * Caches the attraction travel halt apps in the entity cache if it is enabled.
	 *
	 * @param attractionTravelHaltApps the attraction travel halt apps
	 */
	public static void cacheResult(
		List<AttractionTravelHaltApp> attractionTravelHaltApps) {

		getPersistence().cacheResult(attractionTravelHaltApps);
	}

	/**
	 * Creates a new attraction travel halt app with the primary key. Does not add the attraction travel halt app to the database.
	 *
	 * @param attractionTravelHaltAppId the primary key for the new attraction travel halt app
	 * @return the new attraction travel halt app
	 */
	public static AttractionTravelHaltApp create(
		long attractionTravelHaltAppId) {

		return getPersistence().create(attractionTravelHaltAppId);
	}

	/**
	 * Removes the attraction travel halt app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app that was removed
	 * @throws NoSuchAttractionTravelHaltAppException if a attraction travel halt app with the primary key could not be found
	 */
	public static AttractionTravelHaltApp remove(long attractionTravelHaltAppId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelHaltAppException {

		return getPersistence().remove(attractionTravelHaltAppId);
	}

	public static AttractionTravelHaltApp updateImpl(
		AttractionTravelHaltApp attractionTravelHaltApp) {

		return getPersistence().updateImpl(attractionTravelHaltApp);
	}

	/**
	 * Returns the attraction travel halt app with the primary key or throws a <code>NoSuchAttractionTravelHaltAppException</code> if it could not be found.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app
	 * @throws NoSuchAttractionTravelHaltAppException if a attraction travel halt app with the primary key could not be found
	 */
	public static AttractionTravelHaltApp findByPrimaryKey(
			long attractionTravelHaltAppId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionTravelHaltAppException {

		return getPersistence().findByPrimaryKey(attractionTravelHaltAppId);
	}

	/**
	 * Returns the attraction travel halt app with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionTravelHaltAppId the primary key of the attraction travel halt app
	 * @return the attraction travel halt app, or <code>null</code> if a attraction travel halt app with the primary key could not be found
	 */
	public static AttractionTravelHaltApp fetchByPrimaryKey(
		long attractionTravelHaltAppId) {

		return getPersistence().fetchByPrimaryKey(attractionTravelHaltAppId);
	}

	/**
	 * Returns all the attraction travel halt apps.
	 *
	 * @return the attraction travel halt apps
	 */
	public static List<AttractionTravelHaltApp> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @return the range of attraction travel halt apps
	 */
	public static List<AttractionTravelHaltApp> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction travel halt apps
	 */
	public static List<AttractionTravelHaltApp> findAll(
		int start, int end,
		OrderByComparator<AttractionTravelHaltApp> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction travel halt apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionTravelHaltAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction travel halt apps
	 * @param end the upper bound of the range of attraction travel halt apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction travel halt apps
	 */
	public static List<AttractionTravelHaltApp> findAll(
		int start, int end,
		OrderByComparator<AttractionTravelHaltApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction travel halt apps from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction travel halt apps.
	 *
	 * @return the number of attraction travel halt apps
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionTravelHaltAppPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionTravelHaltAppPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionTravelHaltAppPersistence _persistence;

}