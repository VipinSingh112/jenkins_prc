/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AccoNonHotelLicence;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acco non hotel licence service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AccoNonHotelLicencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelLicencePersistence
 * @generated
 */
public class AccoNonHotelLicenceUtil {

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
	public static void clearCache(AccoNonHotelLicence accoNonHotelLicence) {
		getPersistence().clearCache(accoNonHotelLicence);
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
	public static Map<Serializable, AccoNonHotelLicence> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccoNonHotelLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccoNonHotelLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccoNonHotelLicence> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccoNonHotelLicence update(
		AccoNonHotelLicence accoNonHotelLicence) {

		return getPersistence().update(accoNonHotelLicence);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccoNonHotelLicence update(
		AccoNonHotelLicence accoNonHotelLicence,
		ServiceContext serviceContext) {

		return getPersistence().update(accoNonHotelLicence, serviceContext);
	}

	/**
	 * Returns all the acco non hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acco non hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of matching acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence findByUuid_First(
			String uuid,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence fetchByUuid_First(
		String uuid, OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence findByUuid_Last(
			String uuid,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence fetchByUuid_Last(
		String uuid, OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acco non hotel licences before and after the current acco non hotel licence in the ordered set where uuid = &#63;.
	 *
	 * @param accoNonHotelLicenceId the primary key of the current acco non hotel licence
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	public static AccoNonHotelLicence[] findByUuid_PrevAndNext(
			long accoNonHotelLicenceId, String uuid,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().findByUuid_PrevAndNext(
			accoNonHotelLicenceId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acco non hotel licences where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acco non hotel licences where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco non hotel licences
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acco non hotel licence where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoNonHotelLicenceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence findByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acco non hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acco non hotel licence where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acco non hotel licence where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco non hotel licence that was removed
	 */
	public static AccoNonHotelLicence removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acco non hotel licences where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco non hotel licences
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of matching acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acco non hotel licences before and after the current acco non hotel licence in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoNonHotelLicenceId the primary key of the current acco non hotel licence
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	public static AccoNonHotelLicence[] findByUuid_C_PrevAndNext(
			long accoNonHotelLicenceId, String uuid, long companyId,
			OrderByComparator<AccoNonHotelLicence> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accoNonHotelLicenceId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acco non hotel licences where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acco non hotel licences where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco non hotel licences
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acco non hotel licence where jtbApplicationId = &#63; or throws a <code>NoSuchAccoNonHotelLicenceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the acco non hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the acco non hotel licence where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel licence, or <code>null</code> if a matching acco non hotel licence could not be found
	 */
	public static AccoNonHotelLicence fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the acco non hotel licence where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco non hotel licence that was removed
	 */
	public static AccoNonHotelLicence removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of acco non hotel licences where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco non hotel licences
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the acco non hotel licence in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelLicence the acco non hotel licence
	 */
	public static void cacheResult(AccoNonHotelLicence accoNonHotelLicence) {
		getPersistence().cacheResult(accoNonHotelLicence);
	}

	/**
	 * Caches the acco non hotel licences in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelLicences the acco non hotel licences
	 */
	public static void cacheResult(
		List<AccoNonHotelLicence> accoNonHotelLicences) {

		getPersistence().cacheResult(accoNonHotelLicences);
	}

	/**
	 * Creates a new acco non hotel licence with the primary key. Does not add the acco non hotel licence to the database.
	 *
	 * @param accoNonHotelLicenceId the primary key for the new acco non hotel licence
	 * @return the new acco non hotel licence
	 */
	public static AccoNonHotelLicence create(long accoNonHotelLicenceId) {
		return getPersistence().create(accoNonHotelLicenceId);
	}

	/**
	 * Removes the acco non hotel licence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence that was removed
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	public static AccoNonHotelLicence remove(long accoNonHotelLicenceId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().remove(accoNonHotelLicenceId);
	}

	public static AccoNonHotelLicence updateImpl(
		AccoNonHotelLicence accoNonHotelLicence) {

		return getPersistence().updateImpl(accoNonHotelLicence);
	}

	/**
	 * Returns the acco non hotel licence with the primary key or throws a <code>NoSuchAccoNonHotelLicenceException</code> if it could not be found.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence
	 * @throws NoSuchAccoNonHotelLicenceException if a acco non hotel licence with the primary key could not be found
	 */
	public static AccoNonHotelLicence findByPrimaryKey(
			long accoNonHotelLicenceId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelLicenceException {

		return getPersistence().findByPrimaryKey(accoNonHotelLicenceId);
	}

	/**
	 * Returns the acco non hotel licence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoNonHotelLicenceId the primary key of the acco non hotel licence
	 * @return the acco non hotel licence, or <code>null</code> if a acco non hotel licence with the primary key could not be found
	 */
	public static AccoNonHotelLicence fetchByPrimaryKey(
		long accoNonHotelLicenceId) {

		return getPersistence().fetchByPrimaryKey(accoNonHotelLicenceId);
	}

	/**
	 * Returns all the acco non hotel licences.
	 *
	 * @return the acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @return the range of acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco non hotel licences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelLicenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel licences
	 * @param end the upper bound of the range of acco non hotel licences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco non hotel licences
	 */
	public static List<AccoNonHotelLicence> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelLicence> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acco non hotel licences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acco non hotel licences.
	 *
	 * @return the number of acco non hotel licences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccoNonHotelLicencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccoNonHotelLicencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccoNonHotelLicencePersistence _persistence;

}