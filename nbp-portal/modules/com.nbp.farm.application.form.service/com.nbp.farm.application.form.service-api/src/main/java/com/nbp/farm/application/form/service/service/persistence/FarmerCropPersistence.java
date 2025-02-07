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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerCropException;
import com.nbp.farm.application.form.service.model.FarmerCrop;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer crop service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropUtil
 * @generated
 */
@ProviderType
public interface FarmerCropPersistence extends BasePersistence<FarmerCrop> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerCropUtil} to access the farmer crop persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farmer crop where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerCropException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop
	 * @throws NoSuchFarmerCropException if a matching farmer crop could not be found
	 */
	public FarmerCrop findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerCropException;

	/**
	 * Returns the farmer crop where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	public FarmerCrop fetchBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer crop where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	public FarmerCrop fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer crop where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer crop that was removed
	 */
	public FarmerCrop removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerCropException;

	/**
	 * Returns the number of farmer crops where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crops
	 */
	public int countBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crops
	 */
	public java.util.List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId);

	/**
	 * Returns a range of all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @return the range of matching farmer crops
	 */
	public java.util.List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer crops
	 */
	public java.util.List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCrop>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer crops
	 */
	public java.util.List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCrop>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop
	 * @throws NoSuchFarmerCropException if a matching farmer crop could not be found
	 */
	public FarmerCrop findBygetFA_FC_FAI_First(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerCrop>
				orderByComparator)
		throws NoSuchFarmerCropException;

	/**
	 * Returns the first farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	public FarmerCrop fetchBygetFA_FC_FAI_First(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCrop>
			orderByComparator);

	/**
	 * Returns the last farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop
	 * @throws NoSuchFarmerCropException if a matching farmer crop could not be found
	 */
	public FarmerCrop findBygetFA_FC_FAI_Last(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerCrop>
				orderByComparator)
		throws NoSuchFarmerCropException;

	/**
	 * Returns the last farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	public FarmerCrop fetchBygetFA_FC_FAI_Last(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCrop>
			orderByComparator);

	/**
	 * Returns the farmer crops before and after the current farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerCropId the primary key of the current farmer crop
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer crop
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	public FarmerCrop[] findBygetFA_FC_FAI_PrevAndNext(
			long farmerCropId, long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerCrop>
				orderByComparator)
		throws NoSuchFarmerCropException;

	/**
	 * Removes all the farmer crops where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public void removeBygetFA_FC_FAI(long farmerApplicationId);

	/**
	 * Returns the number of farmer crops where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crops
	 */
	public int countBygetFA_FC_FAI(long farmerApplicationId);

	/**
	 * Caches the farmer crop in the entity cache if it is enabled.
	 *
	 * @param farmerCrop the farmer crop
	 */
	public void cacheResult(FarmerCrop farmerCrop);

	/**
	 * Caches the farmer crops in the entity cache if it is enabled.
	 *
	 * @param farmerCrops the farmer crops
	 */
	public void cacheResult(java.util.List<FarmerCrop> farmerCrops);

	/**
	 * Creates a new farmer crop with the primary key. Does not add the farmer crop to the database.
	 *
	 * @param farmerCropId the primary key for the new farmer crop
	 * @return the new farmer crop
	 */
	public FarmerCrop create(long farmerCropId);

	/**
	 * Removes the farmer crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop that was removed
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	public FarmerCrop remove(long farmerCropId)
		throws NoSuchFarmerCropException;

	public FarmerCrop updateImpl(FarmerCrop farmerCrop);

	/**
	 * Returns the farmer crop with the primary key or throws a <code>NoSuchFarmerCropException</code> if it could not be found.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	public FarmerCrop findByPrimaryKey(long farmerCropId)
		throws NoSuchFarmerCropException;

	/**
	 * Returns the farmer crop with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop, or <code>null</code> if a farmer crop with the primary key could not be found
	 */
	public FarmerCrop fetchByPrimaryKey(long farmerCropId);

	/**
	 * Returns all the farmer crops.
	 *
	 * @return the farmer crops
	 */
	public java.util.List<FarmerCrop> findAll();

	/**
	 * Returns a range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @return the range of farmer crops
	 */
	public java.util.List<FarmerCrop> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer crops
	 */
	public java.util.List<FarmerCrop> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCrop>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer crops
	 */
	public java.util.List<FarmerCrop> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCrop>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer crops from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer crops.
	 *
	 * @return the number of farmer crops
	 */
	public int countAll();

}