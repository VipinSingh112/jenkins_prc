/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgricultueFarmer;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agricultue farmer service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgricultueFarmerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultueFarmerPersistence
 * @generated
 */
public class AgricultueFarmerUtil {

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
	public static void clearCache(AgricultueFarmer agricultueFarmer) {
		getPersistence().clearCache(agricultueFarmer);
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
	public static Map<Serializable, AgricultueFarmer> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgricultueFarmer> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgricultueFarmer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgricultueFarmer> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgricultueFarmer> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgricultueFarmer update(AgricultueFarmer agricultueFarmer) {
		return getPersistence().update(agricultueFarmer);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgricultueFarmer update(
		AgricultueFarmer agricultueFarmer, ServiceContext serviceContext) {

		return getPersistence().update(agricultueFarmer, serviceContext);
	}

	/**
	 * Returns the agricultue farmer where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultueFarmerException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a matching agricultue farmer could not be found
	 */
	public static AgricultueFarmer findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultueFarmerException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agricultue farmer where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	public static AgricultueFarmer fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agricultue farmer where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	public static AgricultueFarmer fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agricultue farmer where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agricultue farmer that was removed
	 */
	public static AgricultueFarmer removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultueFarmerException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agricultue farmers
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agricultue farmers
	 */
	public static List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId) {

		return getPersistence().findBygetAF_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns a range of all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @return the range of matching agricultue farmers
	 */
	public static List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return getPersistence().findBygetAF_by_AAI(
			agricultureApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agricultue farmers
	 */
	public static List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultueFarmer> orderByComparator) {

		return getPersistence().findBygetAF_by_AAI(
			agricultureApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agricultue farmers
	 */
	public static List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultueFarmer> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAF_by_AAI(
			agricultureApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a matching agricultue farmer could not be found
	 */
	public static AgricultueFarmer findBygetAF_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultueFarmer> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultueFarmerException {

		return getPersistence().findBygetAF_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the first agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	public static AgricultueFarmer fetchBygetAF_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultueFarmer> orderByComparator) {

		return getPersistence().fetchBygetAF_by_AAI_First(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a matching agricultue farmer could not be found
	 */
	public static AgricultueFarmer findBygetAF_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultueFarmer> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultueFarmerException {

		return getPersistence().findBygetAF_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the last agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	public static AgricultueFarmer fetchBygetAF_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultueFarmer> orderByComparator) {

		return getPersistence().fetchBygetAF_by_AAI_Last(
			agricultureApplicationId, orderByComparator);
	}

	/**
	 * Returns the agricultue farmers before and after the current agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultueFarmerId the primary key of the current agricultue farmer
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	public static AgricultueFarmer[] findBygetAF_by_AAI_PrevAndNext(
			long agricultueFarmerId, long agricultureApplicationId,
			OrderByComparator<AgricultueFarmer> orderByComparator)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultueFarmerException {

		return getPersistence().findBygetAF_by_AAI_PrevAndNext(
			agricultueFarmerId, agricultureApplicationId, orderByComparator);
	}

	/**
	 * Removes all the agricultue farmers where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	public static void removeBygetAF_by_AAI(long agricultureApplicationId) {
		getPersistence().removeBygetAF_by_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the number of agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agricultue farmers
	 */
	public static int countBygetAF_by_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAF_by_AAI(agricultureApplicationId);
	}

	/**
	 * Caches the agricultue farmer in the entity cache if it is enabled.
	 *
	 * @param agricultueFarmer the agricultue farmer
	 */
	public static void cacheResult(AgricultueFarmer agricultueFarmer) {
		getPersistence().cacheResult(agricultueFarmer);
	}

	/**
	 * Caches the agricultue farmers in the entity cache if it is enabled.
	 *
	 * @param agricultueFarmers the agricultue farmers
	 */
	public static void cacheResult(List<AgricultueFarmer> agricultueFarmers) {
		getPersistence().cacheResult(agricultueFarmers);
	}

	/**
	 * Creates a new agricultue farmer with the primary key. Does not add the agricultue farmer to the database.
	 *
	 * @param agricultueFarmerId the primary key for the new agricultue farmer
	 * @return the new agricultue farmer
	 */
	public static AgricultueFarmer create(long agricultueFarmerId) {
		return getPersistence().create(agricultueFarmerId);
	}

	/**
	 * Removes the agricultue farmer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer that was removed
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	public static AgricultueFarmer remove(long agricultueFarmerId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultueFarmerException {

		return getPersistence().remove(agricultueFarmerId);
	}

	public static AgricultueFarmer updateImpl(
		AgricultueFarmer agricultueFarmer) {

		return getPersistence().updateImpl(agricultueFarmer);
	}

	/**
	 * Returns the agricultue farmer with the primary key or throws a <code>NoSuchAgricultueFarmerException</code> if it could not be found.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	public static AgricultueFarmer findByPrimaryKey(long agricultueFarmerId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultueFarmerException {

		return getPersistence().findByPrimaryKey(agricultueFarmerId);
	}

	/**
	 * Returns the agricultue farmer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer, or <code>null</code> if a agricultue farmer with the primary key could not be found
	 */
	public static AgricultueFarmer fetchByPrimaryKey(long agricultueFarmerId) {
		return getPersistence().fetchByPrimaryKey(agricultueFarmerId);
	}

	/**
	 * Returns all the agricultue farmers.
	 *
	 * @return the agricultue farmers
	 */
	public static List<AgricultueFarmer> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @return the range of agricultue farmers
	 */
	public static List<AgricultueFarmer> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agricultue farmers
	 */
	public static List<AgricultueFarmer> findAll(
		int start, int end,
		OrderByComparator<AgricultueFarmer> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agricultue farmers
	 */
	public static List<AgricultueFarmer> findAll(
		int start, int end,
		OrderByComparator<AgricultueFarmer> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agricultue farmers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agricultue farmers.
	 *
	 * @return the number of agricultue farmers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgricultueFarmerPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AgricultueFarmerPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AgricultueFarmerPersistence _persistence;

}