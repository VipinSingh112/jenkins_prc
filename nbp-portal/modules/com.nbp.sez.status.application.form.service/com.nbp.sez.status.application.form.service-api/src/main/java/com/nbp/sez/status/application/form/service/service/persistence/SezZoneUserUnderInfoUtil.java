/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez zone user under info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezZoneUserUnderInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfoPersistence
 * @generated
 */
public class SezZoneUserUnderInfoUtil {

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
	public static void clearCache(SezZoneUserUnderInfo sezZoneUserUnderInfo) {
		getPersistence().clearCache(sezZoneUserUnderInfo);
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
	public static Map<Serializable, SezZoneUserUnderInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezZoneUserUnderInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezZoneUserUnderInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezZoneUserUnderInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezZoneUserUnderInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezZoneUserUnderInfo update(
		SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		return getPersistence().update(sezZoneUserUnderInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezZoneUserUnderInfo update(
		SezZoneUserUnderInfo sezZoneUserUnderInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(sezZoneUserUnderInfo, serviceContext);
	}

	/**
	 * Returns the sez zone user under info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneUserUnderInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone user under info
	 * @throws NoSuchSezZoneUserUnderInfoException if a matching sez zone user under info could not be found
	 */
	public static SezZoneUserUnderInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneUserUnderInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone user under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone user under info, or <code>null</code> if a matching sez zone user under info could not be found
	 */
	public static SezZoneUserUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone user under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone user under info, or <code>null</code> if a matching sez zone user under info could not be found
	 */
	public static SezZoneUserUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez zone user under info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone user under info that was removed
	 */
	public static SezZoneUserUnderInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneUserUnderInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez zone user under infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone user under infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez zone user under info in the entity cache if it is enabled.
	 *
	 * @param sezZoneUserUnderInfo the sez zone user under info
	 */
	public static void cacheResult(SezZoneUserUnderInfo sezZoneUserUnderInfo) {
		getPersistence().cacheResult(sezZoneUserUnderInfo);
	}

	/**
	 * Caches the sez zone user under infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneUserUnderInfos the sez zone user under infos
	 */
	public static void cacheResult(
		List<SezZoneUserUnderInfo> sezZoneUserUnderInfos) {

		getPersistence().cacheResult(sezZoneUserUnderInfos);
	}

	/**
	 * Creates a new sez zone user under info with the primary key. Does not add the sez zone user under info to the database.
	 *
	 * @param sezZoneUserUnderInfoId the primary key for the new sez zone user under info
	 * @return the new sez zone user under info
	 */
	public static SezZoneUserUnderInfo create(long sezZoneUserUnderInfoId) {
		return getPersistence().create(sezZoneUserUnderInfoId);
	}

	/**
	 * Removes the sez zone user under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info that was removed
	 * @throws NoSuchSezZoneUserUnderInfoException if a sez zone user under info with the primary key could not be found
	 */
	public static SezZoneUserUnderInfo remove(long sezZoneUserUnderInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneUserUnderInfoException {

		return getPersistence().remove(sezZoneUserUnderInfoId);
	}

	public static SezZoneUserUnderInfo updateImpl(
		SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		return getPersistence().updateImpl(sezZoneUserUnderInfo);
	}

	/**
	 * Returns the sez zone user under info with the primary key or throws a <code>NoSuchSezZoneUserUnderInfoException</code> if it could not be found.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info
	 * @throws NoSuchSezZoneUserUnderInfoException if a sez zone user under info with the primary key could not be found
	 */
	public static SezZoneUserUnderInfo findByPrimaryKey(
			long sezZoneUserUnderInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneUserUnderInfoException {

		return getPersistence().findByPrimaryKey(sezZoneUserUnderInfoId);
	}

	/**
	 * Returns the sez zone user under info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info, or <code>null</code> if a sez zone user under info with the primary key could not be found
	 */
	public static SezZoneUserUnderInfo fetchByPrimaryKey(
		long sezZoneUserUnderInfoId) {

		return getPersistence().fetchByPrimaryKey(sezZoneUserUnderInfoId);
	}

	/**
	 * Returns all the sez zone user under infos.
	 *
	 * @return the sez zone user under infos
	 */
	public static List<SezZoneUserUnderInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @return the range of sez zone user under infos
	 */
	public static List<SezZoneUserUnderInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone user under infos
	 */
	public static List<SezZoneUserUnderInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneUserUnderInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone user under infos
	 */
	public static List<SezZoneUserUnderInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneUserUnderInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez zone user under infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez zone user under infos.
	 *
	 * @return the number of sez zone user under infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezZoneUserUnderInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezZoneUserUnderInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezZoneUserUnderInfoPersistence _persistence;

}