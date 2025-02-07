/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccMediLabPhysicalResource;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc medi lab physical resource service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccMediLabPhysicalResourcePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabPhysicalResourcePersistence
 * @generated
 */
public class AccMediLabPhysicalResourceUtil {

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
		AccMediLabPhysicalResource accMediLabPhysicalResource) {

		getPersistence().clearCache(accMediLabPhysicalResource);
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
	public static Map<Serializable, AccMediLabPhysicalResource>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccMediLabPhysicalResource> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccMediLabPhysicalResource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccMediLabPhysicalResource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccMediLabPhysicalResource update(
		AccMediLabPhysicalResource accMediLabPhysicalResource) {

		return getPersistence().update(accMediLabPhysicalResource);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccMediLabPhysicalResource update(
		AccMediLabPhysicalResource accMediLabPhysicalResource,
		ServiceContext serviceContext) {

		return getPersistence().update(
			accMediLabPhysicalResource, serviceContext);
	}

	/**
	 * Returns all the acc medi lab physical resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc medi lab physical resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @return the range of matching acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab physical resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab physical resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource findByUuid_First(
			String uuid,
			OrderByComparator<AccMediLabPhysicalResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource fetchByUuid_First(
		String uuid,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource findByUuid_Last(
			String uuid,
			OrderByComparator<AccMediLabPhysicalResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource fetchByUuid_Last(
		String uuid,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc medi lab physical resources before and after the current acc medi lab physical resource in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the current acc medi lab physical resource
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a acc medi lab physical resource with the primary key could not be found
	 */
	public static AccMediLabPhysicalResource[] findByUuid_PrevAndNext(
			long accMediLabPhysicalResourceId, String uuid,
			OrderByComparator<AccMediLabPhysicalResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().findByUuid_PrevAndNext(
			accMediLabPhysicalResourceId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc medi lab physical resources where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc medi lab physical resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab physical resources
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc medi lab physical resource where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabPhysicalResourceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab physical resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab physical resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc medi lab physical resource where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab physical resource that was removed
	 */
	public static AccMediLabPhysicalResource removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc medi lab physical resources where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab physical resources
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @return the range of matching acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccMediLabPhysicalResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccMediLabPhysicalResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc medi lab physical resources before and after the current acc medi lab physical resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the current acc medi lab physical resource
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a acc medi lab physical resource with the primary key could not be found
	 */
	public static AccMediLabPhysicalResource[] findByUuid_C_PrevAndNext(
			long accMediLabPhysicalResourceId, String uuid, long companyId,
			OrderByComparator<AccMediLabPhysicalResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accMediLabPhysicalResourceId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc medi lab physical resources where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc medi lab physical resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab physical resources
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc medi lab physical resource where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabPhysicalResourceException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc medi lab physical resource where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc medi lab physical resource where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab physical resource, or <code>null</code> if a matching acc medi lab physical resource could not be found
	 */
	public static AccMediLabPhysicalResource fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc medi lab physical resource where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab physical resource that was removed
	 */
	public static AccMediLabPhysicalResource removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc medi lab physical resources where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab physical resources
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc medi lab physical resource in the entity cache if it is enabled.
	 *
	 * @param accMediLabPhysicalResource the acc medi lab physical resource
	 */
	public static void cacheResult(
		AccMediLabPhysicalResource accMediLabPhysicalResource) {

		getPersistence().cacheResult(accMediLabPhysicalResource);
	}

	/**
	 * Caches the acc medi lab physical resources in the entity cache if it is enabled.
	 *
	 * @param accMediLabPhysicalResources the acc medi lab physical resources
	 */
	public static void cacheResult(
		List<AccMediLabPhysicalResource> accMediLabPhysicalResources) {

		getPersistence().cacheResult(accMediLabPhysicalResources);
	}

	/**
	 * Creates a new acc medi lab physical resource with the primary key. Does not add the acc medi lab physical resource to the database.
	 *
	 * @param accMediLabPhysicalResourceId the primary key for the new acc medi lab physical resource
	 * @return the new acc medi lab physical resource
	 */
	public static AccMediLabPhysicalResource create(
		long accMediLabPhysicalResourceId) {

		return getPersistence().create(accMediLabPhysicalResourceId);
	}

	/**
	 * Removes the acc medi lab physical resource with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource that was removed
	 * @throws NoSuchAccMediLabPhysicalResourceException if a acc medi lab physical resource with the primary key could not be found
	 */
	public static AccMediLabPhysicalResource remove(
			long accMediLabPhysicalResourceId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().remove(accMediLabPhysicalResourceId);
	}

	public static AccMediLabPhysicalResource updateImpl(
		AccMediLabPhysicalResource accMediLabPhysicalResource) {

		return getPersistence().updateImpl(accMediLabPhysicalResource);
	}

	/**
	 * Returns the acc medi lab physical resource with the primary key or throws a <code>NoSuchAccMediLabPhysicalResourceException</code> if it could not be found.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource
	 * @throws NoSuchAccMediLabPhysicalResourceException if a acc medi lab physical resource with the primary key could not be found
	 */
	public static AccMediLabPhysicalResource findByPrimaryKey(
			long accMediLabPhysicalResourceId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabPhysicalResourceException {

		return getPersistence().findByPrimaryKey(accMediLabPhysicalResourceId);
	}

	/**
	 * Returns the acc medi lab physical resource with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabPhysicalResourceId the primary key of the acc medi lab physical resource
	 * @return the acc medi lab physical resource, or <code>null</code> if a acc medi lab physical resource with the primary key could not be found
	 */
	public static AccMediLabPhysicalResource fetchByPrimaryKey(
		long accMediLabPhysicalResourceId) {

		return getPersistence().fetchByPrimaryKey(accMediLabPhysicalResourceId);
	}

	/**
	 * Returns all the acc medi lab physical resources.
	 *
	 * @return the acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc medi lab physical resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @return the range of acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab physical resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findAll(
		int start, int end,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab physical resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabPhysicalResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab physical resources
	 * @param end the upper bound of the range of acc medi lab physical resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab physical resources
	 */
	public static List<AccMediLabPhysicalResource> findAll(
		int start, int end,
		OrderByComparator<AccMediLabPhysicalResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc medi lab physical resources from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc medi lab physical resources.
	 *
	 * @return the number of acc medi lab physical resources
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccMediLabPhysicalResourcePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccMediLabPhysicalResourcePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccMediLabPhysicalResourcePersistence _persistence;

}