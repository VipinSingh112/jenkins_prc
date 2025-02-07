/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeCerPurposeInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade cer purpose info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCerPurposeInfoUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeCerPurposeInfoPersistence
	extends BasePersistence<FireBrigadeCerPurposeInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeCerPurposeInfoUtil} to access the fire brigade cer purpose info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade cer purpose info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeCerPurposeInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade cer purpose info
	 * @throws NoSuchFireBrigadeCerPurposeInfoException if a matching fire brigade cer purpose info could not be found
	 */
	public FireBrigadeCerPurposeInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeCerPurposeInfoException;

	/**
	 * Returns the fire brigade cer purpose info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade cer purpose info, or <code>null</code> if a matching fire brigade cer purpose info could not be found
	 */
	public FireBrigadeCerPurposeInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade cer purpose info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade cer purpose info, or <code>null</code> if a matching fire brigade cer purpose info could not be found
	 */
	public FireBrigadeCerPurposeInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache);

	/**
	 * Removes the fire brigade cer purpose info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade cer purpose info that was removed
	 */
	public FireBrigadeCerPurposeInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeCerPurposeInfoException;

	/**
	 * Returns the number of fire brigade cer purpose infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade cer purpose infos
	 */
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade cer purpose info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCerPurposeInfo the fire brigade cer purpose info
	 */
	public void cacheResult(
		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo);

	/**
	 * Caches the fire brigade cer purpose infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCerPurposeInfos the fire brigade cer purpose infos
	 */
	public void cacheResult(
		java.util.List<FireBrigadeCerPurposeInfo> fireBrigadeCerPurposeInfos);

	/**
	 * Creates a new fire brigade cer purpose info with the primary key. Does not add the fire brigade cer purpose info to the database.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key for the new fire brigade cer purpose info
	 * @return the new fire brigade cer purpose info
	 */
	public FireBrigadeCerPurposeInfo create(long fireBrigadeCerPurposeInfoId);

	/**
	 * Removes the fire brigade cer purpose info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info that was removed
	 * @throws NoSuchFireBrigadeCerPurposeInfoException if a fire brigade cer purpose info with the primary key could not be found
	 */
	public FireBrigadeCerPurposeInfo remove(long fireBrigadeCerPurposeInfoId)
		throws NoSuchFireBrigadeCerPurposeInfoException;

	public FireBrigadeCerPurposeInfo updateImpl(
		FireBrigadeCerPurposeInfo fireBrigadeCerPurposeInfo);

	/**
	 * Returns the fire brigade cer purpose info with the primary key or throws a <code>NoSuchFireBrigadeCerPurposeInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info
	 * @throws NoSuchFireBrigadeCerPurposeInfoException if a fire brigade cer purpose info with the primary key could not be found
	 */
	public FireBrigadeCerPurposeInfo findByPrimaryKey(
			long fireBrigadeCerPurposeInfoId)
		throws NoSuchFireBrigadeCerPurposeInfoException;

	/**
	 * Returns the fire brigade cer purpose info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeCerPurposeInfoId the primary key of the fire brigade cer purpose info
	 * @return the fire brigade cer purpose info, or <code>null</code> if a fire brigade cer purpose info with the primary key could not be found
	 */
	public FireBrigadeCerPurposeInfo fetchByPrimaryKey(
		long fireBrigadeCerPurposeInfoId);

	/**
	 * Returns all the fire brigade cer purpose infos.
	 *
	 * @return the fire brigade cer purpose infos
	 */
	public java.util.List<FireBrigadeCerPurposeInfo> findAll();

	/**
	 * Returns a range of all the fire brigade cer purpose infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCerPurposeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade cer purpose infos
	 * @param end the upper bound of the range of fire brigade cer purpose infos (not inclusive)
	 * @return the range of fire brigade cer purpose infos
	 */
	public java.util.List<FireBrigadeCerPurposeInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade cer purpose infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCerPurposeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade cer purpose infos
	 * @param end the upper bound of the range of fire brigade cer purpose infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade cer purpose infos
	 */
	public java.util.List<FireBrigadeCerPurposeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeCerPurposeInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade cer purpose infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCerPurposeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade cer purpose infos
	 * @param end the upper bound of the range of fire brigade cer purpose infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade cer purpose infos
	 */
	public java.util.List<FireBrigadeCerPurposeInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeCerPurposeInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade cer purpose infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade cer purpose infos.
	 *
	 * @return the number of fire brigade cer purpose infos
	 */
	public int countAll();

}