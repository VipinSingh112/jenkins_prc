/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.JanaacApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the janaac application service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.JanaacApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationPersistence
 * @generated
 */
public class JanaacApplicationUtil {

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
	public static void clearCache(JanaacApplication janaacApplication) {
		getPersistence().clearCache(janaacApplication);
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
	public static Map<Serializable, JanaacApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JanaacApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JanaacApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JanaacApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JanaacApplication update(
		JanaacApplication janaacApplication) {

		return getPersistence().update(janaacApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JanaacApplication update(
		JanaacApplication janaacApplication, ServiceContext serviceContext) {

		return getPersistence().update(janaacApplication, serviceContext);
	}

	/**
	 * Returns all the janaac applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching janaac applications
	 */
	public static List<JanaacApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the janaac applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	public static List<JanaacApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	public static List<JanaacApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	public static List<JanaacApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findByUuid_First(
			String uuid, OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchByUuid_First(
		String uuid, OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findByUuid_Last(
			String uuid, OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchByUuid_Last(
		String uuid, OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public static JanaacApplication[] findByUuid_PrevAndNext(
			long janaacApplicationId, String uuid,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			janaacApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the janaac applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of janaac applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching janaac applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the janaac application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the janaac application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the janaac application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the janaac application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the janaac application that was removed
	 */
	public static JanaacApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of janaac applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching janaac applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching janaac applications
	 */
	public static List<JanaacApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	public static List<JanaacApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	public static List<JanaacApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	public static List<JanaacApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public static JanaacApplication[] findByUuid_C_PrevAndNext(
			long janaacApplicationId, String uuid, long companyId,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			janaacApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the janaac applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching janaac applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching janaac applications
	 */
	public static List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status) {

		return getPersistence().findBygetJANAAC_ByS_U(userId, status);
	}

	/**
	 * Returns a range of all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	public static List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetJANAAC_ByS_U(
			userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	public static List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().findBygetJANAAC_ByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	public static List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJANAAC_ByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findBygetJANAAC_ByS_U_First(
			long userId, int status,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findBygetJANAAC_ByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchBygetJANAAC_ByS_U_First(
		long userId, int status,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().fetchBygetJANAAC_ByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findBygetJANAAC_ByS_U_Last(
			long userId, int status,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findBygetJANAAC_ByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchBygetJANAAC_ByS_U_Last(
		long userId, int status,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().fetchBygetJANAAC_ByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public static JanaacApplication[] findBygetJANAAC_ByS_U_PrevAndNext(
			long janaacApplicationId, long userId, int status,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findBygetJANAAC_ByS_U_PrevAndNext(
			janaacApplicationId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the janaac applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetJANAAC_ByS_U(long userId, int status) {
		getPersistence().removeBygetJANAAC_ByS_U(userId, status);
	}

	/**
	 * Returns the number of janaac applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching janaac applications
	 */
	public static int countBygetJANAAC_ByS_U(long userId, int status) {
		return getPersistence().countBygetJANAAC_ByS_U(userId, status);
	}

	/**
	 * Returns all the janaac applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching janaac applications
	 */
	public static List<JanaacApplication> findBygetJANAAC_By_Status(
		int status) {

		return getPersistence().findBygetJANAAC_By_Status(status);
	}

	/**
	 * Returns a range of all the janaac applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	public static List<JanaacApplication> findBygetJANAAC_By_Status(
		int status, int start, int end) {

		return getPersistence().findBygetJANAAC_By_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the janaac applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	public static List<JanaacApplication> findBygetJANAAC_By_Status(
		int status, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().findBygetJANAAC_By_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	public static List<JanaacApplication> findBygetJANAAC_By_Status(
		int status, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJANAAC_By_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findBygetJANAAC_By_Status_First(
			int status, OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findBygetJANAAC_By_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchBygetJANAAC_By_Status_First(
		int status, OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().fetchBygetJANAAC_By_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findBygetJANAAC_By_Status_Last(
			int status, OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findBygetJANAAC_By_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchBygetJANAAC_By_Status_Last(
		int status, OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().fetchBygetJANAAC_By_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where status = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public static JanaacApplication[] findBygetJANAAC_By_Status_PrevAndNext(
			long janaacApplicationId, int status,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findBygetJANAAC_By_Status_PrevAndNext(
			janaacApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the janaac applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetJANAAC_By_Status(int status) {
		getPersistence().removeBygetJANAAC_By_Status(status);
	}

	/**
	 * Returns the number of janaac applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching janaac applications
	 */
	public static int countBygetJANAAC_By_Status(int status) {
		return getPersistence().countBygetJANAAC_By_Status(status);
	}

	/**
	 * Returns the janaac application where applicationNumber = &#63; or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findBygetJANAAC_By_AppNum(
			String applicationNumber)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findBygetJANAAC_By_AppNum(applicationNumber);
	}

	/**
	 * Returns the janaac application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchBygetJANAAC_By_AppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetJANAAC_By_AppNum(applicationNumber);
	}

	/**
	 * Returns the janaac application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchBygetJANAAC_By_AppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_By_AppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the janaac application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the janaac application that was removed
	 */
	public static JanaacApplication removeBygetJANAAC_By_AppNum(
			String applicationNumber)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().removeBygetJANAAC_By_AppNum(applicationNumber);
	}

	/**
	 * Returns the number of janaac applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching janaac applications
	 */
	public static int countBygetJANAAC_By_AppNum(String applicationNumber) {
		return getPersistence().countBygetJANAAC_By_AppNum(applicationNumber);
	}

	/**
	 * Returns the janaac application where caseId = &#63; or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public static JanaacApplication findBygetJANAAC_ByCaseId(String caseId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findBygetJANAAC_ByCaseId(caseId);
	}

	/**
	 * Returns the janaac application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchBygetJANAAC_ByCaseId(String caseId) {
		return getPersistence().fetchBygetJANAAC_ByCaseId(caseId);
	}

	/**
	 * Returns the janaac application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public static JanaacApplication fetchBygetJANAAC_ByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the janaac application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac application that was removed
	 */
	public static JanaacApplication removeBygetJANAAC_ByCaseId(String caseId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().removeBygetJANAAC_ByCaseId(caseId);
	}

	/**
	 * Returns the number of janaac applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac applications
	 */
	public static int countBygetJANAAC_ByCaseId(String caseId) {
		return getPersistence().countBygetJANAAC_ByCaseId(caseId);
	}

	/**
	 * Caches the janaac application in the entity cache if it is enabled.
	 *
	 * @param janaacApplication the janaac application
	 */
	public static void cacheResult(JanaacApplication janaacApplication) {
		getPersistence().cacheResult(janaacApplication);
	}

	/**
	 * Caches the janaac applications in the entity cache if it is enabled.
	 *
	 * @param janaacApplications the janaac applications
	 */
	public static void cacheResult(List<JanaacApplication> janaacApplications) {
		getPersistence().cacheResult(janaacApplications);
	}

	/**
	 * Creates a new janaac application with the primary key. Does not add the janaac application to the database.
	 *
	 * @param janaacApplicationId the primary key for the new janaac application
	 * @return the new janaac application
	 */
	public static JanaacApplication create(long janaacApplicationId) {
		return getPersistence().create(janaacApplicationId);
	}

	/**
	 * Removes the janaac application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application that was removed
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public static JanaacApplication remove(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().remove(janaacApplicationId);
	}

	public static JanaacApplication updateImpl(
		JanaacApplication janaacApplication) {

		return getPersistence().updateImpl(janaacApplication);
	}

	/**
	 * Returns the janaac application with the primary key or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public static JanaacApplication findByPrimaryKey(long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchJanaacApplicationException {

		return getPersistence().findByPrimaryKey(janaacApplicationId);
	}

	/**
	 * Returns the janaac application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application, or <code>null</code> if a janaac application with the primary key could not be found
	 */
	public static JanaacApplication fetchByPrimaryKey(
		long janaacApplicationId) {

		return getPersistence().fetchByPrimaryKey(janaacApplicationId);
	}

	/**
	 * Returns all the janaac applications.
	 *
	 * @return the janaac applications
	 */
	public static List<JanaacApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of janaac applications
	 */
	public static List<JanaacApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac applications
	 */
	public static List<JanaacApplication> findAll(
		int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac applications
	 */
	public static List<JanaacApplication> findAll(
		int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the janaac applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of janaac applications.
	 *
	 * @return the number of janaac applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JanaacApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JanaacApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JanaacApplicationPersistence _persistence;

}