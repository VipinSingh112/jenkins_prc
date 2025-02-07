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

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionCarRentLicence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction car rent licence service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionCarRentLicencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentLicencePersistence
 * @generated
 */
public class AttractionCarRentLicenceUtil {

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
		AttractionCarRentLicence attractionCarRentLicence) {

		getPersistence().clearCache(attractionCarRentLicence);
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
	public static Map<Serializable, AttractionCarRentLicence>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionCarRentLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionCarRentLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionCarRentLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionCarRentLicence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionCarRentLicence update(
		AttractionCarRentLicence attractionCarRentLicence) {

		return getPersistence().update(attractionCarRentLicence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionCarRentLicence update(
		AttractionCarRentLicence attractionCarRentLicence,
		ServiceContext serviceContext) {

		return getPersistence().update(
			attractionCarRentLicence, serviceContext);
	}

	/**
	 * Returns the attraction car rent licence where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCarRentLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent licence
	 * @throws NoSuchAttractionCarRentLicenceException if a matching attraction car rent licence could not be found
	 */
	public static AttractionCarRentLicence findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentLicenceException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction car rent licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rent licence, or <code>null</code> if a matching attraction car rent licence could not be found
	 */
	public static AttractionCarRentLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction car rent licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction car rent licence, or <code>null</code> if a matching attraction car rent licence could not be found
	 */
	public static AttractionCarRentLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction car rent licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction car rent licence that was removed
	 */
	public static AttractionCarRentLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentLicenceException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction car rent licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction car rent licences
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction car rent licence in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentLicence the attraction car rent licence
	 */
	public static void cacheResult(
		AttractionCarRentLicence attractionCarRentLicence) {

		getPersistence().cacheResult(attractionCarRentLicence);
	}

	/**
	 * Caches the attraction car rent licences in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentLicences the attraction car rent licences
	 */
	public static void cacheResult(
		List<AttractionCarRentLicence> attractionCarRentLicences) {

		getPersistence().cacheResult(attractionCarRentLicences);
	}

	/**
	 * Creates a new attraction car rent licence with the primary key. Does not add the attraction car rent licence to the database.
	 *
	 * @param attractionCarRentLicenceId the primary key for the new attraction car rent licence
	 * @return the new attraction car rent licence
	 */
	public static AttractionCarRentLicence create(
		long attractionCarRentLicenceId) {

		return getPersistence().create(attractionCarRentLicenceId);
	}

	/**
	 * Removes the attraction car rent licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence that was removed
	 * @throws NoSuchAttractionCarRentLicenceException if a attraction car rent licence with the primary key could not be found
	 */
	public static AttractionCarRentLicence remove(
			long attractionCarRentLicenceId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentLicenceException {

		return getPersistence().remove(attractionCarRentLicenceId);
	}

	public static AttractionCarRentLicence updateImpl(
		AttractionCarRentLicence attractionCarRentLicence) {

		return getPersistence().updateImpl(attractionCarRentLicence);
	}

	/**
	 * Returns the attraction car rent licence with the primary key or throws a <code>NoSuchAttractionCarRentLicenceException</code> if it could not be found.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence
	 * @throws NoSuchAttractionCarRentLicenceException if a attraction car rent licence with the primary key could not be found
	 */
	public static AttractionCarRentLicence findByPrimaryKey(
			long attractionCarRentLicenceId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentLicenceException {

		return getPersistence().findByPrimaryKey(attractionCarRentLicenceId);
	}

	/**
	 * Returns the attraction car rent licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCarRentLicenceId the primary key of the attraction car rent licence
	 * @return the attraction car rent licence, or <code>null</code> if a attraction car rent licence with the primary key could not be found
	 */
	public static AttractionCarRentLicence fetchByPrimaryKey(
		long attractionCarRentLicenceId) {

		return getPersistence().fetchByPrimaryKey(attractionCarRentLicenceId);
	}

	/**
	 * Returns all the attraction car rent licences.
	 *
	 * @return the attraction car rent licences
	 */
	public static List<AttractionCarRentLicence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @return the range of attraction car rent licences
	 */
	public static List<AttractionCarRentLicence> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction car rent licences
	 */
	public static List<AttractionCarRentLicence> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentLicence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction car rent licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rent licences
	 * @param end the upper bound of the range of attraction car rent licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction car rent licences
	 */
	public static List<AttractionCarRentLicence> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction car rent licences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction car rent licences.
	 *
	 * @return the number of attraction car rent licences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionCarRentLicencePersistence getPersistence() {
		return _persistence;
	}

	private static volatile AttractionCarRentLicencePersistence _persistence;

}