/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.stages.service.model.OSIServicesStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi services stages service. This utility wraps <code>com.nbp.osi.services.stages.service.service.persistence.impl.OSIServicesStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesStagesPersistence
 * @generated
 */
public class OSIServicesStagesUtil {

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
	public static void clearCache(OSIServicesStages osiServicesStages) {
		getPersistence().clearCache(osiServicesStages);
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
	public static Map<Serializable, OSIServicesStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OSIServicesStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OSIServicesStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OSIServicesStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OSIServicesStages update(
		OSIServicesStages osiServicesStages) {

		return getPersistence().update(osiServicesStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OSIServicesStages update(
		OSIServicesStages osiServicesStages, ServiceContext serviceContext) {

		return getPersistence().update(osiServicesStages, serviceContext);
	}

	/**
	 * Returns all the osi services stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services stageses
	 */
	public static List<OSIServicesStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the osi services stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findByUuid_First(
			String uuid, OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchByUuid_First(
		String uuid, OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findByUuid_Last(
			String uuid, OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchByUuid_Last(
		String uuid, OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public static OSIServicesStages[] findByUuid_PrevAndNext(
			long osiServicesStagesId, String uuid,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			osiServicesStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the osi services stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of osi services stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the osi services stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findByUUID_G(String uuid, long groupId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi services stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the osi services stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services stages that was removed
	 */
	public static OSIServicesStages removeByUUID_G(String uuid, long groupId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of osi services stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services stageses
	 */
	public static List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public static OSIServicesStages[] findByUuid_C_PrevAndNext(
			long osiServicesStagesId, String uuid, long companyId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			osiServicesStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the osi services stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the osi services stages where osiServciesApplicationId = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findBygetOSI_Service_OSIID(
			long osiServciesApplicationId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_OSIID(
			osiServciesApplicationId);
	}

	/**
	 * Returns the osi services stages where osiServciesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_OSIID(
		long osiServciesApplicationId) {

		return getPersistence().fetchBygetOSI_Service_OSIID(
			osiServciesApplicationId);
	}

	/**
	 * Returns the osi services stages where osiServciesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_OSIID(
		long osiServciesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSI_Service_OSIID(
			osiServciesApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi services stages where osiServciesApplicationId = &#63; from the database.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the osi services stages that was removed
	 */
	public static OSIServicesStages removeBygetOSI_Service_OSIID(
			long osiServciesApplicationId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().removeBygetOSI_Service_OSIID(
			osiServciesApplicationId);
	}

	/**
	 * Returns the number of osi services stageses where osiServciesApplicationId = &#63;.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the number of matching osi services stageses
	 */
	public static int countBygetOSI_Service_OSIID(
		long osiServciesApplicationId) {

		return getPersistence().countBygetOSI_Service_OSIID(
			osiServciesApplicationId);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findBygetOSI_Service_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetOSI_Service_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetOSI_Service_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the osi services stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the osi services stages that was removed
	 */
	public static OSIServicesStages removeBygetOSI_Service_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().removeBygetOSI_Service_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching osi services stageses
	 */
	public static int countBygetOSI_Service_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetOSI_Service_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns all the osi services stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching osi services stageses
	 */
	public static List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName) {

		return getPersistence().findBygetOSI_Service_StageName(stageName);
	}

	/**
	 * Returns a range of all the osi services stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetOSI_Service_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().findBygetOSI_Service_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSI_Service_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findBygetOSI_Service_StageName_First(
			String stageName,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_StageName_First(
		String stageName,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().fetchBygetOSI_Service_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findBygetOSI_Service_StageName_Last(
			String stageName,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_StageName_Last(
		String stageName,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().fetchBygetOSI_Service_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public static OSIServicesStages[]
			findBygetOSI_Service_StageName_PrevAndNext(
				long osiServicesStagesId, String stageName,
				OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_StageName_PrevAndNext(
			osiServicesStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the osi services stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetOSI_Service_StageName(String stageName) {
		getPersistence().removeBygetOSI_Service_StageName(stageName);
	}

	/**
	 * Returns the number of osi services stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching osi services stageses
	 */
	public static int countBygetOSI_Service_StageName(String stageName) {
		return getPersistence().countBygetOSI_Service_StageName(stageName);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findBygetOSI_Service_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetOSI_Service_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetOSI_Service_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the osi services stages that was removed
	 */
	public static OSIServicesStages removeBygetOSI_Service_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().removeBygetOSI_Service_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi services stageses
	 */
	public static int countBygetOSI_Service_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetOSI_Service_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findBygetOSI_Service_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetOSI_Service_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetOSI_Service_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the osi services stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the osi services stages that was removed
	 */
	public static OSIServicesStages removeBygetOSI_Service_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().removeBygetOSI_Service_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching osi services stageses
	 */
	public static int countBygetOSI_Service_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetOSI_Service_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the osi services stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services stageses
	 */
	public static List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId) {

		return getPersistence().findBygetOSI_Service_CaseId(caseId);
	}

	/**
	 * Returns a range of all the osi services stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetOSI_Service_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().findBygetOSI_Service_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	public static List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOSI_Service_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findBygetOSI_Service_CaseId_First(
			String caseId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_CaseId_First(
		String caseId, OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().fetchBygetOSI_Service_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findBygetOSI_Service_CaseId_Last(
			String caseId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_CaseId_Last(
		String caseId, OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().fetchBygetOSI_Service_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public static OSIServicesStages[] findBygetOSI_Service_CaseId_PrevAndNext(
			long osiServicesStagesId, String caseId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_CaseId_PrevAndNext(
			osiServicesStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the osi services stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetOSI_Service_CaseId(String caseId) {
		getPersistence().removeBygetOSI_Service_CaseId(caseId);
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services stageses
	 */
	public static int countBygetOSI_Service_CaseId(String caseId) {
		return getPersistence().countBygetOSI_Service_CaseId(caseId);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	public static OSIServicesStages findBygetOSI_Service_By_CaseId(
			String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findBygetOSI_Service_By_CaseId(caseId);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_By_CaseId(
		String caseId) {

		return getPersistence().fetchBygetOSI_Service_By_CaseId(caseId);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	public static OSIServicesStages fetchBygetOSI_Service_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOSI_Service_By_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the osi services stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services stages that was removed
	 */
	public static OSIServicesStages removeBygetOSI_Service_By_CaseId(
			String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().removeBygetOSI_Service_By_CaseId(caseId);
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services stageses
	 */
	public static int countBygetOSI_Service_By_CaseId(String caseId) {
		return getPersistence().countBygetOSI_Service_By_CaseId(caseId);
	}

	/**
	 * Caches the osi services stages in the entity cache if it is enabled.
	 *
	 * @param osiServicesStages the osi services stages
	 */
	public static void cacheResult(OSIServicesStages osiServicesStages) {
		getPersistence().cacheResult(osiServicesStages);
	}

	/**
	 * Caches the osi services stageses in the entity cache if it is enabled.
	 *
	 * @param osiServicesStageses the osi services stageses
	 */
	public static void cacheResult(
		List<OSIServicesStages> osiServicesStageses) {

		getPersistence().cacheResult(osiServicesStageses);
	}

	/**
	 * Creates a new osi services stages with the primary key. Does not add the osi services stages to the database.
	 *
	 * @param osiServicesStagesId the primary key for the new osi services stages
	 * @return the new osi services stages
	 */
	public static OSIServicesStages create(long osiServicesStagesId) {
		return getPersistence().create(osiServicesStagesId);
	}

	/**
	 * Removes the osi services stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages that was removed
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public static OSIServicesStages remove(long osiServicesStagesId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().remove(osiServicesStagesId);
	}

	public static OSIServicesStages updateImpl(
		OSIServicesStages osiServicesStages) {

		return getPersistence().updateImpl(osiServicesStages);
	}

	/**
	 * Returns the osi services stages with the primary key or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	public static OSIServicesStages findByPrimaryKey(long osiServicesStagesId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesStagesException {

		return getPersistence().findByPrimaryKey(osiServicesStagesId);
	}

	/**
	 * Returns the osi services stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages, or <code>null</code> if a osi services stages with the primary key could not be found
	 */
	public static OSIServicesStages fetchByPrimaryKey(
		long osiServicesStagesId) {

		return getPersistence().fetchByPrimaryKey(osiServicesStagesId);
	}

	/**
	 * Returns all the osi services stageses.
	 *
	 * @return the osi services stageses
	 */
	public static List<OSIServicesStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of osi services stageses
	 */
	public static List<OSIServicesStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services stageses
	 */
	public static List<OSIServicesStages> findAll(
		int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services stageses
	 */
	public static List<OSIServicesStages> findAll(
		int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi services stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi services stageses.
	 *
	 * @return the number of osi services stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OSIServicesStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OSIServicesStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OSIServicesStagesPersistence _persistence;

}