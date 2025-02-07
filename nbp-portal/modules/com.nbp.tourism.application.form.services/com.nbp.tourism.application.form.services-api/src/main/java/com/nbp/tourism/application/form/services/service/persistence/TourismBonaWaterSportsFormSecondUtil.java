/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormSecond;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona water sports form second service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaWaterSportsFormSecondPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormSecondPersistence
 * @generated
 */
public class TourismBonaWaterSportsFormSecondUtil {

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
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		getPersistence().clearCache(tourismBonaWaterSportsFormSecond);
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
	public static Map<Serializable, TourismBonaWaterSportsFormSecond>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaWaterSportsFormSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaWaterSportsFormSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaWaterSportsFormSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormSecond> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaWaterSportsFormSecond update(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		return getPersistence().update(tourismBonaWaterSportsFormSecond);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaWaterSportsFormSecond update(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaWaterSportsFormSecond, serviceContext);
	}

	/**
	 * Returns the tourism bona water sports form second where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormSecondException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form second
	 * @throws NoSuchTourismBonaWaterSportsFormSecondException if a matching tourism bona water sports form second could not be found
	 */
	public static TourismBonaWaterSportsFormSecond findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormSecondException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona water sports form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form second, or <code>null</code> if a matching tourism bona water sports form second could not be found
	 */
	public static TourismBonaWaterSportsFormSecond fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona water sports form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form second, or <code>null</code> if a matching tourism bona water sports form second could not be found
	 */
	public static TourismBonaWaterSportsFormSecond fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona water sports form second where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona water sports form second that was removed
	 */
	public static TourismBonaWaterSportsFormSecond removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormSecondException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona water sports form seconds where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona water sports form seconds
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona water sports form second in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormSecond the tourism bona water sports form second
	 */
	public static void cacheResult(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		getPersistence().cacheResult(tourismBonaWaterSportsFormSecond);
	}

	/**
	 * Caches the tourism bona water sports form seconds in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormSeconds the tourism bona water sports form seconds
	 */
	public static void cacheResult(
		List<TourismBonaWaterSportsFormSecond>
			tourismBonaWaterSportsFormSeconds) {

		getPersistence().cacheResult(tourismBonaWaterSportsFormSeconds);
	}

	/**
	 * Creates a new tourism bona water sports form second with the primary key. Does not add the tourism bona water sports form second to the database.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key for the new tourism bona water sports form second
	 * @return the new tourism bona water sports form second
	 */
	public static TourismBonaWaterSportsFormSecond create(
		long tourismBonaWaterSportsFSecId) {

		return getPersistence().create(tourismBonaWaterSportsFSecId);
	}

	/**
	 * Removes the tourism bona water sports form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormSecondException if a tourism bona water sports form second with the primary key could not be found
	 */
	public static TourismBonaWaterSportsFormSecond remove(
			long tourismBonaWaterSportsFSecId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormSecondException {

		return getPersistence().remove(tourismBonaWaterSportsFSecId);
	}

	public static TourismBonaWaterSportsFormSecond updateImpl(
		TourismBonaWaterSportsFormSecond tourismBonaWaterSportsFormSecond) {

		return getPersistence().updateImpl(tourismBonaWaterSportsFormSecond);
	}

	/**
	 * Returns the tourism bona water sports form second with the primary key or throws a <code>NoSuchTourismBonaWaterSportsFormSecondException</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second
	 * @throws NoSuchTourismBonaWaterSportsFormSecondException if a tourism bona water sports form second with the primary key could not be found
	 */
	public static TourismBonaWaterSportsFormSecond findByPrimaryKey(
			long tourismBonaWaterSportsFSecId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormSecondException {

		return getPersistence().findByPrimaryKey(tourismBonaWaterSportsFSecId);
	}

	/**
	 * Returns the tourism bona water sports form second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFSecId the primary key of the tourism bona water sports form second
	 * @return the tourism bona water sports form second, or <code>null</code> if a tourism bona water sports form second with the primary key could not be found
	 */
	public static TourismBonaWaterSportsFormSecond fetchByPrimaryKey(
		long tourismBonaWaterSportsFSecId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaWaterSportsFSecId);
	}

	/**
	 * Returns all the tourism bona water sports form seconds.
	 *
	 * @return the tourism bona water sports form seconds
	 */
	public static List<TourismBonaWaterSportsFormSecond> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona water sports form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form seconds
	 * @param end the upper bound of the range of tourism bona water sports form seconds (not inclusive)
	 * @return the range of tourism bona water sports form seconds
	 */
	public static List<TourismBonaWaterSportsFormSecond> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form seconds
	 * @param end the upper bound of the range of tourism bona water sports form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona water sports form seconds
	 */
	public static List<TourismBonaWaterSportsFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormSecond> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form seconds
	 * @param end the upper bound of the range of tourism bona water sports form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona water sports form seconds
	 */
	public static List<TourismBonaWaterSportsFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormSecond> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona water sports form seconds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona water sports form seconds.
	 *
	 * @return the number of tourism bona water sports form seconds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaWaterSportsFormSecondPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaWaterSportsFormSecondPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaWaterSportsFormSecondPersistence
		_persistence;

}