/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.AccoHomeStay;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acco home stay service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.AccoHomeStayPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccoHomeStayPersistence
 * @generated
 */
public class AccoHomeStayUtil {

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
	public static void clearCache(AccoHomeStay accoHomeStay) {
		getPersistence().clearCache(accoHomeStay);
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
	public static Map<Serializable, AccoHomeStay> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccoHomeStay> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccoHomeStay> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccoHomeStay> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccoHomeStay update(AccoHomeStay accoHomeStay) {
		return getPersistence().update(accoHomeStay);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccoHomeStay update(
		AccoHomeStay accoHomeStay, ServiceContext serviceContext) {

		return getPersistence().update(accoHomeStay, serviceContext);
	}

	/**
	 * Returns all the acco home stays where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acco home stays
	 */
	public static List<AccoHomeStay> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acco home stays where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of matching acco home stays
	 */
	public static List<AccoHomeStay> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco home stays
	 */
	public static List<AccoHomeStay> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco home stays
	 */
	public static List<AccoHomeStay> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public static AccoHomeStay findByUuid_First(
			String uuid, OrderByComparator<AccoHomeStay> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public static AccoHomeStay fetchByUuid_First(
		String uuid, OrderByComparator<AccoHomeStay> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public static AccoHomeStay findByUuid_Last(
			String uuid, OrderByComparator<AccoHomeStay> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public static AccoHomeStay fetchByUuid_Last(
		String uuid, OrderByComparator<AccoHomeStay> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acco home stays before and after the current acco home stay in the ordered set where uuid = &#63;.
	 *
	 * @param accoHomeStayId the primary key of the current acco home stay
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	public static AccoHomeStay[] findByUuid_PrevAndNext(
			long accoHomeStayId, String uuid,
			OrderByComparator<AccoHomeStay> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().findByUuid_PrevAndNext(
			accoHomeStayId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acco home stays where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acco home stays where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acco home stays
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acco home stay where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccoHomeStayException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public static AccoHomeStay findByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acco home stay where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public static AccoHomeStay fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acco home stay where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public static AccoHomeStay fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acco home stay where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acco home stay that was removed
	 */
	public static AccoHomeStay removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acco home stays where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acco home stays
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acco home stays
	 */
	public static List<AccoHomeStay> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of matching acco home stays
	 */
	public static List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acco home stays
	 */
	public static List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acco home stays
	 */
	public static List<AccoHomeStay> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccoHomeStay> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public static AccoHomeStay findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccoHomeStay> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public static AccoHomeStay fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public static AccoHomeStay findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccoHomeStay> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public static AccoHomeStay fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccoHomeStay> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acco home stays before and after the current acco home stay in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accoHomeStayId the primary key of the current acco home stay
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	public static AccoHomeStay[] findByUuid_C_PrevAndNext(
			long accoHomeStayId, String uuid, long companyId,
			OrderByComparator<AccoHomeStay> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accoHomeStayId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acco home stays where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acco home stays where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acco home stays
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acco home stay where jtbApplicationId = &#63; or throws a <code>NoSuchAccoHomeStayException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco home stay
	 * @throws NoSuchAccoHomeStayException if a matching acco home stay could not be found
	 */
	public static AccoHomeStay findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().findBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the acco home stay where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public static AccoHomeStay fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return getPersistence().fetchBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Returns the acco home stay where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acco home stay, or <code>null</code> if a matching acco home stay could not be found
	 */
	public static AccoHomeStay fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByApplicationId(
			jtbApplicationId, useFinderCache);
	}

	/**
	 * Removes the acco home stay where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the acco home stay that was removed
	 */
	public static AccoHomeStay removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().removeBygetJTB_ByApplicationId(
			jtbApplicationId);
	}

	/**
	 * Returns the number of acco home stays where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching acco home stays
	 */
	public static int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		return getPersistence().countBygetJTB_ByApplicationId(jtbApplicationId);
	}

	/**
	 * Caches the acco home stay in the entity cache if it is enabled.
	 *
	 * @param accoHomeStay the acco home stay
	 */
	public static void cacheResult(AccoHomeStay accoHomeStay) {
		getPersistence().cacheResult(accoHomeStay);
	}

	/**
	 * Caches the acco home stays in the entity cache if it is enabled.
	 *
	 * @param accoHomeStays the acco home stays
	 */
	public static void cacheResult(List<AccoHomeStay> accoHomeStays) {
		getPersistence().cacheResult(accoHomeStays);
	}

	/**
	 * Creates a new acco home stay with the primary key. Does not add the acco home stay to the database.
	 *
	 * @param accoHomeStayId the primary key for the new acco home stay
	 * @return the new acco home stay
	 */
	public static AccoHomeStay create(long accoHomeStayId) {
		return getPersistence().create(accoHomeStayId);
	}

	/**
	 * Removes the acco home stay with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay that was removed
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	public static AccoHomeStay remove(long accoHomeStayId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().remove(accoHomeStayId);
	}

	public static AccoHomeStay updateImpl(AccoHomeStay accoHomeStay) {
		return getPersistence().updateImpl(accoHomeStay);
	}

	/**
	 * Returns the acco home stay with the primary key or throws a <code>NoSuchAccoHomeStayException</code> if it could not be found.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay
	 * @throws NoSuchAccoHomeStayException if a acco home stay with the primary key could not be found
	 */
	public static AccoHomeStay findByPrimaryKey(long accoHomeStayId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchAccoHomeStayException {

		return getPersistence().findByPrimaryKey(accoHomeStayId);
	}

	/**
	 * Returns the acco home stay with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accoHomeStayId the primary key of the acco home stay
	 * @return the acco home stay, or <code>null</code> if a acco home stay with the primary key could not be found
	 */
	public static AccoHomeStay fetchByPrimaryKey(long accoHomeStayId) {
		return getPersistence().fetchByPrimaryKey(accoHomeStayId);
	}

	/**
	 * Returns all the acco home stays.
	 *
	 * @return the acco home stays
	 */
	public static List<AccoHomeStay> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @return the range of acco home stays
	 */
	public static List<AccoHomeStay> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acco home stays
	 */
	public static List<AccoHomeStay> findAll(
		int start, int end, OrderByComparator<AccoHomeStay> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acco home stays.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccoHomeStayModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acco home stays
	 * @param end the upper bound of the range of acco home stays (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acco home stays
	 */
	public static List<AccoHomeStay> findAll(
		int start, int end, OrderByComparator<AccoHomeStay> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acco home stays from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acco home stays.
	 *
	 * @return the number of acco home stays
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccoHomeStayPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AccoHomeStayPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AccoHomeStayPersistence _persistence;

}