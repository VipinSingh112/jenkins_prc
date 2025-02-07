/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.application.form.service.model.NcbjApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj application service. This utility wraps <code>com.nbp.ncbj.application.form.service.service.persistence.impl.NcbjApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationPersistence
 * @generated
 */
public class NcbjApplicationUtil {

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
	public static void clearCache(NcbjApplication ncbjApplication) {
		getPersistence().clearCache(ncbjApplication);
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
	public static Map<Serializable, NcbjApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjApplication update(NcbjApplication ncbjApplication) {
		return getPersistence().update(ncbjApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjApplication update(
		NcbjApplication ncbjApplication, ServiceContext serviceContext) {

		return getPersistence().update(ncbjApplication, serviceContext);
	}

	/**
	 * Returns all the ncbj applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncbj applications
	 */
	public static List<NcbjApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the ncbj applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public static List<NcbjApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findByUuid_First(
			String uuid, OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchByUuid_First(
		String uuid, OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findByUuid_Last(
			String uuid, OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchByUuid_Last(
		String uuid, OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public static NcbjApplication[] findByUuid_PrevAndNext(
			long ncbjApplicationId, String uuid,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			ncbjApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the ncbj applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of ncbj applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncbj applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the ncbj application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncbj application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncbj application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the ncbj application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncbj application that was removed
	 */
	public static NcbjApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of ncbj applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncbj applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncbj applications
	 */
	public static List<NcbjApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public static List<NcbjApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public static NcbjApplication[] findByUuid_C_PrevAndNext(
			long ncbjApplicationId, String uuid, long companyId,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			ncbjApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the ncbj applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncbj applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status) {

		return getPersistence().findBygetNCBJByS_U(userId, status);
	}

	/**
	 * Returns a range of all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status, int start, int end) {

		return getPersistence().findBygetNCBJByS_U(userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().findBygetNCBJByS_U(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCBJByS_U(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findBygetNCBJByS_U_First(
			long userId, int status,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNCBJByS_U_First(
		long userId, int status,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchBygetNCBJByS_U_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findBygetNCBJByS_U_Last(
			long userId, int status,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNCBJByS_U_Last(
		long userId, int status,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchBygetNCBJByS_U_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public static NcbjApplication[] findBygetNCBJByS_U_PrevAndNext(
			long ncbjApplicationId, long userId, int status,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByS_U_PrevAndNext(
			ncbjApplicationId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the ncbj applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeBygetNCBJByS_U(long userId, int status) {
		getPersistence().removeBygetNCBJByS_U(userId, status);
	}

	/**
	 * Returns the number of ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching ncbj applications
	 */
	public static int countBygetNCBJByS_U(long userId, int status) {
		return getPersistence().countBygetNCBJByS_U(userId, status);
	}

	/**
	 * Returns all the ncbj applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByStatus(int status) {
		return getPersistence().findBygetNCBJByStatus(status);
	}

	/**
	 * Returns a range of all the ncbj applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetNCBJByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByStatus(
		int status, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().findBygetNCBJByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByStatus(
		int status, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCBJByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findBygetNCBJByStatus_First(
			int status, OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNCBJByStatus_First(
		int status, OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchBygetNCBJByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findBygetNCBJByStatus_Last(
			int status, OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNCBJByStatus_Last(
		int status, OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchBygetNCBJByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where status = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public static NcbjApplication[] findBygetNCBJByStatus_PrevAndNext(
			long ncbjApplicationId, int status,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByStatus_PrevAndNext(
			ncbjApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the ncbj applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetNCBJByStatus(int status) {
		getPersistence().removeBygetNCBJByStatus(status);
	}

	/**
	 * Returns the number of ncbj applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncbj applications
	 */
	public static int countBygetNCBJByStatus(int status) {
		return getPersistence().countBygetNCBJByStatus(status);
	}

	/**
	 * Returns the ncbj application where caseId = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findBygetNCBJByCaseId(String caseId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByCaseId(caseId);
	}

	/**
	 * Returns the ncbj application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNCBJByCaseId(String caseId) {
		return getPersistence().fetchBygetNCBJByCaseId(caseId);
	}

	/**
	 * Returns the ncbj application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNCBJByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNCBJByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the ncbj application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj application that was removed
	 */
	public static NcbjApplication removeBygetNCBJByCaseId(String caseId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().removeBygetNCBJByCaseId(caseId);
	}

	/**
	 * Returns the number of ncbj applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj applications
	 */
	public static int countBygetNCBJByCaseId(String caseId) {
		return getPersistence().countBygetNCBJByCaseId(caseId);
	}

	/**
	 * Returns all the ncbj applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber) {

		return getPersistence().findBygetNCBJByAppNum(applicationNumber);
	}

	/**
	 * Returns a range of all the ncbj applications where applicationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationNumber the application number
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber, int start, int end) {

		return getPersistence().findBygetNCBJByAppNum(
			applicationNumber, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where applicationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationNumber the application number
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().findBygetNCBJByAppNum(
			applicationNumber, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where applicationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationNumber the application number
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public static List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNCBJByAppNum(
			applicationNumber, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findBygetNCBJByAppNum_First(
			String applicationNumber,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByAppNum_First(
			applicationNumber, orderByComparator);
	}

	/**
	 * Returns the first ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNCBJByAppNum_First(
		String applicationNumber,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchBygetNCBJByAppNum_First(
			applicationNumber, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findBygetNCBJByAppNum_Last(
			String applicationNumber,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByAppNum_Last(
			applicationNumber, orderByComparator);
	}

	/**
	 * Returns the last ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNCBJByAppNum_Last(
		String applicationNumber,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().fetchBygetNCBJByAppNum_Last(
			applicationNumber, orderByComparator);
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public static NcbjApplication[] findBygetNCBJByAppNum_PrevAndNext(
			long ncbjApplicationId, String applicationNumber,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNCBJByAppNum_PrevAndNext(
			ncbjApplicationId, applicationNumber, orderByComparator);
	}

	/**
	 * Removes all the ncbj applications where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 */
	public static void removeBygetNCBJByAppNum(String applicationNumber) {
		getPersistence().removeBygetNCBJByAppNum(applicationNumber);
	}

	/**
	 * Returns the number of ncbj applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ncbj applications
	 */
	public static int countBygetNCBJByAppNum(String applicationNumber) {
		return getPersistence().countBygetNCBJByAppNum(applicationNumber);
	}

	/**
	 * Returns the ncbj application where applicationNumber = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findBygetNcbj_By_App_Num(
			String applicationNumber)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNcbj_By_App_Num(applicationNumber);
	}

	/**
	 * Returns the ncbj application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNcbj_By_App_Num(
		String applicationNumber) {

		return getPersistence().fetchBygetNcbj_By_App_Num(applicationNumber);
	}

	/**
	 * Returns the ncbj application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNcbj_By_App_Num(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbj_By_App_Num(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the ncbj application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the ncbj application that was removed
	 */
	public static NcbjApplication removeBygetNcbj_By_App_Num(
			String applicationNumber)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().removeBygetNcbj_By_App_Num(applicationNumber);
	}

	/**
	 * Returns the number of ncbj applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ncbj applications
	 */
	public static int countBygetNcbj_By_App_Num(String applicationNumber) {
		return getPersistence().countBygetNcbj_By_App_Num(applicationNumber);
	}

	/**
	 * Returns the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public static NcbjApplication findBygetNcbjByRT_AppNo(
			String typeOfServices, String expiredLicenseAppNumber)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findBygetNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber);
	}

	/**
	 * Returns the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNcbjByRT_AppNo(
		String typeOfServices, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber);
	}

	/**
	 * Returns the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public static NcbjApplication fetchBygetNcbjByRT_AppNo(
		String typeOfServices, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the ncbj application that was removed
	 */
	public static NcbjApplication removeBygetNcbjByRT_AppNo(
			String typeOfServices, String expiredLicenseAppNumber)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().removeBygetNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of ncbj applications where typeOfServices = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching ncbj applications
	 */
	public static int countBygetNcbjByRT_AppNo(
		String typeOfServices, String expiredLicenseAppNumber) {

		return getPersistence().countBygetNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber);
	}

	/**
	 * Caches the ncbj application in the entity cache if it is enabled.
	 *
	 * @param ncbjApplication the ncbj application
	 */
	public static void cacheResult(NcbjApplication ncbjApplication) {
		getPersistence().cacheResult(ncbjApplication);
	}

	/**
	 * Caches the ncbj applications in the entity cache if it is enabled.
	 *
	 * @param ncbjApplications the ncbj applications
	 */
	public static void cacheResult(List<NcbjApplication> ncbjApplications) {
		getPersistence().cacheResult(ncbjApplications);
	}

	/**
	 * Creates a new ncbj application with the primary key. Does not add the ncbj application to the database.
	 *
	 * @param ncbjApplicationId the primary key for the new ncbj application
	 * @return the new ncbj application
	 */
	public static NcbjApplication create(long ncbjApplicationId) {
		return getPersistence().create(ncbjApplicationId);
	}

	/**
	 * Removes the ncbj application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application that was removed
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public static NcbjApplication remove(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().remove(ncbjApplicationId);
	}

	public static NcbjApplication updateImpl(NcbjApplication ncbjApplication) {
		return getPersistence().updateImpl(ncbjApplication);
	}

	/**
	 * Returns the ncbj application with the primary key or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public static NcbjApplication findByPrimaryKey(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicationException {

		return getPersistence().findByPrimaryKey(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application, or <code>null</code> if a ncbj application with the primary key could not be found
	 */
	public static NcbjApplication fetchByPrimaryKey(long ncbjApplicationId) {
		return getPersistence().fetchByPrimaryKey(ncbjApplicationId);
	}

	/**
	 * Returns all the ncbj applications.
	 *
	 * @return the ncbj applications
	 */
	public static List<NcbjApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of ncbj applications
	 */
	public static List<NcbjApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj applications
	 */
	public static List<NcbjApplication> findAll(
		int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj applications
	 */
	public static List<NcbjApplication> findAll(
		int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj applications.
	 *
	 * @return the number of ncbj applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(NcbjApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile NcbjApplicationPersistence _persistence;

}