/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplications;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis applications service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisApplicationsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationsPersistence
 * @generated
 */
public class CannabisApplicationsUtil {

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
	public static void clearCache(CannabisApplications cannabisApplications) {
		getPersistence().clearCache(cannabisApplications);
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
	public static Map<Serializable, CannabisApplications> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplications> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplications> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplications> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplications update(
		CannabisApplications cannabisApplications) {

		return getPersistence().update(cannabisApplications);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplications update(
		CannabisApplications cannabisApplications,
		ServiceContext serviceContext) {

		return getPersistence().update(cannabisApplications, serviceContext);
	}

	/**
	 * Returns all the cannabis applicationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis applicationses
	 */
	public static List<CannabisApplications> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis applicationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public static List<CannabisApplications> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications[] findByUuid_PrevAndNext(
			long cannabisApplicationId, String uuid,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findByUuid_PrevAndNext(
			cannabisApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis applicationses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis applicationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis applicationses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis applications where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications findByUUID_G(String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis applications where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis applications where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis applications where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis applications that was removed
	 */
	public static CannabisApplications removeByUUID_G(String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis applicationses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis applicationses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis applicationses
	 */
	public static List<CannabisApplications> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public static List<CannabisApplications> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications[] findByUuid_C_PrevAndNext(
			long cannabisApplicationId, String uuid, long companyId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findByUuid_C_PrevAndNext(
			cannabisApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis applicationses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis applicationses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @return the matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory) {

		return getPersistence().findBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory, int start, int end) {

		return getPersistence().findBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().findBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByLicenseCategory_First(
				int status, String licenseCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseCategory_First(
				status, licenseCategory, orderByComparator);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByLicenseCategory_First(
			int status, String licenseCategory,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().
			fetchBygetCannabisApplicationsByLicenseCategory_First(
				status, licenseCategory, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByLicenseCategory_Last(
				int status, String licenseCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseCategory_Last(
				status, licenseCategory, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByLicenseCategory_Last(
			int status, String licenseCategory,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().
			fetchBygetCannabisApplicationsByLicenseCategory_Last(
				status, licenseCategory, orderByComparator);
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications[]
			findBygetCannabisApplicationsByLicenseCategory_PrevAndNext(
				long cannabisApplicationId, int status, String licenseCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseCategory_PrevAndNext(
				cannabisApplicationId, status, licenseCategory,
				orderByComparator);
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; and licenseCategory = &#63; from the database.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 */
	public static void removeBygetCannabisApplicationsByLicenseCategory(
		int status, String licenseCategory) {

		getPersistence().removeBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory);
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @return the number of matching cannabis applicationses
	 */
	public static int countBygetCannabisApplicationsByLicenseCategory(
		int status, String licenseCategory) {

		return getPersistence().countBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory);
	}

	/**
	 * Returns all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @return the matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory) {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseSubCategory(
				status, licenseSubCategory);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory, int start, int end) {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseSubCategory(
				status, licenseSubCategory, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseSubCategory(
				status, licenseSubCategory, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseSubCategory(
				status, licenseSubCategory, start, end, orderByComparator,
				useFinderCache);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByLicenseSubCategory_First(
				int status, String licenseSubCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseSubCategory_First(
				status, licenseSubCategory, orderByComparator);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByLicenseSubCategory_First(
			int status, String licenseSubCategory,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().
			fetchBygetCannabisApplicationsByLicenseSubCategory_First(
				status, licenseSubCategory, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByLicenseSubCategory_Last(
				int status, String licenseSubCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseSubCategory_Last(
				status, licenseSubCategory, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByLicenseSubCategory_Last(
			int status, String licenseSubCategory,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().
			fetchBygetCannabisApplicationsByLicenseSubCategory_Last(
				status, licenseSubCategory, orderByComparator);
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications[]
			findBygetCannabisApplicationsByLicenseSubCategory_PrevAndNext(
				long cannabisApplicationId, int status,
				String licenseSubCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByLicenseSubCategory_PrevAndNext(
				cannabisApplicationId, status, licenseSubCategory,
				orderByComparator);
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63; from the database.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 */
	public static void removeBygetCannabisApplicationsByLicenseSubCategory(
		int status, String licenseSubCategory) {

		getPersistence().removeBygetCannabisApplicationsByLicenseSubCategory(
			status, licenseSubCategory);
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @return the number of matching cannabis applicationses
	 */
	public static int countBygetCannabisApplicationsByLicenseSubCategory(
		int status, String licenseSubCategory) {

		return getPersistence().
			countBygetCannabisApplicationsByLicenseSubCategory(
				status, licenseSubCategory);
	}

	/**
	 * Returns the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByRT_ExpiredAppNo(
				String requestType, String expiredLicenseAppNo)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsByRT_ExpiredAppNo(
			requestType, expiredLicenseAppNo);
	}

	/**
	 * Returns the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
			String requestType, String expiredLicenseAppNo) {

		return getPersistence().fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
			requestType, expiredLicenseAppNo);
	}

	/**
	 * Returns the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
			String requestType, String expiredLicenseAppNo,
			boolean useFinderCache) {

		return getPersistence().fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
			requestType, expiredLicenseAppNo, useFinderCache);
	}

	/**
	 * Removes the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; from the database.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the cannabis applications that was removed
	 */
	public static CannabisApplications
			removeBygetCannabisApplicationsByRT_ExpiredAppNo(
				String requestType, String expiredLicenseAppNo)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			removeBygetCannabisApplicationsByRT_ExpiredAppNo(
				requestType, expiredLicenseAppNo);
	}

	/**
	 * Returns the number of cannabis applicationses where requestType = &#63; and expiredLicenseAppNo = &#63;.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the number of matching cannabis applicationses
	 */
	public static int countBygetCannabisApplicationsByRT_ExpiredAppNo(
		String requestType, String expiredLicenseAppNo) {

		return getPersistence().countBygetCannabisApplicationsByRT_ExpiredAppNo(
			requestType, expiredLicenseAppNo);
	}

	/**
	 * Returns all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @return the matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType) {

		return getPersistence().findBygetCannabisApplicationsByRequestType(
			status, requestType);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType, int start, int end) {

		return getPersistence().findBygetCannabisApplicationsByRequestType(
			status, requestType, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().findBygetCannabisApplicationsByRequestType(
			status, requestType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCannabisApplicationsByRequestType(
			status, requestType, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByRequestType_First(
				int status, String requestType,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByRequestType_First(
				status, requestType, orderByComparator);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByRequestType_First(
			int status, String requestType,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().
			fetchBygetCannabisApplicationsByRequestType_First(
				status, requestType, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByRequestType_Last(
				int status, String requestType,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsByRequestType_Last(
			status, requestType, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByRequestType_Last(
			int status, String requestType,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().
			fetchBygetCannabisApplicationsByRequestType_Last(
				status, requestType, orderByComparator);
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications[]
			findBygetCannabisApplicationsByRequestType_PrevAndNext(
				long cannabisApplicationId, int status, String requestType,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByRequestType_PrevAndNext(
				cannabisApplicationId, status, requestType, orderByComparator);
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; and requestType = &#63; from the database.
	 *
	 * @param status the status
	 * @param requestType the request type
	 */
	public static void removeBygetCannabisApplicationsByRequestType(
		int status, String requestType) {

		getPersistence().removeBygetCannabisApplicationsByRequestType(
			status, requestType);
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @return the number of matching cannabis applicationses
	 */
	public static int countBygetCannabisApplicationsByRequestType(
		int status, String requestType) {

		return getPersistence().countBygetCannabisApplicationsByRequestType(
			status, requestType);
	}

	/**
	 * Returns all the cannabis applicationses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByStatus(int status) {

		return getPersistence().findBygetCannabisApplicationsByStatus(status);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByStatus(int status, int start, int end) {

		return getPersistence().findBygetCannabisApplicationsByStatus(
			status, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByStatus(
			int status, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().findBygetCannabisApplicationsByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByStatus(
			int status, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCannabisApplicationsByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByStatus_First(
				int status,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByStatus_First(
			int status,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().fetchBygetCannabisApplicationsByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByStatus_Last(
				int status,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByStatus_Last(
			int status,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().fetchBygetCannabisApplicationsByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications[]
			findBygetCannabisApplicationsByStatus_PrevAndNext(
				long cannabisApplicationId, int status,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByStatus_PrevAndNext(
				cannabisApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetCannabisApplicationsByStatus(int status) {
		getPersistence().removeBygetCannabisApplicationsByStatus(status);
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis applicationses
	 */
	public static int countBygetCannabisApplicationsByStatus(int status) {
		return getPersistence().countBygetCannabisApplicationsByStatus(status);
	}

	/**
	 * Returns all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByStatusUser(int status, long userId) {

		return getPersistence().findBygetCannabisApplicationsByStatusUser(
			status, userId);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByStatusUser(
			int status, long userId, int start, int end) {

		return getPersistence().findBygetCannabisApplicationsByStatusUser(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().findBygetCannabisApplicationsByStatusUser(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCannabisApplicationsByStatusUser(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByStatusUser_First(
				int status, long userId,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByStatusUser_First(
			int status, long userId,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().
			fetchBygetCannabisApplicationsByStatusUser_First(
				status, userId, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByStatusUser_Last(
				int status, long userId,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByStatusUser_Last(
			int status, long userId,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().fetchBygetCannabisApplicationsByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications[]
			findBygetCannabisApplicationsByStatusUser_PrevAndNext(
				long cannabisApplicationId, int status, long userId,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().
			findBygetCannabisApplicationsByStatusUser_PrevAndNext(
				cannabisApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetCannabisApplicationsByStatusUser(
		int status, long userId) {

		getPersistence().removeBygetCannabisApplicationsByStatusUser(
			status, userId);
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching cannabis applicationses
	 */
	public static int countBygetCannabisApplicationsByStatusUser(
		int status, long userId) {

		return getPersistence().countBygetCannabisApplicationsByStatusUser(
			status, userId);
	}

	/**
	 * Returns all the cannabis applicationses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByUser(long userId) {

		return getPersistence().findBygetCannabisApplicationsByUser(userId);
	}

	/**
	 * Returns a range of all the cannabis applicationses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByUser(long userId, int start, int end) {

		return getPersistence().findBygetCannabisApplicationsByUser(
			userId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByUser(
			long userId, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().findBygetCannabisApplicationsByUser(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	public static List<CannabisApplications>
		findBygetCannabisApplicationsByUser(
			long userId, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCannabisApplicationsByUser(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
			findBygetCannabisApplicationsByUser_First(
				long userId,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsByUser_First(
			userId, orderByComparator);
	}

	/**
	 * Returns the first cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByUser_First(
			long userId,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().fetchBygetCannabisApplicationsByUser_First(
			userId, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications findBygetCannabisApplicationsByUser_Last(
			long userId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsByUser_Last(
			userId, orderByComparator);
	}

	/**
	 * Returns the last cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchBygetCannabisApplicationsByUser_Last(
			long userId,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().fetchBygetCannabisApplicationsByUser_Last(
			userId, orderByComparator);
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications[]
			findBygetCannabisApplicationsByUser_PrevAndNext(
				long cannabisApplicationId, long userId,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsByUser_PrevAndNext(
			cannabisApplicationId, userId, orderByComparator);
	}

	/**
	 * Removes all the cannabis applicationses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeBygetCannabisApplicationsByUser(long userId) {
		getPersistence().removeBygetCannabisApplicationsByUser(userId);
	}

	/**
	 * Returns the number of cannabis applicationses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching cannabis applicationses
	 */
	public static int countBygetCannabisApplicationsByUser(long userId) {
		return getPersistence().countBygetCannabisApplicationsByUser(userId);
	}

	/**
	 * Returns the cannabis applications where applicationNumber = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications findBygetCannabisApplicationsAppNo(
			String applicationNumber)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBygetCannabisApplicationsAppNo(
			applicationNumber);
	}

	/**
	 * Returns the cannabis applications where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchBygetCannabisApplicationsAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetCannabisApplicationsAppNo(
			applicationNumber);
	}

	/**
	 * Returns the cannabis applications where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchBygetCannabisApplicationsAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetCannabisApplicationsAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the cannabis applications where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the cannabis applications that was removed
	 */
	public static CannabisApplications removeBygetCannabisApplicationsAppNo(
			String applicationNumber)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().removeBygetCannabisApplicationsAppNo(
			applicationNumber);
	}

	/**
	 * Returns the number of cannabis applicationses where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching cannabis applicationses
	 */
	public static int countBygetCannabisApplicationsAppNo(
		String applicationNumber) {

		return getPersistence().countBygetCannabisApplicationsAppNo(
			applicationNumber);
	}

	/**
	 * Returns the cannabis applications where caseId = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications findBycannabisApplicationByCaseId(
			String caseId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findBycannabisApplicationByCaseId(caseId);
	}

	/**
	 * Returns the cannabis applications where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchBycannabisApplicationByCaseId(
		String caseId) {

		return getPersistence().fetchBycannabisApplicationByCaseId(caseId);
	}

	/**
	 * Returns the cannabis applications where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications fetchBycannabisApplicationByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBycannabisApplicationByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the cannabis applications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis applications that was removed
	 */
	public static CannabisApplications removeBycannabisApplicationByCaseId(
			String caseId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().removeBycannabisApplicationByCaseId(caseId);
	}

	/**
	 * Returns the number of cannabis applicationses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis applicationses
	 */
	public static int countBycannabisApplicationByCaseId(String caseId) {
		return getPersistence().countBycannabisApplicationByCaseId(caseId);
	}

	/**
	 * Caches the cannabis applications in the entity cache if it is enabled.
	 *
	 * @param cannabisApplications the cannabis applications
	 */
	public static void cacheResult(CannabisApplications cannabisApplications) {
		getPersistence().cacheResult(cannabisApplications);
	}

	/**
	 * Caches the cannabis applicationses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationses the cannabis applicationses
	 */
	public static void cacheResult(
		List<CannabisApplications> cannabisApplicationses) {

		getPersistence().cacheResult(cannabisApplicationses);
	}

	/**
	 * Creates a new cannabis applications with the primary key. Does not add the cannabis applications to the database.
	 *
	 * @param cannabisApplicationId the primary key for the new cannabis applications
	 * @return the new cannabis applications
	 */
	public static CannabisApplications create(long cannabisApplicationId) {
		return getPersistence().create(cannabisApplicationId);
	}

	/**
	 * Removes the cannabis applications with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications that was removed
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications remove(long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().remove(cannabisApplicationId);
	}

	public static CannabisApplications updateImpl(
		CannabisApplications cannabisApplications) {

		return getPersistence().updateImpl(cannabisApplications);
	}

	/**
	 * Returns the cannabis applications with the primary key or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications findByPrimaryKey(
			long cannabisApplicationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getPersistence().findByPrimaryKey(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis applications with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications, or <code>null</code> if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications fetchByPrimaryKey(
		long cannabisApplicationId) {

		return getPersistence().fetchByPrimaryKey(cannabisApplicationId);
	}

	/**
	 * Returns all the cannabis applicationses.
	 *
	 * @return the cannabis applicationses
	 */
	public static List<CannabisApplications> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of cannabis applicationses
	 */
	public static List<CannabisApplications> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis applicationses
	 */
	public static List<CannabisApplications> findAll(
		int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis applicationses
	 */
	public static List<CannabisApplications> findAll(
		int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis applicationses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis applicationses.
	 *
	 * @return the number of cannabis applicationses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationsPersistence _persistence;

}