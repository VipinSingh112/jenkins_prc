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

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.manufacturing.application.form.service.exception.NoSuchManuAdditionalComapnyInfoException;
import com.nbp.manufacturing.application.form.service.model.ManuAdditionalComapnyInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the manu additional comapny info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalComapnyInfoUtil
 * @generated
 */
@ProviderType
public interface ManuAdditionalComapnyInfoPersistence
	extends BasePersistence<ManuAdditionalComapnyInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ManuAdditionalComapnyInfoUtil} to access the manu additional comapny info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the manu additional comapny info where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuAdditionalComapnyInfoException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional comapny info
	 * @throws NoSuchManuAdditionalComapnyInfoException if a matching manu additional comapny info could not be found
	 */
	public ManuAdditionalComapnyInfo findBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuAdditionalComapnyInfoException;

	/**
	 * Returns the manu additional comapny info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu additional comapny info, or <code>null</code> if a matching manu additional comapny info could not be found
	 */
	public ManuAdditionalComapnyInfo fetchBygetManufactureById(
		long manufacturingApplicationId);

	/**
	 * Returns the manu additional comapny info where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu additional comapny info, or <code>null</code> if a matching manu additional comapny info could not be found
	 */
	public ManuAdditionalComapnyInfo fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache);

	/**
	 * Removes the manu additional comapny info where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu additional comapny info that was removed
	 */
	public ManuAdditionalComapnyInfo removeBygetManufactureById(
			long manufacturingApplicationId)
		throws NoSuchManuAdditionalComapnyInfoException;

	/**
	 * Returns the number of manu additional comapny infos where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu additional comapny infos
	 */
	public int countBygetManufactureById(long manufacturingApplicationId);

	/**
	 * Caches the manu additional comapny info in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalComapnyInfo the manu additional comapny info
	 */
	public void cacheResult(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo);

	/**
	 * Caches the manu additional comapny infos in the entity cache if it is enabled.
	 *
	 * @param manuAdditionalComapnyInfos the manu additional comapny infos
	 */
	public void cacheResult(
		java.util.List<ManuAdditionalComapnyInfo> manuAdditionalComapnyInfos);

	/**
	 * Creates a new manu additional comapny info with the primary key. Does not add the manu additional comapny info to the database.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key for the new manu additional comapny info
	 * @return the new manu additional comapny info
	 */
	public ManuAdditionalComapnyInfo create(long manuAdditionalComapnyInfoId);

	/**
	 * Removes the manu additional comapny info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info that was removed
	 * @throws NoSuchManuAdditionalComapnyInfoException if a manu additional comapny info with the primary key could not be found
	 */
	public ManuAdditionalComapnyInfo remove(long manuAdditionalComapnyInfoId)
		throws NoSuchManuAdditionalComapnyInfoException;

	public ManuAdditionalComapnyInfo updateImpl(
		ManuAdditionalComapnyInfo manuAdditionalComapnyInfo);

	/**
	 * Returns the manu additional comapny info with the primary key or throws a <code>NoSuchManuAdditionalComapnyInfoException</code> if it could not be found.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info
	 * @throws NoSuchManuAdditionalComapnyInfoException if a manu additional comapny info with the primary key could not be found
	 */
	public ManuAdditionalComapnyInfo findByPrimaryKey(
			long manuAdditionalComapnyInfoId)
		throws NoSuchManuAdditionalComapnyInfoException;

	/**
	 * Returns the manu additional comapny info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info, or <code>null</code> if a manu additional comapny info with the primary key could not be found
	 */
	public ManuAdditionalComapnyInfo fetchByPrimaryKey(
		long manuAdditionalComapnyInfoId);

	/**
	 * Returns all the manu additional comapny infos.
	 *
	 * @return the manu additional comapny infos
	 */
	public java.util.List<ManuAdditionalComapnyInfo> findAll();

	/**
	 * Returns a range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @return the range of manu additional comapny infos
	 */
	public java.util.List<ManuAdditionalComapnyInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu additional comapny infos
	 */
	public java.util.List<ManuAdditionalComapnyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuAdditionalComapnyInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu additional comapny infos
	 */
	public java.util.List<ManuAdditionalComapnyInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<ManuAdditionalComapnyInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the manu additional comapny infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of manu additional comapny infos.
	 *
	 * @return the number of manu additional comapny infos
	 */
	public int countAll();

}