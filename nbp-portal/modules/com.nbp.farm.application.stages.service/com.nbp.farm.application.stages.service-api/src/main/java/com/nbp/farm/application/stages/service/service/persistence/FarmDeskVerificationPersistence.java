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

package com.nbp.farm.application.stages.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.farm.application.stages.service.exception.NoSuchFarmDeskVerificationException;
import com.nbp.farm.application.stages.service.model.FarmDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farm desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface FarmDeskVerificationPersistence
	extends BasePersistence<FarmDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmDeskVerificationUtil} to access the farm desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farm desk verifications
	 */
	public java.util.List<FarmDeskVerification>
		findBygetDeskVerificationFarmById(long farmerApplicationId);

	/**
	 * Returns a range of all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @return the range of matching farm desk verifications
	 */
	public java.util.List<FarmDeskVerification>
		findBygetDeskVerificationFarmById(
			long farmerApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm desk verifications
	 */
	public java.util.List<FarmDeskVerification>
		findBygetDeskVerificationFarmById(
			long farmerApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm desk verifications
	 */
	public java.util.List<FarmDeskVerification>
		findBygetDeskVerificationFarmById(
			long farmerApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a matching farm desk verification could not be found
	 */
	public FarmDeskVerification findBygetDeskVerificationFarmById_First(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmDeskVerification> orderByComparator)
		throws NoSuchFarmDeskVerificationException;

	/**
	 * Returns the first farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm desk verification, or <code>null</code> if a matching farm desk verification could not be found
	 */
	public FarmDeskVerification fetchBygetDeskVerificationFarmById_First(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmDeskVerification>
			orderByComparator);

	/**
	 * Returns the last farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a matching farm desk verification could not be found
	 */
	public FarmDeskVerification findBygetDeskVerificationFarmById_Last(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmDeskVerification> orderByComparator)
		throws NoSuchFarmDeskVerificationException;

	/**
	 * Returns the last farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm desk verification, or <code>null</code> if a matching farm desk verification could not be found
	 */
	public FarmDeskVerification fetchBygetDeskVerificationFarmById_Last(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmDeskVerification>
			orderByComparator);

	/**
	 * Returns the farm desk verifications before and after the current farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmDeskVerificationId the primary key of the current farm desk verification
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	public FarmDeskVerification[] findBygetDeskVerificationFarmById_PrevAndNext(
			long farmDeskVerificationId, long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmDeskVerification> orderByComparator)
		throws NoSuchFarmDeskVerificationException;

	/**
	 * Removes all the farm desk verifications where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public void removeBygetDeskVerificationFarmById(long farmerApplicationId);

	/**
	 * Returns the number of farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farm desk verifications
	 */
	public int countBygetDeskVerificationFarmById(long farmerApplicationId);

	/**
	 * Caches the farm desk verification in the entity cache if it is enabled.
	 *
	 * @param farmDeskVerification the farm desk verification
	 */
	public void cacheResult(FarmDeskVerification farmDeskVerification);

	/**
	 * Caches the farm desk verifications in the entity cache if it is enabled.
	 *
	 * @param farmDeskVerifications the farm desk verifications
	 */
	public void cacheResult(
		java.util.List<FarmDeskVerification> farmDeskVerifications);

	/**
	 * Creates a new farm desk verification with the primary key. Does not add the farm desk verification to the database.
	 *
	 * @param farmDeskVerificationId the primary key for the new farm desk verification
	 * @return the new farm desk verification
	 */
	public FarmDeskVerification create(long farmDeskVerificationId);

	/**
	 * Removes the farm desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification that was removed
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	public FarmDeskVerification remove(long farmDeskVerificationId)
		throws NoSuchFarmDeskVerificationException;

	public FarmDeskVerification updateImpl(
		FarmDeskVerification farmDeskVerification);

	/**
	 * Returns the farm desk verification with the primary key or throws a <code>NoSuchFarmDeskVerificationException</code> if it could not be found.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	public FarmDeskVerification findByPrimaryKey(long farmDeskVerificationId)
		throws NoSuchFarmDeskVerificationException;

	/**
	 * Returns the farm desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification, or <code>null</code> if a farm desk verification with the primary key could not be found
	 */
	public FarmDeskVerification fetchByPrimaryKey(long farmDeskVerificationId);

	/**
	 * Returns all the farm desk verifications.
	 *
	 * @return the farm desk verifications
	 */
	public java.util.List<FarmDeskVerification> findAll();

	/**
	 * Returns a range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @return the range of farm desk verifications
	 */
	public java.util.List<FarmDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm desk verifications
	 */
	public java.util.List<FarmDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmDeskVerification>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm desk verifications
	 */
	public java.util.List<FarmDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmDeskVerification>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farm desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farm desk verifications.
	 *
	 * @return the number of farm desk verifications
	 */
	public int countAll();

}