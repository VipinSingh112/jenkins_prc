/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.mining.lease.application.service.exception.NoSuchMiningAppCurrentStageException;
import com.nbp.mining.lease.application.service.model.MiningAppCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the mining app current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppCurrentStageUtil
 * @generated
 */
@ProviderType
public interface MiningAppCurrentStagePersistence
	extends BasePersistence<MiningAppCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MiningAppCurrentStageUtil} to access the mining app current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the mining app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findByUuid(String uuid);

	/**
	 * Returns a range of all the mining app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @return the range of matching mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the mining app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the mining app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningAppCurrentStage> orderByComparator)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Returns the first mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the last mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningAppCurrentStage> orderByComparator)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Returns the last mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the mining app current stages before and after the current mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param miningAppCurrentStageId the primary key of the current mining app current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a mining app current stage with the primary key could not be found
	 */
	public MiningAppCurrentStage[] findByUuid_PrevAndNext(
			long miningAppCurrentStageId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningAppCurrentStage> orderByComparator)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Removes all the mining app current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of mining app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining app current stages
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the mining app current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningAppCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Returns the mining app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the mining app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the mining app current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining app current stage that was removed
	 */
	public MiningAppCurrentStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Returns the number of mining app current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining app current stages
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the mining app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the mining app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @return the range of matching mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the mining app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the mining app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first mining app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningAppCurrentStage> orderByComparator)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Returns the first mining app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the last mining app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningAppCurrentStage> orderByComparator)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Returns the last mining app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator);

	/**
	 * Returns the mining app current stages before and after the current mining app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningAppCurrentStageId the primary key of the current mining app current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a mining app current stage with the primary key could not be found
	 */
	public MiningAppCurrentStage[] findByUuid_C_PrevAndNext(
			long miningAppCurrentStageId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<MiningAppCurrentStage> orderByComparator)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Removes all the mining app current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of mining app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining app current stages
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the mining app current stage where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningAppCurrentStageException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage findBygetByMining_Stage(
			long miningLeaseApplicationId)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Returns the mining app current stage where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage fetchBygetByMining_Stage(
		long miningLeaseApplicationId);

	/**
	 * Returns the mining app current stage where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public MiningAppCurrentStage fetchBygetByMining_Stage(
		long miningLeaseApplicationId, boolean useFinderCache);

	/**
	 * Removes the mining app current stage where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining app current stage that was removed
	 */
	public MiningAppCurrentStage removeBygetByMining_Stage(
			long miningLeaseApplicationId)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Returns the number of mining app current stages where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining app current stages
	 */
	public int countBygetByMining_Stage(long miningLeaseApplicationId);

	/**
	 * Caches the mining app current stage in the entity cache if it is enabled.
	 *
	 * @param miningAppCurrentStage the mining app current stage
	 */
	public void cacheResult(MiningAppCurrentStage miningAppCurrentStage);

	/**
	 * Caches the mining app current stages in the entity cache if it is enabled.
	 *
	 * @param miningAppCurrentStages the mining app current stages
	 */
	public void cacheResult(
		java.util.List<MiningAppCurrentStage> miningAppCurrentStages);

	/**
	 * Creates a new mining app current stage with the primary key. Does not add the mining app current stage to the database.
	 *
	 * @param miningAppCurrentStageId the primary key for the new mining app current stage
	 * @return the new mining app current stage
	 */
	public MiningAppCurrentStage create(long miningAppCurrentStageId);

	/**
	 * Removes the mining app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningAppCurrentStageId the primary key of the mining app current stage
	 * @return the mining app current stage that was removed
	 * @throws NoSuchMiningAppCurrentStageException if a mining app current stage with the primary key could not be found
	 */
	public MiningAppCurrentStage remove(long miningAppCurrentStageId)
		throws NoSuchMiningAppCurrentStageException;

	public MiningAppCurrentStage updateImpl(
		MiningAppCurrentStage miningAppCurrentStage);

	/**
	 * Returns the mining app current stage with the primary key or throws a <code>NoSuchMiningAppCurrentStageException</code> if it could not be found.
	 *
	 * @param miningAppCurrentStageId the primary key of the mining app current stage
	 * @return the mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a mining app current stage with the primary key could not be found
	 */
	public MiningAppCurrentStage findByPrimaryKey(long miningAppCurrentStageId)
		throws NoSuchMiningAppCurrentStageException;

	/**
	 * Returns the mining app current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningAppCurrentStageId the primary key of the mining app current stage
	 * @return the mining app current stage, or <code>null</code> if a mining app current stage with the primary key could not be found
	 */
	public MiningAppCurrentStage fetchByPrimaryKey(
		long miningAppCurrentStageId);

	/**
	 * Returns all the mining app current stages.
	 *
	 * @return the mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findAll();

	/**
	 * Returns a range of all the mining app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @return the range of mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the mining app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator);

	/**
	 * Returns an ordered range of all the mining app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining app current stages
	 * @param end the upper bound of the range of mining app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining app current stages
	 */
	public java.util.List<MiningAppCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MiningAppCurrentStage>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the mining app current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of mining app current stages.
	 *
	 * @return the number of mining app current stages
	 */
	public int countAll();

}