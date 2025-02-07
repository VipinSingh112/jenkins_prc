/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneGeneralBusinessInfoException;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBusinessInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone general business info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBusinessInfoUtil
 * @generated
 */
@ProviderType
public interface SezZoneGeneralBusinessInfoPersistence
	extends BasePersistence<SezZoneGeneralBusinessInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneGeneralBusinessInfoUtil} to access the sez zone general business info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez zone general business info where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneGeneralBusinessInfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general business info
	 * @throws NoSuchSezZoneGeneralBusinessInfoException if a matching sez zone general business info could not be found
	 */
	public SezZoneGeneralBusinessInfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneGeneralBusinessInfoException;

	/**
	 * Returns the sez zone general business info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general business info, or <code>null</code> if a matching sez zone general business info could not be found
	 */
	public SezZoneGeneralBusinessInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez zone general business info where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general business info, or <code>null</code> if a matching sez zone general business info could not be found
	 */
	public SezZoneGeneralBusinessInfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez zone general business info where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone general business info that was removed
	 */
	public SezZoneGeneralBusinessInfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneGeneralBusinessInfoException;

	/**
	 * Returns the number of sez zone general business infos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone general business infos
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Caches the sez zone general business info in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBusinessInfo the sez zone general business info
	 */
	public void cacheResult(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo);

	/**
	 * Caches the sez zone general business infos in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBusinessInfos the sez zone general business infos
	 */
	public void cacheResult(
		java.util.List<SezZoneGeneralBusinessInfo> sezZoneGeneralBusinessInfos);

	/**
	 * Creates a new sez zone general business info with the primary key. Does not add the sez zone general business info to the database.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key for the new sez zone general business info
	 * @return the new sez zone general business info
	 */
	public SezZoneGeneralBusinessInfo create(long sezZoneGeneralBusinessInfoId);

	/**
	 * Removes the sez zone general business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info that was removed
	 * @throws NoSuchSezZoneGeneralBusinessInfoException if a sez zone general business info with the primary key could not be found
	 */
	public SezZoneGeneralBusinessInfo remove(long sezZoneGeneralBusinessInfoId)
		throws NoSuchSezZoneGeneralBusinessInfoException;

	public SezZoneGeneralBusinessInfo updateImpl(
		SezZoneGeneralBusinessInfo sezZoneGeneralBusinessInfo);

	/**
	 * Returns the sez zone general business info with the primary key or throws a <code>NoSuchSezZoneGeneralBusinessInfoException</code> if it could not be found.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info
	 * @throws NoSuchSezZoneGeneralBusinessInfoException if a sez zone general business info with the primary key could not be found
	 */
	public SezZoneGeneralBusinessInfo findByPrimaryKey(
			long sezZoneGeneralBusinessInfoId)
		throws NoSuchSezZoneGeneralBusinessInfoException;

	/**
	 * Returns the sez zone general business info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneGeneralBusinessInfoId the primary key of the sez zone general business info
	 * @return the sez zone general business info, or <code>null</code> if a sez zone general business info with the primary key could not be found
	 */
	public SezZoneGeneralBusinessInfo fetchByPrimaryKey(
		long sezZoneGeneralBusinessInfoId);

	/**
	 * Returns all the sez zone general business infos.
	 *
	 * @return the sez zone general business infos
	 */
	public java.util.List<SezZoneGeneralBusinessInfo> findAll();

	/**
	 * Returns a range of all the sez zone general business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general business infos
	 * @param end the upper bound of the range of sez zone general business infos (not inclusive)
	 * @return the range of sez zone general business infos
	 */
	public java.util.List<SezZoneGeneralBusinessInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the sez zone general business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general business infos
	 * @param end the upper bound of the range of sez zone general business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone general business infos
	 */
	public java.util.List<SezZoneGeneralBusinessInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezZoneGeneralBusinessInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the sez zone general business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general business infos
	 * @param end the upper bound of the range of sez zone general business infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone general business infos
	 */
	public java.util.List<SezZoneGeneralBusinessInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezZoneGeneralBusinessInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone general business infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone general business infos.
	 *
	 * @return the number of sez zone general business infos
	 */
	public int countAll();

}