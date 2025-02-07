/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCCertificateOfService;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc certificate of service service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCCertificateOfServicePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfServicePersistence
 * @generated
 */
public class JADSCCertificateOfServiceUtil {

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
		JADSCCertificateOfService jadscCertificateOfService) {

		getPersistence().clearCache(jadscCertificateOfService);
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
	public static Map<Serializable, JADSCCertificateOfService>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCCertificateOfService> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCCertificateOfService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCCertificateOfService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCCertificateOfService update(
		JADSCCertificateOfService jadscCertificateOfService) {

		return getPersistence().update(jadscCertificateOfService);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCCertificateOfService update(
		JADSCCertificateOfService jadscCertificateOfService,
		ServiceContext serviceContext) {

		return getPersistence().update(
			jadscCertificateOfService, serviceContext);
	}

	/**
	 * Returns all the jadsc certificate of services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc certificate of services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of matching jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService findByUuid_First(
			String uuid,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService fetchByUuid_First(
		String uuid,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService findByUuid_Last(
			String uuid,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService fetchByUuid_Last(
		String uuid,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc certificate of services before and after the current jadsc certificate of service in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	public static JADSCCertificateOfService[] findByUuid_PrevAndNext(
			long jadscCOSId, String uuid,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscCOSId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc certificate of services where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc certificate of services where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc certificate of services
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc certificate of service where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCertificateOfServiceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc certificate of service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc certificate of service where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc certificate of service where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc certificate of service that was removed
	 */
	public static JADSCCertificateOfService removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc certificate of services where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc certificate of services
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of matching jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc certificate of services before and after the current jadsc certificate of service in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCOSId the primary key of the current jadsc certificate of service
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	public static JADSCCertificateOfService[] findByUuid_C_PrevAndNext(
			long jadscCOSId, String uuid, long companyId,
			OrderByComparator<JADSCCertificateOfService> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscCOSId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc certificate of services where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc certificate of services where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc certificate of services
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the jadsc certificate of service where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCCertificateOfServiceException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService findBygetJADSCById(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().findBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc certificate of service where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService fetchBygetJADSCById(
		long jadscApplicationId) {

		return getPersistence().fetchBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the jadsc certificate of service where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc certificate of service, or <code>null</code> if a matching jadsc certificate of service could not be found
	 */
	public static JADSCCertificateOfService fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJADSCById(
			jadscApplicationId, useFinderCache);
	}

	/**
	 * Removes the jadsc certificate of service where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc certificate of service that was removed
	 */
	public static JADSCCertificateOfService removeBygetJADSCById(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().removeBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc certificate of services where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc certificate of services
	 */
	public static int countBygetJADSCById(long jadscApplicationId) {
		return getPersistence().countBygetJADSCById(jadscApplicationId);
	}

	/**
	 * Caches the jadsc certificate of service in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfService the jadsc certificate of service
	 */
	public static void cacheResult(
		JADSCCertificateOfService jadscCertificateOfService) {

		getPersistence().cacheResult(jadscCertificateOfService);
	}

	/**
	 * Caches the jadsc certificate of services in the entity cache if it is enabled.
	 *
	 * @param jadscCertificateOfServices the jadsc certificate of services
	 */
	public static void cacheResult(
		List<JADSCCertificateOfService> jadscCertificateOfServices) {

		getPersistence().cacheResult(jadscCertificateOfServices);
	}

	/**
	 * Creates a new jadsc certificate of service with the primary key. Does not add the jadsc certificate of service to the database.
	 *
	 * @param jadscCOSId the primary key for the new jadsc certificate of service
	 * @return the new jadsc certificate of service
	 */
	public static JADSCCertificateOfService create(long jadscCOSId) {
		return getPersistence().create(jadscCOSId);
	}

	/**
	 * Removes the jadsc certificate of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service that was removed
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	public static JADSCCertificateOfService remove(long jadscCOSId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().remove(jadscCOSId);
	}

	public static JADSCCertificateOfService updateImpl(
		JADSCCertificateOfService jadscCertificateOfService) {

		return getPersistence().updateImpl(jadscCertificateOfService);
	}

	/**
	 * Returns the jadsc certificate of service with the primary key or throws a <code>NoSuchJADSCCertificateOfServiceException</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service
	 * @throws NoSuchJADSCCertificateOfServiceException if a jadsc certificate of service with the primary key could not be found
	 */
	public static JADSCCertificateOfService findByPrimaryKey(long jadscCOSId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCertificateOfServiceException {

		return getPersistence().findByPrimaryKey(jadscCOSId);
	}

	/**
	 * Returns the jadsc certificate of service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCOSId the primary key of the jadsc certificate of service
	 * @return the jadsc certificate of service, or <code>null</code> if a jadsc certificate of service with the primary key could not be found
	 */
	public static JADSCCertificateOfService fetchByPrimaryKey(long jadscCOSId) {
		return getPersistence().fetchByPrimaryKey(jadscCOSId);
	}

	/**
	 * Returns all the jadsc certificate of services.
	 *
	 * @return the jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @return the range of jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc certificate of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCertificateOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc certificate of services
	 * @param end the upper bound of the range of jadsc certificate of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc certificate of services
	 */
	public static List<JADSCCertificateOfService> findAll(
		int start, int end,
		OrderByComparator<JADSCCertificateOfService> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc certificate of services from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc certificate of services.
	 *
	 * @return the number of jadsc certificate of services
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCCertificateOfServicePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JADSCCertificateOfServicePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JADSCCertificateOfServicePersistence _persistence;

}