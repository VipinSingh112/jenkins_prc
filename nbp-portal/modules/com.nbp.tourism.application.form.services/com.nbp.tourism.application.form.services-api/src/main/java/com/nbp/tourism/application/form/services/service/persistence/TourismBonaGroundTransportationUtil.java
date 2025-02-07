/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona ground transportation service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaGroundTransportationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationPersistence
 * @generated
 */
public class TourismBonaGroundTransportationUtil {

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
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		getPersistence().clearCache(tourismBonaGroundTransportation);
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
	public static Map<Serializable, TourismBonaGroundTransportation>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaGroundTransportation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaGroundTransportation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaGroundTransportation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismBonaGroundTransportation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaGroundTransportation update(
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		return getPersistence().update(tourismBonaGroundTransportation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaGroundTransportation update(
		TourismBonaGroundTransportation tourismBonaGroundTransportation,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaGroundTransportation, serviceContext);
	}

	/**
	 * Returns the tourism bona ground transportation where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation
	 * @throws NoSuchTourismBonaGroundTransportationException if a matching tourism bona ground transportation could not be found
	 */
	public static TourismBonaGroundTransportation findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation, or <code>null</code> if a matching tourism bona ground transportation could not be found
	 */
	public static TourismBonaGroundTransportation fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground transportation where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportation, or <code>null</code> if a matching tourism bona ground transportation could not be found
	 */
	public static TourismBonaGroundTransportation fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona ground transportation where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground transportation that was removed
	 */
	public static TourismBonaGroundTransportation removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona ground transportations where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground transportations
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism bona ground transportation in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportation the tourism bona ground transportation
	 */
	public static void cacheResult(
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		getPersistence().cacheResult(tourismBonaGroundTransportation);
	}

	/**
	 * Caches the tourism bona ground transportations in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportations the tourism bona ground transportations
	 */
	public static void cacheResult(
		List<TourismBonaGroundTransportation>
			tourismBonaGroundTransportations) {

		getPersistence().cacheResult(tourismBonaGroundTransportations);
	}

	/**
	 * Creates a new tourism bona ground transportation with the primary key. Does not add the tourism bona ground transportation to the database.
	 *
	 * @param tourismBonaGroundTransportId the primary key for the new tourism bona ground transportation
	 * @return the new tourism bona ground transportation
	 */
	public static TourismBonaGroundTransportation create(
		long tourismBonaGroundTransportId) {

		return getPersistence().create(tourismBonaGroundTransportId);
	}

	/**
	 * Removes the tourism bona ground transportation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation that was removed
	 * @throws NoSuchTourismBonaGroundTransportationException if a tourism bona ground transportation with the primary key could not be found
	 */
	public static TourismBonaGroundTransportation remove(
			long tourismBonaGroundTransportId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationException {

		return getPersistence().remove(tourismBonaGroundTransportId);
	}

	public static TourismBonaGroundTransportation updateImpl(
		TourismBonaGroundTransportation tourismBonaGroundTransportation) {

		return getPersistence().updateImpl(tourismBonaGroundTransportation);
	}

	/**
	 * Returns the tourism bona ground transportation with the primary key or throws a <code>NoSuchTourismBonaGroundTransportationException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation
	 * @throws NoSuchTourismBonaGroundTransportationException if a tourism bona ground transportation with the primary key could not be found
	 */
	public static TourismBonaGroundTransportation findByPrimaryKey(
			long tourismBonaGroundTransportId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationException {

		return getPersistence().findByPrimaryKey(tourismBonaGroundTransportId);
	}

	/**
	 * Returns the tourism bona ground transportation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransportId the primary key of the tourism bona ground transportation
	 * @return the tourism bona ground transportation, or <code>null</code> if a tourism bona ground transportation with the primary key could not be found
	 */
	public static TourismBonaGroundTransportation fetchByPrimaryKey(
		long tourismBonaGroundTransportId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaGroundTransportId);
	}

	/**
	 * Returns all the tourism bona ground transportations.
	 *
	 * @return the tourism bona ground transportations
	 */
	public static List<TourismBonaGroundTransportation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @return the range of tourism bona ground transportations
	 */
	public static List<TourismBonaGroundTransportation> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground transportations
	 */
	public static List<TourismBonaGroundTransportation> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportations
	 * @param end the upper bound of the range of tourism bona ground transportations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground transportations
	 */
	public static List<TourismBonaGroundTransportation> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona ground transportations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona ground transportations.
	 *
	 * @return the number of tourism bona ground transportations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaGroundTransportationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismBonaGroundTransportationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaGroundTransportationPersistence
		_persistence;

}