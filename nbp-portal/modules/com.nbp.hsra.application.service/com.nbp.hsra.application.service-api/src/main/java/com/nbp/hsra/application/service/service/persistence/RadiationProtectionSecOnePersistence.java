/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchRadiationProtectionSecOneException;
import com.nbp.hsra.application.service.model.RadiationProtectionSecOne;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the radiation protection sec one service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationProtectionSecOneUtil
 * @generated
 */
@ProviderType
public interface RadiationProtectionSecOnePersistence
	extends BasePersistence<RadiationProtectionSecOne> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RadiationProtectionSecOneUtil} to access the radiation protection sec one persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the radiation protection sec one where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationProtectionSecOneException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation protection sec one
	 * @throws NoSuchRadiationProtectionSecOneException if a matching radiation protection sec one could not be found
	 */
	public RadiationProtectionSecOne findBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationProtectionSecOneException;

	/**
	 * Returns the radiation protection sec one where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation protection sec one, or <code>null</code> if a matching radiation protection sec one could not be found
	 */
	public RadiationProtectionSecOne fetchBygetHsraById(long hsraApplicationId);

	/**
	 * Returns the radiation protection sec one where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation protection sec one, or <code>null</code> if a matching radiation protection sec one could not be found
	 */
	public RadiationProtectionSecOne fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache);

	/**
	 * Removes the radiation protection sec one where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation protection sec one that was removed
	 */
	public RadiationProtectionSecOne removeBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationProtectionSecOneException;

	/**
	 * Returns the number of radiation protection sec ones where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation protection sec ones
	 */
	public int countBygetHsraById(long hsraApplicationId);

	/**
	 * Caches the radiation protection sec one in the entity cache if it is enabled.
	 *
	 * @param radiationProtectionSecOne the radiation protection sec one
	 */
	public void cacheResult(
		RadiationProtectionSecOne radiationProtectionSecOne);

	/**
	 * Caches the radiation protection sec ones in the entity cache if it is enabled.
	 *
	 * @param radiationProtectionSecOnes the radiation protection sec ones
	 */
	public void cacheResult(
		java.util.List<RadiationProtectionSecOne> radiationProtectionSecOnes);

	/**
	 * Creates a new radiation protection sec one with the primary key. Does not add the radiation protection sec one to the database.
	 *
	 * @param radiationProtectSecOneId the primary key for the new radiation protection sec one
	 * @return the new radiation protection sec one
	 */
	public RadiationProtectionSecOne create(long radiationProtectSecOneId);

	/**
	 * Removes the radiation protection sec one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one that was removed
	 * @throws NoSuchRadiationProtectionSecOneException if a radiation protection sec one with the primary key could not be found
	 */
	public RadiationProtectionSecOne remove(long radiationProtectSecOneId)
		throws NoSuchRadiationProtectionSecOneException;

	public RadiationProtectionSecOne updateImpl(
		RadiationProtectionSecOne radiationProtectionSecOne);

	/**
	 * Returns the radiation protection sec one with the primary key or throws a <code>NoSuchRadiationProtectionSecOneException</code> if it could not be found.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one
	 * @throws NoSuchRadiationProtectionSecOneException if a radiation protection sec one with the primary key could not be found
	 */
	public RadiationProtectionSecOne findByPrimaryKey(
			long radiationProtectSecOneId)
		throws NoSuchRadiationProtectionSecOneException;

	/**
	 * Returns the radiation protection sec one with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationProtectSecOneId the primary key of the radiation protection sec one
	 * @return the radiation protection sec one, or <code>null</code> if a radiation protection sec one with the primary key could not be found
	 */
	public RadiationProtectionSecOne fetchByPrimaryKey(
		long radiationProtectSecOneId);

	/**
	 * Returns all the radiation protection sec ones.
	 *
	 * @return the radiation protection sec ones
	 */
	public java.util.List<RadiationProtectionSecOne> findAll();

	/**
	 * Returns a range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @return the range of radiation protection sec ones
	 */
	public java.util.List<RadiationProtectionSecOne> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation protection sec ones
	 */
	public java.util.List<RadiationProtectionSecOne> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RadiationProtectionSecOne> orderByComparator);

	/**
	 * Returns an ordered range of all the radiation protection sec ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationProtectionSecOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation protection sec ones
	 * @param end the upper bound of the range of radiation protection sec ones (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation protection sec ones
	 */
	public java.util.List<RadiationProtectionSecOne> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RadiationProtectionSecOne> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the radiation protection sec ones from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of radiation protection sec ones.
	 *
	 * @return the number of radiation protection sec ones
	 */
	public int countAll();

}