/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismAnnualEntertainBox;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism annual entertain box service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismAnnualEntertainBoxPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismAnnualEntertainBoxPersistence
 * @generated
 */
public class TourismAnnualEntertainBoxUtil {

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
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		getPersistence().clearCache(tourismAnnualEntertainBox);
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
	public static Map<Serializable, TourismAnnualEntertainBox>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismAnnualEntertainBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismAnnualEntertainBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismAnnualEntertainBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismAnnualEntertainBox update(
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		return getPersistence().update(tourismAnnualEntertainBox);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismAnnualEntertainBox update(
		TourismAnnualEntertainBox tourismAnnualEntertainBox,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismAnnualEntertainBox, serviceContext);
	}

	/**
	 * Returns all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism annual entertain boxes
	 */
	public static List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId) {

		return getPersistence().findBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns a range of all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @return the range of matching tourism annual entertain boxes
	 */
	public static List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism annual entertain boxes
	 */
	public static List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism annual entertain boxes
	 */
	public static List<TourismAnnualEntertainBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a matching tourism annual entertain box could not be found
	 */
	public static TourismAnnualEntertainBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			OrderByComparator<TourismAnnualEntertainBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismAnnualEntertainBoxException {

		return getPersistence().findBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the first tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism annual entertain box, or <code>null</code> if a matching tourism annual entertain box could not be found
	 */
	public static TourismAnnualEntertainBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator) {

		return getPersistence().fetchBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a matching tourism annual entertain box could not be found
	 */
	public static TourismAnnualEntertainBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			OrderByComparator<TourismAnnualEntertainBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismAnnualEntertainBoxException {

		return getPersistence().findBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism annual entertain box, or <code>null</code> if a matching tourism annual entertain box could not be found
	 */
	public static TourismAnnualEntertainBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator) {

		return getPersistence().fetchBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the tourism annual entertain boxes before and after the current tourism annual entertain box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the current tourism annual entertain box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	public static TourismAnnualEntertainBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismAnnualEntertainBoxId, long tourismApplicationId,
			OrderByComparator<TourismAnnualEntertainBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismAnnualEntertainBoxException {

		return getPersistence().findBygetTAP_TAI_PrevAndNext(
			tourismAnnualEntertainBoxId, tourismApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the tourism annual entertain boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public static void removeBygetTAP_TAI(long tourismApplicationId) {
		getPersistence().removeBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism annual entertain boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism annual entertain boxes
	 */
	public static int countBygetTAP_TAI(long tourismApplicationId) {
		return getPersistence().countBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Caches the tourism annual entertain box in the entity cache if it is enabled.
	 *
	 * @param tourismAnnualEntertainBox the tourism annual entertain box
	 */
	public static void cacheResult(
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		getPersistence().cacheResult(tourismAnnualEntertainBox);
	}

	/**
	 * Caches the tourism annual entertain boxes in the entity cache if it is enabled.
	 *
	 * @param tourismAnnualEntertainBoxes the tourism annual entertain boxes
	 */
	public static void cacheResult(
		List<TourismAnnualEntertainBox> tourismAnnualEntertainBoxes) {

		getPersistence().cacheResult(tourismAnnualEntertainBoxes);
	}

	/**
	 * Creates a new tourism annual entertain box with the primary key. Does not add the tourism annual entertain box to the database.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key for the new tourism annual entertain box
	 * @return the new tourism annual entertain box
	 */
	public static TourismAnnualEntertainBox create(
		long tourismAnnualEntertainBoxId) {

		return getPersistence().create(tourismAnnualEntertainBoxId);
	}

	/**
	 * Removes the tourism annual entertain box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box that was removed
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	public static TourismAnnualEntertainBox remove(
			long tourismAnnualEntertainBoxId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismAnnualEntertainBoxException {

		return getPersistence().remove(tourismAnnualEntertainBoxId);
	}

	public static TourismAnnualEntertainBox updateImpl(
		TourismAnnualEntertainBox tourismAnnualEntertainBox) {

		return getPersistence().updateImpl(tourismAnnualEntertainBox);
	}

	/**
	 * Returns the tourism annual entertain box with the primary key or throws a <code>NoSuchTourismAnnualEntertainBoxException</code> if it could not be found.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box
	 * @throws NoSuchTourismAnnualEntertainBoxException if a tourism annual entertain box with the primary key could not be found
	 */
	public static TourismAnnualEntertainBox findByPrimaryKey(
			long tourismAnnualEntertainBoxId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismAnnualEntertainBoxException {

		return getPersistence().findByPrimaryKey(tourismAnnualEntertainBoxId);
	}

	/**
	 * Returns the tourism annual entertain box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismAnnualEntertainBoxId the primary key of the tourism annual entertain box
	 * @return the tourism annual entertain box, or <code>null</code> if a tourism annual entertain box with the primary key could not be found
	 */
	public static TourismAnnualEntertainBox fetchByPrimaryKey(
		long tourismAnnualEntertainBoxId) {

		return getPersistence().fetchByPrimaryKey(tourismAnnualEntertainBoxId);
	}

	/**
	 * Returns all the tourism annual entertain boxes.
	 *
	 * @return the tourism annual entertain boxes
	 */
	public static List<TourismAnnualEntertainBox> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @return the range of tourism annual entertain boxes
	 */
	public static List<TourismAnnualEntertainBox> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism annual entertain boxes
	 */
	public static List<TourismAnnualEntertainBox> findAll(
		int start, int end,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism annual entertain boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismAnnualEntertainBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism annual entertain boxes
	 * @param end the upper bound of the range of tourism annual entertain boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism annual entertain boxes
	 */
	public static List<TourismAnnualEntertainBox> findAll(
		int start, int end,
		OrderByComparator<TourismAnnualEntertainBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism annual entertain boxes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism annual entertain boxes.
	 *
	 * @return the number of tourism annual entertain boxes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismAnnualEntertainBoxPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismAnnualEntertainBoxPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismAnnualEntertainBoxPersistence _persistence;

}