/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.HsraApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the hsra application service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.HsraApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationPersistence
 * @generated
 */
public class HsraApplicationUtil {

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
	public static void clearCache(HsraApplication hsraApplication) {
		getPersistence().clearCache(hsraApplication);
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
	public static Map<Serializable, HsraApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HsraApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HsraApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HsraApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HsraApplication update(HsraApplication hsraApplication) {
		return getPersistence().update(hsraApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HsraApplication update(
		HsraApplication hsraApplication, ServiceContext serviceContext) {

		return getPersistence().update(hsraApplication, serviceContext);
	}

	/**
	 * Returns all the hsra applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching hsra applications
	 */
	public static List<HsraApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the hsra applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public static List<HsraApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findByUuid_First(
			String uuid, OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchByUuid_First(
		String uuid, OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findByUuid_Last(
			String uuid, OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchByUuid_Last(
		String uuid, OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication[] findByUuid_PrevAndNext(
			long hsraApplicationId, String uuid,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			hsraApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the hsra applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of hsra applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching hsra applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the hsra application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the hsra application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the hsra application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the hsra application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the hsra application that was removed
	 */
	public static HsraApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of hsra applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching hsra applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching hsra applications
	 */
	public static List<HsraApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public static List<HsraApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication[] findByUuid_C_PrevAndNext(
			long hsraApplicationId, String uuid, long companyId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			hsraApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the hsra applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching hsra applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByS_U(
		long userId, int status) {

		return getPersistence().findBygetHsraByS_U(userId, status);
	}

	/**
	 * Returns a range of all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetHsraByS_U(userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().findBygetHsraByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByS_U_First(
			long userId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByS_U_First(
		long userId, int status,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchBygetHsraByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByS_U_Last(
			long userId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByS_U_Last(
		long userId, int status,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchBygetHsraByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication[] findBygetHsraByS_U_PrevAndNext(
			long hsraApplicationId, long userId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByS_U_PrevAndNext(
			hsraApplicationId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the hsra applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetHsraByS_U(long userId, int status) {
		getPersistence().removeBygetHsraByS_U(userId, status);
	}

	/**
	 * Returns the number of hsra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching hsra applications
	 */
	public static int countBygetHsraByS_U(long userId, int status) {
		return getPersistence().countBygetHsraByS_U(userId, status);
	}

	/**
	 * Returns all the hsra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByStatus(int status) {
		return getPersistence().findBygetHsraByStatus(status);
	}

	/**
	 * Returns a range of all the hsra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetHsraByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByStatus(
		int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().findBygetHsraByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByStatus(
		int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByStatus_First(
			int status, OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByStatus_First(
		int status, OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchBygetHsraByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByStatus_Last(
			int status, OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByStatus_Last(
		int status, OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchBygetHsraByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where status = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication[] findBygetHsraByStatus_PrevAndNext(
			long hsraApplicationId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByStatus_PrevAndNext(
			hsraApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the hsra applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetHsraByStatus(int status) {
		getPersistence().removeBygetHsraByStatus(status);
	}

	/**
	 * Returns the number of hsra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching hsra applications
	 */
	public static int countBygetHsraByStatus(int status) {
		return getPersistence().countBygetHsraByStatus(status);
	}

	/**
	 * Returns the hsra application where applicationNumber = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByAppNum(
			String applicationNumber)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByAppNum(applicationNumber);
	}

	/**
	 * Returns the hsra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByAppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetHsraByAppNum(applicationNumber);
	}

	/**
	 * Returns the hsra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByAppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraByAppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the hsra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the hsra application that was removed
	 */
	public static HsraApplication removeBygetHsraByAppNum(
			String applicationNumber)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().removeBygetHsraByAppNum(applicationNumber);
	}

	/**
	 * Returns the number of hsra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching hsra applications
	 */
	public static int countBygetHsraByAppNum(String applicationNumber) {
		return getPersistence().countBygetHsraByAppNum(applicationNumber);
	}

	/**
	 * Returns the hsra application where caseId = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByCaseId(String caseId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByCaseId(caseId);
	}

	/**
	 * Returns the hsra application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByCaseId(String caseId) {
		return getPersistence().fetchBygetHsraByCaseId(caseId);
	}

	/**
	 * Returns the hsra application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the hsra application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application that was removed
	 */
	public static HsraApplication removeBygetHsraByCaseId(String caseId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().removeBygetHsraByCaseId(caseId);
	}

	/**
	 * Returns the number of hsra applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra applications
	 */
	public static int countBygetHsraByCaseId(String caseId) {
		return getPersistence().countBygetHsraByCaseId(caseId);
	}

	/**
	 * Returns all the hsra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByEntityId(
		String entityId) {

		return getPersistence().findBygetHsraByEntityId(entityId);
	}

	/**
	 * Returns a range of all the hsra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByEntityId(
		String entityId, int start, int end) {

		return getPersistence().findBygetHsraByEntityId(entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByEntityId(
		String entityId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().findBygetHsraByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByEntityId(
		String entityId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByEntityId_First(
			String entityId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByEntityId_First(
		String entityId, OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchBygetHsraByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByEntityId_Last(
			String entityId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByEntityId_Last(
		String entityId, OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchBygetHsraByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication[] findBygetHsraByEntityId_PrevAndNext(
			long hsraApplicationId, String entityId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByEntityId_PrevAndNext(
			hsraApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the hsra applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetHsraByEntityId(String entityId) {
		getPersistence().removeBygetHsraByEntityId(entityId);
	}

	/**
	 * Returns the number of hsra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching hsra applications
	 */
	public static int countBygetHsraByEntityId(String entityId) {
		return getPersistence().countBygetHsraByEntityId(entityId);
	}

	/**
	 * Returns all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status) {

		return getPersistence().findBygetHsraByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status, int start, int end) {

		return getPersistence().findBygetHsraByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().findBygetHsraByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public static List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchBygetHsraByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().fetchBygetHsraByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication[] findBygetHsraByEntityId_Status_PrevAndNext(
			long hsraApplicationId, String entityId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByEntityId_Status_PrevAndNext(
			hsraApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the hsra applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetHsraByEntityId_Status(
		String entityId, int status) {

		getPersistence().removeBygetHsraByEntityId_Status(entityId, status);
	}

	/**
	 * Returns the number of hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching hsra applications
	 */
	public static int countBygetHsraByEntityId_Status(
		String entityId, int status) {

		return getPersistence().countBygetHsraByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the hsra application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByEI_CI(
			String entityId, String caseId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the hsra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByEI_CI(
		String entityId, String caseId) {

		return getPersistence().fetchBygetHsraByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the hsra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the hsra application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the hsra application that was removed
	 */
	public static HsraApplication removeBygetHsraByEI_CI(
			String entityId, String caseId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().removeBygetHsraByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of hsra applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching hsra applications
	 */
	public static int countBygetHsraByEI_CI(String entityId, String caseId) {
		return getPersistence().countBygetHsraByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public static HsraApplication findBygetHsraByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findBygetHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Returns the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Returns the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchBygetHsraByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the hsra application that was removed
	 */
	public static HsraApplication removeBygetHsraByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().removeBygetHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of hsra applications where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching hsra applications
	 */
	public static int countBygetHsraByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		return getPersistence().countBygetHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	/**
	 * Caches the hsra application in the entity cache if it is enabled.
	 *
	 * @param hsraApplication the hsra application
	 */
	public static void cacheResult(HsraApplication hsraApplication) {
		getPersistence().cacheResult(hsraApplication);
	}

	/**
	 * Caches the hsra applications in the entity cache if it is enabled.
	 *
	 * @param hsraApplications the hsra applications
	 */
	public static void cacheResult(List<HsraApplication> hsraApplications) {
		getPersistence().cacheResult(hsraApplications);
	}

	/**
	 * Creates a new hsra application with the primary key. Does not add the hsra application to the database.
	 *
	 * @param hsraApplicationId the primary key for the new hsra application
	 * @return the new hsra application
	 */
	public static HsraApplication create(long hsraApplicationId) {
		return getPersistence().create(hsraApplicationId);
	}

	/**
	 * Removes the hsra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application that was removed
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication remove(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().remove(hsraApplicationId);
	}

	public static HsraApplication updateImpl(HsraApplication hsraApplication) {
		return getPersistence().updateImpl(hsraApplication);
	}

	/**
	 * Returns the hsra application with the primary key or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication findByPrimaryKey(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getPersistence().findByPrimaryKey(hsraApplicationId);
	}

	/**
	 * Returns the hsra application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application, or <code>null</code> if a hsra application with the primary key could not be found
	 */
	public static HsraApplication fetchByPrimaryKey(long hsraApplicationId) {
		return getPersistence().fetchByPrimaryKey(hsraApplicationId);
	}

	/**
	 * Returns all the hsra applications.
	 *
	 * @return the hsra applications
	 */
	public static List<HsraApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of hsra applications
	 */
	public static List<HsraApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra applications
	 */
	public static List<HsraApplication> findAll(
		int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra applications
	 */
	public static List<HsraApplication> findAll(
		int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the hsra applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of hsra applications.
	 *
	 * @return the number of hsra applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HsraApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(HsraApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile HsraApplicationPersistence _persistence;

}