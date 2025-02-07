/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccInsBodiesOrganization;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc ins bodies organization service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccInsBodiesOrganizationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesOrganizationPersistence
 * @generated
 */
public class AccInsBodiesOrganizationUtil {

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
		AccInsBodiesOrganization accInsBodiesOrganization) {

		getPersistence().clearCache(accInsBodiesOrganization);
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
	public static Map<Serializable, AccInsBodiesOrganization>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccInsBodiesOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccInsBodiesOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccInsBodiesOrganization> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccInsBodiesOrganization update(
		AccInsBodiesOrganization accInsBodiesOrganization) {

		return getPersistence().update(accInsBodiesOrganization);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccInsBodiesOrganization update(
		AccInsBodiesOrganization accInsBodiesOrganization,
		ServiceContext serviceContext) {

		return getPersistence().update(
			accInsBodiesOrganization, serviceContext);
	}

	/**
	 * Returns all the acc ins bodies organizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc ins bodies organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @return the range of matching acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies organizations where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization findByUuid_First(
			String uuid,
			OrderByComparator<AccInsBodiesOrganization> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization fetchByUuid_First(
		String uuid,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization findByUuid_Last(
			String uuid,
			OrderByComparator<AccInsBodiesOrganization> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization fetchByUuid_Last(
		String uuid,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc ins bodies organizations before and after the current acc ins bodies organization in the ordered set where uuid = &#63;.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the current acc ins bodies organization
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a acc ins bodies organization with the primary key could not be found
	 */
	public static AccInsBodiesOrganization[] findByUuid_PrevAndNext(
			long accInsBodiesOrganizationId, String uuid,
			OrderByComparator<AccInsBodiesOrganization> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().findByUuid_PrevAndNext(
			accInsBodiesOrganizationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc ins bodies organizations where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc ins bodies organizations where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc ins bodies organizations
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc ins bodies organization where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccInsBodiesOrganizationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies organization where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc ins bodies organization where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc ins bodies organization where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc ins bodies organization that was removed
	 */
	public static AccInsBodiesOrganization removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc ins bodies organizations where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc ins bodies organizations
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @return the range of matching acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccInsBodiesOrganization> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccInsBodiesOrganization> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc ins bodies organizations before and after the current acc ins bodies organization in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the current acc ins bodies organization
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a acc ins bodies organization with the primary key could not be found
	 */
	public static AccInsBodiesOrganization[] findByUuid_C_PrevAndNext(
			long accInsBodiesOrganizationId, String uuid, long companyId,
			OrderByComparator<AccInsBodiesOrganization> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accInsBodiesOrganizationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc ins bodies organizations where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc ins bodies organizations where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc ins bodies organizations
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc ins bodies organization where janaacApplicationId = &#63; or throws a <code>NoSuchAccInsBodiesOrganizationException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc ins bodies organization where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc ins bodies organization where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc ins bodies organization, or <code>null</code> if a matching acc ins bodies organization could not be found
	 */
	public static AccInsBodiesOrganization fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc ins bodies organization where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc ins bodies organization that was removed
	 */
	public static AccInsBodiesOrganization removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc ins bodies organizations where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc ins bodies organizations
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc ins bodies organization in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesOrganization the acc ins bodies organization
	 */
	public static void cacheResult(
		AccInsBodiesOrganization accInsBodiesOrganization) {

		getPersistence().cacheResult(accInsBodiesOrganization);
	}

	/**
	 * Caches the acc ins bodies organizations in the entity cache if it is enabled.
	 *
	 * @param accInsBodiesOrganizations the acc ins bodies organizations
	 */
	public static void cacheResult(
		List<AccInsBodiesOrganization> accInsBodiesOrganizations) {

		getPersistence().cacheResult(accInsBodiesOrganizations);
	}

	/**
	 * Creates a new acc ins bodies organization with the primary key. Does not add the acc ins bodies organization to the database.
	 *
	 * @param accInsBodiesOrganizationId the primary key for the new acc ins bodies organization
	 * @return the new acc ins bodies organization
	 */
	public static AccInsBodiesOrganization create(
		long accInsBodiesOrganizationId) {

		return getPersistence().create(accInsBodiesOrganizationId);
	}

	/**
	 * Removes the acc ins bodies organization with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization that was removed
	 * @throws NoSuchAccInsBodiesOrganizationException if a acc ins bodies organization with the primary key could not be found
	 */
	public static AccInsBodiesOrganization remove(
			long accInsBodiesOrganizationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().remove(accInsBodiesOrganizationId);
	}

	public static AccInsBodiesOrganization updateImpl(
		AccInsBodiesOrganization accInsBodiesOrganization) {

		return getPersistence().updateImpl(accInsBodiesOrganization);
	}

	/**
	 * Returns the acc ins bodies organization with the primary key or throws a <code>NoSuchAccInsBodiesOrganizationException</code> if it could not be found.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization
	 * @throws NoSuchAccInsBodiesOrganizationException if a acc ins bodies organization with the primary key could not be found
	 */
	public static AccInsBodiesOrganization findByPrimaryKey(
			long accInsBodiesOrganizationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccInsBodiesOrganizationException {

		return getPersistence().findByPrimaryKey(accInsBodiesOrganizationId);
	}

	/**
	 * Returns the acc ins bodies organization with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accInsBodiesOrganizationId the primary key of the acc ins bodies organization
	 * @return the acc ins bodies organization, or <code>null</code> if a acc ins bodies organization with the primary key could not be found
	 */
	public static AccInsBodiesOrganization fetchByPrimaryKey(
		long accInsBodiesOrganizationId) {

		return getPersistence().fetchByPrimaryKey(accInsBodiesOrganizationId);
	}

	/**
	 * Returns all the acc ins bodies organizations.
	 *
	 * @return the acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc ins bodies organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @return the range of acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findAll(
		int start, int end,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc ins bodies organizations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccInsBodiesOrganizationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc ins bodies organizations
	 * @param end the upper bound of the range of acc ins bodies organizations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc ins bodies organizations
	 */
	public static List<AccInsBodiesOrganization> findAll(
		int start, int end,
		OrderByComparator<AccInsBodiesOrganization> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc ins bodies organizations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc ins bodies organizations.
	 *
	 * @return the number of acc ins bodies organizations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccInsBodiesOrganizationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccInsBodiesOrganizationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccInsBodiesOrganizationPersistence _persistence;

}