/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.stage.service.model.HealthApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health application stages service. This utility wraps <code>com.nbp.healthcare.stage.service.service.persistence.impl.HealthApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthApplicationStagesPersistence
 * @generated
 */
public class HealthApplicationStagesUtil {

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
		HealthApplicationStages healthApplicationStages) {

		getPersistence().clearCache(healthApplicationStages);
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
	public static Map<Serializable, HealthApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthApplicationStages update(
		HealthApplicationStages healthApplicationStages) {

		return getPersistence().update(healthApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthApplicationStages update(
		HealthApplicationStages healthApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(healthApplicationStages, serviceContext);
	}

	/**
	 * Returns all the health application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching health application stageses
	 */
	public static List<HealthApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the health application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages[] findByUuid_PrevAndNext(
			long healthApplicationStagesId, String uuid,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			healthApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the health application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of health application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching health application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the health application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the health application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the health application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the health application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the health application stages that was removed
	 */
	public static HealthApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of health application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching health application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching health application stageses
	 */
	public static List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages[] findByUuid_C_PrevAndNext(
			long healthApplicationStagesId, String uuid, long companyId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			healthApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the health application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching health application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the health application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId) {

		return getPersistence().findBygetHAS_BY_CI(caseId);
	}

	/**
	 * Returns a range of all the health application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetHAS_BY_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the health application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().findBygetHAS_BY_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHAS_BY_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_CI_First(
			String caseId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_CI_First(
		String caseId,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHAS_BY_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_CI_Last(
			String caseId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_CI_Last(
		String caseId,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHAS_BY_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages[] findBygetHAS_BY_CI_PrevAndNext(
			long healthApplicationStagesId, String caseId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_CI_PrevAndNext(
			healthApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the health application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetHAS_BY_CI(String caseId) {
		getPersistence().removeBygetHAS_BY_CI(caseId);
	}

	/**
	 * Returns the number of health application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health application stageses
	 */
	public static int countBygetHAS_BY_CI(String caseId) {
		return getPersistence().countBygetHAS_BY_CI(caseId);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_CI_SN(
			String caseId, String stageName)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_CI_SN(
		String caseId, String stageName) {

		return getPersistence().fetchBygetHAS_BY_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_CI_SN(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetHAS_BY_CI_SN(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the health application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the health application stages that was removed
	 */
	public static HealthApplicationStages removeBygetHAS_BY_CI_SN(
			String caseId, String stageName)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().removeBygetHAS_BY_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the number of health application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching health application stageses
	 */
	public static int countBygetHAS_BY_CI_SN(String caseId, String stageName) {
		return getPersistence().countBygetHAS_BY_CI_SN(caseId, stageName);
	}

	/**
	 * Returns all the health application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName) {

		return getPersistence().findBygetHAS_BY_StageName(stageName);
	}

	/**
	 * Returns a range of all the health application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetHAS_BY_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().findBygetHAS_BY_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHAS_BY_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_StageName_First(
			String stageName,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_StageName_First(
		String stageName,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHAS_BY_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_StageName_Last(
			String stageName,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_StageName_Last(
		String stageName,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHAS_BY_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages[]
			findBygetHAS_BY_StageName_PrevAndNext(
				long healthApplicationStagesId, String stageName,
				OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_StageName_PrevAndNext(
			healthApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the health application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetHAS_BY_StageName(String stageName) {
		getPersistence().removeBygetHAS_BY_StageName(stageName);
	}

	/**
	 * Returns the number of health application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching health application stageses
	 */
	public static int countBygetHAS_BY_StageName(String stageName) {
		return getPersistence().countBygetHAS_BY_StageName(stageName);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_CI_ST(
			String caseId, String stageStatus)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_CI_ST(caseId, stageStatus);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_CI_ST(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetHAS_BY_CI_ST(caseId, stageStatus);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_CI_ST(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetHAS_BY_CI_ST(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the health application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the health application stages that was removed
	 */
	public static HealthApplicationStages removeBygetHAS_BY_CI_ST(
			String caseId, String stageStatus)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().removeBygetHAS_BY_CI_ST(caseId, stageStatus);
	}

	/**
	 * Returns the number of health application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching health application stageses
	 */
	public static int countBygetHAS_BY_CI_ST(
		String caseId, String stageStatus) {

		return getPersistence().countBygetHAS_BY_CI_ST(caseId, stageStatus);
	}

	/**
	 * Returns all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus) {

		return getPersistence().findBygetHAS_BY_SN_SS(stageName, stageStatus);
	}

	/**
	 * Returns a range of all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetHAS_BY_SN_SS(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().findBygetHAS_BY_SN_SS(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	public static List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHAS_BY_SN_SS(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_SN_SS_First(
			String stageName, String stageStatus,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_SN_SS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_SN_SS_First(
		String stageName, String stageStatus,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHAS_BY_SN_SS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_SN_SS_Last(
			String stageName, String stageStatus,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_SN_SS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_SN_SS_Last(
		String stageName, String stageStatus,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHAS_BY_SN_SS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages[] findBygetHAS_BY_SN_SS_PrevAndNext(
			long healthApplicationStagesId, String stageName,
			String stageStatus,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_SN_SS_PrevAndNext(
			healthApplicationStagesId, stageName, stageStatus,
			orderByComparator);
	}

	/**
	 * Removes all the health application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetHAS_BY_SN_SS(
		String stageName, String stageStatus) {

		getPersistence().removeBygetHAS_BY_SN_SS(stageName, stageStatus);
	}

	/**
	 * Returns the number of health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching health application stageses
	 */
	public static int countBygetHAS_BY_SN_SS(
		String stageName, String stageStatus) {

		return getPersistence().countBygetHAS_BY_SN_SS(stageName, stageStatus);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_CI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_CI_ST_SN(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_CI_ST_SN(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetHAS_BY_CI_ST_SN(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_CI_ST_SN(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetHAS_BY_CI_ST_SN(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the health application stages that was removed
	 */
	public static HealthApplicationStages removeBygetHAS_BY_CI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().removeBygetHAS_BY_CI_ST_SN(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of health application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching health application stageses
	 */
	public static int countBygetHAS_BY_CI_ST_SN(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetHAS_BY_CI_ST_SN(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the health application stages where healthApplicationId = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	public static HealthApplicationStages findBygetHAS_BY_FAI(
			long healthApplicationId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findBygetHAS_BY_FAI(healthApplicationId);
	}

	/**
	 * Returns the health application stages where healthApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_FAI(
		long healthApplicationId) {

		return getPersistence().fetchBygetHAS_BY_FAI(healthApplicationId);
	}

	/**
	 * Returns the health application stages where healthApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthApplicationId the health application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	public static HealthApplicationStages fetchBygetHAS_BY_FAI(
		long healthApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHAS_BY_FAI(
			healthApplicationId, useFinderCache);
	}

	/**
	 * Removes the health application stages where healthApplicationId = &#63; from the database.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the health application stages that was removed
	 */
	public static HealthApplicationStages removeBygetHAS_BY_FAI(
			long healthApplicationId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().removeBygetHAS_BY_FAI(healthApplicationId);
	}

	/**
	 * Returns the number of health application stageses where healthApplicationId = &#63;.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the number of matching health application stageses
	 */
	public static int countBygetHAS_BY_FAI(long healthApplicationId) {
		return getPersistence().countBygetHAS_BY_FAI(healthApplicationId);
	}

	/**
	 * Caches the health application stages in the entity cache if it is enabled.
	 *
	 * @param healthApplicationStages the health application stages
	 */
	public static void cacheResult(
		HealthApplicationStages healthApplicationStages) {

		getPersistence().cacheResult(healthApplicationStages);
	}

	/**
	 * Caches the health application stageses in the entity cache if it is enabled.
	 *
	 * @param healthApplicationStageses the health application stageses
	 */
	public static void cacheResult(
		List<HealthApplicationStages> healthApplicationStageses) {

		getPersistence().cacheResult(healthApplicationStageses);
	}

	/**
	 * Creates a new health application stages with the primary key. Does not add the health application stages to the database.
	 *
	 * @param healthApplicationStagesId the primary key for the new health application stages
	 * @return the new health application stages
	 */
	public static HealthApplicationStages create(
		long healthApplicationStagesId) {

		return getPersistence().create(healthApplicationStagesId);
	}

	/**
	 * Removes the health application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages that was removed
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages remove(long healthApplicationStagesId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().remove(healthApplicationStagesId);
	}

	public static HealthApplicationStages updateImpl(
		HealthApplicationStages healthApplicationStages) {

		return getPersistence().updateImpl(healthApplicationStages);
	}

	/**
	 * Returns the health application stages with the primary key or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages findByPrimaryKey(
			long healthApplicationStagesId)
		throws com.nbp.healthcare.stage.service.exception.
			NoSuchHealthApplicationStagesException {

		return getPersistence().findByPrimaryKey(healthApplicationStagesId);
	}

	/**
	 * Returns the health application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages, or <code>null</code> if a health application stages with the primary key could not be found
	 */
	public static HealthApplicationStages fetchByPrimaryKey(
		long healthApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(healthApplicationStagesId);
	}

	/**
	 * Returns all the health application stageses.
	 *
	 * @return the health application stageses
	 */
	public static List<HealthApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of health application stageses
	 */
	public static List<HealthApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health application stageses
	 */
	public static List<HealthApplicationStages> findAll(
		int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health application stageses
	 */
	public static List<HealthApplicationStages> findAll(
		int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health application stageses.
	 *
	 * @return the number of health application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthApplicationStagesPersistence _persistence;

}