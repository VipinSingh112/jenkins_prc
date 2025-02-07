/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionPlaceOfInterest;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction place of interest service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionPlaceOfInterestPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionPlaceOfInterestPersistence
 * @generated
 */
public class AttractionPlaceOfInterestUtil {

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
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		getPersistence().clearCache(attractionPlaceOfInterest);
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
	public static Map<Serializable, AttractionPlaceOfInterest>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionPlaceOfInterest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionPlaceOfInterest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionPlaceOfInterest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionPlaceOfInterest> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionPlaceOfInterest update(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		return getPersistence().update(attractionPlaceOfInterest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionPlaceOfInterest update(
		AttractionPlaceOfInterest attractionPlaceOfInterest,
		ServiceContext serviceContext) {

		return getPersistence().update(
			attractionPlaceOfInterest, serviceContext);
	}

	/**
	 * Returns the attraction place of interest where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionPlaceOfInterestException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction place of interest
	 * @throws NoSuchAttractionPlaceOfInterestException if a matching attraction place of interest could not be found
	 */
	public static AttractionPlaceOfInterest findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionPlaceOfInterestException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction place of interest where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction place of interest, or <code>null</code> if a matching attraction place of interest could not be found
	 */
	public static AttractionPlaceOfInterest fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction place of interest where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction place of interest, or <code>null</code> if a matching attraction place of interest could not be found
	 */
	public static AttractionPlaceOfInterest fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction place of interest where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction place of interest that was removed
	 */
	public static AttractionPlaceOfInterest removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionPlaceOfInterestException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction place of interests where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction place of interests
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction place of interest in the entity cache if it is enabled.
	 *
	 * @param attractionPlaceOfInterest the attraction place of interest
	 */
	public static void cacheResult(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		getPersistence().cacheResult(attractionPlaceOfInterest);
	}

	/**
	 * Caches the attraction place of interests in the entity cache if it is enabled.
	 *
	 * @param attractionPlaceOfInterests the attraction place of interests
	 */
	public static void cacheResult(
		List<AttractionPlaceOfInterest> attractionPlaceOfInterests) {

		getPersistence().cacheResult(attractionPlaceOfInterests);
	}

	/**
	 * Creates a new attraction place of interest with the primary key. Does not add the attraction place of interest to the database.
	 *
	 * @param attractionPlaceOfInterestId the primary key for the new attraction place of interest
	 * @return the new attraction place of interest
	 */
	public static AttractionPlaceOfInterest create(
		long attractionPlaceOfInterestId) {

		return getPersistence().create(attractionPlaceOfInterestId);
	}

	/**
	 * Removes the attraction place of interest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest that was removed
	 * @throws NoSuchAttractionPlaceOfInterestException if a attraction place of interest with the primary key could not be found
	 */
	public static AttractionPlaceOfInterest remove(
			long attractionPlaceOfInterestId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionPlaceOfInterestException {

		return getPersistence().remove(attractionPlaceOfInterestId);
	}

	public static AttractionPlaceOfInterest updateImpl(
		AttractionPlaceOfInterest attractionPlaceOfInterest) {

		return getPersistence().updateImpl(attractionPlaceOfInterest);
	}

	/**
	 * Returns the attraction place of interest with the primary key or throws a <code>NoSuchAttractionPlaceOfInterestException</code> if it could not be found.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest
	 * @throws NoSuchAttractionPlaceOfInterestException if a attraction place of interest with the primary key could not be found
	 */
	public static AttractionPlaceOfInterest findByPrimaryKey(
			long attractionPlaceOfInterestId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionPlaceOfInterestException {

		return getPersistence().findByPrimaryKey(attractionPlaceOfInterestId);
	}

	/**
	 * Returns the attraction place of interest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionPlaceOfInterestId the primary key of the attraction place of interest
	 * @return the attraction place of interest, or <code>null</code> if a attraction place of interest with the primary key could not be found
	 */
	public static AttractionPlaceOfInterest fetchByPrimaryKey(
		long attractionPlaceOfInterestId) {

		return getPersistence().fetchByPrimaryKey(attractionPlaceOfInterestId);
	}

	/**
	 * Returns all the attraction place of interests.
	 *
	 * @return the attraction place of interests
	 */
	public static List<AttractionPlaceOfInterest> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @return the range of attraction place of interests
	 */
	public static List<AttractionPlaceOfInterest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction place of interests
	 */
	public static List<AttractionPlaceOfInterest> findAll(
		int start, int end,
		OrderByComparator<AttractionPlaceOfInterest> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction place of interests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionPlaceOfInterestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction place of interests
	 * @param end the upper bound of the range of attraction place of interests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction place of interests
	 */
	public static List<AttractionPlaceOfInterest> findAll(
		int start, int end,
		OrderByComparator<AttractionPlaceOfInterest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction place of interests from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction place of interests.
	 *
	 * @return the number of attraction place of interests
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionPlaceOfInterestPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionPlaceOfInterestPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionPlaceOfInterestPersistence _persistence;

}