/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc oath request service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCOathRequestPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCOathRequestPersistence
 * @generated
 */
public class JADSCOathRequestUtil {

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
	public static void clearCache(JADSCOathRequest jadscOathRequest) {
		getPersistence().clearCache(jadscOathRequest);
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
	public static Map<Serializable, JADSCOathRequest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCOathRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCOathRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCOathRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCOathRequest update(JADSCOathRequest jadscOathRequest) {
		return getPersistence().update(jadscOathRequest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCOathRequest update(
		JADSCOathRequest jadscOathRequest, ServiceContext serviceContext) {

		return getPersistence().update(jadscOathRequest, serviceContext);
	}

	/**
	 * Returns all the jadsc oath requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc oath requests
	 */
	public static List<JADSCOathRequest> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc oath requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of matching jadsc oath requests
	 */
	public static List<JADSCOathRequest> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc oath requests
	 */
	public static List<JADSCOathRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc oath requests
	 */
	public static List<JADSCOathRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest findByUuid_First(
			String uuid, OrderByComparator<JADSCOathRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest fetchByUuid_First(
		String uuid, OrderByComparator<JADSCOathRequest> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest findByUuid_Last(
			String uuid, OrderByComparator<JADSCOathRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest fetchByUuid_Last(
		String uuid, OrderByComparator<JADSCOathRequest> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc oath requests before and after the current jadsc oath request in the ordered set where uuid = &#63;.
	 *
	 * @param jadscOathRequestId the primary key of the current jadsc oath request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	public static JADSCOathRequest[] findByUuid_PrevAndNext(
			long jadscOathRequestId, String uuid,
			OrderByComparator<JADSCOathRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscOathRequestId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc oath requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc oath requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc oath requests
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc oath request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCOathRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest findByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc oath request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc oath request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc oath request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc oath request that was removed
	 */
	public static JADSCOathRequest removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc oath requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc oath requests
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc oath requests
	 */
	public static List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of matching jadsc oath requests
	 */
	public static List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc oath requests
	 */
	public static List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc oath requests
	 */
	public static List<JADSCOathRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCOathRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCOathRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc oath requests before and after the current jadsc oath request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscOathRequestId the primary key of the current jadsc oath request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	public static JADSCOathRequest[] findByUuid_C_PrevAndNext(
			long jadscOathRequestId, String uuid, long companyId,
			OrderByComparator<JADSCOathRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscOathRequestId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc oath requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc oath requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc oath requests
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the jadsc oath request where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCOathRequestException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest findBygetJADSCById(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().findBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc oath request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest fetchBygetJADSCById(
		long jadscApplicationId) {

		return getPersistence().fetchBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc oath request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc oath request, or <code>null</code> if a matching jadsc oath request could not be found
	 */
	public static JADSCOathRequest fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCById(
			jadscApplicationId, useFinderCache);
	}

	/**
	 * Removes the jadsc oath request where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc oath request that was removed
	 */
	public static JADSCOathRequest removeBygetJADSCById(long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().removeBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc oath requests where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc oath requests
	 */
	public static int countBygetJADSCById(long jadscApplicationId) {
		return getPersistence().countBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Caches the jadsc oath request in the entity cache if it is enabled.
	 *
	 * @param jadscOathRequest the jadsc oath request
	 */
	public static void cacheResult(JADSCOathRequest jadscOathRequest) {
		getPersistence().cacheResult(jadscOathRequest);
	}

	/**
	 * Caches the jadsc oath requests in the entity cache if it is enabled.
	 *
	 * @param jadscOathRequests the jadsc oath requests
	 */
	public static void cacheResult(List<JADSCOathRequest> jadscOathRequests) {
		getPersistence().cacheResult(jadscOathRequests);
	}

	/**
	 * Creates a new jadsc oath request with the primary key. Does not add the jadsc oath request to the database.
	 *
	 * @param jadscOathRequestId the primary key for the new jadsc oath request
	 * @return the new jadsc oath request
	 */
	public static JADSCOathRequest create(long jadscOathRequestId) {
		return getPersistence().create(jadscOathRequestId);
	}

	/**
	 * Removes the jadsc oath request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request that was removed
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	public static JADSCOathRequest remove(long jadscOathRequestId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().remove(jadscOathRequestId);
	}

	public static JADSCOathRequest updateImpl(
		JADSCOathRequest jadscOathRequest) {

		return getPersistence().updateImpl(jadscOathRequest);
	}

	/**
	 * Returns the jadsc oath request with the primary key or throws a <code>NoSuchJADSCOathRequestException</code> if it could not be found.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request
	 * @throws NoSuchJADSCOathRequestException if a jadsc oath request with the primary key could not be found
	 */
	public static JADSCOathRequest findByPrimaryKey(long jadscOathRequestId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCOathRequestException {

		return getPersistence().findByPrimaryKey(jadscOathRequestId);
	}

	/**
	 * Returns the jadsc oath request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscOathRequestId the primary key of the jadsc oath request
	 * @return the jadsc oath request, or <code>null</code> if a jadsc oath request with the primary key could not be found
	 */
	public static JADSCOathRequest fetchByPrimaryKey(long jadscOathRequestId) {
		return getPersistence().fetchByPrimaryKey(jadscOathRequestId);
	}

	/**
	 * Returns all the jadsc oath requests.
	 *
	 * @return the jadsc oath requests
	 */
	public static List<JADSCOathRequest> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @return the range of jadsc oath requests
	 */
	public static List<JADSCOathRequest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc oath requests
	 */
	public static List<JADSCOathRequest> findAll(
		int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc oath requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCOathRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc oath requests
	 * @param end the upper bound of the range of jadsc oath requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc oath requests
	 */
	public static List<JADSCOathRequest> findAll(
		int start, int end,
		OrderByComparator<JADSCOathRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc oath requests from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc oath requests.
	 *
	 * @return the number of jadsc oath requests
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCOathRequestPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(JADSCOathRequestPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile JADSCOathRequestPersistence _persistence;

}