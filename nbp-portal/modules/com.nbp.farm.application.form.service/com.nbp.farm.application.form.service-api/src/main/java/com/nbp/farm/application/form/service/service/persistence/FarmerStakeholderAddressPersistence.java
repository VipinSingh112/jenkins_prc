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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.farm.application.form.service.exception.NoSuchFarmerStakeholderAddressException;
import com.nbp.farm.application.form.service.model.FarmerStakeholderAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer stakeholder address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderAddressUtil
 * @generated
 */
@ProviderType
public interface FarmerStakeholderAddressPersistence
	extends BasePersistence<FarmerStakeholderAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerStakeholderAddressUtil} to access the farmer stakeholder address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress findBygetFA_SAI_AT(
			String addressType, long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Returns the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress fetchBygetFA_SAI_AT(
		String addressType, long farmerStakeholderInfoId);

	/**
	 * Returns the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress fetchBygetFA_SAI_AT(
		String addressType, long farmerStakeholderInfoId,
		boolean useFinderCache);

	/**
	 * Removes the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the farmer stakeholder address that was removed
	 */
	public FarmerStakeholderAddress removeBygetFA_SAI_AT(
			String addressType, long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Returns the number of farmer stakeholder addresses where addressType = &#63; and farmerStakeholderInfoId = &#63;.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	public int countBygetFA_SAI_AT(
		String addressType, long farmerStakeholderInfoId);

	/**
	 * Returns all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder addresses
	 */
	public java.util.List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId);

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
	public java.util.List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId, int start, int end);

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
	public java.util.List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerStakeholderAddress> orderByComparator);

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
	public java.util.List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerStakeholderAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress findBygetFA_SAI_FI_First(
			long farmerStakeholderInfoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerStakeholderAddress> orderByComparator)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Returns the first farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress fetchBygetFA_SAI_FI_First(
		long farmerStakeholderInfoId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerStakeholderAddress> orderByComparator);

	/**
	 * Returns the last farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress findBygetFA_SAI_FI_Last(
			long farmerStakeholderInfoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerStakeholderAddress> orderByComparator)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Returns the last farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress fetchBygetFA_SAI_FI_Last(
		long farmerStakeholderInfoId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerStakeholderAddress> orderByComparator);

	/**
	 * Returns the farmer stakeholder addresses before and after the current farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderAddressId the primary key of the current farmer stakeholder address
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	public FarmerStakeholderAddress[] findBygetFA_SAI_FI_PrevAndNext(
			long farmerStakeholderAddressId, long farmerStakeholderInfoId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerStakeholderAddress> orderByComparator)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Removes all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63; from the database.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 */
	public void removeBygetFA_SAI_FI(long farmerStakeholderInfoId);

	/**
	 * Returns the number of farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	public int countBygetFA_SAI_FI(long farmerStakeholderInfoId);

	/**
	 * Returns the farmer stakeholder address where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress findBygetFarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Returns the farmer stakeholder address where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress fetchBygetFarmerById(
		long farmerApplicationId);

	/**
	 * Returns the farmer stakeholder address where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress fetchBygetFarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer stakeholder address where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer stakeholder address that was removed
	 */
	public FarmerStakeholderAddress removeBygetFarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Returns the number of farmer stakeholder addresses where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	public int countBygetFarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer stakeholder address where farmerStakeholderInfoId = &#63; or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress findBygetFarmerByStakeInfoId(
			long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Returns the farmer stakeholder address where farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress fetchBygetFarmerByStakeInfoId(
		long farmerStakeholderInfoId);

	/**
	 * Returns the farmer stakeholder address where farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	public FarmerStakeholderAddress fetchBygetFarmerByStakeInfoId(
		long farmerStakeholderInfoId, boolean useFinderCache);

	/**
	 * Removes the farmer stakeholder address where farmerStakeholderInfoId = &#63; from the database.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the farmer stakeholder address that was removed
	 */
	public FarmerStakeholderAddress removeBygetFarmerByStakeInfoId(
			long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Returns the number of farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	public int countBygetFarmerByStakeInfoId(long farmerStakeholderInfoId);

	/**
	 * Caches the farmer stakeholder address in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderAddress the farmer stakeholder address
	 */
	public void cacheResult(FarmerStakeholderAddress farmerStakeholderAddress);

	/**
	 * Caches the farmer stakeholder addresses in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderAddresses the farmer stakeholder addresses
	 */
	public void cacheResult(
		java.util.List<FarmerStakeholderAddress> farmerStakeholderAddresses);

	/**
	 * Creates a new farmer stakeholder address with the primary key. Does not add the farmer stakeholder address to the database.
	 *
	 * @param farmerStakeholderAddressId the primary key for the new farmer stakeholder address
	 * @return the new farmer stakeholder address
	 */
	public FarmerStakeholderAddress create(long farmerStakeholderAddressId);

	/**
	 * Removes the farmer stakeholder address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address that was removed
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	public FarmerStakeholderAddress remove(long farmerStakeholderAddressId)
		throws NoSuchFarmerStakeholderAddressException;

	public FarmerStakeholderAddress updateImpl(
		FarmerStakeholderAddress farmerStakeholderAddress);

	/**
	 * Returns the farmer stakeholder address with the primary key or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	public FarmerStakeholderAddress findByPrimaryKey(
			long farmerStakeholderAddressId)
		throws NoSuchFarmerStakeholderAddressException;

	/**
	 * Returns the farmer stakeholder address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address, or <code>null</code> if a farmer stakeholder address with the primary key could not be found
	 */
	public FarmerStakeholderAddress fetchByPrimaryKey(
		long farmerStakeholderAddressId);

	/**
	 * Returns all the farmer stakeholder addresses.
	 *
	 * @return the farmer stakeholder addresses
	 */
	public java.util.List<FarmerStakeholderAddress> findAll();

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
	public java.util.List<FarmerStakeholderAddress> findAll(int start, int end);

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
	public java.util.List<FarmerStakeholderAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerStakeholderAddress> orderByComparator);

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
	public java.util.List<FarmerStakeholderAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerStakeholderAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer stakeholder addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer stakeholder addresses.
	 *
	 * @return the number of farmer stakeholder addresses
	 */
	public int countAll();

}