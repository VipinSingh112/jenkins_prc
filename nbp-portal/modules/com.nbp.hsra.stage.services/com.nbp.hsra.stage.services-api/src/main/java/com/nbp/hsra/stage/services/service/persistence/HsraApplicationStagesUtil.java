/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.stage.services.model.HsraApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the hsra application stages service. This utility wraps <code>com.nbp.hsra.stage.services.service.persistence.impl.HsraApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationStagesPersistence
 * @generated
 */
public class HsraApplicationStagesUtil {

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
	public static void clearCache(HsraApplicationStages hsraApplicationStages) {
		getPersistence().clearCache(hsraApplicationStages);
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
	public static Map<Serializable, HsraApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HsraApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HsraApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HsraApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HsraApplicationStages update(
		HsraApplicationStages hsraApplicationStages) {

		return getPersistence().update(hsraApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HsraApplicationStages update(
		HsraApplicationStages hsraApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(hsraApplicationStages, serviceContext);
	}

	/**
	 * Returns all the hsra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the hsra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public static HsraApplicationStages[] findByUuid_PrevAndNext(
			long hsraApplicationStagesId, String uuid,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			hsraApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the hsra application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of hsra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching hsra application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the hsra application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findByUUID_G(String uuid, long groupId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the hsra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the hsra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the hsra application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the hsra application stages that was removed
	 */
	public static HsraApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of hsra application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching hsra application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public static HsraApplicationStages[] findByUuid_C_PrevAndNext(
			long hsraApplicationStagesId, String uuid, long companyId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			hsraApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the hsra application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching hsra application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the hsra application stages where hsraApplicationId = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findBygetHsra_By_AI(
			long hsraApplicationId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_AI(hsraApplicationId);
	}

	/**
	 * Returns the hsra application stages where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_AI(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsra_By_AI(hsraApplicationId);
	}

	/**
	 * Returns the hsra application stages where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_AI(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsra_By_AI(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the hsra application stages where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application stages that was removed
	 */
	public static HsraApplicationStages removeBygetHsra_By_AI(
			long hsraApplicationId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().removeBygetHsra_By_AI(hsraApplicationId);
	}

	/**
	 * Returns the number of hsra application stageses where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application stageses
	 */
	public static int countBygetHsra_By_AI(long hsraApplicationId) {
		return getPersistence().countBygetHsra_By_AI(hsraApplicationId);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findBygetHsra_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetHsra_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetHsra_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the hsra application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the hsra application stages that was removed
	 */
	public static HsraApplicationStages removeBygetHsra_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().removeBygetHsra_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching hsra application stageses
	 */
	public static int countBygetHsra_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetHsra_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findBygetHsra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetHsra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetHsra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the hsra application stages that was removed
	 */
	public static HsraApplicationStages removeBygetHsra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().removeBygetHsra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching hsra application stageses
	 */
	public static int countBygetHsra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetHsra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findBygetHsra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetHsra_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetHsra_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the hsra application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the hsra application stages that was removed
	 */
	public static HsraApplicationStages removeBygetHsra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().removeBygetHsra_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching hsra application stageses
	 */
	public static int countBygetHsra_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetHsra_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the hsra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId) {

		return getPersistence().findBygetHsra_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the hsra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetHsra_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().findBygetHsra_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsra_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findBygetHsra_By_CaseId_First(
			String caseId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_CaseId_First(
		String caseId,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHsra_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findBygetHsra_By_CaseId_Last(
			String caseId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_CaseId_Last(
		String caseId,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHsra_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public static HsraApplicationStages[] findBygetHsra_By_CaseId_PrevAndNext(
			long hsraApplicationStagesId, String caseId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_CaseId_PrevAndNext(
			hsraApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the hsra application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetHsra_By_CaseId(String caseId) {
		getPersistence().removeBygetHsra_By_CaseId(caseId);
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application stageses
	 */
	public static int countBygetHsra_By_CaseId(String caseId) {
		return getPersistence().countBygetHsra_By_CaseId(caseId);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findBygetHsraApp_By_CaseId(
			String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsraApp_By_CaseId(caseId);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsraApp_By_CaseId(
		String caseId) {

		return getPersistence().fetchBygetHsraApp_By_CaseId(caseId);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsraApp_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraApp_By_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the hsra application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application stages that was removed
	 */
	public static HsraApplicationStages removeBygetHsraApp_By_CaseId(
			String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().removeBygetHsraApp_By_CaseId(caseId);
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application stageses
	 */
	public static int countBygetHsraApp_By_CaseId(String caseId) {
		return getPersistence().countBygetHsraApp_By_CaseId(caseId);
	}

	/**
	 * Returns all the hsra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName) {

		return getPersistence().findBygetHsra_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the hsra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetHsra_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().findBygetHsra_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	public static List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsra_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findBygetHsra_By_StageName_First(
			String stageName,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_StageName_First(
		String stageName,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHsra_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages findBygetHsra_By_StageName_Last(
			String stageName,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	public static HsraApplicationStages fetchBygetHsra_By_StageName_Last(
		String stageName,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetHsra_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public static HsraApplicationStages[]
			findBygetHsra_By_StageName_PrevAndNext(
				long hsraApplicationStagesId, String stageName,
				OrderByComparator<HsraApplicationStages> orderByComparator)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findBygetHsra_By_StageName_PrevAndNext(
			hsraApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the hsra application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetHsra_By_StageName(String stageName) {
		getPersistence().removeBygetHsra_By_StageName(stageName);
	}

	/**
	 * Returns the number of hsra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching hsra application stageses
	 */
	public static int countBygetHsra_By_StageName(String stageName) {
		return getPersistence().countBygetHsra_By_StageName(stageName);
	}

	/**
	 * Caches the hsra application stages in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationStages the hsra application stages
	 */
	public static void cacheResult(
		HsraApplicationStages hsraApplicationStages) {

		getPersistence().cacheResult(hsraApplicationStages);
	}

	/**
	 * Caches the hsra application stageses in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationStageses the hsra application stageses
	 */
	public static void cacheResult(
		List<HsraApplicationStages> hsraApplicationStageses) {

		getPersistence().cacheResult(hsraApplicationStageses);
	}

	/**
	 * Creates a new hsra application stages with the primary key. Does not add the hsra application stages to the database.
	 *
	 * @param hsraApplicationStagesId the primary key for the new hsra application stages
	 * @return the new hsra application stages
	 */
	public static HsraApplicationStages create(long hsraApplicationStagesId) {
		return getPersistence().create(hsraApplicationStagesId);
	}

	/**
	 * Removes the hsra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages that was removed
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public static HsraApplicationStages remove(long hsraApplicationStagesId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().remove(hsraApplicationStagesId);
	}

	public static HsraApplicationStages updateImpl(
		HsraApplicationStages hsraApplicationStages) {

		return getPersistence().updateImpl(hsraApplicationStages);
	}

	/**
	 * Returns the hsra application stages with the primary key or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	public static HsraApplicationStages findByPrimaryKey(
			long hsraApplicationStagesId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraApplicationStagesException {

		return getPersistence().findByPrimaryKey(hsraApplicationStagesId);
	}

	/**
	 * Returns the hsra application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages, or <code>null</code> if a hsra application stages with the primary key could not be found
	 */
	public static HsraApplicationStages fetchByPrimaryKey(
		long hsraApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(hsraApplicationStagesId);
	}

	/**
	 * Returns all the hsra application stageses.
	 *
	 * @return the hsra application stageses
	 */
	public static List<HsraApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of hsra application stageses
	 */
	public static List<HsraApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application stageses
	 */
	public static List<HsraApplicationStages> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application stageses
	 */
	public static List<HsraApplicationStages> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the hsra application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of hsra application stageses.
	 *
	 * @return the number of hsra application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HsraApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HsraApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HsraApplicationStagesPersistence _persistence;

}