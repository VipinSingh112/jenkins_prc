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

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchJtbBranchDetailInfoException;
import com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb branch detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbBranchDetailInfoUtil
 * @generated
 */
@ProviderType
public interface JtbBranchDetailInfoPersistence
	extends BasePersistence<JtbBranchDetailInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JtbBranchDetailInfoUtil} to access the jtb branch detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the jtb branch detail info where jtbApplicationId = &#63; or throws a <code>NoSuchJtbBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb branch detail info
	 * @throws NoSuchJtbBranchDetailInfoException if a matching jtb branch detail info could not be found
	 */
	public JtbBranchDetailInfo findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchJtbBranchDetailInfoException;

	/**
	 * Returns the jtb branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb branch detail info, or <code>null</code> if a matching jtb branch detail info could not be found
	 */
	public JtbBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId);

	/**
	 * Returns the jtb branch detail info where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb branch detail info, or <code>null</code> if a matching jtb branch detail info could not be found
	 */
	public JtbBranchDetailInfo fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache);

	/**
	 * Removes the jtb branch detail info where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb branch detail info that was removed
	 */
	public JtbBranchDetailInfo removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchJtbBranchDetailInfoException;

	/**
	 * Returns the number of jtb branch detail infos where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb branch detail infos
	 */
	public int countBygetJTB_ByApplicationId(long jtbApplicationId);

	/**
	 * Caches the jtb branch detail info in the entity cache if it is enabled.
	 *
	 * @param jtbBranchDetailInfo the jtb branch detail info
	 */
	public void cacheResult(JtbBranchDetailInfo jtbBranchDetailInfo);

	/**
	 * Caches the jtb branch detail infos in the entity cache if it is enabled.
	 *
	 * @param jtbBranchDetailInfos the jtb branch detail infos
	 */
	public void cacheResult(
		java.util.List<JtbBranchDetailInfo> jtbBranchDetailInfos);

	/**
	 * Creates a new jtb branch detail info with the primary key. Does not add the jtb branch detail info to the database.
	 *
	 * @param jtbBranchDetailInfoId the primary key for the new jtb branch detail info
	 * @return the new jtb branch detail info
	 */
	public JtbBranchDetailInfo create(long jtbBranchDetailInfoId);

	/**
	 * Removes the jtb branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info that was removed
	 * @throws NoSuchJtbBranchDetailInfoException if a jtb branch detail info with the primary key could not be found
	 */
	public JtbBranchDetailInfo remove(long jtbBranchDetailInfoId)
		throws NoSuchJtbBranchDetailInfoException;

	public JtbBranchDetailInfo updateImpl(
		JtbBranchDetailInfo jtbBranchDetailInfo);

	/**
	 * Returns the jtb branch detail info with the primary key or throws a <code>NoSuchJtbBranchDetailInfoException</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info
	 * @throws NoSuchJtbBranchDetailInfoException if a jtb branch detail info with the primary key could not be found
	 */
	public JtbBranchDetailInfo findByPrimaryKey(long jtbBranchDetailInfoId)
		throws NoSuchJtbBranchDetailInfoException;

	/**
	 * Returns the jtb branch detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info, or <code>null</code> if a jtb branch detail info with the primary key could not be found
	 */
	public JtbBranchDetailInfo fetchByPrimaryKey(long jtbBranchDetailInfoId);

	/**
	 * Returns all the jtb branch detail infos.
	 *
	 * @return the jtb branch detail infos
	 */
	public java.util.List<JtbBranchDetailInfo> findAll();

	/**
	 * Returns a range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @return the range of jtb branch detail infos
	 */
	public java.util.List<JtbBranchDetailInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb branch detail infos
	 */
	public java.util.List<JtbBranchDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbBranchDetailInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb branch detail infos
	 */
	public java.util.List<JtbBranchDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JtbBranchDetailInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb branch detail infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb branch detail infos.
	 *
	 * @return the number of jtb branch detail infos
	 */
	public int countAll();

}