/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeProEquipmentInfoException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeProEquipmentInfo;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade pro equipment info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeProEquipmentInfoUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeProEquipmentInfoPersistence
	extends BasePersistence<FireBrigadeProEquipmentInfo> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeProEquipmentInfoUtil} to access the fire brigade pro equipment info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade pro equipment info where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeProEquipmentInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade pro equipment info
	 * @throws NoSuchFireBrigadeProEquipmentInfoException if a matching fire brigade pro equipment info could not be found
	 */
	public FireBrigadeProEquipmentInfo findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeProEquipmentInfoException;

	/**
	 * Returns the fire brigade pro equipment info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade pro equipment info, or <code>null</code> if a matching fire brigade pro equipment info could not be found
	 */
	public FireBrigadeProEquipmentInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade pro equipment info where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade pro equipment info, or <code>null</code> if a matching fire brigade pro equipment info could not be found
	 */
	public FireBrigadeProEquipmentInfo fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache);

	/**
	 * Removes the fire brigade pro equipment info where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade pro equipment info that was removed
	 */
	public FireBrigadeProEquipmentInfo removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeProEquipmentInfoException;

	/**
	 * Returns the number of fire brigade pro equipment infos where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade pro equipment infos
	 */
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade pro equipment info in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeProEquipmentInfo the fire brigade pro equipment info
	 */
	public void cacheResult(
		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo);

	/**
	 * Caches the fire brigade pro equipment infos in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeProEquipmentInfos the fire brigade pro equipment infos
	 */
	public void cacheResult(
		java.util.List<FireBrigadeProEquipmentInfo>
			fireBrigadeProEquipmentInfos);

	/**
	 * Creates a new fire brigade pro equipment info with the primary key. Does not add the fire brigade pro equipment info to the database.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key for the new fire brigade pro equipment info
	 * @return the new fire brigade pro equipment info
	 */
	public FireBrigadeProEquipmentInfo create(
		long fireBrigadeProEquipmentInfoId);

	/**
	 * Removes the fire brigade pro equipment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info that was removed
	 * @throws NoSuchFireBrigadeProEquipmentInfoException if a fire brigade pro equipment info with the primary key could not be found
	 */
	public FireBrigadeProEquipmentInfo remove(
			long fireBrigadeProEquipmentInfoId)
		throws NoSuchFireBrigadeProEquipmentInfoException;

	public FireBrigadeProEquipmentInfo updateImpl(
		FireBrigadeProEquipmentInfo fireBrigadeProEquipmentInfo);

	/**
	 * Returns the fire brigade pro equipment info with the primary key or throws a <code>NoSuchFireBrigadeProEquipmentInfoException</code> if it could not be found.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info
	 * @throws NoSuchFireBrigadeProEquipmentInfoException if a fire brigade pro equipment info with the primary key could not be found
	 */
	public FireBrigadeProEquipmentInfo findByPrimaryKey(
			long fireBrigadeProEquipmentInfoId)
		throws NoSuchFireBrigadeProEquipmentInfoException;

	/**
	 * Returns the fire brigade pro equipment info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeProEquipmentInfoId the primary key of the fire brigade pro equipment info
	 * @return the fire brigade pro equipment info, or <code>null</code> if a fire brigade pro equipment info with the primary key could not be found
	 */
	public FireBrigadeProEquipmentInfo fetchByPrimaryKey(
		long fireBrigadeProEquipmentInfoId);

	/**
	 * Returns all the fire brigade pro equipment infos.
	 *
	 * @return the fire brigade pro equipment infos
	 */
	public java.util.List<FireBrigadeProEquipmentInfo> findAll();

	/**
	 * Returns a range of all the fire brigade pro equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeProEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade pro equipment infos
	 * @param end the upper bound of the range of fire brigade pro equipment infos (not inclusive)
	 * @return the range of fire brigade pro equipment infos
	 */
	public java.util.List<FireBrigadeProEquipmentInfo> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade pro equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeProEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade pro equipment infos
	 * @param end the upper bound of the range of fire brigade pro equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade pro equipment infos
	 */
	public java.util.List<FireBrigadeProEquipmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeProEquipmentInfo> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade pro equipment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeProEquipmentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade pro equipment infos
	 * @param end the upper bound of the range of fire brigade pro equipment infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade pro equipment infos
	 */
	public java.util.List<FireBrigadeProEquipmentInfo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeProEquipmentInfo> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade pro equipment infos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade pro equipment infos.
	 *
	 * @return the number of fire brigade pro equipment infos
	 */
	public int countAll();

}