/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplicationIndividualAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis application individual address service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.CannabisApplicationIndividualAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationIndividualAddressPersistence
 * @generated
 */
public class CannabisApplicationIndividualAddressUtil {

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
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		getPersistence().clearCache(cannabisApplicationIndividualAddress);
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
	public static Map<Serializable, CannabisApplicationIndividualAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisApplicationIndividualAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisApplicationIndividualAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisApplicationIndividualAddress>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisApplicationIndividualAddress update(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		return getPersistence().update(cannabisApplicationIndividualAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisApplicationIndividualAddress update(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisApplicationIndividualAddress, serviceContext);
	}

	/**
	 * Returns all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the cannabis application individual addresses before and after the current cannabis application individual address in the ordered set where uuid = &#63;.
	 *
	 * @param IndividualAddressId the primary key of the current cannabis application individual address
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public static CannabisApplicationIndividualAddress[] findByUuid_PrevAndNext(
			long IndividualAddressId, String uuid,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findByUuid_PrevAndNext(
			IndividualAddressId, uuid, orderByComparator);
	}

	/**
	 * Removes all the cannabis application individual addresses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of cannabis application individual addresses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis application individual addresses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the cannabis application individual address where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualAddressException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application individual address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the cannabis application individual address where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the cannabis application individual address where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis application individual address that was removed
	 */
	public static CannabisApplicationIndividualAddress removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of cannabis application individual addresses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis application individual addresses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the cannabis application individual addresses before and after the current cannabis application individual address in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param IndividualAddressId the primary key of the current cannabis application individual address
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public static CannabisApplicationIndividualAddress[]
			findByUuid_C_PrevAndNext(
				long IndividualAddressId, String uuid, long companyId,
				OrderByComparator<CannabisApplicationIndividualAddress>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findByUuid_C_PrevAndNext(
			IndividualAddressId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application individual addresses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of cannabis application individual addresses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis application individual addresses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; or throws a <code>NoSuchCannabisApplicationIndividualAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress findBygetCA_CA_by_CI_AT(
			String addressType, long individualInformationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findBygetCA_CA_by_CI_AT(
			addressType, individualInformationId);
	}

	/**
	 * Returns the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long individualInformationId) {

		return getPersistence().fetchBygetCA_CA_by_CI_AT(
			addressType, individualInformationId);
	}

	/**
	 * Returns the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress fetchBygetCA_CA_by_CI_AT(
		String addressType, long individualInformationId,
		boolean useFinderCache) {

		return getPersistence().fetchBygetCA_CA_by_CI_AT(
			addressType, individualInformationId, useFinderCache);
	}

	/**
	 * Removes the cannabis application individual address where addressType = &#63; and individualInformationId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the cannabis application individual address that was removed
	 */
	public static CannabisApplicationIndividualAddress
			removeBygetCA_CA_by_CI_AT(
				String addressType, long individualInformationId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().removeBygetCA_CA_by_CI_AT(
			addressType, individualInformationId);
	}

	/**
	 * Returns the number of cannabis application individual addresses where addressType = &#63; and individualInformationId = &#63;.
	 *
	 * @param addressType the address type
	 * @param individualInformationId the individual information ID
	 * @return the number of matching cannabis application individual addresses
	 */
	public static int countBygetCA_CA_by_CI_AT(
		String addressType, long individualInformationId) {

		return getPersistence().countBygetCA_CA_by_CI_AT(
			addressType, individualInformationId);
	}

	/**
	 * Returns all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @return the matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress>
		findBygetCA_CA_by_CI(long individualInformationId) {

		return getPersistence().findBygetCA_CA_by_CI(individualInformationId);
	}

	/**
	 * Returns a range of all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param individualInformationId the individual information ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress>
		findBygetCA_CA_by_CI(long individualInformationId, int start, int end) {

		return getPersistence().findBygetCA_CA_by_CI(
			individualInformationId, start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param individualInformationId the individual information ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress>
		findBygetCA_CA_by_CI(
			long individualInformationId, int start, int end,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator) {

		return getPersistence().findBygetCA_CA_by_CI(
			individualInformationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param individualInformationId the individual information ID
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress>
		findBygetCA_CA_by_CI(
			long individualInformationId, int start, int end,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCA_CA_by_CI(
			individualInformationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress
			findBygetCA_CA_by_CI_First(
				long individualInformationId,
				OrderByComparator<CannabisApplicationIndividualAddress>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findBygetCA_CA_by_CI_First(
			individualInformationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress
		fetchBygetCA_CA_by_CI_First(
			long individualInformationId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator) {

		return getPersistence().fetchBygetCA_CA_by_CI_First(
			individualInformationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress
			findBygetCA_CA_by_CI_Last(
				long individualInformationId,
				OrderByComparator<CannabisApplicationIndividualAddress>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findBygetCA_CA_by_CI_Last(
			individualInformationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application individual address, or <code>null</code> if a matching cannabis application individual address could not be found
	 */
	public static CannabisApplicationIndividualAddress
		fetchBygetCA_CA_by_CI_Last(
			long individualInformationId,
			OrderByComparator<CannabisApplicationIndividualAddress>
				orderByComparator) {

		return getPersistence().fetchBygetCA_CA_by_CI_Last(
			individualInformationId, orderByComparator);
	}

	/**
	 * Returns the cannabis application individual addresses before and after the current cannabis application individual address in the ordered set where individualInformationId = &#63;.
	 *
	 * @param IndividualAddressId the primary key of the current cannabis application individual address
	 * @param individualInformationId the individual information ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public static CannabisApplicationIndividualAddress[]
			findBygetCA_CA_by_CI_PrevAndNext(
				long IndividualAddressId, long individualInformationId,
				OrderByComparator<CannabisApplicationIndividualAddress>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findBygetCA_CA_by_CI_PrevAndNext(
			IndividualAddressId, individualInformationId, orderByComparator);
	}

	/**
	 * Removes all the cannabis application individual addresses where individualInformationId = &#63; from the database.
	 *
	 * @param individualInformationId the individual information ID
	 */
	public static void removeBygetCA_CA_by_CI(long individualInformationId) {
		getPersistence().removeBygetCA_CA_by_CI(individualInformationId);
	}

	/**
	 * Returns the number of cannabis application individual addresses where individualInformationId = &#63;.
	 *
	 * @param individualInformationId the individual information ID
	 * @return the number of matching cannabis application individual addresses
	 */
	public static int countBygetCA_CA_by_CI(long individualInformationId) {
		return getPersistence().countBygetCA_CA_by_CI(individualInformationId);
	}

	/**
	 * Caches the cannabis application individual address in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualAddress the cannabis application individual address
	 */
	public static void cacheResult(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		getPersistence().cacheResult(cannabisApplicationIndividualAddress);
	}

	/**
	 * Caches the cannabis application individual addresses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationIndividualAddresses the cannabis application individual addresses
	 */
	public static void cacheResult(
		List<CannabisApplicationIndividualAddress>
			cannabisApplicationIndividualAddresses) {

		getPersistence().cacheResult(cannabisApplicationIndividualAddresses);
	}

	/**
	 * Creates a new cannabis application individual address with the primary key. Does not add the cannabis application individual address to the database.
	 *
	 * @param IndividualAddressId the primary key for the new cannabis application individual address
	 * @return the new cannabis application individual address
	 */
	public static CannabisApplicationIndividualAddress create(
		long IndividualAddressId) {

		return getPersistence().create(IndividualAddressId);
	}

	/**
	 * Removes the cannabis application individual address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address that was removed
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public static CannabisApplicationIndividualAddress remove(
			long IndividualAddressId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().remove(IndividualAddressId);
	}

	public static CannabisApplicationIndividualAddress updateImpl(
		CannabisApplicationIndividualAddress
			cannabisApplicationIndividualAddress) {

		return getPersistence().updateImpl(
			cannabisApplicationIndividualAddress);
	}

	/**
	 * Returns the cannabis application individual address with the primary key or throws a <code>NoSuchCannabisApplicationIndividualAddressException</code> if it could not be found.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address
	 * @throws NoSuchCannabisApplicationIndividualAddressException if a cannabis application individual address with the primary key could not be found
	 */
	public static CannabisApplicationIndividualAddress findByPrimaryKey(
			long IndividualAddressId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationIndividualAddressException {

		return getPersistence().findByPrimaryKey(IndividualAddressId);
	}

	/**
	 * Returns the cannabis application individual address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param IndividualAddressId the primary key of the cannabis application individual address
	 * @return the cannabis application individual address, or <code>null</code> if a cannabis application individual address with the primary key could not be found
	 */
	public static CannabisApplicationIndividualAddress fetchByPrimaryKey(
		long IndividualAddressId) {

		return getPersistence().fetchByPrimaryKey(IndividualAddressId);
	}

	/**
	 * Returns all the cannabis application individual addresses.
	 *
	 * @return the cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @return the range of cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the cannabis application individual addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationIndividualAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application individual addresses
	 * @param end the upper bound of the range of cannabis application individual addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application individual addresses
	 */
	public static List<CannabisApplicationIndividualAddress> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationIndividualAddress>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis application individual addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis application individual addresses.
	 *
	 * @return the number of cannabis application individual addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisApplicationIndividualAddressPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		CannabisApplicationIndividualAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CannabisApplicationIndividualAddressPersistence
		_persistence;

}