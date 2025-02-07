/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.lease.application.service.exception.NoSuchMiningExclusiveLicFormFiveException;
import com.nbp.mining.lease.application.service.model.MiningExclusiveLicFormFive;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining exclusive lic form five service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningExclusiveLicFormFiveUtil
 * @generated
 */
@ProviderType
public interface MiningExclusiveLicFormFivePersistence
	extends BasePersistence<MiningExclusiveLicFormFive> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningExclusiveLicFormFiveUtil} to access the mining exclusive lic form five persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the mining exclusive lic form five where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningExclusiveLicFormFiveException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining exclusive lic form five
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a matching mining exclusive lic form five could not be found
	 */
	public MiningExclusiveLicFormFive findBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningExclusiveLicFormFiveException;

	/**
	 * Returns the mining exclusive lic form five where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining exclusive lic form five, or <code>null</code> if a matching mining exclusive lic form five could not be found
	 */
	public MiningExclusiveLicFormFive fetchBygetMiningById(
		long miningLeaseApplicationId);

	/**
	 * Returns the mining exclusive lic form five where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining exclusive lic form five, or <code>null</code> if a matching mining exclusive lic form five could not be found
	 */
	public MiningExclusiveLicFormFive fetchBygetMiningById(
		long miningLeaseApplicationId, boolean useFinderCache);

	/**
	 * Removes the mining exclusive lic form five where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining exclusive lic form five that was removed
	 */
	public MiningExclusiveLicFormFive removeBygetMiningById(
			long miningLeaseApplicationId)
		throws NoSuchMiningExclusiveLicFormFiveException;

	/**
	 * Returns the number of mining exclusive lic form fives where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining exclusive lic form fives
	 */
	public int countBygetMiningById(long miningLeaseApplicationId);

	/**
	 * Caches the mining exclusive lic form five in the entity cache if it is enabled.
	 *
	 * @param miningExclusiveLicFormFive the mining exclusive lic form five
	 */
	public void cacheResult(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive);

	/**
	 * Caches the mining exclusive lic form fives in the entity cache if it is enabled.
	 *
	 * @param miningExclusiveLicFormFives the mining exclusive lic form fives
	 */
	public void cacheResult(
		java.util.List<MiningExclusiveLicFormFive> miningExclusiveLicFormFives);

	/**
	 * Creates a new mining exclusive lic form five with the primary key. Does not add the mining exclusive lic form five to the database.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key for the new mining exclusive lic form five
	 * @return the new mining exclusive lic form five
	 */
	public MiningExclusiveLicFormFive create(long miningExclusiveLicFormFiveId);

	/**
	 * Removes the mining exclusive lic form five with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five that was removed
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a mining exclusive lic form five with the primary key could not be found
	 */
	public MiningExclusiveLicFormFive remove(long miningExclusiveLicFormFiveId)
		throws NoSuchMiningExclusiveLicFormFiveException;

	public MiningExclusiveLicFormFive updateImpl(
		MiningExclusiveLicFormFive miningExclusiveLicFormFive);

	/**
	 * Returns the mining exclusive lic form five with the primary key or throws a <code>NoSuchMiningExclusiveLicFormFiveException</code> if it could not be found.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five
	 * @throws NoSuchMiningExclusiveLicFormFiveException if a mining exclusive lic form five with the primary key could not be found
	 */
	public MiningExclusiveLicFormFive findByPrimaryKey(
			long miningExclusiveLicFormFiveId)
		throws NoSuchMiningExclusiveLicFormFiveException;

	/**
	 * Returns the mining exclusive lic form five with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningExclusiveLicFormFiveId the primary key of the mining exclusive lic form five
	 * @return the mining exclusive lic form five, or <code>null</code> if a mining exclusive lic form five with the primary key could not be found
	 */
	public MiningExclusiveLicFormFive fetchByPrimaryKey(
		long miningExclusiveLicFormFiveId);

	/**
	 * Returns all the mining exclusive lic form fives.
	 *
	 * @return the mining exclusive lic form fives
	 */
	public java.util.List<MiningExclusiveLicFormFive> findAll();

	/**
	 * Returns a range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @return the range of mining exclusive lic form fives
	 */
	public java.util.List<MiningExclusiveLicFormFive> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining exclusive lic form fives
	 */
	public java.util.List<MiningExclusiveLicFormFive> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningExclusiveLicFormFive> orderByComparator);

	/**
	 * Returns an ordered range of all the mining exclusive lic form fives.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningExclusiveLicFormFiveModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining exclusive lic form fives
	 * @param end the upper bound of the range of mining exclusive lic form fives (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining exclusive lic form fives
	 */
	public java.util.List<MiningExclusiveLicFormFive> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<MiningExclusiveLicFormFive> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining exclusive lic form fives from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining exclusive lic form fives.
	 *
	 * @return the number of mining exclusive lic form fives
	 */
	public int countAll();

}