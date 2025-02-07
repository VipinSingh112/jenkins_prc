/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc application service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCApplicationPersistence
 * @generated
 */
public class JADSCApplicationUtil {

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
	public static void clearCache(JADSCApplication jadscApplication) {
		getPersistence().clearCache(jadscApplication);
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
	public static Map<Serializable, JADSCApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCApplication update(JADSCApplication jadscApplication) {
		return getPersistence().update(jadscApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCApplication update(
		JADSCApplication jadscApplication, ServiceContext serviceContext) {

		return getPersistence().update(jadscApplication, serviceContext);
	}

	/**
	 * Returns all the jadsc applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc applications
	 */
	public static List<JADSCApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public static List<JADSCApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findByUuid_First(
			String uuid, OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchByUuid_First(
		String uuid, OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findByUuid_Last(
			String uuid, OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchByUuid_Last(
		String uuid, OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication[] findByUuid_PrevAndNext(
			long jadscApplicationId, String uuid,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc application that was removed
	 */
	public static JADSCApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc applications
	 */
	public static List<JADSCApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public static List<JADSCApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication[] findByUuid_C_PrevAndNext(
			long jadscApplicationId, String uuid, long companyId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the jadsc application where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCById(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc application where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCById(
		long jadscApplicationId) {

		return getPersistence().fetchBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc application where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCById(
			jadscApplicationId, useFinderCache);
	}

	/**
	 * Removes the jadsc application where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc application that was removed
	 */
	public static JADSCApplication removeBygetJADSCById(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().removeBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc applications where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc applications
	 */
	public static int countBygetJADSCById(long jadscApplicationId) {
		return getPersistence().countBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId) {

		return getPersistence().findBygetJADSCByS_U(status, userId);
	}

	/**
	 * Returns a range of all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetJADSCByS_U(status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().findBygetJADSCByS_U(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJADSCByS_U(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByS_U_First(
			int status, long userId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByS_U_First(
		int status, long userId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchBygetJADSCByS_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByS_U_Last(
			int status, long userId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByS_U_Last(
		int status, long userId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchBygetJADSCByS_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication[] findBygetJADSCByS_U_PrevAndNext(
			long jadscApplicationId, int status, long userId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByS_U_PrevAndNext(
			jadscApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the jadsc applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetJADSCByS_U(int status, long userId) {
		getPersistence().removeBygetJADSCByS_U(status, userId);
	}

	/**
	 * Returns the number of jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching jadsc applications
	 */
	public static int countBygetJADSCByS_U(int status, long userId) {
		return getPersistence().countBygetJADSCByS_U(status, userId);
	}

	/**
	 * Returns the jadsc application where caseId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByCaseId(String caseId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByCaseId(caseId);
	}

	/**
	 * Returns the jadsc application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByCaseId(String caseId) {
		return getPersistence().fetchBygetJADSCByCaseId(caseId);
	}

	/**
	 * Returns the jadsc application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the jadsc application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application that was removed
	 */
	public static JADSCApplication removeBygetJADSCByCaseId(String caseId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().removeBygetJADSCByCaseId(caseId);
	}

	/**
	 * Returns the number of jadsc applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc applications
	 */
	public static int countBygetJADSCByCaseId(String caseId) {
		return getPersistence().countBygetJADSCByCaseId(caseId);
	}

	/**
	 * Returns all the jadsc applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByStatus(int status) {
		return getPersistence().findBygetJADSCByStatus(status);
	}

	/**
	 * Returns a range of all the jadsc applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetJADSCByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByStatus(
		int status, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().findBygetJADSCByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByStatus(
		int status, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJADSCByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByStatus_First(
			int status, OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByStatus_First(
		int status, OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchBygetJADSCByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByStatus_Last(
			int status, OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByStatus_Last(
		int status, OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchBygetJADSCByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where status = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication[] findBygetJADSCByStatus_PrevAndNext(
			long jadscApplicationId, int status,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByStatus_PrevAndNext(
			jadscApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the jadsc applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetJADSCByStatus(int status) {
		getPersistence().removeBygetJADSCByStatus(status);
	}

	/**
	 * Returns the number of jadsc applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching jadsc applications
	 */
	public static int countBygetJADSCByStatus(int status) {
		return getPersistence().countBygetJADSCByStatus(status);
	}

	/**
	 * Returns all the jadsc applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId) {

		return getPersistence().findBygetJADSCByEntityId(entityId);
	}

	/**
	 * Returns a range of all the jadsc applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId, int start, int end) {

		return getPersistence().findBygetJADSCByEntityId(entityId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().findBygetJADSCByEntityId(
			entityId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJADSCByEntityId(
			entityId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByEntityId_First(
			String entityId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByEntityId_First(
		String entityId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchBygetJADSCByEntityId_First(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByEntityId_Last(
			String entityId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByEntityId_Last(
		String entityId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchBygetJADSCByEntityId_Last(
			entityId, orderByComparator);
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication[] findBygetJADSCByEntityId_PrevAndNext(
			long jadscApplicationId, String entityId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByEntityId_PrevAndNext(
			jadscApplicationId, entityId, orderByComparator);
	}

	/**
	 * Removes all the jadsc applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public static void removeBygetJADSCByEntityId(String entityId) {
		getPersistence().removeBygetJADSCByEntityId(entityId);
	}

	/**
	 * Returns the number of jadsc applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching jadsc applications
	 */
	public static int countBygetJADSCByEntityId(String entityId) {
		return getPersistence().countBygetJADSCByEntityId(entityId);
	}

	/**
	 * Returns all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status) {

		return getPersistence().findBygetJADSCByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns a range of all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status, int start, int end) {

		return getPersistence().findBygetJADSCByEntityId_Status(
			entityId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().findBygetJADSCByEntityId_Status(
			entityId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	public static List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJADSCByEntityId_Status(
			entityId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchBygetJADSCByEntityId_Status_First(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().fetchBygetJADSCByEntityId_Status_Last(
			entityId, status, orderByComparator);
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication[]
			findBygetJADSCByEntityId_Status_PrevAndNext(
				long jadscApplicationId, String entityId, int status,
				OrderByComparator<JADSCApplication> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByEntityId_Status_PrevAndNext(
			jadscApplicationId, entityId, status, orderByComparator);
	}

	/**
	 * Removes all the jadsc applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public static void removeBygetJADSCByEntityId_Status(
		String entityId, int status) {

		getPersistence().removeBygetJADSCByEntityId_Status(entityId, status);
	}

	/**
	 * Returns the number of jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching jadsc applications
	 */
	public static int countBygetJADSCByEntityId_Status(
		String entityId, int status) {

		return getPersistence().countBygetJADSCByEntityId_Status(
			entityId, status);
	}

	/**
	 * Returns the jadsc application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByEI_CI(
			String entityId, String caseId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the jadsc application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByEI_CI(
		String entityId, String caseId) {

		return getPersistence().fetchBygetJADSCByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the jadsc application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCByEI_CI(
			entityId, caseId, useFinderCache);
	}

	/**
	 * Removes the jadsc application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the jadsc application that was removed
	 */
	public static JADSCApplication removeBygetJADSCByEI_CI(
			String entityId, String caseId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().removeBygetJADSCByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the number of jadsc applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching jadsc applications
	 */
	public static int countBygetJADSCByEI_CI(String entityId, String caseId) {
		return getPersistence().countBygetJADSCByEI_CI(entityId, caseId);
	}

	/**
	 * Returns the jadsc application where applicationNumber = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCByAppNo(
			String applicationNumber)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCByAppNo(applicationNumber);
	}

	/**
	 * Returns the jadsc application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetJADSCByAppNo(applicationNumber);
	}

	/**
	 * Returns the jadsc application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the jadsc application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the jadsc application that was removed
	 */
	public static JADSCApplication removeBygetJADSCByAppNo(
			String applicationNumber)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().removeBygetJADSCByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of jadsc applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching jadsc applications
	 */
	public static int countBygetJADSCByAppNo(String applicationNumber) {
		return getPersistence().countBygetJADSCByAppNo(applicationNumber);
	}

	/**
	 * Returns the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	public static JADSCApplication findBygetJADSCRegstByAT_AppNo(
			String breachOfConfidentiality, String expiredLicenseAppNumber)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findBygetJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber);
	}

	/**
	 * Returns the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCRegstByAT_AppNo(
		String breachOfConfidentiality, String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber);
	}

	/**
	 * Returns the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	public static JADSCApplication fetchBygetJADSCRegstByAT_AppNo(
		String breachOfConfidentiality, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the jadsc application that was removed
	 */
	public static JADSCApplication removeBygetJADSCRegstByAT_AppNo(
			String breachOfConfidentiality, String expiredLicenseAppNumber)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().removeBygetJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of jadsc applications where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching jadsc applications
	 */
	public static int countBygetJADSCRegstByAT_AppNo(
		String breachOfConfidentiality, String expiredLicenseAppNumber) {

		return getPersistence().countBygetJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber);
	}

	/**
	 * Caches the jadsc application in the entity cache if it is enabled.
	 *
	 * @param jadscApplication the jadsc application
	 */
	public static void cacheResult(JADSCApplication jadscApplication) {
		getPersistence().cacheResult(jadscApplication);
	}

	/**
	 * Caches the jadsc applications in the entity cache if it is enabled.
	 *
	 * @param jadscApplications the jadsc applications
	 */
	public static void cacheResult(List<JADSCApplication> jadscApplications) {
		getPersistence().cacheResult(jadscApplications);
	}

	/**
	 * Creates a new jadsc application with the primary key. Does not add the jadsc application to the database.
	 *
	 * @param jadscApplicationId the primary key for the new jadsc application
	 * @return the new jadsc application
	 */
	public static JADSCApplication create(long jadscApplicationId) {
		return getPersistence().create(jadscApplicationId);
	}

	/**
	 * Removes the jadsc application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application that was removed
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication remove(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().remove(jadscApplicationId);
	}

	public static JADSCApplication updateImpl(
		JADSCApplication jadscApplication) {

		return getPersistence().updateImpl(jadscApplication);
	}

	/**
	 * Returns the jadsc application with the primary key or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication findByPrimaryKey(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCApplicationException {

		return getPersistence().findByPrimaryKey(jadscApplicationId);
	}

	/**
	 * Returns the jadsc application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application, or <code>null</code> if a jadsc application with the primary key could not be found
	 */
	public static JADSCApplication fetchByPrimaryKey(long jadscApplicationId) {
		return getPersistence().fetchByPrimaryKey(jadscApplicationId);
	}

	/**
	 * Returns all the jadsc applications.
	 *
	 * @return the jadsc applications
	 */
	public static List<JADSCApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of jadsc applications
	 */
	public static List<JADSCApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc applications
	 */
	public static List<JADSCApplication> findAll(
		int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc applications
	 */
	public static List<JADSCApplication> findAll(
		int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc applications.
	 *
	 * @return the number of jadsc applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(JADSCApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile JADSCApplicationPersistence _persistence;

}