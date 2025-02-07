/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez zone dev under info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezZoneDevUnderInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneDevUnderInfoPersistence
 * @generated
 */
public class SezZoneDevUnderInfoUtil {

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
	public static void clearCache(SezZoneDevUnderInfo sezZoneDevUnderInfo) {
		getPersistence().clearCache(sezZoneDevUnderInfo);
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
	public static Map<Serializable, SezZoneDevUnderInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezZoneDevUnderInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezZoneDevUnderInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezZoneDevUnderInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezZoneDevUnderInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezZoneDevUnderInfo update(
		SezZoneDevUnderInfo sezZoneDevUnderInfo) {

		return getPersistence().update(sezZoneDevUnderInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezZoneDevUnderInfo update(
		SezZoneDevUnderInfo sezZoneDevUnderInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(sezZoneDevUnderInfo, serviceContext);
	}

	/**
	 * Returns the sez zone dev under info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneDevUnderInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone dev under info
	 * @throws NoSuchSezZoneDevUnderInfoException if a matching sez zone dev under info could not be found
	 */
	public static SezZoneDevUnderInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneDevUnderInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone dev under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone dev under info, or <code>null</code> if a matching sez zone dev under info could not be found
	 */
	public static SezZoneDevUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone dev under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone dev under info, or <code>null</code> if a matching sez zone dev under info could not be found
	 */
	public static SezZoneDevUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez zone dev under info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone dev under info that was removed
	 */
	public static SezZoneDevUnderInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneDevUnderInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez zone dev under infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone dev under infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez zone dev under info in the entity cache if it is enabled.
	 *
	 * @param sezZoneDevUnderInfo the sez zone dev under info
	 */
	public static void cacheResult(SezZoneDevUnderInfo sezZoneDevUnderInfo) {
		getPersistence().cacheResult(sezZoneDevUnderInfo);
	}

	/**
	 * Caches the sez zone dev under infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneDevUnderInfos the sez zone dev under infos
	 */
	public static void cacheResult(
		List<SezZoneDevUnderInfo> sezZoneDevUnderInfos) {

		getPersistence().cacheResult(sezZoneDevUnderInfos);
	}

	/**
	 * Creates a new sez zone dev under info with the primary key. Does not add the sez zone dev under info to the database.
	 *
	 * @param sezZoneDevUnderInfoId the primary key for the new sez zone dev under info
	 * @return the new sez zone dev under info
	 */
	public static SezZoneDevUnderInfo create(long sezZoneDevUnderInfoId) {
		return getPersistence().create(sezZoneDevUnderInfoId);
	}

	/**
	 * Removes the sez zone dev under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info that was removed
	 * @throws NoSuchSezZoneDevUnderInfoException if a sez zone dev under info with the primary key could not be found
	 */
	public static SezZoneDevUnderInfo remove(long sezZoneDevUnderInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneDevUnderInfoException {

		return getPersistence().remove(sezZoneDevUnderInfoId);
	}

	public static SezZoneDevUnderInfo updateImpl(
		SezZoneDevUnderInfo sezZoneDevUnderInfo) {

		return getPersistence().updateImpl(sezZoneDevUnderInfo);
	}

	/**
	 * Returns the sez zone dev under info with the primary key or throws a <code>NoSuchSezZoneDevUnderInfoException</code> if it could not be found.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info
	 * @throws NoSuchSezZoneDevUnderInfoException if a sez zone dev under info with the primary key could not be found
	 */
	public static SezZoneDevUnderInfo findByPrimaryKey(
			long sezZoneDevUnderInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneDevUnderInfoException {

		return getPersistence().findByPrimaryKey(sezZoneDevUnderInfoId);
	}

	/**
	 * Returns the sez zone dev under info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info, or <code>null</code> if a sez zone dev under info with the primary key could not be found
	 */
	public static SezZoneDevUnderInfo fetchByPrimaryKey(
		long sezZoneDevUnderInfoId) {

		return getPersistence().fetchByPrimaryKey(sezZoneDevUnderInfoId);
	}

	/**
	 * Returns all the sez zone dev under infos.
	 *
	 * @return the sez zone dev under infos
	 */
	public static List<SezZoneDevUnderInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @return the range of sez zone dev under infos
	 */
	public static List<SezZoneDevUnderInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone dev under infos
	 */
	public static List<SezZoneDevUnderInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneDevUnderInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone dev under infos
	 */
	public static List<SezZoneDevUnderInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneDevUnderInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez zone dev under infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez zone dev under infos.
	 *
	 * @return the number of sez zone dev under infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezZoneDevUnderInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezZoneDevUnderInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezZoneDevUnderInfoPersistence _persistence;

}