/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeOperatorDetailException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade operator detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeOperatorDetailUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeOperatorDetailPersistence
	extends BasePersistence<FireBrigadeOperatorDetail> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeOperatorDetailUtil} to access the fire brigade operator detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the fire brigade operator detail where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeOperatorDetailException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade operator detail
	 * @throws NoSuchFireBrigadeOperatorDetailException if a matching fire brigade operator detail could not be found
	 */
	public FireBrigadeOperatorDetail findBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeOperatorDetailException;

	/**
	 * Returns the fire brigade operator detail where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade operator detail, or <code>null</code> if a matching fire brigade operator detail could not be found
	 */
	public FireBrigadeOperatorDetail fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId);

	/**
	 * Returns the fire brigade operator detail where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade operator detail, or <code>null</code> if a matching fire brigade operator detail could not be found
	 */
	public FireBrigadeOperatorDetail fetchBygetFireBrigadeByAppId(
		long fireBrigadeApplicationId, boolean useFinderCache);

	/**
	 * Removes the fire brigade operator detail where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade operator detail that was removed
	 */
	public FireBrigadeOperatorDetail removeBygetFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeOperatorDetailException;

	/**
	 * Returns the number of fire brigade operator details where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade operator details
	 */
	public int countBygetFireBrigadeByAppId(long fireBrigadeApplicationId);

	/**
	 * Caches the fire brigade operator detail in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeOperatorDetail the fire brigade operator detail
	 */
	public void cacheResult(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail);

	/**
	 * Caches the fire brigade operator details in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeOperatorDetails the fire brigade operator details
	 */
	public void cacheResult(
		java.util.List<FireBrigadeOperatorDetail> fireBrigadeOperatorDetails);

	/**
	 * Creates a new fire brigade operator detail with the primary key. Does not add the fire brigade operator detail to the database.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key for the new fire brigade operator detail
	 * @return the new fire brigade operator detail
	 */
	public FireBrigadeOperatorDetail create(long fireBrigadeOperatorDetailId);

	/**
	 * Removes the fire brigade operator detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail that was removed
	 * @throws NoSuchFireBrigadeOperatorDetailException if a fire brigade operator detail with the primary key could not be found
	 */
	public FireBrigadeOperatorDetail remove(long fireBrigadeOperatorDetailId)
		throws NoSuchFireBrigadeOperatorDetailException;

	public FireBrigadeOperatorDetail updateImpl(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail);

	/**
	 * Returns the fire brigade operator detail with the primary key or throws a <code>NoSuchFireBrigadeOperatorDetailException</code> if it could not be found.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail
	 * @throws NoSuchFireBrigadeOperatorDetailException if a fire brigade operator detail with the primary key could not be found
	 */
	public FireBrigadeOperatorDetail findByPrimaryKey(
			long fireBrigadeOperatorDetailId)
		throws NoSuchFireBrigadeOperatorDetailException;

	/**
	 * Returns the fire brigade operator detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail, or <code>null</code> if a fire brigade operator detail with the primary key could not be found
	 */
	public FireBrigadeOperatorDetail fetchByPrimaryKey(
		long fireBrigadeOperatorDetailId);

	/**
	 * Returns all the fire brigade operator details.
	 *
	 * @return the fire brigade operator details
	 */
	public java.util.List<FireBrigadeOperatorDetail> findAll();

	/**
	 * Returns a range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @return the range of fire brigade operator details
	 */
	public java.util.List<FireBrigadeOperatorDetail> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade operator details
	 */
	public java.util.List<FireBrigadeOperatorDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeOperatorDetail> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade operator details
	 */
	public java.util.List<FireBrigadeOperatorDetail> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FireBrigadeOperatorDetail> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade operator details from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade operator details.
	 *
	 * @return the number of fire brigade operator details
	 */
	public int countAll();

}