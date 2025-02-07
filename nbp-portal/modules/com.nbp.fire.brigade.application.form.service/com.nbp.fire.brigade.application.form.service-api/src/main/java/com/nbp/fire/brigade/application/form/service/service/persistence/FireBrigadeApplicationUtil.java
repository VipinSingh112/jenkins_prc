/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade application service. This utility wraps <code>com.nbp.fire.brigade.application.form.service.service.persistence.impl.FireBrigadeApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationPersistence
 * @generated
 */
public class FireBrigadeApplicationUtil {

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
		FireBrigadeApplication fireBrigadeApplication) {

		getPersistence().clearCache(fireBrigadeApplication);
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
	public static Map<Serializable, FireBrigadeApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadeApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadeApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadeApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadeApplication update(
		FireBrigadeApplication fireBrigadeApplication) {

		return getPersistence().update(fireBrigadeApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadeApplication update(
		FireBrigadeApplication fireBrigadeApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(fireBrigadeApplication, serviceContext);
	}

	/**
	 * Returns all the fire brigade applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the fire brigade applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findByUuid_First(
			String uuid,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchByUuid_First(
		String uuid,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findByUuid_Last(
			String uuid,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchByUuid_Last(
		String uuid,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication[] findByUuid_PrevAndNext(
			long fireBrigadeApplicationId, String uuid,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			fireBrigadeApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the fire brigade applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of fire brigade applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fire brigade applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the fire brigade application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the fire brigade application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the fire brigade application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the fire brigade application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the fire brigade application that was removed
	 */
	public static FireBrigadeApplication removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of fire brigade applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching fire brigade applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication[] findByUuid_C_PrevAndNext(
			long fireBrigadeApplicationId, String uuid, long companyId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			fireBrigadeApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the fire brigade applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching fire brigade applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId) {

		return getPersistence().findBygetFireBrigadeByS_U(status, userId);
	}

	/**
	 * Returns a range of all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetFireBrigadeByS_U(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().findBygetFireBrigadeByS_U(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFireBrigadeByS_U(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFireBrigadeByS_U_First(
			int status, long userId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByS_U_First(
		int status, long userId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchBygetFireBrigadeByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFireBrigadeByS_U_Last(
			int status, long userId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByS_U_Last(
		int status, long userId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchBygetFireBrigadeByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication[]
			findBygetFireBrigadeByS_U_PrevAndNext(
				long fireBrigadeApplicationId, int status, long userId,
				OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByS_U_PrevAndNext(
			fireBrigadeApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the fire brigade applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetFireBrigadeByS_U(int status, long userId) {
		getPersistence().removeBygetFireBrigadeByS_U(status, userId);
	}

	/**
	 * Returns the number of fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching fire brigade applications
	 */
	public static int countBygetFireBrigadeByS_U(int status, long userId) {
		return getPersistence().countBygetFireBrigadeByS_U(status, userId);
	}

	/**
	 * Returns the fire brigade application where caseId = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFireBrigadeStatusByCaseId(
			String caseId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeStatusByCaseId(caseId);
	}

	/**
	 * Returns the fire brigade application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeStatusByCaseId(
		String caseId) {

		return getPersistence().fetchBygetFireBrigadeStatusByCaseId(caseId);
	}

	/**
	 * Returns the fire brigade application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeStatusByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigadeStatusByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the fire brigade application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade application that was removed
	 */
	public static FireBrigadeApplication removeBygetFireBrigadeStatusByCaseId(
			String caseId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().removeBygetFireBrigadeStatusByCaseId(caseId);
	}

	/**
	 * Returns the number of fire brigade applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade applications
	 */
	public static int countBygetFireBrigadeStatusByCaseId(String caseId) {
		return getPersistence().countBygetFireBrigadeStatusByCaseId(caseId);
	}

	/**
	 * Returns all the fire brigade applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status) {

		return getPersistence().findBygetFireBrigadeByStatus(status);
	}

	/**
	 * Returns a range of all the fire brigade applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetFireBrigadeByStatus(
			status, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().findBygetFireBrigadeByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFireBrigadeByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFireBrigadeByStatus_First(
			int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByStatus_First(
		int status,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchBygetFireBrigadeByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFireBrigadeByStatus_Last(
			int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByStatus_Last(
		int status,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchBygetFireBrigadeByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication[]
			findBygetFireBrigadeByStatus_PrevAndNext(
				long fireBrigadeApplicationId, int status,
				OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByStatus_PrevAndNext(
			fireBrigadeApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the fire brigade applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetFireBrigadeByStatus(int status) {
		getPersistence().removeBygetFireBrigadeByStatus(status);
	}

	/**
	 * Returns the number of fire brigade applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching fire brigade applications
	 */
	public static int countBygetFireBrigadeByStatus(int status) {
		return getPersistence().countBygetFireBrigadeByStatus(status);
	}

	/**
	 * Returns all the fire brigade applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByEntityId(
		String entityId) {

		return getPersistence().findBygetFireBrigadeByEntityId(entityId);
	}

	/**
	 * Returns a range of all the fire brigade applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByEntityId(
		String entityId, int start, int end) {

		return getPersistence().findBygetFireBrigadeByEntityId(
			entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByEntityId(
		String entityId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().findBygetFireBrigadeByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication> findBygetFireBrigadeByEntityId(
		String entityId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFireBrigadeByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFireBrigadeByEntityId_First(
			String entityId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByEntityId_First(
		String entityId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchBygetFireBrigadeByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFireBrigadeByEntityId_Last(
			String entityId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByEntityId_Last(
		String entityId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchBygetFireBrigadeByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication[]
			findBygetFireBrigadeByEntityId_PrevAndNext(
				long fireBrigadeApplicationId, String entityId,
				OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByEntityId_PrevAndNext(
			fireBrigadeApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the fire brigade applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetFireBrigadeByEntityId(String entityId) {
		getPersistence().removeBygetFireBrigadeByEntityId(entityId);
	}

	/**
	 * Returns the number of fire brigade applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching fire brigade applications
	 */
	public static int countBygetFireBrigadeByEntityId(String entityId) {
		return getPersistence().countBygetFireBrigadeByEntityId(entityId);
	}

	/**
	 * Returns all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching fire brigade applications
	 */
	public static List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId_Status(String entityId, int status) {

		return getPersistence().findBygetFireBrigadeByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId_Status(
			String entityId, int status, int start, int end) {

		return getPersistence().findBygetFireBrigadeByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId_Status(
			String entityId, int status, int start, int end,
			OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().findBygetFireBrigadeByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public static List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId_Status(
			String entityId, int status, int start, int end,
			OrderByComparator<FireBrigadeApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetFireBrigadeByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication
			findBygetFireBrigadeByEntityId_Status_First(
				String entityId, int status,
				OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication
		fetchBygetFireBrigadeByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchBygetFireBrigadeByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication
			findBygetFireBrigadeByEntityId_Status_Last(
				String entityId, int status,
				OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication
		fetchBygetFireBrigadeByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().fetchBygetFireBrigadeByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication[]
			findBygetFireBrigadeByEntityId_Status_PrevAndNext(
				long fireBrigadeApplicationId, String entityId, int status,
				OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().
			findBygetFireBrigadeByEntityId_Status_PrevAndNext(
				fireBrigadeApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the fire brigade applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetFireBrigadeByEntityId_Status(
		String entityId, int status) {

		getPersistence().removeBygetFireBrigadeByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the number of fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching fire brigade applications
	 */
	public static int countBygetFireBrigadeByEntityId_Status(
		String entityId, int status) {

		return getPersistence().countBygetFireBrigadeByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the fire brigade application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFireBrigadeByEI_CI(
			String entityId, String caseId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the fire brigade application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByEI_CI(
		String entityId, String caseId) {

		return getPersistence().fetchBygetFireBrigadeByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the fire brigade application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigadeByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the fire brigade application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the fire brigade application that was removed
	 */
	public static FireBrigadeApplication removeBygetFireBrigadeByEI_CI(
			String entityId, String caseId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().removeBygetFireBrigadeByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of fire brigade applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching fire brigade applications
	 */
	public static int countBygetFireBrigadeByEI_CI(
		String entityId, String caseId) {

		return getPersistence().countBygetFireBrigadeByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the fire brigade application where applicationNumber = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFireBrigadeByAppNo(
			String applicationNumber)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFireBrigadeByAppNo(applicationNumber);
	}

	/**
	 * Returns the fire brigade application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetFireBrigadeByAppNo(applicationNumber);
	}

	/**
	 * Returns the fire brigade application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFireBrigadeByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigadeByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the fire brigade application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the fire brigade application that was removed
	 */
	public static FireBrigadeApplication removeBygetFireBrigadeByAppNo(
			String applicationNumber)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().removeBygetFireBrigadeByAppNo(
			applicationNumber);
	}

	/**
	 * Returns the number of fire brigade applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching fire brigade applications
	 */
	public static int countBygetFireBrigadeByAppNo(String applicationNumber) {
		return getPersistence().countBygetFireBrigadeByAppNo(applicationNumber);
	}

	/**
	 * Returns the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication findBygetFB_AppType_AppNo(
			String typeOfTransaction, String applicationNumber)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findBygetFB_AppType_AppNo(
			typeOfTransaction, applicationNumber);
	}

	/**
	 * Returns the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFB_AppType_AppNo(
		String typeOfTransaction, String applicationNumber) {

		return getPersistence().fetchBygetFB_AppType_AppNo(
			typeOfTransaction, applicationNumber);
	}

	/**
	 * Returns the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication fetchBygetFB_AppType_AppNo(
		String typeOfTransaction, String applicationNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetFB_AppType_AppNo(
			typeOfTransaction, applicationNumber, useFinderCache);
	}

	/**
	 * Removes the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the fire brigade application that was removed
	 */
	public static FireBrigadeApplication removeBygetFB_AppType_AppNo(
			String typeOfTransaction, String applicationNumber)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().removeBygetFB_AppType_AppNo(
			typeOfTransaction, applicationNumber);
	}

	/**
	 * Returns the number of fire brigade applications where typeOfTransaction = &#63; and applicationNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the number of matching fire brigade applications
	 */
	public static int countBygetFB_AppType_AppNo(
		String typeOfTransaction, String applicationNumber) {

		return getPersistence().countBygetFB_AppType_AppNo(
			typeOfTransaction, applicationNumber);
	}

	/**
	 * Caches the fire brigade application in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplication the fire brigade application
	 */
	public static void cacheResult(
		FireBrigadeApplication fireBrigadeApplication) {

		getPersistence().cacheResult(fireBrigadeApplication);
	}

	/**
	 * Caches the fire brigade applications in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplications the fire brigade applications
	 */
	public static void cacheResult(
		List<FireBrigadeApplication> fireBrigadeApplications) {

		getPersistence().cacheResult(fireBrigadeApplications);
	}

	/**
	 * Creates a new fire brigade application with the primary key. Does not add the fire brigade application to the database.
	 *
	 * @param fireBrigadeApplicationId the primary key for the new fire brigade application
	 * @return the new fire brigade application
	 */
	public static FireBrigadeApplication create(long fireBrigadeApplicationId) {
		return getPersistence().create(fireBrigadeApplicationId);
	}

	/**
	 * Removes the fire brigade application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application that was removed
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication remove(long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().remove(fireBrigadeApplicationId);
	}

	public static FireBrigadeApplication updateImpl(
		FireBrigadeApplication fireBrigadeApplication) {

		return getPersistence().updateImpl(fireBrigadeApplication);
	}

	/**
	 * Returns the fire brigade application with the primary key or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication findByPrimaryKey(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getPersistence().findByPrimaryKey(fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application, or <code>null</code> if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication fetchByPrimaryKey(
		long fireBrigadeApplicationId) {

		return getPersistence().fetchByPrimaryKey(fireBrigadeApplicationId);
	}

	/**
	 * Returns all the fire brigade applications.
	 *
	 * @return the fire brigade applications
	 */
	public static List<FireBrigadeApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of fire brigade applications
	 */
	public static List<FireBrigadeApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade applications
	 */
	public static List<FireBrigadeApplication> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade applications
	 */
	public static List<FireBrigadeApplication> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade applications.
	 *
	 * @return the number of fire brigade applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadeApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadeApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadeApplicationPersistence _persistence;

}