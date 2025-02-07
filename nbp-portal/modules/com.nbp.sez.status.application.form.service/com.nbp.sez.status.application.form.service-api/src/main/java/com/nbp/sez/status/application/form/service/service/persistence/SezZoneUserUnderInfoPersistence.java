/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneUserUnderInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone user under info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfoUtil
 * @generated
 */
@ProviderType
public interface SezZoneUserUnderInfoPersistence
	extends BasePersistence<SezZoneUserUnderInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneUserUnderInfoUtil} to access the sez zone user under info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez zone user under info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneUserUnderInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone user under info
	 * @throws NoSuchSezZoneUserUnderInfoException if a matching sez zone user under info could not be found
	 */
	public SezZoneUserUnderInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneUserUnderInfoException;

	/**
	 * Returns the sez zone user under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone user under info, or <code>null</code> if a matching sez zone user under info could not be found
	 */
	public SezZoneUserUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez zone user under info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone user under info, or <code>null</code> if a matching sez zone user under info could not be found
	 */
	public SezZoneUserUnderInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez zone user under info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone user under info that was removed
	 */
	public SezZoneUserUnderInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneUserUnderInfoException;

	/**
	 * Returns the number of sez zone user under infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone user under infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez zone user under info in the entity cache if it is enabled.
	 *
	 * @param sezZoneUserUnderInfo the sez zone user under info
	 */
	public void cacheResult(SezZoneUserUnderInfo sezZoneUserUnderInfo);

	/**
	 * Caches the sez zone user under infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneUserUnderInfos the sez zone user under infos
	 */
	public void cacheResult(
		java.util.List<SezZoneUserUnderInfo> sezZoneUserUnderInfos);

	/**
	 * Creates a new sez zone user under info with the primary key. Does not add the sez zone user under info to the database.
	 *
	 * @param sezZoneUserUnderInfoId the primary key for the new sez zone user under info
	 * @return the new sez zone user under info
	 */
	public SezZoneUserUnderInfo create(long sezZoneUserUnderInfoId);

	/**
	 * Removes the sez zone user under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info that was removed
	 * @throws NoSuchSezZoneUserUnderInfoException if a sez zone user under info with the primary key could not be found
	 */
	public SezZoneUserUnderInfo remove(long sezZoneUserUnderInfoId)
		throws NoSuchSezZoneUserUnderInfoException;

	public SezZoneUserUnderInfo updateImpl(
		SezZoneUserUnderInfo sezZoneUserUnderInfo);

	/**
	 * Returns the sez zone user under info with the primary key or throws a <code>NoSuchSezZoneUserUnderInfoException</code> if it could not be found.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info
	 * @throws NoSuchSezZoneUserUnderInfoException if a sez zone user under info with the primary key could not be found
	 */
	public SezZoneUserUnderInfo findByPrimaryKey(long sezZoneUserUnderInfoId)
		throws NoSuchSezZoneUserUnderInfoException;

	/**
	 * Returns the sez zone user under info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info, or <code>null</code> if a sez zone user under info with the primary key could not be found
	 */
	public SezZoneUserUnderInfo fetchByPrimaryKey(long sezZoneUserUnderInfoId);

	/**
	 * Returns all the sez zone user under infos.
	 *
	 * @return the sez zone user under infos
	 */
	public java.util.List<SezZoneUserUnderInfo> findAll();

	/**
	 * Returns a range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @return the range of sez zone user under infos
	 */
	public java.util.List<SezZoneUserUnderInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone user under infos
	 */
	public java.util.List<SezZoneUserUnderInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneUserUnderInfo>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone user under infos
	 */
	public java.util.List<SezZoneUserUnderInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezZoneUserUnderInfo>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone user under infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone user under infos.
	 *
	 * @return the number of sez zone user under infos
	 */
	public int countAll();

}