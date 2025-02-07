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

package com.nbp.farm.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.farm.application.form.service.model.FarmerStakeholderInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer stakeholder info service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerStakeholderInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderInfoPersistence
 * @generated
 */
public class FarmerStakeholderInfoUtil {

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
	public static void clearCache(FarmerStakeholderInfo farmerStakeholderInfo) {
		getPersistence().clearCache(farmerStakeholderInfo);
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
	public static Map<Serializable, FarmerStakeholderInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerStakeholderInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerStakeholderInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerStakeholderInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerStakeholderInfo update(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		return getPersistence().update(farmerStakeholderInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerStakeholderInfo update(
		FarmerStakeholderInfo farmerStakeholderInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(farmerStakeholderInfo, serviceContext);
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerStakeholderInfoException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo findBygetfarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderInfoException {

		return getPersistence().findBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo fetchBygetfarmerById(
		long farmerApplicationId) {

		return getPersistence().fetchBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetfarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer stakeholder info where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer stakeholder info that was removed
	 */
	public static FarmerStakeholderInfo removeBygetfarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderInfoException {

		return getPersistence().removeBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder infos
	 */
	public static int countBygetfarmerById(long farmerApplicationId) {
		return getPersistence().countBygetfarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerStakeholderInfoException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo findBygetFA_FSH_by_AppId(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderInfoException {

		return getPersistence().findBygetFA_FSH_by_AppId(farmerApplicationId);
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo fetchBygetFA_FSH_by_AppId(
		long farmerApplicationId) {

		return getPersistence().fetchBygetFA_FSH_by_AppId(farmerApplicationId);
	}

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo fetchBygetFA_FSH_by_AppId(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFA_FSH_by_AppId(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer stakeholder info where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer stakeholder info that was removed
	 */
	public static FarmerStakeholderInfo removeBygetFA_FSH_by_AppId(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderInfoException {

		return getPersistence().removeBygetFA_FSH_by_AppId(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder infos
	 */
	public static int countBygetFA_FSH_by_AppId(long farmerApplicationId) {
		return getPersistence().countBygetFA_FSH_by_AppId(farmerApplicationId);
	}

	/**
	 * Returns all the farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder infos
	 */
	public static List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId) {

		return getPersistence().findBygetFA_SH_FAI(farmerApplicationId);
	}

	/**
	 * Returns a range of all the farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @return the range of matching farmer stakeholder infos
	 */
	public static List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId, int start, int end) {

		return getPersistence().findBygetFA_SH_FAI(
			farmerApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer stakeholder infos
	 */
	public static List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator) {

		return getPersistence().findBygetFA_SH_FAI(
			farmerApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer stakeholder infos
	 */
	public static List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFA_SH_FAI(
			farmerApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo findBygetFA_SH_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerStakeholderInfo> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderInfoException {

		return getPersistence().findBygetFA_SH_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the first farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo fetchBygetFA_SH_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator) {

		return getPersistence().fetchBygetFA_SH_FAI_First(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo findBygetFA_SH_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerStakeholderInfo> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderInfoException {

		return getPersistence().findBygetFA_SH_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the last farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public static FarmerStakeholderInfo fetchBygetFA_SH_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator) {

		return getPersistence().fetchBygetFA_SH_FAI_Last(
			farmerApplicationId, orderByComparator);
	}

	/**
	 * Returns the farmer stakeholder infos before and after the current farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the primary key of the current farmer stakeholder info
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	public static FarmerStakeholderInfo[] findBygetFA_SH_FAI_PrevAndNext(
			long farmerStakeholderInfoId, long farmerApplicationId,
			OrderByComparator<FarmerStakeholderInfo> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderInfoException {

		return getPersistence().findBygetFA_SH_FAI_PrevAndNext(
			farmerStakeholderInfoId, farmerApplicationId, orderByComparator);
	}

	/**
	 * Removes all the farmer stakeholder infos where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public static void removeBygetFA_SH_FAI(long farmerApplicationId) {
		getPersistence().removeBygetFA_SH_FAI(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder infos
	 */
	public static int countBygetFA_SH_FAI(long farmerApplicationId) {
		return getPersistence().countBygetFA_SH_FAI(farmerApplicationId);
	}

	/**
	 * Caches the farmer stakeholder info in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderInfo the farmer stakeholder info
	 */
	public static void cacheResult(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		getPersistence().cacheResult(farmerStakeholderInfo);
	}

	/**
	 * Caches the farmer stakeholder infos in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderInfos the farmer stakeholder infos
	 */
	public static void cacheResult(
		List<FarmerStakeholderInfo> farmerStakeholderInfos) {

		getPersistence().cacheResult(farmerStakeholderInfos);
	}

	/**
	 * Creates a new farmer stakeholder info with the primary key. Does not add the farmer stakeholder info to the database.
	 *
	 * @param farmerStakeholderInfoId the primary key for the new farmer stakeholder info
	 * @return the new farmer stakeholder info
	 */
	public static FarmerStakeholderInfo create(long farmerStakeholderInfoId) {
		return getPersistence().create(farmerStakeholderInfoId);
	}

	/**
	 * Removes the farmer stakeholder info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info that was removed
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	public static FarmerStakeholderInfo remove(long farmerStakeholderInfoId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderInfoException {

		return getPersistence().remove(farmerStakeholderInfoId);
	}

	public static FarmerStakeholderInfo updateImpl(
		FarmerStakeholderInfo farmerStakeholderInfo) {

		return getPersistence().updateImpl(farmerStakeholderInfo);
	}

	/**
	 * Returns the farmer stakeholder info with the primary key or throws a <code>NoSuchFarmerStakeholderInfoException</code> if it could not be found.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	public static FarmerStakeholderInfo findByPrimaryKey(
			long farmerStakeholderInfoId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderInfoException {

		return getPersistence().findByPrimaryKey(farmerStakeholderInfoId);
	}

	/**
	 * Returns the farmer stakeholder info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info, or <code>null</code> if a farmer stakeholder info with the primary key could not be found
	 */
	public static FarmerStakeholderInfo fetchByPrimaryKey(
		long farmerStakeholderInfoId) {

		return getPersistence().fetchByPrimaryKey(farmerStakeholderInfoId);
	}

	/**
	 * Returns all the farmer stakeholder infos.
	 *
	 * @return the farmer stakeholder infos
	 */
	public static List<FarmerStakeholderInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farmer stakeholder infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @return the range of farmer stakeholder infos
	 */
	public static List<FarmerStakeholderInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer stakeholder infos
	 */
	public static List<FarmerStakeholderInfo> findAll(
		int start, int end,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer stakeholder infos
	 */
	public static List<FarmerStakeholderInfo> findAll(
		int start, int end,
		OrderByComparator<FarmerStakeholderInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer stakeholder infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer stakeholder infos.
	 *
	 * @return the number of farmer stakeholder infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerStakeholderInfoPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerStakeholderInfoPersistence _persistence;

}