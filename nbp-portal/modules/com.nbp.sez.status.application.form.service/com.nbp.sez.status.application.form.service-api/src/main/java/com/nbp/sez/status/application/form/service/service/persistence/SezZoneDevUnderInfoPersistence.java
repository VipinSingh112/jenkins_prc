/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneDevUnderInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneDevUnderInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone dev under info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneDevUnderInfoUtil
 * @generated
 */
@ProviderType
public interface SezZoneDevUnderInfoPersistence
	extends BasePersistence<SezZoneDevUnderInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneDevUnderInfoUtil} to access the sez zone dev under info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez zone dev under info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneDevUnderInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone dev under info
	 * @throws NoSuchSezZoneDevUnderInfoException if a matching sez zone dev under info could not be found
	 */
	public SezZoneDevUnderInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneDevUnderInfoException;

	/**
	 * Returns the sez zone dev under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone dev under info, or <code>null</code> if a matching sez zone dev under info could not be found
	 */
	public SezZoneDevUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez zone dev under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone dev under info, or <code>null</code> if a matching sez zone dev under info could not be found
	 */
	public SezZoneDevUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez zone dev under info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone dev under info that was removed
	 */
	public SezZoneDevUnderInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneDevUnderInfoException;

	/**
	 * Returns the number of sez zone dev under infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone dev under infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez zone dev under info in the entity cache if it is enabled.
	 *
	 * @param sezZoneDevUnderInfo the sez zone dev under info
	 */
	public void cacheResult(SezZoneDevUnderInfo sezZoneDevUnderInfo);

	/**
	 * Caches the sez zone dev under infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneDevUnderInfos the sez zone dev under infos
	 */
	public void cacheResult(
		java.util.List<SezZoneDevUnderInfo> sezZoneDevUnderInfos);

	/**
	 * Creates a new sez zone dev under info with the primary key. Does not add the sez zone dev under info to the database.
	 *
	 * @param sezZoneDevUnderInfoId the primary key for the new sez zone dev under info
	 * @return the new sez zone dev under info
	 */
	public SezZoneDevUnderInfo create(long sezZoneDevUnderInfoId);

	/**
	 * Removes the sez zone dev under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info that was removed
	 * @throws NoSuchSezZoneDevUnderInfoException if a sez zone dev under info with the primary key could not be found
	 */
	public SezZoneDevUnderInfo remove(long sezZoneDevUnderInfoId)
		throws NoSuchSezZoneDevUnderInfoException;

	public SezZoneDevUnderInfo updateImpl(
		SezZoneDevUnderInfo sezZoneDevUnderInfo);

	/**
	 * Returns the sez zone dev under info with the primary key or throws a <code>NoSuchSezZoneDevUnderInfoException</code> if it could not be found.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info
	 * @throws NoSuchSezZoneDevUnderInfoException if a sez zone dev under info with the primary key could not be found
	 */
	public SezZoneDevUnderInfo findByPrimaryKey(long sezZoneDevUnderInfoId)
		throws NoSuchSezZoneDevUnderInfoException;

	/**
	 * Returns the sez zone dev under info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneDevUnderInfoId the primary key of the sez zone dev under info
	 * @return the sez zone dev under info, or <code>null</code> if a sez zone dev under info with the primary key could not be found
	 */
	public SezZoneDevUnderInfo fetchByPrimaryKey(long sezZoneDevUnderInfoId);

	/**
	 * Returns all the sez zone dev under infos.
	 *
	 * @return the sez zone dev under infos
	 */
	public java.util.List<SezZoneDevUnderInfo> findAll();

	/**
	 * Returns a range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @return the range of sez zone dev under infos
	 */
	public java.util.List<SezZoneDevUnderInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone dev under infos
	 */
	public java.util.List<SezZoneDevUnderInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneDevUnderInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone dev under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneDevUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone dev under infos
	 * @param end the upper bound of the range of sez zone dev under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone dev under infos
	 */
	public java.util.List<SezZoneDevUnderInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneDevUnderInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone dev under infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone dev under infos.
	 *
	 * @return the number of sez zone dev under infos
	 */
	public int countAll();

}