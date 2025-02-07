/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.stages.service.model.ExplosiveCommisionDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the explosive commision decision service. This utility wraps <code>com.nbp.explosives.competency.stages.service.service.persistence.impl.ExplosiveCommisionDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveCommisionDecisionPersistence
 * @generated
 */
public class ExplosiveCommisionDecisionUtil {

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
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		getPersistence().clearCache(explosiveCommisionDecision);
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
	public static Map<Serializable, ExplosiveCommisionDecision>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExplosiveCommisionDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExplosiveCommisionDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExplosiveCommisionDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExplosiveCommisionDecision update(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		return getPersistence().update(explosiveCommisionDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExplosiveCommisionDecision update(
		ExplosiveCommisionDecision explosiveCommisionDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(
			explosiveCommisionDecision, serviceContext);
	}

	/**
	 * Returns all the explosive commision decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the explosive commision decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of matching explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision findByUuid_First(
			String uuid,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the explosive commision decisions before and after the current explosive commision decision in the ordered set where uuid = &#63;.
	 *
	 * @param commisiondecId the primary key of the current explosive commision decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	public static ExplosiveCommisionDecision[] findByUuid_PrevAndNext(
			long commisiondecId, String uuid,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().findByUuid_PrevAndNext(
			commisiondecId, uuid, orderByComparator);
	}

	/**
	 * Removes all the explosive commision decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of explosive commision decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive commision decisions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the explosive commision decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveCommisionDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosive commision decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosive commision decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the explosive commision decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive commision decision that was removed
	 */
	public static ExplosiveCommisionDecision removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of explosive commision decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive commision decisions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of matching explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the explosive commision decisions before and after the current explosive commision decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param commisiondecId the primary key of the current explosive commision decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	public static ExplosiveCommisionDecision[] findByUuid_C_PrevAndNext(
			long commisiondecId, String uuid, long companyId,
			OrderByComparator<ExplosiveCommisionDecision> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			commisiondecId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the explosive commision decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of explosive commision decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive commision decisions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the explosive commision decision where caseId = &#63; or throws a <code>NoSuchExplosiveCommisionDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision findBygetEXP_CD_CI(String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().findBygetEXP_CD_CI(caseId);
	}

	/**
	 * Returns the explosive commision decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision fetchBygetEXP_CD_CI(
		String caseId) {

		return getPersistence().fetchBygetEXP_CD_CI(caseId);
	}

	/**
	 * Returns the explosive commision decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive commision decision, or <code>null</code> if a matching explosive commision decision could not be found
	 */
	public static ExplosiveCommisionDecision fetchBygetEXP_CD_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetEXP_CD_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the explosive commision decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive commision decision that was removed
	 */
	public static ExplosiveCommisionDecision removeBygetEXP_CD_CI(String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().removeBygetEXP_CD_CI(caseId);
	}

	/**
	 * Returns the number of explosive commision decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive commision decisions
	 */
	public static int countBygetEXP_CD_CI(String caseId) {
		return getPersistence().countBygetEXP_CD_CI(caseId);
	}

	/**
	 * Caches the explosive commision decision in the entity cache if it is enabled.
	 *
	 * @param explosiveCommisionDecision the explosive commision decision
	 */
	public static void cacheResult(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		getPersistence().cacheResult(explosiveCommisionDecision);
	}

	/**
	 * Caches the explosive commision decisions in the entity cache if it is enabled.
	 *
	 * @param explosiveCommisionDecisions the explosive commision decisions
	 */
	public static void cacheResult(
		List<ExplosiveCommisionDecision> explosiveCommisionDecisions) {

		getPersistence().cacheResult(explosiveCommisionDecisions);
	}

	/**
	 * Creates a new explosive commision decision with the primary key. Does not add the explosive commision decision to the database.
	 *
	 * @param commisiondecId the primary key for the new explosive commision decision
	 * @return the new explosive commision decision
	 */
	public static ExplosiveCommisionDecision create(long commisiondecId) {
		return getPersistence().create(commisiondecId);
	}

	/**
	 * Removes the explosive commision decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision that was removed
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	public static ExplosiveCommisionDecision remove(long commisiondecId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().remove(commisiondecId);
	}

	public static ExplosiveCommisionDecision updateImpl(
		ExplosiveCommisionDecision explosiveCommisionDecision) {

		return getPersistence().updateImpl(explosiveCommisionDecision);
	}

	/**
	 * Returns the explosive commision decision with the primary key or throws a <code>NoSuchExplosiveCommisionDecisionException</code> if it could not be found.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision
	 * @throws NoSuchExplosiveCommisionDecisionException if a explosive commision decision with the primary key could not be found
	 */
	public static ExplosiveCommisionDecision findByPrimaryKey(
			long commisiondecId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveCommisionDecisionException {

		return getPersistence().findByPrimaryKey(commisiondecId);
	}

	/**
	 * Returns the explosive commision decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param commisiondecId the primary key of the explosive commision decision
	 * @return the explosive commision decision, or <code>null</code> if a explosive commision decision with the primary key could not be found
	 */
	public static ExplosiveCommisionDecision fetchByPrimaryKey(
		long commisiondecId) {

		return getPersistence().fetchByPrimaryKey(commisiondecId);
	}

	/**
	 * Returns all the explosive commision decisions.
	 *
	 * @return the explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @return the range of explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findAll(
		int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive commision decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveCommisionDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive commision decisions
	 * @param end the upper bound of the range of explosive commision decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive commision decisions
	 */
	public static List<ExplosiveCommisionDecision> findAll(
		int start, int end,
		OrderByComparator<ExplosiveCommisionDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the explosive commision decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of explosive commision decisions.
	 *
	 * @return the number of explosive commision decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExplosiveCommisionDecisionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ExplosiveCommisionDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ExplosiveCommisionDecisionPersistence _persistence;

}