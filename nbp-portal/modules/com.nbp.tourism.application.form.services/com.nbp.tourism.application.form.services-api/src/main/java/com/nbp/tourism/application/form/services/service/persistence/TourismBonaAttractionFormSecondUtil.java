/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormSecond;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona attraction form second service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaAttractionFormSecondPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormSecondPersistence
 * @generated
 */
public class TourismBonaAttractionFormSecondUtil {

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
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		getPersistence().clearCache(tourismBonaAttractionFormSecond);
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
	public static Map<Serializable, TourismBonaAttractionFormSecond>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaAttractionFormSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaAttractionFormSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaAttractionFormSecond> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaAttractionFormSecond> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaAttractionFormSecond update(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		return getPersistence().update(tourismBonaAttractionFormSecond);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaAttractionFormSecond update(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaAttractionFormSecond, serviceContext);
	}

	/**
	 * Returns the tourism bona attraction form second where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionFormSecondException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form second
	 * @throws NoSuchTourismBonaAttractionFormSecondException if a matching tourism bona attraction form second could not be found
	 */
	public static TourismBonaAttractionFormSecond findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionFormSecondException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona attraction form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form second, or <code>null</code> if a matching tourism bona attraction form second could not be found
	 */
	public static TourismBonaAttractionFormSecond fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona attraction form second where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction form second, or <code>null</code> if a matching tourism bona attraction form second could not be found
	 */
	public static TourismBonaAttractionFormSecond fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona attraction form second where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction form second that was removed
	 */
	public static TourismBonaAttractionFormSecond removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionFormSecondException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona attraction form seconds where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction form seconds
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona attraction form second in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormSecond the tourism bona attraction form second
	 */
	public static void cacheResult(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		getPersistence().cacheResult(tourismBonaAttractionFormSecond);
	}

	/**
	 * Caches the tourism bona attraction form seconds in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormSeconds the tourism bona attraction form seconds
	 */
	public static void cacheResult(
		List<TourismBonaAttractionFormSecond>
			tourismBonaAttractionFormSeconds) {

		getPersistence().cacheResult(tourismBonaAttractionFormSeconds);
	}

	/**
	 * Creates a new tourism bona attraction form second with the primary key. Does not add the tourism bona attraction form second to the database.
	 *
	 * @param tourismBonaAttractFormSecId the primary key for the new tourism bona attraction form second
	 * @return the new tourism bona attraction form second
	 */
	public static TourismBonaAttractionFormSecond create(
		long tourismBonaAttractFormSecId) {

		return getPersistence().create(tourismBonaAttractFormSecId);
	}

	/**
	 * Removes the tourism bona attraction form second with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second that was removed
	 * @throws NoSuchTourismBonaAttractionFormSecondException if a tourism bona attraction form second with the primary key could not be found
	 */
	public static TourismBonaAttractionFormSecond remove(
			long tourismBonaAttractFormSecId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionFormSecondException {

		return getPersistence().remove(tourismBonaAttractFormSecId);
	}

	public static TourismBonaAttractionFormSecond updateImpl(
		TourismBonaAttractionFormSecond tourismBonaAttractionFormSecond) {

		return getPersistence().updateImpl(tourismBonaAttractionFormSecond);
	}

	/**
	 * Returns the tourism bona attraction form second with the primary key or throws a <code>NoSuchTourismBonaAttractionFormSecondException</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second
	 * @throws NoSuchTourismBonaAttractionFormSecondException if a tourism bona attraction form second with the primary key could not be found
	 */
	public static TourismBonaAttractionFormSecond findByPrimaryKey(
			long tourismBonaAttractFormSecId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionFormSecondException {

		return getPersistence().findByPrimaryKey(tourismBonaAttractFormSecId);
	}

	/**
	 * Returns the tourism bona attraction form second with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormSecId the primary key of the tourism bona attraction form second
	 * @return the tourism bona attraction form second, or <code>null</code> if a tourism bona attraction form second with the primary key could not be found
	 */
	public static TourismBonaAttractionFormSecond fetchByPrimaryKey(
		long tourismBonaAttractFormSecId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaAttractFormSecId);
	}

	/**
	 * Returns all the tourism bona attraction form seconds.
	 *
	 * @return the tourism bona attraction form seconds
	 */
	public static List<TourismBonaAttractionFormSecond> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form seconds
	 * @param end the upper bound of the range of tourism bona attraction form seconds (not inclusive)
	 * @return the range of tourism bona attraction form seconds
	 */
	public static List<TourismBonaAttractionFormSecond> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form seconds
	 * @param end the upper bound of the range of tourism bona attraction form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction form seconds
	 */
	public static List<TourismBonaAttractionFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormSecond> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form seconds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormSecondModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form seconds
	 * @param end the upper bound of the range of tourism bona attraction form seconds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction form seconds
	 */
	public static List<TourismBonaAttractionFormSecond> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormSecond> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona attraction form seconds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona attraction form seconds.
	 *
	 * @return the number of tourism bona attraction form seconds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaAttractionFormSecondPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaAttractionFormSecondPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaAttractionFormSecondPersistence
		_persistence;

}