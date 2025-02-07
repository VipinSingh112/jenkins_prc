/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quarry.stage.service.model.QuarryApplicationStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry application stage service. This utility wraps <code>com.nbp.quarry.stage.service.service.persistence.impl.QuarryApplicationStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationStagePersistence
 * @generated
 */
public class QuarryApplicationStageUtil {

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
		QuarryApplicationStage quarryApplicationStage) {

		getPersistence().clearCache(quarryApplicationStage);
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
	public static Map<Serializable, QuarryApplicationStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryApplicationStage update(
		QuarryApplicationStage quarryApplicationStage) {

		return getPersistence().update(quarryApplicationStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryApplicationStage update(
		QuarryApplicationStage quarryApplicationStage,
		ServiceContext serviceContext) {

		return getPersistence().update(quarryApplicationStage, serviceContext);
	}

	/**
	 * Returns all the quarry application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the quarry application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchByUuid_First(
		String uuid,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where uuid = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public static QuarryApplicationStage[] findByUuid_PrevAndNext(
			long quarryAppStagesId, String uuid,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findByUuid_PrevAndNext(
			quarryAppStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the quarry application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of quarry application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quarry application stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the quarry application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the quarry application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the quarry application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the quarry application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quarry application stage that was removed
	 */
	public static QuarryApplicationStage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of quarry application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quarry application stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public static QuarryApplicationStage[] findByUuid_C_PrevAndNext(
			long quarryAppStagesId, String uuid, long companyId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			quarryAppStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the quarry application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of quarry application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quarry application stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the quarry application stage where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findBygetQuarry_AI(
			long quarryApplicationId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_AI(quarryApplicationId);
	}

	/**
	 * Returns the quarry application stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_AI(
		long quarryApplicationId) {

		return getPersistence().fetchBygetQuarry_AI(quarryApplicationId);
	}

	/**
	 * Returns the quarry application stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_AI(
		long quarryApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_AI(
			quarryApplicationId, useFinderCache);
	}

	/**
	 * Removes the quarry application stage where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry application stage that was removed
	 */
	public static QuarryApplicationStage removeBygetQuarry_AI(
			long quarryApplicationId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().removeBygetQuarry_AI(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry application stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry application stages
	 */
	public static int countBygetQuarry_AI(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_AI(quarryApplicationId);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findBygetQuarry_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetQuarry_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the quarry application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the quarry application stage that was removed
	 */
	public static QuarryApplicationStage removeBygetQuarry_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().removeBygetQuarry_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching quarry application stages
	 */
	public static int countBygetQuarry_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetQuarry_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findBygetQuarry_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetQuarry_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the quarry application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the quarry application stage that was removed
	 */
	public static QuarryApplicationStage removeBygetQuarry_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().removeBygetQuarry_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching quarry application stages
	 */
	public static int countBygetQuarry_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetQuarry_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findBygetQuarry_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetQuarry_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the quarry application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the quarry application stage that was removed
	 */
	public static QuarryApplicationStage removeBygetQuarry_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().removeBygetQuarry_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching quarry application stages
	 */
	public static int countBygetQuarry_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetQuarry_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the quarry application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId) {

		return getPersistence().findBygetQuarry_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the quarry application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetQuarry_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().findBygetQuarry_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findBygetQuarry_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findBygetQuarry_By_CaseId_First(
			String caseId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_CaseId_First(
		String caseId,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetQuarry_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findBygetQuarry_By_CaseId_Last(
			String caseId,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_CaseId_Last(
		String caseId,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetQuarry_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where caseId = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public static QuarryApplicationStage[]
			findBygetQuarry_By_CaseId_PrevAndNext(
				long quarryAppStagesId, String caseId,
				OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_By_CaseId_PrevAndNext(
			quarryAppStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the quarry application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetQuarry_By_CaseId(String caseId) {
		getPersistence().removeBygetQuarry_By_CaseId(caseId);
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry application stages
	 */
	public static int countBygetQuarry_By_CaseId(String caseId) {
		return getPersistence().countBygetQuarry_By_CaseId(caseId);
	}

	/**
	 * Returns all the quarry application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName) {

		return getPersistence().findBygetQuarry_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the quarry application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetQuarry_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().findBygetQuarry_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry application stages
	 */
	public static List<QuarryApplicationStage> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findBygetQuarry_By_StageName_First(
			String stageName,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_StageName_First(
		String stageName,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetQuarry_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findBygetQuarry_By_StageName_Last(
			String stageName,
			OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_By_StageName_Last(
		String stageName,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetQuarry_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the quarry application stages before and after the current quarry application stage in the ordered set where stageName = &#63;.
	 *
	 * @param quarryAppStagesId the primary key of the current quarry application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public static QuarryApplicationStage[]
			findBygetQuarry_By_StageName_PrevAndNext(
				long quarryAppStagesId, String stageName,
				OrderByComparator<QuarryApplicationStage> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_By_StageName_PrevAndNext(
			quarryAppStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the quarry application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetQuarry_By_StageName(String stageName) {
		getPersistence().removeBygetQuarry_By_StageName(stageName);
	}

	/**
	 * Returns the number of quarry application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching quarry application stages
	 */
	public static int countBygetQuarry_By_StageName(String stageName) {
		return getPersistence().countBygetQuarry_By_StageName(stageName);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage findBygetQuarry_CaseId(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findBygetQuarry_CaseId(caseId);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_CaseId(
		String caseId) {

		return getPersistence().fetchBygetQuarry_CaseId(caseId);
	}

	/**
	 * Returns the quarry application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application stage, or <code>null</code> if a matching quarry application stage could not be found
	 */
	public static QuarryApplicationStage fetchBygetQuarry_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_CaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the quarry application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry application stage that was removed
	 */
	public static QuarryApplicationStage removeBygetQuarry_CaseId(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().removeBygetQuarry_CaseId(caseId);
	}

	/**
	 * Returns the number of quarry application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry application stages
	 */
	public static int countBygetQuarry_CaseId(String caseId) {
		return getPersistence().countBygetQuarry_CaseId(caseId);
	}

	/**
	 * Caches the quarry application stage in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationStage the quarry application stage
	 */
	public static void cacheResult(
		QuarryApplicationStage quarryApplicationStage) {

		getPersistence().cacheResult(quarryApplicationStage);
	}

	/**
	 * Caches the quarry application stages in the entity cache if it is enabled.
	 *
	 * @param quarryApplicationStages the quarry application stages
	 */
	public static void cacheResult(
		List<QuarryApplicationStage> quarryApplicationStages) {

		getPersistence().cacheResult(quarryApplicationStages);
	}

	/**
	 * Creates a new quarry application stage with the primary key. Does not add the quarry application stage to the database.
	 *
	 * @param quarryAppStagesId the primary key for the new quarry application stage
	 * @return the new quarry application stage
	 */
	public static QuarryApplicationStage create(long quarryAppStagesId) {
		return getPersistence().create(quarryAppStagesId);
	}

	/**
	 * Removes the quarry application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage that was removed
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public static QuarryApplicationStage remove(long quarryAppStagesId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().remove(quarryAppStagesId);
	}

	public static QuarryApplicationStage updateImpl(
		QuarryApplicationStage quarryApplicationStage) {

		return getPersistence().updateImpl(quarryApplicationStage);
	}

	/**
	 * Returns the quarry application stage with the primary key or throws a <code>NoSuchQuarryApplicationStageException</code> if it could not be found.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage
	 * @throws NoSuchQuarryApplicationStageException if a quarry application stage with the primary key could not be found
	 */
	public static QuarryApplicationStage findByPrimaryKey(
			long quarryAppStagesId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryApplicationStageException {

		return getPersistence().findByPrimaryKey(quarryAppStagesId);
	}

	/**
	 * Returns the quarry application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryAppStagesId the primary key of the quarry application stage
	 * @return the quarry application stage, or <code>null</code> if a quarry application stage with the primary key could not be found
	 */
	public static QuarryApplicationStage fetchByPrimaryKey(
		long quarryAppStagesId) {

		return getPersistence().fetchByPrimaryKey(quarryAppStagesId);
	}

	/**
	 * Returns all the quarry application stages.
	 *
	 * @return the quarry application stages
	 */
	public static List<QuarryApplicationStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @return the range of quarry application stages
	 */
	public static List<QuarryApplicationStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry application stages
	 */
	public static List<QuarryApplicationStage> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application stages
	 * @param end the upper bound of the range of quarry application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry application stages
	 */
	public static List<QuarryApplicationStage> findAll(
		int start, int end,
		OrderByComparator<QuarryApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry application stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry application stages.
	 *
	 * @return the number of quarry application stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryApplicationStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QuarryApplicationStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryApplicationStagePersistence _persistence;

}