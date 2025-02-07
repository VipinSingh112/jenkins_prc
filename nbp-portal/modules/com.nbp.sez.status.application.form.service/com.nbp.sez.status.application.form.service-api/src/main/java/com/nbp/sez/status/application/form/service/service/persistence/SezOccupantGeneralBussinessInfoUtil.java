/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant general bussiness info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantGeneralBussinessInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessInfoPersistence
 * @generated
 */
public class SezOccupantGeneralBussinessInfoUtil {

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
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		getPersistence().clearCache(sezOccupantGeneralBussinessInfo);
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
	public static Map<Serializable, SezOccupantGeneralBussinessInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantGeneralBussinessInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantGeneralBussinessInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantGeneralBussinessInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantGeneralBussinessInfo update(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		return getPersistence().update(sezOccupantGeneralBussinessInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantGeneralBussinessInfo update(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantGeneralBussinessInfo, serviceContext);
	}

	/**
	 * Returns the sez occupant general bussiness info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness info
	 * @throws NoSuchSezOccupantGeneralBussinessInfoException if a matching sez occupant general bussiness info could not be found
	 */
	public static SezOccupantGeneralBussinessInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessInfoException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant general bussiness info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness info, or <code>null</code> if a matching sez occupant general bussiness info could not be found
	 */
	public static SezOccupantGeneralBussinessInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant general bussiness info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness info, or <code>null</code> if a matching sez occupant general bussiness info could not be found
	 */
	public static SezOccupantGeneralBussinessInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupant general bussiness info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant general bussiness info that was removed
	 */
	public static SezOccupantGeneralBussinessInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessInfoException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant general bussiness infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant general bussiness infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez occupant general bussiness info in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessInfo the sez occupant general bussiness info
	 */
	public static void cacheResult(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		getPersistence().cacheResult(sezOccupantGeneralBussinessInfo);
	}

	/**
	 * Caches the sez occupant general bussiness infos in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessInfos the sez occupant general bussiness infos
	 */
	public static void cacheResult(
		List<SezOccupantGeneralBussinessInfo>
			sezOccupantGeneralBussinessInfos) {

		getPersistence().cacheResult(sezOccupantGeneralBussinessInfos);
	}

	/**
	 * Creates a new sez occupant general bussiness info with the primary key. Does not add the sez occupant general bussiness info to the database.
	 *
	 * @param sezOccGenBussId the primary key for the new sez occupant general bussiness info
	 * @return the new sez occupant general bussiness info
	 */
	public static SezOccupantGeneralBussinessInfo create(long sezOccGenBussId) {
		return getPersistence().create(sezOccGenBussId);
	}

	/**
	 * Removes the sez occupant general bussiness info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccGenBussId the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info that was removed
	 * @throws NoSuchSezOccupantGeneralBussinessInfoException if a sez occupant general bussiness info with the primary key could not be found
	 */
	public static SezOccupantGeneralBussinessInfo remove(long sezOccGenBussId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessInfoException {

		return getPersistence().remove(sezOccGenBussId);
	}

	public static SezOccupantGeneralBussinessInfo updateImpl(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		return getPersistence().updateImpl(sezOccupantGeneralBussinessInfo);
	}

	/**
	 * Returns the sez occupant general bussiness info with the primary key or throws a <code>NoSuchSezOccupantGeneralBussinessInfoException</code> if it could not be found.
	 *
	 * @param sezOccGenBussId the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info
	 * @throws NoSuchSezOccupantGeneralBussinessInfoException if a sez occupant general bussiness info with the primary key could not be found
	 */
	public static SezOccupantGeneralBussinessInfo findByPrimaryKey(
			long sezOccGenBussId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessInfoException {

		return getPersistence().findByPrimaryKey(sezOccGenBussId);
	}

	/**
	 * Returns the sez occupant general bussiness info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccGenBussId the primary key of the sez occupant general bussiness info
	 * @return the sez occupant general bussiness info, or <code>null</code> if a sez occupant general bussiness info with the primary key could not be found
	 */
	public static SezOccupantGeneralBussinessInfo fetchByPrimaryKey(
		long sezOccGenBussId) {

		return getPersistence().fetchByPrimaryKey(sezOccGenBussId);
	}

	/**
	 * Returns all the sez occupant general bussiness infos.
	 *
	 * @return the sez occupant general bussiness infos
	 */
	public static List<SezOccupantGeneralBussinessInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant general bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness infos
	 * @param end the upper bound of the range of sez occupant general bussiness infos (not inclusive)
	 * @return the range of sez occupant general bussiness infos
	 */
	public static List<SezOccupantGeneralBussinessInfo> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant general bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness infos
	 * @param end the upper bound of the range of sez occupant general bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant general bussiness infos
	 */
	public static List<SezOccupantGeneralBussinessInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant general bussiness infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness infos
	 * @param end the upper bound of the range of sez occupant general bussiness infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant general bussiness infos
	 */
	public static List<SezOccupantGeneralBussinessInfo> findAll(
		int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant general bussiness infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant general bussiness infos.
	 *
	 * @return the number of sez occupant general bussiness infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantGeneralBussinessInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezOccupantGeneralBussinessInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantGeneralBussinessInfoPersistence
		_persistence;

}