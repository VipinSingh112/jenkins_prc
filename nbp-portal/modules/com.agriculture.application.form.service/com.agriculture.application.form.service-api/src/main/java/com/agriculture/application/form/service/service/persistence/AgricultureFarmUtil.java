/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgricultureFarm;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agriculture farm service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgricultureFarmPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureFarmPersistence
 * @generated
 */
public class AgricultureFarmUtil {

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
	public static void clearCache(AgricultureFarm agricultureFarm) {
		getPersistence().clearCache(agricultureFarm);
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
	public static Map<Serializable, AgricultureFarm> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultureFarm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultureFarm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultureFarm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultureFarm> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultureFarm update(AgricultureFarm agricultureFarm) {
		return getPersistence().update(agricultureFarm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultureFarm update(
		AgricultureFarm agricultureFarm, ServiceContext serviceContext) {

		return getPersistence().update(agricultureFarm, serviceContext);
	}

	/**
	 * Returns the agriculture farm where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureFarmException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture farm
	 * @throws NoSuchAgricultureFarmException if a matching agriculture farm could not be found
	 */
	public static AgricultureFarm findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureFarmException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture farm where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	public static AgricultureFarm fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agriculture farm where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	public static AgricultureFarm fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agriculture farm where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture farm that was removed
	 */
	public static AgricultureFarm removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureFarmException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture farms
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture farms
	 */
	public static List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId) {

		return getPersistence().findBygetAFa_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @return the range of matching agriculture farms
	 */
	public static List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetAFa_by_AAI(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture farms
	 */
	public static List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureFarm> orderByComparator) {

		return getPersistence().findBygetAFa_by_AAI(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture farms
	 */
	public static List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureFarm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAFa_by_AAI(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture farm
	 * @throws NoSuchAgricultureFarmException if a matching agriculture farm could not be found
	 */
	public static AgricultureFarm findBygetAFa_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureFarm> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureFarmException {

		return getPersistence().findBygetAFa_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	public static AgricultureFarm fetchBygetAFa_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureFarm> orderByComparator) {

		return getPersistence().fetchBygetAFa_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture farm
	 * @throws NoSuchAgricultureFarmException if a matching agriculture farm could not be found
	 */
	public static AgricultureFarm findBygetAFa_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureFarm> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureFarmException {

		return getPersistence().findBygetAFa_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	public static AgricultureFarm fetchBygetAFa_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureFarm> orderByComparator) {

		return getPersistence().fetchBygetAFa_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agriculture farms before and after the current agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureFarmId the primary key of the current agriculture farm
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture farm
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	public static AgricultureFarm[] findBygetAFa_by_AAI_PrevAndNext(
			long agricultureFarmId, long agricultureApplicationId,
			OrderByComparator<AgricultureFarm> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureFarmException {

		return getPersistence().findBygetAFa_by_AAI_PrevAndNext(
			agricultureFarmId, agricultureApplicationId, orderByComparator);
	}

	/**
	 * Removes all the agriculture farms where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetAFa_by_AAI(long agricultureApplicationId) {
		getPersistence().removeBygetAFa_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture farms
	 */
	public static int countBygetAFa_by_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAFa_by_AAI(agricultureApplicationId);
	}

	/**
	 * Caches the agriculture farm in the entity cache if it is enabled.
	 *
	 * @param agricultureFarm the agriculture farm
	 */
	public static void cacheResult(AgricultureFarm agricultureFarm) {
		getPersistence().cacheResult(agricultureFarm);
	}

	/**
	 * Caches the agriculture farms in the entity cache if it is enabled.
	 *
	 * @param agricultureFarms the agriculture farms
	 */
	public static void cacheResult(List<AgricultureFarm> agricultureFarms) {
		getPersistence().cacheResult(agricultureFarms);
	}

	/**
	 * Creates a new agriculture farm with the primary key. Does not add the agriculture farm to the database.
	 *
	 * @param agricultureFarmId the primary key for the new agriculture farm
	 * @return the new agriculture farm
	 */
	public static AgricultureFarm create(long agricultureFarmId) {
		return getPersistence().create(agricultureFarmId);
	}

	/**
	 * Removes the agriculture farm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm that was removed
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	public static AgricultureFarm remove(long agricultureFarmId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureFarmException {

		return getPersistence().remove(agricultureFarmId);
	}

	public static AgricultureFarm updateImpl(AgricultureFarm agricultureFarm) {
		return getPersistence().updateImpl(agricultureFarm);
	}

	/**
	 * Returns the agriculture farm with the primary key or throws a <code>NoSuchAgricultureFarmException</code> if it could not be found.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	public static AgricultureFarm findByPrimaryKey(long agricultureFarmId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureFarmException {

		return getPersistence().findByPrimaryKey(agricultureFarmId);
	}

	/**
	 * Returns the agriculture farm with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm, or <code>null</code> if a agriculture farm with the primary key could not be found
	 */
	public static AgricultureFarm fetchByPrimaryKey(long agricultureFarmId) {
		return getPersistence().fetchByPrimaryKey(agricultureFarmId);
	}

	/**
	 * Returns all the agriculture farms.
	 *
	 * @return the agriculture farms
	 */
	public static List<AgricultureFarm> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @return the range of agriculture farms
	 */
	public static List<AgricultureFarm> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture farms
	 */
	public static List<AgricultureFarm> findAll(
		int start, int end,
		OrderByComparator<AgricultureFarm> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture farms
	 */
	public static List<AgricultureFarm> findAll(
		int start, int end,
		OrderByComparator<AgricultureFarm> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agriculture farms from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agriculture farms.
	 *
	 * @return the number of agriculture farms
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultureFarmPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AgricultureFarmPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AgricultureFarmPersistence _persistence;

}