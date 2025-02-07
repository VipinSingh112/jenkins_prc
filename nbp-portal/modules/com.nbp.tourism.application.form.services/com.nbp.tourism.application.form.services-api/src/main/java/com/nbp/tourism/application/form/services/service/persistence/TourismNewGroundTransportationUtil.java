/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewGroundTransportation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new ground transportation service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewGroundTransportationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundTransportationPersistence
 * @generated
 */
public class TourismNewGroundTransportationUtil {

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
		TourismNewGroundTransportation tourismNewGroundTransportation) {

		getPersistence().clearCache(tourismNewGroundTransportation);
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
	public static Map<Serializable, TourismNewGroundTransportation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewGroundTransportation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewGroundTransportation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewGroundTransportation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewGroundTransportation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewGroundTransportation update(
		TourismNewGroundTransportation tourismNewGroundTransportation) {

		return getPersistence().update(tourismNewGroundTransportation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewGroundTransportation update(
		TourismNewGroundTransportation tourismNewGroundTransportation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewGroundTransportation, serviceContext);
	}

	/**
	 * Returns the tourism new ground transportation where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewGroundTransportationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground transportation
	 * @throws NoSuchTourismNewGroundTransportationException if a matching tourism new ground transportation could not be found
	 */
	public static TourismNewGroundTransportation findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewGroundTransportationException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground transportation, or <code>null</code> if a matching tourism new ground transportation could not be found
	 */
	public static TourismNewGroundTransportation fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new ground transportation, or <code>null</code> if a matching tourism new ground transportation could not be found
	 */
	public static TourismNewGroundTransportation fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new ground transportation where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new ground transportation that was removed
	 */
	public static TourismNewGroundTransportation removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewGroundTransportationException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new ground transportations where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new ground transportations
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new ground transportation in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundTransportation the tourism new ground transportation
	 */
	public static void cacheResult(
		TourismNewGroundTransportation tourismNewGroundTransportation) {

		getPersistence().cacheResult(tourismNewGroundTransportation);
	}

	/**
	 * Caches the tourism new ground transportations in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundTransportations the tourism new ground transportations
	 */
	public static void cacheResult(
		List<TourismNewGroundTransportation> tourismNewGroundTransportations) {

		getPersistence().cacheResult(tourismNewGroundTransportations);
	}

	/**
	 * Creates a new tourism new ground transportation with the primary key. Does not add the tourism new ground transportation to the database.
	 *
	 * @param TourismNewGroundTransId the primary key for the new tourism new ground transportation
	 * @return the new tourism new ground transportation
	 */
	public static TourismNewGroundTransportation create(
		long TourismNewGroundTransId) {

		return getPersistence().create(TourismNewGroundTransId);
	}

	/**
	 * Removes the tourism new ground transportation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewGroundTransId the primary key of the tourism new ground transportation
	 * @return the tourism new ground transportation that was removed
	 * @throws NoSuchTourismNewGroundTransportationException if a tourism new ground transportation with the primary key could not be found
	 */
	public static TourismNewGroundTransportation remove(
			long TourismNewGroundTransId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewGroundTransportationException {

		return getPersistence().remove(TourismNewGroundTransId);
	}

	public static TourismNewGroundTransportation updateImpl(
		TourismNewGroundTransportation tourismNewGroundTransportation) {

		return getPersistence().updateImpl(tourismNewGroundTransportation);
	}

	/**
	 * Returns the tourism new ground transportation with the primary key or throws a <code>NoSuchTourismNewGroundTransportationException</code> if it could not be found.
	 *
	 * @param TourismNewGroundTransId the primary key of the tourism new ground transportation
	 * @return the tourism new ground transportation
	 * @throws NoSuchTourismNewGroundTransportationException if a tourism new ground transportation with the primary key could not be found
	 */
	public static TourismNewGroundTransportation findByPrimaryKey(
			long TourismNewGroundTransId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewGroundTransportationException {

		return getPersistence().findByPrimaryKey(TourismNewGroundTransId);
	}

	/**
	 * Returns the tourism new ground transportation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewGroundTransId the primary key of the tourism new ground transportation
	 * @return the tourism new ground transportation, or <code>null</code> if a tourism new ground transportation with the primary key could not be found
	 */
	public static TourismNewGroundTransportation fetchByPrimaryKey(
		long TourismNewGroundTransId) {

		return getPersistence().fetchByPrimaryKey(TourismNewGroundTransId);
	}

	/**
	 * Returns all the tourism new ground transportations.
	 *
	 * @return the tourism new ground transportations
	 */
	public static List<TourismNewGroundTransportation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground transportations
	 * @param end the upper bound of the range of tourism new ground transportations (not inclusive)
	 * @return the range of tourism new ground transportations
	 */
	public static List<TourismNewGroundTransportation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground transportations
	 * @param end the upper bound of the range of tourism new ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new ground transportations
	 */
	public static List<TourismNewGroundTransportation> findAll(
		int start, int end,
		OrderByComparator<TourismNewGroundTransportation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground transportations
	 * @param end the upper bound of the range of tourism new ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new ground transportations
	 */
	public static List<TourismNewGroundTransportation> findAll(
		int start, int end,
		OrderByComparator<TourismNewGroundTransportation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new ground transportations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new ground transportations.
	 *
	 * @return the number of tourism new ground transportations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewGroundTransportationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewGroundTransportationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewGroundTransportationPersistence
		_persistence;

}