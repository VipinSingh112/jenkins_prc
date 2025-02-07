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

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuAdditionalComapnyInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu additional comapny info service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManuAdditionalComapnyInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalComapnyInfoPersistence
 * @generated
 */
public class ManuAdditionalComapnyInfoUtil {

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
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		getPersistence().clearCache(manuAdditionalComapnyInfo);
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
	public static Map<Serializable, ManuAdditionalComapnyInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuAdditionalComapnyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuAdditionalComapnyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuAdditionalComapnyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuAdditionalComapnyInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuAdditionalComapnyInfo update(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		return getPersistence().update(manuAdditionalComapnyInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuAdditionalComapnyInfo update(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			manuAdditionalComapnyInfo, serviceContext);
	}

	/**
	 * Returns the manu additional comapny info where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuAdditionalComapnyInfoException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional comapny info
	 * @throws NoSuchManuAdditionalComapnyInfoException if a matching manu additional comapny info could not be found
	 */
	public static ManuAdditionalComapnyInfo findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalComapnyInfoException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu additional comapny info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional comapny info, or <code>null</code> if a matching manu additional comapny info could not be found
	 */
	public static ManuAdditionalComapnyInfo fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu additional comapny info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu additional comapny info, or <code>null</code> if a matching manu additional comapny info could not be found
	 */
	public static ManuAdditionalComapnyInfo fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the manu additional comapny info where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu additional comapny info that was removed
	 */
	public static ManuAdditionalComapnyInfo removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalComapnyInfoException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu additional comapny infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu additional comapny infos
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Caches the manu additional comapny info in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalComapnyInfo the manu additional comapny info
	 */
	public static void cacheResult(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		getPersistence().cacheResult(manuAdditionalComapnyInfo);
	}

	/**
	 * Caches the manu additional comapny infos in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalComapnyInfos the manu additional comapny infos
	 */
	public static void cacheResult(
		List<ManuAdditionalComapnyInfo> manuAdditionalComapnyInfos) {

		getPersistence().cacheResult(manuAdditionalComapnyInfos);
	}

	/**
	 * Creates a new manu additional comapny info with the primary key. Does not add the manu additional comapny info to the database.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key for the new manu additional comapny info
	 * @return the new manu additional comapny info
	 */
	public static ManuAdditionalComapnyInfo create(
		long manuAdditionalComapnyInfoId) {

		return getPersistence().create(manuAdditionalComapnyInfoId);
	}

	/**
	 * Removes the manu additional comapny info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info that was removed
	 * @throws NoSuchManuAdditionalComapnyInfoException if a manu additional comapny info with the primary key could not be found
	 */
	public static ManuAdditionalComapnyInfo remove(
			long manuAdditionalComapnyInfoId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalComapnyInfoException {

		return getPersistence().remove(manuAdditionalComapnyInfoId);
	}

	public static ManuAdditionalComapnyInfo updateImpl(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		return getPersistence().updateImpl(manuAdditionalComapnyInfo);
	}

	/**
	 * Returns the manu additional comapny info with the primary key or throws a <code>NoSuchManuAdditionalComapnyInfoException</code> if it could not be found.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info
	 * @throws NoSuchManuAdditionalComapnyInfoException if a manu additional comapny info with the primary key could not be found
	 */
	public static ManuAdditionalComapnyInfo findByPrimaryKey(
			long manuAdditionalComapnyInfoId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuAdditionalComapnyInfoException {

		return getPersistence().findByPrimaryKey(manuAdditionalComapnyInfoId);
	}

	/**
	 * Returns the manu additional comapny info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info, or <code>null</code> if a manu additional comapny info with the primary key could not be found
	 */
	public static ManuAdditionalComapnyInfo fetchByPrimaryKey(
		long manuAdditionalComapnyInfoId) {

		return getPersistence().fetchByPrimaryKey(manuAdditionalComapnyInfoId);
	}

	/**
	 * Returns all the manu additional comapny infos.
	 *
	 * @return the manu additional comapny infos
	 */
	public static List<ManuAdditionalComapnyInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @return the range of manu additional comapny infos
	 */
	public static List<ManuAdditionalComapnyInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu additional comapny infos
	 */
	public static List<ManuAdditionalComapnyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuAdditionalComapnyInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu additional comapny infos
	 */
	public static List<ManuAdditionalComapnyInfo> findAll(
		int start, int end,
		OrderByComparator<ManuAdditionalComapnyInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu additional comapny infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu additional comapny infos.
	 *
	 * @return the number of manu additional comapny infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuAdditionalComapnyInfoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ManuAdditionalComapnyInfoPersistence _persistence;

}