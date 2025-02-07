/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.lease.application.service.exception.NoSuchMiningProspectingLicenseAddException;
import com.nbp.mining.lease.application.service.model.MiningProspectingLicenseAdd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining prospecting license add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningProspectingLicenseAddUtil
 * @generated
 */
@ProviderType
public interface MiningProspectingLicenseAddPersistence
	extends BasePersistence<MiningProspectingLicenseAdd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningProspectingLicenseAddUtil} to access the mining prospecting license add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining prospecting license adds
	 */
	public java.util.List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId);

	/**
	 * Returns a range of all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @return the range of matching mining prospecting license adds
	 */
	public java.util.List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining prospecting license adds
	 */
	public java.util.List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingLicenseAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining prospecting license adds
	 */
	public java.util.List<MiningProspectingLicenseAdd> findBygetMiningById(
		long miningLeaseApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingLicenseAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a matching mining prospecting license add could not be found
	 */
	public MiningProspectingLicenseAdd findBygetMiningById_First(
			long miningLeaseApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningProspectingLicenseAdd> orderByComparator)
		throws NoSuchMiningProspectingLicenseAddException;

	/**
	 * Returns the first mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining prospecting license add, or <code>null</code> if a matching mining prospecting license add could not be found
	 */
	public MiningProspectingLicenseAdd fetchBygetMiningById_First(
		long miningLeaseApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingLicenseAdd> orderByComparator);

	/**
	 * Returns the last mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a matching mining prospecting license add could not be found
	 */
	public MiningProspectingLicenseAdd findBygetMiningById_Last(
			long miningLeaseApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningProspectingLicenseAdd> orderByComparator)
		throws NoSuchMiningProspectingLicenseAddException;

	/**
	 * Returns the last mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining prospecting license add, or <code>null</code> if a matching mining prospecting license add could not be found
	 */
	public MiningProspectingLicenseAdd fetchBygetMiningById_Last(
		long miningLeaseApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingLicenseAdd> orderByComparator);

	/**
	 * Returns the mining prospecting license adds before and after the current mining prospecting license add in the ordered set where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the current mining prospecting license add
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	public MiningProspectingLicenseAdd[] findBygetMiningById_PrevAndNext(
			long miningProspectingLicenseAddId, long miningLeaseApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningProspectingLicenseAdd> orderByComparator)
		throws NoSuchMiningProspectingLicenseAddException;

	/**
	 * Removes all the mining prospecting license adds where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 */
	public void removeBygetMiningById(long miningLeaseApplicationId);

	/**
	 * Returns the number of mining prospecting license adds where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining prospecting license adds
	 */
	public int countBygetMiningById(long miningLeaseApplicationId);

	/**
	 * Caches the mining prospecting license add in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicenseAdd the mining prospecting license add
	 */
	public void cacheResult(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd);

	/**
	 * Caches the mining prospecting license adds in the entity cache if it is enabled.
	 *
	 * @param miningProspectingLicenseAdds the mining prospecting license adds
	 */
	public void cacheResult(
		java.util.List<MiningProspectingLicenseAdd>
			miningProspectingLicenseAdds);

	/**
	 * Creates a new mining prospecting license add with the primary key. Does not add the mining prospecting license add to the database.
	 *
	 * @param miningProspectingLicenseAddId the primary key for the new mining prospecting license add
	 * @return the new mining prospecting license add
	 */
	public MiningProspectingLicenseAdd create(
		long miningProspectingLicenseAddId);

	/**
	 * Removes the mining prospecting license add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add that was removed
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	public MiningProspectingLicenseAdd remove(
			long miningProspectingLicenseAddId)
		throws NoSuchMiningProspectingLicenseAddException;

	public MiningProspectingLicenseAdd updateImpl(
		MiningProspectingLicenseAdd miningProspectingLicenseAdd);

	/**
	 * Returns the mining prospecting license add with the primary key or throws a <code>NoSuchMiningProspectingLicenseAddException</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add
	 * @throws NoSuchMiningProspectingLicenseAddException if a mining prospecting license add with the primary key could not be found
	 */
	public MiningProspectingLicenseAdd findByPrimaryKey(
			long miningProspectingLicenseAddId)
		throws NoSuchMiningProspectingLicenseAddException;

	/**
	 * Returns the mining prospecting license add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningProspectingLicenseAddId the primary key of the mining prospecting license add
	 * @return the mining prospecting license add, or <code>null</code> if a mining prospecting license add with the primary key could not be found
	 */
	public MiningProspectingLicenseAdd fetchByPrimaryKey(
		long miningProspectingLicenseAddId);

	/**
	 * Returns all the mining prospecting license adds.
	 *
	 * @return the mining prospecting license adds
	 */
	public java.util.List<MiningProspectingLicenseAdd> findAll();

	/**
	 * Returns a range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @return the range of mining prospecting license adds
	 */
	public java.util.List<MiningProspectingLicenseAdd> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining prospecting license adds
	 */
	public java.util.List<MiningProspectingLicenseAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingLicenseAdd> orderByComparator);

	/**
	 * Returns an ordered range of all the mining prospecting license adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningProspectingLicenseAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining prospecting license adds
	 * @param end the upper bound of the range of mining prospecting license adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining prospecting license adds
	 */
	public java.util.List<MiningProspectingLicenseAdd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningProspectingLicenseAdd> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining prospecting license adds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining prospecting license adds.
	 *
	 * @return the number of mining prospecting license adds
	 */
	public int countAll();

}