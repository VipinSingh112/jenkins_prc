/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransBox;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona ground trans box service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaGroundTransBoxPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransBoxPersistence
 * @generated
 */
public class TourismBonaGroundTransBoxUtil {

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
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		getPersistence().clearCache(tourismBonaGroundTransBox);
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
	public static Map<Serializable, TourismBonaGroundTransBox>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaGroundTransBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaGroundTransBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaGroundTransBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaGroundTransBox update(
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		return getPersistence().update(tourismBonaGroundTransBox);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaGroundTransBox update(
		TourismBonaGroundTransBox tourismBonaGroundTransBox,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaGroundTransBox, serviceContext);
	}

	/**
	 * Returns all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground trans boxes
	 */
	public static List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId) {

		return getPersistence().findBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns a range of all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @return the range of matching tourism bona ground trans boxes
	 */
	public static List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism bona ground trans boxes
	 */
	public static List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism bona ground trans boxes
	 */
	public static List<TourismBonaGroundTransBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a matching tourism bona ground trans box could not be found
	 */
	public static TourismBonaGroundTransBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			OrderByComparator<TourismBonaGroundTransBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransBoxException {

		return getPersistence().findBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the first tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism bona ground trans box, or <code>null</code> if a matching tourism bona ground trans box could not be found
	 */
	public static TourismBonaGroundTransBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator) {

		return getPersistence().fetchBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a matching tourism bona ground trans box could not be found
	 */
	public static TourismBonaGroundTransBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			OrderByComparator<TourismBonaGroundTransBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransBoxException {

		return getPersistence().findBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism bona ground trans box, or <code>null</code> if a matching tourism bona ground trans box could not be found
	 */
	public static TourismBonaGroundTransBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator) {

		return getPersistence().fetchBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the tourism bona ground trans boxes before and after the current tourism bona ground trans box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the current tourism bona ground trans box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	public static TourismBonaGroundTransBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismVehicleBoxBonaId, long tourismApplicationId,
			OrderByComparator<TourismBonaGroundTransBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransBoxException {

		return getPersistence().findBygetTAP_TAI_PrevAndNext(
			tourismVehicleBoxBonaId, tourismApplicationId, orderByComparator);
	}

	/**
	 * Removes all the tourism bona ground trans boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public static void removeBygetTAP_TAI(long tourismApplicationId) {
		getPersistence().removeBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona ground trans boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground trans boxes
	 */
	public static int countBygetTAP_TAI(long tourismApplicationId) {
		return getPersistence().countBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona ground trans box in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransBox the tourism bona ground trans box
	 */
	public static void cacheResult(
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		getPersistence().cacheResult(tourismBonaGroundTransBox);
	}

	/**
	 * Caches the tourism bona ground trans boxes in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransBoxes the tourism bona ground trans boxes
	 */
	public static void cacheResult(
		List<TourismBonaGroundTransBox> tourismBonaGroundTransBoxes) {

		getPersistence().cacheResult(tourismBonaGroundTransBoxes);
	}

	/**
	 * Creates a new tourism bona ground trans box with the primary key. Does not add the tourism bona ground trans box to the database.
	 *
	 * @param tourismVehicleBoxBonaId the primary key for the new tourism bona ground trans box
	 * @return the new tourism bona ground trans box
	 */
	public static TourismBonaGroundTransBox create(
		long tourismVehicleBoxBonaId) {

		return getPersistence().create(tourismVehicleBoxBonaId);
	}

	/**
	 * Removes the tourism bona ground trans box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box that was removed
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	public static TourismBonaGroundTransBox remove(long tourismVehicleBoxBonaId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransBoxException {

		return getPersistence().remove(tourismVehicleBoxBonaId);
	}

	public static TourismBonaGroundTransBox updateImpl(
		TourismBonaGroundTransBox tourismBonaGroundTransBox) {

		return getPersistence().updateImpl(tourismBonaGroundTransBox);
	}

	/**
	 * Returns the tourism bona ground trans box with the primary key or throws a <code>NoSuchTourismBonaGroundTransBoxException</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box
	 * @throws NoSuchTourismBonaGroundTransBoxException if a tourism bona ground trans box with the primary key could not be found
	 */
	public static TourismBonaGroundTransBox findByPrimaryKey(
			long tourismVehicleBoxBonaId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransBoxException {

		return getPersistence().findByPrimaryKey(tourismVehicleBoxBonaId);
	}

	/**
	 * Returns the tourism bona ground trans box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismVehicleBoxBonaId the primary key of the tourism bona ground trans box
	 * @return the tourism bona ground trans box, or <code>null</code> if a tourism bona ground trans box with the primary key could not be found
	 */
	public static TourismBonaGroundTransBox fetchByPrimaryKey(
		long tourismVehicleBoxBonaId) {

		return getPersistence().fetchByPrimaryKey(tourismVehicleBoxBonaId);
	}

	/**
	 * Returns all the tourism bona ground trans boxes.
	 *
	 * @return the tourism bona ground trans boxes
	 */
	public static List<TourismBonaGroundTransBox> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @return the range of tourism bona ground trans boxes
	 */
	public static List<TourismBonaGroundTransBox> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground trans boxes
	 */
	public static List<TourismBonaGroundTransBox> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground trans boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground trans boxes
	 * @param end the upper bound of the range of tourism bona ground trans boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground trans boxes
	 */
	public static List<TourismBonaGroundTransBox> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona ground trans boxes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona ground trans boxes.
	 *
	 * @return the number of tourism bona ground trans boxes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaGroundTransBoxPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaGroundTransBoxPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaGroundTransBoxPersistence _persistence;

}