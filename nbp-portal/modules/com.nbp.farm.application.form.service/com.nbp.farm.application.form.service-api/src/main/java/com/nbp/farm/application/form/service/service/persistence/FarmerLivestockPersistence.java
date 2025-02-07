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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerLivestockException;
import com.nbp.farm.application.form.service.model.FarmerLivestock;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer livestock service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerLivestockUtil
 * @generated
 */
@ProviderType
public interface FarmerLivestockPersistence
	extends BasePersistence<FarmerLivestock> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerLivestockUtil} to access the farmer livestock persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farmer livestock where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerLivestockException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer livestock
	 * @throws NoSuchFarmerLivestockException if a matching farmer livestock could not be found
	 */
	public FarmerLivestock findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerLivestockException;

	/**
	 * Returns the farmer livestock where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	public FarmerLivestock fetchBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer livestock where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	public FarmerLivestock fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer livestock where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer livestock that was removed
	 */
	public FarmerLivestock removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerLivestockException;

	/**
	 * Returns the number of farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer livestocks
	 */
	public int countBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer livestocks
	 */
	public java.util.List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId);

	/**
	 * Returns a range of all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @return the range of matching farmer livestocks
	 */
	public java.util.List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer livestocks
	 */
	public java.util.List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerLivestock>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer livestocks
	 */
	public java.util.List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerLivestock>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer livestock
	 * @throws NoSuchFarmerLivestockException if a matching farmer livestock could not be found
	 */
	public FarmerLivestock findBygetFA_FLS_FAI_First(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerLivestock>
				orderByComparator)
		throws NoSuchFarmerLivestockException;

	/**
	 * Returns the first farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	public FarmerLivestock fetchBygetFA_FLS_FAI_First(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerLivestock>
			orderByComparator);

	/**
	 * Returns the last farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer livestock
	 * @throws NoSuchFarmerLivestockException if a matching farmer livestock could not be found
	 */
	public FarmerLivestock findBygetFA_FLS_FAI_Last(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerLivestock>
				orderByComparator)
		throws NoSuchFarmerLivestockException;

	/**
	 * Returns the last farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	public FarmerLivestock fetchBygetFA_FLS_FAI_Last(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerLivestock>
			orderByComparator);

	/**
	 * Returns the farmer livestocks before and after the current farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerLiveStockId the primary key of the current farmer livestock
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer livestock
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	public FarmerLivestock[] findBygetFA_FLS_FAI_PrevAndNext(
			long farmerLiveStockId, long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerLivestock>
				orderByComparator)
		throws NoSuchFarmerLivestockException;

	/**
	 * Removes all the farmer livestocks where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public void removeBygetFA_FLS_FAI(long farmerApplicationId);

	/**
	 * Returns the number of farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer livestocks
	 */
	public int countBygetFA_FLS_FAI(long farmerApplicationId);

	/**
	 * Caches the farmer livestock in the entity cache if it is enabled.
	 *
	 * @param farmerLivestock the farmer livestock
	 */
	public void cacheResult(FarmerLivestock farmerLivestock);

	/**
	 * Caches the farmer livestocks in the entity cache if it is enabled.
	 *
	 * @param farmerLivestocks the farmer livestocks
	 */
	public void cacheResult(java.util.List<FarmerLivestock> farmerLivestocks);

	/**
	 * Creates a new farmer livestock with the primary key. Does not add the farmer livestock to the database.
	 *
	 * @param farmerLiveStockId the primary key for the new farmer livestock
	 * @return the new farmer livestock
	 */
	public FarmerLivestock create(long farmerLiveStockId);

	/**
	 * Removes the farmer livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock that was removed
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	public FarmerLivestock remove(long farmerLiveStockId)
		throws NoSuchFarmerLivestockException;

	public FarmerLivestock updateImpl(FarmerLivestock farmerLivestock);

	/**
	 * Returns the farmer livestock with the primary key or throws a <code>NoSuchFarmerLivestockException</code> if it could not be found.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	public FarmerLivestock findByPrimaryKey(long farmerLiveStockId)
		throws NoSuchFarmerLivestockException;

	/**
	 * Returns the farmer livestock with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock, or <code>null</code> if a farmer livestock with the primary key could not be found
	 */
	public FarmerLivestock fetchByPrimaryKey(long farmerLiveStockId);

	/**
	 * Returns all the farmer livestocks.
	 *
	 * @return the farmer livestocks
	 */
	public java.util.List<FarmerLivestock> findAll();

	/**
	 * Returns a range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @return the range of farmer livestocks
	 */
	public java.util.List<FarmerLivestock> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer livestocks
	 */
	public java.util.List<FarmerLivestock> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerLivestock>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer livestocks
	 */
	public java.util.List<FarmerLivestock> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerLivestock>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer livestocks from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer livestocks.
	 *
	 * @return the number of farmer livestocks
	 */
	public int countAll();

}