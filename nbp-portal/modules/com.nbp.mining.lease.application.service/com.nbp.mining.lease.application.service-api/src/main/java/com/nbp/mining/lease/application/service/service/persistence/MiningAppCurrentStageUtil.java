/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.lease.application.service.model.MiningAppCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining app current stage service. This utility wraps <code>com.nbp.mining.lease.application.service.service.persistence.impl.MiningAppCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningAppCurrentStagePersistence
 * @generated
 */
public class MiningAppCurrentStageUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(MiningAppCurrentStage miningAppCurrentStage) {
		getPersistence().clearCache(miningAppCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, MiningAppCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningAppCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningAppCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningAppCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningAppCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningAppCurrentStage update(
		MiningAppCurrentStage miningAppCurrentStage) {

		return getPersistence().update(miningAppCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningAppCurrentStage update(
		MiningAppCurrentStage miningAppCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(miningAppCurrentStage, serviceContext);
	}

	/**
	 * Returns all the mining app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining app current stages
	 */
	public static List<MiningAppCurrentStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<MiningAppCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<MiningAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningAppCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<MiningAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningAppCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<MiningAppCurrentStage> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage fetchByUuid_First(
		String uuid,
		OrderByComparator<MiningAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<MiningAppCurrentStage> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<MiningAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the mining app current stages before and after the current mining app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param miningAppCurrentStageId the primary key of the current mining app current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a mining app current stage with the primary key could not be found
	 */
	public static MiningAppCurrentStage[] findByUuid_PrevAndNext(
			long miningAppCurrentStageId, String uuid,
			OrderByComparator<MiningAppCurrentStage> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			miningAppCurrentStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the mining app current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of mining app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining app current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the mining app current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningAppCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mining app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mining app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the mining app current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining app current stage that was removed
	 */
	public static MiningAppCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of mining app current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining app current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the mining app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining app current stages
	 */
	public static List<MiningAppCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<MiningAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<MiningAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningAppCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<MiningAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningAppCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiningAppCurrentStage> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first mining app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiningAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mining app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiningAppCurrentStage> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mining app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiningAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static MiningAppCurrentStage[] findByUuid_C_PrevAndNext(
			long miningAppCurrentStageId, String uuid, long companyId,
			OrderByComparator<MiningAppCurrentStage> orderByComparator)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			miningAppCurrentStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the mining app current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of mining app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining app current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the mining app current stage where miningLeaseApplicationId = &#63; or throws a <code>NoSuchMiningAppCurrentStageException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage findBygetByMining_Stage(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().findBygetByMining_Stage(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the mining app current stage where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage fetchBygetByMining_Stage(
		long miningLeaseApplicationId) {

		return getPersistence().fetchBygetByMining_Stage(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the mining app current stage where miningLeaseApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining app current stage, or <code>null</code> if a matching mining app current stage could not be found
	 */
	public static MiningAppCurrentStage fetchBygetByMining_Stage(
		long miningLeaseApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetByMining_Stage(
			miningLeaseApplicationId, useFinderCache);
	}

	/**
	 * Removes the mining app current stage where miningLeaseApplicationId = &#63; from the database.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the mining app current stage that was removed
	 */
	public static MiningAppCurrentStage removeBygetByMining_Stage(
			long miningLeaseApplicationId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().removeBygetByMining_Stage(
			miningLeaseApplicationId);
	}

	/**
	 * Returns the number of mining app current stages where miningLeaseApplicationId = &#63;.
	 *
	 * @param miningLeaseApplicationId the mining lease application ID
	 * @return the number of matching mining app current stages
	 */
	public static int countBygetByMining_Stage(long miningLeaseApplicationId) {
		return getPersistence().countBygetByMining_Stage(
			miningLeaseApplicationId);
	}

	/**
	 * Caches the mining app current stage in the entity cache if it is enabled.
	 *
	 * @param miningAppCurrentStage the mining app current stage
	 */
	public static void cacheResult(
		MiningAppCurrentStage miningAppCurrentStage) {

		getPersistence().cacheResult(miningAppCurrentStage);
	}

	/**
	 * Caches the mining app current stages in the entity cache if it is enabled.
	 *
	 * @param miningAppCurrentStages the mining app current stages
	 */
	public static void cacheResult(
		List<MiningAppCurrentStage> miningAppCurrentStages) {

		getPersistence().cacheResult(miningAppCurrentStages);
	}

	/**
	 * Creates a new mining app current stage with the primary key. Does not add the mining app current stage to the database.
	 *
	 * @param miningAppCurrentStageId the primary key for the new mining app current stage
	 * @return the new mining app current stage
	 */
	public static MiningAppCurrentStage create(long miningAppCurrentStageId) {
		return getPersistence().create(miningAppCurrentStageId);
	}

	/**
	 * Removes the mining app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningAppCurrentStageId the primary key of the mining app current stage
	 * @return the mining app current stage that was removed
	 * @throws NoSuchMiningAppCurrentStageException if a mining app current stage with the primary key could not be found
	 */
	public static MiningAppCurrentStage remove(long miningAppCurrentStageId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().remove(miningAppCurrentStageId);
	}

	public static MiningAppCurrentStage updateImpl(
		MiningAppCurrentStage miningAppCurrentStage) {

		return getPersistence().updateImpl(miningAppCurrentStage);
	}

	/**
	 * Returns the mining app current stage with the primary key or throws a <code>NoSuchMiningAppCurrentStageException</code> if it could not be found.
	 *
	 * @param miningAppCurrentStageId the primary key of the mining app current stage
	 * @return the mining app current stage
	 * @throws NoSuchMiningAppCurrentStageException if a mining app current stage with the primary key could not be found
	 */
	public static MiningAppCurrentStage findByPrimaryKey(
			long miningAppCurrentStageId)
		throws com.nbp.mining.lease.application.service.exception.
			NoSuchMiningAppCurrentStageException {

		return getPersistence().findByPrimaryKey(miningAppCurrentStageId);
	}

	/**
	 * Returns the mining app current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningAppCurrentStageId the primary key of the mining app current stage
	 * @return the mining app current stage, or <code>null</code> if a mining app current stage with the primary key could not be found
	 */
	public static MiningAppCurrentStage fetchByPrimaryKey(
		long miningAppCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(miningAppCurrentStageId);
	}

	/**
	 * Returns all the mining app current stages.
	 *
	 * @return the mining app current stages
	 */
	public static List<MiningAppCurrentStage> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<MiningAppCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<MiningAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MiningAppCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<MiningAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MiningAppCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining app current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining app current stages.
	 *
	 * @return the number of mining app current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningAppCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningAppCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningAppCurrentStagePersistence _persistence;

}