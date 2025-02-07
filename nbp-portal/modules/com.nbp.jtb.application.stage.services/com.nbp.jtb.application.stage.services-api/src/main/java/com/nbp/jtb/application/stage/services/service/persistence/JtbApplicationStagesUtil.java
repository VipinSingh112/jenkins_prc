/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.stage.services.model.JtbApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb application stages service. This utility wraps <code>com.nbp.jtb.application.stage.services.service.persistence.impl.JtbApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbApplicationStagesPersistence
 * @generated
 */
public class JtbApplicationStagesUtil {

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
	public static void clearCache(JtbApplicationStages jtbApplicationStages) {
		getPersistence().clearCache(jtbApplicationStages);
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
	public static Map<Serializable, JtbApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbApplicationStages update(
		JtbApplicationStages jtbApplicationStages) {

		return getPersistence().update(jtbApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbApplicationStages update(
		JtbApplicationStages jtbApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(jtbApplicationStages, serviceContext);
	}

	/**
	 * Returns all the jtb application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jtb application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where uuid = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public static JtbApplicationStages[] findByUuid_PrevAndNext(
			long jtbApplicationStagesId, String uuid,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			jtbApplicationStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jtb application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jtb application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jtb application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jtb application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jtb application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jtb application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jtb application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jtb application stages that was removed
	 */
	public static JtbApplicationStages removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jtb application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jtb application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public static JtbApplicationStages[] findByUuid_C_PrevAndNext(
			long jtbApplicationStagesId, String uuid, long companyId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jtbApplicationStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jtb application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jtb application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jtb application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the jtb application stages where jtbApplicationId = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findBygetJtb_By_AI(long jtbApplicationId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_AI(jtbApplicationId);
	}

	/**
	 * Returns the jtb application stages where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_AI(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJtb_By_AI(jtbApplicationId);
	}

	/**
	 * Returns the jtb application stages where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_AI(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJtb_By_AI(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the jtb application stages where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the jtb application stages that was removed
	 */
	public static JtbApplicationStages removeBygetJtb_By_AI(
			long jtbApplicationId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().removeBygetJtb_By_AI(jtbApplicationId);
	}

	/**
	 * Returns the number of jtb application stageses where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching jtb application stageses
	 */
	public static int countBygetJtb_By_AI(long jtbApplicationId) {
		return getPersistence().countBygetJtb_By_AI(jtbApplicationId);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findBygetJtb_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetJtb_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetJtb_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the jtb application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the jtb application stages that was removed
	 */
	public static JtbApplicationStages removeBygetJtb_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().removeBygetJtb_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching jtb application stageses
	 */
	public static int countBygetJtb_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetJtb_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findBygetJtb_By_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_CI(caseId);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CI(String caseId) {
		return getPersistence().fetchBygetJtb_By_CI(caseId);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJtb_By_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the jtb application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb application stages that was removed
	 */
	public static JtbApplicationStages removeBygetJtb_By_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().removeBygetJtb_By_CI(caseId);
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb application stageses
	 */
	public static int countBygetJtb_By_CI(String caseId) {
		return getPersistence().countBygetJtb_By_CI(caseId);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findBygetJtb_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetJtb_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetJtb_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the jtb application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the jtb application stages that was removed
	 */
	public static JtbApplicationStages removeBygetJtb_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().removeBygetJtb_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching jtb application stageses
	 */
	public static int countBygetJtb_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetJtb_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findBygetJtb_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetJtb_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the jtb application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetJtb_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the jtb application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the jtb application stages that was removed
	 */
	public static JtbApplicationStages removeBygetJtb_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().removeBygetJtb_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching jtb application stageses
	 */
	public static int countBygetJtb_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetJtb_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the jtb application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId) {

		return getPersistence().findBygetJtb_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the jtb application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetJtb_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().findBygetJtb_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findBygetJtb_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtb_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findBygetJtb_By_CaseId_First(
			String caseId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CaseId_First(
		String caseId,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetJtb_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findBygetJtb_By_CaseId_Last(
			String caseId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_CaseId_Last(
		String caseId,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetJtb_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where caseId = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public static JtbApplicationStages[] findBygetJtb_By_CaseId_PrevAndNext(
			long jtbApplicationStagesId, String caseId,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_CaseId_PrevAndNext(
			jtbApplicationStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the jtb application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetJtb_By_CaseId(String caseId) {
		getPersistence().removeBygetJtb_By_CaseId(caseId);
	}

	/**
	 * Returns the number of jtb application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb application stageses
	 */
	public static int countBygetJtb_By_CaseId(String caseId) {
		return getPersistence().countBygetJtb_By_CaseId(caseId);
	}

	/**
	 * Returns all the jtb application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName) {

		return getPersistence().findBygetJtb_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the jtb application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetJtb_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().findBygetJtb_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb application stageses
	 */
	public static List<JtbApplicationStages> findBygetJtb_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtb_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findBygetJtb_By_StageName_First(
			String stageName,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_StageName_First(
		String stageName,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetJtb_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages findBygetJtb_By_StageName_Last(
			String stageName,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application stages, or <code>null</code> if a matching jtb application stages could not be found
	 */
	public static JtbApplicationStages fetchBygetJtb_By_StageName_Last(
		String stageName,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetJtb_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the jtb application stageses before and after the current jtb application stages in the ordered set where stageName = &#63;.
	 *
	 * @param jtbApplicationStagesId the primary key of the current jtb application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public static JtbApplicationStages[] findBygetJtb_By_StageName_PrevAndNext(
			long jtbApplicationStagesId, String stageName,
			OrderByComparator<JtbApplicationStages> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findBygetJtb_By_StageName_PrevAndNext(
			jtbApplicationStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the jtb application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetJtb_By_StageName(String stageName) {
		getPersistence().removeBygetJtb_By_StageName(stageName);
	}

	/**
	 * Returns the number of jtb application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching jtb application stageses
	 */
	public static int countBygetJtb_By_StageName(String stageName) {
		return getPersistence().countBygetJtb_By_StageName(stageName);
	}

	/**
	 * Caches the jtb application stages in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationStages the jtb application stages
	 */
	public static void cacheResult(JtbApplicationStages jtbApplicationStages) {
		getPersistence().cacheResult(jtbApplicationStages);
	}

	/**
	 * Caches the jtb application stageses in the entity cache if it is enabled.
	 *
	 * @param jtbApplicationStageses the jtb application stageses
	 */
	public static void cacheResult(
		List<JtbApplicationStages> jtbApplicationStageses) {

		getPersistence().cacheResult(jtbApplicationStageses);
	}

	/**
	 * Creates a new jtb application stages with the primary key. Does not add the jtb application stages to the database.
	 *
	 * @param jtbApplicationStagesId the primary key for the new jtb application stages
	 * @return the new jtb application stages
	 */
	public static JtbApplicationStages create(long jtbApplicationStagesId) {
		return getPersistence().create(jtbApplicationStagesId);
	}

	/**
	 * Removes the jtb application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages that was removed
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public static JtbApplicationStages remove(long jtbApplicationStagesId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().remove(jtbApplicationStagesId);
	}

	public static JtbApplicationStages updateImpl(
		JtbApplicationStages jtbApplicationStages) {

		return getPersistence().updateImpl(jtbApplicationStages);
	}

	/**
	 * Returns the jtb application stages with the primary key or throws a <code>NoSuchJtbApplicationStagesException</code> if it could not be found.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages
	 * @throws NoSuchJtbApplicationStagesException if a jtb application stages with the primary key could not be found
	 */
	public static JtbApplicationStages findByPrimaryKey(
			long jtbApplicationStagesId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbApplicationStagesException {

		return getPersistence().findByPrimaryKey(jtbApplicationStagesId);
	}

	/**
	 * Returns the jtb application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbApplicationStagesId the primary key of the jtb application stages
	 * @return the jtb application stages, or <code>null</code> if a jtb application stages with the primary key could not be found
	 */
	public static JtbApplicationStages fetchByPrimaryKey(
		long jtbApplicationStagesId) {

		return getPersistence().fetchByPrimaryKey(jtbApplicationStagesId);
	}

	/**
	 * Returns all the jtb application stageses.
	 *
	 * @return the jtb application stageses
	 */
	public static List<JtbApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @return the range of jtb application stageses
	 */
	public static List<JtbApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb application stageses
	 */
	public static List<JtbApplicationStages> findAll(
		int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb application stageses
	 * @param end the upper bound of the range of jtb application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb application stageses
	 */
	public static List<JtbApplicationStages> findAll(
		int start, int end,
		OrderByComparator<JtbApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb application stageses.
	 *
	 * @return the number of jtb application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JtbApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JtbApplicationStagesPersistence _persistence;

}