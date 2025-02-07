/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.lease.application.service.exception.NoSuchMiningProspectingRightsException;
import com.nbp.mining.lease.application.service.model.MiningProspectingRights;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining prospecting rights service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingRightsUtil
 * @generated
 */
@ProviderType
public interface MiningProspectingRightsPersistence
	extends BasePersistence<MiningProspectingRights> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningProspectingRightsUtil} to access the mining prospecting rights persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the mining prospecting rights where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningProspectingRightsException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting rights
	 * @throws NoSuchMiningProspectingRightsException if a matching mining prospecting rights could not be found
	 */
	public MiningProspectingRights findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningProspectingRightsException;

	/**
	 * Returns the mining prospecting rights where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting rights, or <code>null</code> if a matching mining prospecting rights could not be found
	 */
	public MiningProspectingRights fetchBygetMiningById(
		long miningLeaseApplicationId);

	/**
	 * Returns the mining prospecting rights where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining prospecting rights, or <code>null</code> if a matching mining prospecting rights could not be found
	 */
	public MiningProspectingRights fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache);

	/**
	 * Removes the mining prospecting rights where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining prospecting rights that was removed
	 */
	public MiningProspectingRights removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningProspectingRightsException;

	/**
	 * Returns the number of mining prospecting rightses where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining prospecting rightses
	 */
	public int countBygetMiningById(long miningLeaseApplicationId);

	/**
	 * Caches the mining prospecting rights in the entity cache if it is enabled.
	 *
	 * @param miningProspectingRights the mining prospecting rights
	 */
	public void cacheResult(MiningProspectingRights miningProspectingRights);

	/**
	 * Caches the mining prospecting rightses in the entity cache if it is enabled.
	 *
	 * @param miningProspectingRightses the mining prospecting rightses
	 */
	public void cacheResult(
		java.util.List<MiningProspectingRights> miningProspectingRightses);

	/**
	 * Creates a new mining prospecting rights with the primary key. Does not add the mining prospecting rights to the database.
	 *
	 * @param prospectingRightsId the primary key for the new mining prospecting rights
	 * @return the new mining prospecting rights
	 */
	public MiningProspectingRights create(long prospectingRightsId);

	/**
	 * Removes the mining prospecting rights with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights that was removed
	 * @throws NoSuchMiningProspectingRightsException if a mining prospecting rights with the primary key could not be found
	 */
	public MiningProspectingRights remove(long prospectingRightsId)
		throws NoSuchMiningProspectingRightsException;

	public MiningProspectingRights updateImpl(
		MiningProspectingRights miningProspectingRights);

	/**
	 * Returns the mining prospecting rights with the primary key or throws a <code>NoSuchMiningProspectingRightsException</code> if it could not be found.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights
	 * @throws NoSuchMiningProspectingRightsException if a mining prospecting rights with the primary key could not be found
	 */
	public MiningProspectingRights findByPrimaryKey(long prospectingRightsId)
		throws NoSuchMiningProspectingRightsException;

	/**
	 * Returns the mining prospecting rights with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param prospectingRightsId the primary key of the mining prospecting rights
	 * @return the mining prospecting rights, or <code>null</code> if a mining prospecting rights with the primary key could not be found
	 */
	public MiningProspectingRights fetchByPrimaryKey(long prospectingRightsId);

	/**
	 * Returns all the mining prospecting rightses.
	 *
	 * @return the mining prospecting rightses
	 */
	public java.util.List<MiningProspectingRights> findAll();

	/**
	 * Returns a range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @return the range of mining prospecting rightses
	 */
	public java.util.List<MiningProspectingRights> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining prospecting rightses
	 */
	public java.util.List<MiningProspectingRights> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingRights> orderByComparator);

	/**
	 * Returns an ordered range of all the mining prospecting rightses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingRightsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting rightses
	 * @param end the upper bound of the range of mining prospecting rightses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining prospecting rightses
	 */
	public java.util.List<MiningProspectingRights> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingRights> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining prospecting rightses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining prospecting rightses.
	 *
	 * @return the number of mining prospecting rightses
	 */
	public int countAll();

}