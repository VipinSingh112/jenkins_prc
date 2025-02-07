/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusBoardDecision;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status board decision service. This utility wraps <code>com.nbp.sez.status.application.stage.services.service.persistence.impl.SezStatusBoardDecisionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusBoardDecisionPersistence
 * @generated
 */
public class SezStatusBoardDecisionUtil {

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
		SezStatusBoardDecision sezStatusBoardDecision) {

		getPersistence().clearCache(sezStatusBoardDecision);
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
	public static Map<Serializable, SezStatusBoardDecision> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusBoardDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusBoardDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusBoardDecision> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusBoardDecision update(
		SezStatusBoardDecision sezStatusBoardDecision) {

		return getPersistence().update(sezStatusBoardDecision);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusBoardDecision update(
		SezStatusBoardDecision sezStatusBoardDecision,
		ServiceContext serviceContext) {

		return getPersistence().update(sezStatusBoardDecision, serviceContext);
	}

	/**
	 * Returns all the sez status board decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the sez status board decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of matching sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the sez status board decisions before and after the current sez status board decision in the ordered set where uuid = &#63;.
	 *
	 * @param sezStatusBoardId the primary key of the current sez status board decision
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	public static SezStatusBoardDecision[] findByUuid_PrevAndNext(
			long sezStatusBoardId, String uuid,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().findByUuid_PrevAndNext(
			sezStatusBoardId, uuid, orderByComparator);
	}

	/**
	 * Removes all the sez status board decisions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of sez status board decisions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status board decisions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the sez status board decision where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusBoardDecisionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision findByUUID_G(String uuid, long groupId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status board decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status board decision where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the sez status board decision where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status board decision that was removed
	 */
	public static SezStatusBoardDecision removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of sez status board decisions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status board decisions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of matching sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the sez status board decisions before and after the current sez status board decision in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStatusBoardId the primary key of the current sez status board decision
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	public static SezStatusBoardDecision[] findByUuid_C_PrevAndNext(
			long sezStatusBoardId, String uuid, long companyId,
			OrderByComparator<SezStatusBoardDecision> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			sezStatusBoardId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the sez status board decisions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of sez status board decisions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status board decisions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the sez status board decision where caseId = &#63; or throws a <code>NoSuchSezStatusBoardDecisionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision
			findBygetSezStatus_Board_Decision_By_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().findBygetSezStatus_Board_Decision_By_CI(caseId);
	}

	/**
	 * Returns the sez status board decision where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision
		fetchBygetSezStatus_Board_Decision_By_CI(String caseId) {

		return getPersistence().fetchBygetSezStatus_Board_Decision_By_CI(
			caseId);
	}

	/**
	 * Returns the sez status board decision where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status board decision, or <code>null</code> if a matching sez status board decision could not be found
	 */
	public static SezStatusBoardDecision
		fetchBygetSezStatus_Board_Decision_By_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatus_Board_Decision_By_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the sez status board decision where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status board decision that was removed
	 */
	public static SezStatusBoardDecision
			removeBygetSezStatus_Board_Decision_By_CI(String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().removeBygetSezStatus_Board_Decision_By_CI(
			caseId);
	}

	/**
	 * Returns the number of sez status board decisions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status board decisions
	 */
	public static int countBygetSezStatus_Board_Decision_By_CI(String caseId) {
		return getPersistence().countBygetSezStatus_Board_Decision_By_CI(
			caseId);
	}

	/**
	 * Caches the sez status board decision in the entity cache if it is enabled.
	 *
	 * @param sezStatusBoardDecision the sez status board decision
	 */
	public static void cacheResult(
		SezStatusBoardDecision sezStatusBoardDecision) {

		getPersistence().cacheResult(sezStatusBoardDecision);
	}

	/**
	 * Caches the sez status board decisions in the entity cache if it is enabled.
	 *
	 * @param sezStatusBoardDecisions the sez status board decisions
	 */
	public static void cacheResult(
		List<SezStatusBoardDecision> sezStatusBoardDecisions) {

		getPersistence().cacheResult(sezStatusBoardDecisions);
	}

	/**
	 * Creates a new sez status board decision with the primary key. Does not add the sez status board decision to the database.
	 *
	 * @param sezStatusBoardId the primary key for the new sez status board decision
	 * @return the new sez status board decision
	 */
	public static SezStatusBoardDecision create(long sezStatusBoardId) {
		return getPersistence().create(sezStatusBoardId);
	}

	/**
	 * Removes the sez status board decision with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision that was removed
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	public static SezStatusBoardDecision remove(long sezStatusBoardId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().remove(sezStatusBoardId);
	}

	public static SezStatusBoardDecision updateImpl(
		SezStatusBoardDecision sezStatusBoardDecision) {

		return getPersistence().updateImpl(sezStatusBoardDecision);
	}

	/**
	 * Returns the sez status board decision with the primary key or throws a <code>NoSuchSezStatusBoardDecisionException</code> if it could not be found.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision
	 * @throws NoSuchSezStatusBoardDecisionException if a sez status board decision with the primary key could not be found
	 */
	public static SezStatusBoardDecision findByPrimaryKey(long sezStatusBoardId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusBoardDecisionException {

		return getPersistence().findByPrimaryKey(sezStatusBoardId);
	}

	/**
	 * Returns the sez status board decision with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusBoardId the primary key of the sez status board decision
	 * @return the sez status board decision, or <code>null</code> if a sez status board decision with the primary key could not be found
	 */
	public static SezStatusBoardDecision fetchByPrimaryKey(
		long sezStatusBoardId) {

		return getPersistence().fetchByPrimaryKey(sezStatusBoardId);
	}

	/**
	 * Returns all the sez status board decisions.
	 *
	 * @return the sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @return the range of sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findAll(
		int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status board decisions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusBoardDecisionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status board decisions
	 * @param end the upper bound of the range of sez status board decisions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status board decisions
	 */
	public static List<SezStatusBoardDecision> findAll(
		int start, int end,
		OrderByComparator<SezStatusBoardDecision> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status board decisions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status board decisions.
	 *
	 * @return the number of sez status board decisions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusBoardDecisionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusBoardDecisionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusBoardDecisionPersistence _persistence;

}