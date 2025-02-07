/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchRadionuclideInfoException;
import com.nbp.hsra.application.service.model.RadionuclideInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the radionuclide info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadionuclideInfoUtil
 * @generated
 */
@ProviderType
public interface RadionuclideInfoPersistence
	extends BasePersistence<RadionuclideInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RadionuclideInfoUtil} to access the radionuclide info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the radionuclide info where hsraApplicationId = &#63; or throws a <code>NoSuchRadionuclideInfoException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radionuclide info
	 * @throws NoSuchRadionuclideInfoException if a matching radionuclide info could not be found
	 */
	public RadionuclideInfo findBygetHsraById(long hsraApplicationId)
		throws NoSuchRadionuclideInfoException;

	/**
	 * Returns the radionuclide info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radionuclide info, or <code>null</code> if a matching radionuclide info could not be found
	 */
	public RadionuclideInfo fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the radionuclide info where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radionuclide info, or <code>null</code> if a matching radionuclide info could not be found
	 */
	public RadionuclideInfo fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the radionuclide info where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radionuclide info that was removed
	 */
	public RadionuclideInfo removeBygetHsraById(long hsraApplicationId)
		throws NoSuchRadionuclideInfoException;

	/**
	 * Returns the number of radionuclide infos where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radionuclide infos
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the radionuclide info in the entity cache if it is enabled.
	 *
	 * @param radionuclideInfo the radionuclide info
	 */
	public void cacheResult(RadionuclideInfo radionuclideInfo);

	/**
	 * Caches the radionuclide infos in the entity cache if it is enabled.
	 *
	 * @param radionuclideInfos the radionuclide infos
	 */
	public void cacheResult(java.util.List<RadionuclideInfo> radionuclideInfos);

	/**
	 * Creates a new radionuclide info with the primary key. Does not add the radionuclide info to the database.
	 *
	 * @param radionuclideInfoId the primary key for the new radionuclide info
	 * @return the new radionuclide info
	 */
	public RadionuclideInfo create(long radionuclideInfoId);

	/**
	 * Removes the radionuclide info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info that was removed
	 * @throws NoSuchRadionuclideInfoException if a radionuclide info with the primary key could not be found
	 */
	public RadionuclideInfo remove(long radionuclideInfoId)
		throws NoSuchRadionuclideInfoException;

	public RadionuclideInfo updateImpl(RadionuclideInfo radionuclideInfo);

	/**
	 * Returns the radionuclide info with the primary key or throws a <code>NoSuchRadionuclideInfoException</code> if it could not be found.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info
	 * @throws NoSuchRadionuclideInfoException if a radionuclide info with the primary key could not be found
	 */
	public RadionuclideInfo findByPrimaryKey(long radionuclideInfoId)
		throws NoSuchRadionuclideInfoException;

	/**
	 * Returns the radionuclide info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radionuclideInfoId the primary key of the radionuclide info
	 * @return the radionuclide info, or <code>null</code> if a radionuclide info with the primary key could not be found
	 */
	public RadionuclideInfo fetchByPrimaryKey(long radionuclideInfoId);

	/**
	 * Returns all the radionuclide infos.
	 *
	 * @return the radionuclide infos
	 */
	public java.util.List<RadionuclideInfo> findAll();

	/**
	 * Returns a range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @return the range of radionuclide infos
	 */
	public java.util.List<RadionuclideInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radionuclide infos
	 */
	public java.util.List<RadionuclideInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadionuclideInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the radionuclide infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadionuclideInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radionuclide infos
	 * @param end the upper bound of the range of radionuclide infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radionuclide infos
	 */
	public java.util.List<RadionuclideInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RadionuclideInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the radionuclide infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of radionuclide infos.
	 *
	 * @return the number of radionuclide infos
	 */
	public int countAll();

}