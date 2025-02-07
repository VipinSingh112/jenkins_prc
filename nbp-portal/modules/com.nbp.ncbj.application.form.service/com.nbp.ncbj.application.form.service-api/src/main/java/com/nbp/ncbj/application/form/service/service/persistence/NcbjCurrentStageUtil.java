/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj current stage service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCurrentStagePersistence
 * @generated
 */
public class NcbjCurrentStageUtil {

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
	public static void clearCache(NcbjCurrentStage ncbjCurrentStage) {
		getPersistence().clearCache(ncbjCurrentStage);
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
	public static Map<Serializable, NcbjCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjCurrentStage update(NcbjCurrentStage ncbjCurrentStage) {
		return getPersistence().update(ncbjCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjCurrentStage update(
		NcbjCurrentStage ncbjCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(ncbjCurrentStage, serviceContext);
	}

	/**
	 * Returns all the ncbj current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncbj current stages
	 */
	public static List<NcbjCurrentStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the ncbj current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of matching ncbj current stages
	 */
	public static List<NcbjCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj current stages
	 */
	public static List<NcbjCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj current stages
	 */
	public static List<NcbjCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage findByUuid_First(
			String uuid, OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage findByUuid_Last(
			String uuid, OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the ncbj current stages before and after the current ncbj current stage in the ordered set where uuid = &#63;.
	 *
	 * @param ncbjCurrentStageId the primary key of the current ncbj current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	public static NcbjCurrentStage[] findByUuid_PrevAndNext(
			long ncbjCurrentStageId, String uuid,
			OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			ncbjCurrentStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the ncbj current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of ncbj current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncbj current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the ncbj current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcbjCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncbj current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncbj current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the ncbj current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncbj current stage that was removed
	 */
	public static NcbjCurrentStage removeByUUID_G(String uuid, long groupId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of ncbj current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncbj current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncbj current stages
	 */
	public static List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of matching ncbj current stages
	 */
	public static List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj current stages
	 */
	public static List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj current stages
	 */
	public static List<NcbjCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the ncbj current stages before and after the current ncbj current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncbjCurrentStageId the primary key of the current ncbj current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	public static NcbjCurrentStage[] findByUuid_C_PrevAndNext(
			long ncbjCurrentStageId, String uuid, long companyId,
			OrderByComparator<NcbjCurrentStage> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			ncbjCurrentStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the ncbj current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of ncbj current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncbj current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the ncbj current stage where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjCurrentStageException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage findBygetByNcbj_Stage(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().findBygetByNcbj_Stage(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj current stage where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage fetchBygetByNcbj_Stage(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetByNcbj_Stage(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj current stage where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj current stage, or <code>null</code> if a matching ncbj current stage could not be found
	 */
	public static NcbjCurrentStage fetchBygetByNcbj_Stage(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetByNcbj_Stage(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj current stage where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj current stage that was removed
	 */
	public static NcbjCurrentStage removeBygetByNcbj_Stage(
			long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().removeBygetByNcbj_Stage(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj current stages where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj current stages
	 */
	public static int countBygetByNcbj_Stage(long ncbjApplicationId) {
		return getPersistence().countBygetByNcbj_Stage(ncbjApplicationId);
	}

	/**
	 * Caches the ncbj current stage in the entity cache if it is enabled.
	 *
	 * @param ncbjCurrentStage the ncbj current stage
	 */
	public static void cacheResult(NcbjCurrentStage ncbjCurrentStage) {
		getPersistence().cacheResult(ncbjCurrentStage);
	}

	/**
	 * Caches the ncbj current stages in the entity cache if it is enabled.
	 *
	 * @param ncbjCurrentStages the ncbj current stages
	 */
	public static void cacheResult(List<NcbjCurrentStage> ncbjCurrentStages) {
		getPersistence().cacheResult(ncbjCurrentStages);
	}

	/**
	 * Creates a new ncbj current stage with the primary key. Does not add the ncbj current stage to the database.
	 *
	 * @param ncbjCurrentStageId the primary key for the new ncbj current stage
	 * @return the new ncbj current stage
	 */
	public static NcbjCurrentStage create(long ncbjCurrentStageId) {
		return getPersistence().create(ncbjCurrentStageId);
	}

	/**
	 * Removes the ncbj current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage that was removed
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	public static NcbjCurrentStage remove(long ncbjCurrentStageId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().remove(ncbjCurrentStageId);
	}

	public static NcbjCurrentStage updateImpl(
		NcbjCurrentStage ncbjCurrentStage) {

		return getPersistence().updateImpl(ncbjCurrentStage);
	}

	/**
	 * Returns the ncbj current stage with the primary key or throws a <code>NoSuchNcbjCurrentStageException</code> if it could not be found.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage
	 * @throws NoSuchNcbjCurrentStageException if a ncbj current stage with the primary key could not be found
	 */
	public static NcbjCurrentStage findByPrimaryKey(long ncbjCurrentStageId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCurrentStageException {

		return getPersistence().findByPrimaryKey(ncbjCurrentStageId);
	}

	/**
	 * Returns the ncbj current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCurrentStageId the primary key of the ncbj current stage
	 * @return the ncbj current stage, or <code>null</code> if a ncbj current stage with the primary key could not be found
	 */
	public static NcbjCurrentStage fetchByPrimaryKey(long ncbjCurrentStageId) {
		return getPersistence().fetchByPrimaryKey(ncbjCurrentStageId);
	}

	/**
	 * Returns all the ncbj current stages.
	 *
	 * @return the ncbj current stages
	 */
	public static List<NcbjCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @return the range of ncbj current stages
	 */
	public static List<NcbjCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj current stages
	 */
	public static List<NcbjCurrentStage> findAll(
		int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj current stages
	 * @param end the upper bound of the range of ncbj current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj current stages
	 */
	public static List<NcbjCurrentStage> findAll(
		int start, int end,
		OrderByComparator<NcbjCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj current stages.
	 *
	 * @return the number of ncbj current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcbjCurrentStagePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcbjCurrentStagePersistence _persistence;

}