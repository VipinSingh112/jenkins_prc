/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupanteDeveloperUndertakingInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupante developer undertaking info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupanteDeveloperUndertakingInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteDeveloperUndertakingInfoPersistence
 * @generated
 */
public class SezOccupanteDeveloperUndertakingInfoUtil {

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
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		getPersistence().clearCache(sezOccupanteDeveloperUndertakingInfo);
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
	public static Map<Serializable, SezOccupanteDeveloperUndertakingInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupanteDeveloperUndertakingInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupanteDeveloperUndertakingInfo>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupanteDeveloperUndertakingInfo>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<SezOccupanteDeveloperUndertakingInfo>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupanteDeveloperUndertakingInfo update(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		return getPersistence().update(sezOccupanteDeveloperUndertakingInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupanteDeveloperUndertakingInfo update(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupanteDeveloperUndertakingInfo, serviceContext);
	}

	/**
	 * Returns the sez occupante developer undertaking info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupanteDeveloperUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante developer undertaking info
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a matching sez occupante developer undertaking info could not be found
	 */
	public static SezOccupanteDeveloperUndertakingInfo
			findBygetSezStatusByAppId(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupanteDeveloperUndertakingInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupante developer undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupante developer undertaking info, or <code>null</code> if a matching sez occupante developer undertaking info could not be found
	 */
	public static SezOccupanteDeveloperUndertakingInfo
		fetchBygetSezStatusByAppId(long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupante developer undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupante developer undertaking info, or <code>null</code> if a matching sez occupante developer undertaking info could not be found
	 */
	public static SezOccupanteDeveloperUndertakingInfo
		fetchBygetSezStatusByAppId(
			long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupante developer undertaking info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupante developer undertaking info that was removed
	 */
	public static SezOccupanteDeveloperUndertakingInfo
			removeBygetSezStatusByAppId(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupanteDeveloperUndertakingInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupante developer undertaking infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupante developer undertaking infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupante developer undertaking info in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteDeveloperUndertakingInfo the sez occupante developer undertaking info
	 */
	public static void cacheResult(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		getPersistence().cacheResult(sezOccupanteDeveloperUndertakingInfo);
	}

	/**
	 * Caches the sez occupante developer undertaking infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupanteDeveloperUndertakingInfos the sez occupante developer undertaking infos
	 */
	public static void cacheResult(
		List<SezOccupanteDeveloperUndertakingInfo>
			sezOccupanteDeveloperUndertakingInfos) {

		getPersistence().cacheResult(sezOccupanteDeveloperUndertakingInfos);
	}

	/**
	 * Creates a new sez occupante developer undertaking info with the primary key. Does not add the sez occupante developer undertaking info to the database.
	 *
	 * @param sezOccDevUnderId the primary key for the new sez occupante developer undertaking info
	 * @return the new sez occupante developer undertaking info
	 */
	public static SezOccupanteDeveloperUndertakingInfo create(
		long sezOccDevUnderId) {

		return getPersistence().create(sezOccDevUnderId);
	}

	/**
	 * Removes the sez occupante developer undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info that was removed
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	public static SezOccupanteDeveloperUndertakingInfo remove(
			long sezOccDevUnderId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupanteDeveloperUndertakingInfoException {

		return getPersistence().remove(sezOccDevUnderId);
	}

	public static SezOccupanteDeveloperUndertakingInfo updateImpl(
		SezOccupanteDeveloperUndertakingInfo
			sezOccupanteDeveloperUndertakingInfo) {

		return getPersistence().updateImpl(
			sezOccupanteDeveloperUndertakingInfo);
	}

	/**
	 * Returns the sez occupante developer undertaking info with the primary key or throws a <code>NoSuchSezOccupanteDeveloperUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info
	 * @throws NoSuchSezOccupanteDeveloperUndertakingInfoException if a sez occupante developer undertaking info with the primary key could not be found
	 */
	public static SezOccupanteDeveloperUndertakingInfo findByPrimaryKey(
			long sezOccDevUnderId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupanteDeveloperUndertakingInfoException {

		return getPersistence().findByPrimaryKey(sezOccDevUnderId);
	}

	/**
	 * Returns the sez occupante developer undertaking info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccDevUnderId the primary key of the sez occupante developer undertaking info
	 * @return the sez occupante developer undertaking info, or <code>null</code> if a sez occupante developer undertaking info with the primary key could not be found
	 */
	public static SezOccupanteDeveloperUndertakingInfo fetchByPrimaryKey(
		long sezOccDevUnderId) {

		return getPersistence().fetchByPrimaryKey(sezOccDevUnderId);
	}

	/**
	 * Returns all the sez occupante developer undertaking infos.
	 *
	 * @return the sez occupante developer undertaking infos
	 */
	public static List<SezOccupanteDeveloperUndertakingInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @return the range of sez occupante developer undertaking infos
	 */
	public static List<SezOccupanteDeveloperUndertakingInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupante developer undertaking infos
	 */
	public static List<SezOccupanteDeveloperUndertakingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupanteDeveloperUndertakingInfo>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupante developer undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupanteDeveloperUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupante developer undertaking infos
	 * @param end the upper bound of the range of sez occupante developer undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupante developer undertaking infos
	 */
	public static List<SezOccupanteDeveloperUndertakingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupanteDeveloperUndertakingInfo>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupante developer undertaking infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupante developer undertaking infos.
	 *
	 * @return the number of sez occupante developer undertaking infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupanteDeveloperUndertakingInfoPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		SezOccupanteDeveloperUndertakingInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupanteDeveloperUndertakingInfoPersistence
		_persistence;

}