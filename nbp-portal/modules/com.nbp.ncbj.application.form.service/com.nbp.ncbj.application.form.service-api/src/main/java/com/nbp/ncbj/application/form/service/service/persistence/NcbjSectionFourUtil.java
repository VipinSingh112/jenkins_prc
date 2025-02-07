/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjSectionFour;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj section four service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjSectionFourPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionFourPersistence
 * @generated
 */
public class NcbjSectionFourUtil {

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
	public static void clearCache(NcbjSectionFour ncbjSectionFour) {
		getPersistence().clearCache(ncbjSectionFour);
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
	public static Map<Serializable, NcbjSectionFour> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjSectionFour> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjSectionFour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjSectionFour> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjSectionFour> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjSectionFour update(NcbjSectionFour ncbjSectionFour) {
		return getPersistence().update(ncbjSectionFour);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjSectionFour update(
		NcbjSectionFour ncbjSectionFour, ServiceContext serviceContext) {

		return getPersistence().update(ncbjSectionFour, serviceContext);
	}

	/**
	 * Returns the ncbj section four where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionFourException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section four
	 * @throws NoSuchNcbjSectionFourException if a matching ncbj section four could not be found
	 */
	public static NcbjSectionFour findBygetNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionFourException {

		return getPersistence().findBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section four where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section four, or <code>null</code> if a matching ncbj section four could not be found
	 */
	public static NcbjSectionFour fetchBygetNCBJByAppId(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section four where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section four, or <code>null</code> if a matching ncbj section four could not be found
	 */
	public static NcbjSectionFour fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJByAppId(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj section four where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section four that was removed
	 */
	public static NcbjSectionFour removeBygetNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionFourException {

		return getPersistence().removeBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj section fours where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section fours
	 */
	public static int countBygetNCBJByAppId(long ncbjApplicationId) {
		return getPersistence().countBygetNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj section four in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionFour the ncbj section four
	 */
	public static void cacheResult(NcbjSectionFour ncbjSectionFour) {
		getPersistence().cacheResult(ncbjSectionFour);
	}

	/**
	 * Caches the ncbj section fours in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionFours the ncbj section fours
	 */
	public static void cacheResult(List<NcbjSectionFour> ncbjSectionFours) {
		getPersistence().cacheResult(ncbjSectionFours);
	}

	/**
	 * Creates a new ncbj section four with the primary key. Does not add the ncbj section four to the database.
	 *
	 * @param ncbjSectionFourId the primary key for the new ncbj section four
	 * @return the new ncbj section four
	 */
	public static NcbjSectionFour create(long ncbjSectionFourId) {
		return getPersistence().create(ncbjSectionFourId);
	}

	/**
	 * Removes the ncbj section four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four that was removed
	 * @throws NoSuchNcbjSectionFourException if a ncbj section four with the primary key could not be found
	 */
	public static NcbjSectionFour remove(long ncbjSectionFourId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionFourException {

		return getPersistence().remove(ncbjSectionFourId);
	}

	public static NcbjSectionFour updateImpl(NcbjSectionFour ncbjSectionFour) {
		return getPersistence().updateImpl(ncbjSectionFour);
	}

	/**
	 * Returns the ncbj section four with the primary key or throws a <code>NoSuchNcbjSectionFourException</code> if it could not be found.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four
	 * @throws NoSuchNcbjSectionFourException if a ncbj section four with the primary key could not be found
	 */
	public static NcbjSectionFour findByPrimaryKey(long ncbjSectionFourId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionFourException {

		return getPersistence().findByPrimaryKey(ncbjSectionFourId);
	}

	/**
	 * Returns the ncbj section four with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four, or <code>null</code> if a ncbj section four with the primary key could not be found
	 */
	public static NcbjSectionFour fetchByPrimaryKey(long ncbjSectionFourId) {
		return getPersistence().fetchByPrimaryKey(ncbjSectionFourId);
	}

	/**
	 * Returns all the ncbj section fours.
	 *
	 * @return the ncbj section fours
	 */
	public static List<NcbjSectionFour> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @return the range of ncbj section fours
	 */
	public static List<NcbjSectionFour> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section fours
	 */
	public static List<NcbjSectionFour> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionFour> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section fours
	 */
	public static List<NcbjSectionFour> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionFour> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj section fours from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj section fours.
	 *
	 * @return the number of ncbj section fours
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjSectionFourPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcbjSectionFourPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcbjSectionFourPersistence _persistence;

}