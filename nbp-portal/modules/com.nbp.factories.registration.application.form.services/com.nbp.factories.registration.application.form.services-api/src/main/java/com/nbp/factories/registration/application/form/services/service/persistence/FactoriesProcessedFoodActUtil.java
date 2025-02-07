/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories processed food act service. This utility wraps <code>com.nbp.factories.registration.application.form.services.service.persistence.impl.FactoriesProcessedFoodActPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProcessedFoodActPersistence
 * @generated
 */
public class FactoriesProcessedFoodActUtil {

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
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		getPersistence().clearCache(factoriesProcessedFoodAct);
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
	public static Map<Serializable, FactoriesProcessedFoodAct>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesProcessedFoodAct> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesProcessedFoodAct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesProcessedFoodAct> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesProcessedFoodAct> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesProcessedFoodAct update(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		return getPersistence().update(factoriesProcessedFoodAct);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesProcessedFoodAct update(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct,
		ServiceContext serviceContext) {

		return getPersistence().update(
			factoriesProcessedFoodAct, serviceContext);
	}

	/**
	 * Returns the factories processed food act where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesProcessedFoodActException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories processed food act
	 * @throws NoSuchFactoriesProcessedFoodActException if a matching factories processed food act could not be found
	 */
	public static FactoriesProcessedFoodAct findBygetFactoriesById(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProcessedFoodActException {

		return getPersistence().findBygetFactoriesById(factoriesApplicationId);
	}

	/**
	 * Returns the factories processed food act where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories processed food act, or <code>null</code> if a matching factories processed food act could not be found
	 */
	public static FactoriesProcessedFoodAct fetchBygetFactoriesById(
		long factoriesApplicationId) {

		return getPersistence().fetchBygetFactoriesById(factoriesApplicationId);
	}

	/**
	 * Returns the factories processed food act where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories processed food act, or <code>null</code> if a matching factories processed food act could not be found
	 */
	public static FactoriesProcessedFoodAct fetchBygetFactoriesById(
		long factoriesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactoriesById(
			factoriesApplicationId, useFinderCache);
	}

	/**
	 * Removes the factories processed food act where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories processed food act that was removed
	 */
	public static FactoriesProcessedFoodAct removeBygetFactoriesById(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProcessedFoodActException {

		return getPersistence().removeBygetFactoriesById(
			factoriesApplicationId);
	}

	/**
	 * Returns the number of factories processed food acts where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories processed food acts
	 */
	public static int countBygetFactoriesById(long factoriesApplicationId) {
		return getPersistence().countBygetFactoriesById(factoriesApplicationId);
	}

	/**
	 * Caches the factories processed food act in the entity cache if it is enabled.
	 *
	 * @param factoriesProcessedFoodAct the factories processed food act
	 */
	public static void cacheResult(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		getPersistence().cacheResult(factoriesProcessedFoodAct);
	}

	/**
	 * Caches the factories processed food acts in the entity cache if it is enabled.
	 *
	 * @param factoriesProcessedFoodActs the factories processed food acts
	 */
	public static void cacheResult(
		List<FactoriesProcessedFoodAct> factoriesProcessedFoodActs) {

		getPersistence().cacheResult(factoriesProcessedFoodActs);
	}

	/**
	 * Creates a new factories processed food act with the primary key. Does not add the factories processed food act to the database.
	 *
	 * @param factoriesProcessedFoodActId the primary key for the new factories processed food act
	 * @return the new factories processed food act
	 */
	public static FactoriesProcessedFoodAct create(
		long factoriesProcessedFoodActId) {

		return getPersistence().create(factoriesProcessedFoodActId);
	}

	/**
	 * Removes the factories processed food act with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act that was removed
	 * @throws NoSuchFactoriesProcessedFoodActException if a factories processed food act with the primary key could not be found
	 */
	public static FactoriesProcessedFoodAct remove(
			long factoriesProcessedFoodActId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProcessedFoodActException {

		return getPersistence().remove(factoriesProcessedFoodActId);
	}

	public static FactoriesProcessedFoodAct updateImpl(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		return getPersistence().updateImpl(factoriesProcessedFoodAct);
	}

	/**
	 * Returns the factories processed food act with the primary key or throws a <code>NoSuchFactoriesProcessedFoodActException</code> if it could not be found.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act
	 * @throws NoSuchFactoriesProcessedFoodActException if a factories processed food act with the primary key could not be found
	 */
	public static FactoriesProcessedFoodAct findByPrimaryKey(
			long factoriesProcessedFoodActId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProcessedFoodActException {

		return getPersistence().findByPrimaryKey(factoriesProcessedFoodActId);
	}

	/**
	 * Returns the factories processed food act with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act, or <code>null</code> if a factories processed food act with the primary key could not be found
	 */
	public static FactoriesProcessedFoodAct fetchByPrimaryKey(
		long factoriesProcessedFoodActId) {

		return getPersistence().fetchByPrimaryKey(factoriesProcessedFoodActId);
	}

	/**
	 * Returns all the factories processed food acts.
	 *
	 * @return the factories processed food acts
	 */
	public static List<FactoriesProcessedFoodAct> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @return the range of factories processed food acts
	 */
	public static List<FactoriesProcessedFoodAct> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories processed food acts
	 */
	public static List<FactoriesProcessedFoodAct> findAll(
		int start, int end,
		OrderByComparator<FactoriesProcessedFoodAct> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories processed food acts
	 */
	public static List<FactoriesProcessedFoodAct> findAll(
		int start, int end,
		OrderByComparator<FactoriesProcessedFoodAct> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories processed food acts from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories processed food acts.
	 *
	 * @return the number of factories processed food acts
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesProcessedFoodActPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesProcessedFoodActPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesProcessedFoodActPersistence _persistence;

}