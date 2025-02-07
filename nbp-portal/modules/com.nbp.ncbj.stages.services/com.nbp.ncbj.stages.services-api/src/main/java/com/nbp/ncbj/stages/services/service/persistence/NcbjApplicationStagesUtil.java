/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.model.NcbjApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj application stages service. This utility wraps <code>com.nbp.ncbj.stages.services.service.persistence.impl.NcbjApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationStagesPersistence
 * @generated
 */
public class NcbjApplicationStagesUtil {

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
	public static void clearCache(NcbjApplicationStages ncbjApplicationStages) {
		getPersistence().clearCache(ncbjApplicationStages);
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
	public static Map<Serializable, NcbjApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjApplicationStages update(
		NcbjApplicationStages ncbjApplicationStages) {

		return getPersistence().update(ncbjApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjApplicationStages update(
		NcbjApplicationStages ncbjApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjApplicationStages, serviceContext);
	}

	/**
	 * Returns all the ncbj application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the ncbj application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public static NcbjApplicationStages[] findByUuid_PrevAndNext(
			long ncbjStagesApplicationId, String uuid,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			ncbjStagesApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the ncbj application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of ncbj application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncbj application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the ncbj application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findByUUID_G(String uuid, long groupId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncbj application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncbj application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the ncbj application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncbj application stages that was removed
	 */
	public static NcbjApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of ncbj application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncbj application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public static NcbjApplicationStages[] findByUuid_C_PrevAndNext(
			long ncbjStagesApplicationId, String uuid, long companyId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			ncbjStagesApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the ncbj application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncbj application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the ncbj application stages where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findBygetNcbj_AI(long ncbjApplicationId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetNcbj_AI(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj application stages where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_AI(
		long ncbjApplicationId) {

		return getPersistence().fetchBygetNcbj_AI(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj application stages where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_AI(
		long ncbjApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbj_AI(
			ncbjApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncbj application stages where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj application stages that was removed
	 */
	public static NcbjApplicationStages removeBygetNcbj_AI(
			long ncbjApplicationId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().removeBygetNcbj_AI(ncbjApplicationId);
	}

	/**
	 * Returns the number of ncbj application stageses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj application stageses
	 */
	public static int countBygetNcbj_AI(long ncbjApplicationId) {
		return getPersistence().countBygetNcbj_AI(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findBygetNcbj_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetNcbj_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetNcbj_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbj_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the ncbj application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the ncbj application stages that was removed
	 */
	public static NcbjApplicationStages removeBygetNcbj_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().removeBygetNcbj_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching ncbj application stageses
	 */
	public static int countBygetNcbj_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetNcbj_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findBygetNcbj_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetNcbj_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetNcbj_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetNcbj_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the ncbj application stages that was removed
	 */
	public static NcbjApplicationStages removeBygetNcbj_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().removeBygetNcbj_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching ncbj application stageses
	 */
	public static int countBygetNcbj_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetNcbj_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findBygetNcbj_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetNcbj_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetNcbj_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbj_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the ncbj application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the ncbj application stages that was removed
	 */
	public static NcbjApplicationStages removeBygetNcbj_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().removeBygetNcbj_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching ncbj application stageses
	 */
	public static int countBygetNcbj_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetNcbj_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the ncbj application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId) {

		return getPersistence().findBygetNcbj_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the ncbj application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetNcbj_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().findBygetNcbj_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbj_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findBygetNcbj_By_CaseId_First(
			String caseId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetNcbj_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_By_CaseId_First(
		String caseId,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetNcbj_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findBygetNcbj_By_CaseId_Last(
			String caseId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetNcbj_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_By_CaseId_Last(
		String caseId,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetNcbj_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public static NcbjApplicationStages[] findBygetNcbj_By_CaseId_PrevAndNext(
			long ncbjStagesApplicationId, String caseId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetNcbj_By_CaseId_PrevAndNext(
			ncbjStagesApplicationId, caseId, orderByComparator);
	}

	/**
	 * Removes all the ncbj application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetNcbj_By_CaseId(String caseId) {
		getPersistence().removeBygetNcbj_By_CaseId(caseId);
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj application stageses
	 */
	public static int countBygetNcbj_By_CaseId(String caseId) {
		return getPersistence().countBygetNcbj_By_CaseId(caseId);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findBygetNcbj_App_By_CaseId(
			String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetNcbj_App_By_CaseId(caseId);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_App_By_CaseId(
		String caseId) {

		return getPersistence().fetchBygetNcbj_App_By_CaseId(caseId);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetNcbj_App_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbj_App_By_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the ncbj application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj application stages that was removed
	 */
	public static NcbjApplicationStages removeBygetNcbj_App_By_CaseId(
			String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().removeBygetNcbj_App_By_CaseId(caseId);
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj application stageses
	 */
	public static int countBygetNcbj_App_By_CaseId(String caseId) {
		return getPersistence().countBygetNcbj_App_By_CaseId(caseId);
	}

	/**
	 * Returns all the ncbj application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName) {

		return getPersistence().findBygetQuarry_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the ncbj application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetQuarry_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().findBygetQuarry_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findBygetQuarry_By_StageName_First(
			String stageName,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetQuarry_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetQuarry_By_StageName_First(
		String stageName,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetQuarry_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages findBygetQuarry_By_StageName_Last(
			String stageName,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetQuarry_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	public static NcbjApplicationStages fetchBygetQuarry_By_StageName_Last(
		String stageName,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetQuarry_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public static NcbjApplicationStages[]
			findBygetQuarry_By_StageName_PrevAndNext(
				long ncbjStagesApplicationId, String stageName,
				OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findBygetQuarry_By_StageName_PrevAndNext(
			ncbjStagesApplicationId, stageName, orderByComparator);
	}

	/**
	 * Removes all the ncbj application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetQuarry_By_StageName(String stageName) {
		getPersistence().removeBygetQuarry_By_StageName(stageName);
	}

	/**
	 * Returns the number of ncbj application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching ncbj application stageses
	 */
	public static int countBygetQuarry_By_StageName(String stageName) {
		return getPersistence().countBygetQuarry_By_StageName(stageName);
	}

	/**
	 * Caches the ncbj application stages in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 */
	public static void cacheResult(
		NcbjApplicationStages ncbjApplicationStages) {

		getPersistence().cacheResult(ncbjApplicationStages);
	}

	/**
	 * Caches the ncbj application stageses in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationStageses the ncbj application stageses
	 */
	public static void cacheResult(
		List<NcbjApplicationStages> ncbjApplicationStageses) {

		getPersistence().cacheResult(ncbjApplicationStageses);
	}

	/**
	 * Creates a new ncbj application stages with the primary key. Does not add the ncbj application stages to the database.
	 *
	 * @param ncbjStagesApplicationId the primary key for the new ncbj application stages
	 * @return the new ncbj application stages
	 */
	public static NcbjApplicationStages create(long ncbjStagesApplicationId) {
		return getPersistence().create(ncbjStagesApplicationId);
	}

	/**
	 * Removes the ncbj application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages that was removed
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public static NcbjApplicationStages remove(long ncbjStagesApplicationId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().remove(ncbjStagesApplicationId);
	}

	public static NcbjApplicationStages updateImpl(
		NcbjApplicationStages ncbjApplicationStages) {

		return getPersistence().updateImpl(ncbjApplicationStages);
	}

	/**
	 * Returns the ncbj application stages with the primary key or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	public static NcbjApplicationStages findByPrimaryKey(
			long ncbjStagesApplicationId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjApplicationStagesException {

		return getPersistence().findByPrimaryKey(ncbjStagesApplicationId);
	}

	/**
	 * Returns the ncbj application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages, or <code>null</code> if a ncbj application stages with the primary key could not be found
	 */
	public static NcbjApplicationStages fetchByPrimaryKey(
		long ncbjStagesApplicationId) {

		return getPersistence().fetchByPrimaryKey(ncbjStagesApplicationId);
	}

	/**
	 * Returns all the ncbj application stageses.
	 *
	 * @return the ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj application stageses
	 */
	public static List<NcbjApplicationStages> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj application stageses.
	 *
	 * @return the number of ncbj application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjApplicationStagesPersistence _persistence;

}