/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez zone emp info service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezZoneEmpInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmpInfoPersistence
 * @generated
 */
public class SezZoneEmpInfoUtil {

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
	public static void clearCache(SezZoneEmpInfo sezZoneEmpInfo) {
		getPersistence().clearCache(sezZoneEmpInfo);
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
	public static Map<Serializable, SezZoneEmpInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezZoneEmpInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezZoneEmpInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezZoneEmpInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezZoneEmpInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezZoneEmpInfo update(SezZoneEmpInfo sezZoneEmpInfo) {
		return getPersistence().update(sezZoneEmpInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezZoneEmpInfo update(
		SezZoneEmpInfo sezZoneEmpInfo, ServiceContext serviceContext) {

		return getPersistence().update(sezZoneEmpInfo, serviceContext);
	}

	/**
	 * Returns all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone emp infos
	 */
	public static List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @return the range of matching sez zone emp infos
	 */
	public static List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez zone emp infos
	 */
	public static List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneEmpInfo> orderByComparator) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez zone emp infos
	 */
	public static List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		OrderByComparator<SezZoneEmpInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a matching sez zone emp info could not be found
	 */
	public static SezZoneEmpInfo findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneEmpInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmpInfoException {

		return getPersistence().findBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the first sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone emp info, or <code>null</code> if a matching sez zone emp info could not be found
	 */
	public static SezZoneEmpInfo fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmpInfo> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_First(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a matching sez zone emp info could not be found
	 */
	public static SezZoneEmpInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			OrderByComparator<SezZoneEmpInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmpInfoException {

		return getPersistence().findBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the last sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone emp info, or <code>null</code> if a matching sez zone emp info could not be found
	 */
	public static SezZoneEmpInfo fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		OrderByComparator<SezZoneEmpInfo> orderByComparator) {

		return getPersistence().fetchBygetSezStatusByAppId_Last(
			sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Returns the sez zone emp infos before and after the current sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezZoneEmpInfoId the primary key of the current sez zone emp info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	public static SezZoneEmpInfo[] findBygetSezStatusByAppId_PrevAndNext(
			long sezZoneEmpInfoId, long sezStatusApplicationId,
			OrderByComparator<SezZoneEmpInfo> orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmpInfoException {

		return getPersistence().findBygetSezStatusByAppId_PrevAndNext(
			sezZoneEmpInfoId, sezStatusApplicationId, orderByComparator);
	}

	/**
	 * Removes all the sez zone emp infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public static void removeBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getPersistence().removeBygetSezStatusByAppId(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone emp infos
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez zone emp info in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmpInfo the sez zone emp info
	 */
	public static void cacheResult(SezZoneEmpInfo sezZoneEmpInfo) {
		getPersistence().cacheResult(sezZoneEmpInfo);
	}

	/**
	 * Caches the sez zone emp infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmpInfos the sez zone emp infos
	 */
	public static void cacheResult(List<SezZoneEmpInfo> sezZoneEmpInfos) {
		getPersistence().cacheResult(sezZoneEmpInfos);
	}

	/**
	 * Creates a new sez zone emp info with the primary key. Does not add the sez zone emp info to the database.
	 *
	 * @param sezZoneEmpInfoId the primary key for the new sez zone emp info
	 * @return the new sez zone emp info
	 */
	public static SezZoneEmpInfo create(long sezZoneEmpInfoId) {
		return getPersistence().create(sezZoneEmpInfoId);
	}

	/**
	 * Removes the sez zone emp info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info that was removed
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	public static SezZoneEmpInfo remove(long sezZoneEmpInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmpInfoException {

		return getPersistence().remove(sezZoneEmpInfoId);
	}

	public static SezZoneEmpInfo updateImpl(SezZoneEmpInfo sezZoneEmpInfo) {
		return getPersistence().updateImpl(sezZoneEmpInfo);
	}

	/**
	 * Returns the sez zone emp info with the primary key or throws a <code>NoSuchSezZoneEmpInfoException</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	public static SezZoneEmpInfo findByPrimaryKey(long sezZoneEmpInfoId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneEmpInfoException {

		return getPersistence().findByPrimaryKey(sezZoneEmpInfoId);
	}

	/**
	 * Returns the sez zone emp info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info, or <code>null</code> if a sez zone emp info with the primary key could not be found
	 */
	public static SezZoneEmpInfo fetchByPrimaryKey(long sezZoneEmpInfoId) {
		return getPersistence().fetchByPrimaryKey(sezZoneEmpInfoId);
	}

	/**
	 * Returns all the sez zone emp infos.
	 *
	 * @return the sez zone emp infos
	 */
	public static List<SezZoneEmpInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @return the range of sez zone emp infos
	 */
	public static List<SezZoneEmpInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone emp infos
	 */
	public static List<SezZoneEmpInfo> findAll(
		int start, int end,
		OrderByComparator<SezZoneEmpInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone emp infos
	 */
	public static List<SezZoneEmpInfo> findAll(
		int start, int end, OrderByComparator<SezZoneEmpInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez zone emp infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez zone emp infos.
	 *
	 * @return the number of sez zone emp infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezZoneEmpInfoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile SezZoneEmpInfoPersistence _persistence;

}