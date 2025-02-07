/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JTBApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb application service. This utility wraps <code>com.nbp.jtb.application.form.service.service.persistence.impl.JTBApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplicationPersistence
 * @generated
 */
public class JTBApplicationUtil {

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
	public static void clearCache(JTBApplication jtbApplication) {
		getPersistence().clearCache(jtbApplication);
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
	public static Map<Serializable, JTBApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JTBApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JTBApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JTBApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JTBApplication update(JTBApplication jtbApplication) {
		return getPersistence().update(jtbApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JTBApplication update(
		JTBApplication jtbApplication, ServiceContext serviceContext) {

		return getPersistence().update(jtbApplication, serviceContext);
	}

	/**
	 * Returns all the jtb applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jtb applications
	 */
	public static List<JTBApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jtb applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public static List<JTBApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findByUuid_First(
			String uuid, OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchByUuid_First(
		String uuid, OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findByUuid_Last(
			String uuid, OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchByUuid_Last(
		String uuid, OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public static JTBApplication[] findByUuid_PrevAndNext(
			long jtbApplicationId, String uuid,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			jtbApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jtb applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jtb applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jtb applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jtb application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jtb application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jtb application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jtb application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jtb application that was removed
	 */
	public static JTBApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jtb applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jtb applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jtb applications
	 */
	public static List<JTBApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public static List<JTBApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public static JTBApplication[] findByUuid_C_PrevAndNext(
			long jtbApplicationId, String uuid, long companyId,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jtbApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jtb applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jtb applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status) {

		return getPersistence().findBygetJTB_ByS_U(userId, status);
	}

	/**
	 * Returns a range of all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetJTB_ByS_U(userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().findBygetJTB_ByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJTB_ByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findBygetJTB_ByS_U_First(
			long userId, int status,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_ByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_ByS_U_First(
		long userId, int status,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchBygetJTB_ByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findBygetJTB_ByS_U_Last(
			long userId, int status,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_ByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_ByS_U_Last(
		long userId, int status,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchBygetJTB_ByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public static JTBApplication[] findBygetJTB_ByS_U_PrevAndNext(
			long jtbApplicationId, long userId, int status,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_ByS_U_PrevAndNext(
			jtbApplicationId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the jtb applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetJTB_ByS_U(long userId, int status) {
		getPersistence().removeBygetJTB_ByS_U(userId, status);
	}

	/**
	 * Returns the number of jtb applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching jtb applications
	 */
	public static int countBygetJTB_ByS_U(long userId, int status) {
		return getPersistence().countBygetJTB_ByS_U(userId, status);
	}

	/**
	 * Returns all the jtb applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_By_Status(int status) {
		return getPersistence().findBygetJTB_By_Status(status);
	}

	/**
	 * Returns a range of all the jtb applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_By_Status(
		int status, int start, int end) {

		return getPersistence().findBygetJTB_By_Status(status, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_By_Status(
		int status, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().findBygetJTB_By_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_By_Status(
		int status, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJTB_By_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findBygetJTB_By_Status_First(
			int status, OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_By_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_By_Status_First(
		int status, OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchBygetJTB_By_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findBygetJTB_By_Status_Last(
			int status, OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_By_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_By_Status_Last(
		int status, OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchBygetJTB_By_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where status = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public static JTBApplication[] findBygetJTB_By_Status_PrevAndNext(
			long jtbApplicationId, int status,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_By_Status_PrevAndNext(
			jtbApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the jtb applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetJTB_By_Status(int status) {
		getPersistence().removeBygetJTB_By_Status(status);
	}

	/**
	 * Returns the number of jtb applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching jtb applications
	 */
	public static int countBygetJTB_By_Status(int status) {
		return getPersistence().countBygetJTB_By_Status(status);
	}

	/**
	 * Returns the jtb application where applicationNumber = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findBygetJTB_By_AppNum(
			String applicationNumber)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_By_AppNum(applicationNumber);
	}

	/**
	 * Returns the jtb application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_By_AppNum(
		String applicationNumber) {

		return getPersistence().fetchBygetJTB_By_AppNum(applicationNumber);
	}

	/**
	 * Returns the jtb application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_By_AppNum(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_By_AppNum(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the jtb application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the jtb application that was removed
	 */
	public static JTBApplication removeBygetJTB_By_AppNum(
			String applicationNumber)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().removeBygetJTB_By_AppNum(applicationNumber);
	}

	/**
	 * Returns the number of jtb applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching jtb applications
	 */
	public static int countBygetJTB_By_AppNum(String applicationNumber) {
		return getPersistence().countBygetJTB_By_AppNum(applicationNumber);
	}

	/**
	 * Returns the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findBygetJTB_By_RT_AppNo(
			String jtbTransactionTypeVal, String expiredLicenseAppNumber)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_By_RT_AppNo(
			jtbTransactionTypeVal, expiredLicenseAppNumber);
	}

	/**
	 * Returns the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_By_RT_AppNo(
		String jtbTransactionTypeVal, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetJTB_By_RT_AppNo(
			jtbTransactionTypeVal, expiredLicenseAppNumber);
	}

	/**
	 * Returns the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_By_RT_AppNo(
		String jtbTransactionTypeVal, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_By_RT_AppNo(
			jtbTransactionTypeVal, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the jtb application that was removed
	 */
	public static JTBApplication removeBygetJTB_By_RT_AppNo(
			String jtbTransactionTypeVal, String expiredLicenseAppNumber)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().removeBygetJTB_By_RT_AppNo(
			jtbTransactionTypeVal, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of jtb applications where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching jtb applications
	 */
	public static int countBygetJTB_By_RT_AppNo(
		String jtbTransactionTypeVal, String expiredLicenseAppNumber) {

		return getPersistence().countBygetJTB_By_RT_AppNo(
			jtbTransactionTypeVal, expiredLicenseAppNumber);
	}

	/**
	 * Returns the jtb application where caseId = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findBygetJTB_ByCaseId(String caseId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_ByCaseId(caseId);
	}

	/**
	 * Returns the jtb application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_ByCaseId(String caseId) {
		return getPersistence().fetchBygetJTB_ByCaseId(caseId);
	}

	/**
	 * Returns the jtb application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_ByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJTB_ByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the jtb application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb application that was removed
	 */
	public static JTBApplication removeBygetJTB_ByCaseId(String caseId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().removeBygetJTB_ByCaseId(caseId);
	}

	/**
	 * Returns the number of jtb applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb applications
	 */
	public static int countBygetJTB_ByCaseId(String caseId) {
		return getPersistence().countBygetJTB_ByCaseId(caseId);
	}

	/**
	 * Returns all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @return the matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication) {

		return getPersistence().findBygetJTB_By_AppType_Status(
			status, typeOfApplication);
	}

	/**
	 * Returns a range of all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication, int start, int end) {

		return getPersistence().findBygetJTB_By_AppType_Status(
			status, typeOfApplication, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().findBygetJTB_By_AppType_Status(
			status, typeOfApplication, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public static List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJTB_By_AppType_Status(
			status, typeOfApplication, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findBygetJTB_By_AppType_Status_First(
			int status, String typeOfApplication,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_By_AppType_Status_First(
			status, typeOfApplication, orderByComparator);
	}

	/**
	 * Returns the first jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_By_AppType_Status_First(
		int status, String typeOfApplication,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchBygetJTB_By_AppType_Status_First(
			status, typeOfApplication, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public static JTBApplication findBygetJTB_By_AppType_Status_Last(
			int status, String typeOfApplication,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_By_AppType_Status_Last(
			status, typeOfApplication, orderByComparator);
	}

	/**
	 * Returns the last jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchBygetJTB_By_AppType_Status_Last(
		int status, String typeOfApplication,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().fetchBygetJTB_By_AppType_Status_Last(
			status, typeOfApplication, orderByComparator);
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public static JTBApplication[] findBygetJTB_By_AppType_Status_PrevAndNext(
			long jtbApplicationId, int status, String typeOfApplication,
			OrderByComparator<JTBApplication> orderByComparator)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findBygetJTB_By_AppType_Status_PrevAndNext(
			jtbApplicationId, status, typeOfApplication, orderByComparator);
	}

	/**
	 * Removes all the jtb applications where status = &#63; and typeOfApplication = &#63; from the database.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 */
	public static void removeBygetJTB_By_AppType_Status(
		int status, String typeOfApplication) {

		getPersistence().removeBygetJTB_By_AppType_Status(
			status, typeOfApplication);
	}

	/**
	 * Returns the number of jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @return the number of matching jtb applications
	 */
	public static int countBygetJTB_By_AppType_Status(
		int status, String typeOfApplication) {

		return getPersistence().countBygetJTB_By_AppType_Status(
			status, typeOfApplication);
	}

	/**
	 * Caches the jtb application in the entity cache if it is enabled.
	 *
	 * @param jtbApplication the jtb application
	 */
	public static void cacheResult(JTBApplication jtbApplication) {
		getPersistence().cacheResult(jtbApplication);
	}

	/**
	 * Caches the jtb applications in the entity cache if it is enabled.
	 *
	 * @param jtbApplications the jtb applications
	 */
	public static void cacheResult(List<JTBApplication> jtbApplications) {
		getPersistence().cacheResult(jtbApplications);
	}

	/**
	 * Creates a new jtb application with the primary key. Does not add the jtb application to the database.
	 *
	 * @param jtbApplicationId the primary key for the new jtb application
	 * @return the new jtb application
	 */
	public static JTBApplication create(long jtbApplicationId) {
		return getPersistence().create(jtbApplicationId);
	}

	/**
	 * Removes the jtb application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application that was removed
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public static JTBApplication remove(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().remove(jtbApplicationId);
	}

	public static JTBApplication updateImpl(JTBApplication jtbApplication) {
		return getPersistence().updateImpl(jtbApplication);
	}

	/**
	 * Returns the jtb application with the primary key or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public static JTBApplication findByPrimaryKey(long jtbApplicationId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getPersistence().findByPrimaryKey(jtbApplicationId);
	}

	/**
	 * Returns the jtb application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application, or <code>null</code> if a jtb application with the primary key could not be found
	 */
	public static JTBApplication fetchByPrimaryKey(long jtbApplicationId) {
		return getPersistence().fetchByPrimaryKey(jtbApplicationId);
	}

	/**
	 * Returns all the jtb applications.
	 *
	 * @return the jtb applications
	 */
	public static List<JTBApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of jtb applications
	 */
	public static List<JTBApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb applications
	 */
	public static List<JTBApplication> findAll(
		int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb applications
	 */
	public static List<JTBApplication> findAll(
		int start, int end, OrderByComparator<JTBApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb applications.
	 *
	 * @return the number of jtb applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JTBApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(JTBApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile JTBApplicationPersistence _persistence;

}