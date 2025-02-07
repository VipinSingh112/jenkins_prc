/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionWaterRequired;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction water required service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionWaterRequiredPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterRequiredPersistence
 * @generated
 */
public class AttractionWaterRequiredUtil {

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
		AttractionWaterRequired attractionWaterRequired) {

		getPersistence().clearCache(attractionWaterRequired);
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
	public static Map<Serializable, AttractionWaterRequired> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionWaterRequired> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionWaterRequired> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionWaterRequired> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionWaterRequired> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionWaterRequired update(
		AttractionWaterRequired attractionWaterRequired) {

		return getPersistence().update(attractionWaterRequired);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionWaterRequired update(
		AttractionWaterRequired attractionWaterRequired,
		ServiceContext serviceContext) {

		return getPersistence().update(attractionWaterRequired, serviceContext);
	}

	/**
	 * Returns the attraction water required where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionWaterRequiredException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water required
	 * @throws NoSuchAttractionWaterRequiredException if a matching attraction water required could not be found
	 */
	public static AttractionWaterRequired findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterRequiredException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction water required where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction water required, or <code>null</code> if a matching attraction water required could not be found
	 */
	public static AttractionWaterRequired fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction water required where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction water required, or <code>null</code> if a matching attraction water required could not be found
	 */
	public static AttractionWaterRequired fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction water required where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction water required that was removed
	 */
	public static AttractionWaterRequired removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterRequiredException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction water requireds where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction water requireds
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction water required in the entity cache if it is enabled.
	 *
	 * @param attractionWaterRequired the attraction water required
	 */
	public static void cacheResult(
		AttractionWaterRequired attractionWaterRequired) {

		getPersistence().cacheResult(attractionWaterRequired);
	}

	/**
	 * Caches the attraction water requireds in the entity cache if it is enabled.
	 *
	 * @param attractionWaterRequireds the attraction water requireds
	 */
	public static void cacheResult(
		List<AttractionWaterRequired> attractionWaterRequireds) {

		getPersistence().cacheResult(attractionWaterRequireds);
	}

	/**
	 * Creates a new attraction water required with the primary key. Does not add the attraction water required to the database.
	 *
	 * @param attractionWaterRequiredId the primary key for the new attraction water required
	 * @return the new attraction water required
	 */
	public static AttractionWaterRequired create(
		long attractionWaterRequiredId) {

		return getPersistence().create(attractionWaterRequiredId);
	}

	/**
	 * Removes the attraction water required with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required that was removed
	 * @throws NoSuchAttractionWaterRequiredException if a attraction water required with the primary key could not be found
	 */
	public static AttractionWaterRequired remove(long attractionWaterRequiredId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterRequiredException {

		return getPersistence().remove(attractionWaterRequiredId);
	}

	public static AttractionWaterRequired updateImpl(
		AttractionWaterRequired attractionWaterRequired) {

		return getPersistence().updateImpl(attractionWaterRequired);
	}

	/**
	 * Returns the attraction water required with the primary key or throws a <code>NoSuchAttractionWaterRequiredException</code> if it could not be found.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required
	 * @throws NoSuchAttractionWaterRequiredException if a attraction water required with the primary key could not be found
	 */
	public static AttractionWaterRequired findByPrimaryKey(
			long attractionWaterRequiredId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionWaterRequiredException {

		return getPersistence().findByPrimaryKey(attractionWaterRequiredId);
	}

	/**
	 * Returns the attraction water required with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionWaterRequiredId the primary key of the attraction water required
	 * @return the attraction water required, or <code>null</code> if a attraction water required with the primary key could not be found
	 */
	public static AttractionWaterRequired fetchByPrimaryKey(
		long attractionWaterRequiredId) {

		return getPersistence().fetchByPrimaryKey(attractionWaterRequiredId);
	}

	/**
	 * Returns all the attraction water requireds.
	 *
	 * @return the attraction water requireds
	 */
	public static List<AttractionWaterRequired> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @return the range of attraction water requireds
	 */
	public static List<AttractionWaterRequired> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction water requireds
	 */
	public static List<AttractionWaterRequired> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterRequired> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction water requireds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionWaterRequiredModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction water requireds
	 * @param end the upper bound of the range of attraction water requireds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction water requireds
	 */
	public static List<AttractionWaterRequired> findAll(
		int start, int end,
		OrderByComparator<AttractionWaterRequired> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction water requireds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction water requireds.
	 *
	 * @return the number of attraction water requireds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionWaterRequiredPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionWaterRequiredPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionWaterRequiredPersistence _persistence;

}