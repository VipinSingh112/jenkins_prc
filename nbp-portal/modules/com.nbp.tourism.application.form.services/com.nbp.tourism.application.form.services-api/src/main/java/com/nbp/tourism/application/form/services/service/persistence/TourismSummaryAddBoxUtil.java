/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismSummaryAddBox;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism summary add box service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismSummaryAddBoxPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismSummaryAddBoxPersistence
 * @generated
 */
public class TourismSummaryAddBoxUtil {

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
	public static void clearCache(TourismSummaryAddBox tourismSummaryAddBox) {
		getPersistence().clearCache(tourismSummaryAddBox);
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
	public static Map<Serializable, TourismSummaryAddBox> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismSummaryAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismSummaryAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismSummaryAddBox> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismSummaryAddBox> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismSummaryAddBox update(
		TourismSummaryAddBox tourismSummaryAddBox) {

		return getPersistence().update(tourismSummaryAddBox);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismSummaryAddBox update(
		TourismSummaryAddBox tourismSummaryAddBox,
		ServiceContext serviceContext) {

		return getPersistence().update(tourismSummaryAddBox, serviceContext);
	}

	/**
	 * Returns all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism summary add boxes
	 */
	public static List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId) {

		return getPersistence().findBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns a range of all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @return the range of matching tourism summary add boxes
	 */
	public static List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism summary add boxes
	 */
	public static List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismSummaryAddBox> orderByComparator) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism summary add boxes
	 */
	public static List<TourismSummaryAddBox> findBygetTAP_TAI(
		long tourismApplicationId, int start, int end,
		OrderByComparator<TourismSummaryAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetTAP_TAI(
			tourismApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a matching tourism summary add box could not be found
	 */
	public static TourismSummaryAddBox findBygetTAP_TAI_First(
			long tourismApplicationId,
			OrderByComparator<TourismSummaryAddBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismSummaryAddBoxException {

		return getPersistence().findBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the first tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism summary add box, or <code>null</code> if a matching tourism summary add box could not be found
	 */
	public static TourismSummaryAddBox fetchBygetTAP_TAI_First(
		long tourismApplicationId,
		OrderByComparator<TourismSummaryAddBox> orderByComparator) {

		return getPersistence().fetchBygetTAP_TAI_First(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a matching tourism summary add box could not be found
	 */
	public static TourismSummaryAddBox findBygetTAP_TAI_Last(
			long tourismApplicationId,
			OrderByComparator<TourismSummaryAddBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismSummaryAddBoxException {

		return getPersistence().findBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the last tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism summary add box, or <code>null</code> if a matching tourism summary add box could not be found
	 */
	public static TourismSummaryAddBox fetchBygetTAP_TAI_Last(
		long tourismApplicationId,
		OrderByComparator<TourismSummaryAddBox> orderByComparator) {

		return getPersistence().fetchBygetTAP_TAI_Last(
			tourismApplicationId, orderByComparator);
	}

	/**
	 * Returns the tourism summary add boxes before and after the current tourism summary add box in the ordered set where tourismApplicationId = &#63;.
	 *
	 * @param tourismSummaryBoxId the primary key of the current tourism summary add box
	 * @param tourismApplicationId the tourism application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	public static TourismSummaryAddBox[] findBygetTAP_TAI_PrevAndNext(
			long tourismSummaryBoxId, long tourismApplicationId,
			OrderByComparator<TourismSummaryAddBox> orderByComparator)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismSummaryAddBoxException {

		return getPersistence().findBygetTAP_TAI_PrevAndNext(
			tourismSummaryBoxId, tourismApplicationId, orderByComparator);
	}

	/**
	 * Removes all the tourism summary add boxes where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 */
	public static void removeBygetTAP_TAI(long tourismApplicationId) {
		getPersistence().removeBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism summary add boxes where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism summary add boxes
	 */
	public static int countBygetTAP_TAI(long tourismApplicationId) {
		return getPersistence().countBygetTAP_TAI(tourismApplicationId);
	}

	/**
	 * Caches the tourism summary add box in the entity cache if it is enabled.
	 *
	 * @param tourismSummaryAddBox the tourism summary add box
	 */
	public static void cacheResult(TourismSummaryAddBox tourismSummaryAddBox) {
		getPersistence().cacheResult(tourismSummaryAddBox);
	}

	/**
	 * Caches the tourism summary add boxes in the entity cache if it is enabled.
	 *
	 * @param tourismSummaryAddBoxes the tourism summary add boxes
	 */
	public static void cacheResult(
		List<TourismSummaryAddBox> tourismSummaryAddBoxes) {

		getPersistence().cacheResult(tourismSummaryAddBoxes);
	}

	/**
	 * Creates a new tourism summary add box with the primary key. Does not add the tourism summary add box to the database.
	 *
	 * @param tourismSummaryBoxId the primary key for the new tourism summary add box
	 * @return the new tourism summary add box
	 */
	public static TourismSummaryAddBox create(long tourismSummaryBoxId) {
		return getPersistence().create(tourismSummaryBoxId);
	}

	/**
	 * Removes the tourism summary add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box that was removed
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	public static TourismSummaryAddBox remove(long tourismSummaryBoxId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismSummaryAddBoxException {

		return getPersistence().remove(tourismSummaryBoxId);
	}

	public static TourismSummaryAddBox updateImpl(
		TourismSummaryAddBox tourismSummaryAddBox) {

		return getPersistence().updateImpl(tourismSummaryAddBox);
	}

	/**
	 * Returns the tourism summary add box with the primary key or throws a <code>NoSuchTourismSummaryAddBoxException</code> if it could not be found.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box
	 * @throws NoSuchTourismSummaryAddBoxException if a tourism summary add box with the primary key could not be found
	 */
	public static TourismSummaryAddBox findByPrimaryKey(
			long tourismSummaryBoxId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismSummaryAddBoxException {

		return getPersistence().findByPrimaryKey(tourismSummaryBoxId);
	}

	/**
	 * Returns the tourism summary add box with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismSummaryBoxId the primary key of the tourism summary add box
	 * @return the tourism summary add box, or <code>null</code> if a tourism summary add box with the primary key could not be found
	 */
	public static TourismSummaryAddBox fetchByPrimaryKey(
		long tourismSummaryBoxId) {

		return getPersistence().fetchByPrimaryKey(tourismSummaryBoxId);
	}

	/**
	 * Returns all the tourism summary add boxes.
	 *
	 * @return the tourism summary add boxes
	 */
	public static List<TourismSummaryAddBox> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @return the range of tourism summary add boxes
	 */
	public static List<TourismSummaryAddBox> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism summary add boxes
	 */
	public static List<TourismSummaryAddBox> findAll(
		int start, int end,
		OrderByComparator<TourismSummaryAddBox> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism summary add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismSummaryAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism summary add boxes
	 * @param end the upper bound of the range of tourism summary add boxes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism summary add boxes
	 */
	public static List<TourismSummaryAddBox> findAll(
		int start, int end,
		OrderByComparator<TourismSummaryAddBox> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism summary add boxes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism summary add boxes.
	 *
	 * @return the number of tourism summary add boxes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismSummaryAddBoxPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismSummaryAddBoxPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismSummaryAddBoxPersistence _persistence;

}