/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.stages.services.model.CreativeApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative application stages service. This utility wraps <code>com.nbp.creative.stages.services.service.persistence.impl.CreativeApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationStagesPersistence
 * @generated
 */
public class CreativeApplicationStagesUtil {

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
		CreativeApplicationStages creativeApplicationStages) {

		getPersistence().clearCache(creativeApplicationStages);
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
	public static Map<Serializable, CreativeApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeApplicationStages update(
		CreativeApplicationStages creativeApplicationStages) {

		return getPersistence().update(creativeApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeApplicationStages update(
		CreativeApplicationStages creativeApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeApplicationStages, serviceContext);
	}

	/**
	 * Returns all the creative application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the creative application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages[] findByUuid_PrevAndNext(
			long creativeApplicationStagesId, String uuid,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			creativeApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the creative application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of creative application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching creative application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the creative application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the creative application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the creative application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the creative application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the creative application stages that was removed
	 */
	public static CreativeApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of creative application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching creative application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages[] findByUuid_C_PrevAndNext(
			long creativeApplicationStagesId, String uuid, long companyId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			creativeApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the creative application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching creative application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the creative application stages where creativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_CAI(
			long creativeApplicationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_CAI(creativeApplicationId);
	}

	/**
	 * Returns the creative application stages where creativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CAI(
		long creativeApplicationId) {

		return getPersistence().fetchBygetCAS_CAI(creativeApplicationId);
	}

	/**
	 * Returns the creative application stages where creativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CAI(
		long creativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CAI(
			creativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative application stages where creativeApplicationId = &#63; from the database.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the creative application stages that was removed
	 */
	public static CreativeApplicationStages removeBygetCAS_CAI(
			long creativeApplicationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().removeBygetCAS_CAI(creativeApplicationId);
	}

	/**
	 * Returns the number of creative application stageses where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative application stageses
	 */
	public static int countBygetCAS_CAI(long creativeApplicationId) {
		return getPersistence().countBygetCAS_CAI(creativeApplicationId);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the creative application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the creative application stages that was removed
	 */
	public static CreativeApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().removeBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of creative application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching creative application stageses
	 */
	public static int countBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns all the creative application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName) {

		return getPersistence().findBygetCAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the creative application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetCAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().findBygetCAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_StageName_First(
			String stageName,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_StageName_First(
		String stageName,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_StageName_Last(
			String stageName,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_StageName_Last(
		String stageName,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages[]
			findBygetCAS_StageName_PrevAndNext(
				long creativeApplicationStagesId, String stageName,
				OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_StageName_PrevAndNext(
			creativeApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the creative application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetCAS_StageName(String stageName) {
		getPersistence().removeBygetCAS_StageName(stageName);
	}

	/**
	 * Returns the number of creative application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching creative application stageses
	 */
	public static int countBygetCAS_StageName(String stageName) {
		return getPersistence().countBygetCAS_StageName(stageName);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the creative application stages that was removed
	 */
	public static CreativeApplicationStages removeBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().removeBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of creative application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching creative application stageses
	 */
	public static int countBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetCAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the creative application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the creative application stages that was removed
	 */
	public static CreativeApplicationStages removeBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().removeBygetCAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of creative application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching creative application stageses
	 */
	public static int countBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetCAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus) {

		return getPersistence().findBygetCAS_SNAndSS(stageName, stageStatus);
	}

	/**
	 * Returns a range of all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetCAS_SNAndSS(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().findBygetCAS_SNAndSS(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCAS_SNAndSS(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_SNAndSS_First(
			String stageName, String stageStatus,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_SNAndSS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_SNAndSS_First(
		String stageName, String stageStatus,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_SNAndSS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_SNAndSS_Last(
			String stageName, String stageStatus,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_SNAndSS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_SNAndSS_Last(
		String stageName, String stageStatus,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_SNAndSS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages[] findBygetCAS_SNAndSS_PrevAndNext(
			long creativeApplicationStagesId, String stageName,
			String stageStatus,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_SNAndSS_PrevAndNext(
			creativeApplicationStagesId, stageName, stageStatus,
			orderByComparator);
	}

	/**
	 * Removes all the creative application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetCAS_SNAndSS(
		String stageName, String stageStatus) {

		getPersistence().removeBygetCAS_SNAndSS(stageName, stageStatus);
	}

	/**
	 * Returns the number of creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching creative application stageses
	 */
	public static int countBygetCAS_SNAndSS(
		String stageName, String stageStatus) {

		return getPersistence().countBygetCAS_SNAndSS(stageName, stageStatus);
	}

	/**
	 * Returns all the creative application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId) {

		return getPersistence().findBygetCAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the creative application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetCAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().findBygetCAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	public static List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	public static CreativeApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetCAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long creativeApplicationStagesId, String caseId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findBygetCAS_CaseId_PrevAndNext(
			creativeApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the creative application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetCAS_CaseId(String caseId) {
		getPersistence().removeBygetCAS_CaseId(caseId);
	}

	/**
	 * Returns the number of creative application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative application stageses
	 */
	public static int countBygetCAS_CaseId(String caseId) {
		return getPersistence().countBygetCAS_CaseId(caseId);
	}

	/**
	 * Caches the creative application stages in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationStages the creative application stages
	 */
	public static void cacheResult(
		CreativeApplicationStages creativeApplicationStages) {

		getPersistence().cacheResult(creativeApplicationStages);
	}

	/**
	 * Caches the creative application stageses in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationStageses the creative application stageses
	 */
	public static void cacheResult(
		List<CreativeApplicationStages> creativeApplicationStageses) {

		getPersistence().cacheResult(creativeApplicationStageses);
	}

	/**
	 * Creates a new creative application stages with the primary key. Does not add the creative application stages to the database.
	 *
	 * @param creativeApplicationStagesId the primary key for the new creative application stages
	 * @return the new creative application stages
	 */
	public static CreativeApplicationStages create(
		long creativeApplicationStagesId) {

		return getPersistence().create(creativeApplicationStagesId);
	}

	/**
	 * Removes the creative application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages that was removed
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages remove(
			long creativeApplicationStagesId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().remove(creativeApplicationStagesId);
	}

	public static CreativeApplicationStages updateImpl(
		CreativeApplicationStages creativeApplicationStages) {

		return getPersistence().updateImpl(creativeApplicationStages);
	}

	/**
	 * Returns the creative application stages with the primary key or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages findByPrimaryKey(
			long creativeApplicationStagesId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeApplicationStagesException {

		return getPersistence().findByPrimaryKey(creativeApplicationStagesId);
	}

	/**
	 * Returns the creative application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages, or <code>null</code> if a creative application stages with the primary key could not be found
	 */
	public static CreativeApplicationStages fetchByPrimaryKey(
		long creativeApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(creativeApplicationStagesId);
	}

	/**
	 * Returns all the creative application stageses.
	 *
	 * @return the creative application stageses
	 */
	public static List<CreativeApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of creative application stageses
	 */
	public static List<CreativeApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative application stageses
	 */
	public static List<CreativeApplicationStages> findAll(
		int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative application stageses
	 */
	public static List<CreativeApplicationStages> findAll(
		int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative application stageses.
	 *
	 * @return the number of creative application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeApplicationStagesPersistence _persistence;

}