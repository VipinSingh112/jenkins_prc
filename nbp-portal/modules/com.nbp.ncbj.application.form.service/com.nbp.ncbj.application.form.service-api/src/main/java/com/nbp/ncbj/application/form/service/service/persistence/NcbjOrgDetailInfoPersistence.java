/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjOrgDetailInfoException;
import com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj org detail info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrgDetailInfoUtil
 * @generated
 */
@ProviderType
public interface NcbjOrgDetailInfoPersistence
	extends BasePersistence<NcbjOrgDetailInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjOrgDetailInfoUtil} to access the ncbj org detail info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the ncbj org detail info where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjOrgDetailInfoException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj org detail info
	 * @throws NoSuchNcbjOrgDetailInfoException if a matching ncbj org detail info could not be found
	 */
	public NcbjOrgDetailInfo findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjOrgDetailInfoException;

	/**
	 * Returns the ncbj org detail info where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj org detail info, or <code>null</code> if a matching ncbj org detail info could not be found
	 */
	public NcbjOrgDetailInfo fetchBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Returns the ncbj org detail info where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj org detail info, or <code>null</code> if a matching ncbj org detail info could not be found
	 */
	public NcbjOrgDetailInfo fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache);

	/**
	 * Removes the ncbj org detail info where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj org detail info that was removed
	 */
	public NcbjOrgDetailInfo removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjOrgDetailInfoException;

	/**
	 * Returns the number of ncbj org detail infos where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj org detail infos
	 */
	public int countBygetNCBJByAppId(long ncbjApplicationId);

	/**
	 * Caches the ncbj org detail info in the entity cache if it is enabled.
	 *
	 * @param ncbjOrgDetailInfo the ncbj org detail info
	 */
	public void cacheResult(NcbjOrgDetailInfo ncbjOrgDetailInfo);

	/**
	 * Caches the ncbj org detail infos in the entity cache if it is enabled.
	 *
	 * @param ncbjOrgDetailInfos the ncbj org detail infos
	 */
	public void cacheResult(
		java.util.List<NcbjOrgDetailInfo> ncbjOrgDetailInfos);

	/**
	 * Creates a new ncbj org detail info with the primary key. Does not add the ncbj org detail info to the database.
	 *
	 * @param ncbjOrgDetailInfoId the primary key for the new ncbj org detail info
	 * @return the new ncbj org detail info
	 */
	public NcbjOrgDetailInfo create(long ncbjOrgDetailInfoId);

	/**
	 * Removes the ncbj org detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info that was removed
	 * @throws NoSuchNcbjOrgDetailInfoException if a ncbj org detail info with the primary key could not be found
	 */
	public NcbjOrgDetailInfo remove(long ncbjOrgDetailInfoId)
		throws NoSuchNcbjOrgDetailInfoException;

	public NcbjOrgDetailInfo updateImpl(NcbjOrgDetailInfo ncbjOrgDetailInfo);

	/**
	 * Returns the ncbj org detail info with the primary key or throws a <code>NoSuchNcbjOrgDetailInfoException</code> if it could not be found.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info
	 * @throws NoSuchNcbjOrgDetailInfoException if a ncbj org detail info with the primary key could not be found
	 */
	public NcbjOrgDetailInfo findByPrimaryKey(long ncbjOrgDetailInfoId)
		throws NoSuchNcbjOrgDetailInfoException;

	/**
	 * Returns the ncbj org detail info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info, or <code>null</code> if a ncbj org detail info with the primary key could not be found
	 */
	public NcbjOrgDetailInfo fetchByPrimaryKey(long ncbjOrgDetailInfoId);

	/**
	 * Returns all the ncbj org detail infos.
	 *
	 * @return the ncbj org detail infos
	 */
	public java.util.List<NcbjOrgDetailInfo> findAll();

	/**
	 * Returns a range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @return the range of ncbj org detail infos
	 */
	public java.util.List<NcbjOrgDetailInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj org detail infos
	 */
	public java.util.List<NcbjOrgDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjOrgDetailInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj org detail infos
	 */
	public java.util.List<NcbjOrgDetailInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjOrgDetailInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj org detail infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj org detail infos.
	 *
	 * @return the number of ncbj org detail infos
	 */
	public int countAll();

}