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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerProfileException;
import com.nbp.farm.application.form.service.model.FarmerProfile;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerProfileUtil
 * @generated
 */
@ProviderType
public interface FarmerProfilePersistence
	extends BasePersistence<FarmerProfile> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerProfileUtil} to access the farmer profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farmer profile where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerProfileException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer profile
	 * @throws NoSuchFarmerProfileException if a matching farmer profile could not be found
	 */
	public FarmerProfile findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerProfileException;

	/**
	 * Returns the farmer profile where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	public FarmerProfile fetchBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer profile where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	public FarmerProfile fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer profile where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer profile that was removed
	 */
	public FarmerProfile removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerProfileException;

	/**
	 * Returns the number of farmer profiles where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer profiles
	 */
	public int countBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer profiles
	 */
	public java.util.List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId);

	/**
	 * Returns a range of all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @return the range of matching farmer profiles
	 */
	public java.util.List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer profiles
	 */
	public java.util.List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProfile>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer profiles
	 */
	public java.util.List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProfile>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer profile
	 * @throws NoSuchFarmerProfileException if a matching farmer profile could not be found
	 */
	public FarmerProfile findBygetFA_FP_FAI_First(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerProfile>
				orderByComparator)
		throws NoSuchFarmerProfileException;

	/**
	 * Returns the first farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	public FarmerProfile fetchBygetFA_FP_FAI_First(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProfile>
			orderByComparator);

	/**
	 * Returns the last farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer profile
	 * @throws NoSuchFarmerProfileException if a matching farmer profile could not be found
	 */
	public FarmerProfile findBygetFA_FP_FAI_Last(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerProfile>
				orderByComparator)
		throws NoSuchFarmerProfileException;

	/**
	 * Returns the last farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	public FarmerProfile fetchBygetFA_FP_FAI_Last(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProfile>
			orderByComparator);

	/**
	 * Returns the farmer profiles before and after the current farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerProfileId the primary key of the current farmer profile
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer profile
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	public FarmerProfile[] findBygetFA_FP_FAI_PrevAndNext(
			long farmerProfileId, long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerProfile>
				orderByComparator)
		throws NoSuchFarmerProfileException;

	/**
	 * Removes all the farmer profiles where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public void removeBygetFA_FP_FAI(long farmerApplicationId);

	/**
	 * Returns the number of farmer profiles where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer profiles
	 */
	public int countBygetFA_FP_FAI(long farmerApplicationId);

	/**
	 * Caches the farmer profile in the entity cache if it is enabled.
	 *
	 * @param farmerProfile the farmer profile
	 */
	public void cacheResult(FarmerProfile farmerProfile);

	/**
	 * Caches the farmer profiles in the entity cache if it is enabled.
	 *
	 * @param farmerProfiles the farmer profiles
	 */
	public void cacheResult(java.util.List<FarmerProfile> farmerProfiles);

	/**
	 * Creates a new farmer profile with the primary key. Does not add the farmer profile to the database.
	 *
	 * @param farmerProfileId the primary key for the new farmer profile
	 * @return the new farmer profile
	 */
	public FarmerProfile create(long farmerProfileId);

	/**
	 * Removes the farmer profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile that was removed
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	public FarmerProfile remove(long farmerProfileId)
		throws NoSuchFarmerProfileException;

	public FarmerProfile updateImpl(FarmerProfile farmerProfile);

	/**
	 * Returns the farmer profile with the primary key or throws a <code>NoSuchFarmerProfileException</code> if it could not be found.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	public FarmerProfile findByPrimaryKey(long farmerProfileId)
		throws NoSuchFarmerProfileException;

	/**
	 * Returns the farmer profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile, or <code>null</code> if a farmer profile with the primary key could not be found
	 */
	public FarmerProfile fetchByPrimaryKey(long farmerProfileId);

	/**
	 * Returns all the farmer profiles.
	 *
	 * @return the farmer profiles
	 */
	public java.util.List<FarmerProfile> findAll();

	/**
	 * Returns a range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @return the range of farmer profiles
	 */
	public java.util.List<FarmerProfile> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer profiles
	 */
	public java.util.List<FarmerProfile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProfile>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer profiles
	 */
	public java.util.List<FarmerProfile> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProfile>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer profiles from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer profiles.
	 *
	 * @return the number of farmer profiles
	 */
	public int countAll();

}