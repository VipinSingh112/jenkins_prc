/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAnnualEarnings;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new annual earnings service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewAnnualEarningsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAnnualEarningsPersistence
 * @generated
 */
public class TourismNewAnnualEarningsUtil {

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
		TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		getPersistence().clearCache(tourismNewAnnualEarnings);
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
	public static Map<Serializable, TourismNewAnnualEarnings>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewAnnualEarnings> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewAnnualEarnings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewAnnualEarnings> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewAnnualEarnings> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewAnnualEarnings update(
		TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		return getPersistence().update(tourismNewAnnualEarnings);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewAnnualEarnings update(
		TourismNewAnnualEarnings tourismNewAnnualEarnings,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewAnnualEarnings, serviceContext);
	}

	/**
	 * Returns the tourism new annual earnings where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAnnualEarningsException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new annual earnings
	 * @throws NoSuchTourismNewAnnualEarningsException if a matching tourism new annual earnings could not be found
	 */
	public static TourismNewAnnualEarnings findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAnnualEarningsException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new annual earnings where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new annual earnings, or <code>null</code> if a matching tourism new annual earnings could not be found
	 */
	public static TourismNewAnnualEarnings fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new annual earnings where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new annual earnings, or <code>null</code> if a matching tourism new annual earnings could not be found
	 */
	public static TourismNewAnnualEarnings fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new annual earnings where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new annual earnings that was removed
	 */
	public static TourismNewAnnualEarnings removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAnnualEarningsException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new annual earningses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new annual earningses
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new annual earnings in the entity cache if it is enabled.
	 *
	 * @param tourismNewAnnualEarnings the tourism new annual earnings
	 */
	public static void cacheResult(
		TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		getPersistence().cacheResult(tourismNewAnnualEarnings);
	}

	/**
	 * Caches the tourism new annual earningses in the entity cache if it is enabled.
	 *
	 * @param tourismNewAnnualEarningses the tourism new annual earningses
	 */
	public static void cacheResult(
		List<TourismNewAnnualEarnings> tourismNewAnnualEarningses) {

		getPersistence().cacheResult(tourismNewAnnualEarningses);
	}

	/**
	 * Creates a new tourism new annual earnings with the primary key. Does not add the tourism new annual earnings to the database.
	 *
	 * @param tourismNewAnnualEarningsId the primary key for the new tourism new annual earnings
	 * @return the new tourism new annual earnings
	 */
	public static TourismNewAnnualEarnings create(
		long tourismNewAnnualEarningsId) {

		return getPersistence().create(tourismNewAnnualEarningsId);
	}

	/**
	 * Removes the tourism new annual earnings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings that was removed
	 * @throws NoSuchTourismNewAnnualEarningsException if a tourism new annual earnings with the primary key could not be found
	 */
	public static TourismNewAnnualEarnings remove(
			long tourismNewAnnualEarningsId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAnnualEarningsException {

		return getPersistence().remove(tourismNewAnnualEarningsId);
	}

	public static TourismNewAnnualEarnings updateImpl(
		TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		return getPersistence().updateImpl(tourismNewAnnualEarnings);
	}

	/**
	 * Returns the tourism new annual earnings with the primary key or throws a <code>NoSuchTourismNewAnnualEarningsException</code> if it could not be found.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings
	 * @throws NoSuchTourismNewAnnualEarningsException if a tourism new annual earnings with the primary key could not be found
	 */
	public static TourismNewAnnualEarnings findByPrimaryKey(
			long tourismNewAnnualEarningsId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAnnualEarningsException {

		return getPersistence().findByPrimaryKey(tourismNewAnnualEarningsId);
	}

	/**
	 * Returns the tourism new annual earnings with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAnnualEarningsId the primary key of the tourism new annual earnings
	 * @return the tourism new annual earnings, or <code>null</code> if a tourism new annual earnings with the primary key could not be found
	 */
	public static TourismNewAnnualEarnings fetchByPrimaryKey(
		long tourismNewAnnualEarningsId) {

		return getPersistence().fetchByPrimaryKey(tourismNewAnnualEarningsId);
	}

	/**
	 * Returns all the tourism new annual earningses.
	 *
	 * @return the tourism new annual earningses
	 */
	public static List<TourismNewAnnualEarnings> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @return the range of tourism new annual earningses
	 */
	public static List<TourismNewAnnualEarnings> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new annual earningses
	 */
	public static List<TourismNewAnnualEarnings> findAll(
		int start, int end,
		OrderByComparator<TourismNewAnnualEarnings> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new annual earningses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAnnualEarningsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new annual earningses
	 * @param end the upper bound of the range of tourism new annual earningses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new annual earningses
	 */
	public static List<TourismNewAnnualEarnings> findAll(
		int start, int end,
		OrderByComparator<TourismNewAnnualEarnings> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new annual earningses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new annual earningses.
	 *
	 * @return the number of tourism new annual earningses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewAnnualEarningsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewAnnualEarningsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewAnnualEarningsPersistence _persistence;

}