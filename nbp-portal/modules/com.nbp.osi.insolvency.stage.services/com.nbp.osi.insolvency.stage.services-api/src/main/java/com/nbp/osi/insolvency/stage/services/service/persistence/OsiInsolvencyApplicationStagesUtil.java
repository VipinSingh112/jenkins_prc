/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi insolvency application stages service. This utility wraps <code>com.nbp.osi.insolvency.stage.services.service.persistence.impl.OsiInsolvencyApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationStagesPersistence
 * @generated
 */
public class OsiInsolvencyApplicationStagesUtil {

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
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		getPersistence().clearCache(osiInsolvencyApplicationStages);
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
	public static Map<Serializable, OsiInsolvencyApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiInsolvencyApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiInsolvencyApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiInsolvencyApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiInsolvencyApplicationStages update(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		return getPersistence().update(osiInsolvencyApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiInsolvencyApplicationStages update(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiInsolvencyApplicationStages, serviceContext);
	}

	/**
	 * Returns all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where uuid = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages[] findByUuid_PrevAndNext(
			long osiInsolveApplicationStagesId, String uuid,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			osiInsolveApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the osi insolvency application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of osi insolvency application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the osi insolvency application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi insolvency application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the osi insolvency application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the osi insolvency application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi insolvency application stages that was removed
	 */
	public static OsiInsolvencyApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of osi insolvency application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages[] findByUuid_C_PrevAndNext(
			long osiInsolveApplicationStagesId, String uuid, long companyId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			osiInsolveApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the osi insolvency application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of osi insolvency application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the osi insolvency application stages where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findBygetOIAS_OAI(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_OAI(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency application stages where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetOIAS_OAI(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOIAS_OAI(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency application stages where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetOIAS_OAI(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOIAS_OAI(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the osi insolvency application stages where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency application stages that was removed
	 */
	public static OsiInsolvencyApplicationStages removeBygetOIAS_OAI(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().removeBygetOIAS_OAI(osiInsolvencyId);
	}

	/**
	 * Returns the number of osi insolvency application stageses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countBygetOIAS_OAI(long osiInsolvencyId) {
		return getPersistence().countBygetOIAS_OAI(osiInsolvencyId);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetCAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetCAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the osi insolvency application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the osi insolvency application stages that was removed
	 */
	public static OsiInsolvencyApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().removeBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetCAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findBygetOIAS_StageName(
		String stageName) {

		return getPersistence().findBygetOIAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findBygetOIAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetOIAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findBygetOIAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().findBygetOIAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findBygetOIAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOIAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findBygetOIAS_StageName_First(
			String stageName,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetOIAS_StageName_First(
		String stageName,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOIAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findBygetOIAS_StageName_Last(
			String stageName,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetOIAS_StageName_Last(
		String stageName,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOIAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where stageName = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages[]
			findBygetOIAS_StageName_PrevAndNext(
				long osiInsolveApplicationStagesId, String stageName,
				OrderByComparator<OsiInsolvencyApplicationStages>
					orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_StageName_PrevAndNext(
			osiInsolveApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the osi insolvency application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetOIAS_StageName(String stageName) {
		getPersistence().removeBygetOIAS_StageName(stageName);
	}

	/**
	 * Returns the number of osi insolvency application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countBygetOIAS_StageName(String stageName) {
		return getPersistence().countBygetOIAS_StageName(stageName);
	}

	/**
	 * Returns all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus) {

		return getPersistence().findBygetOIAS_StageName_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetOIAS_StageName_StageStatus(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<OsiInsolvencyApplicationStages>
				orderByComparator) {

		return getPersistence().findBygetOIAS_StageName_StageStatus(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages>
		findBygetOIAS_StageName_StageStatus(
			String stageName, String stageStatus, int start, int end,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetOIAS_StageName_StageStatus(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages
			findBygetOIAS_StageName_StageStatus_First(
				String stageName, String stageStatus,
				OrderByComparator<OsiInsolvencyApplicationStages>
					orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_StageName_StageStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages
		fetchBygetOIAS_StageName_StageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<OsiInsolvencyApplicationStages>
				orderByComparator) {

		return getPersistence().fetchBygetOIAS_StageName_StageStatus_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages
			findBygetOIAS_StageName_StageStatus_Last(
				String stageName, String stageStatus,
				OrderByComparator<OsiInsolvencyApplicationStages>
					orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_StageName_StageStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages
		fetchBygetOIAS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<OsiInsolvencyApplicationStages>
				orderByComparator) {

		return getPersistence().fetchBygetOIAS_StageName_StageStatus_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages[]
			findBygetOIAS_StageName_StageStatus_PrevAndNext(
				long osiInsolveApplicationStagesId, String stageName,
				String stageStatus,
				OrderByComparator<OsiInsolvencyApplicationStages>
					orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_StageName_StageStatus_PrevAndNext(
			osiInsolveApplicationStagesId, stageName, stageStatus,
			orderByComparator);
	}

	/**
	 * Removes all the osi insolvency application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetOIAS_StageName_StageStatus(
		String stageName, String stageStatus) {

		getPersistence().removeBygetOIAS_StageName_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the number of osi insolvency application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countBygetOIAS_StageName_StageStatus(
		String stageName, String stageStatus) {

		return getPersistence().countBygetOIAS_StageName_StageStatus(
			stageName, stageStatus);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages
			findBygetOIAS_CaseIdStageStatus(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages
		fetchBygetOIAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetOIAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages
		fetchBygetOIAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus,
			boolean useFinderCache) {

		return getPersistence().fetchBygetOIAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the osi insolvency application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the osi insolvency application stages that was removed
	 */
	public static OsiInsolvencyApplicationStages
			removeBygetOIAS_CaseIdStageStatus(
				String caseId, String stageName, String stageStatus)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().removeBygetOIAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countBygetOIAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetOIAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findBygetOIAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetOIAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetOIAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetOIAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the osi insolvency application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the osi insolvency application stages that was removed
	 */
	public static OsiInsolvencyApplicationStages
			removeBygetOIAS_CaseIdAndStatus(String caseId, String stageStatus)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().removeBygetOIAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countBygetOIAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetOIAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId) {

		return getPersistence().findBygetOIAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetOIAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().findBygetOIAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findBygetOIAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOIAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findBygetOIAS_CaseId_First(
			String caseId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetOIAS_CaseId_First(
		String caseId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOIAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages findBygetOIAS_CaseId_Last(
			String caseId,
			OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application stages, or <code>null</code> if a matching osi insolvency application stages could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchBygetOIAS_CaseId_Last(
		String caseId,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetOIAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the osi insolvency application stageses before and after the current osi insolvency application stages in the ordered set where caseId = &#63;.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the current osi insolvency application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages[]
			findBygetOIAS_CaseId_PrevAndNext(
				long osiInsolveApplicationStagesId, String caseId,
				OrderByComparator<OsiInsolvencyApplicationStages>
					orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findBygetOIAS_CaseId_PrevAndNext(
			osiInsolveApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the osi insolvency application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetOIAS_CaseId(String caseId) {
		getPersistence().removeBygetOIAS_CaseId(caseId);
	}

	/**
	 * Returns the number of osi insolvency application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency application stageses
	 */
	public static int countBygetOIAS_CaseId(String caseId) {
		return getPersistence().countBygetOIAS_CaseId(caseId);
	}

	/**
	 * Caches the osi insolvency application stages in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationStages the osi insolvency application stages
	 */
	public static void cacheResult(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		getPersistence().cacheResult(osiInsolvencyApplicationStages);
	}

	/**
	 * Caches the osi insolvency application stageses in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplicationStageses the osi insolvency application stageses
	 */
	public static void cacheResult(
		List<OsiInsolvencyApplicationStages> osiInsolvencyApplicationStageses) {

		getPersistence().cacheResult(osiInsolvencyApplicationStageses);
	}

	/**
	 * Creates a new osi insolvency application stages with the primary key. Does not add the osi insolvency application stages to the database.
	 *
	 * @param osiInsolveApplicationStagesId the primary key for the new osi insolvency application stages
	 * @return the new osi insolvency application stages
	 */
	public static OsiInsolvencyApplicationStages create(
		long osiInsolveApplicationStagesId) {

		return getPersistence().create(osiInsolveApplicationStagesId);
	}

	/**
	 * Removes the osi insolvency application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages that was removed
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages remove(
			long osiInsolveApplicationStagesId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().remove(osiInsolveApplicationStagesId);
	}

	public static OsiInsolvencyApplicationStages updateImpl(
		OsiInsolvencyApplicationStages osiInsolvencyApplicationStages) {

		return getPersistence().updateImpl(osiInsolvencyApplicationStages);
	}

	/**
	 * Returns the osi insolvency application stages with the primary key or throws a <code>NoSuchOsiInsolvencyApplicationStagesException</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages
	 * @throws NoSuchOsiInsolvencyApplicationStagesException if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages findByPrimaryKey(
			long osiInsolveApplicationStagesId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyApplicationStagesException {

		return getPersistence().findByPrimaryKey(osiInsolveApplicationStagesId);
	}

	/**
	 * Returns the osi insolvency application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolveApplicationStagesId the primary key of the osi insolvency application stages
	 * @return the osi insolvency application stages, or <code>null</code> if a osi insolvency application stages with the primary key could not be found
	 */
	public static OsiInsolvencyApplicationStages fetchByPrimaryKey(
		long osiInsolveApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(
			osiInsolveApplicationStagesId);
	}

	/**
	 * Returns all the osi insolvency application stageses.
	 *
	 * @return the osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @return the range of osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolvency application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency application stageses
	 * @param end the upper bound of the range of osi insolvency application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency application stageses
	 */
	public static List<OsiInsolvencyApplicationStages> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi insolvency application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi insolvency application stageses.
	 *
	 * @return the number of osi insolvency application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiInsolvencyApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiInsolvencyApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiInsolvencyApplicationStagesPersistence
		_persistence;

}