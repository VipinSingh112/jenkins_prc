/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationCompanyAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application company address service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisApplicationCompanyAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationCompanyAddressPersistence
 * @generated
 */
public class CannabisApplicationCompanyAddressUtil {

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
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress) {

		getPersistence().clearCache(cannabisApplicationCompanyAddress);
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
	public static Map<Serializable, CannabisApplicationCompanyAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationCompanyAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationCompanyAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationCompanyAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationCompanyAddress update(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress) {

		return getPersistence().update(cannabisApplicationCompanyAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationCompanyAddress update(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationCompanyAddress, serviceContext);
	}

	/**
	 * Returns all the cannabis application company addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis application company addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis application company addresses before and after the current cannabis application company address in the ordered set where uuid = &#63;.
	 *
	 * @param companyAddressId the primary key of the current cannabis application company address
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAddress[] findByUuid_PrevAndNext(
			long companyAddressId, String uuid,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findByUuid_PrevAndNext(
			companyAddressId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis application company addresses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis application company addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application company addresses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis application company address where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAddressException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application company address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application company address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis application company address where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application company address that was removed
	 */
	public static CannabisApplicationCompanyAddress removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis application company addresses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application company addresses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis application company addresses before and after the current cannabis application company address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param companyAddressId the primary key of the current cannabis application company address
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAddress[] findByUuid_C_PrevAndNext(
			long companyAddressId, String uuid, long companyId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findByUuid_C_PrevAndNext(
			companyAddressId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application company addresses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis application company addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application company addresses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the cannabis application company address where addressType = &#63; and companyInformationId = &#63; or throws a <code>NoSuchCannabisApplicationCompanyAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress findBygetCA_CA_by_CI_AT(
			String addressType, long companyInformationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findBygetCA_CA_by_CI_AT(
			addressType, companyInformationId);
	}

	/**
	 * Returns the cannabis application company address where addressType = &#63; and companyInformationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long companyInformationId) {

		return getPersistence().fetchBygetCA_CA_by_CI_AT(
			addressType, companyInformationId);
	}

	/**
	 * Returns the cannabis application company address where addressType = &#63; and companyInformationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long companyInformationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCA_CA_by_CI_AT(
			addressType, companyInformationId, useFinderCache);
	}

	/**
	 * Removes the cannabis application company address where addressType = &#63; and companyInformationId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the cannabis application company address that was removed
	 */
	public static CannabisApplicationCompanyAddress removeBygetCA_CA_by_CI_AT(
			String addressType, long companyInformationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().removeBygetCA_CA_by_CI_AT(
			addressType, companyInformationId);
	}

	/**
	 * Returns the number of cannabis application company addresses where addressType = &#63; and companyInformationId = &#63;.
	 *
	 * @param addressType the address type
	 * @param companyInformationId the company information ID
	 * @return the number of matching cannabis application company addresses
	 */
	public static int countBygetCA_CA_by_CI_AT(
		String addressType, long companyInformationId) {

		return getPersistence().countBygetCA_CA_by_CI_AT(
			addressType, companyInformationId);
	}

	/**
	 * Returns all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @return the matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findBygetCA_CA_by_CI(
		long companyInformationId) {

		return getPersistence().findBygetCA_CA_by_CI(companyInformationId);
	}

	/**
	 * Returns a range of all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param companyInformationId the company information ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findBygetCA_CA_by_CI(
		long companyInformationId, int start, int end) {

		return getPersistence().findBygetCA_CA_by_CI(
			companyInformationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param companyInformationId the company information ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findBygetCA_CA_by_CI(
		long companyInformationId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().findBygetCA_CA_by_CI(
			companyInformationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param companyInformationId the company information ID
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findBygetCA_CA_by_CI(
		long companyInformationId, int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCA_CA_by_CI(
			companyInformationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress findBygetCA_CA_by_CI_First(
			long companyInformationId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findBygetCA_CA_by_CI_First(
			companyInformationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_First(
		long companyInformationId,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().fetchBygetCA_CA_by_CI_First(
			companyInformationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress findBygetCA_CA_by_CI_Last(
			long companyInformationId,
			OrderByComparator<CannabisApplicationCompanyAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findBygetCA_CA_by_CI_Last(
			companyInformationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application company address, or <code>null</code> if a matching cannabis application company address could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchBygetCA_CA_by_CI_Last(
		long companyInformationId,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().fetchBygetCA_CA_by_CI_Last(
			companyInformationId, orderByComparator);
	}

	/**
	 * Returns the cannabis application company addresses before and after the current cannabis application company address in the ordered set where companyInformationId = &#63;.
	 *
	 * @param companyAddressId the primary key of the current cannabis application company address
	 * @param companyInformationId the company information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAddress[]
			findBygetCA_CA_by_CI_PrevAndNext(
				long companyAddressId, long companyInformationId,
				OrderByComparator<CannabisApplicationCompanyAddress>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findBygetCA_CA_by_CI_PrevAndNext(
			companyAddressId, companyInformationId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application company addresses where companyInformationId = &#63; from the database.
	 *
	 * @param companyInformationId the company information ID
	 */
	public static void removeBygetCA_CA_by_CI(long companyInformationId) {
		getPersistence().removeBygetCA_CA_by_CI(companyInformationId);
	}

	/**
	 * Returns the number of cannabis application company addresses where companyInformationId = &#63;.
	 *
	 * @param companyInformationId the company information ID
	 * @return the number of matching cannabis application company addresses
	 */
	public static int countBygetCA_CA_by_CI(long companyInformationId) {
		return getPersistence().countBygetCA_CA_by_CI(companyInformationId);
	}

	/**
	 * Caches the cannabis application company address in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAddress the cannabis application company address
	 */
	public static void cacheResult(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress) {

		getPersistence().cacheResult(cannabisApplicationCompanyAddress);
	}

	/**
	 * Caches the cannabis application company addresses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationCompanyAddresses the cannabis application company addresses
	 */
	public static void cacheResult(
		List<CannabisApplicationCompanyAddress>
			cannabisApplicationCompanyAddresses) {

		getPersistence().cacheResult(cannabisApplicationCompanyAddresses);
	}

	/**
	 * Creates a new cannabis application company address with the primary key. Does not add the cannabis application company address to the database.
	 *
	 * @param companyAddressId the primary key for the new cannabis application company address
	 * @return the new cannabis application company address
	 */
	public static CannabisApplicationCompanyAddress create(
		long companyAddressId) {

		return getPersistence().create(companyAddressId);
	}

	/**
	 * Removes the cannabis application company address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address that was removed
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAddress remove(
			long companyAddressId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().remove(companyAddressId);
	}

	public static CannabisApplicationCompanyAddress updateImpl(
		CannabisApplicationCompanyAddress cannabisApplicationCompanyAddress) {

		return getPersistence().updateImpl(cannabisApplicationCompanyAddress);
	}

	/**
	 * Returns the cannabis application company address with the primary key or throws a <code>NoSuchCannabisApplicationCompanyAddressException</code> if it could not be found.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address
	 * @throws NoSuchCannabisApplicationCompanyAddressException if a cannabis application company address with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAddress findByPrimaryKey(
			long companyAddressId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationCompanyAddressException {

		return getPersistence().findByPrimaryKey(companyAddressId);
	}

	/**
	 * Returns the cannabis application company address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param companyAddressId the primary key of the cannabis application company address
	 * @return the cannabis application company address, or <code>null</code> if a cannabis application company address with the primary key could not be found
	 */
	public static CannabisApplicationCompanyAddress fetchByPrimaryKey(
		long companyAddressId) {

		return getPersistence().fetchByPrimaryKey(companyAddressId);
	}

	/**
	 * Returns all the cannabis application company addresses.
	 *
	 * @return the cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @return the range of cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application company addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationCompanyAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application company addresses
	 * @param end the upper bound of the range of cannabis application company addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application company addresses
	 */
	public static List<CannabisApplicationCompanyAddress> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationCompanyAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application company addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application company addresses.
	 *
	 * @return the number of cannabis application company addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationCompanyAddressPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationCompanyAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationCompanyAddressPersistence
		_persistence;

}