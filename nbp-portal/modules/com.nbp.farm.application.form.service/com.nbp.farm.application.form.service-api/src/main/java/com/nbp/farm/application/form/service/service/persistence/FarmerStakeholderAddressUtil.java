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

import com.nbp.farm.application.form.service.model.FarmerStakeholderAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the farmer stakeholder address service. This utility wraps <code>com.nbp.farm.application.form.service.service.persistence.impl.FarmerStakeholderAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderAddressPersistence
 * @generated
 */
public class FarmerStakeholderAddressUtil {

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
		FarmerStakeholderAddress farmerStakeholderAddress) {

		getPersistence().clearCache(farmerStakeholderAddress);
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
	public static Map<Serializable, FarmerStakeholderAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FarmerStakeholderAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FarmerStakeholderAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FarmerStakeholderAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FarmerStakeholderAddress update(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		return getPersistence().update(farmerStakeholderAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FarmerStakeholderAddress update(
		FarmerStakeholderAddress farmerStakeholderAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			farmerStakeholderAddress, serviceContext);
	}

	/**
	 * Returns the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress findBygetFA_SAI_AT(
			String addressType, long farmerStakeholderInfoId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().findBygetFA_SAI_AT(
			addressType, farmerStakeholderInfoId);
	}

	/**
	 * Returns the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress fetchBygetFA_SAI_AT(
		String addressType, long farmerStakeholderInfoId) {

		return getPersistence().fetchBygetFA_SAI_AT(
			addressType, farmerStakeholderInfoId);
	}

	/**
	 * Returns the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress fetchBygetFA_SAI_AT(
		String addressType, long farmerStakeholderInfoId,
		boolean useFinderCache) {

		return getPersistence().fetchBygetFA_SAI_AT(
			addressType, farmerStakeholderInfoId, useFinderCache);
	}

	/**
	 * Removes the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the farmer stakeholder address that was removed
	 */
	public static FarmerStakeholderAddress removeBygetFA_SAI_AT(
			String addressType, long farmerStakeholderInfoId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().removeBygetFA_SAI_AT(
			addressType, farmerStakeholderInfoId);
	}

	/**
	 * Returns the number of farmer stakeholder addresses where addressType = &#63; and farmerStakeholderInfoId = &#63;.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	public static int countBygetFA_SAI_AT(
		String addressType, long farmerStakeholderInfoId) {

		return getPersistence().countBygetFA_SAI_AT(
			addressType, farmerStakeholderInfoId);
	}

	/**
	 * Returns all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder addresses
	 */
	public static List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId) {

		return getPersistence().findBygetFA_SAI_FI(farmerStakeholderInfoId);
	}

	/**
	 * Returns a range of all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @return the range of matching farmer stakeholder addresses
	 */
	public static List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId, int start, int end) {

		return getPersistence().findBygetFA_SAI_FI(
			farmerStakeholderInfoId, start, end);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer stakeholder addresses
	 */
	public static List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId, int start, int end,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator) {

		return getPersistence().findBygetFA_SAI_FI(
			farmerStakeholderInfoId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer stakeholder addresses
	 */
	public static List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId, int start, int end,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFA_SAI_FI(
			farmerStakeholderInfoId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress findBygetFA_SAI_FI_First(
			long farmerStakeholderInfoId,
			OrderByComparator<FarmerStakeholderAddress> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().findBygetFA_SAI_FI_First(
			farmerStakeholderInfoId, orderByComparator);
	}

	/**
	 * Returns the first farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress fetchBygetFA_SAI_FI_First(
		long farmerStakeholderInfoId,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator) {

		return getPersistence().fetchBygetFA_SAI_FI_First(
			farmerStakeholderInfoId, orderByComparator);
	}

	/**
	 * Returns the last farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress findBygetFA_SAI_FI_Last(
			long farmerStakeholderInfoId,
			OrderByComparator<FarmerStakeholderAddress> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().findBygetFA_SAI_FI_Last(
			farmerStakeholderInfoId, orderByComparator);
	}

	/**
	 * Returns the last farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress fetchBygetFA_SAI_FI_Last(
		long farmerStakeholderInfoId,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator) {

		return getPersistence().fetchBygetFA_SAI_FI_Last(
			farmerStakeholderInfoId, orderByComparator);
	}

	/**
	 * Returns the farmer stakeholder addresses before and after the current farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderAddressId the primary key of the current farmer stakeholder address
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	public static FarmerStakeholderAddress[] findBygetFA_SAI_FI_PrevAndNext(
			long farmerStakeholderAddressId, long farmerStakeholderInfoId,
			OrderByComparator<FarmerStakeholderAddress> orderByComparator)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().findBygetFA_SAI_FI_PrevAndNext(
			farmerStakeholderAddressId, farmerStakeholderInfoId,
			orderByComparator);
	}

	/**
	 * Removes all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63; from the database.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 */
	public static void removeBygetFA_SAI_FI(long farmerStakeholderInfoId) {
		getPersistence().removeBygetFA_SAI_FI(farmerStakeholderInfoId);
	}

	/**
	 * Returns the number of farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	public static int countBygetFA_SAI_FI(long farmerStakeholderInfoId) {
		return getPersistence().countBygetFA_SAI_FI(farmerStakeholderInfoId);
	}

	/**
	 * Returns the farmer stakeholder address where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress findBygetFarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().findBygetFarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer stakeholder address where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress fetchBygetFarmerById(
		long farmerApplicationId) {

		return getPersistence().fetchBygetFarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer stakeholder address where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress fetchBygetFarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFarmerById(
			farmerApplicationId, useFinderCache);
	}

	/**
	 * Removes the farmer stakeholder address where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer stakeholder address that was removed
	 */
	public static FarmerStakeholderAddress removeBygetFarmerById(
			long farmerApplicationId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().removeBygetFarmerById(farmerApplicationId);
	}

	/**
	 * Returns the number of farmer stakeholder addresses where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	public static int countBygetFarmerById(long farmerApplicationId) {
		return getPersistence().countBygetFarmerById(farmerApplicationId);
	}

	/**
	 * Returns the farmer stakeholder address where farmerStakeholderInfoId = &#63; or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress findBygetFarmerByStakeInfoId(
			long farmerStakeholderInfoId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().findBygetFarmerByStakeInfoId(
			farmerStakeholderInfoId);
	}

	/**
	 * Returns the farmer stakeholder address where farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress fetchBygetFarmerByStakeInfoId(
		long farmerStakeholderInfoId) {

		return getPersistence().fetchBygetFarmerByStakeInfoId(
			farmerStakeholderInfoId);
	}

	/**
	 * Returns the farmer stakeholder address where farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public static FarmerStakeholderAddress fetchBygetFarmerByStakeInfoId(
		long farmerStakeholderInfoId, boolean useFinderCache) {

		return getPersistence().fetchBygetFarmerByStakeInfoId(
			farmerStakeholderInfoId, useFinderCache);
	}

	/**
	 * Removes the farmer stakeholder address where farmerStakeholderInfoId = &#63; from the database.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the farmer stakeholder address that was removed
	 */
	public static FarmerStakeholderAddress removeBygetFarmerByStakeInfoId(
			long farmerStakeholderInfoId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().removeBygetFarmerByStakeInfoId(
			farmerStakeholderInfoId);
	}

	/**
	 * Returns the number of farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	public static int countBygetFarmerByStakeInfoId(
		long farmerStakeholderInfoId) {

		return getPersistence().countBygetFarmerByStakeInfoId(
			farmerStakeholderInfoId);
	}

	/**
	 * Caches the farmer stakeholder address in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderAddress the farmer stakeholder address
	 */
	public static void cacheResult(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		getPersistence().cacheResult(farmerStakeholderAddress);
	}

	/**
	 * Caches the farmer stakeholder addresses in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderAddresses the farmer stakeholder addresses
	 */
	public static void cacheResult(
		List<FarmerStakeholderAddress> farmerStakeholderAddresses) {

		getPersistence().cacheResult(farmerStakeholderAddresses);
	}

	/**
	 * Creates a new farmer stakeholder address with the primary key. Does not add the farmer stakeholder address to the database.
	 *
	 * @param farmerStakeholderAddressId the primary key for the new farmer stakeholder address
	 * @return the new farmer stakeholder address
	 */
	public static FarmerStakeholderAddress create(
		long farmerStakeholderAddressId) {

		return getPersistence().create(farmerStakeholderAddressId);
	}

	/**
	 * Removes the farmer stakeholder address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address that was removed
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	public static FarmerStakeholderAddress remove(
			long farmerStakeholderAddressId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().remove(farmerStakeholderAddressId);
	}

	public static FarmerStakeholderAddress updateImpl(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		return getPersistence().updateImpl(farmerStakeholderAddress);
	}

	/**
	 * Returns the farmer stakeholder address with the primary key or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	public static FarmerStakeholderAddress findByPrimaryKey(
			long farmerStakeholderAddressId)
		throws com.nbp.farm.application.form.service.exception.
			NoSuchFarmerStakeholderAddressException {

		return getPersistence().findByPrimaryKey(farmerStakeholderAddressId);
	}

	/**
	 * Returns the farmer stakeholder address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address, or <code>null</code> if a farmer stakeholder address with the primary key could not be found
	 */
	public static FarmerStakeholderAddress fetchByPrimaryKey(
		long farmerStakeholderAddressId) {

		return getPersistence().fetchByPrimaryKey(farmerStakeholderAddressId);
	}

	/**
	 * Returns all the farmer stakeholder addresses.
	 *
	 * @return the farmer stakeholder addresses
	 */
	public static List<FarmerStakeholderAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the farmer stakeholder addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @return the range of farmer stakeholder addresses
	 */
	public static List<FarmerStakeholderAddress> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer stakeholder addresses
	 */
	public static List<FarmerStakeholderAddress> findAll(
		int start, int end,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer stakeholder addresses
	 */
	public static List<FarmerStakeholderAddress> findAll(
		int start, int end,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the farmer stakeholder addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of farmer stakeholder addresses.
	 *
	 * @return the number of farmer stakeholder addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FarmerStakeholderAddressPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FarmerStakeholderAddressPersistence _persistence;

}