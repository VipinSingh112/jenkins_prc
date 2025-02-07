/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.stages.services.model.JanaacApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the janaac application stages service. This utility wraps <code>com.nbp.janaac.stages.services.service.persistence.impl.JanaacApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationStagesPersistence
 * @generated
 */
public class JanaacApplicationStagesUtil {

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
		JanaacApplicationStages janaacApplicationStages) {

		getPersistence().clearCache(janaacApplicationStages);
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
	public static Map<Serializable, JanaacApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JanaacApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JanaacApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JanaacApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JanaacApplicationStages update(
		JanaacApplicationStages janaacApplicationStages) {

		return getPersistence().update(janaacApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JanaacApplicationStages update(
		JanaacApplicationStages janaacApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(janaacApplicationStages, serviceContext);
	}

	/**
	 * Returns all the janaac application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the janaac application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where uuid = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public static JanaacApplicationStages[] findByUuid_PrevAndNext(
			long janaacApplicationStagesId, String uuid,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			janaacApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the janaac application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of janaac application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching janaac application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the janaac application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the janaac application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the janaac application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the janaac application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the janaac application stages that was removed
	 */
	public static JanaacApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of janaac application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching janaac application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public static JanaacApplicationStages[] findByUuid_C_PrevAndNext(
			long janaacApplicationStagesId, String uuid, long companyId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			janaacApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the janaac application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of janaac application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching janaac application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the janaac application stages where janaacApplicationId = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findBygetJanaac_By_AI(
			long janaacApplicationId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_AI(janaacApplicationId);
	}

	/**
	 * Returns the janaac application stages where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_AI(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJanaac_By_AI(janaacApplicationId);
	}

	/**
	 * Returns the janaac application stages where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_AI(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJanaac_By_AI(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the janaac application stages where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac application stages that was removed
	 */
	public static JanaacApplicationStages removeBygetJanaac_By_AI(
			long janaacApplicationId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().removeBygetJanaac_By_AI(janaacApplicationId);
	}

	/**
	 * Returns the number of janaac application stageses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac application stageses
	 */
	public static int countBygetJanaac_By_AI(long janaacApplicationId) {
		return getPersistence().countBygetJanaac_By_AI(janaacApplicationId);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findBygetJanaac_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetJanaac_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetJanaac_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the janaac application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the janaac application stages that was removed
	 */
	public static JanaacApplicationStages removeBygetJanaac_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().removeBygetJanaac_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching janaac application stageses
	 */
	public static int countBygetJanaac_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetJanaac_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findBygetJanaac_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetJanaac_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetJanaac_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the janaac application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the janaac application stages that was removed
	 */
	public static JanaacApplicationStages
			removeBygetJanaac_By_CaseIdStageStatus(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().removeBygetJanaac_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching janaac application stageses
	 */
	public static int countBygetJanaac_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetJanaac_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findBygetJanaac_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetJanaac_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetJanaac_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the janaac application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the janaac application stages that was removed
	 */
	public static JanaacApplicationStages removeBygetJanaac_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().removeBygetJanaac_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching janaac application stageses
	 */
	public static int countBygetJanaac_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetJanaac_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the janaac application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId) {

		return getPersistence().findBygetJanaac_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the janaac application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetJanaac_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().findBygetJanaac_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findBygetJanaac_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaac_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findBygetJanaac_By_CaseId_First(
			String caseId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_CaseId_First(
		String caseId,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetJanaac_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findBygetJanaac_By_CaseId_Last(
			String caseId,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_CaseId_Last(
		String caseId,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetJanaac_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where caseId = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public static JanaacApplicationStages[]
			findBygetJanaac_By_CaseId_PrevAndNext(
				long janaacApplicationStagesId, String caseId,
				OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_CaseId_PrevAndNext(
			janaacApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the janaac application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetJanaac_By_CaseId(String caseId) {
		getPersistence().removeBygetJanaac_By_CaseId(caseId);
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac application stageses
	 */
	public static int countBygetJanaac_By_CaseId(String caseId) {
		return getPersistence().countBygetJanaac_By_CaseId(caseId);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findBygetJanaac_ByCaseId(
			String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_ByCaseId(caseId);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_ByCaseId(
		String caseId) {

		return getPersistence().fetchBygetJanaac_ByCaseId(caseId);
	}

	/**
	 * Returns the janaac application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_ByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJanaac_ByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the janaac application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac application stages that was removed
	 */
	public static JanaacApplicationStages removeBygetJanaac_ByCaseId(
			String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().removeBygetJanaac_ByCaseId(caseId);
	}

	/**
	 * Returns the number of janaac application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac application stageses
	 */
	public static int countBygetJanaac_ByCaseId(String caseId) {
		return getPersistence().countBygetJanaac_ByCaseId(caseId);
	}

	/**
	 * Returns all the janaac application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName) {

		return getPersistence().findBygetJanaac_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the janaac application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetJanaac_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().findBygetJanaac_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac application stageses
	 */
	public static List<JanaacApplicationStages> findBygetJanaac_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJanaac_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findBygetJanaac_By_StageName_First(
			String stageName,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_StageName_First(
		String stageName,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetJanaac_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages findBygetJanaac_By_StageName_Last(
			String stageName,
			OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application stages, or <code>null</code> if a matching janaac application stages could not be found
	 */
	public static JanaacApplicationStages fetchBygetJanaac_By_StageName_Last(
		String stageName,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetJanaac_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the janaac application stageses before and after the current janaac application stages in the ordered set where stageName = &#63;.
	 *
	 * @param janaacApplicationStagesId the primary key of the current janaac application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public static JanaacApplicationStages[]
			findBygetJanaac_By_StageName_PrevAndNext(
				long janaacApplicationStagesId, String stageName,
				OrderByComparator<JanaacApplicationStages> orderByComparator)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findBygetJanaac_By_StageName_PrevAndNext(
			janaacApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the janaac application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetJanaac_By_StageName(String stageName) {
		getPersistence().removeBygetJanaac_By_StageName(stageName);
	}

	/**
	 * Returns the number of janaac application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching janaac application stageses
	 */
	public static int countBygetJanaac_By_StageName(String stageName) {
		return getPersistence().countBygetJanaac_By_StageName(stageName);
	}

	/**
	 * Caches the janaac application stages in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationStages the janaac application stages
	 */
	public static void cacheResult(
		JanaacApplicationStages janaacApplicationStages) {

		getPersistence().cacheResult(janaacApplicationStages);
	}

	/**
	 * Caches the janaac application stageses in the entity cache if it is enabled.
	 *
	 * @param janaacApplicationStageses the janaac application stageses
	 */
	public static void cacheResult(
		List<JanaacApplicationStages> janaacApplicationStageses) {

		getPersistence().cacheResult(janaacApplicationStageses);
	}

	/**
	 * Creates a new janaac application stages with the primary key. Does not add the janaac application stages to the database.
	 *
	 * @param janaacApplicationStagesId the primary key for the new janaac application stages
	 * @return the new janaac application stages
	 */
	public static JanaacApplicationStages create(
		long janaacApplicationStagesId) {

		return getPersistence().create(janaacApplicationStagesId);
	}

	/**
	 * Removes the janaac application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages that was removed
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public static JanaacApplicationStages remove(long janaacApplicationStagesId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().remove(janaacApplicationStagesId);
	}

	public static JanaacApplicationStages updateImpl(
		JanaacApplicationStages janaacApplicationStages) {

		return getPersistence().updateImpl(janaacApplicationStages);
	}

	/**
	 * Returns the janaac application stages with the primary key or throws a <code>NoSuchJanaacApplicationStagesException</code> if it could not be found.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages
	 * @throws NoSuchJanaacApplicationStagesException if a janaac application stages with the primary key could not be found
	 */
	public static JanaacApplicationStages findByPrimaryKey(
			long janaacApplicationStagesId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacApplicationStagesException {

		return getPersistence().findByPrimaryKey(janaacApplicationStagesId);
	}

	/**
	 * Returns the janaac application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacApplicationStagesId the primary key of the janaac application stages
	 * @return the janaac application stages, or <code>null</code> if a janaac application stages with the primary key could not be found
	 */
	public static JanaacApplicationStages fetchByPrimaryKey(
		long janaacApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(janaacApplicationStagesId);
	}

	/**
	 * Returns all the janaac application stageses.
	 *
	 * @return the janaac application stageses
	 */
	public static List<JanaacApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @return the range of janaac application stageses
	 */
	public static List<JanaacApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac application stageses
	 */
	public static List<JanaacApplicationStages> findAll(
		int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac application stageses
	 * @param end the upper bound of the range of janaac application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac application stageses
	 */
	public static List<JanaacApplicationStages> findAll(
		int start, int end,
		OrderByComparator<JanaacApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the janaac application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of janaac application stageses.
	 *
	 * @return the number of janaac application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JanaacApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JanaacApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JanaacApplicationStagesPersistence _persistence;

}