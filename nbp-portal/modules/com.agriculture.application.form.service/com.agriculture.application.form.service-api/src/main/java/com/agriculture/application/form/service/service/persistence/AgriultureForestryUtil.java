/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgriultureForestry;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriulture forestry service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgriultureForestryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriultureForestryPersistence
 * @generated
 */
public class AgriultureForestryUtil {

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
	public static void clearCache(AgriultureForestry agriultureForestry) {
		getPersistence().clearCache(agriultureForestry);
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
	public static Map<Serializable, AgriultureForestry> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgriultureForestry> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgriultureForestry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgriultureForestry> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgriultureForestry> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgriultureForestry update(
		AgriultureForestry agriultureForestry) {

		return getPersistence().update(agriultureForestry);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgriultureForestry update(
		AgriultureForestry agriultureForestry, ServiceContext serviceContext) {

		return getPersistence().update(agriultureForestry, serviceContext);
	}

	/**
	 * Returns the agriulture forestry where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriultureForestryException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a matching agriulture forestry could not be found
	 */
	public static AgriultureForestry findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriultureForestryException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriulture forestry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	public static AgriultureForestry fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriulture forestry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	public static AgriultureForestry fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriulture forestry where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriulture forestry that was removed
	 */
	public static AgriultureForestry removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriultureForestryException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriulture forestries
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriulture forestries
	 */
	public static List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId) {

		return getPersistence().findBygetAForest_by_AAI(
			agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @return the range of matching agriulture forestries
	 */
	public static List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetAForest_by_AAI(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriulture forestries
	 */
	public static List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriultureForestry> orderByComparator) {

		return getPersistence().findBygetAForest_by_AAI(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriulture forestries
	 */
	public static List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriultureForestry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAForest_by_AAI(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a matching agriulture forestry could not be found
	 */
	public static AgriultureForestry findBygetAForest_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgriultureForestry> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriultureForestryException {

		return getPersistence().findBygetAForest_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	public static AgriultureForestry fetchBygetAForest_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgriultureForestry> orderByComparator) {

		return getPersistence().fetchBygetAForest_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a matching agriulture forestry could not be found
	 */
	public static AgriultureForestry findBygetAForest_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgriultureForestry> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriultureForestryException {

		return getPersistence().findBygetAForest_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	public static AgriultureForestry fetchBygetAForest_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgriultureForestry> orderByComparator) {

		return getPersistence().fetchBygetAForest_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriulture forestries before and after the current agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agriultureForestryId the primary key of the current agriulture forestry
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	public static AgriultureForestry[] findBygetAForest_by_AAI_PrevAndNext(
			long agriultureForestryId, long agricultureApplicationId,
			OrderByComparator<AgriultureForestry> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriultureForestryException {

		return getPersistence().findBygetAForest_by_AAI_PrevAndNext(
			agriultureForestryId, agricultureApplicationId, orderByComparator);
	}

	/**
	 * Removes all the agriulture forestries where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetAForest_by_AAI(
		long agricultureApplicationId) {

		getPersistence().removeBygetAForest_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriulture forestries
	 */
	public static int countBygetAForest_by_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAForest_by_AAI(
			agricultureApplicationId);
	}

	/**
	 * Caches the agriulture forestry in the entity cache if it is enabled.
	 *
	 * @param agriultureForestry the agriulture forestry
	 */
	public static void cacheResult(AgriultureForestry agriultureForestry) {
		getPersistence().cacheResult(agriultureForestry);
	}

	/**
	 * Caches the agriulture forestries in the entity cache if it is enabled.
	 *
	 * @param agriultureForestries the agriulture forestries
	 */
	public static void cacheResult(
		List<AgriultureForestry> agriultureForestries) {

		getPersistence().cacheResult(agriultureForestries);
	}

	/**
	 * Creates a new agriulture forestry with the primary key. Does not add the agriulture forestry to the database.
	 *
	 * @param agriultureForestryId the primary key for the new agriulture forestry
	 * @return the new agriulture forestry
	 */
	public static AgriultureForestry create(long agriultureForestryId) {
		return getPersistence().create(agriultureForestryId);
	}

	/**
	 * Removes the agriulture forestry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry that was removed
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	public static AgriultureForestry remove(long agriultureForestryId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriultureForestryException {

		return getPersistence().remove(agriultureForestryId);
	}

	public static AgriultureForestry updateImpl(
		AgriultureForestry agriultureForestry) {

		return getPersistence().updateImpl(agriultureForestry);
	}

	/**
	 * Returns the agriulture forestry with the primary key or throws a <code>NoSuchAgriultureForestryException</code> if it could not be found.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	public static AgriultureForestry findByPrimaryKey(long agriultureForestryId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriultureForestryException {

		return getPersistence().findByPrimaryKey(agriultureForestryId);
	}

	/**
	 * Returns the agriulture forestry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry, or <code>null</code> if a agriulture forestry with the primary key could not be found
	 */
	public static AgriultureForestry fetchByPrimaryKey(
		long agriultureForestryId) {

		return getPersistence().fetchByPrimaryKey(agriultureForestryId);
	}

	/**
	 * Returns all the agriulture forestries.
	 *
	 * @return the agriulture forestries
	 */
	public static List<AgriultureForestry> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @return the range of agriulture forestries
	 */
	public static List<AgriultureForestry> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriulture forestries
	 */
	public static List<AgriultureForestry> findAll(
		int start, int end,
		OrderByComparator<AgriultureForestry> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriulture forestries
	 */
	public static List<AgriultureForestry> findAll(
		int start, int end,
		OrderByComparator<AgriultureForestry> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriulture forestries from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriulture forestries.
	 *
	 * @return the number of agriulture forestries
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgriultureForestryPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgriultureForestryPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgriultureForestryPersistence _persistence;

}