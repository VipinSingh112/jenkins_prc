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

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneEmpInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone emp info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmpInfoUtil
 * @generated
 */
@ProviderType
public interface SezZoneEmpInfoPersistence
	extends BasePersistence<SezZoneEmpInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneEmpInfoUtil} to access the sez zone emp info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone emp infos
	 */
	public java.util.List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns a range of all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @return the range of matching sez zone emp infos
	 */
	public java.util.List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez zone emp infos
	 */
	public java.util.List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmpInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez zone emp infos
	 */
	public java.util.List<SezZoneEmpInfo> findBygetSezStatusByAppId(
		long sezStatusApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmpInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a matching sez zone emp info could not be found
	 */
	public SezZoneEmpInfo findBygetSezStatusByAppId_First(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmpInfo>
				orderByComparator)
		throws NoSuchSezZoneEmpInfoException;

	/**
	 * Returns the first sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez zone emp info, or <code>null</code> if a matching sez zone emp info could not be found
	 */
	public SezZoneEmpInfo fetchBygetSezStatusByAppId_First(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmpInfo>
			orderByComparator);

	/**
	 * Returns the last sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a matching sez zone emp info could not be found
	 */
	public SezZoneEmpInfo findBygetSezStatusByAppId_Last(
			long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmpInfo>
				orderByComparator)
		throws NoSuchSezZoneEmpInfoException;

	/**
	 * Returns the last sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez zone emp info, or <code>null</code> if a matching sez zone emp info could not be found
	 */
	public SezZoneEmpInfo fetchBygetSezStatusByAppId_Last(
		long sezStatusApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmpInfo>
			orderByComparator);

	/**
	 * Returns the sez zone emp infos before and after the current sez zone emp info in the ordered set where sezStatusApplicationId = &#63;.
	 *
	 * @param sezZoneEmpInfoId the primary key of the current sez zone emp info
	 * @param sezStatusApplicationId the sez status application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	public SezZoneEmpInfo[] findBygetSezStatusByAppId_PrevAndNext(
			long sezZoneEmpInfoId, long sezStatusApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmpInfo>
				orderByComparator)
		throws NoSuchSezZoneEmpInfoException;

	/**
	 * Removes all the sez zone emp infos where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 */
	public void removeBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the number of sez zone emp infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone emp infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez zone emp info in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmpInfo the sez zone emp info
	 */
	public void cacheResult(SezZoneEmpInfo sezZoneEmpInfo);

	/**
	 * Caches the sez zone emp infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneEmpInfos the sez zone emp infos
	 */
	public void cacheResult(java.util.List<SezZoneEmpInfo> sezZoneEmpInfos);

	/**
	 * Creates a new sez zone emp info with the primary key. Does not add the sez zone emp info to the database.
	 *
	 * @param sezZoneEmpInfoId the primary key for the new sez zone emp info
	 * @return the new sez zone emp info
	 */
	public SezZoneEmpInfo create(long sezZoneEmpInfoId);

	/**
	 * Removes the sez zone emp info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info that was removed
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	public SezZoneEmpInfo remove(long sezZoneEmpInfoId)
		throws NoSuchSezZoneEmpInfoException;

	public SezZoneEmpInfo updateImpl(SezZoneEmpInfo sezZoneEmpInfo);

	/**
	 * Returns the sez zone emp info with the primary key or throws a <code>NoSuchSezZoneEmpInfoException</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info
	 * @throws NoSuchSezZoneEmpInfoException if a sez zone emp info with the primary key could not be found
	 */
	public SezZoneEmpInfo findByPrimaryKey(long sezZoneEmpInfoId)
		throws NoSuchSezZoneEmpInfoException;

	/**
	 * Returns the sez zone emp info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info, or <code>null</code> if a sez zone emp info with the primary key could not be found
	 */
	public SezZoneEmpInfo fetchByPrimaryKey(long sezZoneEmpInfoId);

	/**
	 * Returns all the sez zone emp infos.
	 *
	 * @return the sez zone emp infos
	 */
	public java.util.List<SezZoneEmpInfo> findAll();

	/**
	 * Returns a range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @return the range of sez zone emp infos
	 */
	public java.util.List<SezZoneEmpInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone emp infos
	 */
	public java.util.List<SezZoneEmpInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmpInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone emp infos
	 */
	public java.util.List<SezZoneEmpInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneEmpInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone emp infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone emp infos.
	 *
	 * @return the number of sez zone emp infos
	 */
	public int countAll();

}