/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesNurseDetail;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical facilities nurse detail service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalFacilitiesNurseDetailPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseDetailPersistence
 * @generated
 */
public class MedicalFacilitiesNurseDetailUtil {

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
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		getPersistence().clearCache(medicalFacilitiesNurseDetail);
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
	public static Map<Serializable, MedicalFacilitiesNurseDetail>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalFacilitiesNurseDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalFacilitiesNurseDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalFacilitiesNurseDetail> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalFacilitiesNurseDetail update(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		return getPersistence().update(medicalFacilitiesNurseDetail);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalFacilitiesNurseDetail update(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalFacilitiesNurseDetail, serviceContext);
	}

	/**
	 * Returns all the medical facilities nurse details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the medical facilities nurse details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the medical facilities nurse details before and after the current medical facilities nurse detail in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the current medical facilities nurse detail
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseDetail[] findByUuid_PrevAndNext(
			long medicalFacilitiesNurseDetailId, String uuid,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findByUuid_PrevAndNext(
			medicalFacilitiesNurseDetailId, uuid, orderByComparator);
	}

	/**
	 * Removes all the medical facilities nurse details where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of medical facilities nurse details where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities nurse details
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the medical facilities nurse detail where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesNurseDetailException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities nurse detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities nurse detail where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the medical facilities nurse detail where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities nurse detail that was removed
	 */
	public static MedicalFacilitiesNurseDetail removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of medical facilities nurse details where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities nurse details
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the medical facilities nurse details before and after the current medical facilities nurse detail in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the current medical facilities nurse detail
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseDetail[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesNurseDetailId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findByUuid_C_PrevAndNext(
			medicalFacilitiesNurseDetailId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities nurse details where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of medical facilities nurse details where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities nurse details
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns a range of all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail
			findBygetMedicalFacilitiesById_First(
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesNurseDetail>
					orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail
		fetchBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail
			findBygetMedicalFacilitiesById_Last(
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesNurseDetail>
					orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	public static MedicalFacilitiesNurseDetail
		fetchBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the medical facilities nurse details before and after the current medical facilities nurse detail in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the current medical facilities nurse detail
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseDetail[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesNurseDetailId,
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesNurseDetail>
					orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findBygetMedicalFacilitiesById_PrevAndNext(
			medicalFacilitiesNurseDetailId, medicalFacilitiesAppId,
			orderByComparator);
	}

	/**
	 * Removes all the medical facilities nurse details where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public static void removeBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		getPersistence().removeBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical facilities nurse details where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities nurse details
	 */
	public static int countBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return getPersistence().countBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Caches the medical facilities nurse detail in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseDetail the medical facilities nurse detail
	 */
	public static void cacheResult(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		getPersistence().cacheResult(medicalFacilitiesNurseDetail);
	}

	/**
	 * Caches the medical facilities nurse details in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesNurseDetails the medical facilities nurse details
	 */
	public static void cacheResult(
		List<MedicalFacilitiesNurseDetail> medicalFacilitiesNurseDetails) {

		getPersistence().cacheResult(medicalFacilitiesNurseDetails);
	}

	/**
	 * Creates a new medical facilities nurse detail with the primary key. Does not add the medical facilities nurse detail to the database.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key for the new medical facilities nurse detail
	 * @return the new medical facilities nurse detail
	 */
	public static MedicalFacilitiesNurseDetail create(
		long medicalFacilitiesNurseDetailId) {

		return getPersistence().create(medicalFacilitiesNurseDetailId);
	}

	/**
	 * Removes the medical facilities nurse detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was removed
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseDetail remove(
			long medicalFacilitiesNurseDetailId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().remove(medicalFacilitiesNurseDetailId);
	}

	public static MedicalFacilitiesNurseDetail updateImpl(
		MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		return getPersistence().updateImpl(medicalFacilitiesNurseDetail);
	}

	/**
	 * Returns the medical facilities nurse detail with the primary key or throws a <code>NoSuchMedicalFacilitiesNurseDetailException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail
	 * @throws NoSuchMedicalFacilitiesNurseDetailException if a medical facilities nurse detail with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseDetail findByPrimaryKey(
			long medicalFacilitiesNurseDetailId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesNurseDetailException {

		return getPersistence().findByPrimaryKey(
			medicalFacilitiesNurseDetailId);
	}

	/**
	 * Returns the medical facilities nurse detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail, or <code>null</code> if a medical facilities nurse detail with the primary key could not be found
	 */
	public static MedicalFacilitiesNurseDetail fetchByPrimaryKey(
		long medicalFacilitiesNurseDetailId) {

		return getPersistence().fetchByPrimaryKey(
			medicalFacilitiesNurseDetailId);
	}

	/**
	 * Returns all the medical facilities nurse details.
	 *
	 * @return the medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities nurse details
	 */
	public static List<MedicalFacilitiesNurseDetail> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesNurseDetail> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical facilities nurse details from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical facilities nurse details.
	 *
	 * @return the number of medical facilities nurse details
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalFacilitiesNurseDetailPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalFacilitiesNurseDetailPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalFacilitiesNurseDetailPersistence
		_persistence;

}