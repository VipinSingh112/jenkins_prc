/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezZoneFinancialInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez zone financial info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezZoneFinancialInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneFinancialInfoPersistence
 * @generated
 */
public class SezZoneFinancialInfoUtil {

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
	public static void clearCache(SezZoneFinancialInfo sezZoneFinancialInfo) {
		getPersistence().clearCache(sezZoneFinancialInfo);
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
	public static Map<Serializable, SezZoneFinancialInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezZoneFinancialInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezZoneFinancialInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezZoneFinancialInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezZoneFinancialInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezZoneFinancialInfo update(
		SezZoneFinancialInfo sezZoneFinancialInfo) {

		return getPersistence().update(sezZoneFinancialInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezZoneFinancialInfo update(
		SezZoneFinancialInfo sezZoneFinancialInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(sezZoneFinancialInfo, serviceContext);
	}

	/**
	 * Returns the sez zone financial info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneFinancialInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone financial info
	 * @throws NoSuchSezZoneFinancialInfoException if a matching sez zone financial info could not be found
	 */
	public static SezZoneFinancialInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneFinancialInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone financial info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone financial info, or <code>null</code> if a matching sez zone financial info could not be found
	 */
	public static SezZoneFinancialInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone financial info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone financial info, or <code>null</code> if a matching sez zone financial info could not be found
	 */
	public static SezZoneFinancialInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez zone financial info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone financial info that was removed
	 */
	public static SezZoneFinancialInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneFinancialInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez zone financial infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone financial infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez zone financial info in the entity cache if it is enabled.
	 *
	 * @param sezZoneFinancialInfo the sez zone financial info
	 */
	public static void cacheResult(SezZoneFinancialInfo sezZoneFinancialInfo) {
		getPersistence().cacheResult(sezZoneFinancialInfo);
	}

	/**
	 * Caches the sez zone financial infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneFinancialInfos the sez zone financial infos
	 */
	public static void cacheResult(
		List<SezZoneFinancialInfo> sezZoneFinancialInfos) {

		getPersistence().cacheResult(sezZoneFinancialInfos);
	}

	/**
	 * Creates a new sez zone financial info with the primary key. Does not add the sez zone financial info to the database.
	 *
	 * @param sezZoneFinancialnfoId the primary key for the new sez zone financial info
	 * @return the new sez zone financial info
	 */
	public static SezZoneFinancialInfo create(long sezZoneFinancialnfoId) {
		return getPersistence().create(sezZoneFinancialnfoId);
	}

	/**
	 * Removes the sez zone financial info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info that was removed
	 * @throws NoSuchSezZoneFinancialInfoException if a sez zone financial info with the primary key could not be found
	 */
	public static SezZoneFinancialInfo remove(long sezZoneFinancialnfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneFinancialInfoException {

		return getPersistence().remove(sezZoneFinancialnfoId);
	}

	public static SezZoneFinancialInfo updateImpl(
		SezZoneFinancialInfo sezZoneFinancialInfo) {

		return getPersistence().updateImpl(sezZoneFinancialInfo);
	}

	/**
	 * Returns the sez zone financial info with the primary key or throws a <code>NoSuchSezZoneFinancialInfoException</code> if it could not be found.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info
	 * @throws NoSuchSezZoneFinancialInfoException if a sez zone financial info with the primary key could not be found
	 */
	public static SezZoneFinancialInfo findByPrimaryKey(
			long sezZoneFinancialnfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneFinancialInfoException {

		return getPersistence().findByPrimaryKey(sezZoneFinancialnfoId);
	}

	/**
	 * Returns the sez zone financial info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneFinancialnfoId the primary key of the sez zone financial info
	 * @return the sez zone financial info, or <code>null</code> if a sez zone financial info with the primary key could not be found
	 */
	public static SezZoneFinancialInfo fetchByPrimaryKey(
		long sezZoneFinancialnfoId) {

		return getPersistence().fetchByPrimaryKey(sezZoneFinancialnfoId);
	}

	/**
	 * Returns all the sez zone financial infos.
	 *
	 * @return the sez zone financial infos
	 */
	public static List<SezZoneFinancialInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @return the range of sez zone financial infos
	 */
	public static List<SezZoneFinancialInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone financial infos
	 */
	public static List<SezZoneFinancialInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneFinancialInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone financial infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneFinancialInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone financial infos
	 * @param end the upper bound of the range of sez zone financial infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone financial infos
	 */
	public static List<SezZoneFinancialInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneFinancialInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez zone financial infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez zone financial infos.
	 *
	 * @return the number of sez zone financial infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezZoneFinancialInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezZoneFinancialInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezZoneFinancialInfoPersistence _persistence;

}