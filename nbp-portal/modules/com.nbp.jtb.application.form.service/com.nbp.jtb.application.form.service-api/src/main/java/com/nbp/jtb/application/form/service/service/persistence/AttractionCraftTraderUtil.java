/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AttractionCraftTrader;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the attraction craft trader service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AttractionCraftTraderPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionCraftTraderPersistence
 * @generated
 */
public class AttractionCraftTraderUtil {

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
	public static void clearCache(AttractionCraftTrader attractionCraftTrader) {
		getPersistence().clearCache(attractionCraftTrader);
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
	public static Map<Serializable, AttractionCraftTrader> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AttractionCraftTrader> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttractionCraftTrader> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttractionCraftTrader> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttractionCraftTrader> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttractionCraftTrader update(
		AttractionCraftTrader attractionCraftTrader) {

		return getPersistence().update(attractionCraftTrader);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttractionCraftTrader update(
		AttractionCraftTrader attractionCraftTrader,
		ServiceContext serviceContext) {

		return getPersistence().update(attractionCraftTrader, serviceContext);
	}

	/**
	 * Returns the attraction craft trader where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionCraftTraderException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction craft trader
	 * @throws NoSuchAttractionCraftTraderException if a matching attraction craft trader could not be found
	 */
	public static AttractionCraftTrader findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCraftTraderException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction craft trader where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction craft trader, or <code>null</code> if a matching attraction craft trader could not be found
	 */
	public static AttractionCraftTrader fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the attraction craft trader where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction craft trader, or <code>null</code> if a matching attraction craft trader could not be found
	 */
	public static AttractionCraftTrader fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the attraction craft trader where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction craft trader that was removed
	 */
	public static AttractionCraftTrader removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCraftTraderException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of attraction craft traders where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction craft traders
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the attraction craft trader in the entity cache if it is enabled.
	 *
	 * @param attractionCraftTrader the attraction craft trader
	 */
	public static void cacheResult(
		AttractionCraftTrader attractionCraftTrader) {

		getPersistence().cacheResult(attractionCraftTrader);
	}

	/**
	 * Caches the attraction craft traders in the entity cache if it is enabled.
	 *
	 * @param attractionCraftTraders the attraction craft traders
	 */
	public static void cacheResult(
		List<AttractionCraftTrader> attractionCraftTraders) {

		getPersistence().cacheResult(attractionCraftTraders);
	}

	/**
	 * Creates a new attraction craft trader with the primary key. Does not add the attraction craft trader to the database.
	 *
	 * @param attractionCraftTraderId the primary key for the new attraction craft trader
	 * @return the new attraction craft trader
	 */
	public static AttractionCraftTrader create(long attractionCraftTraderId) {
		return getPersistence().create(attractionCraftTraderId);
	}

	/**
	 * Removes the attraction craft trader with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader that was removed
	 * @throws NoSuchAttractionCraftTraderException if a attraction craft trader with the primary key could not be found
	 */
	public static AttractionCraftTrader remove(long attractionCraftTraderId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCraftTraderException {

		return getPersistence().remove(attractionCraftTraderId);
	}

	public static AttractionCraftTrader updateImpl(
		AttractionCraftTrader attractionCraftTrader) {

		return getPersistence().updateImpl(attractionCraftTrader);
	}

	/**
	 * Returns the attraction craft trader with the primary key or throws a <code>NoSuchAttractionCraftTraderException</code> if it could not be found.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader
	 * @throws NoSuchAttractionCraftTraderException if a attraction craft trader with the primary key could not be found
	 */
	public static AttractionCraftTrader findByPrimaryKey(
			long attractionCraftTraderId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAttractionCraftTraderException {

		return getPersistence().findByPrimaryKey(attractionCraftTraderId);
	}

	/**
	 * Returns the attraction craft trader with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionCraftTraderId the primary key of the attraction craft trader
	 * @return the attraction craft trader, or <code>null</code> if a attraction craft trader with the primary key could not be found
	 */
	public static AttractionCraftTrader fetchByPrimaryKey(
		long attractionCraftTraderId) {

		return getPersistence().fetchByPrimaryKey(attractionCraftTraderId);
	}

	/**
	 * Returns all the attraction craft traders.
	 *
	 * @return the attraction craft traders
	 */
	public static List<AttractionCraftTrader> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @return the range of attraction craft traders
	 */
	public static List<AttractionCraftTrader> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction craft traders
	 */
	public static List<AttractionCraftTrader> findAll(
		int start, int end,
		OrderByComparator<AttractionCraftTrader> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the attraction craft traders.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionCraftTraderModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction craft traders
	 * @param end the upper bound of the range of attraction craft traders (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction craft traders
	 */
	public static List<AttractionCraftTrader> findAll(
		int start, int end,
		OrderByComparator<AttractionCraftTrader> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the attraction craft traders from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of attraction craft traders.
	 *
	 * @return the number of attraction craft traders
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AttractionCraftTraderPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AttractionCraftTraderPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AttractionCraftTraderPersistence _persistence;

}