/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionDomesticTour;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction domestic tour service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionDomesticTourPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticTourPersistence
 * @generated
 */
public class AttractionDomesticTourUtil {

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
		AttractionDomesticTour attractionDomesticTour) {

		getPersistence().clearCache(attractionDomesticTour);
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
	public static Map<Serializable, AttractionDomesticTour> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionDomesticTour> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionDomesticTour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionDomesticTour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionDomesticTour> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionDomesticTour update(
		AttractionDomesticTour attractionDomesticTour) {

		return getPersistence().update(attractionDomesticTour);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionDomesticTour update(
		AttractionDomesticTour attractionDomesticTour,
		ServiceContext serviceContext) {

		return getPersistence().update(attractionDomesticTour, serviceContext);
	}

	/**
	 * Returns the attraction domestic tour where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionDomesticTourException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic tour
	 * @throws NoSuchAttractionDomesticTourException if a matching attraction domestic tour could not be found
	 */
	public static AttractionDomesticTour findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticTourException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction domestic tour where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic tour, or <code>null</code> if a matching attraction domestic tour could not be found
	 */
	public static AttractionDomesticTour fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction domestic tour where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction domestic tour, or <code>null</code> if a matching attraction domestic tour could not be found
	 */
	public static AttractionDomesticTour fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction domestic tour where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction domestic tour that was removed
	 */
	public static AttractionDomesticTour removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticTourException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction domestic tours where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction domestic tours
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction domestic tour in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticTour the attraction domestic tour
	 */
	public static void cacheResult(
		AttractionDomesticTour attractionDomesticTour) {

		getPersistence().cacheResult(attractionDomesticTour);
	}

	/**
	 * Caches the attraction domestic tours in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticTours the attraction domestic tours
	 */
	public static void cacheResult(
		List<AttractionDomesticTour> attractionDomesticTours) {

		getPersistence().cacheResult(attractionDomesticTours);
	}

	/**
	 * Creates a new attraction domestic tour with the primary key. Does not add the attraction domestic tour to the database.
	 *
	 * @param attractionDomesticTourId the primary key for the new attraction domestic tour
	 * @return the new attraction domestic tour
	 */
	public static AttractionDomesticTour create(long attractionDomesticTourId) {
		return getPersistence().create(attractionDomesticTourId);
	}

	/**
	 * Removes the attraction domestic tour with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour that was removed
	 * @throws NoSuchAttractionDomesticTourException if a attraction domestic tour with the primary key could not be found
	 */
	public static AttractionDomesticTour remove(long attractionDomesticTourId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticTourException {

		return getPersistence().remove(attractionDomesticTourId);
	}

	public static AttractionDomesticTour updateImpl(
		AttractionDomesticTour attractionDomesticTour) {

		return getPersistence().updateImpl(attractionDomesticTour);
	}

	/**
	 * Returns the attraction domestic tour with the primary key or throws a <code>NoSuchAttractionDomesticTourException</code> if it could not be found.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour
	 * @throws NoSuchAttractionDomesticTourException if a attraction domestic tour with the primary key could not be found
	 */
	public static AttractionDomesticTour findByPrimaryKey(
			long attractionDomesticTourId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionDomesticTourException {

		return getPersistence().findByPrimaryKey(attractionDomesticTourId);
	}

	/**
	 * Returns the attraction domestic tour with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionDomesticTourId the primary key of the attraction domestic tour
	 * @return the attraction domestic tour, or <code>null</code> if a attraction domestic tour with the primary key could not be found
	 */
	public static AttractionDomesticTour fetchByPrimaryKey(
		long attractionDomesticTourId) {

		return getPersistence().fetchByPrimaryKey(attractionDomesticTourId);
	}

	/**
	 * Returns all the attraction domestic tours.
	 *
	 * @return the attraction domestic tours
	 */
	public static List<AttractionDomesticTour> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @return the range of attraction domestic tours
	 */
	public static List<AttractionDomesticTour> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction domestic tours
	 */
	public static List<AttractionDomesticTour> findAll(
		int start, int end,
		OrderByComparator<AttractionDomesticTour> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction domestic tours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticTourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic tours
	 * @param end the upper bound of the range of attraction domestic tours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction domestic tours
	 */
	public static List<AttractionDomesticTour> findAll(
		int start, int end,
		OrderByComparator<AttractionDomesticTour> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction domestic tours from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction domestic tours.
	 *
	 * @return the number of attraction domestic tours
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionDomesticTourPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionDomesticTourPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionDomesticTourPersistence _persistence;

}