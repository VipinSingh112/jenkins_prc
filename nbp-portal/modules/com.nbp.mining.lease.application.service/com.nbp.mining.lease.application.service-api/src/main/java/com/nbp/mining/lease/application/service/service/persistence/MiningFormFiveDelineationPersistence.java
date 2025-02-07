/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.lease.application.service.exception.NoSuchMiningFormFiveDelineationException;
import com.nbp.mining.lease.application.service.model.MiningFormFiveDelineation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining form five delineation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningFormFiveDelineationUtil
 * @generated
 */
@ProviderType
public interface MiningFormFiveDelineationPersistence
	extends BasePersistence<MiningFormFiveDelineation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningFormFiveDelineationUtil} to access the mining form five delineation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the mining form five delineation where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningFormFiveDelineationException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining form five delineation
	 * @throws NoSuchMiningFormFiveDelineationException if a matching mining form five delineation could not be found
	 */
	public MiningFormFiveDelineation findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningFormFiveDelineationException;

	/**
	 * Returns the mining form five delineation where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining form five delineation, or <code>null</code> if a matching mining form five delineation could not be found
	 */
	public MiningFormFiveDelineation fetchBygetMiningById(
		long miningLeaseApplicationId);

	/**
	 * Returns the mining form five delineation where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining form five delineation, or <code>null</code> if a matching mining form five delineation could not be found
	 */
	public MiningFormFiveDelineation fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache);

	/**
	 * Removes the mining form five delineation where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining form five delineation that was removed
	 */
	public MiningFormFiveDelineation removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningFormFiveDelineationException;

	/**
	 * Returns the number of mining form five delineations where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining form five delineations
	 */
	public int countBygetMiningById(long miningLeaseApplicationId);

	/**
	 * Caches the mining form five delineation in the entity cache if it is enabled.
	 *
	 * @param miningFormFiveDelineation the mining form five delineation
	 */
	public void cacheResult(
		MiningFormFiveDelineation miningFormFiveDelineation);

	/**
	 * Caches the mining form five delineations in the entity cache if it is enabled.
	 *
	 * @param miningFormFiveDelineations the mining form five delineations
	 */
	public void cacheResult(
		java.util.List<MiningFormFiveDelineation> miningFormFiveDelineations);

	/**
	 * Creates a new mining form five delineation with the primary key. Does not add the mining form five delineation to the database.
	 *
	 * @param miningFormFiveDelineationId the primary key for the new mining form five delineation
	 * @return the new mining form five delineation
	 */
	public MiningFormFiveDelineation create(long miningFormFiveDelineationId);

	/**
	 * Removes the mining form five delineation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation that was removed
	 * @throws NoSuchMiningFormFiveDelineationException if a mining form five delineation with the primary key could not be found
	 */
	public MiningFormFiveDelineation remove(long miningFormFiveDelineationId)
		throws NoSuchMiningFormFiveDelineationException;

	public MiningFormFiveDelineation updateImpl(
		MiningFormFiveDelineation miningFormFiveDelineation);

	/**
	 * Returns the mining form five delineation with the primary key or throws a <code>NoSuchMiningFormFiveDelineationException</code> if it could not be found.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation
	 * @throws NoSuchMiningFormFiveDelineationException if a mining form five delineation with the primary key could not be found
	 */
	public MiningFormFiveDelineation findByPrimaryKey(
			long miningFormFiveDelineationId)
		throws NoSuchMiningFormFiveDelineationException;

	/**
	 * Returns the mining form five delineation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningFormFiveDelineationId the primary key of the mining form five delineation
	 * @return the mining form five delineation, or <code>null</code> if a mining form five delineation with the primary key could not be found
	 */
	public MiningFormFiveDelineation fetchByPrimaryKey(
		long miningFormFiveDelineationId);

	/**
	 * Returns all the mining form five delineations.
	 *
	 * @return the mining form five delineations
	 */
	public java.util.List<MiningFormFiveDelineation> findAll();

	/**
	 * Returns a range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @return the range of mining form five delineations
	 */
	public java.util.List<MiningFormFiveDelineation> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining form five delineations
	 */
	public java.util.List<MiningFormFiveDelineation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningFormFiveDelineation> orderByComparator);

	/**
	 * Returns an ordered range of all the mining form five delineations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningFormFiveDelineationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining form five delineations
	 * @param end the upper bound of the range of mining form five delineations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining form five delineations
	 */
	public java.util.List<MiningFormFiveDelineation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningFormFiveDelineation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining form five delineations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining form five delineations.
	 *
	 * @return the number of mining form five delineations
	 */
	public int countAll();

}