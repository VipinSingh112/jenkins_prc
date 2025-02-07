/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WraApplicationStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra application stage service. This utility wraps <code>com.nbp.wra.stage.service.service.persistence.impl.WraApplicationStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WraApplicationStagePersistence
 * @generated
 */
public class WraApplicationStageUtil {

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
	public static void clearCache(WraApplicationStage wraApplicationStage) {
		getPersistence().clearCache(wraApplicationStage);
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
	public static Map<Serializable, WraApplicationStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WraApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WraApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WraApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WraApplicationStage update(
		WraApplicationStage wraApplicationStage) {

		return getPersistence().update(wraApplicationStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WraApplicationStage update(
		WraApplicationStage wraApplicationStage,
		ServiceContext serviceContext) {

		return getPersistence().update(wraApplicationStage, serviceContext);
	}

	/**
	 * Returns all the wra application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching wra application stages
	 */
	public static List<WraApplicationStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the wra application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	public static List<WraApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	public static List<WraApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	public static List<WraApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchByUuid_First(
		String uuid, OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchByUuid_Last(
		String uuid, OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where uuid = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public static WraApplicationStage[] findByUuid_PrevAndNext(
			long wraApplicationStageId, String uuid,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findByUuid_PrevAndNext(
			wraApplicationStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the wra application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of wra application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching wra application stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the wra application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the wra application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the wra application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the wra application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the wra application stage that was removed
	 */
	public static WraApplicationStage removeByUUID_G(String uuid, long groupId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of wra application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching wra application stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching wra application stages
	 */
	public static List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	public static List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	public static List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	public static List<WraApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public static WraApplicationStage[] findByUuid_C_PrevAndNext(
			long wraApplicationStageId, String uuid, long companyId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			wraApplicationStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the wra application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of wra application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching wra application stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the wra application stage where wraApplicationId = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findBygetWra_By_AI(long wraApplicationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_AI(wraApplicationId);
	}

	/**
	 * Returns the wra application stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_AI(
		long wraApplicationId) {

		return getPersistence().fetchBygetWra_By_AI(wraApplicationId);
	}

	/**
	 * Returns the wra application stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_AI(
		long wraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetWra_By_AI(
			wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the wra application stage where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra application stage that was removed
	 */
	public static WraApplicationStage removeBygetWra_By_AI(
			long wraApplicationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().removeBygetWra_By_AI(wraApplicationId);
	}

	/**
	 * Returns the number of wra application stages where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra application stages
	 */
	public static int countBygetWra_By_AI(long wraApplicationId) {
		return getPersistence().countBygetWra_By_AI(wraApplicationId);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findBygetWra_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetWra_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetWra_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the wra application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the wra application stage that was removed
	 */
	public static WraApplicationStage removeBygetWra_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().removeBygetWra_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching wra application stages
	 */
	public static int countBygetWra_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetWra_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findBygetWra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetWra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetWra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the wra application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the wra application stage that was removed
	 */
	public static WraApplicationStage removeBygetWra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().removeBygetWra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching wra application stages
	 */
	public static int countBygetWra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetWra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findBygetWra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetWra_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetWra_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the wra application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the wra application stage that was removed
	 */
	public static WraApplicationStage removeBygetWra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().removeBygetWra_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching wra application stages
	 */
	public static int countBygetWra_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetWra_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the wra application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application stages
	 */
	public static List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId) {

		return getPersistence().findBygetWra_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the wra application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	public static List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetWra_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	public static List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().findBygetWra_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	public static List<WraApplicationStage> findBygetWra_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWra_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findBygetWra_By_CaseId_First(
			String caseId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_CaseId_First(
		String caseId,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetWra_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findBygetWra_By_CaseId_Last(
			String caseId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_CaseId_Last(
		String caseId,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetWra_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where caseId = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public static WraApplicationStage[] findBygetWra_By_CaseId_PrevAndNext(
			long wraApplicationStageId, String caseId,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_CaseId_PrevAndNext(
			wraApplicationStageId, caseId, orderByComparator);
	}

	/**
	 * Removes all the wra application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetWra_By_CaseId(String caseId) {
		getPersistence().removeBygetWra_By_CaseId(caseId);
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application stages
	 */
	public static int countBygetWra_By_CaseId(String caseId) {
		return getPersistence().countBygetWra_By_CaseId(caseId);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findByget_Wra_By_CaseId(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findByget_Wra_By_CaseId(caseId);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchByget_Wra_By_CaseId(String caseId) {
		return getPersistence().fetchByget_Wra_By_CaseId(caseId);
	}

	/**
	 * Returns the wra application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchByget_Wra_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchByget_Wra_By_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the wra application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra application stage that was removed
	 */
	public static WraApplicationStage removeByget_Wra_By_CaseId(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().removeByget_Wra_By_CaseId(caseId);
	}

	/**
	 * Returns the number of wra application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application stages
	 */
	public static int countByget_Wra_By_CaseId(String caseId) {
		return getPersistence().countByget_Wra_By_CaseId(caseId);
	}

	/**
	 * Returns all the wra application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching wra application stages
	 */
	public static List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName) {

		return getPersistence().findBygetWra_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the wra application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of matching wra application stages
	 */
	public static List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetWra_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the wra application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application stages
	 */
	public static List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().findBygetWra_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application stages
	 */
	public static List<WraApplicationStage> findBygetWra_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetWra_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findBygetWra_By_StageName_First(
			String stageName,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_StageName_First(
		String stageName,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetWra_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage
	 * @throws NoSuchWraApplicationStageException if a matching wra application stage could not be found
	 */
	public static WraApplicationStage findBygetWra_By_StageName_Last(
			String stageName,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application stage, or <code>null</code> if a matching wra application stage could not be found
	 */
	public static WraApplicationStage fetchBygetWra_By_StageName_Last(
		String stageName,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetWra_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the wra application stages before and after the current wra application stage in the ordered set where stageName = &#63;.
	 *
	 * @param wraApplicationStageId the primary key of the current wra application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public static WraApplicationStage[] findBygetWra_By_StageName_PrevAndNext(
			long wraApplicationStageId, String stageName,
			OrderByComparator<WraApplicationStage> orderByComparator)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findBygetWra_By_StageName_PrevAndNext(
			wraApplicationStageId, stageName, orderByComparator);
	}

	/**
	 * Removes all the wra application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetWra_By_StageName(String stageName) {
		getPersistence().removeBygetWra_By_StageName(stageName);
	}

	/**
	 * Returns the number of wra application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching wra application stages
	 */
	public static int countBygetWra_By_StageName(String stageName) {
		return getPersistence().countBygetWra_By_StageName(stageName);
	}

	/**
	 * Caches the wra application stage in the entity cache if it is enabled.
	 *
	 * @param wraApplicationStage the wra application stage
	 */
	public static void cacheResult(WraApplicationStage wraApplicationStage) {
		getPersistence().cacheResult(wraApplicationStage);
	}

	/**
	 * Caches the wra application stages in the entity cache if it is enabled.
	 *
	 * @param wraApplicationStages the wra application stages
	 */
	public static void cacheResult(
		List<WraApplicationStage> wraApplicationStages) {

		getPersistence().cacheResult(wraApplicationStages);
	}

	/**
	 * Creates a new wra application stage with the primary key. Does not add the wra application stage to the database.
	 *
	 * @param wraApplicationStageId the primary key for the new wra application stage
	 * @return the new wra application stage
	 */
	public static WraApplicationStage create(long wraApplicationStageId) {
		return getPersistence().create(wraApplicationStageId);
	}

	/**
	 * Removes the wra application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage that was removed
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public static WraApplicationStage remove(long wraApplicationStageId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().remove(wraApplicationStageId);
	}

	public static WraApplicationStage updateImpl(
		WraApplicationStage wraApplicationStage) {

		return getPersistence().updateImpl(wraApplicationStage);
	}

	/**
	 * Returns the wra application stage with the primary key or throws a <code>NoSuchWraApplicationStageException</code> if it could not be found.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage
	 * @throws NoSuchWraApplicationStageException if a wra application stage with the primary key could not be found
	 */
	public static WraApplicationStage findByPrimaryKey(
			long wraApplicationStageId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraApplicationStageException {

		return getPersistence().findByPrimaryKey(wraApplicationStageId);
	}

	/**
	 * Returns the wra application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraApplicationStageId the primary key of the wra application stage
	 * @return the wra application stage, or <code>null</code> if a wra application stage with the primary key could not be found
	 */
	public static WraApplicationStage fetchByPrimaryKey(
		long wraApplicationStageId) {

		return getPersistence().fetchByPrimaryKey(wraApplicationStageId);
	}

	/**
	 * Returns all the wra application stages.
	 *
	 * @return the wra application stages
	 */
	public static List<WraApplicationStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @return the range of wra application stages
	 */
	public static List<WraApplicationStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra application stages
	 */
	public static List<WraApplicationStage> findAll(
		int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application stages
	 * @param end the upper bound of the range of wra application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra application stages
	 */
	public static List<WraApplicationStage> findAll(
		int start, int end,
		OrderByComparator<WraApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra application stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra application stages.
	 *
	 * @return the number of wra application stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WraApplicationStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		WraApplicationStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile WraApplicationStagePersistence _persistence;

}