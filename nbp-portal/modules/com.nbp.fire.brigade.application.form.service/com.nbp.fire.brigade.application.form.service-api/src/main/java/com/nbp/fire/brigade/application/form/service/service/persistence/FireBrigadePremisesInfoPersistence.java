/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadePremisesInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade premises info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePremisesInfoUtil
 * @generated
 */
@ProviderType
public interface FireBrigadePremisesInfoPersistence
	extends BasePersistence<FireBrigadePremisesInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadePremisesInfoUtil} to access the fire brigade premises info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade premises info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadePremisesInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade premises info
	 * @throws NoSuchFireBrigadePremisesInfoException if a matching fire brigade premises info could not be found
	 */
	public FireBrigadePremisesInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadePremisesInfoException;

	/**
	 * Returns the fire brigade premises info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade premises info, or <code>null</code> if a matching fire brigade premises info could not be found
	 */
	public FireBrigadePremisesInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade premises info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade premises info, or <code>null</code> if a matching fire brigade premises info could not be found
	 */
	public FireBrigadePremisesInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache);

	/**
	 * Removes the fire brigade premises info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade premises info that was removed
	 */
	public FireBrigadePremisesInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadePremisesInfoException;

	/**
	 * Returns the number of fire brigade premises infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade premises infos
	 */
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade premises info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePremisesInfo the fire brigade premises info
	 */
	public void cacheResult(FireBrigadePremisesInfo fireBrigadePremisesInfo);

	/**
	 * Caches the fire brigade premises infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadePremisesInfos the fire brigade premises infos
	 */
	public void cacheResult(
		java.util.List<FireBrigadePremisesInfo> fireBrigadePremisesInfos);

	/**
	 * Creates a new fire brigade premises info with the primary key. Does not add the fire brigade premises info to the database.
	 *
	 * @param fireBrigadePremisesInfoId the primary key for the new fire brigade premises info
	 * @return the new fire brigade premises info
	 */
	public FireBrigadePremisesInfo create(long fireBrigadePremisesInfoId);

	/**
	 * Removes the fire brigade premises info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadePremisesInfoId the primary key of the fire brigade premises info
	 * @return the fire brigade premises info that was removed
	 * @throws NoSuchFireBrigadePremisesInfoException if a fire brigade premises info with the primary key could not be found
	 */
	public FireBrigadePremisesInfo remove(long fireBrigadePremisesInfoId)
		throws NoSuchFireBrigadePremisesInfoException;

	public FireBrigadePremisesInfo updateImpl(
		FireBrigadePremisesInfo fireBrigadePremisesInfo);

	/**
	 * Returns the fire brigade premises info with the primary key or throws a <code>NoSuchFireBrigadePremisesInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadePremisesInfoId the primary key of the fire brigade premises info
	 * @return the fire brigade premises info
	 * @throws NoSuchFireBrigadePremisesInfoException if a fire brigade premises info with the primary key could not be found
	 */
	public FireBrigadePremisesInfo findByPrimaryKey(
			long fireBrigadePremisesInfoId)
		throws NoSuchFireBrigadePremisesInfoException;

	/**
	 * Returns the fire brigade premises info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadePremisesInfoId the primary key of the fire brigade premises info
	 * @return the fire brigade premises info, or <code>null</code> if a fire brigade premises info with the primary key could not be found
	 */
	public FireBrigadePremisesInfo fetchByPrimaryKey(
		long fireBrigadePremisesInfoId);

	/**
	 * Returns all the fire brigade premises infos.
	 *
	 * @return the fire brigade premises infos
	 */
	public java.util.List<FireBrigadePremisesInfo> findAll();

	/**
	 * Returns a range of all the fire brigade premises infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePremisesInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade premises infos
	 * @param end the upper bound of the range of fire brigade premises infos (not inclusive)
	 * @return the range of fire brigade premises infos
	 */
	public java.util.List<FireBrigadePremisesInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade premises infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePremisesInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade premises infos
	 * @param end the upper bound of the range of fire brigade premises infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade premises infos
	 */
	public java.util.List<FireBrigadePremisesInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadePremisesInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade premises infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadePremisesInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade premises infos
	 * @param end the upper bound of the range of fire brigade premises infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade premises infos
	 */
	public java.util.List<FireBrigadePremisesInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadePremisesInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade premises infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade premises infos.
	 *
	 * @return the number of fire brigade premises infos
	 */
	public int countAll();

}