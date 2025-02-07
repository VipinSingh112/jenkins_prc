/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.mining.stage.service.model.MiningApplicationMinisterialDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the mining application ministerial decision service. This utility wraps <code>com.nbp.mining.stage.service.service.persistence.impl.MiningApplicationMinisterialDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationMinisterialDecisionPersistence
 * @generated
 */
public class MiningApplicationMinisterialDecisionUtil {

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
		MiningApplicationMinisterialDecision
			miningApplicationMinisterialDecision) {

		getPersistence().clearCache(miningApplicationMinisterialDecision);
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
	public static Map<Serializable, MiningApplicationMinisterialDecision>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiningApplicationMinisterialDecision>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiningApplicationMinisterialDecision>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiningApplicationMinisterialDecision>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiningApplicationMinisterialDecision update(
		MiningApplicationMinisterialDecision
			miningApplicationMinisterialDecision) {

		return getPersistence().update(miningApplicationMinisterialDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiningApplicationMinisterialDecision update(
		MiningApplicationMinisterialDecision
			miningApplicationMinisterialDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(
			miningApplicationMinisterialDecision, serviceContext);
	}

	/**
	 * Returns all the mining application ministerial decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the mining application ministerial decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision findByUuid_First(
			String uuid,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision fetchByUuid_First(
		String uuid,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision findByUuid_Last(
			String uuid,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision fetchByUuid_Last(
		String uuid,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the mining application ministerial decisions before and after the current mining application ministerial decision in the ordered set where uuid = &#63;.
	 *
	 * @param miningDecId the primary key of the current mining application ministerial decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public static MiningApplicationMinisterialDecision[] findByUuid_PrevAndNext(
			long miningDecId, String uuid,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findByUuid_PrevAndNext(
			miningDecId, uuid, orderByComparator);
	}

	/**
	 * Removes all the mining application ministerial decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of mining application ministerial decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching mining application ministerial decisions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the mining application ministerial decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiningApplicationMinisterialDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mining application ministerial decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mining application ministerial decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the mining application ministerial decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the mining application ministerial decision that was removed
	 */
	public static MiningApplicationMinisterialDecision removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of mining application ministerial decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching mining application ministerial decisions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the mining application ministerial decisions before and after the current mining application ministerial decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miningDecId the primary key of the current mining application ministerial decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public static MiningApplicationMinisterialDecision[]
			findByUuid_C_PrevAndNext(
				long miningDecId, String uuid, long companyId,
				OrderByComparator<MiningApplicationMinisterialDecision>
					orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			miningDecId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the mining application ministerial decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of mining application ministerial decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching mining application ministerial decisions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the mining application ministerial decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision>
		findBygetMining_APP_List_By_CI(String caseId) {

		return getPersistence().findBygetMining_APP_List_By_CI(caseId);
	}

	/**
	 * Returns a range of all the mining application ministerial decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision>
		findBygetMining_APP_List_By_CI(String caseId, int start, int end) {

		return getPersistence().findBygetMining_APP_List_By_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator) {

		return getPersistence().findBygetMining_APP_List_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application ministerial decisions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision>
		findBygetMining_APP_List_By_CI(
			String caseId, int start, int end,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetMining_APP_List_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision
			findBygetMining_APP_List_By_CI_First(
				String caseId,
				OrderByComparator<MiningApplicationMinisterialDecision>
					orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findBygetMining_APP_List_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision
		fetchBygetMining_APP_List_By_CI_First(
			String caseId,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator) {

		return getPersistence().fetchBygetMining_APP_List_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision
			findBygetMining_APP_List_By_CI_Last(
				String caseId,
				OrderByComparator<MiningApplicationMinisterialDecision>
					orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findBygetMining_APP_List_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision
		fetchBygetMining_APP_List_By_CI_Last(
			String caseId,
			OrderByComparator<MiningApplicationMinisterialDecision>
				orderByComparator) {

		return getPersistence().fetchBygetMining_APP_List_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the mining application ministerial decisions before and after the current mining application ministerial decision in the ordered set where caseId = &#63;.
	 *
	 * @param miningDecId the primary key of the current mining application ministerial decision
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public static MiningApplicationMinisterialDecision[]
			findBygetMining_APP_List_By_CI_PrevAndNext(
				long miningDecId, String caseId,
				OrderByComparator<MiningApplicationMinisterialDecision>
					orderByComparator)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findBygetMining_APP_List_By_CI_PrevAndNext(
			miningDecId, caseId, orderByComparator);
	}

	/**
	 * Removes all the mining application ministerial decisions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetMining_APP_List_By_CI(String caseId) {
		getPersistence().removeBygetMining_APP_List_By_CI(caseId);
	}

	/**
	 * Returns the number of mining application ministerial decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application ministerial decisions
	 */
	public static int countBygetMining_APP_List_By_CI(String caseId) {
		return getPersistence().countBygetMining_APP_List_By_CI(caseId);
	}

	/**
	 * Returns the mining application ministerial decision where caseId = &#63; or throws a <code>NoSuchMiningApplicationMinisterialDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision
			findBygetMining_APP_By_CI(String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findBygetMining_APP_By_CI(caseId);
	}

	/**
	 * Returns the mining application ministerial decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision
		fetchBygetMining_APP_By_CI(String caseId) {

		return getPersistence().fetchBygetMining_APP_By_CI(caseId);
	}

	/**
	 * Returns the mining application ministerial decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining application ministerial decision, or <code>null</code> if a matching mining application ministerial decision could not be found
	 */
	public static MiningApplicationMinisterialDecision
		fetchBygetMining_APP_By_CI(String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMining_APP_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the mining application ministerial decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining application ministerial decision that was removed
	 */
	public static MiningApplicationMinisterialDecision
			removeBygetMining_APP_By_CI(String caseId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().removeBygetMining_APP_By_CI(caseId);
	}

	/**
	 * Returns the number of mining application ministerial decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining application ministerial decisions
	 */
	public static int countBygetMining_APP_By_CI(String caseId) {
		return getPersistence().countBygetMining_APP_By_CI(caseId);
	}

	/**
	 * Caches the mining application ministerial decision in the entity cache if it is enabled.
	 *
	 * @param miningApplicationMinisterialDecision the mining application ministerial decision
	 */
	public static void cacheResult(
		MiningApplicationMinisterialDecision
			miningApplicationMinisterialDecision) {

		getPersistence().cacheResult(miningApplicationMinisterialDecision);
	}

	/**
	 * Caches the mining application ministerial decisions in the entity cache if it is enabled.
	 *
	 * @param miningApplicationMinisterialDecisions the mining application ministerial decisions
	 */
	public static void cacheResult(
		List<MiningApplicationMinisterialDecision>
			miningApplicationMinisterialDecisions) {

		getPersistence().cacheResult(miningApplicationMinisterialDecisions);
	}

	/**
	 * Creates a new mining application ministerial decision with the primary key. Does not add the mining application ministerial decision to the database.
	 *
	 * @param miningDecId the primary key for the new mining application ministerial decision
	 * @return the new mining application ministerial decision
	 */
	public static MiningApplicationMinisterialDecision create(
		long miningDecId) {

		return getPersistence().create(miningDecId);
	}

	/**
	 * Removes the mining application ministerial decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision that was removed
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public static MiningApplicationMinisterialDecision remove(long miningDecId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().remove(miningDecId);
	}

	public static MiningApplicationMinisterialDecision updateImpl(
		MiningApplicationMinisterialDecision
			miningApplicationMinisterialDecision) {

		return getPersistence().updateImpl(
			miningApplicationMinisterialDecision);
	}

	/**
	 * Returns the mining application ministerial decision with the primary key or throws a <code>NoSuchMiningApplicationMinisterialDecisionException</code> if it could not be found.
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision
	 * @throws NoSuchMiningApplicationMinisterialDecisionException if a mining application ministerial decision with the primary key could not be found
	 */
	public static MiningApplicationMinisterialDecision findByPrimaryKey(
			long miningDecId)
		throws com.nbp.mining.stage.service.exception.
			NoSuchMiningApplicationMinisterialDecisionException {

		return getPersistence().findByPrimaryKey(miningDecId);
	}

	/**
	 * Returns the mining application ministerial decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningDecId the primary key of the mining application ministerial decision
	 * @return the mining application ministerial decision, or <code>null</code> if a mining application ministerial decision with the primary key could not be found
	 */
	public static MiningApplicationMinisterialDecision fetchByPrimaryKey(
		long miningDecId) {

		return getPersistence().fetchByPrimaryKey(miningDecId);
	}

	/**
	 * Returns all the mining application ministerial decisions.
	 *
	 * @return the mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the mining application ministerial decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @return the range of mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the mining application ministerial decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the mining application ministerial decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningApplicationMinisterialDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining application ministerial decisions
	 * @param end the upper bound of the range of mining application ministerial decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining application ministerial decisions
	 */
	public static List<MiningApplicationMinisterialDecision> findAll(
		int start, int end,
		OrderByComparator<MiningApplicationMinisterialDecision>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the mining application ministerial decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of mining application ministerial decisions.
	 *
	 * @return the number of mining application ministerial decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiningApplicationMinisterialDecisionPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		MiningApplicationMinisterialDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiningApplicationMinisterialDecisionPersistence
		_persistence;

}