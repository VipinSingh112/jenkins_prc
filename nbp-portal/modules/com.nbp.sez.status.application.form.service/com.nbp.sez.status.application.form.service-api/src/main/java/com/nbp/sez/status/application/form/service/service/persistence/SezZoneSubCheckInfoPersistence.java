/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneSubCheckInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneSubCheckInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone sub check info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneSubCheckInfoUtil
 * @generated
 */
@ProviderType
public interface SezZoneSubCheckInfoPersistence
	extends BasePersistence<SezZoneSubCheckInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneSubCheckInfoUtil} to access the sez zone sub check info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez zone sub check info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneSubCheckInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone sub check info
	 * @throws NoSuchSezZoneSubCheckInfoException if a matching sez zone sub check info could not be found
	 */
	public SezZoneSubCheckInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneSubCheckInfoException;

	/**
	 * Returns the sez zone sub check info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone sub check info, or <code>null</code> if a matching sez zone sub check info could not be found
	 */
	public SezZoneSubCheckInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez zone sub check info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone sub check info, or <code>null</code> if a matching sez zone sub check info could not be found
	 */
	public SezZoneSubCheckInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez zone sub check info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone sub check info that was removed
	 */
	public SezZoneSubCheckInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneSubCheckInfoException;

	/**
	 * Returns the number of sez zone sub check infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone sub check infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez zone sub check info in the entity cache if it is enabled.
	 *
	 * @param sezZoneSubCheckInfo the sez zone sub check info
	 */
	public void cacheResult(SezZoneSubCheckInfo sezZoneSubCheckInfo);

	/**
	 * Caches the sez zone sub check infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneSubCheckInfos the sez zone sub check infos
	 */
	public void cacheResult(
		java.util.List<SezZoneSubCheckInfo> sezZoneSubCheckInfos);

	/**
	 * Creates a new sez zone sub check info with the primary key. Does not add the sez zone sub check info to the database.
	 *
	 * @param sezZoneSubCheckInfoId the primary key for the new sez zone sub check info
	 * @return the new sez zone sub check info
	 */
	public SezZoneSubCheckInfo create(long sezZoneSubCheckInfoId);

	/**
	 * Removes the sez zone sub check info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info that was removed
	 * @throws NoSuchSezZoneSubCheckInfoException if a sez zone sub check info with the primary key could not be found
	 */
	public SezZoneSubCheckInfo remove(long sezZoneSubCheckInfoId)
		throws NoSuchSezZoneSubCheckInfoException;

	public SezZoneSubCheckInfo updateImpl(
		SezZoneSubCheckInfo sezZoneSubCheckInfo);

	/**
	 * Returns the sez zone sub check info with the primary key or throws a <code>NoSuchSezZoneSubCheckInfoException</code> if it could not be found.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info
	 * @throws NoSuchSezZoneSubCheckInfoException if a sez zone sub check info with the primary key could not be found
	 */
	public SezZoneSubCheckInfo findByPrimaryKey(long sezZoneSubCheckInfoId)
		throws NoSuchSezZoneSubCheckInfoException;

	/**
	 * Returns the sez zone sub check info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneSubCheckInfoId the primary key of the sez zone sub check info
	 * @return the sez zone sub check info, or <code>null</code> if a sez zone sub check info with the primary key could not be found
	 */
	public SezZoneSubCheckInfo fetchByPrimaryKey(long sezZoneSubCheckInfoId);

	/**
	 * Returns all the sez zone sub check infos.
	 *
	 * @return the sez zone sub check infos
	 */
	public java.util.List<SezZoneSubCheckInfo> findAll();

	/**
	 * Returns a range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @return the range of sez zone sub check infos
	 */
	public java.util.List<SezZoneSubCheckInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone sub check infos
	 */
	public java.util.List<SezZoneSubCheckInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneSubCheckInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone sub check infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneSubCheckInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone sub check infos
	 * @param end the upper bound of the range of sez zone sub check infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone sub check infos
	 */
	public java.util.List<SezZoneSubCheckInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneSubCheckInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone sub check infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone sub check infos.
	 *
	 * @return the number of sez zone sub check infos
	 */
	public int countAll();

}