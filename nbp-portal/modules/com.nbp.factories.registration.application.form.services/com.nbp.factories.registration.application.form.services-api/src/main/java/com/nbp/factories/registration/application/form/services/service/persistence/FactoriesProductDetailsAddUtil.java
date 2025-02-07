/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.application.form.services.model.FactoriesProductDetailsAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories product details add service. This utility wraps <code>com.nbp.factories.registration.application.form.services.service.persistence.impl.FactoriesProductDetailsAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesProductDetailsAddPersistence
 * @generated
 */
public class FactoriesProductDetailsAddUtil {

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
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		getPersistence().clearCache(factoriesProductDetailsAdd);
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
	public static Map<Serializable, FactoriesProductDetailsAdd>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesProductDetailsAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesProductDetailsAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesProductDetailsAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesProductDetailsAdd update(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		return getPersistence().update(factoriesProductDetailsAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesProductDetailsAdd update(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(
			factoriesProductDetailsAdd, serviceContext);
	}

	/**
	 * Returns all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories product details adds
	 */
	public static List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId) {

		return getPersistence().findBygetFactoriesById(factoriesApplicationId);
	}

	/**
	 * Returns a range of all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @return the range of matching factories product details adds
	 */
	public static List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId, int start, int end) {

		return getPersistence().findBygetFactoriesById(
			factoriesApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories product details adds
	 */
	public static List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator) {

		return getPersistence().findBygetFactoriesById(
			factoriesApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories product details adds
	 */
	public static List<FactoriesProductDetailsAdd> findBygetFactoriesById(
		long factoriesApplicationId, int start, int end,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFactoriesById(
			factoriesApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a matching factories product details add could not be found
	 */
	public static FactoriesProductDetailsAdd findBygetFactoriesById_First(
			long factoriesApplicationId,
			OrderByComparator<FactoriesProductDetailsAdd> orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProductDetailsAddException {

		return getPersistence().findBygetFactoriesById_First(
			factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the first factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories product details add, or <code>null</code> if a matching factories product details add could not be found
	 */
	public static FactoriesProductDetailsAdd fetchBygetFactoriesById_First(
		long factoriesApplicationId,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator) {

		return getPersistence().fetchBygetFactoriesById_First(
			factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a matching factories product details add could not be found
	 */
	public static FactoriesProductDetailsAdd findBygetFactoriesById_Last(
			long factoriesApplicationId,
			OrderByComparator<FactoriesProductDetailsAdd> orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProductDetailsAddException {

		return getPersistence().findBygetFactoriesById_Last(
			factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the last factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories product details add, or <code>null</code> if a matching factories product details add could not be found
	 */
	public static FactoriesProductDetailsAdd fetchBygetFactoriesById_Last(
		long factoriesApplicationId,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator) {

		return getPersistence().fetchBygetFactoriesById_Last(
			factoriesApplicationId, orderByComparator);
	}

	/**
	 * Returns the factories product details adds before and after the current factories product details add in the ordered set where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the current factories product details add
	 * @param factoriesApplicationId the factories application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	public static FactoriesProductDetailsAdd[]
			findBygetFactoriesById_PrevAndNext(
				long factoriesProductDetailsAddId, long factoriesApplicationId,
				OrderByComparator<FactoriesProductDetailsAdd> orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProductDetailsAddException {

		return getPersistence().findBygetFactoriesById_PrevAndNext(
			factoriesProductDetailsAddId, factoriesApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the factories product details adds where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 */
	public static void removeBygetFactoriesById(long factoriesApplicationId) {
		getPersistence().removeBygetFactoriesById(factoriesApplicationId);
	}

	/**
	 * Returns the number of factories product details adds where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories product details adds
	 */
	public static int countBygetFactoriesById(long factoriesApplicationId) {
		return getPersistence().countBygetFactoriesById(factoriesApplicationId);
	}

	/**
	 * Caches the factories product details add in the entity cache if it is enabled.
	 *
	 * @param factoriesProductDetailsAdd the factories product details add
	 */
	public static void cacheResult(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		getPersistence().cacheResult(factoriesProductDetailsAdd);
	}

	/**
	 * Caches the factories product details adds in the entity cache if it is enabled.
	 *
	 * @param factoriesProductDetailsAdds the factories product details adds
	 */
	public static void cacheResult(
		List<FactoriesProductDetailsAdd> factoriesProductDetailsAdds) {

		getPersistence().cacheResult(factoriesProductDetailsAdds);
	}

	/**
	 * Creates a new factories product details add with the primary key. Does not add the factories product details add to the database.
	 *
	 * @param factoriesProductDetailsAddId the primary key for the new factories product details add
	 * @return the new factories product details add
	 */
	public static FactoriesProductDetailsAdd create(
		long factoriesProductDetailsAddId) {

		return getPersistence().create(factoriesProductDetailsAddId);
	}

	/**
	 * Removes the factories product details add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add that was removed
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	public static FactoriesProductDetailsAdd remove(
			long factoriesProductDetailsAddId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProductDetailsAddException {

		return getPersistence().remove(factoriesProductDetailsAddId);
	}

	public static FactoriesProductDetailsAdd updateImpl(
		FactoriesProductDetailsAdd factoriesProductDetailsAdd) {

		return getPersistence().updateImpl(factoriesProductDetailsAdd);
	}

	/**
	 * Returns the factories product details add with the primary key or throws a <code>NoSuchFactoriesProductDetailsAddException</code> if it could not be found.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add
	 * @throws NoSuchFactoriesProductDetailsAddException if a factories product details add with the primary key could not be found
	 */
	public static FactoriesProductDetailsAdd findByPrimaryKey(
			long factoriesProductDetailsAddId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesProductDetailsAddException {

		return getPersistence().findByPrimaryKey(factoriesProductDetailsAddId);
	}

	/**
	 * Returns the factories product details add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesProductDetailsAddId the primary key of the factories product details add
	 * @return the factories product details add, or <code>null</code> if a factories product details add with the primary key could not be found
	 */
	public static FactoriesProductDetailsAdd fetchByPrimaryKey(
		long factoriesProductDetailsAddId) {

		return getPersistence().fetchByPrimaryKey(factoriesProductDetailsAddId);
	}

	/**
	 * Returns all the factories product details adds.
	 *
	 * @return the factories product details adds
	 */
	public static List<FactoriesProductDetailsAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @return the range of factories product details adds
	 */
	public static List<FactoriesProductDetailsAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories product details adds
	 */
	public static List<FactoriesProductDetailsAdd> findAll(
		int start, int end,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories product details adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProductDetailsAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories product details adds
	 * @param end the upper bound of the range of factories product details adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories product details adds
	 */
	public static List<FactoriesProductDetailsAdd> findAll(
		int start, int end,
		OrderByComparator<FactoriesProductDetailsAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories product details adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories product details adds.
	 *
	 * @return the number of factories product details adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesProductDetailsAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesProductDetailsAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesProductDetailsAddPersistence _persistence;

}