/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.application.form.service.model.AccCerBodyPersonnel;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acc cer body personnel service. This utility wraps <code>com.nbp.janaac.application.form.service.service.persistence.impl.AccCerBodyPersonnelPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccCerBodyPersonnelPersistence
 * @generated
 */
public class AccCerBodyPersonnelUtil {

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
	public static void clearCache(AccCerBodyPersonnel accCerBodyPersonnel) {
		getPersistence().clearCache(accCerBodyPersonnel);
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
	public static Map<Serializable, AccCerBodyPersonnel> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AccCerBodyPersonnel> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AccCerBodyPersonnel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AccCerBodyPersonnel> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AccCerBodyPersonnel> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AccCerBodyPersonnel update(
		AccCerBodyPersonnel accCerBodyPersonnel) {

		return getPersistence().update(accCerBodyPersonnel);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AccCerBodyPersonnel update(
		AccCerBodyPersonnel accCerBodyPersonnel,
		ServiceContext serviceContext) {

		return getPersistence().update(accCerBodyPersonnel, serviceContext);
	}

	/**
	 * Returns all the acc cer body personnels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the acc cer body personnels where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @return the range of matching acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the acc cer body personnels where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccCerBodyPersonnel> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc cer body personnels where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AccCerBodyPersonnel> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel findByUuid_First(
			String uuid,
			OrderByComparator<AccCerBodyPersonnel> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel fetchByUuid_First(
		String uuid, OrderByComparator<AccCerBodyPersonnel> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel findByUuid_Last(
			String uuid,
			OrderByComparator<AccCerBodyPersonnel> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel fetchByUuid_Last(
		String uuid, OrderByComparator<AccCerBodyPersonnel> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the acc cer body personnels before and after the current acc cer body personnel in the ordered set where uuid = &#63;.
	 *
	 * @param accCerBodyPersonnelId the primary key of the current acc cer body personnel
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a acc cer body personnel with the primary key could not be found
	 */
	public static AccCerBodyPersonnel[] findByUuid_PrevAndNext(
			long accCerBodyPersonnelId, String uuid,
			OrderByComparator<AccCerBodyPersonnel> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().findByUuid_PrevAndNext(
			accCerBodyPersonnelId, uuid, orderByComparator);
	}

	/**
	 * Removes all the acc cer body personnels where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of acc cer body personnels where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acc cer body personnels
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the acc cer body personnel where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAccCerBodyPersonnelException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel findByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc cer body personnel where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the acc cer body personnel where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the acc cer body personnel where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acc cer body personnel that was removed
	 */
	public static AccCerBodyPersonnel removeByUUID_G(String uuid, long groupId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of acc cer body personnels where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acc cer body personnels
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @return the range of matching acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccCerBodyPersonnel> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AccCerBodyPersonnel> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AccCerBodyPersonnel> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AccCerBodyPersonnel> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AccCerBodyPersonnel> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AccCerBodyPersonnel> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the acc cer body personnels before and after the current acc cer body personnel in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param accCerBodyPersonnelId the primary key of the current acc cer body personnel
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a acc cer body personnel with the primary key could not be found
	 */
	public static AccCerBodyPersonnel[] findByUuid_C_PrevAndNext(
			long accCerBodyPersonnelId, String uuid, long companyId,
			OrderByComparator<AccCerBodyPersonnel> orderByComparator)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().findByUuid_C_PrevAndNext(
			accCerBodyPersonnelId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the acc cer body personnels where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of acc cer body personnels where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acc cer body personnels
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the acc cer body personnel where janaacApplicationId = &#63; or throws a <code>NoSuchAccCerBodyPersonnelException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel findBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().findBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc cer body personnel where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the acc cer body personnel where janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acc cer body personnel, or <code>null</code> if a matching acc cer body personnel could not be found
	 */
	public static AccCerBodyPersonnel fetchBygetJANAAC_ByApplicationId(
		long janaacApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJANAAC_ByApplicationId(
			janaacApplicationId, useFinderCache);
	}

	/**
	 * Removes the acc cer body personnel where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the acc cer body personnel that was removed
	 */
	public static AccCerBodyPersonnel removeBygetJANAAC_ByApplicationId(
			long janaacApplicationId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().removeBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the number of acc cer body personnels where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching acc cer body personnels
	 */
	public static int countBygetJANAAC_ByApplicationId(
		long janaacApplicationId) {

		return getPersistence().countBygetJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Caches the acc cer body personnel in the entity cache if it is enabled.
	 *
	 * @param accCerBodyPersonnel the acc cer body personnel
	 */
	public static void cacheResult(AccCerBodyPersonnel accCerBodyPersonnel) {
		getPersistence().cacheResult(accCerBodyPersonnel);
	}

	/**
	 * Caches the acc cer body personnels in the entity cache if it is enabled.
	 *
	 * @param accCerBodyPersonnels the acc cer body personnels
	 */
	public static void cacheResult(
		List<AccCerBodyPersonnel> accCerBodyPersonnels) {

		getPersistence().cacheResult(accCerBodyPersonnels);
	}

	/**
	 * Creates a new acc cer body personnel with the primary key. Does not add the acc cer body personnel to the database.
	 *
	 * @param accCerBodyPersonnelId the primary key for the new acc cer body personnel
	 * @return the new acc cer body personnel
	 */
	public static AccCerBodyPersonnel create(long accCerBodyPersonnelId) {
		return getPersistence().create(accCerBodyPersonnelId);
	}

	/**
	 * Removes the acc cer body personnel with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param accCerBodyPersonnelId the primary key of the acc cer body personnel
	 * @return the acc cer body personnel that was removed
	 * @throws NoSuchAccCerBodyPersonnelException if a acc cer body personnel with the primary key could not be found
	 */
	public static AccCerBodyPersonnel remove(long accCerBodyPersonnelId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().remove(accCerBodyPersonnelId);
	}

	public static AccCerBodyPersonnel updateImpl(
		AccCerBodyPersonnel accCerBodyPersonnel) {

		return getPersistence().updateImpl(accCerBodyPersonnel);
	}

	/**
	 * Returns the acc cer body personnel with the primary key or throws a <code>NoSuchAccCerBodyPersonnelException</code> if it could not be found.
	 *
	 * @param accCerBodyPersonnelId the primary key of the acc cer body personnel
	 * @return the acc cer body personnel
	 * @throws NoSuchAccCerBodyPersonnelException if a acc cer body personnel with the primary key could not be found
	 */
	public static AccCerBodyPersonnel findByPrimaryKey(
			long accCerBodyPersonnelId)
		throws com.nbp.janaac.application.form.service.exception.
			NoSuchAccCerBodyPersonnelException {

		return getPersistence().findByPrimaryKey(accCerBodyPersonnelId);
	}

	/**
	 * Returns the acc cer body personnel with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param accCerBodyPersonnelId the primary key of the acc cer body personnel
	 * @return the acc cer body personnel, or <code>null</code> if a acc cer body personnel with the primary key could not be found
	 */
	public static AccCerBodyPersonnel fetchByPrimaryKey(
		long accCerBodyPersonnelId) {

		return getPersistence().fetchByPrimaryKey(accCerBodyPersonnelId);
	}

	/**
	 * Returns all the acc cer body personnels.
	 *
	 * @return the acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acc cer body personnels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @return the range of acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acc cer body personnels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findAll(
		int start, int end,
		OrderByComparator<AccCerBodyPersonnel> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acc cer body personnels.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AccCerBodyPersonnelModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acc cer body personnels
	 * @param end the upper bound of the range of acc cer body personnels (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acc cer body personnels
	 */
	public static List<AccCerBodyPersonnel> findAll(
		int start, int end,
		OrderByComparator<AccCerBodyPersonnel> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acc cer body personnels from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acc cer body personnels.
	 *
	 * @return the number of acc cer body personnels
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AccCerBodyPersonnelPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AccCerBodyPersonnelPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AccCerBodyPersonnelPersistence _persistence;

}