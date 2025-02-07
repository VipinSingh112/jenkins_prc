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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerlivestockPracticeException;
import com.nbp.farm.application.form.service.model.FarmerlivestockPractice;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmerlivestock practice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerlivestockPracticeUtil
 * @generated
 */
@ProviderType
public interface FarmerlivestockPracticePersistence
	extends BasePersistence<FarmerlivestockPractice> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerlivestockPracticeUtil} to access the farmerlivestock practice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farmerlivestock practice where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerlivestockPracticeException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a matching farmerlivestock practice could not be found
	 */
	public FarmerlivestockPractice findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerlivestockPracticeException;

	/**
	 * Returns the farmerlivestock practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	public FarmerlivestockPractice fetchBygetfarmerById(
		long farmerApplicationId);

	/**
	 * Returns the farmerlivestock practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	public FarmerlivestockPractice fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmerlivestock practice where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmerlivestock practice that was removed
	 */
	public FarmerlivestockPractice removeBygetfarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerlivestockPracticeException;

	/**
	 * Returns the number of farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmerlivestock practices
	 */
	public int countBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmerlivestock practices
	 */
	public java.util.List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId);

	/**
	 * Returns a range of all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @return the range of matching farmerlivestock practices
	 */
	public java.util.List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmerlivestock practices
	 */
	public java.util.List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerlivestockPractice> orderByComparator);

	/**
	 * Returns an ordered range of all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmerlivestock practices
	 */
	public java.util.List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerlivestockPractice> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a matching farmerlivestock practice could not be found
	 */
	public FarmerlivestockPractice findBygetFA_FLSP_FAI_First(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerlivestockPractice> orderByComparator)
		throws NoSuchFarmerlivestockPracticeException;

	/**
	 * Returns the first farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	public FarmerlivestockPractice fetchBygetFA_FLSP_FAI_First(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerlivestockPractice> orderByComparator);

	/**
	 * Returns the last farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a matching farmerlivestock practice could not be found
	 */
	public FarmerlivestockPractice findBygetFA_FLSP_FAI_Last(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerlivestockPractice> orderByComparator)
		throws NoSuchFarmerlivestockPracticeException;

	/**
	 * Returns the last farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	public FarmerlivestockPractice fetchBygetFA_FLSP_FAI_Last(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerlivestockPractice> orderByComparator);

	/**
	 * Returns the farmerlivestock practices before and after the current farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerLivestockPracticeId the primary key of the current farmerlivestock practice
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	public FarmerlivestockPractice[] findBygetFA_FLSP_FAI_PrevAndNext(
			long farmerLivestockPracticeId, long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerlivestockPractice> orderByComparator)
		throws NoSuchFarmerlivestockPracticeException;

	/**
	 * Removes all the farmerlivestock practices where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public void removeBygetFA_FLSP_FAI(long farmerApplicationId);

	/**
	 * Returns the number of farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmerlivestock practices
	 */
	public int countBygetFA_FLSP_FAI(long farmerApplicationId);

	/**
	 * Caches the farmerlivestock practice in the entity cache if it is enabled.
	 *
	 * @param farmerlivestockPractice the farmerlivestock practice
	 */
	public void cacheResult(FarmerlivestockPractice farmerlivestockPractice);

	/**
	 * Caches the farmerlivestock practices in the entity cache if it is enabled.
	 *
	 * @param farmerlivestockPractices the farmerlivestock practices
	 */
	public void cacheResult(
		java.util.List<FarmerlivestockPractice> farmerlivestockPractices);

	/**
	 * Creates a new farmerlivestock practice with the primary key. Does not add the farmerlivestock practice to the database.
	 *
	 * @param farmerLivestockPracticeId the primary key for the new farmerlivestock practice
	 * @return the new farmerlivestock practice
	 */
	public FarmerlivestockPractice create(long farmerLivestockPracticeId);

	/**
	 * Removes the farmerlivestock practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice that was removed
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	public FarmerlivestockPractice remove(long farmerLivestockPracticeId)
		throws NoSuchFarmerlivestockPracticeException;

	public FarmerlivestockPractice updateImpl(
		FarmerlivestockPractice farmerlivestockPractice);

	/**
	 * Returns the farmerlivestock practice with the primary key or throws a <code>NoSuchFarmerlivestockPracticeException</code> if it could not be found.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	public FarmerlivestockPractice findByPrimaryKey(
			long farmerLivestockPracticeId)
		throws NoSuchFarmerlivestockPracticeException;

	/**
	 * Returns the farmerlivestock practice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice, or <code>null</code> if a farmerlivestock practice with the primary key could not be found
	 */
	public FarmerlivestockPractice fetchByPrimaryKey(
		long farmerLivestockPracticeId);

	/**
	 * Returns all the farmerlivestock practices.
	 *
	 * @return the farmerlivestock practices
	 */
	public java.util.List<FarmerlivestockPractice> findAll();

	/**
	 * Returns a range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @return the range of farmerlivestock practices
	 */
	public java.util.List<FarmerlivestockPractice> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmerlivestock practices
	 */
	public java.util.List<FarmerlivestockPractice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerlivestockPractice> orderByComparator);

	/**
	 * Returns an ordered range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmerlivestock practices
	 */
	public java.util.List<FarmerlivestockPractice> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FarmerlivestockPractice> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmerlivestock practices from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmerlivestock practices.
	 *
	 * @return the number of farmerlivestock practices
	 */
	public int countAll();

}