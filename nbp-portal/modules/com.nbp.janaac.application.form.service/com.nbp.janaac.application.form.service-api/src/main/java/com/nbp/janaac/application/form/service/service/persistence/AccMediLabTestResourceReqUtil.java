/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccMediLabTestResourceReq;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc medi lab test resource req service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccMediLabTestResourceReqPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabTestResourceReqPersistence
 * @generated
 */
public class AccMediLabTestResourceReqUtil {

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
		AccMediLabTestResourceReq accMediLabTestResourceReq) {

		getPersistence().clearCache(accMediLabTestResourceReq);
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
	public static Map<Serializable, AccMediLabTestResourceReq>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccMediLabTestResourceReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccMediLabTestResourceReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccMediLabTestResourceReq> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccMediLabTestResourceReq update(
		AccMediLabTestResourceReq accMediLabTestResourceReq) {

		return getPersistence().update(accMediLabTestResourceReq);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccMediLabTestResourceReq update(
		AccMediLabTestResourceReq accMediLabTestResourceReq,
		ServiceContext serviceContext) {

		return getPersistence().update(
			accMediLabTestResourceReq, serviceContext);
	}

	/**
	 * Returns all the acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @return the range of matching acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq findByUuid_First(
			String uuid,
			OrderByComparator<AccMediLabTestResourceReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq fetchByUuid_First(
		String uuid,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq findByUuid_Last(
			String uuid,
			OrderByComparator<AccMediLabTestResourceReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq fetchByUuid_Last(
		String uuid,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc medi lab test resource reqs before and after the current acc medi lab test resource req in the ordered set where uuid = &#63;.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the current acc medi lab test resource req
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a acc medi lab test resource req with the primary key could not be found
	 */
	public static AccMediLabTestResourceReq[] findByUuid_PrevAndNext(
			long accMediLabTestResourceReqId, String uuid,
			OrderByComparator<AccMediLabTestResourceReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().findByUuid_PrevAndNext(
			accMediLabTestResourceReqId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc medi lab test resource reqs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc medi lab test resource reqs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc medi lab test resource reqs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc medi lab test resource req where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccMediLabTestResourceReqException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab test resource req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc medi lab test resource req where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc medi lab test resource req where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc medi lab test resource req that was removed
	 */
	public static AccMediLabTestResourceReq removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc medi lab test resource reqs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc medi lab test resource reqs
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @return the range of matching acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccMediLabTestResourceReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccMediLabTestResourceReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc medi lab test resource reqs before and after the current acc medi lab test resource req in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the current acc medi lab test resource req
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a acc medi lab test resource req with the primary key could not be found
	 */
	public static AccMediLabTestResourceReq[] findByUuid_C_PrevAndNext(
			long accMediLabTestResourceReqId, String uuid, long companyId,
			OrderByComparator<AccMediLabTestResourceReq> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accMediLabTestResourceReqId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc medi lab test resource reqs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc medi lab test resource reqs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc medi lab test resource reqs
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc medi lab test resource req where janaacApplicationId = &#63; or throws a <code>NoSuchAccMediLabTestResourceReqException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc medi lab test resource req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc medi lab test resource req where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc medi lab test resource req, or <code>null</code> if a matching acc medi lab test resource req could not be found
	 */
	public static AccMediLabTestResourceReq fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc medi lab test resource req where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc medi lab test resource req that was removed
	 */
	public static AccMediLabTestResourceReq removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc medi lab test resource reqs where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc medi lab test resource reqs
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc medi lab test resource req in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestResourceReq the acc medi lab test resource req
	 */
	public static void cacheResult(
		AccMediLabTestResourceReq accMediLabTestResourceReq) {

		getPersistence().cacheResult(accMediLabTestResourceReq);
	}

	/**
	 * Caches the acc medi lab test resource reqs in the entity cache if it is enabled.
	 *
	 * @param accMediLabTestResourceReqs the acc medi lab test resource reqs
	 */
	public static void cacheResult(
		List<AccMediLabTestResourceReq> accMediLabTestResourceReqs) {

		getPersistence().cacheResult(accMediLabTestResourceReqs);
	}

	/**
	 * Creates a new acc medi lab test resource req with the primary key. Does not add the acc medi lab test resource req to the database.
	 *
	 * @param accMediLabTestResourceReqId the primary key for the new acc medi lab test resource req
	 * @return the new acc medi lab test resource req
	 */
	public static AccMediLabTestResourceReq create(
		long accMediLabTestResourceReqId) {

		return getPersistence().create(accMediLabTestResourceReqId);
	}

	/**
	 * Removes the acc medi lab test resource req with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the acc medi lab test resource req
	 * @return the acc medi lab test resource req that was removed
	 * @throws NoSuchAccMediLabTestResourceReqException if a acc medi lab test resource req with the primary key could not be found
	 */
	public static AccMediLabTestResourceReq remove(
			long accMediLabTestResourceReqId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().remove(accMediLabTestResourceReqId);
	}

	public static AccMediLabTestResourceReq updateImpl(
		AccMediLabTestResourceReq accMediLabTestResourceReq) {

		return getPersistence().updateImpl(accMediLabTestResourceReq);
	}

	/**
	 * Returns the acc medi lab test resource req with the primary key or throws a <code>NoSuchAccMediLabTestResourceReqException</code> if it could not be found.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the acc medi lab test resource req
	 * @return the acc medi lab test resource req
	 * @throws NoSuchAccMediLabTestResourceReqException if a acc medi lab test resource req with the primary key could not be found
	 */
	public static AccMediLabTestResourceReq findByPrimaryKey(
			long accMediLabTestResourceReqId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccMediLabTestResourceReqException {

		return getPersistence().findByPrimaryKey(accMediLabTestResourceReqId);
	}

	/**
	 * Returns the acc medi lab test resource req with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accMediLabTestResourceReqId the primary key of the acc medi lab test resource req
	 * @return the acc medi lab test resource req, or <code>null</code> if a acc medi lab test resource req with the primary key could not be found
	 */
	public static AccMediLabTestResourceReq fetchByPrimaryKey(
		long accMediLabTestResourceReqId) {

		return getPersistence().fetchByPrimaryKey(accMediLabTestResourceReqId);
	}

	/**
	 * Returns all the acc medi lab test resource reqs.
	 *
	 * @return the acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc medi lab test resource reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @return the range of acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findAll(
		int start, int end,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc medi lab test resource reqs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccMediLabTestResourceReqModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc medi lab test resource reqs
	 * @param end the upper bound of the range of acc medi lab test resource reqs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc medi lab test resource reqs
	 */
	public static List<AccMediLabTestResourceReq> findAll(
		int start, int end,
		OrderByComparator<AccMediLabTestResourceReq> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc medi lab test resource reqs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc medi lab test resource reqs.
	 *
	 * @return the number of acc medi lab test resource reqs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccMediLabTestResourceReqPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccMediLabTestResourceReqPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccMediLabTestResourceReqPersistence _persistence;

}