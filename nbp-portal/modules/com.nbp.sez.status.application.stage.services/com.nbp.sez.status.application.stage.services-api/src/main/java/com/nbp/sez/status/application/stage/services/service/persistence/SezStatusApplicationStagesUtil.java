/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.stage.services.model.SezStatusApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status application stages service. This utility wraps <code>com.nbp.sez.status.application.stage.services.service.persistence.impl.SezStatusApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationStagesPersistence
 * @generated
 */
public class SezStatusApplicationStagesUtil {

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
		SezStatusApplicationStages sezStatusApplicationStages) {

		getPersistence().clearCache(sezStatusApplicationStages);
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
	public static Map<Serializable, SezStatusApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusApplicationStages update(
		SezStatusApplicationStages sezStatusApplicationStages) {

		return getPersistence().update(sezStatusApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusApplicationStages update(
		SezStatusApplicationStages sezStatusApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezStatusApplicationStages, serviceContext);
	}

	/**
	 * Returns all the sez status application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the sez status application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where uuid = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public static SezStatusApplicationStages[] findByUuid_PrevAndNext(
			long SezStatusApplicationStagesId, String uuid,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			SezStatusApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the sez status application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of sez status application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the sez status application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the sez status application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status application stages that was removed
	 */
	public static SezStatusApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of sez status application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public static SezStatusApplicationStages[] findByUuid_C_PrevAndNext(
			long SezStatusApplicationStagesId, String uuid, long companyId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			SezStatusApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the sez status application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of sez status application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the sez status application stages where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findBygetSAS_SAI(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the sez status application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSAS_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the sez status application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSAS_SAI(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez status application stages where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status application stages that was removed
	 */
	public static SezStatusApplicationStages removeBygetSAS_SAI(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().removeBygetSAS_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez status application stageses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status application stageses
	 */
	public static int countBygetSAS_SAI(long sezStatusApplicationId) {
		return getPersistence().countBygetSAS_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetSAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetSAS_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the sez status application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the sez status application stages that was removed
	 */
	public static SezStatusApplicationStages removeBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().removeBygetSAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching sez status application stageses
	 */
	public static int countBygetSAS_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetSAS_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns all the sez status application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName) {

		return getPersistence().findBygetSAS_StageName(stageName);
	}

	/**
	 * Returns a range of all the sez status application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetSAS_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().findBygetSAS_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSAS_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findBygetSAS_StageName_First(
			String stageName,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_StageName_First(
		String stageName,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetSAS_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findBygetSAS_StageName_Last(
			String stageName,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_StageName_Last(
		String stageName,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetSAS_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where stageName = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public static SezStatusApplicationStages[]
			findBygetSAS_StageName_PrevAndNext(
				long SezStatusApplicationStagesId, String stageName,
				OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_StageName_PrevAndNext(
			SezStatusApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the sez status application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetSAS_StageName(String stageName) {
		getPersistence().removeBygetSAS_StageName(stageName);
	}

	/**
	 * Returns the number of sez status application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching sez status application stageses
	 */
	public static int countBygetSAS_StageName(String stageName) {
		return getPersistence().countBygetSAS_StageName(stageName);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the sez status application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the sez status application stages that was removed
	 */
	public static SezStatusApplicationStages removeBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().removeBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching sez status application stageses
	 */
	public static int countBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetSAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetSAS_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the sez status application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the sez status application stages that was removed
	 */
	public static SezStatusApplicationStages removeBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().removeBygetSAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching sez status application stageses
	 */
	public static int countBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetSAS_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the sez status application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId) {

		return getPersistence().findBygetSAS_CaseId(caseId);
	}

	/**
	 * Returns a range of all the sez status application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetSAS_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().findBygetSAS_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSAS_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findBygetSAS_CaseId_First(
			String caseId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_CaseId_First(
		String caseId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetSAS_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findBygetSAS_CaseId_Last(
			String caseId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_CaseId_Last(
		String caseId,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetSAS_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the sez status application stageses before and after the current sez status application stages in the ordered set where caseId = &#63;.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the current sez status application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public static SezStatusApplicationStages[] findBygetSAS_CaseId_PrevAndNext(
			long SezStatusApplicationStagesId, String caseId,
			OrderByComparator<SezStatusApplicationStages> orderByComparator)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_CaseId_PrevAndNext(
			SezStatusApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the sez status application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetSAS_CaseId(String caseId) {
		getPersistence().removeBygetSAS_CaseId(caseId);
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status application stageses
	 */
	public static int countBygetSAS_CaseId(String caseId) {
		return getPersistence().countBygetSAS_CaseId(caseId);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages findBygetSAS_By_CaseId(
			String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findBygetSAS_By_CaseId(caseId);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_By_CaseId(
		String caseId) {

		return getPersistence().fetchBygetSAS_By_CaseId(caseId);
	}

	/**
	 * Returns the sez status application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application stages, or <code>null</code> if a matching sez status application stages could not be found
	 */
	public static SezStatusApplicationStages fetchBygetSAS_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetSAS_By_CaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the sez status application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status application stages that was removed
	 */
	public static SezStatusApplicationStages removeBygetSAS_By_CaseId(
			String caseId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().removeBygetSAS_By_CaseId(caseId);
	}

	/**
	 * Returns the number of sez status application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status application stageses
	 */
	public static int countBygetSAS_By_CaseId(String caseId) {
		return getPersistence().countBygetSAS_By_CaseId(caseId);
	}

	/**
	 * Caches the sez status application stages in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationStages the sez status application stages
	 */
	public static void cacheResult(
		SezStatusApplicationStages sezStatusApplicationStages) {

		getPersistence().cacheResult(sezStatusApplicationStages);
	}

	/**
	 * Caches the sez status application stageses in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationStageses the sez status application stageses
	 */
	public static void cacheResult(
		List<SezStatusApplicationStages> sezStatusApplicationStageses) {

		getPersistence().cacheResult(sezStatusApplicationStageses);
	}

	/**
	 * Creates a new sez status application stages with the primary key. Does not add the sez status application stages to the database.
	 *
	 * @param SezStatusApplicationStagesId the primary key for the new sez status application stages
	 * @return the new sez status application stages
	 */
	public static SezStatusApplicationStages create(
		long SezStatusApplicationStagesId) {

		return getPersistence().create(SezStatusApplicationStagesId);
	}

	/**
	 * Removes the sez status application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages that was removed
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public static SezStatusApplicationStages remove(
			long SezStatusApplicationStagesId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().remove(SezStatusApplicationStagesId);
	}

	public static SezStatusApplicationStages updateImpl(
		SezStatusApplicationStages sezStatusApplicationStages) {

		return getPersistence().updateImpl(sezStatusApplicationStages);
	}

	/**
	 * Returns the sez status application stages with the primary key or throws a <code>NoSuchSezStatusApplicationStagesException</code> if it could not be found.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages
	 * @throws NoSuchSezStatusApplicationStagesException if a sez status application stages with the primary key could not be found
	 */
	public static SezStatusApplicationStages findByPrimaryKey(
			long SezStatusApplicationStagesId)
		throws com.nbp.sez.status.application.stage.services.exception.
			NoSuchSezStatusApplicationStagesException {

		return getPersistence().findByPrimaryKey(SezStatusApplicationStagesId);
	}

	/**
	 * Returns the sez status application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SezStatusApplicationStagesId the primary key of the sez status application stages
	 * @return the sez status application stages, or <code>null</code> if a sez status application stages with the primary key could not be found
	 */
	public static SezStatusApplicationStages fetchByPrimaryKey(
		long SezStatusApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(SezStatusApplicationStagesId);
	}

	/**
	 * Returns all the sez status application stageses.
	 *
	 * @return the sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @return the range of sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application stageses
	 * @param end the upper bound of the range of sez status application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status application stageses
	 */
	public static List<SezStatusApplicationStages> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status application stageses.
	 *
	 * @return the number of sez status application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusApplicationStagesPersistence _persistence;

}