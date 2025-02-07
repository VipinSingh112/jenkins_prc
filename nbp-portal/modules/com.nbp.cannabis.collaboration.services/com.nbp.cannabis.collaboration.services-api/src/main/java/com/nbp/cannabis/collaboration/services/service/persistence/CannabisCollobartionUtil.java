/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.collaboration.services.model.CannabisCollobartion;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis collobartion service. This utility wraps <code>com.nbp.cannabis.collaboration.services.service.persistence.impl.CannabisCollobartionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisCollobartionPersistence
 * @generated
 */
public class CannabisCollobartionUtil {

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
	public static void clearCache(CannabisCollobartion cannabisCollobartion) {
		getPersistence().clearCache(cannabisCollobartion);
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
	public static Map<Serializable, CannabisCollobartion> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisCollobartion> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisCollobartion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisCollobartion> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisCollobartion update(
		CannabisCollobartion cannabisCollobartion) {

		return getPersistence().update(cannabisCollobartion);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisCollobartion update(
		CannabisCollobartion cannabisCollobartion,
		ServiceContext serviceContext) {

		return getPersistence().update(cannabisCollobartion, serviceContext);
	}

	/**
	 * Returns all the cannabis collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findByUuid_First(
			String uuid,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion[] findByUuid_PrevAndNext(
			long cannabisCollaborationId, String uuid,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findByUuid_PrevAndNext(
			cannabisCollaborationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis collobartions where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis collobartions where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis collobartions
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis collobartion where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisCollobartionException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findByUUID_G(String uuid, long groupId)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis collobartion where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis collobartion where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis collobartion that was removed
	 */
	public static CannabisCollobartion removeByUUID_G(String uuid, long groupId)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis collobartions where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis collobartions
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion[] findByUuid_C_PrevAndNext(
			long cannabisCollaborationId, String uuid, long companyId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findByUuid_C_PrevAndNext(
			cannabisCollaborationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis collobartions where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis collobartions where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis collobartions
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the cannabis collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycaseId(String caseId) {
		return getPersistence().findBycaseId(caseId);
	}

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycaseId(
		String caseId, int start, int end) {

		return getPersistence().findBycaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().findBycaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBycaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findBycaseId_First(
			String caseId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycaseId_First(caseId, orderByComparator);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchBycaseId_First(
		String caseId,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchBycaseId_First(caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findBycaseId_Last(
			String caseId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycaseId_Last(caseId, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchBycaseId_Last(
		String caseId,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchBycaseId_Last(caseId, orderByComparator);
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion[] findBycaseId_PrevAndNext(
			long cannabisCollaborationId, String caseId,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycaseId_PrevAndNext(
			cannabisCollaborationId, caseId, orderByComparator);
	}

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBycaseId(String caseId) {
		getPersistence().removeBycaseId(caseId);
	}

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis collobartions
	 */
	public static int countBycaseId(String caseId) {
		return getPersistence().countBycaseId(caseId);
	}

	/**
	 * Returns all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @return the matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage) {

		return getPersistence().findBycannabisStage_CaseId(
			caseId, cannabisStage);
	}

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage, int start, int end) {

		return getPersistence().findBycannabisStage_CaseId(
			caseId, cannabisStage, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().findBycannabisStage_CaseId(
			caseId, cannabisStage, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CaseId(
		String caseId, String cannabisStage, int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBycannabisStage_CaseId(
			caseId, cannabisStage, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findBycannabisStage_CaseId_First(
			String caseId, String cannabisStage,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycannabisStage_CaseId_First(
			caseId, cannabisStage, orderByComparator);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchBycannabisStage_CaseId_First(
		String caseId, String cannabisStage,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchBycannabisStage_CaseId_First(
			caseId, cannabisStage, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findBycannabisStage_CaseId_Last(
			String caseId, String cannabisStage,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycannabisStage_CaseId_Last(
			caseId, cannabisStage, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchBycannabisStage_CaseId_Last(
		String caseId, String cannabisStage,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchBycannabisStage_CaseId_Last(
			caseId, cannabisStage, orderByComparator);
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion[] findBycannabisStage_CaseId_PrevAndNext(
			long cannabisCollaborationId, String caseId, String cannabisStage,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycannabisStage_CaseId_PrevAndNext(
			cannabisCollaborationId, caseId, cannabisStage, orderByComparator);
	}

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 */
	public static void removeBycannabisStage_CaseId(
		String caseId, String cannabisStage) {

		getPersistence().removeBycannabisStage_CaseId(caseId, cannabisStage);
	}

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63; and cannabisStage = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @return the number of matching cannabis collobartions
	 */
	public static int countBycannabisStage_CaseId(
		String caseId, String cannabisStage) {

		return getPersistence().countBycannabisStage_CaseId(
			caseId, cannabisStage);
	}

	/**
	 * Returns all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @return the matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType) {

		return getPersistence().findBycannabisStage_CU(
			caseId, cannabisStage, userType);
	}

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType, int start,
		int end) {

		return getPersistence().findBycannabisStage_CU(
			caseId, cannabisStage, userType, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType, int start,
		int end, OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().findBycannabisStage_CU(
			caseId, cannabisStage, userType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CU(
		String caseId, String cannabisStage, String userType, int start,
		int end, OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBycannabisStage_CU(
			caseId, cannabisStage, userType, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findBycannabisStage_CU_First(
			String caseId, String cannabisStage, String userType,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycannabisStage_CU_First(
			caseId, cannabisStage, userType, orderByComparator);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchBycannabisStage_CU_First(
		String caseId, String cannabisStage, String userType,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchBycannabisStage_CU_First(
			caseId, cannabisStage, userType, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findBycannabisStage_CU_Last(
			String caseId, String cannabisStage, String userType,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycannabisStage_CU_Last(
			caseId, cannabisStage, userType, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchBycannabisStage_CU_Last(
		String caseId, String cannabisStage, String userType,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchBycannabisStage_CU_Last(
			caseId, cannabisStage, userType, orderByComparator);
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion[] findBycannabisStage_CU_PrevAndNext(
			long cannabisCollaborationId, String caseId, String cannabisStage,
			String userType,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycannabisStage_CU_PrevAndNext(
			cannabisCollaborationId, caseId, cannabisStage, userType,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 */
	public static void removeBycannabisStage_CU(
		String caseId, String cannabisStage, String userType) {

		getPersistence().removeBycannabisStage_CU(
			caseId, cannabisStage, userType);
	}

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @return the number of matching cannabis collobartions
	 */
	public static int countBycannabisStage_CU(
		String caseId, String cannabisStage, String userType) {

		return getPersistence().countBycannabisStage_CU(
			caseId, cannabisStage, userType);
	}

	/**
	 * Returns all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @return the matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived) {

		return getPersistence().findBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived);
	}

	/**
	 * Returns a range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived,
		int start, int end) {

		return getPersistence().findBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived,
		int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().findBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived, start, end,
			orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis collobartions
	 */
	public static List<CannabisCollobartion> findBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived,
		int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived, start, end,
			orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findBycannabisStage_CUA_First(
			String caseId, String cannabisStage, String userType, int archived,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycannabisStage_CUA_First(
			caseId, cannabisStage, userType, archived, orderByComparator);
	}

	/**
	 * Returns the first cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchBycannabisStage_CUA_First(
		String caseId, String cannabisStage, String userType, int archived,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchBycannabisStage_CUA_First(
			caseId, cannabisStage, userType, archived, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion findBycannabisStage_CUA_Last(
			String caseId, String cannabisStage, String userType, int archived,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycannabisStage_CUA_Last(
			caseId, cannabisStage, userType, archived, orderByComparator);
	}

	/**
	 * Returns the last cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis collobartion, or <code>null</code> if a matching cannabis collobartion could not be found
	 */
	public static CannabisCollobartion fetchBycannabisStage_CUA_Last(
		String caseId, String cannabisStage, String userType, int archived,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().fetchBycannabisStage_CUA_Last(
			caseId, cannabisStage, userType, archived, orderByComparator);
	}

	/**
	 * Returns the cannabis collobartions before and after the current cannabis collobartion in the ordered set where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param cannabisCollaborationId the primary key of the current cannabis collobartion
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion[] findBycannabisStage_CUA_PrevAndNext(
			long cannabisCollaborationId, String caseId, String cannabisStage,
			String userType, int archived,
			OrderByComparator<CannabisCollobartion> orderByComparator)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findBycannabisStage_CUA_PrevAndNext(
			cannabisCollaborationId, caseId, cannabisStage, userType, archived,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 */
	public static void removeBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived) {

		getPersistence().removeBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived);
	}

	/**
	 * Returns the number of cannabis collobartions where caseId = &#63; and cannabisStage = &#63; and userType = &#63; and archived = &#63;.
	 *
	 * @param caseId the case ID
	 * @param cannabisStage the cannabis stage
	 * @param userType the user type
	 * @param archived the archived
	 * @return the number of matching cannabis collobartions
	 */
	public static int countBycannabisStage_CUA(
		String caseId, String cannabisStage, String userType, int archived) {

		return getPersistence().countBycannabisStage_CUA(
			caseId, cannabisStage, userType, archived);
	}

	/**
	 * Caches the cannabis collobartion in the entity cache if it is enabled.
	 *
	 * @param cannabisCollobartion the cannabis collobartion
	 */
	public static void cacheResult(CannabisCollobartion cannabisCollobartion) {
		getPersistence().cacheResult(cannabisCollobartion);
	}

	/**
	 * Caches the cannabis collobartions in the entity cache if it is enabled.
	 *
	 * @param cannabisCollobartions the cannabis collobartions
	 */
	public static void cacheResult(
		List<CannabisCollobartion> cannabisCollobartions) {

		getPersistence().cacheResult(cannabisCollobartions);
	}

	/**
	 * Creates a new cannabis collobartion with the primary key. Does not add the cannabis collobartion to the database.
	 *
	 * @param cannabisCollaborationId the primary key for the new cannabis collobartion
	 * @return the new cannabis collobartion
	 */
	public static CannabisCollobartion create(long cannabisCollaborationId) {
		return getPersistence().create(cannabisCollaborationId);
	}

	/**
	 * Removes the cannabis collobartion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion that was removed
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion remove(long cannabisCollaborationId)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().remove(cannabisCollaborationId);
	}

	public static CannabisCollobartion updateImpl(
		CannabisCollobartion cannabisCollobartion) {

		return getPersistence().updateImpl(cannabisCollobartion);
	}

	/**
	 * Returns the cannabis collobartion with the primary key or throws a <code>NoSuchCannabisCollobartionException</code> if it could not be found.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion
	 * @throws NoSuchCannabisCollobartionException if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion findByPrimaryKey(
			long cannabisCollaborationId)
		throws com.nbp.cannabis.collaboration.services.exception.
			NoSuchCannabisCollobartionException {

		return getPersistence().findByPrimaryKey(cannabisCollaborationId);
	}

	/**
	 * Returns the cannabis collobartion with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisCollaborationId the primary key of the cannabis collobartion
	 * @return the cannabis collobartion, or <code>null</code> if a cannabis collobartion with the primary key could not be found
	 */
	public static CannabisCollobartion fetchByPrimaryKey(
		long cannabisCollaborationId) {

		return getPersistence().fetchByPrimaryKey(cannabisCollaborationId);
	}

	/**
	 * Returns all the cannabis collobartions.
	 *
	 * @return the cannabis collobartions
	 */
	public static List<CannabisCollobartion> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @return the range of cannabis collobartions
	 */
	public static List<CannabisCollobartion> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis collobartions
	 */
	public static List<CannabisCollobartion> findAll(
		int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis collobartions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisCollobartionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis collobartions
	 * @param end the upper bound of the range of cannabis collobartions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis collobartions
	 */
	public static List<CannabisCollobartion> findAll(
		int start, int end,
		OrderByComparator<CannabisCollobartion> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis collobartions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis collobartions.
	 *
	 * @return the number of cannabis collobartions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisCollobartionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisCollobartionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisCollobartionPersistence _persistence;

}