/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.WRAAppCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the wra app current stage service. This utility wraps <code>com.nbp.wra.application.form.service.service.persistence.impl.WRAAppCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAAppCurrentStagePersistence
 * @generated
 */
public class WRAAppCurrentStageUtil {

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
	public static void clearCache(WRAAppCurrentStage wraAppCurrentStage) {
		getPersistence().clearCache(wraAppCurrentStage);
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
	public static Map<Serializable, WRAAppCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<WRAAppCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<WRAAppCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<WRAAppCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static WRAAppCurrentStage update(
		WRAAppCurrentStage wraAppCurrentStage) {

		return getPersistence().update(wraAppCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static WRAAppCurrentStage update(
		WRAAppCurrentStage wraAppCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(wraAppCurrentStage, serviceContext);
	}

	/**
	 * Returns all the wra app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching wra app current stages
	 */
	public static List<WRAAppCurrentStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the wra app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of matching wra app current stages
	 */
	public static List<WRAAppCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra app current stages
	 */
	public static List<WRAAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra app current stages
	 */
	public static List<WRAAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the wra app current stages before and after the current wra app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param wraAppCurrentStageId the primary key of the current wra app current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	public static WRAAppCurrentStage[] findByUuid_PrevAndNext(
			long wraAppCurrentStageId, String uuid,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			wraAppCurrentStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the wra app current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of wra app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching wra app current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the wra app current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchWRAAppCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the wra app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the wra app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the wra app current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the wra app current stage that was removed
	 */
	public static WRAAppCurrentStage removeByUUID_G(String uuid, long groupId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of wra app current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching wra app current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching wra app current stages
	 */
	public static List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of matching wra app current stages
	 */
	public static List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra app current stages
	 */
	public static List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra app current stages
	 */
	public static List<WRAAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the wra app current stages before and after the current wra app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param wraAppCurrentStageId the primary key of the current wra app current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	public static WRAAppCurrentStage[] findByUuid_C_PrevAndNext(
			long wraAppCurrentStageId, String uuid, long companyId,
			OrderByComparator<WRAAppCurrentStage> orderByComparator)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			wraAppCurrentStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the wra app current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of wra app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching wra app current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the wra app current stage where wraApplicationId = &#63; or throws a <code>NoSuchWRAAppCurrentStageException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage findBygetByWRA_Stage(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().findBygetByWRA_Stage(wraApplicationId);
	}

	/**
	 * Returns the wra app current stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage fetchBygetByWRA_Stage(
		long wraApplicationId) {

		return getPersistence().fetchBygetByWRA_Stage(wraApplicationId);
	}

	/**
	 * Returns the wra app current stage where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra app current stage, or <code>null</code> if a matching wra app current stage could not be found
	 */
	public static WRAAppCurrentStage fetchBygetByWRA_Stage(
		long wraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetByWRA_Stage(
			wraApplicationId, useFinderCache);
	}

	/**
	 * Removes the wra app current stage where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra app current stage that was removed
	 */
	public static WRAAppCurrentStage removeBygetByWRA_Stage(
			long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().removeBygetByWRA_Stage(wraApplicationId);
	}

	/**
	 * Returns the number of wra app current stages where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra app current stages
	 */
	public static int countBygetByWRA_Stage(long wraApplicationId) {
		return getPersistence().countBygetByWRA_Stage(wraApplicationId);
	}

	/**
	 * Caches the wra app current stage in the entity cache if it is enabled.
	 *
	 * @param wraAppCurrentStage the wra app current stage
	 */
	public static void cacheResult(WRAAppCurrentStage wraAppCurrentStage) {
		getPersistence().cacheResult(wraAppCurrentStage);
	}

	/**
	 * Caches the wra app current stages in the entity cache if it is enabled.
	 *
	 * @param wraAppCurrentStages the wra app current stages
	 */
	public static void cacheResult(
		List<WRAAppCurrentStage> wraAppCurrentStages) {

		getPersistence().cacheResult(wraAppCurrentStages);
	}

	/**
	 * Creates a new wra app current stage with the primary key. Does not add the wra app current stage to the database.
	 *
	 * @param wraAppCurrentStageId the primary key for the new wra app current stage
	 * @return the new wra app current stage
	 */
	public static WRAAppCurrentStage create(long wraAppCurrentStageId) {
		return getPersistence().create(wraAppCurrentStageId);
	}

	/**
	 * Removes the wra app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage that was removed
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	public static WRAAppCurrentStage remove(long wraAppCurrentStageId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().remove(wraAppCurrentStageId);
	}

	public static WRAAppCurrentStage updateImpl(
		WRAAppCurrentStage wraAppCurrentStage) {

		return getPersistence().updateImpl(wraAppCurrentStage);
	}

	/**
	 * Returns the wra app current stage with the primary key or throws a <code>NoSuchWRAAppCurrentStageException</code> if it could not be found.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage
	 * @throws NoSuchWRAAppCurrentStageException if a wra app current stage with the primary key could not be found
	 */
	public static WRAAppCurrentStage findByPrimaryKey(long wraAppCurrentStageId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchWRAAppCurrentStageException {

		return getPersistence().findByPrimaryKey(wraAppCurrentStageId);
	}

	/**
	 * Returns the wra app current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraAppCurrentStageId the primary key of the wra app current stage
	 * @return the wra app current stage, or <code>null</code> if a wra app current stage with the primary key could not be found
	 */
	public static WRAAppCurrentStage fetchByPrimaryKey(
		long wraAppCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(wraAppCurrentStageId);
	}

	/**
	 * Returns all the wra app current stages.
	 *
	 * @return the wra app current stages
	 */
	public static List<WRAAppCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @return the range of wra app current stages
	 */
	public static List<WRAAppCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra app current stages
	 */
	public static List<WRAAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the wra app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra app current stages
	 * @param end the upper bound of the range of wra app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra app current stages
	 */
	public static List<WRAAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<WRAAppCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the wra app current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of wra app current stages.
	 *
	 * @return the number of wra app current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static WRAAppCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		WRAAppCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile WRAAppCurrentStagePersistence _persistence;

}