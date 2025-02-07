/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjSectionOne;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj section one service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjSectionOnePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOnePersistence
 * @generated
 */
public class NcbjSectionOneUtil {

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
	public static void clearCache(NcbjSectionOne ncbjSectionOne) {
		getPersistence().clearCache(ncbjSectionOne);
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
	public static Map<Serializable, NcbjSectionOne> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjSectionOne> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjSectionOne> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjSectionOne> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjSectionOne> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjSectionOne update(NcbjSectionOne ncbjSectionOne) {
		return getPersistence().update(ncbjSectionOne);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjSectionOne update(
		NcbjSectionOne ncbjSectionOne, ServiceContext serviceContext) {

		return getPersistence().update(ncbjSectionOne, serviceContext);
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionOneException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a matching ncbj section one could not be found
	 */
	public static NcbjSectionOne findBygetNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneException {

		return getPersistence().findBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	public static NcbjSectionOne fetchBygetNCBJById(long ncbjApplicationId) {
		return getPersistence().fetchBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	public static NcbjSectionOne fetchBygetNCBJById(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJById(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj section one where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section one that was removed
	 */
	public static NcbjSectionOne removeBygetNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneException {

		return getPersistence().removeBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj section ones where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section ones
	 */
	public static int countBygetNCBJById(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionOneException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a matching ncbj section one could not be found
	 */
	public static NcbjSectionOne findBygetNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneException {

		return getPersistence().findBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	public static NcbjSectionOne fetchBygetNCBJByAppId(long ncbjApplicationId) {
		return getPersistence().fetchBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section one where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section one, or <code>null</code> if a matching ncbj section one could not be found
	 */
	public static NcbjSectionOne fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJByAppId(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj section one where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section one that was removed
	 */
	public static NcbjSectionOne removeBygetNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneException {

		return getPersistence().removeBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj section ones where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section ones
	 */
	public static int countBygetNCBJByAppId(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj section one in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOne the ncbj section one
	 */
	public static void cacheResult(NcbjSectionOne ncbjSectionOne) {
		getPersistence().cacheResult(ncbjSectionOne);
	}

	/**
	 * Caches the ncbj section ones in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionOnes the ncbj section ones
	 */
	public static void cacheResult(List<NcbjSectionOne> ncbjSectionOnes) {
		getPersistence().cacheResult(ncbjSectionOnes);
	}

	/**
	 * Creates a new ncbj section one with the primary key. Does not add the ncbj section one to the database.
	 *
	 * @param ncbjSectionOneId the primary key for the new ncbj section one
	 * @return the new ncbj section one
	 */
	public static NcbjSectionOne create(long ncbjSectionOneId) {
		return getPersistence().create(ncbjSectionOneId);
	}

	/**
	 * Removes the ncbj section one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one that was removed
	 * @throws NoSuchNcbjSectionOneException if a ncbj section one with the primary key could not be found
	 */
	public static NcbjSectionOne remove(long ncbjSectionOneId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneException {

		return getPersistence().remove(ncbjSectionOneId);
	}

	public static NcbjSectionOne updateImpl(NcbjSectionOne ncbjSectionOne) {
		return getPersistence().updateImpl(ncbjSectionOne);
	}

	/**
	 * Returns the ncbj section one with the primary key or throws a <code>NoSuchNcbjSectionOneException</code> if it could not be found.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one
	 * @throws NoSuchNcbjSectionOneException if a ncbj section one with the primary key could not be found
	 */
	public static NcbjSectionOne findByPrimaryKey(long ncbjSectionOneId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneException {

		return getPersistence().findByPrimaryKey(ncbjSectionOneId);
	}

	/**
	 * Returns the ncbj section one with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one, or <code>null</code> if a ncbj section one with the primary key could not be found
	 */
	public static NcbjSectionOne fetchByPrimaryKey(long ncbjSectionOneId) {
		return getPersistence().fetchByPrimaryKey(ncbjSectionOneId);
	}

	/**
	 * Returns all the ncbj section ones.
	 *
	 * @return the ncbj section ones
	 */
	public static List<NcbjSectionOne> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @return the range of ncbj section ones
	 */
	public static List<NcbjSectionOne> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section ones
	 */
	public static List<NcbjSectionOne> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionOne> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section ones
	 */
	public static List<NcbjSectionOne> findAll(
		int start, int end, OrderByComparator<NcbjSectionOne> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj section ones from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj section ones.
	 *
	 * @return the number of ncbj section ones
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjSectionOnePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcbjSectionOnePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcbjSectionOnePersistence _persistence;

}