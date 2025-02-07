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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerCropPracticeException;
import com.nbp.farm.application.form.service.model.FarmerCropPractice;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer crop practice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerCropPracticeUtil
 * @generated
 */
@ProviderType
public interface FarmerCropPracticePersistence
	extends BasePersistence<FarmerCropPractice> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerCropPracticeUtil} to access the farmer crop practice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farmer crop practice where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerCropPracticeException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a matching farmer crop practice could not be found
	 */
	public FarmerCropPractice findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerCropPracticeException;

	/**
	 * Returns the farmer crop practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	public FarmerCropPractice fetchBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer crop practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	public FarmerCropPractice fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer crop practice where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer crop practice that was removed
	 */
	public FarmerCropPractice removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerCropPracticeException;

	/**
	 * Returns the number of farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crop practices
	 */
	public int countBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop practices
	 */
	public java.util.List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId);

	/**
	 * Returns a range of all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @return the range of matching farmer crop practices
	 */
	public java.util.List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer crop practices
	 */
	public java.util.List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCropPractice>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer crop practices
	 */
	public java.util.List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCropPractice>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a matching farmer crop practice could not be found
	 */
	public FarmerCropPractice findBygetFA_FCP_FAI_First(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerCropPractice>
				orderByComparator)
		throws NoSuchFarmerCropPracticeException;

	/**
	 * Returns the first farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	public FarmerCropPractice fetchBygetFA_FCP_FAI_First(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCropPractice>
			orderByComparator);

	/**
	 * Returns the last farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a matching farmer crop practice could not be found
	 */
	public FarmerCropPractice findBygetFA_FCP_FAI_Last(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerCropPractice>
				orderByComparator)
		throws NoSuchFarmerCropPracticeException;

	/**
	 * Returns the last farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	public FarmerCropPractice fetchBygetFA_FCP_FAI_Last(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCropPractice>
			orderByComparator);

	/**
	 * Returns the farmer crop practices before and after the current farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerCropPracticeId the primary key of the current farmer crop practice
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	public FarmerCropPractice[] findBygetFA_FCP_FAI_PrevAndNext(
			long farmerCropPracticeId, long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerCropPractice>
				orderByComparator)
		throws NoSuchFarmerCropPracticeException;

	/**
	 * Removes all the farmer crop practices where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public void removeBygetFA_FCP_FAI(long farmerApplicationId);

	/**
	 * Returns the number of farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crop practices
	 */
	public int countBygetFA_FCP_FAI(long farmerApplicationId);

	/**
	 * Caches the farmer crop practice in the entity cache if it is enabled.
	 *
	 * @param farmerCropPractice the farmer crop practice
	 */
	public void cacheResult(FarmerCropPractice farmerCropPractice);

	/**
	 * Caches the farmer crop practices in the entity cache if it is enabled.
	 *
	 * @param farmerCropPractices the farmer crop practices
	 */
	public void cacheResult(
		java.util.List<FarmerCropPractice> farmerCropPractices);

	/**
	 * Creates a new farmer crop practice with the primary key. Does not add the farmer crop practice to the database.
	 *
	 * @param farmerCropPracticeId the primary key for the new farmer crop practice
	 * @return the new farmer crop practice
	 */
	public FarmerCropPractice create(long farmerCropPracticeId);

	/**
	 * Removes the farmer crop practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice that was removed
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	public FarmerCropPractice remove(long farmerCropPracticeId)
		throws NoSuchFarmerCropPracticeException;

	public FarmerCropPractice updateImpl(FarmerCropPractice farmerCropPractice);

	/**
	 * Returns the farmer crop practice with the primary key or throws a <code>NoSuchFarmerCropPracticeException</code> if it could not be found.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	public FarmerCropPractice findByPrimaryKey(long farmerCropPracticeId)
		throws NoSuchFarmerCropPracticeException;

	/**
	 * Returns the farmer crop practice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice, or <code>null</code> if a farmer crop practice with the primary key could not be found
	 */
	public FarmerCropPractice fetchByPrimaryKey(long farmerCropPracticeId);

	/**
	 * Returns all the farmer crop practices.
	 *
	 * @return the farmer crop practices
	 */
	public java.util.List<FarmerCropPractice> findAll();

	/**
	 * Returns a range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @return the range of farmer crop practices
	 */
	public java.util.List<FarmerCropPractice> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer crop practices
	 */
	public java.util.List<FarmerCropPractice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCropPractice>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer crop practices
	 */
	public java.util.List<FarmerCropPractice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerCropPractice>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer crop practices from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer crop practices.
	 *
	 * @return the number of farmer crop practices
	 */
	public int countAll();

}