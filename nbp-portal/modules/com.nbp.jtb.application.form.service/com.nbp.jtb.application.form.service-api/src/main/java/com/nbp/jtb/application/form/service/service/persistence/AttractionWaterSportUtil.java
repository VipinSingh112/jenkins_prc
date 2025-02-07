/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionWaterSport;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction water sport service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionWaterSportPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterSportPersistence
 * @generated
 */
public class AttractionWaterSportUtil {

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
	public static void clearCache(AttractionWaterSport attractionWaterSport) {
		getPersistence().clearCache(attractionWaterSport);
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
	public static Map<Serializable, AttractionWaterSport> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionWaterSport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionWaterSport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionWaterSport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionWaterSport> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionWaterSport update(
		AttractionWaterSport attractionWaterSport) {

		return getPersistence().update(attractionWaterSport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionWaterSport update(
		AttractionWaterSport attractionWaterSport,
		ServiceContext serviceContext) {

		return getPersistence().update(attractionWaterSport, serviceContext);
	}

	/**
	 * Returns the attraction water sport where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterSportException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water sport
	 * @throws NoSuchAttractionWaterSportException if a matching attraction water sport could not be found
	 */
	public static AttractionWaterSport findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterSportException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction water sport where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water sport, or <code>null</code> if a matching attraction water sport could not be found
	 */
	public static AttractionWaterSport fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction water sport where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water sport, or <code>null</code> if a matching attraction water sport could not be found
	 */
	public static AttractionWaterSport fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction water sport where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water sport that was removed
	 */
	public static AttractionWaterSport removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterSportException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction water sports where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water sports
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction water sport in the entity cache if it is enabled.
	 *
	 * @param attractionWaterSport the attraction water sport
	 */
	public static void cacheResult(AttractionWaterSport attractionWaterSport) {
		getPersistence().cacheResult(attractionWaterSport);
	}

	/**
	 * Caches the attraction water sports in the entity cache if it is enabled.
	 *
	 * @param attractionWaterSports the attraction water sports
	 */
	public static void cacheResult(
		List<AttractionWaterSport> attractionWaterSports) {

		getPersistence().cacheResult(attractionWaterSports);
	}

	/**
	 * Creates a new attraction water sport with the primary key. Does not add the attraction water sport to the database.
	 *
	 * @param attractionWaterSportId the primary key for the new attraction water sport
	 * @return the new attraction water sport
	 */
	public static AttractionWaterSport create(long attractionWaterSportId) {
		return getPersistence().create(attractionWaterSportId);
	}

	/**
	 * Removes the attraction water sport with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport that was removed
	 * @throws NoSuchAttractionWaterSportException if a attraction water sport with the primary key could not be found
	 */
	public static AttractionWaterSport remove(long attractionWaterSportId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterSportException {

		return getPersistence().remove(attractionWaterSportId);
	}

	public static AttractionWaterSport updateImpl(
		AttractionWaterSport attractionWaterSport) {

		return getPersistence().updateImpl(attractionWaterSport);
	}

	/**
	 * Returns the attraction water sport with the primary key or throws a <code>NoSuchAttractionWaterSportException</code> if it could not be found.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport
	 * @throws NoSuchAttractionWaterSportException if a attraction water sport with the primary key could not be found
	 */
	public static AttractionWaterSport findByPrimaryKey(
			long attractionWaterSportId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterSportException {

		return getPersistence().findByPrimaryKey(attractionWaterSportId);
	}

	/**
	 * Returns the attraction water sport with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterSportId the primary key of the attraction water sport
	 * @return the attraction water sport, or <code>null</code> if a attraction water sport with the primary key could not be found
	 */
	public static AttractionWaterSport fetchByPrimaryKey(
		long attractionWaterSportId) {

		return getPersistence().fetchByPrimaryKey(attractionWaterSportId);
	}

	/**
	 * Returns all the attraction water sports.
	 *
	 * @return the attraction water sports
	 */
	public static List<AttractionWaterSport> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @return the range of attraction water sports
	 */
	public static List<AttractionWaterSport> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water sports
	 */
	public static List<AttractionWaterSport> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterSport> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction water sports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterSportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water sports
	 * @param end the upper bound of the range of attraction water sports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water sports
	 */
	public static List<AttractionWaterSport> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterSport> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction water sports from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction water sports.
	 *
	 * @return the number of attraction water sports
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionWaterSportPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionWaterSportPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionWaterSportPersistence _persistence;

}