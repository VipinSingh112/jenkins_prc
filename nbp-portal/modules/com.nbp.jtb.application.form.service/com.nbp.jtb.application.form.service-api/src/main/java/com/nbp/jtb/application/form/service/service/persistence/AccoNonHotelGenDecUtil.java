/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AccoNonHotelGenDec;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acco non hotel gen dec service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AccoNonHotelGenDecPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoNonHotelGenDecPersistence
 * @generated
 */
public class AccoNonHotelGenDecUtil {

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
	public static void clearCache(AccoNonHotelGenDec accoNonHotelGenDec) {
		getPersistence().clearCache(accoNonHotelGenDec);
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
	public static Map<Serializable, AccoNonHotelGenDec> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccoNonHotelGenDec> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccoNonHotelGenDec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccoNonHotelGenDec> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccoNonHotelGenDec update(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		return getPersistence().update(accoNonHotelGenDec);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccoNonHotelGenDec update(
		AccoNonHotelGenDec accoNonHotelGenDec, ServiceContext serviceContext) {

		return getPersistence().update(accoNonHotelGenDec, serviceContext);
	}

	/**
	 * Returns all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of matching acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec findByUuid_First(
			String uuid,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec fetchByUuid_First(
		String uuid, OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec findByUuid_Last(
			String uuid,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec fetchByUuid_Last(
		String uuid, OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acco non hotel gen decs before and after the current acco non hotel gen dec in the ordered set where uuid = &#63;.
	 *
	 * @param accoNonHotelGenDecId the primary key of the current acco non hotel gen dec
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	public static AccoNonHotelGenDec[] findByUuid_PrevAndNext(
			long accoNonHotelGenDecId, String uuid,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().findByUuid_PrevAndNext(
			accoNonHotelGenDecId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acco non hotel gen decs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acco non hotel gen decs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco non hotel gen decs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acco non hotel gen dec where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoNonHotelGenDecException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec findByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acco non hotel gen dec where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acco non hotel gen dec where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acco non hotel gen dec where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco non hotel gen dec that was removed
	 */
	public static AccoNonHotelGenDec removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acco non hotel gen decs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco non hotel gen decs
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of matching acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acco non hotel gen decs before and after the current acco non hotel gen dec in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoNonHotelGenDecId the primary key of the current acco non hotel gen dec
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	public static AccoNonHotelGenDec[] findByUuid_C_PrevAndNext(
			long accoNonHotelGenDecId, String uuid, long companyId,
			OrderByComparator<AccoNonHotelGenDec> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accoNonHotelGenDecId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acco non hotel gen decs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acco non hotel gen decs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco non hotel gen decs
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acco non hotel gen dec where jtbApplicationId = &#63; or throws a <code>NoSuchAccoNonHotelGenDecException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the acco non hotel gen dec where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the acco non hotel gen dec where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco non hotel gen dec, or <code>null</code> if a matching acco non hotel gen dec could not be found
	 */
	public static AccoNonHotelGenDec fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the acco non hotel gen dec where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco non hotel gen dec that was removed
	 */
	public static AccoNonHotelGenDec removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of acco non hotel gen decs where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco non hotel gen decs
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the acco non hotel gen dec in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelGenDec the acco non hotel gen dec
	 */
	public static void cacheResult(AccoNonHotelGenDec accoNonHotelGenDec) {
		getPersistence().cacheResult(accoNonHotelGenDec);
	}

	/**
	 * Caches the acco non hotel gen decs in the entity cache if it is enabled.
	 *
	 * @param accoNonHotelGenDecs the acco non hotel gen decs
	 */
	public static void cacheResult(
		List<AccoNonHotelGenDec> accoNonHotelGenDecs) {

		getPersistence().cacheResult(accoNonHotelGenDecs);
	}

	/**
	 * Creates a new acco non hotel gen dec with the primary key. Does not add the acco non hotel gen dec to the database.
	 *
	 * @param accoNonHotelGenDecId the primary key for the new acco non hotel gen dec
	 * @return the new acco non hotel gen dec
	 */
	public static AccoNonHotelGenDec create(long accoNonHotelGenDecId) {
		return getPersistence().create(accoNonHotelGenDecId);
	}

	/**
	 * Removes the acco non hotel gen dec with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec that was removed
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	public static AccoNonHotelGenDec remove(long accoNonHotelGenDecId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().remove(accoNonHotelGenDecId);
	}

	public static AccoNonHotelGenDec updateImpl(
		AccoNonHotelGenDec accoNonHotelGenDec) {

		return getPersistence().updateImpl(accoNonHotelGenDec);
	}

	/**
	 * Returns the acco non hotel gen dec with the primary key or throws a <code>NoSuchAccoNonHotelGenDecException</code> if it could not be found.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec
	 * @throws NoSuchAccoNonHotelGenDecException if a acco non hotel gen dec with the primary key could not be found
	 */
	public static AccoNonHotelGenDec findByPrimaryKey(long accoNonHotelGenDecId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoNonHotelGenDecException {

		return getPersistence().findByPrimaryKey(accoNonHotelGenDecId);
	}

	/**
	 * Returns the acco non hotel gen dec with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoNonHotelGenDecId the primary key of the acco non hotel gen dec
	 * @return the acco non hotel gen dec, or <code>null</code> if a acco non hotel gen dec with the primary key could not be found
	 */
	public static AccoNonHotelGenDec fetchByPrimaryKey(
		long accoNonHotelGenDecId) {

		return getPersistence().fetchByPrimaryKey(accoNonHotelGenDecId);
	}

	/**
	 * Returns all the acco non hotel gen decs.
	 *
	 * @return the acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @return the range of acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco non hotel gen decs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoNonHotelGenDecModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco non hotel gen decs
	 * @param end the upper bound of the range of acco non hotel gen decs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco non hotel gen decs
	 */
	public static List<AccoNonHotelGenDec> findAll(
		int start, int end,
		OrderByComparator<AccoNonHotelGenDec> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acco non hotel gen decs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acco non hotel gen decs.
	 *
	 * @return the number of acco non hotel gen decs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccoNonHotelGenDecPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccoNonHotelGenDecPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccoNonHotelGenDecPersistence _persistence;

}