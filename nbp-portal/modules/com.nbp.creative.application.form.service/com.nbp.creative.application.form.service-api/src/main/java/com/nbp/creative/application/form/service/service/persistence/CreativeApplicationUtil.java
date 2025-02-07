/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative application service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationPersistence
 * @generated
 */
public class CreativeApplicationUtil {

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
	public static void clearCache(CreativeApplication creativeApplication) {
		getPersistence().clearCache(creativeApplication);
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
	public static Map<Serializable, CreativeApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeApplication update(
		CreativeApplication creativeApplication) {

		return getPersistence().update(creativeApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeApplication update(
		CreativeApplication creativeApplication,
		ServiceContext serviceContext) {

		return getPersistence().update(creativeApplication, serviceContext);
	}

	/**
	 * Returns all the creative applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching creative applications
	 */
	public static List<CreativeApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the creative applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	public static List<CreativeApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	public static List<CreativeApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	public static List<CreativeApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findByUuid_First(
			String uuid,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchByUuid_First(
		String uuid, OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findByUuid_Last(
			String uuid,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchByUuid_Last(
		String uuid, OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where uuid = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public static CreativeApplication[] findByUuid_PrevAndNext(
			long CreativeApplicationId, String uuid,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			CreativeApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the creative applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of creative applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching creative applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the creative application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the creative application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the creative application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the creative application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the creative application that was removed
	 */
	public static CreativeApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of creative applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching creative applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching creative applications
	 */
	public static List<CreativeApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	public static List<CreativeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	public static List<CreativeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	public static List<CreativeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public static CreativeApplication[] findByUuid_C_PrevAndNext(
			long CreativeApplicationId, String uuid, long companyId,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			CreativeApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the creative applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching creative applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the creative application where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative application where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchBygetCreativeById(
		long CreativeApplicationId) {

		return getPersistence().fetchBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative application where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeById(
			CreativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative application where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative application that was removed
	 */
	public static CreativeApplication removeBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().removeBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative applications where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative applications
	 */
	public static int countBygetCreativeById(long CreativeApplicationId) {
		return getPersistence().countBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching creative applications
	 */
	public static List<CreativeApplication>
		findBygetCreativeApplicationByStatusUser(int status, long userId) {

		return getPersistence().findBygetCreativeApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns a range of all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	public static List<CreativeApplication>
		findBygetCreativeApplicationByStatusUser(
			int status, long userId, int start, int end) {

		return getPersistence().findBygetCreativeApplicationByStatusUser(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	public static List<CreativeApplication>
		findBygetCreativeApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().findBygetCreativeApplicationByStatusUser(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	public static List<CreativeApplication>
		findBygetCreativeApplicationByStatusUser(
			int status, long userId, int start, int end,
			OrderByComparator<CreativeApplication> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetCreativeApplicationByStatusUser(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication
			findBygetCreativeApplicationByStatusUser_First(
				int status, long userId,
				OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findBygetCreativeApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication
		fetchBygetCreativeApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().fetchBygetCreativeApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication
			findBygetCreativeApplicationByStatusUser_Last(
				int status, long userId,
				OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findBygetCreativeApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication
		fetchBygetCreativeApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().fetchBygetCreativeApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public static CreativeApplication[]
			findBygetCreativeApplicationByStatusUser_PrevAndNext(
				long CreativeApplicationId, int status, long userId,
				OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().
			findBygetCreativeApplicationByStatusUser_PrevAndNext(
				CreativeApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the creative applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetCreativeApplicationByStatusUser(
		int status, long userId) {

		getPersistence().removeBygetCreativeApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns the number of creative applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching creative applications
	 */
	public static int countBygetCreativeApplicationByStatusUser(
		int status, long userId) {

		return getPersistence().countBygetCreativeApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns all the creative applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching creative applications
	 */
	public static List<CreativeApplication> findBygetCreativeByStatus(
		int status) {

		return getPersistence().findBygetCreativeByStatus(status);
	}

	/**
	 * Returns a range of all the creative applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	public static List<CreativeApplication> findBygetCreativeByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetCreativeByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the creative applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	public static List<CreativeApplication> findBygetCreativeByStatus(
		int status, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().findBygetCreativeByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	public static List<CreativeApplication> findBygetCreativeByStatus(
		int status, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCreativeByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findBygetCreativeByStatus_First(
			int status,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findBygetCreativeByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchBygetCreativeByStatus_First(
		int status, OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().fetchBygetCreativeByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findBygetCreativeByStatus_Last(
			int status,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findBygetCreativeByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchBygetCreativeByStatus_Last(
		int status, OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().fetchBygetCreativeByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where status = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public static CreativeApplication[] findBygetCreativeByStatus_PrevAndNext(
			long CreativeApplicationId, int status,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findBygetCreativeByStatus_PrevAndNext(
			CreativeApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the creative applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetCreativeByStatus(int status) {
		getPersistence().removeBygetCreativeByStatus(status);
	}

	/**
	 * Returns the number of creative applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching creative applications
	 */
	public static int countBygetCreativeByStatus(int status) {
		return getPersistence().countBygetCreativeByStatus(status);
	}

	/**
	 * Returns the creative application where applicationNumber = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findBygetCreativeByAppNo(
			String applicationNumber)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findBygetCreativeByAppNo(applicationNumber);
	}

	/**
	 * Returns the creative application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchBygetCreativeByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetCreativeByAppNo(applicationNumber);
	}

	/**
	 * Returns the creative application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchBygetCreativeByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the creative application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the creative application that was removed
	 */
	public static CreativeApplication removeBygetCreativeByAppNo(
			String applicationNumber)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().removeBygetCreativeByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of creative applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching creative applications
	 */
	public static int countBygetCreativeByAppNo(String applicationNumber) {
		return getPersistence().countBygetCreativeByAppNo(applicationNumber);
	}

	/**
	 * Returns the creative application where caseId = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public static CreativeApplication findBygetCreativeBy_CI(String caseId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findBygetCreativeBy_CI(caseId);
	}

	/**
	 * Returns the creative application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchBygetCreativeBy_CI(String caseId) {
		return getPersistence().fetchBygetCreativeBy_CI(caseId);
	}

	/**
	 * Returns the creative application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchBygetCreativeBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeBy_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the creative application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the creative application that was removed
	 */
	public static CreativeApplication removeBygetCreativeBy_CI(String caseId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().removeBygetCreativeBy_CI(caseId);
	}

	/**
	 * Returns the number of creative applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative applications
	 */
	public static int countBygetCreativeBy_CI(String caseId) {
		return getPersistence().countBygetCreativeBy_CI(caseId);
	}

	/**
	 * Caches the creative application in the entity cache if it is enabled.
	 *
	 * @param creativeApplication the creative application
	 */
	public static void cacheResult(CreativeApplication creativeApplication) {
		getPersistence().cacheResult(creativeApplication);
	}

	/**
	 * Caches the creative applications in the entity cache if it is enabled.
	 *
	 * @param creativeApplications the creative applications
	 */
	public static void cacheResult(
		List<CreativeApplication> creativeApplications) {

		getPersistence().cacheResult(creativeApplications);
	}

	/**
	 * Creates a new creative application with the primary key. Does not add the creative application to the database.
	 *
	 * @param CreativeApplicationId the primary key for the new creative application
	 * @return the new creative application
	 */
	public static CreativeApplication create(long CreativeApplicationId) {
		return getPersistence().create(CreativeApplicationId);
	}

	/**
	 * Removes the creative application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application that was removed
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public static CreativeApplication remove(long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().remove(CreativeApplicationId);
	}

	public static CreativeApplication updateImpl(
		CreativeApplication creativeApplication) {

		return getPersistence().updateImpl(creativeApplication);
	}

	/**
	 * Returns the creative application with the primary key or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public static CreativeApplication findByPrimaryKey(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getPersistence().findByPrimaryKey(CreativeApplicationId);
	}

	/**
	 * Returns the creative application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application, or <code>null</code> if a creative application with the primary key could not be found
	 */
	public static CreativeApplication fetchByPrimaryKey(
		long CreativeApplicationId) {

		return getPersistence().fetchByPrimaryKey(CreativeApplicationId);
	}

	/**
	 * Returns all the creative applications.
	 *
	 * @return the creative applications
	 */
	public static List<CreativeApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of creative applications
	 */
	public static List<CreativeApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative applications
	 */
	public static List<CreativeApplication> findAll(
		int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative applications
	 */
	public static List<CreativeApplication> findAll(
		int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative applications.
	 *
	 * @return the number of creative applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeApplicationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeApplicationPersistence _persistence;

}