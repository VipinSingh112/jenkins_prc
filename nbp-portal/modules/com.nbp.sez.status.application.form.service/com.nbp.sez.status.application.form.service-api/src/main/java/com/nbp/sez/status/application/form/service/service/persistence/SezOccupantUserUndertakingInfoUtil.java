/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantUserUndertakingInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant user undertaking info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantUserUndertakingInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantUserUndertakingInfoPersistence
 * @generated
 */
public class SezOccupantUserUndertakingInfoUtil {

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
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		getPersistence().clearCache(sezOccupantUserUndertakingInfo);
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
	public static Map<Serializable, SezOccupantUserUndertakingInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantUserUndertakingInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantUserUndertakingInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantUserUndertakingInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccupantUserUndertakingInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantUserUndertakingInfo update(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		return getPersistence().update(sezOccupantUserUndertakingInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantUserUndertakingInfo update(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantUserUndertakingInfo, serviceContext);
	}

	/**
	 * Returns the sez occupant user undertaking info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantUserUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant user undertaking info
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a matching sez occupant user undertaking info could not be found
	 */
	public static SezOccupantUserUndertakingInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantUserUndertakingInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant user undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant user undertaking info, or <code>null</code> if a matching sez occupant user undertaking info could not be found
	 */
	public static SezOccupantUserUndertakingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant user undertaking info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant user undertaking info, or <code>null</code> if a matching sez occupant user undertaking info could not be found
	 */
	public static SezOccupantUserUndertakingInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupant user undertaking info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant user undertaking info that was removed
	 */
	public static SezOccupantUserUndertakingInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantUserUndertakingInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant user undertaking infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant user undertaking infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant user undertaking info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantUserUndertakingInfo the sez occupant user undertaking info
	 */
	public static void cacheResult(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		getPersistence().cacheResult(sezOccupantUserUndertakingInfo);
	}

	/**
	 * Caches the sez occupant user undertaking infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantUserUndertakingInfos the sez occupant user undertaking infos
	 */
	public static void cacheResult(
		List<SezOccupantUserUndertakingInfo> sezOccupantUserUndertakingInfos) {

		getPersistence().cacheResult(sezOccupantUserUndertakingInfos);
	}

	/**
	 * Creates a new sez occupant user undertaking info with the primary key. Does not add the sez occupant user undertaking info to the database.
	 *
	 * @param sezOccUserunderId the primary key for the new sez occupant user undertaking info
	 * @return the new sez occupant user undertaking info
	 */
	public static SezOccupantUserUndertakingInfo create(
		long sezOccUserunderId) {

		return getPersistence().create(sezOccUserunderId);
	}

	/**
	 * Removes the sez occupant user undertaking info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info that was removed
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a sez occupant user undertaking info with the primary key could not be found
	 */
	public static SezOccupantUserUndertakingInfo remove(long sezOccUserunderId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantUserUndertakingInfoException {

		return getPersistence().remove(sezOccUserunderId);
	}

	public static SezOccupantUserUndertakingInfo updateImpl(
		SezOccupantUserUndertakingInfo sezOccupantUserUndertakingInfo) {

		return getPersistence().updateImpl(sezOccupantUserUndertakingInfo);
	}

	/**
	 * Returns the sez occupant user undertaking info with the primary key or throws a <code>NoSuchSezOccupantUserUndertakingInfoException</code> if it could not be found.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info
	 * @throws NoSuchSezOccupantUserUndertakingInfoException if a sez occupant user undertaking info with the primary key could not be found
	 */
	public static SezOccupantUserUndertakingInfo findByPrimaryKey(
			long sezOccUserunderId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantUserUndertakingInfoException {

		return getPersistence().findByPrimaryKey(sezOccUserunderId);
	}

	/**
	 * Returns the sez occupant user undertaking info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccUserunderId the primary key of the sez occupant user undertaking info
	 * @return the sez occupant user undertaking info, or <code>null</code> if a sez occupant user undertaking info with the primary key could not be found
	 */
	public static SezOccupantUserUndertakingInfo fetchByPrimaryKey(
		long sezOccUserunderId) {

		return getPersistence().fetchByPrimaryKey(sezOccUserunderId);
	}

	/**
	 * Returns all the sez occupant user undertaking infos.
	 *
	 * @return the sez occupant user undertaking infos
	 */
	public static List<SezOccupantUserUndertakingInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @return the range of sez occupant user undertaking infos
	 */
	public static List<SezOccupantUserUndertakingInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant user undertaking infos
	 */
	public static List<SezOccupantUserUndertakingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantUserUndertakingInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant user undertaking infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantUserUndertakingInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant user undertaking infos
	 * @param end the upper bound of the range of sez occupant user undertaking infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant user undertaking infos
	 */
	public static List<SezOccupantUserUndertakingInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantUserUndertakingInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant user undertaking infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant user undertaking infos.
	 *
	 * @return the number of sez occupant user undertaking infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantUserUndertakingInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezOccupantUserUndertakingInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantUserUndertakingInfoPersistence
		_persistence;

}