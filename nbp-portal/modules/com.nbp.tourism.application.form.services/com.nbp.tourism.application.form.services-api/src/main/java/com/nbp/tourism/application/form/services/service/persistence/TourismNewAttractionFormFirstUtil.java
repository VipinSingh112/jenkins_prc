/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirst;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new attraction form first service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewAttractionFormFirstPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstPersistence
 * @generated
 */
public class TourismNewAttractionFormFirstUtil {

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
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		getPersistence().clearCache(tourismNewAttractionFormFirst);
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
	public static Map<Serializable, TourismNewAttractionFormFirst>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewAttractionFormFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewAttractionFormFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewAttractionFormFirst> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewAttractionFormFirst> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewAttractionFormFirst update(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		return getPersistence().update(tourismNewAttractionFormFirst);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewAttractionFormFirst update(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewAttractionFormFirst, serviceContext);
	}

	/**
	 * Returns the tourism new attraction form first where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first
	 * @throws NoSuchTourismNewAttractionFormFirstException if a matching tourism new attraction form first could not be found
	 */
	public static TourismNewAttractionFormFirst findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first, or <code>null</code> if a matching tourism new attraction form first could not be found
	 */
	public static TourismNewAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form first where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form first, or <code>null</code> if a matching tourism new attraction form first could not be found
	 */
	public static TourismNewAttractionFormFirst fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new attraction form first where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction form first that was removed
	 */
	public static TourismNewAttractionFormFirst removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new attraction form firsts where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction form firsts
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new attraction form first in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirst the tourism new attraction form first
	 */
	public static void cacheResult(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		getPersistence().cacheResult(tourismNewAttractionFormFirst);
	}

	/**
	 * Caches the tourism new attraction form firsts in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirsts the tourism new attraction form firsts
	 */
	public static void cacheResult(
		List<TourismNewAttractionFormFirst> tourismNewAttractionFormFirsts) {

		getPersistence().cacheResult(tourismNewAttractionFormFirsts);
	}

	/**
	 * Creates a new tourism new attraction form first with the primary key. Does not add the tourism new attraction form first to the database.
	 *
	 * @param tourismNewAttractFormFirstId the primary key for the new tourism new attraction form first
	 * @return the new tourism new attraction form first
	 */
	public static TourismNewAttractionFormFirst create(
		long tourismNewAttractFormFirstId) {

		return getPersistence().create(tourismNewAttractFormFirstId);
	}

	/**
	 * Removes the tourism new attraction form first with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first that was removed
	 * @throws NoSuchTourismNewAttractionFormFirstException if a tourism new attraction form first with the primary key could not be found
	 */
	public static TourismNewAttractionFormFirst remove(
			long tourismNewAttractFormFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstException {

		return getPersistence().remove(tourismNewAttractFormFirstId);
	}

	public static TourismNewAttractionFormFirst updateImpl(
		TourismNewAttractionFormFirst tourismNewAttractionFormFirst) {

		return getPersistence().updateImpl(tourismNewAttractionFormFirst);
	}

	/**
	 * Returns the tourism new attraction form first with the primary key or throws a <code>NoSuchTourismNewAttractionFormFirstException</code> if it could not be found.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first
	 * @throws NoSuchTourismNewAttractionFormFirstException if a tourism new attraction form first with the primary key could not be found
	 */
	public static TourismNewAttractionFormFirst findByPrimaryKey(
			long tourismNewAttractFormFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstException {

		return getPersistence().findByPrimaryKey(tourismNewAttractFormFirstId);
	}

	/**
	 * Returns the tourism new attraction form first with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractFormFirstId the primary key of the tourism new attraction form first
	 * @return the tourism new attraction form first, or <code>null</code> if a tourism new attraction form first with the primary key could not be found
	 */
	public static TourismNewAttractionFormFirst fetchByPrimaryKey(
		long tourismNewAttractFormFirstId) {

		return getPersistence().fetchByPrimaryKey(tourismNewAttractFormFirstId);
	}

	/**
	 * Returns all the tourism new attraction form firsts.
	 *
	 * @return the tourism new attraction form firsts
	 */
	public static List<TourismNewAttractionFormFirst> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @return the range of tourism new attraction form firsts
	 */
	public static List<TourismNewAttractionFormFirst> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction form firsts
	 */
	public static List<TourismNewAttractionFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormFirst> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form firsts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form firsts
	 * @param end the upper bound of the range of tourism new attraction form firsts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction form firsts
	 */
	public static List<TourismNewAttractionFormFirst> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormFirst> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new attraction form firsts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new attraction form firsts.
	 *
	 * @return the number of tourism new attraction form firsts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewAttractionFormFirstPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewAttractionFormFirstPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewAttractionFormFirstPersistence
		_persistence;

}