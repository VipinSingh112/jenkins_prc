/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirst;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona attraction form first service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaAttractionFormFirstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionFormFirstPersistence
 * @generated
 */
public class TourismBonaAttractionFormFirstUtil {

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
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		getPersistence().clearCache(tourismBonaAttractionFormFirst);
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
	public static Map<Serializable, TourismBonaAttractionFormFirst>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaAttractionFormFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaAttractionFormFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaAttractionFormFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaAttractionFormFirst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaAttractionFormFirst update(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		return getPersistence().update(tourismBonaAttractionFormFirst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaAttractionFormFirst update(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaAttractionFormFirst, serviceContext);
	}

	/**
	 * Returns the tourism bona attraction form first where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a matching tourism bona attraction form first could not be found
	 */
	public static TourismBonaAttractionFormFirst findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionFormFirstException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first, or <code>null</code> if a matching tourism bona attraction form first could not be found
	 */
	public static TourismBonaAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction form first, or <code>null</code> if a matching tourism bona attraction form first could not be found
	 */
	public static TourismBonaAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona attraction form first where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction form first that was removed
	 */
	public static TourismBonaAttractionFormFirst removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionFormFirstException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona attraction form firsts where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction form firsts
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona attraction form first in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirst the tourism bona attraction form first
	 */
	public static void cacheResult(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		getPersistence().cacheResult(tourismBonaAttractionFormFirst);
	}

	/**
	 * Caches the tourism bona attraction form firsts in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirsts the tourism bona attraction form firsts
	 */
	public static void cacheResult(
		List<TourismBonaAttractionFormFirst> tourismBonaAttractionFormFirsts) {

		getPersistence().cacheResult(tourismBonaAttractionFormFirsts);
	}

	/**
	 * Creates a new tourism bona attraction form first with the primary key. Does not add the tourism bona attraction form first to the database.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key for the new tourism bona attraction form first
	 * @return the new tourism bona attraction form first
	 */
	public static TourismBonaAttractionFormFirst create(
		long tourismBonaAttractFormFirstId) {

		return getPersistence().create(tourismBonaAttractFormFirstId);
	}

	/**
	 * Removes the tourism bona attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first that was removed
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a tourism bona attraction form first with the primary key could not be found
	 */
	public static TourismBonaAttractionFormFirst remove(
			long tourismBonaAttractFormFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionFormFirstException {

		return getPersistence().remove(tourismBonaAttractFormFirstId);
	}

	public static TourismBonaAttractionFormFirst updateImpl(
		TourismBonaAttractionFormFirst tourismBonaAttractionFormFirst) {

		return getPersistence().updateImpl(tourismBonaAttractionFormFirst);
	}

	/**
	 * Returns the tourism bona attraction form first with the primary key or throws a <code>NoSuchTourismBonaAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first
	 * @throws NoSuchTourismBonaAttractionFormFirstException if a tourism bona attraction form first with the primary key could not be found
	 */
	public static TourismBonaAttractionFormFirst findByPrimaryKey(
			long tourismBonaAttractFormFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAttractionFormFirstException {

		return getPersistence().findByPrimaryKey(tourismBonaAttractFormFirstId);
	}

	/**
	 * Returns the tourism bona attraction form first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAttractFormFirstId the primary key of the tourism bona attraction form first
	 * @return the tourism bona attraction form first, or <code>null</code> if a tourism bona attraction form first with the primary key could not be found
	 */
	public static TourismBonaAttractionFormFirst fetchByPrimaryKey(
		long tourismBonaAttractFormFirstId) {

		return getPersistence().fetchByPrimaryKey(
			tourismBonaAttractFormFirstId);
	}

	/**
	 * Returns all the tourism bona attraction form firsts.
	 *
	 * @return the tourism bona attraction form firsts
	 */
	public static List<TourismBonaAttractionFormFirst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @return the range of tourism bona attraction form firsts
	 */
	public static List<TourismBonaAttractionFormFirst> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction form firsts
	 */
	public static List<TourismBonaAttractionFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormFirst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form firsts
	 * @param end the upper bound of the range of tourism bona attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction form firsts
	 */
	public static List<TourismBonaAttractionFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona attraction form firsts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona attraction form firsts.
	 *
	 * @return the number of tourism bona attraction form firsts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaAttractionFormFirstPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaAttractionFormFirstPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaAttractionFormFirstPersistence
		_persistence;

}