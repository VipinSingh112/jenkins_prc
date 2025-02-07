/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCInformationRequest;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc information request service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCInformationRequestPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCInformationRequestPersistence
 * @generated
 */
public class JADSCInformationRequestUtil {

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
		JADSCInformationRequest jadscInformationRequest) {

		getPersistence().clearCache(jadscInformationRequest);
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
	public static Map<Serializable, JADSCInformationRequest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCInformationRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCInformationRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCInformationRequest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCInformationRequest update(
		JADSCInformationRequest jadscInformationRequest) {

		return getPersistence().update(jadscInformationRequest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCInformationRequest update(
		JADSCInformationRequest jadscInformationRequest,
		ServiceContext serviceContext) {

		return getPersistence().update(jadscInformationRequest, serviceContext);
	}

	/**
	 * Returns all the jadsc information requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc information requests
	 */
	public static List<JADSCInformationRequest> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc information requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of matching jadsc information requests
	 */
	public static List<JADSCInformationRequest> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc information requests
	 */
	public static List<JADSCInformationRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc information requests
	 */
	public static List<JADSCInformationRequest> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest findByUuid_First(
			String uuid,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc information requests before and after the current jadsc information request in the ordered set where uuid = &#63;.
	 *
	 * @param jadscInfoRequestId the primary key of the current jadsc information request
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	public static JADSCInformationRequest[] findByUuid_PrevAndNext(
			long jadscInfoRequestId, String uuid,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscInfoRequestId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc information requests where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc information requests where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc information requests
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc information request where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCInformationRequestException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc information request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc information request where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc information request where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc information request that was removed
	 */
	public static JADSCInformationRequest removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc information requests where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc information requests
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc information requests
	 */
	public static List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of matching jadsc information requests
	 */
	public static List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc information requests
	 */
	public static List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc information requests
	 */
	public static List<JADSCInformationRequest> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc information requests before and after the current jadsc information request in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscInfoRequestId the primary key of the current jadsc information request
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	public static JADSCInformationRequest[] findByUuid_C_PrevAndNext(
			long jadscInfoRequestId, String uuid, long companyId,
			OrderByComparator<JADSCInformationRequest> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscInfoRequestId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc information requests where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc information requests where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc information requests
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the jadsc information request where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCInformationRequestException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest findBygetJADSCById(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().findBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc information request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest fetchBygetJADSCById(
		long jadscApplicationId) {

		return getPersistence().fetchBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc information request where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc information request, or <code>null</code> if a matching jadsc information request could not be found
	 */
	public static JADSCInformationRequest fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCById(
			jadscApplicationId, useFinderCache);
	}

	/**
	 * Removes the jadsc information request where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc information request that was removed
	 */
	public static JADSCInformationRequest removeBygetJADSCById(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().removeBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc information requests where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc information requests
	 */
	public static int countBygetJADSCById(long jadscApplicationId) {
		return getPersistence().countBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Caches the jadsc information request in the entity cache if it is enabled.
	 *
	 * @param jadscInformationRequest the jadsc information request
	 */
	public static void cacheResult(
		JADSCInformationRequest jadscInformationRequest) {

		getPersistence().cacheResult(jadscInformationRequest);
	}

	/**
	 * Caches the jadsc information requests in the entity cache if it is enabled.
	 *
	 * @param jadscInformationRequests the jadsc information requests
	 */
	public static void cacheResult(
		List<JADSCInformationRequest> jadscInformationRequests) {

		getPersistence().cacheResult(jadscInformationRequests);
	}

	/**
	 * Creates a new jadsc information request with the primary key. Does not add the jadsc information request to the database.
	 *
	 * @param jadscInfoRequestId the primary key for the new jadsc information request
	 * @return the new jadsc information request
	 */
	public static JADSCInformationRequest create(long jadscInfoRequestId) {
		return getPersistence().create(jadscInfoRequestId);
	}

	/**
	 * Removes the jadsc information request with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request that was removed
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	public static JADSCInformationRequest remove(long jadscInfoRequestId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().remove(jadscInfoRequestId);
	}

	public static JADSCInformationRequest updateImpl(
		JADSCInformationRequest jadscInformationRequest) {

		return getPersistence().updateImpl(jadscInformationRequest);
	}

	/**
	 * Returns the jadsc information request with the primary key or throws a <code>NoSuchJADSCInformationRequestException</code> if it could not be found.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request
	 * @throws NoSuchJADSCInformationRequestException if a jadsc information request with the primary key could not be found
	 */
	public static JADSCInformationRequest findByPrimaryKey(
			long jadscInfoRequestId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCInformationRequestException {

		return getPersistence().findByPrimaryKey(jadscInfoRequestId);
	}

	/**
	 * Returns the jadsc information request with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscInfoRequestId the primary key of the jadsc information request
	 * @return the jadsc information request, or <code>null</code> if a jadsc information request with the primary key could not be found
	 */
	public static JADSCInformationRequest fetchByPrimaryKey(
		long jadscInfoRequestId) {

		return getPersistence().fetchByPrimaryKey(jadscInfoRequestId);
	}

	/**
	 * Returns all the jadsc information requests.
	 *
	 * @return the jadsc information requests
	 */
	public static List<JADSCInformationRequest> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @return the range of jadsc information requests
	 */
	public static List<JADSCInformationRequest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc information requests
	 */
	public static List<JADSCInformationRequest> findAll(
		int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc information requests.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCInformationRequestModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc information requests
	 * @param end the upper bound of the range of jadsc information requests (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc information requests
	 */
	public static List<JADSCInformationRequest> findAll(
		int start, int end,
		OrderByComparator<JADSCInformationRequest> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc information requests from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc information requests.
	 *
	 * @return the number of jadsc information requests
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCInformationRequestPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JADSCInformationRequestPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JADSCInformationRequestPersistence _persistence;

}