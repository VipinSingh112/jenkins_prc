/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application current stage service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCurrentStagePersistence
 * @generated
 */
public class CannabisApplicationCurrentStageUtil {

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
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage) {

		getPersistence().clearCache(cannabisApplicationCurrentStage);
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
	public static Map<Serializable, CannabisApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationCurrentStage update(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage) {

		return getPersistence().update(cannabisApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationCurrentStage update(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns all the cannabis application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of matching cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis application current stages before and after the current cannabis application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisStageId the primary key of the current cannabis application current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	public static CannabisApplicationCurrentStage[] findByUuid_PrevAndNext(
			long cannabisStageId, String uuid,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			cannabisStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis application current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis application current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis application current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application current stage that was removed
	 */
	public static CannabisApplicationCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis application current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of matching cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis application current stages before and after the current cannabis application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisStageId the primary key of the current cannabis application current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	public static CannabisApplicationCurrentStage[] findByUuid_C_PrevAndNext(
			long cannabisStageId, String uuid, long companyId,
			OrderByComparator<CannabisApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			cannabisStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the cannabis application current stage where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage findBygetCA_Stage_CAI(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().findBygetCA_Stage_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application current stage where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long cannabisApplicationId) {

		return getPersistence().fetchBygetCA_Stage_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application current stage where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application current stage, or <code>null</code> if a matching cannabis application current stage could not be found
	 */
	public static CannabisApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCA_Stage_CAI(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis application current stage where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application current stage that was removed
	 */
	public static CannabisApplicationCurrentStage removeBygetCA_Stage_CAI(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().removeBygetCA_Stage_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis application current stages where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application current stages
	 */
	public static int countBygetCA_Stage_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCA_Stage_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the cannabis application current stage in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCurrentStage the cannabis application current stage
	 */
	public static void cacheResult(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage) {

		getPersistence().cacheResult(cannabisApplicationCurrentStage);
	}

	/**
	 * Caches the cannabis application current stages in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCurrentStages the cannabis application current stages
	 */
	public static void cacheResult(
		List<CannabisApplicationCurrentStage>
			cannabisApplicationCurrentStages) {

		getPersistence().cacheResult(cannabisApplicationCurrentStages);
	}

	/**
	 * Creates a new cannabis application current stage with the primary key. Does not add the cannabis application current stage to the database.
	 *
	 * @param cannabisStageId the primary key for the new cannabis application current stage
	 * @return the new cannabis application current stage
	 */
	public static CannabisApplicationCurrentStage create(long cannabisStageId) {
		return getPersistence().create(cannabisStageId);
	}

	/**
	 * Removes the cannabis application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage that was removed
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	public static CannabisApplicationCurrentStage remove(long cannabisStageId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().remove(cannabisStageId);
	}

	public static CannabisApplicationCurrentStage updateImpl(
		CannabisApplicationCurrentStage cannabisApplicationCurrentStage) {

		return getPersistence().updateImpl(cannabisApplicationCurrentStage);
	}

	/**
	 * Returns the cannabis application current stage with the primary key or throws a <code>NoSuchCannabisApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage
	 * @throws NoSuchCannabisApplicationCurrentStageException if a cannabis application current stage with the primary key could not be found
	 */
	public static CannabisApplicationCurrentStage findByPrimaryKey(
			long cannabisStageId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(cannabisStageId);
	}

	/**
	 * Returns the cannabis application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisStageId the primary key of the cannabis application current stage
	 * @return the cannabis application current stage, or <code>null</code> if a cannabis application current stage with the primary key could not be found
	 */
	public static CannabisApplicationCurrentStage fetchByPrimaryKey(
		long cannabisStageId) {

		return getPersistence().fetchByPrimaryKey(cannabisStageId);
	}

	/**
	 * Returns all the cannabis application current stages.
	 *
	 * @return the cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @return the range of cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application current stages
	 * @param end the upper bound of the range of cannabis application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application current stages
	 */
	public static List<CannabisApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application current stages.
	 *
	 * @return the number of cannabis application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationCurrentStagePersistence
		_persistence;

}