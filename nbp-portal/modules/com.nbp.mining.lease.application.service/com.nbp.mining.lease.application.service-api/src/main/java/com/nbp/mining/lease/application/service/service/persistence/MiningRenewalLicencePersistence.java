/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.lease.application.service.exception.NoSuchMiningRenewalLicenceException;
import com.nbp.mining.lease.application.service.model.MiningRenewalLicence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining renewal licence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningRenewalLicenceUtil
 * @generated
 */
@ProviderType
public interface MiningRenewalLicencePersistence
	extends BasePersistence<MiningRenewalLicence> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningRenewalLicenceUtil} to access the mining renewal licence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the mining renewal licence where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningRenewalLicenceException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining renewal licence
	 * @throws NoSuchMiningRenewalLicenceException if a matching mining renewal licence could not be found
	 */
	public MiningRenewalLicence findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningRenewalLicenceException;

	/**
	 * Returns the mining renewal licence where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining renewal licence, or <code>null</code> if a matching mining renewal licence could not be found
	 */
	public MiningRenewalLicence fetchBygetMiningById(
		long miningLeaseApplicationId);

	/**
	 * Returns the mining renewal licence where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining renewal licence, or <code>null</code> if a matching mining renewal licence could not be found
	 */
	public MiningRenewalLicence fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache);

	/**
	 * Removes the mining renewal licence where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining renewal licence that was removed
	 */
	public MiningRenewalLicence removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningRenewalLicenceException;

	/**
	 * Returns the number of mining renewal licences where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining renewal licences
	 */
	public int countBygetMiningById(long miningLeaseApplicationId);

	/**
	 * Caches the mining renewal licence in the entity cache if it is enabled.
	 *
	 * @param miningRenewalLicence the mining renewal licence
	 */
	public void cacheResult(MiningRenewalLicence miningRenewalLicence);

	/**
	 * Caches the mining renewal licences in the entity cache if it is enabled.
	 *
	 * @param miningRenewalLicences the mining renewal licences
	 */
	public void cacheResult(
		java.util.List<MiningRenewalLicence> miningRenewalLicences);

	/**
	 * Creates a new mining renewal licence with the primary key. Does not add the mining renewal licence to the database.
	 *
	 * @param miningRenewalLicenceId the primary key for the new mining renewal licence
	 * @return the new mining renewal licence
	 */
	public MiningRenewalLicence create(long miningRenewalLicenceId);

	/**
	 * Removes the mining renewal licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence that was removed
	 * @throws NoSuchMiningRenewalLicenceException if a mining renewal licence with the primary key could not be found
	 */
	public MiningRenewalLicence remove(long miningRenewalLicenceId)
		throws NoSuchMiningRenewalLicenceException;

	public MiningRenewalLicence updateImpl(
		MiningRenewalLicence miningRenewalLicence);

	/**
	 * Returns the mining renewal licence with the primary key or throws a <code>NoSuchMiningRenewalLicenceException</code> if it could not be found.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence
	 * @throws NoSuchMiningRenewalLicenceException if a mining renewal licence with the primary key could not be found
	 */
	public MiningRenewalLicence findByPrimaryKey(long miningRenewalLicenceId)
		throws NoSuchMiningRenewalLicenceException;

	/**
	 * Returns the mining renewal licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningRenewalLicenceId the primary key of the mining renewal licence
	 * @return the mining renewal licence, or <code>null</code> if a mining renewal licence with the primary key could not be found
	 */
	public MiningRenewalLicence fetchByPrimaryKey(long miningRenewalLicenceId);

	/**
	 * Returns all the mining renewal licences.
	 *
	 * @return the mining renewal licences
	 */
	public java.util.List<MiningRenewalLicence> findAll();

	/**
	 * Returns a range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @return the range of mining renewal licences
	 */
	public java.util.List<MiningRenewalLicence> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining renewal licences
	 */
	public java.util.List<MiningRenewalLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningRenewalLicence>
			orderByComparator);

	/**
	 * Returns an ordered range of all the mining renewal licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningRenewalLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining renewal licences
	 * @param end the upper bound of the range of mining renewal licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining renewal licences
	 */
	public java.util.List<MiningRenewalLicence> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningRenewalLicence>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining renewal licences from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining renewal licences.
	 *
	 * @return the number of mining renewal licences
	 */
	public int countAll();

}