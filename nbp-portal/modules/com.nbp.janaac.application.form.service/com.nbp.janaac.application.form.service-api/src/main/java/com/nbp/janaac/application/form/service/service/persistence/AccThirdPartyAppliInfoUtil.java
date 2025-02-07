/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccThirdPartyAppliInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc third party appli info service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccThirdPartyAppliInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyAppliInfoPersistence
 * @generated
 */
public class AccThirdPartyAppliInfoUtil {

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
		AccThirdPartyAppliInfo accThirdPartyAppliInfo) {

		getPersistence().clearCache(accThirdPartyAppliInfo);
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
	public static Map<Serializable, AccThirdPartyAppliInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccThirdPartyAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccThirdPartyAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccThirdPartyAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccThirdPartyAppliInfo update(
		AccThirdPartyAppliInfo accThirdPartyAppliInfo) {

		return getPersistence().update(accThirdPartyAppliInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccThirdPartyAppliInfo update(
		AccThirdPartyAppliInfo accThirdPartyAppliInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(accThirdPartyAppliInfo, serviceContext);
	}

	/**
	 * Returns all the acc third party appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc third party appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @return the range of matching acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc third party appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc third party appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo findByUuid_First(
			String uuid,
			OrderByComparator<AccThirdPartyAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo findByUuid_Last(
			String uuid,
			OrderByComparator<AccThirdPartyAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc third party appli infos before and after the current acc third party appli info in the ordered set where uuid = &#63;.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the current acc third party appli info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a acc third party appli info with the primary key could not be found
	 */
	public static AccThirdPartyAppliInfo[] findByUuid_PrevAndNext(
			long accThirdPartyAppliInfoId, String uuid,
			OrderByComparator<AccThirdPartyAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().findByUuid_PrevAndNext(
			accThirdPartyAppliInfoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc third party appli infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc third party appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc third party appli infos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc third party appli info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccThirdPartyAppliInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo findByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc third party appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc third party appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc third party appli info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc third party appli info that was removed
	 */
	public static AccThirdPartyAppliInfo removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc third party appli infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc third party appli infos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @return the range of matching acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccThirdPartyAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccThirdPartyAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc third party appli infos before and after the current acc third party appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the current acc third party appli info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a acc third party appli info with the primary key could not be found
	 */
	public static AccThirdPartyAppliInfo[] findByUuid_C_PrevAndNext(
			long accThirdPartyAppliInfoId, String uuid, long companyId,
			OrderByComparator<AccThirdPartyAppliInfo> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accThirdPartyAppliInfoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc third party appli infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc third party appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc third party appli infos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc third party appli info where janaacApplicationId = &#63; or throws a <code>NoSuchAccThirdPartyAppliInfoException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc third party appli info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc third party appli info where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc third party appli info, or <code>null</code> if a matching acc third party appli info could not be found
	 */
	public static AccThirdPartyAppliInfo fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc third party appli info where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc third party appli info that was removed
	 */
	public static AccThirdPartyAppliInfo removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc third party appli infos where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc third party appli infos
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc third party appli info in the entity cache if it is enabled.
	 *
	 * @param accThirdPartyAppliInfo the acc third party appli info
	 */
	public static void cacheResult(
		AccThirdPartyAppliInfo accThirdPartyAppliInfo) {

		getPersistence().cacheResult(accThirdPartyAppliInfo);
	}

	/**
	 * Caches the acc third party appli infos in the entity cache if it is enabled.
	 *
	 * @param accThirdPartyAppliInfos the acc third party appli infos
	 */
	public static void cacheResult(
		List<AccThirdPartyAppliInfo> accThirdPartyAppliInfos) {

		getPersistence().cacheResult(accThirdPartyAppliInfos);
	}

	/**
	 * Creates a new acc third party appli info with the primary key. Does not add the acc third party appli info to the database.
	 *
	 * @param accThirdPartyAppliInfoId the primary key for the new acc third party appli info
	 * @return the new acc third party appli info
	 */
	public static AccThirdPartyAppliInfo create(long accThirdPartyAppliInfoId) {
		return getPersistence().create(accThirdPartyAppliInfoId);
	}

	/**
	 * Removes the acc third party appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the acc third party appli info
	 * @return the acc third party appli info that was removed
	 * @throws NoSuchAccThirdPartyAppliInfoException if a acc third party appli info with the primary key could not be found
	 */
	public static AccThirdPartyAppliInfo remove(long accThirdPartyAppliInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().remove(accThirdPartyAppliInfoId);
	}

	public static AccThirdPartyAppliInfo updateImpl(
		AccThirdPartyAppliInfo accThirdPartyAppliInfo) {

		return getPersistence().updateImpl(accThirdPartyAppliInfo);
	}

	/**
	 * Returns the acc third party appli info with the primary key or throws a <code>NoSuchAccThirdPartyAppliInfoException</code> if it could not be found.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the acc third party appli info
	 * @return the acc third party appli info
	 * @throws NoSuchAccThirdPartyAppliInfoException if a acc third party appli info with the primary key could not be found
	 */
	public static AccThirdPartyAppliInfo findByPrimaryKey(
			long accThirdPartyAppliInfoId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyAppliInfoException {

		return getPersistence().findByPrimaryKey(accThirdPartyAppliInfoId);
	}

	/**
	 * Returns the acc third party appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accThirdPartyAppliInfoId the primary key of the acc third party appli info
	 * @return the acc third party appli info, or <code>null</code> if a acc third party appli info with the primary key could not be found
	 */
	public static AccThirdPartyAppliInfo fetchByPrimaryKey(
		long accThirdPartyAppliInfoId) {

		return getPersistence().fetchByPrimaryKey(accThirdPartyAppliInfoId);
	}

	/**
	 * Returns all the acc third party appli infos.
	 *
	 * @return the acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc third party appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @return the range of acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc third party appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc third party appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party appli infos
	 * @param end the upper bound of the range of acc third party appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc third party appli infos
	 */
	public static List<AccThirdPartyAppliInfo> findAll(
		int start, int end,
		OrderByComparator<AccThirdPartyAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc third party appli infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc third party appli infos.
	 *
	 * @return the number of acc third party appli infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccThirdPartyAppliInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccThirdPartyAppliInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccThirdPartyAppliInfoPersistence _persistence;

}