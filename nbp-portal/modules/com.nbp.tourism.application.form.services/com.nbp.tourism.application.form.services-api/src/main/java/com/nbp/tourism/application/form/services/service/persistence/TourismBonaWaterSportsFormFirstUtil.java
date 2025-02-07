/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirst;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona water sports form first service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaWaterSportsFormFirstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstPersistence
 * @generated
 */
public class TourismBonaWaterSportsFormFirstUtil {

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
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		getPersistence().clearCache(tourismBonaWaterSportsFormFirst);
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
	public static Map<Serializable, TourismBonaWaterSportsFormFirst>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaWaterSportsFormFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaWaterSportsFormFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaWaterSportsFormFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormFirst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaWaterSportsFormFirst update(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		return getPersistence().update(tourismBonaWaterSportsFormFirst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaWaterSportsFormFirst update(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaWaterSportsFormFirst, serviceContext);
	}

	/**
	 * Returns the tourism bona water sports form first where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormFirstException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a matching tourism bona water sports form first could not be found
	 */
	public static TourismBonaWaterSportsFormFirst findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona water sports form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first, or <code>null</code> if a matching tourism bona water sports form first could not be found
	 */
	public static TourismBonaWaterSportsFormFirst fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona water sports form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form first, or <code>null</code> if a matching tourism bona water sports form first could not be found
	 */
	public static TourismBonaWaterSportsFormFirst fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona water sports form first where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona water sports form first that was removed
	 */
	public static TourismBonaWaterSportsFormFirst removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona water sports form firsts where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona water sports form firsts
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona water sports form first in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirst the tourism bona water sports form first
	 */
	public static void cacheResult(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		getPersistence().cacheResult(tourismBonaWaterSportsFormFirst);
	}

	/**
	 * Caches the tourism bona water sports form firsts in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirsts the tourism bona water sports form firsts
	 */
	public static void cacheResult(
		List<TourismBonaWaterSportsFormFirst>
			tourismBonaWaterSportsFormFirsts) {

		getPersistence().cacheResult(tourismBonaWaterSportsFormFirsts);
	}

	/**
	 * Creates a new tourism bona water sports form first with the primary key. Does not add the tourism bona water sports form first to the database.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key for the new tourism bona water sports form first
	 * @return the new tourism bona water sports form first
	 */
	public static TourismBonaWaterSportsFormFirst create(
		long tourismBonaWaterSFFirstId) {

		return getPersistence().create(tourismBonaWaterSFFirstId);
	}

	/**
	 * Removes the tourism bona water sports form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a tourism bona water sports form first with the primary key could not be found
	 */
	public static TourismBonaWaterSportsFormFirst remove(
			long tourismBonaWaterSFFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstException {

		return getPersistence().remove(tourismBonaWaterSFFirstId);
	}

	public static TourismBonaWaterSportsFormFirst updateImpl(
		TourismBonaWaterSportsFormFirst tourismBonaWaterSportsFormFirst) {

		return getPersistence().updateImpl(tourismBonaWaterSportsFormFirst);
	}

	/**
	 * Returns the tourism bona water sports form first with the primary key or throws a <code>NoSuchTourismBonaWaterSportsFormFirstException</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first
	 * @throws NoSuchTourismBonaWaterSportsFormFirstException if a tourism bona water sports form first with the primary key could not be found
	 */
	public static TourismBonaWaterSportsFormFirst findByPrimaryKey(
			long tourismBonaWaterSFFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstException {

		return getPersistence().findByPrimaryKey(tourismBonaWaterSFFirstId);
	}

	/**
	 * Returns the tourism bona water sports form first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSFFirstId the primary key of the tourism bona water sports form first
	 * @return the tourism bona water sports form first, or <code>null</code> if a tourism bona water sports form first with the primary key could not be found
	 */
	public static TourismBonaWaterSportsFormFirst fetchByPrimaryKey(
		long tourismBonaWaterSFFirstId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaWaterSFFirstId);
	}

	/**
	 * Returns all the tourism bona water sports form firsts.
	 *
	 * @return the tourism bona water sports form firsts
	 */
	public static List<TourismBonaWaterSportsFormFirst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @return the range of tourism bona water sports form firsts
	 */
	public static List<TourismBonaWaterSportsFormFirst> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona water sports form firsts
	 */
	public static List<TourismBonaWaterSportsFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormFirst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form firsts
	 * @param end the upper bound of the range of tourism bona water sports form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona water sports form firsts
	 */
	public static List<TourismBonaWaterSportsFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona water sports form firsts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona water sports form firsts.
	 *
	 * @return the number of tourism bona water sports form firsts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaWaterSportsFormFirstPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaWaterSportsFormFirstPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaWaterSportsFormFirstPersistence
		_persistence;

}