/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccThirdPartyScope;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc third party scope service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccThirdPartyScopePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyScopePersistence
 * @generated
 */
public class AccThirdPartyScopeUtil {

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
	public static void clearCache(AccThirdPartyScope accThirdPartyScope) {
		getPersistence().clearCache(accThirdPartyScope);
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
	public static Map<Serializable, AccThirdPartyScope> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccThirdPartyScope> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccThirdPartyScope> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccThirdPartyScope> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccThirdPartyScope> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccThirdPartyScope update(
		AccThirdPartyScope accThirdPartyScope) {

		return getPersistence().update(accThirdPartyScope);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccThirdPartyScope update(
		AccThirdPartyScope accThirdPartyScope, ServiceContext serviceContext) {

		return getPersistence().update(accThirdPartyScope, serviceContext);
	}

	/**
	 * Returns all the acc third party scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc third party scopes
	 */
	public static List<AccThirdPartyScope> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc third party scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @return the range of matching acc third party scopes
	 */
	public static List<AccThirdPartyScope> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc third party scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc third party scopes
	 */
	public static List<AccThirdPartyScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccThirdPartyScope> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc third party scopes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc third party scopes
	 */
	public static List<AccThirdPartyScope> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccThirdPartyScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope findByUuid_First(
			String uuid,
			OrderByComparator<AccThirdPartyScope> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope fetchByUuid_First(
		String uuid, OrderByComparator<AccThirdPartyScope> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope findByUuid_Last(
			String uuid,
			OrderByComparator<AccThirdPartyScope> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope fetchByUuid_Last(
		String uuid, OrderByComparator<AccThirdPartyScope> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc third party scopes before and after the current acc third party scope in the ordered set where uuid = &#63;.
	 *
	 * @param accThirdPartyScopeId the primary key of the current acc third party scope
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a acc third party scope with the primary key could not be found
	 */
	public static AccThirdPartyScope[] findByUuid_PrevAndNext(
			long accThirdPartyScopeId, String uuid,
			OrderByComparator<AccThirdPartyScope> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().findByUuid_PrevAndNext(
			accThirdPartyScopeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc third party scopes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc third party scopes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc third party scopes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc third party scope where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccThirdPartyScopeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope findByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc third party scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc third party scope where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc third party scope where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc third party scope that was removed
	 */
	public static AccThirdPartyScope removeByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc third party scopes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc third party scopes
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc third party scopes
	 */
	public static List<AccThirdPartyScope> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @return the range of matching acc third party scopes
	 */
	public static List<AccThirdPartyScope> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc third party scopes
	 */
	public static List<AccThirdPartyScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccThirdPartyScope> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc third party scopes
	 */
	public static List<AccThirdPartyScope> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccThirdPartyScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccThirdPartyScope> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccThirdPartyScope> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccThirdPartyScope> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccThirdPartyScope> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc third party scopes before and after the current acc third party scope in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accThirdPartyScopeId the primary key of the current acc third party scope
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a acc third party scope with the primary key could not be found
	 */
	public static AccThirdPartyScope[] findByUuid_C_PrevAndNext(
			long accThirdPartyScopeId, String uuid, long companyId,
			OrderByComparator<AccThirdPartyScope> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accThirdPartyScopeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc third party scopes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc third party scopes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc third party scopes
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc third party scope where janaacApplicationId = &#63; or throws a <code>NoSuchAccThirdPartyScopeException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc third party scope where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc third party scope where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc third party scope, or <code>null</code> if a matching acc third party scope could not be found
	 */
	public static AccThirdPartyScope fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc third party scope where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc third party scope that was removed
	 */
	public static AccThirdPartyScope removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc third party scopes where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc third party scopes
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc third party scope in the entity cache if it is enabled.
	 *
	 * @param accThirdPartyScope the acc third party scope
	 */
	public static void cacheResult(AccThirdPartyScope accThirdPartyScope) {
		getPersistence().cacheResult(accThirdPartyScope);
	}

	/**
	 * Caches the acc third party scopes in the entity cache if it is enabled.
	 *
	 * @param accThirdPartyScopes the acc third party scopes
	 */
	public static void cacheResult(
		List<AccThirdPartyScope> accThirdPartyScopes) {

		getPersistence().cacheResult(accThirdPartyScopes);
	}

	/**
	 * Creates a new acc third party scope with the primary key. Does not add the acc third party scope to the database.
	 *
	 * @param accThirdPartyScopeId the primary key for the new acc third party scope
	 * @return the new acc third party scope
	 */
	public static AccThirdPartyScope create(long accThirdPartyScopeId) {
		return getPersistence().create(accThirdPartyScopeId);
	}

	/**
	 * Removes the acc third party scope with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accThirdPartyScopeId the primary key of the acc third party scope
	 * @return the acc third party scope that was removed
	 * @throws NoSuchAccThirdPartyScopeException if a acc third party scope with the primary key could not be found
	 */
	public static AccThirdPartyScope remove(long accThirdPartyScopeId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().remove(accThirdPartyScopeId);
	}

	public static AccThirdPartyScope updateImpl(
		AccThirdPartyScope accThirdPartyScope) {

		return getPersistence().updateImpl(accThirdPartyScope);
	}

	/**
	 * Returns the acc third party scope with the primary key or throws a <code>NoSuchAccThirdPartyScopeException</code> if it could not be found.
	 *
	 * @param accThirdPartyScopeId the primary key of the acc third party scope
	 * @return the acc third party scope
	 * @throws NoSuchAccThirdPartyScopeException if a acc third party scope with the primary key could not be found
	 */
	public static AccThirdPartyScope findByPrimaryKey(long accThirdPartyScopeId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccThirdPartyScopeException {

		return getPersistence().findByPrimaryKey(accThirdPartyScopeId);
	}

	/**
	 * Returns the acc third party scope with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accThirdPartyScopeId the primary key of the acc third party scope
	 * @return the acc third party scope, or <code>null</code> if a acc third party scope with the primary key could not be found
	 */
	public static AccThirdPartyScope fetchByPrimaryKey(
		long accThirdPartyScopeId) {

		return getPersistence().fetchByPrimaryKey(accThirdPartyScopeId);
	}

	/**
	 * Returns all the acc third party scopes.
	 *
	 * @return the acc third party scopes
	 */
	public static List<AccThirdPartyScope> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc third party scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @return the range of acc third party scopes
	 */
	public static List<AccThirdPartyScope> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc third party scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc third party scopes
	 */
	public static List<AccThirdPartyScope> findAll(
		int start, int end,
		OrderByComparator<AccThirdPartyScope> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc third party scopes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccThirdPartyScopeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc third party scopes
	 * @param end the upper bound of the range of acc third party scopes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc third party scopes
	 */
	public static List<AccThirdPartyScope> findAll(
		int start, int end,
		OrderByComparator<AccThirdPartyScope> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc third party scopes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc third party scopes.
	 *
	 * @return the number of acc third party scopes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccThirdPartyScopePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccThirdPartyScopePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccThirdPartyScopePersistence _persistence;

}