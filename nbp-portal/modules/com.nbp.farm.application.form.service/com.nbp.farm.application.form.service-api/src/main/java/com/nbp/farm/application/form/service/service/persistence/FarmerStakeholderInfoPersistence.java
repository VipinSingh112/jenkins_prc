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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerStakeholderInfoException;
import com.nbp.farm.application.form.service.model.FarmerStakeholderInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer stakeholder info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderInfoUtil
 * @generated
 */
@ProviderType
public interface FarmerStakeholderInfoPersistence
	extends BasePersistence<FarmerStakeholderInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerStakeholderInfoUtil} to access the farmer stakeholder info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerStakeholderInfoException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerStakeholderInfoException;

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo fetchBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer stakeholder info where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer stakeholder info that was removed
	 */
	public FarmerStakeholderInfo removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerStakeholderInfoException;

	/**
	 * Returns the number of farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder infos
	 */
	public int countBygetfarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerStakeholderInfoException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo findBygetFA_FSH_by_AppId(
			long farmerApplicationId)
		throws NoSuchFarmerStakeholderInfoException;

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo fetchBygetFA_FSH_by_AppId(
		long farmerApplicationId);

	/**
	 * Returns the farmer stakeholder info where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo fetchBygetFA_FSH_by_AppId(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer stakeholder info where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer stakeholder info that was removed
	 */
	public FarmerStakeholderInfo removeBygetFA_FSH_by_AppId(
			long farmerApplicationId)
		throws NoSuchFarmerStakeholderInfoException;

	/**
	 * Returns the number of farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder infos
	 */
	public int countBygetFA_FSH_by_AppId(long farmerApplicationId);

	/**
	 * Returns all the farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder infos
	 */
	public java.util.List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId);

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
	public java.util.List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId, int start, int end);

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
	public java.util.List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerStakeholderInfo>
			orderByComparator);

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
	public java.util.List<FarmerStakeholderInfo> findBygetFA_SH_FAI(
		long farmerApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerStakeholderInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo findBygetFA_SH_FAI_First(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerStakeholderInfo> orderByComparator)
		throws NoSuchFarmerStakeholderInfoException;

	/**
	 * Returns the first farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo fetchBygetFA_SH_FAI_First(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerStakeholderInfo>
			orderByComparator);

	/**
	 * Returns the last farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo findBygetFA_SH_FAI_Last(
			long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerStakeholderInfo> orderByComparator)
		throws NoSuchFarmerStakeholderInfoException;

	/**
	 * Returns the last farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder info, or <code>null</code> if a matching farmer stakeholder info could not be found
	 */
	public FarmerStakeholderInfo fetchBygetFA_SH_FAI_Last(
		long farmerApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerStakeholderInfo>
			orderByComparator);

	/**
	 * Returns the farmer stakeholder infos before and after the current farmer stakeholder info in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the primary key of the current farmer stakeholder info
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	public FarmerStakeholderInfo[] findBygetFA_SH_FAI_PrevAndNext(
			long farmerStakeholderInfoId, long farmerApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FarmerStakeholderInfo> orderByComparator)
		throws NoSuchFarmerStakeholderInfoException;

	/**
	 * Removes all the farmer stakeholder infos where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	public void removeBygetFA_SH_FAI(long farmerApplicationId);

	/**
	 * Returns the number of farmer stakeholder infos where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder infos
	 */
	public int countBygetFA_SH_FAI(long farmerApplicationId);

	/**
	 * Caches the farmer stakeholder info in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderInfo the farmer stakeholder info
	 */
	public void cacheResult(FarmerStakeholderInfo farmerStakeholderInfo);

	/**
	 * Caches the farmer stakeholder infos in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderInfos the farmer stakeholder infos
	 */
	public void cacheResult(
		java.util.List<FarmerStakeholderInfo> farmerStakeholderInfos);

	/**
	 * Creates a new farmer stakeholder info with the primary key. Does not add the farmer stakeholder info to the database.
	 *
	 * @param farmerStakeholderInfoId the primary key for the new farmer stakeholder info
	 * @return the new farmer stakeholder info
	 */
	public FarmerStakeholderInfo create(long farmerStakeholderInfoId);

	/**
	 * Removes the farmer stakeholder info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info that was removed
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	public FarmerStakeholderInfo remove(long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderInfoException;

	public FarmerStakeholderInfo updateImpl(
		FarmerStakeholderInfo farmerStakeholderInfo);

	/**
	 * Returns the farmer stakeholder info with the primary key or throws a <code>NoSuchFarmerStakeholderInfoException</code> if it could not be found.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info
	 * @throws NoSuchFarmerStakeholderInfoException if a farmer stakeholder info with the primary key could not be found
	 */
	public FarmerStakeholderInfo findByPrimaryKey(long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderInfoException;

	/**
	 * Returns the farmer stakeholder info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info, or <code>null</code> if a farmer stakeholder info with the primary key could not be found
	 */
	public FarmerStakeholderInfo fetchByPrimaryKey(
		long farmerStakeholderInfoId);

	/**
	 * Returns all the farmer stakeholder infos.
	 *
	 * @return the farmer stakeholder infos
	 */
	public java.util.List<FarmerStakeholderInfo> findAll();

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
	public java.util.List<FarmerStakeholderInfo> findAll(int start, int end);

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
	public java.util.List<FarmerStakeholderInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerStakeholderInfo>
			orderByComparator);

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
	public java.util.List<FarmerStakeholderInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerStakeholderInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer stakeholder infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer stakeholder infos.
	 *
	 * @return the number of farmer stakeholder infos
	 */
	public int countAll();

}