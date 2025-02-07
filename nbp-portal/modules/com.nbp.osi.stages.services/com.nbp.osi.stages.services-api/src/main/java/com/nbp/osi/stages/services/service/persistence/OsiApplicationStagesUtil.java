/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.stages.services.model.OsiApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi application stages service. This utility wraps <code>com.nbp.osi.stages.services.service.persistence.impl.OsiApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationStagesPersistence
 * @generated
 */
public class OsiApplicationStagesUtil {

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
	public static void clearCache(OsiApplicationStages osiApplicationStages) {
		getPersistence().clearCache(osiApplicationStages);
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
	public static Map<Serializable, OsiApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiApplicationStages update(
		OsiApplicationStages osiApplicationStages) {

		return getPersistence().update(osiApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiApplicationStages update(
		OsiApplicationStages osiApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(osiApplicationStages, serviceContext);
	}

	/**
	 * Returns all the osi application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi application stageses
	 */
	public static List<OsiApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the osi application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where uuid = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages[] findByUuid_PrevAndNext(
			long OsiApplicationStagesId, String uuid,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			OsiApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the osi application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of osi application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the osi application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findByUUID_G(String uuid, long groupId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the osi application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi application stages that was removed
	 */
	public static OsiApplicationStages removeByUUID_G(String uuid, long groupId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of osi application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi application stageses
	 */
	public static List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages[] findByUuid_C_PrevAndNext(
			long OsiApplicationStagesId, String uuid, long companyId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			OsiApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the osi application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of osi application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the osi application stages where osiApplicationId = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findBygetOAS_OAI(long osiApplicationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_OAI(osiApplicationId);
	}

	/**
	 * Returns the osi application stages where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_OAI(
		long osiApplicationId) {

		return getPersistence().fetchBygetOAS_OAI(osiApplicationId);
	}

	/**
	 * Returns the osi application stages where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_OAI(
		long osiApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOAS_OAI(
			osiApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi application stages where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the osi application stages that was removed
	 */
	public static OsiApplicationStages removeBygetOAS_OAI(long osiApplicationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().removeBygetOAS_OAI(osiApplicationId);
	}

	/**
	 * Returns the number of osi application stageses where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi application stageses
	 */
	public static int countBygetOAS_OAI(long osiApplicationId) {
		return getPersistence().countBygetOAS_OAI(osiApplicationId);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetCAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the osi application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the osi application stages that was removed
	 */
	public static OsiApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().removeBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of osi application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching osi application stageses
	 */
	public static int countBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns all the osi application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching osi application stageses
	 */
	public static List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName) {

		return getPersistence().findBygetOAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the osi application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetOAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().findBygetOAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findBygetOAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findBygetOAS_StageName_First(
			String stageName,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_StageName_First(
		String stageName,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findBygetOAS_StageName_Last(
			String stageName,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_StageName_Last(
		String stageName,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where stageName = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages[] findBygetOAS_StageName_PrevAndNext(
			long OsiApplicationStagesId, String stageName,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_StageName_PrevAndNext(
			OsiApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the osi application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetOAS_StageName(String stageName) {
		getPersistence().removeBygetOAS_StageName(stageName);
	}

	/**
	 * Returns the number of osi application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching osi application stageses
	 */
	public static int countBygetOAS_StageName(String stageName) {
		return getPersistence().countBygetOAS_StageName(stageName);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findBygetOAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetOAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetOAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the osi application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the osi application stages that was removed
	 */
	public static OsiApplicationStages removeBygetOAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().removeBygetOAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of osi application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi application stageses
	 */
	public static int countBygetOAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetOAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findBygetOAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetOAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the osi application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetOAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the osi application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the osi application stages that was removed
	 */
	public static OsiApplicationStages removeBygetOAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().removeBygetOAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of osi application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching osi application stageses
	 */
	public static int countBygetOAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetOAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi application stageses
	 */
	public static List<OsiApplicationStages>
		findBygetOAS_StageNamendStageStatus(
			String stageName, String stageStatus) {

		return getPersistence().findBygetOAS_StageNamendStageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns a range of all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public static List<OsiApplicationStages>
		findBygetOAS_StageNamendStageStatus(
			String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetOAS_StageNamendStageStatus(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages>
		findBygetOAS_StageNamendStageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().findBygetOAS_StageNamendStageStatus(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages>
		findBygetOAS_StageNamendStageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<OsiApplicationStages> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetOAS_StageNamendStageStatus(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages
			findBygetOAS_StageNamendStageStatus_First(
				String stageName, String stageStatus,
				OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_StageNamendStageStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages
		fetchBygetOAS_StageNamendStageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOAS_StageNamendStageStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findBygetOAS_StageNamendStageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_StageNamendStageStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages
		fetchBygetOAS_StageNamendStageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOAS_StageNamendStageStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages[]
			findBygetOAS_StageNamendStageStatus_PrevAndNext(
				long OsiApplicationStagesId, String stageName,
				String stageStatus,
				OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_StageNamendStageStatus_PrevAndNext(
			OsiApplicationStagesId, stageName, stageStatus, orderByComparator);
	}

	/**
	 * Removes all the osi application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus) {

		getPersistence().removeBygetOAS_StageNamendStageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the number of osi application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi application stageses
	 */
	public static int countBygetOAS_StageNamendStageStatus(
		String stageName, String stageStatus) {

		return getPersistence().countBygetOAS_StageNamendStageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns all the osi application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application stageses
	 */
	public static List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId) {

		return getPersistence().findBygetOAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the osi application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetOAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().findBygetOAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi application stageses
	 */
	public static List<OsiApplicationStages> findBygetOAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findBygetOAS_CaseId_First(
			String caseId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_CaseId_First(
		String caseId,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages findBygetOAS_CaseId_Last(
			String caseId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application stages, or <code>null</code> if a matching osi application stages could not be found
	 */
	public static OsiApplicationStages fetchBygetOAS_CaseId_Last(
		String caseId,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the osi application stageses before and after the current osi application stages in the ordered set where caseId = &#63;.
	 *
	 * @param OsiApplicationStagesId the primary key of the current osi application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages[] findBygetOAS_CaseId_PrevAndNext(
			long OsiApplicationStagesId, String caseId,
			OrderByComparator<OsiApplicationStages> orderByComparator)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findBygetOAS_CaseId_PrevAndNext(
			OsiApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the osi application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetOAS_CaseId(String caseId) {
		getPersistence().removeBygetOAS_CaseId(caseId);
	}

	/**
	 * Returns the number of osi application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi application stageses
	 */
	public static int countBygetOAS_CaseId(String caseId) {
		return getPersistence().countBygetOAS_CaseId(caseId);
	}

	/**
	 * Caches the osi application stages in the entity cache if it is enabled.
	 *
	 * @param osiApplicationStages the osi application stages
	 */
	public static void cacheResult(OsiApplicationStages osiApplicationStages) {
		getPersistence().cacheResult(osiApplicationStages);
	}

	/**
	 * Caches the osi application stageses in the entity cache if it is enabled.
	 *
	 * @param osiApplicationStageses the osi application stageses
	 */
	public static void cacheResult(
		List<OsiApplicationStages> osiApplicationStageses) {

		getPersistence().cacheResult(osiApplicationStageses);
	}

	/**
	 * Creates a new osi application stages with the primary key. Does not add the osi application stages to the database.
	 *
	 * @param OsiApplicationStagesId the primary key for the new osi application stages
	 * @return the new osi application stages
	 */
	public static OsiApplicationStages create(long OsiApplicationStagesId) {
		return getPersistence().create(OsiApplicationStagesId);
	}

	/**
	 * Removes the osi application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages that was removed
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages remove(long OsiApplicationStagesId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().remove(OsiApplicationStagesId);
	}

	public static OsiApplicationStages updateImpl(
		OsiApplicationStages osiApplicationStages) {

		return getPersistence().updateImpl(osiApplicationStages);
	}

	/**
	 * Returns the osi application stages with the primary key or throws a <code>NoSuchOsiApplicationStagesException</code> if it could not be found.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages
	 * @throws NoSuchOsiApplicationStagesException if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages findByPrimaryKey(
			long OsiApplicationStagesId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiApplicationStagesException {

		return getPersistence().findByPrimaryKey(OsiApplicationStagesId);
	}

	/**
	 * Returns the osi application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param OsiApplicationStagesId the primary key of the osi application stages
	 * @return the osi application stages, or <code>null</code> if a osi application stages with the primary key could not be found
	 */
	public static OsiApplicationStages fetchByPrimaryKey(
		long OsiApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(OsiApplicationStagesId);
	}

	/**
	 * Returns all the osi application stageses.
	 *
	 * @return the osi application stageses
	 */
	public static List<OsiApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @return the range of osi application stageses
	 */
	public static List<OsiApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi application stageses
	 */
	public static List<OsiApplicationStages> findAll(
		int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application stageses
	 * @param end the upper bound of the range of osi application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi application stageses
	 */
	public static List<OsiApplicationStages> findAll(
		int start, int end,
		OrderByComparator<OsiApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi application stageses.
	 *
	 * @return the number of osi application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiApplicationStagesPersistence _persistence;

}