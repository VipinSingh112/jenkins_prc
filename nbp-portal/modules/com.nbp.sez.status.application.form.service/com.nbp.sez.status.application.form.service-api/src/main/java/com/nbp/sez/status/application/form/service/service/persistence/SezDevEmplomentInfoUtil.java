/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev emploment info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevEmplomentInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevEmplomentInfoPersistence
 * @generated
 */
public class SezDevEmplomentInfoUtil {

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
	public static void clearCache(SezDevEmplomentInfo sezDevEmplomentInfo) {
		getPersistence().clearCache(sezDevEmplomentInfo);
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
	public static Map<Serializable, SezDevEmplomentInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevEmplomentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevEmplomentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevEmplomentInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevEmplomentInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevEmplomentInfo update(
		SezDevEmplomentInfo sezDevEmplomentInfo) {

		return getPersistence().update(sezDevEmplomentInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevEmplomentInfo update(
		SezDevEmplomentInfo sezDevEmplomentInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(sezDevEmplomentInfo, serviceContext);
	}

	/**
	 * Returns the sez dev emploment info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevEmplomentInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev emploment info
	 * @throws NoSuchSezDevEmplomentInfoException if a matching sez dev emploment info could not be found
	 */
	public static SezDevEmplomentInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmplomentInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev emploment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev emploment info, or <code>null</code> if a matching sez dev emploment info could not be found
	 */
	public static SezDevEmplomentInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev emploment info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev emploment info, or <code>null</code> if a matching sez dev emploment info could not be found
	 */
	public static SezDevEmplomentInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez dev emploment info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev emploment info that was removed
	 */
	public static SezDevEmplomentInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmplomentInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev emploment infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev emploment infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev emploment info in the entity cache if it is enabled.
	 *
	 * @param sezDevEmplomentInfo the sez dev emploment info
	 */
	public static void cacheResult(SezDevEmplomentInfo sezDevEmplomentInfo) {
		getPersistence().cacheResult(sezDevEmplomentInfo);
	}

	/**
	 * Caches the sez dev emploment infos in the entity cache if it is enabled.
	 *
	 * @param sezDevEmplomentInfos the sez dev emploment infos
	 */
	public static void cacheResult(
		List<SezDevEmplomentInfo> sezDevEmplomentInfos) {

		getPersistence().cacheResult(sezDevEmplomentInfos);
	}

	/**
	 * Creates a new sez dev emploment info with the primary key. Does not add the sez dev emploment info to the database.
	 *
	 * @param sezDevEmplomentInfoId the primary key for the new sez dev emploment info
	 * @return the new sez dev emploment info
	 */
	public static SezDevEmplomentInfo create(long sezDevEmplomentInfoId) {
		return getPersistence().create(sezDevEmplomentInfoId);
	}

	/**
	 * Removes the sez dev emploment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevEmplomentInfoId the primary key of the sez dev emploment info
	 * @return the sez dev emploment info that was removed
	 * @throws NoSuchSezDevEmplomentInfoException if a sez dev emploment info with the primary key could not be found
	 */
	public static SezDevEmplomentInfo remove(long sezDevEmplomentInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmplomentInfoException {

		return getPersistence().remove(sezDevEmplomentInfoId);
	}

	public static SezDevEmplomentInfo updateImpl(
		SezDevEmplomentInfo sezDevEmplomentInfo) {

		return getPersistence().updateImpl(sezDevEmplomentInfo);
	}

	/**
	 * Returns the sez dev emploment info with the primary key or throws a <code>NoSuchSezDevEmplomentInfoException</code> if it could not be found.
	 *
	 * @param sezDevEmplomentInfoId the primary key of the sez dev emploment info
	 * @return the sez dev emploment info
	 * @throws NoSuchSezDevEmplomentInfoException if a sez dev emploment info with the primary key could not be found
	 */
	public static SezDevEmplomentInfo findByPrimaryKey(
			long sezDevEmplomentInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevEmplomentInfoException {

		return getPersistence().findByPrimaryKey(sezDevEmplomentInfoId);
	}

	/**
	 * Returns the sez dev emploment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevEmplomentInfoId the primary key of the sez dev emploment info
	 * @return the sez dev emploment info, or <code>null</code> if a sez dev emploment info with the primary key could not be found
	 */
	public static SezDevEmplomentInfo fetchByPrimaryKey(
		long sezDevEmplomentInfoId) {

		return getPersistence().fetchByPrimaryKey(sezDevEmplomentInfoId);
	}

	/**
	 * Returns all the sez dev emploment infos.
	 *
	 * @return the sez dev emploment infos
	 */
	public static List<SezDevEmplomentInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev emploment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmplomentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev emploment infos
	 * @param end the upper bound of the range of sez dev emploment infos (not inclusive)
	 * @return the range of sez dev emploment infos
	 */
	public static List<SezDevEmplomentInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev emploment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmplomentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev emploment infos
	 * @param end the upper bound of the range of sez dev emploment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev emploment infos
	 */
	public static List<SezDevEmplomentInfo> findAll(
		int start, int end,
		OrderByComparator<SezDevEmplomentInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev emploment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevEmplomentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev emploment infos
	 * @param end the upper bound of the range of sez dev emploment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev emploment infos
	 */
	public static List<SezDevEmplomentInfo> findAll(
		int start, int end,
		OrderByComparator<SezDevEmplomentInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev emploment infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev emploment infos.
	 *
	 * @return the number of sez dev emploment infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevEmplomentInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevEmplomentInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevEmplomentInfoPersistence _persistence;

}