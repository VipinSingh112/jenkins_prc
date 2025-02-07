/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportatioCarRental;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona ground transportatio car rental service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaGroundTransportatioCarRentalPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportatioCarRentalPersistence
 * @generated
 */
public class TourismBonaGroundTransportatioCarRentalUtil {

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
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		getPersistence().clearCache(tourismBonaGroundTransportatioCarRental);
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
	public static Map<Serializable, TourismBonaGroundTransportatioCarRental>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaGroundTransportatioCarRental>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaGroundTransportatioCarRental>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaGroundTransportatioCarRental>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<TourismBonaGroundTransportatioCarRental>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaGroundTransportatioCarRental update(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		return getPersistence().update(tourismBonaGroundTransportatioCarRental);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaGroundTransportatioCarRental update(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaGroundTransportatioCarRental, serviceContext);
	}

	/**
	 * Returns the tourism bona ground transportatio car rental where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportatioCarRentalException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportatio car rental
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a matching tourism bona ground transportatio car rental could not be found
	 */
	public static TourismBonaGroundTransportatioCarRental findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportatioCarRentalException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground transportatio car rental where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportatio car rental, or <code>null</code> if a matching tourism bona ground transportatio car rental could not be found
	 */
	public static TourismBonaGroundTransportatioCarRental fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground transportatio car rental where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportatio car rental, or <code>null</code> if a matching tourism bona ground transportatio car rental could not be found
	 */
	public static TourismBonaGroundTransportatioCarRental fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona ground transportatio car rental where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground transportatio car rental that was removed
	 */
	public static TourismBonaGroundTransportatioCarRental
			removeBygetTourismById(long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportatioCarRentalException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona ground transportatio car rentals where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground transportatio car rentals
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona ground transportatio car rental in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportatioCarRental the tourism bona ground transportatio car rental
	 */
	public static void cacheResult(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		getPersistence().cacheResult(tourismBonaGroundTransportatioCarRental);
	}

	/**
	 * Caches the tourism bona ground transportatio car rentals in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportatioCarRentals the tourism bona ground transportatio car rentals
	 */
	public static void cacheResult(
		List<TourismBonaGroundTransportatioCarRental>
			tourismBonaGroundTransportatioCarRentals) {

		getPersistence().cacheResult(tourismBonaGroundTransportatioCarRentals);
	}

	/**
	 * Creates a new tourism bona ground transportatio car rental with the primary key. Does not add the tourism bona ground transportatio car rental to the database.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key for the new tourism bona ground transportatio car rental
	 * @return the new tourism bona ground transportatio car rental
	 */
	public static TourismBonaGroundTransportatioCarRental create(
		long tourismBonaGroundTransportCRId) {

		return getPersistence().create(tourismBonaGroundTransportCRId);
	}

	/**
	 * Removes the tourism bona ground transportatio car rental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental that was removed
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	public static TourismBonaGroundTransportatioCarRental remove(
			long tourismBonaGroundTransportCRId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportatioCarRentalException {

		return getPersistence().remove(tourismBonaGroundTransportCRId);
	}

	public static TourismBonaGroundTransportatioCarRental updateImpl(
		TourismBonaGroundTransportatioCarRental
			tourismBonaGroundTransportatioCarRental) {

		return getPersistence().updateImpl(
			tourismBonaGroundTransportatioCarRental);
	}

	/**
	 * Returns the tourism bona ground transportatio car rental with the primary key or throws a <code>NoSuchTourismBonaGroundTransportatioCarRentalException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental
	 * @throws NoSuchTourismBonaGroundTransportatioCarRentalException if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	public static TourismBonaGroundTransportatioCarRental findByPrimaryKey(
			long tourismBonaGroundTransportCRId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportatioCarRentalException {

		return getPersistence().findByPrimaryKey(
			tourismBonaGroundTransportCRId);
	}

	/**
	 * Returns the tourism bona ground transportatio car rental with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportCRId the primary key of the tourism bona ground transportatio car rental
	 * @return the tourism bona ground transportatio car rental, or <code>null</code> if a tourism bona ground transportatio car rental with the primary key could not be found
	 */
	public static TourismBonaGroundTransportatioCarRental fetchByPrimaryKey(
		long tourismBonaGroundTransportCRId) {

		return getPersistence().fetchByPrimaryKey(
			tourismBonaGroundTransportCRId);
	}

	/**
	 * Returns all the tourism bona ground transportatio car rentals.
	 *
	 * @return the tourism bona ground transportatio car rentals
	 */
	public static List<TourismBonaGroundTransportatioCarRental> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @return the range of tourism bona ground transportatio car rentals
	 */
	public static List<TourismBonaGroundTransportatioCarRental> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground transportatio car rentals
	 */
	public static List<TourismBonaGroundTransportatioCarRental> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportatioCarRental>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportatio car rentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportatioCarRentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportatio car rentals
	 * @param end the upper bound of the range of tourism bona ground transportatio car rentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground transportatio car rentals
	 */
	public static List<TourismBonaGroundTransportatioCarRental> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportatioCarRental>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona ground transportatio car rentals from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona ground transportatio car rentals.
	 *
	 * @return the number of tourism bona ground transportatio car rentals
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaGroundTransportatioCarRentalPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		TourismBonaGroundTransportatioCarRentalPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaGroundTransportatioCarRentalPersistence
		_persistence;

}