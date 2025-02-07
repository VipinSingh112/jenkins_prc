/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquireApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire application service. This utility wraps <code>com.nbp.acquire.application.form.service.service.persistence.impl.AcquireApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationPersistence
 * @generated
 */
public class AcquireApplicationUtil {

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
	public static void clearCache(AcquireApplication acquireApplication) {
		getPersistence().clearCache(acquireApplication);
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
	public static Map<Serializable, AcquireApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireApplication update(
		AcquireApplication acquireApplication) {

		return getPersistence().update(acquireApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireApplication update(
		AcquireApplication acquireApplication, ServiceContext serviceContext) {

		return getPersistence().update(acquireApplication, serviceContext);
	}

	/**
	 * Returns all the acquire applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acquire applications
	 */
	public static List<AcquireApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acquire applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	public static List<AcquireApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	public static List<AcquireApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	public static List<AcquireApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findByUuid_First(
			String uuid,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchByUuid_First(
		String uuid, OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findByUuid_Last(
			String uuid,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchByUuid_Last(
		String uuid, OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public static AcquireApplication[] findByUuid_PrevAndNext(
			long acquireApplicationId, String uuid,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			acquireApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acquire applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acquire applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acquire applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acquire application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acquire application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acquire application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acquire application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acquire application that was removed
	 */
	public static AcquireApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acquire applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acquire applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acquire applications
	 */
	public static List<AcquireApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	public static List<AcquireApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	public static List<AcquireApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	public static List<AcquireApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public static AcquireApplication[] findByUuid_C_PrevAndNext(
			long acquireApplicationId, String uuid, long companyId,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			acquireApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acquire applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acquire applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acquire application where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire application where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchBygetAcquireById(
		long acquireApplicationId) {

		return getPersistence().fetchBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire application where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireById(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire application where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire application that was removed
	 */
	public static AcquireApplication removeBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().removeBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the number of acquire applications where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire applications
	 */
	public static int countBygetAcquireById(long acquireApplicationId) {
		return getPersistence().countBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching acquire applications
	 */
	public static List<AcquireApplication>
		findBygetAcquireApplicationByStatusUser(int status, long userId) {

		return getPersistence().findBygetAcquireApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns a range of all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	public static List<AcquireApplication>
		findBygetAcquireApplicationByStatusUser(
			int status, long userId, int start, int end) {

		return getPersistence().findBygetAcquireApplicationByStatusUser(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	public static List<AcquireApplication>
		findBygetAcquireApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().findBygetAcquireApplicationByStatusUser(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	public static List<AcquireApplication>
		findBygetAcquireApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<AcquireApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetAcquireApplicationByStatusUser(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication
			findBygetAcquireApplicationByStatusUser_First(
				int status, long userId,
				OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findBygetAcquireApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication
		fetchBygetAcquireApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().fetchBygetAcquireApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication
			findBygetAcquireApplicationByStatusUser_Last(
				int status, long userId,
				OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findBygetAcquireApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication
		fetchBygetAcquireApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().fetchBygetAcquireApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public static AcquireApplication[]
			findBygetAcquireApplicationByStatusUser_PrevAndNext(
				long acquireApplicationId, int status, long userId,
				OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().
			findBygetAcquireApplicationByStatusUser_PrevAndNext(
				acquireApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the acquire applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetAcquireApplicationByStatusUser(
		int status, long userId) {

		getPersistence().removeBygetAcquireApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns the number of acquire applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching acquire applications
	 */
	public static int countBygetAcquireApplicationByStatusUser(
		int status, long userId) {

		return getPersistence().countBygetAcquireApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns all the acquire applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching acquire applications
	 */
	public static List<AcquireApplication> findBygetAcquireByStatus(
		int status) {

		return getPersistence().findBygetAcquireByStatus(status);
	}

	/**
	 * Returns a range of all the acquire applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	public static List<AcquireApplication> findBygetAcquireByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetAcquireByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	public static List<AcquireApplication> findBygetAcquireByStatus(
		int status, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().findBygetAcquireByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	public static List<AcquireApplication> findBygetAcquireByStatus(
		int status, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetAcquireByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findBygetAcquireByStatus_First(
			int status, OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findBygetAcquireByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchBygetAcquireByStatus_First(
		int status, OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().fetchBygetAcquireByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findBygetAcquireByStatus_Last(
			int status, OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findBygetAcquireByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchBygetAcquireByStatus_Last(
		int status, OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().fetchBygetAcquireByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where status = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public static AcquireApplication[] findBygetAcquireByStatus_PrevAndNext(
			long acquireApplicationId, int status,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findBygetAcquireByStatus_PrevAndNext(
			acquireApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the acquire applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetAcquireByStatus(int status) {
		getPersistence().removeBygetAcquireByStatus(status);
	}

	/**
	 * Returns the number of acquire applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching acquire applications
	 */
	public static int countBygetAcquireByStatus(int status) {
		return getPersistence().countBygetAcquireByStatus(status);
	}

	/**
	 * Returns the acquire application where applicationNumber = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findBygetAcquireByAppNo(
			String applicationNumber)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findBygetAcquireByAppNo(applicationNumber);
	}

	/**
	 * Returns the acquire application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchBygetAcquireByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetAcquireByAppNo(applicationNumber);
	}

	/**
	 * Returns the acquire application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchBygetAcquireByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the acquire application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the acquire application that was removed
	 */
	public static AcquireApplication removeBygetAcquireByAppNo(
			String applicationNumber)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().removeBygetAcquireByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of acquire applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching acquire applications
	 */
	public static int countBygetAcquireByAppNo(String applicationNumber) {
		return getPersistence().countBygetAcquireByAppNo(applicationNumber);
	}

	/**
	 * Returns the acquire application where caseId = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public static AcquireApplication findBygetAcquireByCaseId(String caseId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findBygetAcquireByCaseId(caseId);
	}

	/**
	 * Returns the acquire application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchBygetAcquireByCaseId(String caseId) {
		return getPersistence().fetchBygetAcquireByCaseId(caseId);
	}

	/**
	 * Returns the acquire application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public static AcquireApplication fetchBygetAcquireByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the acquire application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire application that was removed
	 */
	public static AcquireApplication removeBygetAcquireByCaseId(String caseId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().removeBygetAcquireByCaseId(caseId);
	}

	/**
	 * Returns the number of acquire applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire applications
	 */
	public static int countBygetAcquireByCaseId(String caseId) {
		return getPersistence().countBygetAcquireByCaseId(caseId);
	}

	/**
	 * Caches the acquire application in the entity cache if it is enabled.
	 *
	 * @param acquireApplication the acquire application
	 */
	public static void cacheResult(AcquireApplication acquireApplication) {
		getPersistence().cacheResult(acquireApplication);
	}

	/**
	 * Caches the acquire applications in the entity cache if it is enabled.
	 *
	 * @param acquireApplications the acquire applications
	 */
	public static void cacheResult(
		List<AcquireApplication> acquireApplications) {

		getPersistence().cacheResult(acquireApplications);
	}

	/**
	 * Creates a new acquire application with the primary key. Does not add the acquire application to the database.
	 *
	 * @param acquireApplicationId the primary key for the new acquire application
	 * @return the new acquire application
	 */
	public static AcquireApplication create(long acquireApplicationId) {
		return getPersistence().create(acquireApplicationId);
	}

	/**
	 * Removes the acquire application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application that was removed
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public static AcquireApplication remove(long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().remove(acquireApplicationId);
	}

	public static AcquireApplication updateImpl(
		AcquireApplication acquireApplication) {

		return getPersistence().updateImpl(acquireApplication);
	}

	/**
	 * Returns the acquire application with the primary key or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public static AcquireApplication findByPrimaryKey(long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireApplicationException {

		return getPersistence().findByPrimaryKey(acquireApplicationId);
	}

	/**
	 * Returns the acquire application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application, or <code>null</code> if a acquire application with the primary key could not be found
	 */
	public static AcquireApplication fetchByPrimaryKey(
		long acquireApplicationId) {

		return getPersistence().fetchByPrimaryKey(acquireApplicationId);
	}

	/**
	 * Returns all the acquire applications.
	 *
	 * @return the acquire applications
	 */
	public static List<AcquireApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of acquire applications
	 */
	public static List<AcquireApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire applications
	 */
	public static List<AcquireApplication> findAll(
		int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire applications
	 */
	public static List<AcquireApplication> findAll(
		int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire applications.
	 *
	 * @return the number of acquire applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireApplicationPersistence _persistence;

}