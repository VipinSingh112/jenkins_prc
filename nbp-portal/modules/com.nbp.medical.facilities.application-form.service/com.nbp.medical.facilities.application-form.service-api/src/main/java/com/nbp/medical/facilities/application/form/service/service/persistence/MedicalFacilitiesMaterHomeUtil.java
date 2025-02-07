/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesMaterHome;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical facilities mater home service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalFacilitiesMaterHomePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesMaterHomePersistence
 * @generated
 */
public class MedicalFacilitiesMaterHomeUtil {

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
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		getPersistence().clearCache(medicalFacilitiesMaterHome);
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
	public static Map<Serializable, MedicalFacilitiesMaterHome>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalFacilitiesMaterHome> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalFacilitiesMaterHome> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalFacilitiesMaterHome> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalFacilitiesMaterHome update(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		return getPersistence().update(medicalFacilitiesMaterHome);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalFacilitiesMaterHome update(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalFacilitiesMaterHome, serviceContext);
	}

	/**
	 * Returns all the medical facilities mater homes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the medical facilities mater homes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the medical facilities mater homes before and after the current medical facilities mater home in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the current medical facilities mater home
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public static MedicalFacilitiesMaterHome[] findByUuid_PrevAndNext(
			long medicalFacilitiesMaterHomeId, String uuid,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findByUuid_PrevAndNext(
			medicalFacilitiesMaterHomeId, uuid, orderByComparator);
	}

	/**
	 * Removes all the medical facilities mater homes where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of medical facilities mater homes where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities mater homes
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the medical facilities mater home where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesMaterHomeException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities mater home where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities mater home where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the medical facilities mater home where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities mater home that was removed
	 */
	public static MedicalFacilitiesMaterHome removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of medical facilities mater homes where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities mater homes
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the medical facilities mater homes before and after the current medical facilities mater home in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the current medical facilities mater home
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public static MedicalFacilitiesMaterHome[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesMaterHomeId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findByUuid_C_PrevAndNext(
			medicalFacilitiesMaterHomeId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities mater homes where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of medical facilities mater homes where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities mater homes
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns a range of all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome
			findBygetMedicalFacilitiesById_First(
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome
		fetchBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome
			findBygetMedicalFacilitiesById_Last(
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities mater home, or <code>null</code> if a matching medical facilities mater home could not be found
	 */
	public static MedicalFacilitiesMaterHome
		fetchBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the medical facilities mater homes before and after the current medical facilities mater home in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the current medical facilities mater home
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public static MedicalFacilitiesMaterHome[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesMaterHomeId, long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findBygetMedicalFacilitiesById_PrevAndNext(
			medicalFacilitiesMaterHomeId, medicalFacilitiesAppId,
			orderByComparator);
	}

	/**
	 * Removes all the medical facilities mater homes where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public static void removeBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		getPersistence().removeBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical facilities mater homes where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities mater homes
	 */
	public static int countBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return getPersistence().countBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Caches the medical facilities mater home in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesMaterHome the medical facilities mater home
	 */
	public static void cacheResult(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		getPersistence().cacheResult(medicalFacilitiesMaterHome);
	}

	/**
	 * Caches the medical facilities mater homes in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesMaterHomes the medical facilities mater homes
	 */
	public static void cacheResult(
		List<MedicalFacilitiesMaterHome> medicalFacilitiesMaterHomes) {

		getPersistence().cacheResult(medicalFacilitiesMaterHomes);
	}

	/**
	 * Creates a new medical facilities mater home with the primary key. Does not add the medical facilities mater home to the database.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key for the new medical facilities mater home
	 * @return the new medical facilities mater home
	 */
	public static MedicalFacilitiesMaterHome create(
		long medicalFacilitiesMaterHomeId) {

		return getPersistence().create(medicalFacilitiesMaterHomeId);
	}

	/**
	 * Removes the medical facilities mater home with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home that was removed
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public static MedicalFacilitiesMaterHome remove(
			long medicalFacilitiesMaterHomeId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().remove(medicalFacilitiesMaterHomeId);
	}

	public static MedicalFacilitiesMaterHome updateImpl(
		MedicalFacilitiesMaterHome medicalFacilitiesMaterHome) {

		return getPersistence().updateImpl(medicalFacilitiesMaterHome);
	}

	/**
	 * Returns the medical facilities mater home with the primary key or throws a <code>NoSuchMedicalFacilitiesMaterHomeException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home
	 * @throws NoSuchMedicalFacilitiesMaterHomeException if a medical facilities mater home with the primary key could not be found
	 */
	public static MedicalFacilitiesMaterHome findByPrimaryKey(
			long medicalFacilitiesMaterHomeId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesMaterHomeException {

		return getPersistence().findByPrimaryKey(medicalFacilitiesMaterHomeId);
	}

	/**
	 * Returns the medical facilities mater home with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesMaterHomeId the primary key of the medical facilities mater home
	 * @return the medical facilities mater home, or <code>null</code> if a medical facilities mater home with the primary key could not be found
	 */
	public static MedicalFacilitiesMaterHome fetchByPrimaryKey(
		long medicalFacilitiesMaterHomeId) {

		return getPersistence().fetchByPrimaryKey(medicalFacilitiesMaterHomeId);
	}

	/**
	 * Returns all the medical facilities mater homes.
	 *
	 * @return the medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @return the range of medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities mater homes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesMaterHomeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities mater homes
	 * @param end the upper bound of the range of medical facilities mater homes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities mater homes
	 */
	public static List<MedicalFacilitiesMaterHome> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesMaterHome> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical facilities mater homes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical facilities mater homes.
	 *
	 * @return the number of medical facilities mater homes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalFacilitiesMaterHomePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalFacilitiesMaterHomePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalFacilitiesMaterHomePersistence _persistence;

}