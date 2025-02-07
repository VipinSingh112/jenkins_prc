/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeMultFloorInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeMultFloorInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade mult floor info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeMultFloorInfoUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeMultFloorInfoPersistence
	extends BasePersistence<FireBrigadeMultFloorInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeMultFloorInfoUtil} to access the fire brigade mult floor info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade mult floor info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeMultFloorInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade mult floor info
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a matching fire brigade mult floor info could not be found
	 */
	public FireBrigadeMultFloorInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeMultFloorInfoException;

	/**
	 * Returns the fire brigade mult floor info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade mult floor info, or <code>null</code> if a matching fire brigade mult floor info could not be found
	 */
	public FireBrigadeMultFloorInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade mult floor info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade mult floor info, or <code>null</code> if a matching fire brigade mult floor info could not be found
	 */
	public FireBrigadeMultFloorInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache);

	/**
	 * Removes the fire brigade mult floor info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade mult floor info that was removed
	 */
	public FireBrigadeMultFloorInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeMultFloorInfoException;

	/**
	 * Returns the number of fire brigade mult floor infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade mult floor infos
	 */
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade mult floor info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeMultFloorInfo the fire brigade mult floor info
	 */
	public void cacheResult(FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo);

	/**
	 * Caches the fire brigade mult floor infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeMultFloorInfos the fire brigade mult floor infos
	 */
	public void cacheResult(
		java.util.List<FireBrigadeMultFloorInfo> fireBrigadeMultFloorInfos);

	/**
	 * Creates a new fire brigade mult floor info with the primary key. Does not add the fire brigade mult floor info to the database.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key for the new fire brigade mult floor info
	 * @return the new fire brigade mult floor info
	 */
	public FireBrigadeMultFloorInfo create(long fireBrigadeMultFloorInfoId);

	/**
	 * Removes the fire brigade mult floor info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info that was removed
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a fire brigade mult floor info with the primary key could not be found
	 */
	public FireBrigadeMultFloorInfo remove(long fireBrigadeMultFloorInfoId)
		throws NoSuchFireBrigadeMultFloorInfoException;

	public FireBrigadeMultFloorInfo updateImpl(
		FireBrigadeMultFloorInfo fireBrigadeMultFloorInfo);

	/**
	 * Returns the fire brigade mult floor info with the primary key or throws a <code>NoSuchFireBrigadeMultFloorInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info
	 * @throws NoSuchFireBrigadeMultFloorInfoException if a fire brigade mult floor info with the primary key could not be found
	 */
	public FireBrigadeMultFloorInfo findByPrimaryKey(
			long fireBrigadeMultFloorInfoId)
		throws NoSuchFireBrigadeMultFloorInfoException;

	/**
	 * Returns the fire brigade mult floor info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeMultFloorInfoId the primary key of the fire brigade mult floor info
	 * @return the fire brigade mult floor info, or <code>null</code> if a fire brigade mult floor info with the primary key could not be found
	 */
	public FireBrigadeMultFloorInfo fetchByPrimaryKey(
		long fireBrigadeMultFloorInfoId);

	/**
	 * Returns all the fire brigade mult floor infos.
	 *
	 * @return the fire brigade mult floor infos
	 */
	public java.util.List<FireBrigadeMultFloorInfo> findAll();

	/**
	 * Returns a range of all the fire brigade mult floor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeMultFloorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade mult floor infos
	 * @param end the upper bound of the range of fire brigade mult floor infos (not inclusive)
	 * @return the range of fire brigade mult floor infos
	 */
	public java.util.List<FireBrigadeMultFloorInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade mult floor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeMultFloorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade mult floor infos
	 * @param end the upper bound of the range of fire brigade mult floor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade mult floor infos
	 */
	public java.util.List<FireBrigadeMultFloorInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeMultFloorInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade mult floor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeMultFloorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade mult floor infos
	 * @param end the upper bound of the range of fire brigade mult floor infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade mult floor infos
	 */
	public java.util.List<FireBrigadeMultFloorInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeMultFloorInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade mult floor infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade mult floor infos.
	 *
	 * @return the number of fire brigade mult floor infos
	 */
	public int countAll();

}