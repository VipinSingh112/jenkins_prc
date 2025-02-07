/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.stages.service.model.ExplosiveApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the explosive application stages service. This utility wraps <code>com.nbp.explosives.competency.stages.service.service.persistence.impl.ExplosiveApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveApplicationStagesPersistence
 * @generated
 */
public class ExplosiveApplicationStagesUtil {

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
		ExplosiveApplicationStages explosiveApplicationStages) {

		getPersistence().clearCache(explosiveApplicationStages);
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
	public static Map<Serializable, ExplosiveApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExplosiveApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExplosiveApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExplosiveApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExplosiveApplicationStages update(
		ExplosiveApplicationStages explosiveApplicationStages) {

		return getPersistence().update(explosiveApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExplosiveApplicationStages update(
		ExplosiveApplicationStages explosiveApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			explosiveApplicationStages, serviceContext);
	}

	/**
	 * Returns all the explosive application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the explosive application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where uuid = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages[] findByUuid_PrevAndNext(
			long expApplicationStagesId, String uuid,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			expApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the explosive application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of explosive application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching explosive application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the explosive application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosive application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the explosive application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the explosive application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the explosive application stages that was removed
	 */
	public static ExplosiveApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of explosive application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching explosive application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages[] findByUuid_C_PrevAndNext(
			long expApplicationStagesId, String uuid, long companyId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			expApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the explosive application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of explosive application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching explosive application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the explosive application stages where explosiveApplicationId = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_CAI(
			long explosiveApplicationId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_CAI(explosiveApplicationId);
	}

	/**
	 * Returns the explosive application stages where explosiveApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CAI(
		long explosiveApplicationId) {

		return getPersistence().fetchBygetEXP_CAI(explosiveApplicationId);
	}

	/**
	 * Returns the explosive application stages where explosiveApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CAI(
		long explosiveApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetEXP_CAI(
			explosiveApplicationId, useFinderCache);
	}

	/**
	 * Removes the explosive application stages where explosiveApplicationId = &#63; from the database.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the explosive application stages that was removed
	 */
	public static ExplosiveApplicationStages removeBygetEXP_CAI(
			long explosiveApplicationId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().removeBygetEXP_CAI(explosiveApplicationId);
	}

	/**
	 * Returns the number of explosive application stageses where explosiveApplicationId = &#63;.
	 *
	 * @param explosiveApplicationId the explosive application ID
	 * @return the number of matching explosive application stageses
	 */
	public static int countBygetEXP_CAI(long explosiveApplicationId) {
		return getPersistence().countBygetEXP_CAI(explosiveApplicationId);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_CaseIdStageName(caseId, stageName);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetEXP_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetEXP_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the explosive application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the explosive application stages that was removed
	 */
	public static ExplosiveApplicationStages removeBygetEXP_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().removeBygetEXP_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching explosive application stageses
	 */
	public static int countBygetEXP_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetEXP_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns all the explosive application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName) {

		return getPersistence().findBygetEXP_StageName(stageName);
	}

	/**
	 * Returns a range of all the explosive application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetEXP_StageName(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().findBygetEXP_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_StageName(
		String stageName, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetEXP_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_StageName_First(
			String stageName,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_StageName_First(
		String stageName,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetEXP_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_StageName_Last(
			String stageName,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_StageName_Last(
		String stageName,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetEXP_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where stageName = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages[]
			findBygetEXP_StageName_PrevAndNext(
				long expApplicationStagesId, String stageName,
				OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_StageName_PrevAndNext(
			expApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the explosive application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetEXP_StageName(String stageName) {
		getPersistence().removeBygetEXP_StageName(stageName);
	}

	/**
	 * Returns the number of explosive application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching explosive application stageses
	 */
	public static int countBygetEXP_StageName(String stageName) {
		return getPersistence().countBygetEXP_StageName(stageName);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchBygetEXP_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchBygetEXP_CaseIdStageStatus(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the explosive application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the explosive application stages that was removed
	 */
	public static ExplosiveApplicationStages removeBygetEXP_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().removeBygetEXP_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching explosive application stageses
	 */
	public static int countBygetEXP_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countBygetEXP_CaseIdStageStatus(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetEXP_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetEXP_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the explosive application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the explosive application stages that was removed
	 */
	public static ExplosiveApplicationStages removeBygetEXP_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().removeBygetEXP_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching explosive application stageses
	 */
	public static int countBygetEXP_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetEXP_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus) {

		return getPersistence().findBygetEXP_SNAndSS(stageName, stageStatus);
	}

	/**
	 * Returns a range of all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus, int start, int end) {

		return getPersistence().findBygetEXP_SNAndSS(
			stageName, stageStatus, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().findBygetEXP_SNAndSS(
			stageName, stageStatus, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetEXP_SNAndSS(
			stageName, stageStatus, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_SNAndSS_First(
			String stageName, String stageStatus,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_SNAndSS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_SNAndSS_First(
		String stageName, String stageStatus,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetEXP_SNAndSS_First(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_SNAndSS_Last(
			String stageName, String stageStatus,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_SNAndSS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_SNAndSS_Last(
		String stageName, String stageStatus,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetEXP_SNAndSS_Last(
			stageName, stageStatus, orderByComparator);
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages[] findBygetEXP_SNAndSS_PrevAndNext(
			long expApplicationStagesId, String stageName, String stageStatus,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_SNAndSS_PrevAndNext(
			expApplicationStagesId, stageName, stageStatus, orderByComparator);
	}

	/**
	 * Removes all the explosive application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	public static void removeBygetEXP_SNAndSS(
		String stageName, String stageStatus) {

		getPersistence().removeBygetEXP_SNAndSS(stageName, stageStatus);
	}

	/**
	 * Returns the number of explosive application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching explosive application stageses
	 */
	public static int countBygetEXP_SNAndSS(
		String stageName, String stageStatus) {

		return getPersistence().countBygetEXP_SNAndSS(stageName, stageStatus);
	}

	/**
	 * Returns all the explosive application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId) {

		return getPersistence().findBygetEXP_CaseId(caseId);
	}

	/**
	 * Returns a range of all the explosive application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetEXP_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().findBygetEXP_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findBygetEXP_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetEXP_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_CaseId_First(
			String caseId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CaseId_First(
		String caseId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetEXP_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_CaseId_Last(
			String caseId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_CaseId_Last(
		String caseId,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetEXP_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the explosive application stageses before and after the current explosive application stages in the ordered set where caseId = &#63;.
	 *
	 * @param expApplicationStagesId the primary key of the current explosive application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages[] findBygetEXP_CaseId_PrevAndNext(
			long expApplicationStagesId, String caseId,
			OrderByComparator<ExplosiveApplicationStages> orderByComparator)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_CaseId_PrevAndNext(
			expApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the explosive application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetEXP_CaseId(String caseId) {
		getPersistence().removeBygetEXP_CaseId(caseId);
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive application stageses
	 */
	public static int countBygetEXP_CaseId(String caseId) {
		return getPersistence().countBygetEXP_CaseId(caseId);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages findBygetEXP_By_CaseId(
			String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findBygetEXP_By_CaseId(caseId);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_By_CaseId(
		String caseId) {

		return getPersistence().fetchBygetEXP_By_CaseId(caseId);
	}

	/**
	 * Returns the explosive application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosive application stages, or <code>null</code> if a matching explosive application stages could not be found
	 */
	public static ExplosiveApplicationStages fetchBygetEXP_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetEXP_By_CaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the explosive application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the explosive application stages that was removed
	 */
	public static ExplosiveApplicationStages removeBygetEXP_By_CaseId(
			String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().removeBygetEXP_By_CaseId(caseId);
	}

	/**
	 * Returns the number of explosive application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching explosive application stageses
	 */
	public static int countBygetEXP_By_CaseId(String caseId) {
		return getPersistence().countBygetEXP_By_CaseId(caseId);
	}

	/**
	 * Caches the explosive application stages in the entity cache if it is enabled.
	 *
	 * @param explosiveApplicationStages the explosive application stages
	 */
	public static void cacheResult(
		ExplosiveApplicationStages explosiveApplicationStages) {

		getPersistence().cacheResult(explosiveApplicationStages);
	}

	/**
	 * Caches the explosive application stageses in the entity cache if it is enabled.
	 *
	 * @param explosiveApplicationStageses the explosive application stageses
	 */
	public static void cacheResult(
		List<ExplosiveApplicationStages> explosiveApplicationStageses) {

		getPersistence().cacheResult(explosiveApplicationStageses);
	}

	/**
	 * Creates a new explosive application stages with the primary key. Does not add the explosive application stages to the database.
	 *
	 * @param expApplicationStagesId the primary key for the new explosive application stages
	 * @return the new explosive application stages
	 */
	public static ExplosiveApplicationStages create(
		long expApplicationStagesId) {

		return getPersistence().create(expApplicationStagesId);
	}

	/**
	 * Removes the explosive application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages that was removed
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages remove(long expApplicationStagesId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().remove(expApplicationStagesId);
	}

	public static ExplosiveApplicationStages updateImpl(
		ExplosiveApplicationStages explosiveApplicationStages) {

		return getPersistence().updateImpl(explosiveApplicationStages);
	}

	/**
	 * Returns the explosive application stages with the primary key or throws a <code>NoSuchExplosiveApplicationStagesException</code> if it could not be found.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages
	 * @throws NoSuchExplosiveApplicationStagesException if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages findByPrimaryKey(
			long expApplicationStagesId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveApplicationStagesException {

		return getPersistence().findByPrimaryKey(expApplicationStagesId);
	}

	/**
	 * Returns the explosive application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param expApplicationStagesId the primary key of the explosive application stages
	 * @return the explosive application stages, or <code>null</code> if a explosive application stages with the primary key could not be found
	 */
	public static ExplosiveApplicationStages fetchByPrimaryKey(
		long expApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(expApplicationStagesId);
	}

	/**
	 * Returns all the explosive application stageses.
	 *
	 * @return the explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @return the range of explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findAll(
		int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosive application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosiveApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive application stageses
	 * @param end the upper bound of the range of explosive application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosive application stageses
	 */
	public static List<ExplosiveApplicationStages> findAll(
		int start, int end,
		OrderByComparator<ExplosiveApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the explosive application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of explosive application stageses.
	 *
	 * @return the number of explosive application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExplosiveApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ExplosiveApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ExplosiveApplicationStagesPersistence _persistence;

}