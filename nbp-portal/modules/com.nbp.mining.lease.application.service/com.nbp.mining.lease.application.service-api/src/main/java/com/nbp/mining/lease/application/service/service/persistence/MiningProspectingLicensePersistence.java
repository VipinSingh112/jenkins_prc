/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.lease.application.service.exception.NoSuchMiningProspectingLicenseException;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicense;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining prospecting license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseUtil
 * @generated
 */
@ProviderType
public interface MiningProspectingLicensePersistence
	extends BasePersistence<MiningProspectingLicense> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningProspectingLicenseUtil} to access the mining prospecting license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the mining prospecting license where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningProspectingLicenseException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting license
	 * @throws NoSuchMiningProspectingLicenseException if a matching mining prospecting license could not be found
	 */
	public MiningProspectingLicense findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningProspectingLicenseException;

	/**
	 * Returns the mining prospecting license where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting license, or <code>null</code> if a matching mining prospecting license could not be found
	 */
	public MiningProspectingLicense fetchBygetMiningById(
		long miningLeaseApplicationId);

	/**
	 * Returns the mining prospecting license where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining prospecting license, or <code>null</code> if a matching mining prospecting license could not be found
	 */
	public MiningProspectingLicense fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache);

	/**
	 * Removes the mining prospecting license where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining prospecting license that was removed
	 */
	public MiningProspectingLicense removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningProspectingLicenseException;

	/**
	 * Returns the number of mining prospecting licenses where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining prospecting licenses
	 */
	public int countBygetMiningById(long miningLeaseApplicationId);

	/**
	 * Caches the mining prospecting license in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicense the mining prospecting license
	 */
	public void cacheResult(MiningProspectingLicense miningProspectingLicense);

	/**
	 * Caches the mining prospecting licenses in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicenses the mining prospecting licenses
	 */
	public void cacheResult(
		java.util.List<MiningProspectingLicense> miningProspectingLicenses);

	/**
	 * Creates a new mining prospecting license with the primary key. Does not add the mining prospecting license to the database.
	 *
	 * @param miningProspectingLicenseId the primary key for the new mining prospecting license
	 * @return the new mining prospecting license
	 */
	public MiningProspectingLicense create(long miningProspectingLicenseId);

	/**
	 * Removes the mining prospecting license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license that was removed
	 * @throws NoSuchMiningProspectingLicenseException if a mining prospecting license with the primary key could not be found
	 */
	public MiningProspectingLicense remove(long miningProspectingLicenseId)
		throws NoSuchMiningProspectingLicenseException;

	public MiningProspectingLicense updateImpl(
		MiningProspectingLicense miningProspectingLicense);

	/**
	 * Returns the mining prospecting license with the primary key or throws a <code>NoSuchMiningProspectingLicenseException</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license
	 * @throws NoSuchMiningProspectingLicenseException if a mining prospecting license with the primary key could not be found
	 */
	public MiningProspectingLicense findByPrimaryKey(
			long miningProspectingLicenseId)
		throws NoSuchMiningProspectingLicenseException;

	/**
	 * Returns the mining prospecting license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseId the primary key of the mining prospecting license
	 * @return the mining prospecting license, or <code>null</code> if a mining prospecting license with the primary key could not be found
	 */
	public MiningProspectingLicense fetchByPrimaryKey(
		long miningProspectingLicenseId);

	/**
	 * Returns all the mining prospecting licenses.
	 *
	 * @return the mining prospecting licenses
	 */
	public java.util.List<MiningProspectingLicense> findAll();

	/**
	 * Returns a range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @return the range of mining prospecting licenses
	 */
	public java.util.List<MiningProspectingLicense> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining prospecting licenses
	 */
	public java.util.List<MiningProspectingLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingLicense> orderByComparator);

	/**
	 * Returns an ordered range of all the mining prospecting licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting licenses
	 * @param end the upper bound of the range of mining prospecting licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining prospecting licenses
	 */
	public java.util.List<MiningProspectingLicense> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingLicense> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining prospecting licenses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining prospecting licenses.
	 *
	 * @return the number of mining prospecting licenses
	 */
	public int countAll();

}