/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeHazardousSubInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade hazardous sub info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeHazardousSubInfoUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeHazardousSubInfoPersistence
	extends BasePersistence<FireBrigadeHazardousSubInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeHazardousSubInfoUtil} to access the fire brigade hazardous sub info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade hazardous sub info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeHazardousSubInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade hazardous sub info
	 * @throws NoSuchFireBrigadeHazardousSubInfoException if a matching fire brigade hazardous sub info could not be found
	 */
	public FireBrigadeHazardousSubInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeHazardousSubInfoException;

	/**
	 * Returns the fire brigade hazardous sub info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade hazardous sub info, or <code>null</code> if a matching fire brigade hazardous sub info could not be found
	 */
	public FireBrigadeHazardousSubInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade hazardous sub info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade hazardous sub info, or <code>null</code> if a matching fire brigade hazardous sub info could not be found
	 */
	public FireBrigadeHazardousSubInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache);

	/**
	 * Removes the fire brigade hazardous sub info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade hazardous sub info that was removed
	 */
	public FireBrigadeHazardousSubInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeHazardousSubInfoException;

	/**
	 * Returns the number of fire brigade hazardous sub infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade hazardous sub infos
	 */
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade hazardous sub info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeHazardousSubInfo the fire brigade hazardous sub info
	 */
	public void cacheResult(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo);

	/**
	 * Caches the fire brigade hazardous sub infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeHazardousSubInfos the fire brigade hazardous sub infos
	 */
	public void cacheResult(
		java.util.List<FireBrigadeHazardousSubInfo>
			fireBrigadeHazardousSubInfos);

	/**
	 * Creates a new fire brigade hazardous sub info with the primary key. Does not add the fire brigade hazardous sub info to the database.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key for the new fire brigade hazardous sub info
	 * @return the new fire brigade hazardous sub info
	 */
	public FireBrigadeHazardousSubInfo create(
		long fireBrigadeHazardousSubInfoId);

	/**
	 * Removes the fire brigade hazardous sub info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was removed
	 * @throws NoSuchFireBrigadeHazardousSubInfoException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	public FireBrigadeHazardousSubInfo remove(
			long fireBrigadeHazardousSubInfoId)
		throws NoSuchFireBrigadeHazardousSubInfoException;

	public FireBrigadeHazardousSubInfo updateImpl(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo);

	/**
	 * Returns the fire brigade hazardous sub info with the primary key or throws a <code>NoSuchFireBrigadeHazardousSubInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info
	 * @throws NoSuchFireBrigadeHazardousSubInfoException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	public FireBrigadeHazardousSubInfo findByPrimaryKey(
			long fireBrigadeHazardousSubInfoId)
		throws NoSuchFireBrigadeHazardousSubInfoException;

	/**
	 * Returns the fire brigade hazardous sub info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info, or <code>null</code> if a fire brigade hazardous sub info with the primary key could not be found
	 */
	public FireBrigadeHazardousSubInfo fetchByPrimaryKey(
		long fireBrigadeHazardousSubInfoId);

	/**
	 * Returns all the fire brigade hazardous sub infos.
	 *
	 * @return the fire brigade hazardous sub infos
	 */
	public java.util.List<FireBrigadeHazardousSubInfo> findAll();

	/**
	 * Returns a range of all the fire brigade hazardous sub infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeHazardousSubInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade hazardous sub infos
	 * @param end the upper bound of the range of fire brigade hazardous sub infos (not inclusive)
	 * @return the range of fire brigade hazardous sub infos
	 */
	public java.util.List<FireBrigadeHazardousSubInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade hazardous sub infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeHazardousSubInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade hazardous sub infos
	 * @param end the upper bound of the range of fire brigade hazardous sub infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade hazardous sub infos
	 */
	public java.util.List<FireBrigadeHazardousSubInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeHazardousSubInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade hazardous sub infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeHazardousSubInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade hazardous sub infos
	 * @param end the upper bound of the range of fire brigade hazardous sub infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade hazardous sub infos
	 */
	public java.util.List<FireBrigadeHazardousSubInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeHazardousSubInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade hazardous sub infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade hazardous sub infos.
	 *
	 * @return the number of fire brigade hazardous sub infos
	 */
	public int countAll();

}