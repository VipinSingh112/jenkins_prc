/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccCerBodyManageReq;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc cer body manage req service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccCerBodyManageReqPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyManageReqPersistence
 * @generated
 */
public class AccCerBodyManageReqUtil {

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
	public static void clearCache(AccCerBodyManageReq accCerBodyManageReq) {
		getPersistence().clearCache(accCerBodyManageReq);
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
	public static Map<Serializable, AccCerBodyManageReq> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccCerBodyManageReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccCerBodyManageReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccCerBodyManageReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccCerBodyManageReq update(
		AccCerBodyManageReq accCerBodyManageReq) {

		return getPersistence().update(accCerBodyManageReq);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccCerBodyManageReq update(
		AccCerBodyManageReq accCerBodyManageReq,
		ServiceContext serviceContext) {

		return getPersistence().update(accCerBodyManageReq, serviceContext);
	}

	/**
	 * Returns all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of matching acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq findByUuid_First(
			String uuid,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq fetchByUuid_First(
		String uuid, OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq findByUuid_Last(
			String uuid,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq fetchByUuid_Last(
		String uuid, OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc cer body manage reqs before and after the current acc cer body manage req in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyManageReqId the primary key of the current acc cer body manage req
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	public static AccCerBodyManageReq[] findByUuid_PrevAndNext(
			long accCerBodyManageReqId, String uuid,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().findByUuid_PrevAndNext(
			accCerBodyManageReqId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc cer body manage reqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc cer body manage reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body manage reqs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc cer body manage req where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyManageReqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq findByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc cer body manage req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc cer body manage req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc cer body manage req where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body manage req that was removed
	 */
	public static AccCerBodyManageReq removeByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc cer body manage reqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body manage reqs
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of matching acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc cer body manage reqs before and after the current acc cer body manage req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyManageReqId the primary key of the current acc cer body manage req
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	public static AccCerBodyManageReq[] findByUuid_C_PrevAndNext(
			long accCerBodyManageReqId, String uuid, long companyId,
			OrderByComparator<AccCerBodyManageReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accCerBodyManageReqId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc cer body manage reqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc cer body manage reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body manage reqs
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc cer body manage req where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyManageReqException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc cer body manage req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc cer body manage req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body manage req, or <code>null</code> if a matching acc cer body manage req could not be found
	 */
	public static AccCerBodyManageReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc cer body manage req where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body manage req that was removed
	 */
	public static AccCerBodyManageReq removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc cer body manage reqs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body manage reqs
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc cer body manage req in the entity cache if it is enabled.
	 *
	 * @param accCerBodyManageReq the acc cer body manage req
	 */
	public static void cacheResult(AccCerBodyManageReq accCerBodyManageReq) {
		getPersistence().cacheResult(accCerBodyManageReq);
	}

	/**
	 * Caches the acc cer body manage reqs in the entity cache if it is enabled.
	 *
	 * @param accCerBodyManageReqs the acc cer body manage reqs
	 */
	public static void cacheResult(
		List<AccCerBodyManageReq> accCerBodyManageReqs) {

		getPersistence().cacheResult(accCerBodyManageReqs);
	}

	/**
	 * Creates a new acc cer body manage req with the primary key. Does not add the acc cer body manage req to the database.
	 *
	 * @param accCerBodyManageReqId the primary key for the new acc cer body manage req
	 * @return the new acc cer body manage req
	 */
	public static AccCerBodyManageReq create(long accCerBodyManageReqId) {
		return getPersistence().create(accCerBodyManageReqId);
	}

	/**
	 * Removes the acc cer body manage req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req that was removed
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	public static AccCerBodyManageReq remove(long accCerBodyManageReqId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().remove(accCerBodyManageReqId);
	}

	public static AccCerBodyManageReq updateImpl(
		AccCerBodyManageReq accCerBodyManageReq) {

		return getPersistence().updateImpl(accCerBodyManageReq);
	}

	/**
	 * Returns the acc cer body manage req with the primary key or throws a <code>NoSuchAccCerBodyManageReqException</code> if it could not be found.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req
	 * @throws NoSuchAccCerBodyManageReqException if a acc cer body manage req with the primary key could not be found
	 */
	public static AccCerBodyManageReq findByPrimaryKey(
			long accCerBodyManageReqId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyManageReqException {

		return getPersistence().findByPrimaryKey(accCerBodyManageReqId);
	}

	/**
	 * Returns the acc cer body manage req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyManageReqId the primary key of the acc cer body manage req
	 * @return the acc cer body manage req, or <code>null</code> if a acc cer body manage req with the primary key could not be found
	 */
	public static AccCerBodyManageReq fetchByPrimaryKey(
		long accCerBodyManageReqId) {

		return getPersistence().fetchByPrimaryKey(accCerBodyManageReqId);
	}

	/**
	 * Returns all the acc cer body manage reqs.
	 *
	 * @return the acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @return the range of acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findAll(
		int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc cer body manage reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyManageReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body manage reqs
	 * @param end the upper bound of the range of acc cer body manage reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body manage reqs
	 */
	public static List<AccCerBodyManageReq> findAll(
		int start, int end,
		OrderByComparator<AccCerBodyManageReq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc cer body manage reqs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc cer body manage reqs.
	 *
	 * @return the number of acc cer body manage reqs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccCerBodyManageReqPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccCerBodyManageReqPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccCerBodyManageReqPersistence _persistence;

}