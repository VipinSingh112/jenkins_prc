/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade signature info service. This utility wraps <code>com.nbp.fire.brigade.application.form.service.service.persistence.impl.FireBrigadeSignatureInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeSignatureInfoPersistence
 * @generated
 */
public class FireBrigadeSignatureInfoUtil {

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
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		getPersistence().clearCache(fireBrigadeSignatureInfo);
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
	public static Map<Serializable, FireBrigadeSignatureInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadeSignatureInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadeSignatureInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadeSignatureInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadeSignatureInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadeSignatureInfo update(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		return getPersistence().update(fireBrigadeSignatureInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadeSignatureInfo update(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			fireBrigadeSignatureInfo, serviceContext);
	}

	/**
	 * Returns the fire brigade signature info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeSignatureInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade signature info
	 * @throws NoSuchFireBrigadeSignatureInfoException if a matching fire brigade signature info could not be found
	 */
	public static FireBrigadeSignatureInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeSignatureInfoException {

		return getPersistence().findBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade signature info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade signature info, or <code>null</code> if a matching fire brigade signature info could not be found
	 */
	public static FireBrigadeSignatureInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return getPersistence().fetchBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade signature info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade signature info, or <code>null</code> if a matching fire brigade signature info could not be found
	 */
	public static FireBrigadeSignatureInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigadeByAppId(
			fireBrigadeApplicationId, useFinderCache);
	}

	/**
	 * Removes the fire brigade signature info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade signature info that was removed
	 */
	public static FireBrigadeSignatureInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeSignatureInfoException {

		return getPersistence().removeBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the number of fire brigade signature infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade signature infos
	 */
	public static int countBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId) {

		return getPersistence().countBygetFireBrigadeByAppId(
			fireBrigadeApplicationId);
	}

	/**
	 * Caches the fire brigade signature info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeSignatureInfo the fire brigade signature info
	 */
	public static void cacheResult(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		getPersistence().cacheResult(fireBrigadeSignatureInfo);
	}

	/**
	 * Caches the fire brigade signature infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeSignatureInfos the fire brigade signature infos
	 */
	public static void cacheResult(
		List<FireBrigadeSignatureInfo> fireBrigadeSignatureInfos) {

		getPersistence().cacheResult(fireBrigadeSignatureInfos);
	}

	/**
	 * Creates a new fire brigade signature info with the primary key. Does not add the fire brigade signature info to the database.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key for the new fire brigade signature info
	 * @return the new fire brigade signature info
	 */
	public static FireBrigadeSignatureInfo create(
		long fireBrigadeSignatureInfoId) {

		return getPersistence().create(fireBrigadeSignatureInfoId);
	}

	/**
	 * Removes the fire brigade signature info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info that was removed
	 * @throws NoSuchFireBrigadeSignatureInfoException if a fire brigade signature info with the primary key could not be found
	 */
	public static FireBrigadeSignatureInfo remove(
			long fireBrigadeSignatureInfoId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeSignatureInfoException {

		return getPersistence().remove(fireBrigadeSignatureInfoId);
	}

	public static FireBrigadeSignatureInfo updateImpl(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo) {

		return getPersistence().updateImpl(fireBrigadeSignatureInfo);
	}

	/**
	 * Returns the fire brigade signature info with the primary key or throws a <code>NoSuchFireBrigadeSignatureInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info
	 * @throws NoSuchFireBrigadeSignatureInfoException if a fire brigade signature info with the primary key could not be found
	 */
	public static FireBrigadeSignatureInfo findByPrimaryKey(
			long fireBrigadeSignatureInfoId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeSignatureInfoException {

		return getPersistence().findByPrimaryKey(fireBrigadeSignatureInfoId);
	}

	/**
	 * Returns the fire brigade signature info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info, or <code>null</code> if a fire brigade signature info with the primary key could not be found
	 */
	public static FireBrigadeSignatureInfo fetchByPrimaryKey(
		long fireBrigadeSignatureInfoId) {

		return getPersistence().fetchByPrimaryKey(fireBrigadeSignatureInfoId);
	}

	/**
	 * Returns all the fire brigade signature infos.
	 *
	 * @return the fire brigade signature infos
	 */
	public static List<FireBrigadeSignatureInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @return the range of fire brigade signature infos
	 */
	public static List<FireBrigadeSignatureInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade signature infos
	 */
	public static List<FireBrigadeSignatureInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeSignatureInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade signature infos
	 */
	public static List<FireBrigadeSignatureInfo> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeSignatureInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade signature infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade signature infos.
	 *
	 * @return the number of fire brigade signature infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadeSignatureInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadeSignatureInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadeSignatureInfoPersistence _persistence;

}