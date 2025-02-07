/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionCarRentalLicence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction car rental licence service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionCarRentalLicencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCarRentalLicencePersistence
 * @generated
 */
public class AttractionCarRentalLicenceUtil {

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
		AttractionCarRentalLicence attractionCarRentalLicence) {

		getPersistence().clearCache(attractionCarRentalLicence);
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
	public static Map<Serializable, AttractionCarRentalLicence>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionCarRentalLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionCarRentalLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionCarRentalLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionCarRentalLicence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionCarRentalLicence update(
		AttractionCarRentalLicence attractionCarRentalLicence) {

		return getPersistence().update(attractionCarRentalLicence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionCarRentalLicence update(
		AttractionCarRentalLicence attractionCarRentalLicence,
		ServiceContext serviceContext) {

		return getPersistence().update(
			attractionCarRentalLicence, serviceContext);
	}

	/**
	 * Returns the attraction car rental licence where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCarRentalLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rental licence
	 * @throws NoSuchAttractionCarRentalLicenceException if a matching attraction car rental licence could not be found
	 */
	public static AttractionCarRentalLicence findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentalLicenceException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction car rental licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction car rental licence, or <code>null</code> if a matching attraction car rental licence could not be found
	 */
	public static AttractionCarRentalLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction car rental licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction car rental licence, or <code>null</code> if a matching attraction car rental licence could not be found
	 */
	public static AttractionCarRentalLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction car rental licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction car rental licence that was removed
	 */
	public static AttractionCarRentalLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentalLicenceException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction car rental licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction car rental licences
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction car rental licence in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentalLicence the attraction car rental licence
	 */
	public static void cacheResult(
		AttractionCarRentalLicence attractionCarRentalLicence) {

		getPersistence().cacheResult(attractionCarRentalLicence);
	}

	/**
	 * Caches the attraction car rental licences in the entity cache if it is enabled.
	 *
	 * @param attractionCarRentalLicences the attraction car rental licences
	 */
	public static void cacheResult(
		List<AttractionCarRentalLicence> attractionCarRentalLicences) {

		getPersistence().cacheResult(attractionCarRentalLicences);
	}

	/**
	 * Creates a new attraction car rental licence with the primary key. Does not add the attraction car rental licence to the database.
	 *
	 * @param attractionCarRentalLicId the primary key for the new attraction car rental licence
	 * @return the new attraction car rental licence
	 */
	public static AttractionCarRentalLicence create(
		long attractionCarRentalLicId) {

		return getPersistence().create(attractionCarRentalLicId);
	}

	/**
	 * Removes the attraction car rental licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence that was removed
	 * @throws NoSuchAttractionCarRentalLicenceException if a attraction car rental licence with the primary key could not be found
	 */
	public static AttractionCarRentalLicence remove(
			long attractionCarRentalLicId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentalLicenceException {

		return getPersistence().remove(attractionCarRentalLicId);
	}

	public static AttractionCarRentalLicence updateImpl(
		AttractionCarRentalLicence attractionCarRentalLicence) {

		return getPersistence().updateImpl(attractionCarRentalLicence);
	}

	/**
	 * Returns the attraction car rental licence with the primary key or throws a <code>NoSuchAttractionCarRentalLicenceException</code> if it could not be found.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence
	 * @throws NoSuchAttractionCarRentalLicenceException if a attraction car rental licence with the primary key could not be found
	 */
	public static AttractionCarRentalLicence findByPrimaryKey(
			long attractionCarRentalLicId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCarRentalLicenceException {

		return getPersistence().findByPrimaryKey(attractionCarRentalLicId);
	}

	/**
	 * Returns the attraction car rental licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCarRentalLicId the primary key of the attraction car rental licence
	 * @return the attraction car rental licence, or <code>null</code> if a attraction car rental licence with the primary key could not be found
	 */
	public static AttractionCarRentalLicence fetchByPrimaryKey(
		long attractionCarRentalLicId) {

		return getPersistence().fetchByPrimaryKey(attractionCarRentalLicId);
	}

	/**
	 * Returns all the attraction car rental licences.
	 *
	 * @return the attraction car rental licences
	 */
	public static List<AttractionCarRentalLicence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @return the range of attraction car rental licences
	 */
	public static List<AttractionCarRentalLicence> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction car rental licences
	 */
	public static List<AttractionCarRentalLicence> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentalLicence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction car rental licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCarRentalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction car rental licences
	 * @param end the upper bound of the range of attraction car rental licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction car rental licences
	 */
	public static List<AttractionCarRentalLicence> findAll(
		int start, int end,
		OrderByComparator<AttractionCarRentalLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction car rental licences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction car rental licences.
	 *
	 * @return the number of attraction car rental licences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionCarRentalLicencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionCarRentalLicencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionCarRentalLicencePersistence _persistence;

}