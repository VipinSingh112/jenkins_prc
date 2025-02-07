/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade mult floor info service. This utility wraps <code>com.nbp.fire.brigade.application.form.service.service.persistence.impl.FireBrigadeMultFloorInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeMultFloorInfoPersistence
 * @generated
 */
public class FireBrigadeMultFloorInfoUtil {

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
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {

		getPersistence().clearCache(fireBrigadeMultFloorInfo);
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
	public static Map<Serializable, FireBrigadeMultFloorInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadeMultFloorInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadeMultFloorInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadeMultFloorInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadeMultFloorInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadeMultFloorInfo update(
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {

		return getPersistence().update(fireBrigadeMultFloorInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadeMultFloorInfo update(
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			fireBrigadeMultFloorInfo, serviceContext);
	}

	/**
	 * Returns the fire brigade mult floor info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeMultFloorInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade mult floor info
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a matching fire brigade mult floor info could not be found
	 */
	public static FireBrigadeMultFloorInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeMultFloorInfoException {

		return getPersistence().findBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade mult floor info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade mult floor info, or <code>null</code> if a matching fire brigade mult floor info could not be found
	 */
	public static FireBrigadeMultFloorInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return getPersistence().fetchBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade mult floor info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade mult floor info, or <code>null</code> if a matching fire brigade mult floor info could not be found
	 */
	public static FireBrigadeMultFloorInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigadeByAppId(
			fireBrigadeApplicationId, useFinderCache);
	}

	/**
	 * Removes the fire brigade mult floor info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade mult floor info that was removed
	 */
	public static FireBrigadeMultFloorInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeMultFloorInfoException {

		return getPersistence().removeBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the number of fire brigade mult floor infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade mult floor infos
	 */
	public static int countBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return getPersistence().countBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Caches the fire brigade mult floor info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeMultFloorInfo the fire brigade mult floor info
	 */
	public static void cacheResult(
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {

		getPersistence().cacheResult(fireBrigadeMultFloorInfo);
	}

	/**
	 * Caches the fire brigade mult floor infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeMultFloorInfos the fire brigade mult floor infos
	 */
	public static void cacheResult(
		List<FireBrigadeMultFloorInfo> fireBrigadeMultFloorInfos) {

		getPersistence().cacheResult(fireBrigadeMultFloorInfos);
	}

	/**
	 * Creates a new fire brigade mult floor info with the primary key. Does not add the fire brigade mult floor info to the database.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key for the new fire brigade mult floor info
	 * @return the new fire brigade mult floor info
	 */
	public static FireBrigadeMultFloorInfo create(
		long fireBrigadeMultFloorInfoId) {

		return getPersistence().create(fireBrigadeMultFloorInfoId);
	}

	/**
	 * Removes the fire brigade mult floor info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info that was removed
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a fire brigade mult floor info with the primary key could not be found
	 */
	public static FireBrigadeMultFloorInfo remove(
			long fireBrigadeMultFloorInfoId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeMultFloorInfoException {

		return getPersistence().remove(fireBrigadeMultFloorInfoId);
	}

	public static FireBrigadeMultFloorInfo updateImpl(
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo) {

		return getPersistence().updateImpl(fireBrigadeMultFloorInfo);
	}

	/**
	 * Returns the fire brigade mult floor info with the primary key or throws a <code>NoSuchFireBrigadeMultFloorInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a fire brigade mult floor info with the primary key could not be found
	 */
	public static FireBrigadeMultFloorInfo findByPrimaryKey(
			long fireBrigadeMultFloorInfoId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeMultFloorInfoException {

		return getPersistence().findByPrimaryKey(fireBrigadeMultFloorInfoId);
	}

	/**
	 * Returns the fire brigade mult floor info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info, or <code>null</code> if a fire brigade mult floor info with the primary key could not be found
	 */
	public static FireBrigadeMultFloorInfo fetchByPrimaryKey(
		long fireBrigadeMultFloorInfoId) {

		return getPersistence().fetchByPrimaryKey(fireBrigadeMultFloorInfoId);
	}

	/**
	 * Returns all the fire brigade mult floor infos.
	 *
	 * @return the fire brigade mult floor infos
	 */
	public static List<FireBrigadeMultFloorInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade mult floor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeMultFloorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade mult floor infos
	 * @param end the upper bound of the range of fire brigade mult floor infos (not inclusive)
	 * @return the range of fire brigade mult floor infos
	 */
	public static List<FireBrigadeMultFloorInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade mult floor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeMultFloorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade mult floor infos
	 * @param end the upper bound of the range of fire brigade mult floor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade mult floor infos
	 */
	public static List<FireBrigadeMultFloorInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeMultFloorInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade mult floor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeMultFloorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade mult floor infos
	 * @param end the upper bound of the range of fire brigade mult floor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade mult floor infos
	 */
	public static List<FireBrigadeMultFloorInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeMultFloorInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade mult floor infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade mult floor infos.
	 *
	 * @return the number of fire brigade mult floor infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadeMultFloorInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadeMultFloorInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadeMultFloorInfoPersistence _persistence;

}