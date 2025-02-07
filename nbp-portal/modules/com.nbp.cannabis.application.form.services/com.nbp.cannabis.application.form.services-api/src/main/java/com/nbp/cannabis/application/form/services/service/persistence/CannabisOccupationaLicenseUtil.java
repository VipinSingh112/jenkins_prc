/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisOccupationaLicense;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis occupationa license service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisOccupationaLicensePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisOccupationaLicensePersistence
 * @generated
 */
public class CannabisOccupationaLicenseUtil {

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
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		getPersistence().clearCache(cannabisOccupationaLicense);
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
	public static Map<Serializable, CannabisOccupationaLicense>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisOccupationaLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisOccupationaLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisOccupationaLicense> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisOccupationaLicense update(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		return getPersistence().update(cannabisOccupationaLicense);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisOccupationaLicense update(
		CannabisOccupationaLicense cannabisOccupationaLicense,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisOccupationaLicense, serviceContext);
	}

	/**
	 * Returns all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense findByUuid_First(
			String uuid,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis occupationa licenses before and after the current cannabis occupationa license in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the current cannabis occupationa license
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public static CannabisOccupationaLicense[] findByUuid_PrevAndNext(
			long cannabisOccupationaLicenseId, String uuid,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findByUuid_PrevAndNext(
			cannabisOccupationaLicenseId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis occupationa licenses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis occupationa licenses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis occupationa licenses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis occupationa license where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisOccupationaLicenseException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis occupationa license where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis occupationa license where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis occupationa license where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis occupationa license that was removed
	 */
	public static CannabisOccupationaLicense removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis occupationa licenses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis occupationa licenses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis occupationa licenses before and after the current cannabis occupationa license in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the current cannabis occupationa license
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public static CannabisOccupationaLicense[] findByUuid_C_PrevAndNext(
			long cannabisOccupationaLicenseId, String uuid, long companyId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findByUuid_C_PrevAndNext(
			cannabisOccupationaLicenseId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis occupationa licenses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis occupationa licenses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis occupationa licenses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId) {

		return getPersistence().findBygetCA_OL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCA_OL_CAI(
			cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().findBygetCA_OL_CAI(
			cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findBygetCA_OL_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCA_OL_CAI(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense findBygetCA_OL_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findBygetCA_OL_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense fetchBygetCA_OL_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().fetchBygetCA_OL_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense findBygetCA_OL_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findBygetCA_OL_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis occupationa license, or <code>null</code> if a matching cannabis occupationa license could not be found
	 */
	public static CannabisOccupationaLicense fetchBygetCA_OL_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().fetchBygetCA_OL_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis occupationa licenses before and after the current cannabis occupationa license in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the current cannabis occupationa license
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public static CannabisOccupationaLicense[] findBygetCA_OL_CAI_PrevAndNext(
			long cannabisOccupationaLicenseId, long cannabisApplicationId,
			OrderByComparator<CannabisOccupationaLicense> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findBygetCA_OL_CAI_PrevAndNext(
			cannabisOccupationaLicenseId, cannabisApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis occupationa licenses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCA_OL_CAI(long cannabisApplicationId) {
		getPersistence().removeBygetCA_OL_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis occupationa licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis occupationa licenses
	 */
	public static int countBygetCA_OL_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetCA_OL_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the cannabis occupationa license in the entity cache if it is enabled.
	 *
	 * @param cannabisOccupationaLicense the cannabis occupationa license
	 */
	public static void cacheResult(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		getPersistence().cacheResult(cannabisOccupationaLicense);
	}

	/**
	 * Caches the cannabis occupationa licenses in the entity cache if it is enabled.
	 *
	 * @param cannabisOccupationaLicenses the cannabis occupationa licenses
	 */
	public static void cacheResult(
		List<CannabisOccupationaLicense> cannabisOccupationaLicenses) {

		getPersistence().cacheResult(cannabisOccupationaLicenses);
	}

	/**
	 * Creates a new cannabis occupationa license with the primary key. Does not add the cannabis occupationa license to the database.
	 *
	 * @param cannabisOccupationaLicenseId the primary key for the new cannabis occupationa license
	 * @return the new cannabis occupationa license
	 */
	public static CannabisOccupationaLicense create(
		long cannabisOccupationaLicenseId) {

		return getPersistence().create(cannabisOccupationaLicenseId);
	}

	/**
	 * Removes the cannabis occupationa license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license that was removed
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public static CannabisOccupationaLicense remove(
			long cannabisOccupationaLicenseId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().remove(cannabisOccupationaLicenseId);
	}

	public static CannabisOccupationaLicense updateImpl(
		CannabisOccupationaLicense cannabisOccupationaLicense) {

		return getPersistence().updateImpl(cannabisOccupationaLicense);
	}

	/**
	 * Returns the cannabis occupationa license with the primary key or throws a <code>NoSuchCannabisOccupationaLicenseException</code> if it could not be found.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license
	 * @throws NoSuchCannabisOccupationaLicenseException if a cannabis occupationa license with the primary key could not be found
	 */
	public static CannabisOccupationaLicense findByPrimaryKey(
			long cannabisOccupationaLicenseId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisOccupationaLicenseException {

		return getPersistence().findByPrimaryKey(cannabisOccupationaLicenseId);
	}

	/**
	 * Returns the cannabis occupationa license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisOccupationaLicenseId the primary key of the cannabis occupationa license
	 * @return the cannabis occupationa license, or <code>null</code> if a cannabis occupationa license with the primary key could not be found
	 */
	public static CannabisOccupationaLicense fetchByPrimaryKey(
		long cannabisOccupationaLicenseId) {

		return getPersistence().fetchByPrimaryKey(cannabisOccupationaLicenseId);
	}

	/**
	 * Returns all the cannabis occupationa licenses.
	 *
	 * @return the cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @return the range of cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis occupationa licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisOccupationaLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis occupationa licenses
	 * @param end the upper bound of the range of cannabis occupationa licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis occupationa licenses
	 */
	public static List<CannabisOccupationaLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisOccupationaLicense> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis occupationa licenses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis occupationa licenses.
	 *
	 * @return the number of cannabis occupationa licenses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisOccupationaLicensePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CannabisOccupationaLicensePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisOccupationaLicensePersistence _persistence;

}