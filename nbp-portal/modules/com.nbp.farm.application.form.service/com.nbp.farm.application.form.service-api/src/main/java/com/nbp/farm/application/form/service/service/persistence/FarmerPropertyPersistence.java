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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerPropertyException;
import com.nbp.farm.application.form.service.model.FarmerProperty;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer property service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerPropertyUtil
 * @generated
 */
@ProviderType
public interface FarmerPropertyPersistence
	extends BasePersistence<FarmerProperty> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerPropertyUtil} to access the farmer property persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farmer property where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerPropertyException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer property
	 * @throws NoSuchFarmerPropertyException if a matching farmer property could not be found
	 */
	public FarmerProperty findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerPropertyException;

	/**
	 * Returns the farmer property where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	public FarmerProperty fetchBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer property where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	public FarmerProperty fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer property where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer property that was removed
	 */
	public FarmerProperty removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerPropertyException;

	/**
	 * Returns the number of farmer properties where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer properties
	 */
	public int countBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer properties
	 */
	public java.util.List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId);

	/**
	 * Returns a range of all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @return the range of matching farmer properties
	 */
	public java.util.List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer properties
	 */
	public java.util.List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProperty>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer properties
	 */
	public java.util.List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProperty>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer property
	 * @throws NoSuchFarmerPropertyException if a matching farmer property could not be found
	 */
	public FarmerProperty findBygetFA_FPR_FAI_First(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerProperty>
				orderByComparator)
		throws NoSuchFarmerPropertyException;

	/**
	 * Returns the first farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	public FarmerProperty fetchBygetFA_FPR_FAI_First(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProperty>
			orderByComparator);

	/**
	 * Returns the last farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer property
	 * @throws NoSuchFarmerPropertyException if a matching farmer property could not be found
	 */
	public FarmerProperty findBygetFA_FPR_FAI_Last(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerProperty>
				orderByComparator)
		throws NoSuchFarmerPropertyException;

	/**
	 * Returns the last farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	public FarmerProperty fetchBygetFA_FPR_FAI_Last(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProperty>
			orderByComparator);

	/**
	 * Returns the farmer properties before and after the current farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerPropertyId the primary key of the current farmer property
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer property
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	public FarmerProperty[] findBygetFA_FPR_FAI_PrevAndNext(
			long farmerPropertyId, long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerProperty>
				orderByComparator)
		throws NoSuchFarmerPropertyException;

	/**
	 * Removes all the farmer properties where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public void removeBygetFA_FPR_FAI(long farmerApplicationId);

	/**
	 * Returns the number of farmer properties where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer properties
	 */
	public int countBygetFA_FPR_FAI(long farmerApplicationId);

	/**
	 * Caches the farmer property in the entity cache if it is enabled.
	 *
	 * @param farmerProperty the farmer property
	 */
	public void cacheResult(FarmerProperty farmerProperty);

	/**
	 * Caches the farmer properties in the entity cache if it is enabled.
	 *
	 * @param farmerProperties the farmer properties
	 */
	public void cacheResult(java.util.List<FarmerProperty> farmerProperties);

	/**
	 * Creates a new farmer property with the primary key. Does not add the farmer property to the database.
	 *
	 * @param farmerPropertyId the primary key for the new farmer property
	 * @return the new farmer property
	 */
	public FarmerProperty create(long farmerPropertyId);

	/**
	 * Removes the farmer property with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property that was removed
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	public FarmerProperty remove(long farmerPropertyId)
		throws NoSuchFarmerPropertyException;

	public FarmerProperty updateImpl(FarmerProperty farmerProperty);

	/**
	 * Returns the farmer property with the primary key or throws a <code>NoSuchFarmerPropertyException</code> if it could not be found.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	public FarmerProperty findByPrimaryKey(long farmerPropertyId)
		throws NoSuchFarmerPropertyException;

	/**
	 * Returns the farmer property with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property, or <code>null</code> if a farmer property with the primary key could not be found
	 */
	public FarmerProperty fetchByPrimaryKey(long farmerPropertyId);

	/**
	 * Returns all the farmer properties.
	 *
	 * @return the farmer properties
	 */
	public java.util.List<FarmerProperty> findAll();

	/**
	 * Returns a range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @return the range of farmer properties
	 */
	public java.util.List<FarmerProperty> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer properties
	 */
	public java.util.List<FarmerProperty> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProperty>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer properties
	 */
	public java.util.List<FarmerProperty> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerProperty>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer properties from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer properties.
	 *
	 * @return the number of farmer properties
	 */
	public int countAll();

}