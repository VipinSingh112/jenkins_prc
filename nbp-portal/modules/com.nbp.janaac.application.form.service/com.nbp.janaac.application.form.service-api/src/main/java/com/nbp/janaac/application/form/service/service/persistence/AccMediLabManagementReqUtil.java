/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccMediLabManagementReq;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc medi lab management req service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccMediLabManagementReqPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabManagementReqPersistence
 * @generated
 */
public class AccMediLabManagementReqUtil {

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
		AccMediLabManagementReq accMediLabManagementReq) {

		getPersistence().clearCache(accMediLabManagementReq);
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
	public static Map<Serializable, AccMediLabManagementReq> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccMediLabManagementReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccMediLabManagementReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccMediLabManagementReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccMediLabManagementReq> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccMediLabManagementReq update(
		AccMediLabManagementReq accMediLabManagementReq) {

		return getPersistence().update(accMediLabManagementReq);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccMediLabManagementReq update(
		AccMediLabManagementReq accMediLabManagementReq,
		ServiceContext serviceContext) {

		return getPersistence().update(accMediLabManagementReq, serviceContext);
	}

	/**
	 * Returns all the acc medi lab management reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc medi lab management reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @return the range of matching acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab management reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabManagementReq> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab management reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabManagementReq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc medi lab management req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab management req
	 * @throws NoSuchAccMediLabManagementReqException if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq findByUuid_First(
			String uuid,
			OrderByComparator<AccMediLabManagementReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc medi lab management req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq fetchByUuid_First(
		String uuid,
		OrderByComparator<AccMediLabManagementReq> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab management req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab management req
	 * @throws NoSuchAccMediLabManagementReqException if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq findByUuid_Last(
			String uuid,
			OrderByComparator<AccMediLabManagementReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab management req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq fetchByUuid_Last(
		String uuid,
		OrderByComparator<AccMediLabManagementReq> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc medi lab management reqs before and after the current acc medi lab management req in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabManagementReqId the primary key of the current acc medi lab management req
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab management req
	 * @throws NoSuchAccMediLabManagementReqException if a acc medi lab management req with the primary key could not be found
	 */
	public static AccMediLabManagementReq[] findByUuid_PrevAndNext(
			long accMediLabManagementReqId, String uuid,
			OrderByComparator<AccMediLabManagementReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().findByUuid_PrevAndNext(
			accMediLabManagementReqId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc medi lab management reqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc medi lab management reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab management reqs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc medi lab management req where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabManagementReqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab management req
	 * @throws NoSuchAccMediLabManagementReqException if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab management req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab management req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc medi lab management req where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab management req that was removed
	 */
	public static AccMediLabManagementReq removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc medi lab management reqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab management reqs
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc medi lab management reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc medi lab management reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @return the range of matching acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab management reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabManagementReq> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab management reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabManagementReq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc medi lab management req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab management req
	 * @throws NoSuchAccMediLabManagementReqException if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccMediLabManagementReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc medi lab management req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccMediLabManagementReq> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab management req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab management req
	 * @throws NoSuchAccMediLabManagementReqException if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccMediLabManagementReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab management req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccMediLabManagementReq> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc medi lab management reqs before and after the current acc medi lab management req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabManagementReqId the primary key of the current acc medi lab management req
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab management req
	 * @throws NoSuchAccMediLabManagementReqException if a acc medi lab management req with the primary key could not be found
	 */
	public static AccMediLabManagementReq[] findByUuid_C_PrevAndNext(
			long accMediLabManagementReqId, String uuid, long companyId,
			OrderByComparator<AccMediLabManagementReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accMediLabManagementReqId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc medi lab management reqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc medi lab management reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab management reqs
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc medi lab management req where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabManagementReqException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab management req
	 * @throws NoSuchAccMediLabManagementReqException if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc medi lab management req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc medi lab management req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab management req, or <code>null</code> if a matching acc medi lab management req could not be found
	 */
	public static AccMediLabManagementReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc medi lab management req where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab management req that was removed
	 */
	public static AccMediLabManagementReq removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc medi lab management reqs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab management reqs
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc medi lab management req in the entity cache if it is enabled.
	 *
	 * @param accMediLabManagementReq the acc medi lab management req
	 */
	public static void cacheResult(
		AccMediLabManagementReq accMediLabManagementReq) {

		getPersistence().cacheResult(accMediLabManagementReq);
	}

	/**
	 * Caches the acc medi lab management reqs in the entity cache if it is enabled.
	 *
	 * @param accMediLabManagementReqs the acc medi lab management reqs
	 */
	public static void cacheResult(
		List<AccMediLabManagementReq> accMediLabManagementReqs) {

		getPersistence().cacheResult(accMediLabManagementReqs);
	}

	/**
	 * Creates a new acc medi lab management req with the primary key. Does not add the acc medi lab management req to the database.
	 *
	 * @param accMediLabManagementReqId the primary key for the new acc medi lab management req
	 * @return the new acc medi lab management req
	 */
	public static AccMediLabManagementReq create(
		long accMediLabManagementReqId) {

		return getPersistence().create(accMediLabManagementReqId);
	}

	/**
	 * Removes the acc medi lab management req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabManagementReqId the primary key of the acc medi lab management req
	 * @return the acc medi lab management req that was removed
	 * @throws NoSuchAccMediLabManagementReqException if a acc medi lab management req with the primary key could not be found
	 */
	public static AccMediLabManagementReq remove(long accMediLabManagementReqId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().remove(accMediLabManagementReqId);
	}

	public static AccMediLabManagementReq updateImpl(
		AccMediLabManagementReq accMediLabManagementReq) {

		return getPersistence().updateImpl(accMediLabManagementReq);
	}

	/**
	 * Returns the acc medi lab management req with the primary key or throws a <code>NoSuchAccMediLabManagementReqException</code> if it could not be found.
	 *
	 * @param accMediLabManagementReqId the primary key of the acc medi lab management req
	 * @return the acc medi lab management req
	 * @throws NoSuchAccMediLabManagementReqException if a acc medi lab management req with the primary key could not be found
	 */
	public static AccMediLabManagementReq findByPrimaryKey(
			long accMediLabManagementReqId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabManagementReqException {

		return getPersistence().findByPrimaryKey(accMediLabManagementReqId);
	}

	/**
	 * Returns the acc medi lab management req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabManagementReqId the primary key of the acc medi lab management req
	 * @return the acc medi lab management req, or <code>null</code> if a acc medi lab management req with the primary key could not be found
	 */
	public static AccMediLabManagementReq fetchByPrimaryKey(
		long accMediLabManagementReqId) {

		return getPersistence().fetchByPrimaryKey(accMediLabManagementReqId);
	}

	/**
	 * Returns all the acc medi lab management reqs.
	 *
	 * @return the acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc medi lab management reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @return the range of acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab management reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findAll(
		int start, int end,
		OrderByComparator<AccMediLabManagementReq> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab management reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabManagementReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab management reqs
	 * @param end the upper bound of the range of acc medi lab management reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab management reqs
	 */
	public static List<AccMediLabManagementReq> findAll(
		int start, int end,
		OrderByComparator<AccMediLabManagementReq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc medi lab management reqs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc medi lab management reqs.
	 *
	 * @return the number of acc medi lab management reqs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccMediLabManagementReqPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccMediLabManagementReqPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccMediLabManagementReqPersistence _persistence;

}