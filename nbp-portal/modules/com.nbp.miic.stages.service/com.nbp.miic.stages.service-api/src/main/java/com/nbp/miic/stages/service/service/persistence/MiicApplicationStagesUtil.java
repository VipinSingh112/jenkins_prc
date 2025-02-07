/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.stages.service.model.MiicApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic application stages service. This utility wraps <code>com.nbp.miic.stages.service.service.persistence.impl.MiicApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicationStagesPersistence
 * @generated
 */
public class MiicApplicationStagesUtil {

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
	public static void clearCache(MiicApplicationStages miicApplicationStages) {
		getPersistence().clearCache(miicApplicationStages);
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
	public static Map<Serializable, MiicApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicApplicationStages update(
		MiicApplicationStages miicApplicationStages) {

		return getPersistence().update(miicApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicApplicationStages update(
		MiicApplicationStages miicApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(miicApplicationStages, serviceContext);
	}

	/**
	 * Returns all the miic application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching miic application stageses
	 */
	public static List<MiicApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the miic application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where uuid = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public static MiicApplicationStages[] findByUuid_PrevAndNext(
			long miicApplicationStagesId, String uuid,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			miicApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the miic application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of miic application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching miic application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the miic application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findByUUID_G(String uuid, long groupId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the miic application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the miic application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the miic application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the miic application stages that was removed
	 */
	public static MiicApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of miic application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching miic application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching miic application stageses
	 */
	public static List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public static MiicApplicationStages[] findByUuid_C_PrevAndNext(
			long miicApplicationStagesId, String uuid, long companyId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			miicApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the miic application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of miic application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching miic application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the miic application stages where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findBygetMIIC_CAI(
			long miicApplicationId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_CAI(miicApplicationId);
	}

	/**
	 * Returns the miic application stages where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CAI(
		long miicApplicationId) {

		return getPersistence().fetchBygetMIIC_CAI(miicApplicationId);
	}

	/**
	 * Returns the miic application stages where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CAI(
		long miicApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMIIC_CAI(
			miicApplicationId, useFinderCache);
	}

	/**
	 * Removes the miic application stages where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic application stages that was removed
	 */
	public static MiicApplicationStages removeBygetMIIC_CAI(
			long miicApplicationId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().removeBygetMIIC_CAI(miicApplicationId);
	}

	/**
	 * Returns the number of miic application stageses where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic application stageses
	 */
	public static int countBygetMIIC_CAI(long miicApplicationId) {
		return getPersistence().countBygetMIIC_CAI(miicApplicationId);
	}

	/**
	 * Returns all the miic application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching miic application stageses
	 */
	public static List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName) {

		return getPersistence().findBygetMIIC_StageName(stageName);
	}

	/**
	 * Returns a range of all the miic application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetMIIC_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().findBygetMIIC_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findBygetMIIC_StageName(
		String stageName, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMIIC_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findBygetMIIC_StageName_First(
			String stageName,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_StageName_First(
		String stageName,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMIIC_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findBygetMIIC_StageName_Last(
			String stageName,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_StageName_Last(
		String stageName,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMIIC_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where stageName = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public static MiicApplicationStages[] findBygetMIIC_StageName_PrevAndNext(
			long miicApplicationStagesId, String stageName,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_StageName_PrevAndNext(
			miicApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the miic application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetMIIC_StageName(String stageName) {
		getPersistence().removeBygetMIIC_StageName(stageName);
	}

	/**
	 * Returns the number of miic application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching miic application stageses
	 */
	public static int countBygetMIIC_StageName(String stageName) {
		return getPersistence().countBygetMIIC_StageName(stageName);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findBygetMIIC_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetMIIC_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetMIIC_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the miic application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the miic application stages that was removed
	 */
	public static MiicApplicationStages removeBygetMIIC_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().removeBygetMIIC_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching miic application stageses
	 */
	public static int countBygetMIIC_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetMIIC_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findBygetMIIC_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetMIIC_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetMIIC_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the miic application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the miic application stages that was removed
	 */
	public static MiicApplicationStages removeBygetMIIC_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().removeBygetMIIC_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching miic application stageses
	 */
	public static int countBygetMIIC_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetMIIC_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findBygetMIIC_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetMIIC_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetMIIC_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the miic application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the miic application stages that was removed
	 */
	public static MiicApplicationStages removeBygetMIIC_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().removeBygetMIIC_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching miic application stageses
	 */
	public static int countBygetMIIC_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetMIIC_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the miic application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application stageses
	 */
	public static List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId) {

		return getPersistence().findBygetMIIC_CaseId(caseId);
	}

	/**
	 * Returns a range of all the miic application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetMIIC_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().findBygetMIIC_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic application stageses
	 */
	public static List<MiicApplicationStages> findBygetMIIC_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMIIC_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findBygetMIIC_CaseId_First(
			String caseId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CaseId_First(
		String caseId,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMIIC_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findBygetMIIC_CaseId_Last(
			String caseId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_CaseId_Last(
		String caseId,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMIIC_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the miic application stageses before and after the current miic application stages in the ordered set where caseId = &#63;.
	 *
	 * @param miicApplicationStagesId the primary key of the current miic application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public static MiicApplicationStages[] findBygetMIIC_CaseId_PrevAndNext(
			long miicApplicationStagesId, String caseId,
			OrderByComparator<MiicApplicationStages> orderByComparator)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_CaseId_PrevAndNext(
			miicApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the miic application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetMIIC_CaseId(String caseId) {
		getPersistence().removeBygetMIIC_CaseId(caseId);
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic application stageses
	 */
	public static int countBygetMIIC_CaseId(String caseId) {
		return getPersistence().countBygetMIIC_CaseId(caseId);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages findBygetMIIC_By_CaseId(String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findBygetMIIC_By_CaseId(caseId);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_By_CaseId(
		String caseId) {

		return getPersistence().fetchBygetMIIC_By_CaseId(caseId);
	}

	/**
	 * Returns the miic application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application stages, or <code>null</code> if a matching miic application stages could not be found
	 */
	public static MiicApplicationStages fetchBygetMIIC_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMIIC_By_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the miic application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic application stages that was removed
	 */
	public static MiicApplicationStages removeBygetMIIC_By_CaseId(String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().removeBygetMIIC_By_CaseId(caseId);
	}

	/**
	 * Returns the number of miic application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic application stageses
	 */
	public static int countBygetMIIC_By_CaseId(String caseId) {
		return getPersistence().countBygetMIIC_By_CaseId(caseId);
	}

	/**
	 * Caches the miic application stages in the entity cache if it is enabled.
	 *
	 * @param miicApplicationStages the miic application stages
	 */
	public static void cacheResult(
		MiicApplicationStages miicApplicationStages) {

		getPersistence().cacheResult(miicApplicationStages);
	}

	/**
	 * Caches the miic application stageses in the entity cache if it is enabled.
	 *
	 * @param miicApplicationStageses the miic application stageses
	 */
	public static void cacheResult(
		List<MiicApplicationStages> miicApplicationStageses) {

		getPersistence().cacheResult(miicApplicationStageses);
	}

	/**
	 * Creates a new miic application stages with the primary key. Does not add the miic application stages to the database.
	 *
	 * @param miicApplicationStagesId the primary key for the new miic application stages
	 * @return the new miic application stages
	 */
	public static MiicApplicationStages create(long miicApplicationStagesId) {
		return getPersistence().create(miicApplicationStagesId);
	}

	/**
	 * Removes the miic application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages that was removed
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public static MiicApplicationStages remove(long miicApplicationStagesId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().remove(miicApplicationStagesId);
	}

	public static MiicApplicationStages updateImpl(
		MiicApplicationStages miicApplicationStages) {

		return getPersistence().updateImpl(miicApplicationStages);
	}

	/**
	 * Returns the miic application stages with the primary key or throws a <code>NoSuchMiicApplicationStagesException</code> if it could not be found.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages
	 * @throws NoSuchMiicApplicationStagesException if a miic application stages with the primary key could not be found
	 */
	public static MiicApplicationStages findByPrimaryKey(
			long miicApplicationStagesId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicApplicationStagesException {

		return getPersistence().findByPrimaryKey(miicApplicationStagesId);
	}

	/**
	 * Returns the miic application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicationStagesId the primary key of the miic application stages
	 * @return the miic application stages, or <code>null</code> if a miic application stages with the primary key could not be found
	 */
	public static MiicApplicationStages fetchByPrimaryKey(
		long miicApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(miicApplicationStagesId);
	}

	/**
	 * Returns all the miic application stageses.
	 *
	 * @return the miic application stageses
	 */
	public static List<MiicApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @return the range of miic application stageses
	 */
	public static List<MiicApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic application stageses
	 */
	public static List<MiicApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic application stageses
	 * @param end the upper bound of the range of miic application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic application stageses
	 */
	public static List<MiicApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MiicApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic application stageses.
	 *
	 * @return the number of miic application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiicApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiicApplicationStagesPersistence _persistence;

}