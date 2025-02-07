/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.stage.service.model.MiningApplicationDueDiligence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining application due diligence service. This utility wraps <code>com.nbp.mining.stage.service.service.persistence.impl.MiningApplicationDueDiligencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDueDiligencePersistence
 * @generated
 */
public class MiningApplicationDueDiligenceUtil {

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
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		getPersistence().clearCache(miningApplicationDueDiligence);
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
	public static Map<Serializable, MiningApplicationDueDiligence>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningApplicationDueDiligence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningApplicationDueDiligence update(
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		return getPersistence().update(miningApplicationDueDiligence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningApplicationDueDiligence update(
		MiningApplicationDueDiligence miningApplicationDueDiligence,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miningApplicationDueDiligence, serviceContext);
	}

	/**
	 * Returns all the mining application due diligences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the mining application due diligences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence findByUuid_First(
			String uuid,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence fetchByUuid_First(
		String uuid,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence findByUuid_Last(
			String uuid,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence fetchByUuid_Last(
		String uuid,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the mining application due diligences before and after the current mining application due diligence in the ordered set where uuid = &#63;.
	 *
	 * @param miningDueDiliId the primary key of the current mining application due diligence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public static MiningApplicationDueDiligence[] findByUuid_PrevAndNext(
			long miningDueDiliId, String uuid,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findByUuid_PrevAndNext(
			miningDueDiliId, uuid, orderByComparator);
	}

	/**
	 * Removes all the mining application due diligences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of mining application due diligences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application due diligences
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the mining application due diligence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mining application due diligence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mining application due diligence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the mining application due diligence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application due diligence that was removed
	 */
	public static MiningApplicationDueDiligence removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of mining application due diligences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application due diligences
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the mining application due diligences before and after the current mining application due diligence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningDueDiliId the primary key of the current mining application due diligence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public static MiningApplicationDueDiligence[] findByUuid_C_PrevAndNext(
			long miningDueDiliId, String uuid, long companyId,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findByUuid_C_PrevAndNext(
			miningDueDiliId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the mining application due diligences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of mining application due diligences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application due diligences
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the mining application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence>
		findBygetMining_APP_List_By_CI(String caseId) {

		return getPersistence().findBygetMining_APP_List_By_CI(caseId);
	}

	/**
	 * Returns a range of all the mining application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence>
		findBygetMining_APP_List_By_CI(String caseId, int start, int end) {

		return getPersistence().findBygetMining_APP_List_By_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			OrderByComparator<MiningApplicationDueDiligence>
				orderByComparator) {

		return getPersistence().findBygetMining_APP_List_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetMining_APP_List_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence
			findBygetMining_APP_List_By_CI_First(
				String caseId,
				OrderByComparator<MiningApplicationDueDiligence>
					orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findBygetMining_APP_List_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence
		fetchBygetMining_APP_List_By_CI_First(
			String caseId,
			OrderByComparator<MiningApplicationDueDiligence>
				orderByComparator) {

		return getPersistence().fetchBygetMining_APP_List_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence
			findBygetMining_APP_List_By_CI_Last(
				String caseId,
				OrderByComparator<MiningApplicationDueDiligence>
					orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findBygetMining_APP_List_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence
		fetchBygetMining_APP_List_By_CI_Last(
			String caseId,
			OrderByComparator<MiningApplicationDueDiligence>
				orderByComparator) {

		return getPersistence().fetchBygetMining_APP_List_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the mining application due diligences before and after the current mining application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param miningDueDiliId the primary key of the current mining application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public static MiningApplicationDueDiligence[]
			findBygetMining_APP_List_By_CI_PrevAndNext(
				long miningDueDiliId, String caseId,
				OrderByComparator<MiningApplicationDueDiligence>
					orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findBygetMining_APP_List_By_CI_PrevAndNext(
			miningDueDiliId, caseId, orderByComparator);
	}

	/**
	 * Removes all the mining application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetMining_APP_List_By_CI(String caseId) {
		getPersistence().removeBygetMining_APP_List_By_CI(caseId);
	}

	/**
	 * Returns the number of mining application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application due diligences
	 */
	public static int countBygetMining_APP_List_By_CI(String caseId) {
		return getPersistence().countBygetMining_APP_List_By_CI(caseId);
	}

	/**
	 * Returns the mining application due diligence where caseId = &#63; or throws a <code>NoSuchMiningApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence findBygetMining_APP_By_CI(
			String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findBygetMining_APP_By_CI(caseId);
	}

	/**
	 * Returns the mining application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence fetchBygetMining_APP_By_CI(
		String caseId) {

		return getPersistence().fetchBygetMining_APP_By_CI(caseId);
	}

	/**
	 * Returns the mining application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application due diligence, or <code>null</code> if a matching mining application due diligence could not be found
	 */
	public static MiningApplicationDueDiligence fetchBygetMining_APP_By_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMining_APP_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the mining application due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application due diligence that was removed
	 */
	public static MiningApplicationDueDiligence removeBygetMining_APP_By_CI(
			String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().removeBygetMining_APP_By_CI(caseId);
	}

	/**
	 * Returns the number of mining application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application due diligences
	 */
	public static int countBygetMining_APP_By_CI(String caseId) {
		return getPersistence().countBygetMining_APP_By_CI(caseId);
	}

	/**
	 * Caches the mining application due diligence in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDueDiligence the mining application due diligence
	 */
	public static void cacheResult(
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		getPersistence().cacheResult(miningApplicationDueDiligence);
	}

	/**
	 * Caches the mining application due diligences in the entity cache if it is enabled.
	 *
	 * @param miningApplicationDueDiligences the mining application due diligences
	 */
	public static void cacheResult(
		List<MiningApplicationDueDiligence> miningApplicationDueDiligences) {

		getPersistence().cacheResult(miningApplicationDueDiligences);
	}

	/**
	 * Creates a new mining application due diligence with the primary key. Does not add the mining application due diligence to the database.
	 *
	 * @param miningDueDiliId the primary key for the new mining application due diligence
	 * @return the new mining application due diligence
	 */
	public static MiningApplicationDueDiligence create(long miningDueDiliId) {
		return getPersistence().create(miningDueDiliId);
	}

	/**
	 * Removes the mining application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence that was removed
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public static MiningApplicationDueDiligence remove(long miningDueDiliId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().remove(miningDueDiliId);
	}

	public static MiningApplicationDueDiligence updateImpl(
		MiningApplicationDueDiligence miningApplicationDueDiligence) {

		return getPersistence().updateImpl(miningApplicationDueDiligence);
	}

	/**
	 * Returns the mining application due diligence with the primary key or throws a <code>NoSuchMiningApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence
	 * @throws NoSuchMiningApplicationDueDiligenceException if a mining application due diligence with the primary key could not be found
	 */
	public static MiningApplicationDueDiligence findByPrimaryKey(
			long miningDueDiliId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationDueDiligenceException {

		return getPersistence().findByPrimaryKey(miningDueDiliId);
	}

	/**
	 * Returns the mining application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningDueDiliId the primary key of the mining application due diligence
	 * @return the mining application due diligence, or <code>null</code> if a mining application due diligence with the primary key could not be found
	 */
	public static MiningApplicationDueDiligence fetchByPrimaryKey(
		long miningDueDiliId) {

		return getPersistence().fetchByPrimaryKey(miningDueDiliId);
	}

	/**
	 * Returns all the mining application due diligences.
	 *
	 * @return the mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @return the range of mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application due diligences
	 * @param end the upper bound of the range of mining application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application due diligences
	 */
	public static List<MiningApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining application due diligences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining application due diligences.
	 *
	 * @return the number of mining application due diligences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningApplicationDueDiligencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiningApplicationDueDiligencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningApplicationDueDiligencePersistence
		_persistence;

}