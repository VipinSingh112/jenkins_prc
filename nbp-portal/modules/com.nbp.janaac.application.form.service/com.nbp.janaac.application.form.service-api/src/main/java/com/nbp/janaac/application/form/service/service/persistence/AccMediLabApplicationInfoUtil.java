/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccMediLabApplicationInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc medi lab application info service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccMediLabApplicationInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabApplicationInfoPersistence
 * @generated
 */
public class AccMediLabApplicationInfoUtil {

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
		AccMediLabApplicationInfo accMediLabApplicationInfo) {

		getPersistence().clearCache(accMediLabApplicationInfo);
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
	public static Map<Serializable, AccMediLabApplicationInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccMediLabApplicationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccMediLabApplicationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccMediLabApplicationInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccMediLabApplicationInfo update(
		AccMediLabApplicationInfo accMediLabApplicationInfo) {

		return getPersistence().update(accMediLabApplicationInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccMediLabApplicationInfo update(
		AccMediLabApplicationInfo accMediLabApplicationInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			accMediLabApplicationInfo, serviceContext);
	}

	/**
	 * Returns all the acc medi lab application infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc medi lab application infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @return the range of matching acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab application infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab application infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo findByUuid_First(
			String uuid,
			OrderByComparator<AccMediLabApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo findByUuid_Last(
			String uuid,
			OrderByComparator<AccMediLabApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc medi lab application infos before and after the current acc medi lab application info in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the current acc medi lab application info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a acc medi lab application info with the primary key could not be found
	 */
	public static AccMediLabApplicationInfo[] findByUuid_PrevAndNext(
			long accMediLabApplicationInfoId, String uuid,
			OrderByComparator<AccMediLabApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().findByUuid_PrevAndNext(
			accMediLabApplicationInfoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc medi lab application infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc medi lab application infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab application infos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc medi lab application info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabApplicationInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab application info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab application info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc medi lab application info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab application info that was removed
	 */
	public static AccMediLabApplicationInfo removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc medi lab application infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab application infos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @return the range of matching acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccMediLabApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccMediLabApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc medi lab application infos before and after the current acc medi lab application info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the current acc medi lab application info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a acc medi lab application info with the primary key could not be found
	 */
	public static AccMediLabApplicationInfo[] findByUuid_C_PrevAndNext(
			long accMediLabApplicationInfoId, String uuid, long companyId,
			OrderByComparator<AccMediLabApplicationInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accMediLabApplicationInfoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc medi lab application infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc medi lab application infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab application infos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc medi lab application info where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabApplicationInfoException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc medi lab application info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc medi lab application info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab application info, or <code>null</code> if a matching acc medi lab application info could not be found
	 */
	public static AccMediLabApplicationInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc medi lab application info where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab application info that was removed
	 */
	public static AccMediLabApplicationInfo removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc medi lab application infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab application infos
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc medi lab application info in the entity cache if it is enabled.
	 *
	 * @param accMediLabApplicationInfo the acc medi lab application info
	 */
	public static void cacheResult(
		AccMediLabApplicationInfo accMediLabApplicationInfo) {

		getPersistence().cacheResult(accMediLabApplicationInfo);
	}

	/**
	 * Caches the acc medi lab application infos in the entity cache if it is enabled.
	 *
	 * @param accMediLabApplicationInfos the acc medi lab application infos
	 */
	public static void cacheResult(
		List<AccMediLabApplicationInfo> accMediLabApplicationInfos) {

		getPersistence().cacheResult(accMediLabApplicationInfos);
	}

	/**
	 * Creates a new acc medi lab application info with the primary key. Does not add the acc medi lab application info to the database.
	 *
	 * @param accMediLabApplicationInfoId the primary key for the new acc medi lab application info
	 * @return the new acc medi lab application info
	 */
	public static AccMediLabApplicationInfo create(
		long accMediLabApplicationInfoId) {

		return getPersistence().create(accMediLabApplicationInfoId);
	}

	/**
	 * Removes the acc medi lab application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info that was removed
	 * @throws NoSuchAccMediLabApplicationInfoException if a acc medi lab application info with the primary key could not be found
	 */
	public static AccMediLabApplicationInfo remove(
			long accMediLabApplicationInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().remove(accMediLabApplicationInfoId);
	}

	public static AccMediLabApplicationInfo updateImpl(
		AccMediLabApplicationInfo accMediLabApplicationInfo) {

		return getPersistence().updateImpl(accMediLabApplicationInfo);
	}

	/**
	 * Returns the acc medi lab application info with the primary key or throws a <code>NoSuchAccMediLabApplicationInfoException</code> if it could not be found.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info
	 * @throws NoSuchAccMediLabApplicationInfoException if a acc medi lab application info with the primary key could not be found
	 */
	public static AccMediLabApplicationInfo findByPrimaryKey(
			long accMediLabApplicationInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabApplicationInfoException {

		return getPersistence().findByPrimaryKey(accMediLabApplicationInfoId);
	}

	/**
	 * Returns the acc medi lab application info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabApplicationInfoId the primary key of the acc medi lab application info
	 * @return the acc medi lab application info, or <code>null</code> if a acc medi lab application info with the primary key could not be found
	 */
	public static AccMediLabApplicationInfo fetchByPrimaryKey(
		long accMediLabApplicationInfoId) {

		return getPersistence().fetchByPrimaryKey(accMediLabApplicationInfoId);
	}

	/**
	 * Returns all the acc medi lab application infos.
	 *
	 * @return the acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc medi lab application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @return the range of acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab application infos
	 * @param end the upper bound of the range of acc medi lab application infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab application infos
	 */
	public static List<AccMediLabApplicationInfo> findAll(
		int start, int end,
		OrderByComparator<AccMediLabApplicationInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc medi lab application infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc medi lab application infos.
	 *
	 * @return the number of acc medi lab application infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccMediLabApplicationInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccMediLabApplicationInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccMediLabApplicationInfoPersistence _persistence;

}