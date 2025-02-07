/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevShareholdingInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev shareholding info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevShareholdingInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevShareholdingInfoPersistence
 * @generated
 */
public class SezDevShareholdingInfoUtil {

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
		SezDevShareholdingInfo sezDevShareholdingInfo) {

		getPersistence().clearCache(sezDevShareholdingInfo);
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
	public static Map<Serializable, SezDevShareholdingInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevShareholdingInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevShareholdingInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevShareholdingInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevShareholdingInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevShareholdingInfo update(
		SezDevShareholdingInfo sezDevShareholdingInfo) {

		return getPersistence().update(sezDevShareholdingInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevShareholdingInfo update(
		SezDevShareholdingInfo sezDevShareholdingInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(sezDevShareholdingInfo, serviceContext);
	}

	/**
	 * Returns the sez dev shareholding info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevShareholdingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev shareholding info
	 * @throws NoSuchSezDevShareholdingInfoException if a matching sez dev shareholding info could not be found
	 */
	public static SezDevShareholdingInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareholdingInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev shareholding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev shareholding info, or <code>null</code> if a matching sez dev shareholding info could not be found
	 */
	public static SezDevShareholdingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev shareholding info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev shareholding info, or <code>null</code> if a matching sez dev shareholding info could not be found
	 */
	public static SezDevShareholdingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez dev shareholding info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev shareholding info that was removed
	 */
	public static SezDevShareholdingInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareholdingInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev shareholding infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev shareholding infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev shareholding info in the entity cache if it is enabled.
	 *
	 * @param sezDevShareholdingInfo the sez dev shareholding info
	 */
	public static void cacheResult(
		SezDevShareholdingInfo sezDevShareholdingInfo) {

		getPersistence().cacheResult(sezDevShareholdingInfo);
	}

	/**
	 * Caches the sez dev shareholding infos in the entity cache if it is enabled.
	 *
	 * @param sezDevShareholdingInfos the sez dev shareholding infos
	 */
	public static void cacheResult(
		List<SezDevShareholdingInfo> sezDevShareholdingInfos) {

		getPersistence().cacheResult(sezDevShareholdingInfos);
	}

	/**
	 * Creates a new sez dev shareholding info with the primary key. Does not add the sez dev shareholding info to the database.
	 *
	 * @param sezDevShareholdingInfoId the primary key for the new sez dev shareholding info
	 * @return the new sez dev shareholding info
	 */
	public static SezDevShareholdingInfo create(long sezDevShareholdingInfoId) {
		return getPersistence().create(sezDevShareholdingInfoId);
	}

	/**
	 * Removes the sez dev shareholding info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info that was removed
	 * @throws NoSuchSezDevShareholdingInfoException if a sez dev shareholding info with the primary key could not be found
	 */
	public static SezDevShareholdingInfo remove(long sezDevShareholdingInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareholdingInfoException {

		return getPersistence().remove(sezDevShareholdingInfoId);
	}

	public static SezDevShareholdingInfo updateImpl(
		SezDevShareholdingInfo sezDevShareholdingInfo) {

		return getPersistence().updateImpl(sezDevShareholdingInfo);
	}

	/**
	 * Returns the sez dev shareholding info with the primary key or throws a <code>NoSuchSezDevShareholdingInfoException</code> if it could not be found.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info
	 * @throws NoSuchSezDevShareholdingInfoException if a sez dev shareholding info with the primary key could not be found
	 */
	public static SezDevShareholdingInfo findByPrimaryKey(
			long sezDevShareholdingInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevShareholdingInfoException {

		return getPersistence().findByPrimaryKey(sezDevShareholdingInfoId);
	}

	/**
	 * Returns the sez dev shareholding info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevShareholdingInfoId the primary key of the sez dev shareholding info
	 * @return the sez dev shareholding info, or <code>null</code> if a sez dev shareholding info with the primary key could not be found
	 */
	public static SezDevShareholdingInfo fetchByPrimaryKey(
		long sezDevShareholdingInfoId) {

		return getPersistence().fetchByPrimaryKey(sezDevShareholdingInfoId);
	}

	/**
	 * Returns all the sez dev shareholding infos.
	 *
	 * @return the sez dev shareholding infos
	 */
	public static List<SezDevShareholdingInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @return the range of sez dev shareholding infos
	 */
	public static List<SezDevShareholdingInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev shareholding infos
	 */
	public static List<SezDevShareholdingInfo> findAll(
		int start, int end,
		OrderByComparator<SezDevShareholdingInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev shareholding infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevShareholdingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev shareholding infos
	 * @param end the upper bound of the range of sez dev shareholding infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev shareholding infos
	 */
	public static List<SezDevShareholdingInfo> findAll(
		int start, int end,
		OrderByComparator<SezDevShareholdingInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev shareholding infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev shareholding infos.
	 *
	 * @return the number of sez dev shareholding infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevShareholdingInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevShareholdingInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevShareholdingInfoPersistence _persistence;

}