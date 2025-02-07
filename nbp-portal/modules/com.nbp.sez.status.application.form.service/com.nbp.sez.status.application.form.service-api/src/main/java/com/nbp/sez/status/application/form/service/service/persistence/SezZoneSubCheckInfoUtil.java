/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez zone sub check info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezZoneSubCheckInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneSubCheckInfoPersistence
 * @generated
 */
public class SezZoneSubCheckInfoUtil {

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
	public static void clearCache(SezZoneSubCheckInfo sezZoneSubCheckInfo) {
		getPersistence().clearCache(sezZoneSubCheckInfo);
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
	public static Map<Serializable, SezZoneSubCheckInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezZoneSubCheckInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezZoneSubCheckInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezZoneSubCheckInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezZoneSubCheckInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezZoneSubCheckInfo update(
		SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		return getPersistence().update(sezZoneSubCheckInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezZoneSubCheckInfo update(
		SezZoneSubCheckInfo sezZoneSubCheckInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(sezZoneSubCheckInfo, serviceContext);
	}

	/**
	 * Returns the sez zone sub check info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneSubCheckInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone sub check info
	 * @throws NoSuchSezZoneSubCheckInfoException if a matching sez zone sub check info could not be found
	 */
	public static SezZoneSubCheckInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneSubCheckInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone sub check info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone sub check info, or <code>null</code> if a matching sez zone sub check info could not be found
	 */
	public static SezZoneSubCheckInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone sub check info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone sub check info, or <code>null</code> if a matching sez zone sub check info could not be found
	 */
	public static SezZoneSubCheckInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez zone sub check info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone sub check info that was removed
	 */
	public static SezZoneSubCheckInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneSubCheckInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez zone sub check infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone sub check infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez zone sub check info in the entity cache if it is enabled.
	 *
	 * @param sezZoneSubCheckInfo the sez zone sub check info
	 */
	public static void cacheResult(SezZoneSubCheckInfo sezZoneSubCheckInfo) {
		getPersistence().cacheResult(sezZoneSubCheckInfo);
	}

	/**
	 * Caches the sez zone sub check infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneSubCheckInfos the sez zone sub check infos
	 */
	public static void cacheResult(
		List<SezZoneSubCheckInfo> sezZoneSubCheckInfos) {

		getPersistence().cacheResult(sezZoneSubCheckInfos);
	}

	/**
	 * Creates a new sez zone sub check info with the primary key. Does not add the sez zone sub check info to the database.
	 *
	 * @param sezZoneSubCheckInfoId the primary key for the new sez zone sub check info
	 * @return the new sez zone sub check info
	 */
	public static SezZoneSubCheckInfo create(long sezZoneSubCheckInfoId) {
		return getPersistence().create(sezZoneSubCheckInfoId);
	}

	/**
	 * Removes the sez zone sub check info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info that was removed
	 * @throws NoSuchSezZoneSubCheckInfoException if a sez zone sub check info with the primary key could not be found
	 */
	public static SezZoneSubCheckInfo remove(long sezZoneSubCheckInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneSubCheckInfoException {

		return getPersistence().remove(sezZoneSubCheckInfoId);
	}

	public static SezZoneSubCheckInfo updateImpl(
		SezZoneSubCheckInfo sezZoneSubCheckInfo) {

		return getPersistence().updateImpl(sezZoneSubCheckInfo);
	}

	/**
	 * Returns the sez zone sub check info with the primary key or throws a <code>NoSuchSezZoneSubCheckInfoException</code> if it could not be found.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info
	 * @throws NoSuchSezZoneSubCheckInfoException if a sez zone sub check info with the primary key could not be found
	 */
	public static SezZoneSubCheckInfo findByPrimaryKey(
			long sezZoneSubCheckInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneSubCheckInfoException {

		return getPersistence().findByPrimaryKey(sezZoneSubCheckInfoId);
	}

	/**
	 * Returns the sez zone sub check info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info, or <code>null</code> if a sez zone sub check info with the primary key could not be found
	 */
	public static SezZoneSubCheckInfo fetchByPrimaryKey(
		long sezZoneSubCheckInfoId) {

		return getPersistence().fetchByPrimaryKey(sezZoneSubCheckInfoId);
	}

	/**
	 * Returns all the sez zone sub check infos.
	 *
	 * @return the sez zone sub check infos
	 */
	public static List<SezZoneSubCheckInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @return the range of sez zone sub check infos
	 */
	public static List<SezZoneSubCheckInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone sub check infos
	 */
	public static List<SezZoneSubCheckInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneSubCheckInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone sub check infos
	 */
	public static List<SezZoneSubCheckInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneSubCheckInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez zone sub check infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez zone sub check infos.
	 *
	 * @return the number of sez zone sub check infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezZoneSubCheckInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezZoneSubCheckInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezZoneSubCheckInfoPersistence _persistence;

}