/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccInsBodiesPhyResource;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc ins bodies phy resource service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccInsBodiesPhyResourcePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesPhyResourcePersistence
 * @generated
 */
public class AccInsBodiesPhyResourceUtil {

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
		AccInsBodiesPhyResource accInsBodiesPhyResource) {

		getPersistence().clearCache(accInsBodiesPhyResource);
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
	public static Map<Serializable, AccInsBodiesPhyResource> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccInsBodiesPhyResource> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccInsBodiesPhyResource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccInsBodiesPhyResource> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccInsBodiesPhyResource update(
		AccInsBodiesPhyResource accInsBodiesPhyResource) {

		return getPersistence().update(accInsBodiesPhyResource);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccInsBodiesPhyResource update(
		AccInsBodiesPhyResource accInsBodiesPhyResource,
		ServiceContext serviceContext) {

		return getPersistence().update(accInsBodiesPhyResource, serviceContext);
	}

	/**
	 * Returns all the acc ins bodies phy resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc ins bodies phy resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @return the range of matching acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource findByUuid_First(
			String uuid,
			OrderByComparator<AccInsBodiesPhyResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource fetchByUuid_First(
		String uuid,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource findByUuid_Last(
			String uuid,
			OrderByComparator<AccInsBodiesPhyResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource fetchByUuid_Last(
		String uuid,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc ins bodies phy resources before and after the current acc ins bodies phy resource in the ordered set where uuid = &#63;.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the current acc ins bodies phy resource
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public static AccInsBodiesPhyResource[] findByUuid_PrevAndNext(
			long accInsBodiesPhyResourceId, String uuid,
			OrderByComparator<AccInsBodiesPhyResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().findByUuid_PrevAndNext(
			accInsBodiesPhyResourceId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc ins bodies phy resources where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc ins bodies phy resources where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc ins bodies phy resources
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc ins bodies phy resource where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccInsBodiesPhyResourceException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies phy resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies phy resource where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc ins bodies phy resource where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc ins bodies phy resource that was removed
	 */
	public static AccInsBodiesPhyResource removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc ins bodies phy resources where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc ins bodies phy resources
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @return the range of matching acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccInsBodiesPhyResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccInsBodiesPhyResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc ins bodies phy resources before and after the current acc ins bodies phy resource in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the current acc ins bodies phy resource
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public static AccInsBodiesPhyResource[] findByUuid_C_PrevAndNext(
			long accInsBodiesPhyResourceId, String uuid, long companyId,
			OrderByComparator<AccInsBodiesPhyResource> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accInsBodiesPhyResourceId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc ins bodies phy resources where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc ins bodies phy resources where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc ins bodies phy resources
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc ins bodies phy resource where janaacApplicationId = &#63; or throws a <code>NoSuchAccInsBodiesPhyResourceException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc ins bodies phy resource where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc ins bodies phy resource where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies phy resource, or <code>null</code> if a matching acc ins bodies phy resource could not be found
	 */
	public static AccInsBodiesPhyResource fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc ins bodies phy resource where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc ins bodies phy resource that was removed
	 */
	public static AccInsBodiesPhyResource removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc ins bodies phy resources where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc ins bodies phy resources
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc ins bodies phy resource in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesPhyResource the acc ins bodies phy resource
	 */
	public static void cacheResult(
		AccInsBodiesPhyResource accInsBodiesPhyResource) {

		getPersistence().cacheResult(accInsBodiesPhyResource);
	}

	/**
	 * Caches the acc ins bodies phy resources in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesPhyResources the acc ins bodies phy resources
	 */
	public static void cacheResult(
		List<AccInsBodiesPhyResource> accInsBodiesPhyResources) {

		getPersistence().cacheResult(accInsBodiesPhyResources);
	}

	/**
	 * Creates a new acc ins bodies phy resource with the primary key. Does not add the acc ins bodies phy resource to the database.
	 *
	 * @param accInsBodiesPhyResourceId the primary key for the new acc ins bodies phy resource
	 * @return the new acc ins bodies phy resource
	 */
	public static AccInsBodiesPhyResource create(
		long accInsBodiesPhyResourceId) {

		return getPersistence().create(accInsBodiesPhyResourceId);
	}

	/**
	 * Removes the acc ins bodies phy resource with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource that was removed
	 * @throws NoSuchAccInsBodiesPhyResourceException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public static AccInsBodiesPhyResource remove(long accInsBodiesPhyResourceId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().remove(accInsBodiesPhyResourceId);
	}

	public static AccInsBodiesPhyResource updateImpl(
		AccInsBodiesPhyResource accInsBodiesPhyResource) {

		return getPersistence().updateImpl(accInsBodiesPhyResource);
	}

	/**
	 * Returns the acc ins bodies phy resource with the primary key or throws a <code>NoSuchAccInsBodiesPhyResourceException</code> if it could not be found.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource
	 * @throws NoSuchAccInsBodiesPhyResourceException if a acc ins bodies phy resource with the primary key could not be found
	 */
	public static AccInsBodiesPhyResource findByPrimaryKey(
			long accInsBodiesPhyResourceId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesPhyResourceException {

		return getPersistence().findByPrimaryKey(accInsBodiesPhyResourceId);
	}

	/**
	 * Returns the acc ins bodies phy resource with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accInsBodiesPhyResourceId the primary key of the acc ins bodies phy resource
	 * @return the acc ins bodies phy resource, or <code>null</code> if a acc ins bodies phy resource with the primary key could not be found
	 */
	public static AccInsBodiesPhyResource fetchByPrimaryKey(
		long accInsBodiesPhyResourceId) {

		return getPersistence().fetchByPrimaryKey(accInsBodiesPhyResourceId);
	}

	/**
	 * Returns all the acc ins bodies phy resources.
	 *
	 * @return the acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc ins bodies phy resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @return the range of acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findAll(
		int start, int end,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies phy resources.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesPhyResourceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies phy resources
	 * @param end the upper bound of the range of acc ins bodies phy resources (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc ins bodies phy resources
	 */
	public static List<AccInsBodiesPhyResource> findAll(
		int start, int end,
		OrderByComparator<AccInsBodiesPhyResource> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc ins bodies phy resources from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc ins bodies phy resources.
	 *
	 * @return the number of acc ins bodies phy resources
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccInsBodiesPhyResourcePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccInsBodiesPhyResourcePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccInsBodiesPhyResourcePersistence _persistence;

}