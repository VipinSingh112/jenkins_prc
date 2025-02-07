/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewVehicleAddBox;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new vehicle add box service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewVehicleAddBoxPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewVehicleAddBoxPersistence
 * @generated
 */
public class TourismNewVehicleAddBoxUtil {

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
		TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		getPersistence().clearCache(tourismNewVehicleAddBox);
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
	public static Map<Serializable, TourismNewVehicleAddBox> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewVehicleAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewVehicleAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewVehicleAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewVehicleAddBox> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewVehicleAddBox update(
		TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		return getPersistence().update(tourismNewVehicleAddBox);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewVehicleAddBox update(
		TourismNewVehicleAddBox tourismNewVehicleAddBox,
		ServiceContext serviceContext) {

		return getPersistence().update(tourismNewVehicleAddBox, serviceContext);
	}

	/**
	 * Returns all the tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new vehicle add boxes
	 */
	public static List<TourismNewVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId) {

		return getPersistence().findBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns a range of all the tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @return the range of matching tourism new vehicle add boxes
	 */
	public static List<TourismNewVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism new vehicle add boxes
	 */
	public static List<TourismNewVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismNewVehicleAddBox> orderByComparator) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism new vehicle add boxes
	 */
	public static List<TourismNewVehicleAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismNewVehicleAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism new vehicle add box
	 * @throws NoSuchTourismNewVehicleAddBoxException if a matching tourism new vehicle add box could not be found
	 */
	public static TourismNewVehicleAddBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			OrderByComparator<TourismNewVehicleAddBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewVehicleAddBoxException {

		return getPersistence().findBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the first tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism new vehicle add box, or <code>null</code> if a matching tourism new vehicle add box could not be found
	 */
	public static TourismNewVehicleAddBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		OrderByComparator<TourismNewVehicleAddBox> orderByComparator) {

		return getPersistence().fetchBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism new vehicle add box
	 * @throws NoSuchTourismNewVehicleAddBoxException if a matching tourism new vehicle add box could not be found
	 */
	public static TourismNewVehicleAddBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			OrderByComparator<TourismNewVehicleAddBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewVehicleAddBoxException {

		return getPersistence().findBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism new vehicle add box, or <code>null</code> if a matching tourism new vehicle add box could not be found
	 */
	public static TourismNewVehicleAddBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		OrderByComparator<TourismNewVehicleAddBox> orderByComparator) {

		return getPersistence().fetchBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the tourism new vehicle add boxes before and after the current tourism new vehicle add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismNewVehBoxId the primary key of the current tourism new vehicle add box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism new vehicle add box
	 * @throws NoSuchTourismNewVehicleAddBoxException if a tourism new vehicle add box with the primary key could not be found
	 */
	public static TourismNewVehicleAddBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismNewVehBoxId, long tourismApplicationId,
			OrderByComparator<TourismNewVehicleAddBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewVehicleAddBoxException {

		return getPersistence().findBygetTAP_TAI_PrevAndNext(
			tourismNewVehBoxId, tourismApplicationId, orderByComparator);
	}

	/**
	 * Removes all the tourism new vehicle add boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public static void removeBygetTAP_TAI(long tourismApplicationId) {
		getPersistence().removeBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new vehicle add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new vehicle add boxes
	 */
	public static int countBygetTAP_TAI(long tourismApplicationId) {
		return getPersistence().countBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Caches the tourism new vehicle add box in the entity cache if it is enabled.
	 *
	 * @param tourismNewVehicleAddBox the tourism new vehicle add box
	 */
	public static void cacheResult(
		TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		getPersistence().cacheResult(tourismNewVehicleAddBox);
	}

	/**
	 * Caches the tourism new vehicle add boxes in the entity cache if it is enabled.
	 *
	 * @param tourismNewVehicleAddBoxes the tourism new vehicle add boxes
	 */
	public static void cacheResult(
		List<TourismNewVehicleAddBox> tourismNewVehicleAddBoxes) {

		getPersistence().cacheResult(tourismNewVehicleAddBoxes);
	}

	/**
	 * Creates a new tourism new vehicle add box with the primary key. Does not add the tourism new vehicle add box to the database.
	 *
	 * @param tourismNewVehBoxId the primary key for the new tourism new vehicle add box
	 * @return the new tourism new vehicle add box
	 */
	public static TourismNewVehicleAddBox create(long tourismNewVehBoxId) {
		return getPersistence().create(tourismNewVehBoxId);
	}

	/**
	 * Removes the tourism new vehicle add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewVehBoxId the primary key of the tourism new vehicle add box
	 * @return the tourism new vehicle add box that was removed
	 * @throws NoSuchTourismNewVehicleAddBoxException if a tourism new vehicle add box with the primary key could not be found
	 */
	public static TourismNewVehicleAddBox remove(long tourismNewVehBoxId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewVehicleAddBoxException {

		return getPersistence().remove(tourismNewVehBoxId);
	}

	public static TourismNewVehicleAddBox updateImpl(
		TourismNewVehicleAddBox tourismNewVehicleAddBox) {

		return getPersistence().updateImpl(tourismNewVehicleAddBox);
	}

	/**
	 * Returns the tourism new vehicle add box with the primary key or throws a <code>NoSuchTourismNewVehicleAddBoxException</code> if it could not be found.
	 *
	 * @param tourismNewVehBoxId the primary key of the tourism new vehicle add box
	 * @return the tourism new vehicle add box
	 * @throws NoSuchTourismNewVehicleAddBoxException if a tourism new vehicle add box with the primary key could not be found
	 */
	public static TourismNewVehicleAddBox findByPrimaryKey(
			long tourismNewVehBoxId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewVehicleAddBoxException {

		return getPersistence().findByPrimaryKey(tourismNewVehBoxId);
	}

	/**
	 * Returns the tourism new vehicle add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewVehBoxId the primary key of the tourism new vehicle add box
	 * @return the tourism new vehicle add box, or <code>null</code> if a tourism new vehicle add box with the primary key could not be found
	 */
	public static TourismNewVehicleAddBox fetchByPrimaryKey(
		long tourismNewVehBoxId) {

		return getPersistence().fetchByPrimaryKey(tourismNewVehBoxId);
	}

	/**
	 * Returns all the tourism new vehicle add boxes.
	 *
	 * @return the tourism new vehicle add boxes
	 */
	public static List<TourismNewVehicleAddBox> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @return the range of tourism new vehicle add boxes
	 */
	public static List<TourismNewVehicleAddBox> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new vehicle add boxes
	 */
	public static List<TourismNewVehicleAddBox> findAll(
		int start, int end,
		OrderByComparator<TourismNewVehicleAddBox> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new vehicle add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewVehicleAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new vehicle add boxes
	 * @param end the upper bound of the range of tourism new vehicle add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new vehicle add boxes
	 */
	public static List<TourismNewVehicleAddBox> findAll(
		int start, int end,
		OrderByComparator<TourismNewVehicleAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new vehicle add boxes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new vehicle add boxes.
	 *
	 * @return the number of tourism new vehicle add boxes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewVehicleAddBoxPersistence getPersistence() {
		return _persistence;
	}

	private static volatile TourismNewVehicleAddBoxPersistence _persistence;

}