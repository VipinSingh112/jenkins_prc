/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry application service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.QuarryApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationPersistence
 * @generated
 */
public class QuarryApplicationUtil {

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
	public static void clearCache(QuarryApplication quarryApplication) {
		getPersistence().clearCache(quarryApplication);
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
	public static Map<Serializable, QuarryApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryApplication update(
		QuarryApplication quarryApplication) {

		return getPersistence().update(quarryApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryApplication update(
		QuarryApplication quarryApplication, ServiceContext serviceContext) {

		return getPersistence().update(quarryApplication, serviceContext);
	}

	/**
	 * Returns all the quarry applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quarry applications
	 */
	public static List<QuarryApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the quarry applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public static List<QuarryApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findByUuid_First(
			String uuid, OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchByUuid_First(
		String uuid, OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findByUuid_Last(
			String uuid, OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchByUuid_Last(
		String uuid, OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication[] findByUuid_PrevAndNext(
			long quarryApplicationId, String uuid,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			quarryApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the quarry applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of quarry applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quarry applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the quarry application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the quarry application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the quarry application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the quarry application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quarry application that was removed
	 */
	public static QuarryApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of quarry applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quarry applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quarry applications
	 */
	public static List<QuarryApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public static List<QuarryApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication[] findByUuid_C_PrevAndNext(
			long quarryApplicationId, String uuid, long companyId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			quarryApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the quarry applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quarry applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the quarry application where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns the quarry application where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryById(
		long quarryApplicationId) {

		return getPersistence().fetchBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns the quarry application where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryById(
		long quarryApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarryById(
			quarryApplicationId, useFinderCache);
	}

	/**
	 * Removes the quarry application where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry application that was removed
	 */
	public static QuarryApplication removeBygetQuarryById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().removeBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry applications where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry applications
	 */
	public static int countBygetQuarryById(long quarryApplicationId) {
		return getPersistence().countBygetQuarryById(quarryApplicationId);
	}

	/**
	 * Returns all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId) {

		return getPersistence().findBygetQuarryByS_U(status, userId);
	}

	/**
	 * Returns a range of all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetQuarryByS_U(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().findBygetQuarryByS_U(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarryByS_U(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByS_U_First(
			int status, long userId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByS_U_First(
		int status, long userId,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchBygetQuarryByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByS_U_Last(
			int status, long userId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByS_U_Last(
		int status, long userId,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchBygetQuarryByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication[] findBygetQuarryByS_U_PrevAndNext(
			long quarryApplicationId, int status, long userId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByS_U_PrevAndNext(
			quarryApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the quarry applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetQuarryByS_U(int status, long userId) {
		getPersistence().removeBygetQuarryByS_U(status, userId);
	}

	/**
	 * Returns the number of quarry applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching quarry applications
	 */
	public static int countBygetQuarryByS_U(int status, long userId) {
		return getPersistence().countBygetQuarryByS_U(status, userId);
	}

	/**
	 * Returns the quarry application where caseId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByCaseId(String caseId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByCaseId(caseId);
	}

	/**
	 * Returns the quarry application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByCaseId(String caseId) {
		return getPersistence().fetchBygetQuarryByCaseId(caseId);
	}

	/**
	 * Returns the quarry application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarryByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the quarry application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry application that was removed
	 */
	public static QuarryApplication removeBygetQuarryByCaseId(String caseId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().removeBygetQuarryByCaseId(caseId);
	}

	/**
	 * Returns the number of quarry applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry applications
	 */
	public static int countBygetQuarryByCaseId(String caseId) {
		return getPersistence().countBygetQuarryByCaseId(caseId);
	}

	/**
	 * Returns all the quarry applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByStatus(int status) {
		return getPersistence().findBygetQuarryByStatus(status);
	}

	/**
	 * Returns a range of all the quarry applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetQuarryByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByStatus(
		int status, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().findBygetQuarryByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByStatus(
		int status, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarryByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByStatus_First(
			int status, OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByStatus_First(
		int status, OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchBygetQuarryByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByStatus_Last(
			int status, OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByStatus_Last(
		int status, OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchBygetQuarryByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where status = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication[] findBygetQuarryByStatus_PrevAndNext(
			long quarryApplicationId, int status,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByStatus_PrevAndNext(
			quarryApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the quarry applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetQuarryByStatus(int status) {
		getPersistence().removeBygetQuarryByStatus(status);
	}

	/**
	 * Returns the number of quarry applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching quarry applications
	 */
	public static int countBygetQuarryByStatus(int status) {
		return getPersistence().countBygetQuarryByStatus(status);
	}

	/**
	 * Returns all the quarry applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId) {

		return getPersistence().findBygetQuarryByEntityId(entityId);
	}

	/**
	 * Returns a range of all the quarry applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId, int start, int end) {

		return getPersistence().findBygetQuarryByEntityId(entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().findBygetQuarryByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarryByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByEntityId_First(
			long entityId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByEntityId_First(
		long entityId, OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchBygetQuarryByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByEntityId_Last(
			long entityId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByEntityId_Last(
		long entityId, OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchBygetQuarryByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication[] findBygetQuarryByEntityId_PrevAndNext(
			long quarryApplicationId, long entityId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByEntityId_PrevAndNext(
			quarryApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the quarry applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetQuarryByEntityId(long entityId) {
		getPersistence().removeBygetQuarryByEntityId(entityId);
	}

	/**
	 * Returns the number of quarry applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching quarry applications
	 */
	public static int countBygetQuarryByEntityId(long entityId) {
		return getPersistence().countBygetQuarryByEntityId(entityId);
	}

	/**
	 * Returns all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status) {

		return getPersistence().findBygetQuarryByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status, int start, int end) {

		return getPersistence().findBygetQuarryByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().findBygetQuarryByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public static List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarryByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByEntityId_Status_First(
			long entityId, int status,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByEntityId_Status_First(
		long entityId, int status,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchBygetQuarryByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByEntityId_Status_Last(
			long entityId, int status,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByEntityId_Status_Last(
		long entityId, int status,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().fetchBygetQuarryByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication[]
			findBygetQuarryByEntityId_Status_PrevAndNext(
				long quarryApplicationId, long entityId, int status,
				OrderByComparator<QuarryApplication> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByEntityId_Status_PrevAndNext(
			quarryApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the quarry applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetQuarryByEntityId_Status(
		long entityId, int status) {

		getPersistence().removeBygetQuarryByEntityId_Status(entityId, status);
	}

	/**
	 * Returns the number of quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching quarry applications
	 */
	public static int countBygetQuarryByEntityId_Status(
		long entityId, int status) {

		return getPersistence().countBygetQuarryByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the quarry application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByEI_CI(
			long entityId, String caseId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the quarry application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByEI_CI(
		long entityId, String caseId) {

		return getPersistence().fetchBygetQuarryByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the quarry application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByEI_CI(
		long entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarryByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the quarry application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the quarry application that was removed
	 */
	public static QuarryApplication removeBygetQuarryByEI_CI(
			long entityId, String caseId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().removeBygetQuarryByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of quarry applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching quarry applications
	 */
	public static int countBygetQuarryByEI_CI(long entityId, String caseId) {
		return getPersistence().countBygetQuarryByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the quarry application where applicationNumber = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByAppNo(
			String applicationNumber)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByAppNo(applicationNumber);
	}

	/**
	 * Returns the quarry application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetQuarryByAppNo(applicationNumber);
	}

	/**
	 * Returns the quarry application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarryByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the quarry application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the quarry application that was removed
	 */
	public static QuarryApplication removeBygetQuarryByAppNo(
			String applicationNumber)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().removeBygetQuarryByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of quarry applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching quarry applications
	 */
	public static int countBygetQuarryByAppNo(String applicationNumber) {
		return getPersistence().countBygetQuarryByAppNo(applicationNumber);
	}

	/**
	 * Returns the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public static QuarryApplication findBygetQuarryByAppType_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findBygetQuarryByAppType_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByAppType_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetQuarryByAppType_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchBygetQuarryByAppType_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetQuarryByAppType_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the quarry application that was removed
	 */
	public static QuarryApplication removeBygetQuarryByAppType_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().removeBygetQuarryByAppType_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of quarry applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching quarry applications
	 */
	public static int countBygetQuarryByAppType_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return getPersistence().countBygetQuarryByAppType_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Caches the quarry application in the entity cache if it is enabled.
	 *
	 * @param quarryApplication the quarry application
	 */
	public static void cacheResult(QuarryApplication quarryApplication) {
		getPersistence().cacheResult(quarryApplication);
	}

	/**
	 * Caches the quarry applications in the entity cache if it is enabled.
	 *
	 * @param quarryApplications the quarry applications
	 */
	public static void cacheResult(List<QuarryApplication> quarryApplications) {
		getPersistence().cacheResult(quarryApplications);
	}

	/**
	 * Creates a new quarry application with the primary key. Does not add the quarry application to the database.
	 *
	 * @param quarryApplicationId the primary key for the new quarry application
	 * @return the new quarry application
	 */
	public static QuarryApplication create(long quarryApplicationId) {
		return getPersistence().create(quarryApplicationId);
	}

	/**
	 * Removes the quarry application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application that was removed
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication remove(long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().remove(quarryApplicationId);
	}

	public static QuarryApplication updateImpl(
		QuarryApplication quarryApplication) {

		return getPersistence().updateImpl(quarryApplication);
	}

	/**
	 * Returns the quarry application with the primary key or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication findByPrimaryKey(long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getPersistence().findByPrimaryKey(quarryApplicationId);
	}

	/**
	 * Returns the quarry application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application, or <code>null</code> if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication fetchByPrimaryKey(
		long quarryApplicationId) {

		return getPersistence().fetchByPrimaryKey(quarryApplicationId);
	}

	/**
	 * Returns all the quarry applications.
	 *
	 * @return the quarry applications
	 */
	public static List<QuarryApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of quarry applications
	 */
	public static List<QuarryApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry applications
	 */
	public static List<QuarryApplication> findAll(
		int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry applications
	 */
	public static List<QuarryApplication> findAll(
		int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry applications.
	 *
	 * @return the number of quarry applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QuarryApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryApplicationPersistence _persistence;

}