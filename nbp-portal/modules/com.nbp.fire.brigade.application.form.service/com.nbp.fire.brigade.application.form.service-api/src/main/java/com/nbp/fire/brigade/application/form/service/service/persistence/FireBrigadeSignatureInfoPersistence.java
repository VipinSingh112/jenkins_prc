/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeSignatureInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeSignatureInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade signature info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeSignatureInfoUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeSignatureInfoPersistence
	extends BasePersistence<FireBrigadeSignatureInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeSignatureInfoUtil} to access the fire brigade signature info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade signature info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeSignatureInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade signature info
	 * @throws NoSuchFireBrigadeSignatureInfoException if a matching fire brigade signature info could not be found
	 */
	public FireBrigadeSignatureInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeSignatureInfoException;

	/**
	 * Returns the fire brigade signature info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade signature info, or <code>null</code> if a matching fire brigade signature info could not be found
	 */
	public FireBrigadeSignatureInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade signature info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade signature info, or <code>null</code> if a matching fire brigade signature info could not be found
	 */
	public FireBrigadeSignatureInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache);

	/**
	 * Removes the fire brigade signature info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade signature info that was removed
	 */
	public FireBrigadeSignatureInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeSignatureInfoException;

	/**
	 * Returns the number of fire brigade signature infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade signature infos
	 */
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade signature info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeSignatureInfo the fire brigade signature info
	 */
	public void cacheResult(FireBrigadeSignatureInfo fireBrigadeSignatureInfo);

	/**
	 * Caches the fire brigade signature infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeSignatureInfos the fire brigade signature infos
	 */
	public void cacheResult(
		java.util.List<FireBrigadeSignatureInfo> fireBrigadeSignatureInfos);

	/**
	 * Creates a new fire brigade signature info with the primary key. Does not add the fire brigade signature info to the database.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key for the new fire brigade signature info
	 * @return the new fire brigade signature info
	 */
	public FireBrigadeSignatureInfo create(long fireBrigadeSignatureInfoId);

	/**
	 * Removes the fire brigade signature info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info that was removed
	 * @throws NoSuchFireBrigadeSignatureInfoException if a fire brigade signature info with the primary key could not be found
	 */
	public FireBrigadeSignatureInfo remove(long fireBrigadeSignatureInfoId)
		throws NoSuchFireBrigadeSignatureInfoException;

	public FireBrigadeSignatureInfo updateImpl(
		FireBrigadeSignatureInfo fireBrigadeSignatureInfo);

	/**
	 * Returns the fire brigade signature info with the primary key or throws a <code>NoSuchFireBrigadeSignatureInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info
	 * @throws NoSuchFireBrigadeSignatureInfoException if a fire brigade signature info with the primary key could not be found
	 */
	public FireBrigadeSignatureInfo findByPrimaryKey(
			long fireBrigadeSignatureInfoId)
		throws NoSuchFireBrigadeSignatureInfoException;

	/**
	 * Returns the fire brigade signature info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeSignatureInfoId the primary key of the fire brigade signature info
	 * @return the fire brigade signature info, or <code>null</code> if a fire brigade signature info with the primary key could not be found
	 */
	public FireBrigadeSignatureInfo fetchByPrimaryKey(
		long fireBrigadeSignatureInfoId);

	/**
	 * Returns all the fire brigade signature infos.
	 *
	 * @return the fire brigade signature infos
	 */
	public java.util.List<FireBrigadeSignatureInfo> findAll();

	/**
	 * Returns a range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @return the range of fire brigade signature infos
	 */
	public java.util.List<FireBrigadeSignatureInfo> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade signature infos
	 */
	public java.util.List<FireBrigadeSignatureInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeSignatureInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade signature infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeSignatureInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade signature infos
	 * @param end the upper bound of the range of fire brigade signature infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade signature infos
	 */
	public java.util.List<FireBrigadeSignatureInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeSignatureInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade signature infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade signature infos.
	 *
	 * @return the number of fire brigade signature infos
	 */
	public int countAll();

}