/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the detail of business sec three service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.DetailOfBusinessSecThreePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfBusinessSecThreePersistence
 * @generated
 */
public class DetailOfBusinessSecThreeUtil {

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
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		getPersistence().clearCache(detailOfBusinessSecThree);
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
	public static Map<Serializable, DetailOfBusinessSecThree>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DetailOfBusinessSecThree> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DetailOfBusinessSecThree> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DetailOfBusinessSecThree> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DetailOfBusinessSecThree> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DetailOfBusinessSecThree update(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		return getPersistence().update(detailOfBusinessSecThree);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DetailOfBusinessSecThree update(
		DetailOfBusinessSecThree detailOfBusinessSecThree,
		ServiceContext serviceContext) {

		return getPersistence().update(
			detailOfBusinessSecThree, serviceContext);
	}

	/**
	 * Returns the detail of business sec three where hsraApplicationId = &#63; or throws a <code>NoSuchDetailOfBusinessSecThreeException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of business sec three
	 * @throws NoSuchDetailOfBusinessSecThreeException if a matching detail of business sec three could not be found
	 */
	public static DetailOfBusinessSecThree findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfBusinessSecThreeException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the detail of business sec three where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of business sec three, or <code>null</code> if a matching detail of business sec three could not be found
	 */
	public static DetailOfBusinessSecThree fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the detail of business sec three where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of business sec three, or <code>null</code> if a matching detail of business sec three could not be found
	 */
	public static DetailOfBusinessSecThree fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the detail of business sec three where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the detail of business sec three that was removed
	 */
	public static DetailOfBusinessSecThree removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfBusinessSecThreeException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of detail of business sec threes where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching detail of business sec threes
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the detail of business sec three in the entity cache if it is enabled.
	 *
	 * @param detailOfBusinessSecThree the detail of business sec three
	 */
	public static void cacheResult(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		getPersistence().cacheResult(detailOfBusinessSecThree);
	}

	/**
	 * Caches the detail of business sec threes in the entity cache if it is enabled.
	 *
	 * @param detailOfBusinessSecThrees the detail of business sec threes
	 */
	public static void cacheResult(
		List<DetailOfBusinessSecThree> detailOfBusinessSecThrees) {

		getPersistence().cacheResult(detailOfBusinessSecThrees);
	}

	/**
	 * Creates a new detail of business sec three with the primary key. Does not add the detail of business sec three to the database.
	 *
	 * @param detailOfBusinessSecThreeId the primary key for the new detail of business sec three
	 * @return the new detail of business sec three
	 */
	public static DetailOfBusinessSecThree create(
		long detailOfBusinessSecThreeId) {

		return getPersistence().create(detailOfBusinessSecThreeId);
	}

	/**
	 * Removes the detail of business sec three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three that was removed
	 * @throws NoSuchDetailOfBusinessSecThreeException if a detail of business sec three with the primary key could not be found
	 */
	public static DetailOfBusinessSecThree remove(
			long detailOfBusinessSecThreeId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfBusinessSecThreeException {

		return getPersistence().remove(detailOfBusinessSecThreeId);
	}

	public static DetailOfBusinessSecThree updateImpl(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		return getPersistence().updateImpl(detailOfBusinessSecThree);
	}

	/**
	 * Returns the detail of business sec three with the primary key or throws a <code>NoSuchDetailOfBusinessSecThreeException</code> if it could not be found.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three
	 * @throws NoSuchDetailOfBusinessSecThreeException if a detail of business sec three with the primary key could not be found
	 */
	public static DetailOfBusinessSecThree findByPrimaryKey(
			long detailOfBusinessSecThreeId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchDetailOfBusinessSecThreeException {

		return getPersistence().findByPrimaryKey(detailOfBusinessSecThreeId);
	}

	/**
	 * Returns the detail of business sec three with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three, or <code>null</code> if a detail of business sec three with the primary key could not be found
	 */
	public static DetailOfBusinessSecThree fetchByPrimaryKey(
		long detailOfBusinessSecThreeId) {

		return getPersistence().fetchByPrimaryKey(detailOfBusinessSecThreeId);
	}

	/**
	 * Returns all the detail of business sec threes.
	 *
	 * @return the detail of business sec threes
	 */
	public static List<DetailOfBusinessSecThree> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @return the range of detail of business sec threes
	 */
	public static List<DetailOfBusinessSecThree> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of business sec threes
	 */
	public static List<DetailOfBusinessSecThree> findAll(
		int start, int end,
		OrderByComparator<DetailOfBusinessSecThree> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of business sec threes
	 */
	public static List<DetailOfBusinessSecThree> findAll(
		int start, int end,
		OrderByComparator<DetailOfBusinessSecThree> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the detail of business sec threes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of detail of business sec threes.
	 *
	 * @return the number of detail of business sec threes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DetailOfBusinessSecThreePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		DetailOfBusinessSecThreePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile DetailOfBusinessSecThreePersistence _persistence;

}