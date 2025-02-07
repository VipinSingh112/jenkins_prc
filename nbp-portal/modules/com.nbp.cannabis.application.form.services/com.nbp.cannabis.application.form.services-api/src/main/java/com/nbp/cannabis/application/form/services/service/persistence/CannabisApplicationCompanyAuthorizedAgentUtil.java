/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAuthorizedAgent;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application company authorized agent service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisApplicationCompanyAuthorizedAgentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAuthorizedAgentPersistence
 * @generated
 */
public class CannabisApplicationCompanyAuthorizedAgentUtil {

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
		CannabisApplicationCompanyAuthorizedAgent
			cannabisApplicationCompanyAuthorizedAgent) {

		getPersistence().clearCache(cannabisApplicationCompanyAuthorizedAgent);
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
	public static Map<Serializable, CannabisApplicationCompanyAuthorizedAgent>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationCompanyAuthorizedAgent update(
		CannabisApplicationCompanyAuthorizedAgent
			cannabisApplicationCompanyAuthorizedAgent) {

		return getPersistence().update(
			cannabisApplicationCompanyAuthorizedAgent);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationCompanyAuthorizedAgent update(
		CannabisApplicationCompanyAuthorizedAgent
			cannabisApplicationCompanyAuthorizedAgent,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationCompanyAuthorizedAgent, serviceContext);
	}

	/**
	 * Returns all the cannabis application company authorized agents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis application company authorized agents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @return the range of matching cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis application company authorized agents before and after the current cannabis application company authorized agent in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisCOAId the primary key of the current cannabis application company authorized agent
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a cannabis application company authorized agent with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent[]
			findByUuid_PrevAndNext(
				long cannabisCOAId, String uuid,
				OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().findByUuid_PrevAndNext(
			cannabisCOAId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis application company authorized agents where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis application company authorized agents where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application company authorized agents
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis application company authorized agent where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAuthorizedAgentException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application company authorized agent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application company authorized agent where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis application company authorized agent where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application company authorized agent that was removed
	 */
	public static CannabisApplicationCompanyAuthorizedAgent removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis application company authorized agents where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application company authorized agents
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @return the range of matching cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis application company authorized agents before and after the current cannabis application company authorized agent in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisCOAId the primary key of the current cannabis application company authorized agent
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a cannabis application company authorized agent with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent[]
			findByUuid_C_PrevAndNext(
				long cannabisCOAId, String uuid, long companyId,
				OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().findByUuid_C_PrevAndNext(
			cannabisCOAId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application company authorized agents where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis application company authorized agents where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application company authorized agents
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the cannabis application company authorized agent where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAuthorizedAgentException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent findBygetCAA_by_CAI(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().findBygetCAA_by_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application company authorized agent where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent
		fetchBygetCAA_by_CAI(long cannabisApplicationId) {

		return getPersistence().fetchBygetCAA_by_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application company authorized agent where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company authorized agent, or <code>null</code> if a matching cannabis application company authorized agent could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent
		fetchBygetCAA_by_CAI(
			long cannabisApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCAA_by_CAI(
			cannabisApplicationId, useFinderCache);
	}

	/**
	 * Removes the cannabis application company authorized agent where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application company authorized agent that was removed
	 */
	public static CannabisApplicationCompanyAuthorizedAgent
			removeBygetCAA_by_CAI(long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().removeBygetCAA_by_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis application company authorized agents where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application company authorized agents
	 */
	public static int countBygetCAA_by_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCAA_by_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the cannabis application company authorized agent in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAuthorizedAgent the cannabis application company authorized agent
	 */
	public static void cacheResult(
		CannabisApplicationCompanyAuthorizedAgent
			cannabisApplicationCompanyAuthorizedAgent) {

		getPersistence().cacheResult(cannabisApplicationCompanyAuthorizedAgent);
	}

	/**
	 * Caches the cannabis application company authorized agents in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAuthorizedAgents the cannabis application company authorized agents
	 */
	public static void cacheResult(
		List<CannabisApplicationCompanyAuthorizedAgent>
			cannabisApplicationCompanyAuthorizedAgents) {

		getPersistence().cacheResult(
			cannabisApplicationCompanyAuthorizedAgents);
	}

	/**
	 * Creates a new cannabis application company authorized agent with the primary key. Does not add the cannabis application company authorized agent to the database.
	 *
	 * @param cannabisCOAId the primary key for the new cannabis application company authorized agent
	 * @return the new cannabis application company authorized agent
	 */
	public static CannabisApplicationCompanyAuthorizedAgent create(
		long cannabisCOAId) {

		return getPersistence().create(cannabisCOAId);
	}

	/**
	 * Removes the cannabis application company authorized agent with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisCOAId the primary key of the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent that was removed
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a cannabis application company authorized agent with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent remove(
			long cannabisCOAId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().remove(cannabisCOAId);
	}

	public static CannabisApplicationCompanyAuthorizedAgent updateImpl(
		CannabisApplicationCompanyAuthorizedAgent
			cannabisApplicationCompanyAuthorizedAgent) {

		return getPersistence().updateImpl(
			cannabisApplicationCompanyAuthorizedAgent);
	}

	/**
	 * Returns the cannabis application company authorized agent with the primary key or throws a <code>NoSuchCannabisApplicationCompanyAuthorizedAgentException</code> if it could not be found.
	 *
	 * @param cannabisCOAId the primary key of the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent
	 * @throws NoSuchCannabisApplicationCompanyAuthorizedAgentException if a cannabis application company authorized agent with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent findByPrimaryKey(
			long cannabisCOAId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAuthorizedAgentException {

		return getPersistence().findByPrimaryKey(cannabisCOAId);
	}

	/**
	 * Returns the cannabis application company authorized agent with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisCOAId the primary key of the cannabis application company authorized agent
	 * @return the cannabis application company authorized agent, or <code>null</code> if a cannabis application company authorized agent with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAuthorizedAgent fetchByPrimaryKey(
		long cannabisCOAId) {

		return getPersistence().fetchByPrimaryKey(cannabisCOAId);
	}

	/**
	 * Returns all the cannabis application company authorized agents.
	 *
	 * @return the cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application company authorized agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @return the range of cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application company authorized agents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAuthorizedAgentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company authorized agents
	 * @param end the upper bound of the range of cannabis application company authorized agents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application company authorized agents
	 */
	public static List<CannabisApplicationCompanyAuthorizedAgent> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCompanyAuthorizedAgent>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application company authorized agents from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application company authorized agents.
	 *
	 * @return the number of cannabis application company authorized agents
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationCompanyAuthorizedAgentPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationCompanyAuthorizedAgentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationCompanyAuthorizedAgentPersistence
		_persistence;

}