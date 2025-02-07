/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.stage.service.model.MiningApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining application stages service. This utility wraps <code>com.nbp.mining.stage.service.service.persistence.impl.MiningApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationStagesPersistence
 * @generated
 */
public class MiningApplicationStagesUtil {

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
	public static void clearCache(
		MiningApplicationStages miningApplicationStages) {

		getPersistence().clearCache(miningApplicationStages);
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
	public static Map<Serializable, MiningApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningApplicationStages update(
		MiningApplicationStages miningApplicationStages) {

		return getPersistence().update(miningApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningApplicationStages update(
		MiningApplicationStages miningApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(miningApplicationStages, serviceContext);
	}

	/**
	 * Returns all the mining application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application stageses
	 */
	public static List<MiningApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the mining application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where uuid = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public static MiningApplicationStages[] findByUuid_PrevAndNext(
			long miningStagesId, String uuid,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			miningStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the mining application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of mining application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the mining application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mining application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mining application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the mining application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application stages that was removed
	 */
	public static MiningApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of mining application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application stageses
	 */
	public static List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public static MiningApplicationStages[] findByUuid_C_PrevAndNext(
			long miningStagesId, String uuid, long companyId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			miningStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the mining application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of mining application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the mining application stages where miningApplicationId = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findBygetMining_By_AI(
			long miningApplicationId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_AI(miningApplicationId);
	}

	/**
	 * Returns the mining application stages where miningApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_AI(
		long miningApplicationId) {

		return getPersistence().fetchBygetMining_By_AI(miningApplicationId);
	}

	/**
	 * Returns the mining application stages where miningApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miningApplicationId the mining application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_AI(
		long miningApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMining_By_AI(
			miningApplicationId, useFinderCache);
	}

	/**
	 * Removes the mining application stages where miningApplicationId = &#63; from the database.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the mining application stages that was removed
	 */
	public static MiningApplicationStages removeBygetMining_By_AI(
			long miningApplicationId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().removeBygetMining_By_AI(miningApplicationId);
	}

	/**
	 * Returns the number of mining application stageses where miningApplicationId = &#63;.
	 *
	 * @param miningApplicationId the mining application ID
	 * @return the number of matching mining application stageses
	 */
	public static int countBygetMining_By_AI(long miningApplicationId) {
		return getPersistence().countBygetMining_By_AI(miningApplicationId);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findBygetMining_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetMining_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetMining_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the mining application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the mining application stages that was removed
	 */
	public static MiningApplicationStages removeBygetMining_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().removeBygetMining_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching mining application stageses
	 */
	public static int countBygetMining_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetMining_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findBygetMining_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetMining_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetMining_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the mining application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the mining application stages that was removed
	 */
	public static MiningApplicationStages
			removeBygetMining_By_CaseIdStageStatus(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().removeBygetMining_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching mining application stageses
	 */
	public static int countBygetMining_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetMining_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findBygetMining_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetMining_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetMining_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the mining application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the mining application stages that was removed
	 */
	public static MiningApplicationStages removeBygetMining_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().removeBygetMining_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching mining application stageses
	 */
	public static int countBygetMining_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetMining_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the mining application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application stageses
	 */
	public static List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId) {

		return getPersistence().findBygetMining_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the mining application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetMining_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().findBygetMining_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findBygetMining_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMining_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findBygetMining_By_CaseId_First(
			String caseId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_CaseId_First(
		String caseId,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMining_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findBygetMining_By_CaseId_Last(
			String caseId,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_CaseId_Last(
		String caseId,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMining_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where caseId = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public static MiningApplicationStages[]
			findBygetMining_By_CaseId_PrevAndNext(
				long miningStagesId, String caseId,
				OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_CaseId_PrevAndNext(
			miningStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the mining application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetMining_By_CaseId(String caseId) {
		getPersistence().removeBygetMining_By_CaseId(caseId);
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application stageses
	 */
	public static int countBygetMining_By_CaseId(String caseId) {
		return getPersistence().countBygetMining_By_CaseId(caseId);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findBygetMiningBy_Case_Id(
			String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMiningBy_Case_Id(caseId);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMiningBy_Case_Id(
		String caseId) {

		return getPersistence().fetchBygetMiningBy_Case_Id(caseId);
	}

	/**
	 * Returns the mining application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMiningBy_Case_Id(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiningBy_Case_Id(
			caseId, useFinderCache);
	}

	/**
	 * Removes the mining application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application stages that was removed
	 */
	public static MiningApplicationStages removeBygetMiningBy_Case_Id(
			String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().removeBygetMiningBy_Case_Id(caseId);
	}

	/**
	 * Returns the number of mining application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application stageses
	 */
	public static int countBygetMiningBy_Case_Id(String caseId) {
		return getPersistence().countBygetMiningBy_Case_Id(caseId);
	}

	/**
	 * Returns all the mining application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching mining application stageses
	 */
	public static List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName) {

		return getPersistence().findBygetMining_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the mining application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetMining_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().findBygetMining_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application stageses
	 */
	public static List<MiningApplicationStages> findBygetMining_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMining_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findBygetMining_By_StageName_First(
			String stageName,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_StageName_First(
		String stageName,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMining_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages findBygetMining_By_StageName_Last(
			String stageName,
			OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application stages, or <code>null</code> if a matching mining application stages could not be found
	 */
	public static MiningApplicationStages fetchBygetMining_By_StageName_Last(
		String stageName,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMining_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the mining application stageses before and after the current mining application stages in the ordered set where stageName = &#63;.
	 *
	 * @param miningStagesId the primary key of the current mining application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public static MiningApplicationStages[]
			findBygetMining_By_StageName_PrevAndNext(
				long miningStagesId, String stageName,
				OrderByComparator<MiningApplicationStages> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findBygetMining_By_StageName_PrevAndNext(
			miningStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the mining application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetMining_By_StageName(String stageName) {
		getPersistence().removeBygetMining_By_StageName(stageName);
	}

	/**
	 * Returns the number of mining application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching mining application stageses
	 */
	public static int countBygetMining_By_StageName(String stageName) {
		return getPersistence().countBygetMining_By_StageName(stageName);
	}

	/**
	 * Caches the mining application stages in the entity cache if it is enabled.
	 *
	 * @param miningApplicationStages the mining application stages
	 */
	public static void cacheResult(
		MiningApplicationStages miningApplicationStages) {

		getPersistence().cacheResult(miningApplicationStages);
	}

	/**
	 * Caches the mining application stageses in the entity cache if it is enabled.
	 *
	 * @param miningApplicationStageses the mining application stageses
	 */
	public static void cacheResult(
		List<MiningApplicationStages> miningApplicationStageses) {

		getPersistence().cacheResult(miningApplicationStageses);
	}

	/**
	 * Creates a new mining application stages with the primary key. Does not add the mining application stages to the database.
	 *
	 * @param miningStagesId the primary key for the new mining application stages
	 * @return the new mining application stages
	 */
	public static MiningApplicationStages create(long miningStagesId) {
		return getPersistence().create(miningStagesId);
	}

	/**
	 * Removes the mining application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages that was removed
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public static MiningApplicationStages remove(long miningStagesId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().remove(miningStagesId);
	}

	public static MiningApplicationStages updateImpl(
		MiningApplicationStages miningApplicationStages) {

		return getPersistence().updateImpl(miningApplicationStages);
	}

	/**
	 * Returns the mining application stages with the primary key or throws a <code>NoSuchMiningApplicationStagesException</code> if it could not be found.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages
	 * @throws NoSuchMiningApplicationStagesException if a mining application stages with the primary key could not be found
	 */
	public static MiningApplicationStages findByPrimaryKey(long miningStagesId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationStagesException {

		return getPersistence().findByPrimaryKey(miningStagesId);
	}

	/**
	 * Returns the mining application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningStagesId the primary key of the mining application stages
	 * @return the mining application stages, or <code>null</code> if a mining application stages with the primary key could not be found
	 */
	public static MiningApplicationStages fetchByPrimaryKey(
		long miningStagesId) {

		return getPersistence().fetchByPrimaryKey(miningStagesId);
	}

	/**
	 * Returns all the mining application stageses.
	 *
	 * @return the mining application stageses
	 */
	public static List<MiningApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @return the range of mining application stageses
	 */
	public static List<MiningApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application stageses
	 */
	public static List<MiningApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application stageses
	 * @param end the upper bound of the range of mining application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application stageses
	 */
	public static List<MiningApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining application stageses.
	 *
	 * @return the number of mining application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningApplicationStagesPersistence _persistence;

}