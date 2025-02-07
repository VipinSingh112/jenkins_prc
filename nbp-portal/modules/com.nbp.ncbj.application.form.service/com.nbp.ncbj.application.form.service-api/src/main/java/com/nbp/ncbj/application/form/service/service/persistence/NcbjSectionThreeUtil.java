/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjSectionThree;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj section three service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjSectionThreePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionThreePersistence
 * @generated
 */
public class NcbjSectionThreeUtil {

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
	public static void clearCache(NcbjSectionThree ncbjSectionThree) {
		getPersistence().clearCache(ncbjSectionThree);
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
	public static Map<Serializable, NcbjSectionThree> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjSectionThree> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjSectionThree> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjSectionThree> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjSectionThree> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjSectionThree update(NcbjSectionThree ncbjSectionThree) {
		return getPersistence().update(ncbjSectionThree);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjSectionThree update(
		NcbjSectionThree ncbjSectionThree, ServiceContext serviceContext) {

		return getPersistence().update(ncbjSectionThree, serviceContext);
	}

	/**
	 * Returns the ncbj section three where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionThreeException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section three
	 * @throws NoSuchNcbjSectionThreeException if a matching ncbj section three could not be found
	 */
	public static NcbjSectionThree findBygetNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionThreeException {

		return getPersistence().findBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section three where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section three, or <code>null</code> if a matching ncbj section three could not be found
	 */
	public static NcbjSectionThree fetchBygetNCBJByAppId(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section three where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section three, or <code>null</code> if a matching ncbj section three could not be found
	 */
	public static NcbjSectionThree fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJByAppId(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj section three where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section three that was removed
	 */
	public static NcbjSectionThree removeBygetNCBJByAppId(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionThreeException {

		return getPersistence().removeBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj section threes where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section threes
	 */
	public static int countBygetNCBJByAppId(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj section three in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionThree the ncbj section three
	 */
	public static void cacheResult(NcbjSectionThree ncbjSectionThree) {
		getPersistence().cacheResult(ncbjSectionThree);
	}

	/**
	 * Caches the ncbj section threes in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionThrees the ncbj section threes
	 */
	public static void cacheResult(List<NcbjSectionThree> ncbjSectionThrees) {
		getPersistence().cacheResult(ncbjSectionThrees);
	}

	/**
	 * Creates a new ncbj section three with the primary key. Does not add the ncbj section three to the database.
	 *
	 * @param ncbjSectionThreeId the primary key for the new ncbj section three
	 * @return the new ncbj section three
	 */
	public static NcbjSectionThree create(long ncbjSectionThreeId) {
		return getPersistence().create(ncbjSectionThreeId);
	}

	/**
	 * Removes the ncbj section three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three that was removed
	 * @throws NoSuchNcbjSectionThreeException if a ncbj section three with the primary key could not be found
	 */
	public static NcbjSectionThree remove(long ncbjSectionThreeId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionThreeException {

		return getPersistence().remove(ncbjSectionThreeId);
	}

	public static NcbjSectionThree updateImpl(
		NcbjSectionThree ncbjSectionThree) {

		return getPersistence().updateImpl(ncbjSectionThree);
	}

	/**
	 * Returns the ncbj section three with the primary key or throws a <code>NoSuchNcbjSectionThreeException</code> if it could not be found.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three
	 * @throws NoSuchNcbjSectionThreeException if a ncbj section three with the primary key could not be found
	 */
	public static NcbjSectionThree findByPrimaryKey(long ncbjSectionThreeId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionThreeException {

		return getPersistence().findByPrimaryKey(ncbjSectionThreeId);
	}

	/**
	 * Returns the ncbj section three with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three, or <code>null</code> if a ncbj section three with the primary key could not be found
	 */
	public static NcbjSectionThree fetchByPrimaryKey(long ncbjSectionThreeId) {
		return getPersistence().fetchByPrimaryKey(ncbjSectionThreeId);
	}

	/**
	 * Returns all the ncbj section threes.
	 *
	 * @return the ncbj section threes
	 */
	public static List<NcbjSectionThree> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @return the range of ncbj section threes
	 */
	public static List<NcbjSectionThree> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section threes
	 */
	public static List<NcbjSectionThree> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionThree> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section threes
	 */
	public static List<NcbjSectionThree> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionThree> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj section threes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj section threes.
	 *
	 * @return the number of ncbj section threes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjSectionThreePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcbjSectionThreePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcbjSectionThreePersistence _persistence;

}