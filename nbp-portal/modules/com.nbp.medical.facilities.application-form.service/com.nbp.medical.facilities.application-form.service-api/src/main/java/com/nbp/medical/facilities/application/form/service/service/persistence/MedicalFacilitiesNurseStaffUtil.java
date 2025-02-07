/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseStaff;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical facilities nurse staff service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalFacilitiesNurseStaffPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseStaffPersistence
 * @generated
 */
public class MedicalFacilitiesNurseStaffUtil {

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
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		getPersistence().clearCache(medicalFacilitiesNurseStaff);
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
	public static Map<Serializable, MedicalFacilitiesNurseStaff>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalFacilitiesNurseStaff> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalFacilitiesNurseStaff> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalFacilitiesNurseStaff> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalFacilitiesNurseStaff update(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return getPersistence().update(medicalFacilitiesNurseStaff);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalFacilitiesNurseStaff update(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalFacilitiesNurseStaff, serviceContext);
	}

	/**
	 * Returns all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the medical facilities nurse staffs before and after the current medical facilities nurse staff in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the current medical facilities nurse staff
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseStaff[] findByUuid_PrevAndNext(
			long medicalFacilitiesNurseStaffId, String uuid,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findByUuid_PrevAndNext(
			medicalFacilitiesNurseStaffId, uuid, orderByComparator);
	}

	/**
	 * Removes all the medical facilities nurse staffs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of medical facilities nurse staffs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities nurse staffs
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the medical facilities nurse staff where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesNurseStaffException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities nurse staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities nurse staff where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the medical facilities nurse staff where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities nurse staff that was removed
	 */
	public static MedicalFacilitiesNurseStaff removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of medical facilities nurse staffs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities nurse staffs
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the medical facilities nurse staffs before and after the current medical facilities nurse staff in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the current medical facilities nurse staff
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseStaff[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesNurseStaffId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findByUuid_C_PrevAndNext(
			medicalFacilitiesNurseStaffId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities nurse staffs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of medical facilities nurse staffs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities nurse staffs
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff
			findBygetMedicalFacilitiesById_First(
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesNurseStaff>
					orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff
		fetchBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff
			findBygetMedicalFacilitiesById_Last(
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesNurseStaff>
					orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	public static MedicalFacilitiesNurseStaff
		fetchBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the medical facilities nurse staffs before and after the current medical facilities nurse staff in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the current medical facilities nurse staff
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseStaff[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesNurseStaffId, long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesNurseStaff>
					orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findBygetMedicalFacilitiesById_PrevAndNext(
			medicalFacilitiesNurseStaffId, medicalFacilitiesAppId,
			orderByComparator);
	}

	/**
	 * Removes all the medical facilities nurse staffs where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public static void removeBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		getPersistence().removeBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical facilities nurse staffs where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities nurse staffs
	 */
	public static int countBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return getPersistence().countBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Caches the medical facilities nurse staff in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 */
	public static void cacheResult(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		getPersistence().cacheResult(medicalFacilitiesNurseStaff);
	}

	/**
	 * Caches the medical facilities nurse staffs in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseStaffs the medical facilities nurse staffs
	 */
	public static void cacheResult(
		List<MedicalFacilitiesNurseStaff> medicalFacilitiesNurseStaffs) {

		getPersistence().cacheResult(medicalFacilitiesNurseStaffs);
	}

	/**
	 * Creates a new medical facilities nurse staff with the primary key. Does not add the medical facilities nurse staff to the database.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key for the new medical facilities nurse staff
	 * @return the new medical facilities nurse staff
	 */
	public static MedicalFacilitiesNurseStaff create(
		long medicalFacilitiesNurseStaffId) {

		return getPersistence().create(medicalFacilitiesNurseStaffId);
	}

	/**
	 * Removes the medical facilities nurse staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseStaff remove(
			long medicalFacilitiesNurseStaffId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().remove(medicalFacilitiesNurseStaffId);
	}

	public static MedicalFacilitiesNurseStaff updateImpl(
		MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return getPersistence().updateImpl(medicalFacilitiesNurseStaff);
	}

	/**
	 * Returns the medical facilities nurse staff with the primary key or throws a <code>NoSuchMedicalFacilitiesNurseStaffException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff
	 * @throws NoSuchMedicalFacilitiesNurseStaffException if a medical facilities nurse staff with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseStaff findByPrimaryKey(
			long medicalFacilitiesNurseStaffId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseStaffException {

		return getPersistence().findByPrimaryKey(medicalFacilitiesNurseStaffId);
	}

	/**
	 * Returns the medical facilities nurse staff with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff, or <code>null</code> if a medical facilities nurse staff with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseStaff fetchByPrimaryKey(
		long medicalFacilitiesNurseStaffId) {

		return getPersistence().fetchByPrimaryKey(
			medicalFacilitiesNurseStaffId);
	}

	/**
	 * Returns all the medical facilities nurse staffs.
	 *
	 * @return the medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities nurse staffs
	 */
	public static List<MedicalFacilitiesNurseStaff> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesNurseStaff> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical facilities nurse staffs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical facilities nurse staffs.
	 *
	 * @return the number of medical facilities nurse staffs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalFacilitiesNurseStaffPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalFacilitiesNurseStaffPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalFacilitiesNurseStaffPersistence _persistence;

}