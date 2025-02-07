/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgricultureBuilding;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture building service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgricultureBuildingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureBuildingPersistence
 * @generated
 */
public class AgricultureBuildingUtil {

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
	public static void clearCache(AgricultureBuilding agricultureBuilding) {
		getPersistence().clearCache(agricultureBuilding);
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
	public static Map<Serializable, AgricultureBuilding> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureBuilding> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureBuilding> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureBuilding> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureBuilding> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureBuilding update(
		AgricultureBuilding agricultureBuilding) {

		return getPersistence().update(agricultureBuilding);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureBuilding update(
		AgricultureBuilding agricultureBuilding,
		ServiceContext serviceContext) {

		return getPersistence().update(agricultureBuilding, serviceContext);
	}

	/**
	 * Returns the agriculture building where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureBuildingException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture building
	 * @throws NoSuchAgricultureBuildingException if a matching agriculture building could not be found
	 */
	public static AgricultureBuilding findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureBuildingException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture building where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	public static AgricultureBuilding fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture building where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	public static AgricultureBuilding fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture building where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture building that was removed
	 */
	public static AgricultureBuilding removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureBuildingException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture buildings
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture buildings
	 */
	public static List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId) {

		return getPersistence().findBygetAB_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @return the range of matching agriculture buildings
	 */
	public static List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetAB_by_AAI(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture buildings
	 */
	public static List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureBuilding> orderByComparator) {

		return getPersistence().findBygetAB_by_AAI(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture buildings
	 */
	public static List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureBuilding> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAB_by_AAI(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture building
	 * @throws NoSuchAgricultureBuildingException if a matching agriculture building could not be found
	 */
	public static AgricultureBuilding findBygetAB_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureBuilding> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureBuildingException {

		return getPersistence().findBygetAB_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	public static AgricultureBuilding fetchBygetAB_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureBuilding> orderByComparator) {

		return getPersistence().fetchBygetAB_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture building
	 * @throws NoSuchAgricultureBuildingException if a matching agriculture building could not be found
	 */
	public static AgricultureBuilding findBygetAB_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureBuilding> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureBuildingException {

		return getPersistence().findBygetAB_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	public static AgricultureBuilding fetchBygetAB_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureBuilding> orderByComparator) {

		return getPersistence().fetchBygetAB_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriculture buildings before and after the current agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureBuildingId the primary key of the current agriculture building
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture building
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	public static AgricultureBuilding[] findBygetAB_by_AAI_PrevAndNext(
			long agricultureBuildingId, long agricultureApplicationId,
			OrderByComparator<AgricultureBuilding> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureBuildingException {

		return getPersistence().findBygetAB_by_AAI_PrevAndNext(
			agricultureBuildingId, agricultureApplicationId, orderByComparator);
	}

	/**
	 * Removes all the agriculture buildings where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetAB_by_AAI(long agricultureApplicationId) {
		getPersistence().removeBygetAB_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture buildings
	 */
	public static int countBygetAB_by_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAB_by_AAI(agricultureApplicationId);
	}

	/**
	 * Caches the agriculture building in the entity cache if it is enabled.
	 *
	 * @param agricultureBuilding the agriculture building
	 */
	public static void cacheResult(AgricultureBuilding agricultureBuilding) {
		getPersistence().cacheResult(agricultureBuilding);
	}

	/**
	 * Caches the agriculture buildings in the entity cache if it is enabled.
	 *
	 * @param agricultureBuildings the agriculture buildings
	 */
	public static void cacheResult(
		List<AgricultureBuilding> agricultureBuildings) {

		getPersistence().cacheResult(agricultureBuildings);
	}

	/**
	 * Creates a new agriculture building with the primary key. Does not add the agriculture building to the database.
	 *
	 * @param agricultureBuildingId the primary key for the new agriculture building
	 * @return the new agriculture building
	 */
	public static AgricultureBuilding create(long agricultureBuildingId) {
		return getPersistence().create(agricultureBuildingId);
	}

	/**
	 * Removes the agriculture building with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building that was removed
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	public static AgricultureBuilding remove(long agricultureBuildingId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureBuildingException {

		return getPersistence().remove(agricultureBuildingId);
	}

	public static AgricultureBuilding updateImpl(
		AgricultureBuilding agricultureBuilding) {

		return getPersistence().updateImpl(agricultureBuilding);
	}

	/**
	 * Returns the agriculture building with the primary key or throws a <code>NoSuchAgricultureBuildingException</code> if it could not be found.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	public static AgricultureBuilding findByPrimaryKey(
			long agricultureBuildingId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureBuildingException {

		return getPersistence().findByPrimaryKey(agricultureBuildingId);
	}

	/**
	 * Returns the agriculture building with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building, or <code>null</code> if a agriculture building with the primary key could not be found
	 */
	public static AgricultureBuilding fetchByPrimaryKey(
		long agricultureBuildingId) {

		return getPersistence().fetchByPrimaryKey(agricultureBuildingId);
	}

	/**
	 * Returns all the agriculture buildings.
	 *
	 * @return the agriculture buildings
	 */
	public static List<AgricultureBuilding> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @return the range of agriculture buildings
	 */
	public static List<AgricultureBuilding> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture buildings
	 */
	public static List<AgricultureBuilding> findAll(
		int start, int end,
		OrderByComparator<AgricultureBuilding> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture buildings
	 */
	public static List<AgricultureBuilding> findAll(
		int start, int end,
		OrderByComparator<AgricultureBuilding> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture buildings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture buildings.
	 *
	 * @return the number of agriculture buildings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureBuildingPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgricultureBuildingPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgricultureBuildingPersistence _persistence;

}