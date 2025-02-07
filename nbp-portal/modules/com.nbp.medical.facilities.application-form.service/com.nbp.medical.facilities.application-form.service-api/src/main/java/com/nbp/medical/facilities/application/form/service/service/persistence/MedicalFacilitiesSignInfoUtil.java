/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesSignInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical facilities sign info service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalFacilitiesSignInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesSignInfoPersistence
 * @generated
 */
public class MedicalFacilitiesSignInfoUtil {

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
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		getPersistence().clearCache(medicalFacilitiesSignInfo);
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
	public static Map<Serializable, MedicalFacilitiesSignInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalFacilitiesSignInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalFacilitiesSignInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalFacilitiesSignInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalFacilitiesSignInfo update(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		return getPersistence().update(medicalFacilitiesSignInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalFacilitiesSignInfo update(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalFacilitiesSignInfo, serviceContext);
	}

	/**
	 * Returns all the medical facilities sign infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the medical facilities sign infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of matching medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the medical facilities sign infos before and after the current medical facilities sign info in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the current medical facilities sign info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	public static MedicalFacilitiesSignInfo[] findByUuid_PrevAndNext(
			long medicalFacilitiesSignInfoId, String uuid,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().findByUuid_PrevAndNext(
			medicalFacilitiesSignInfoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the medical facilities sign infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of medical facilities sign infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities sign infos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the medical facilities sign info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesSignInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities sign info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities sign info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the medical facilities sign info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities sign info that was removed
	 */
	public static MedicalFacilitiesSignInfo removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of medical facilities sign infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities sign infos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of matching medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the medical facilities sign infos before and after the current medical facilities sign info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the current medical facilities sign info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	public static MedicalFacilitiesSignInfo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesSignInfoId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			medicalFacilitiesSignInfoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities sign infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of medical facilities sign infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities sign infos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the medical facilities sign info where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesSignInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities sign info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return getPersistence().fetchBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities sign info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	public static MedicalFacilitiesSignInfo fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		return getPersistence().fetchBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, useFinderCache);
	}

	/**
	 * Removes the medical facilities sign info where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities sign info that was removed
	 */
	public static MedicalFacilitiesSignInfo removeBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().removeBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical facilities sign infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities sign infos
	 */
	public static int countBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return getPersistence().countBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Caches the medical facilities sign info in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesSignInfo the medical facilities sign info
	 */
	public static void cacheResult(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		getPersistence().cacheResult(medicalFacilitiesSignInfo);
	}

	/**
	 * Caches the medical facilities sign infos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesSignInfos the medical facilities sign infos
	 */
	public static void cacheResult(
		List<MedicalFacilitiesSignInfo> medicalFacilitiesSignInfos) {

		getPersistence().cacheResult(medicalFacilitiesSignInfos);
	}

	/**
	 * Creates a new medical facilities sign info with the primary key. Does not add the medical facilities sign info to the database.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key for the new medical facilities sign info
	 * @return the new medical facilities sign info
	 */
	public static MedicalFacilitiesSignInfo create(
		long medicalFacilitiesSignInfoId) {

		return getPersistence().create(medicalFacilitiesSignInfoId);
	}

	/**
	 * Removes the medical facilities sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info that was removed
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	public static MedicalFacilitiesSignInfo remove(
			long medicalFacilitiesSignInfoId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().remove(medicalFacilitiesSignInfoId);
	}

	public static MedicalFacilitiesSignInfo updateImpl(
		MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		return getPersistence().updateImpl(medicalFacilitiesSignInfo);
	}

	/**
	 * Returns the medical facilities sign info with the primary key or throws a <code>NoSuchMedicalFacilitiesSignInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info
	 * @throws NoSuchMedicalFacilitiesSignInfoException if a medical facilities sign info with the primary key could not be found
	 */
	public static MedicalFacilitiesSignInfo findByPrimaryKey(
			long medicalFacilitiesSignInfoId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesSignInfoException {

		return getPersistence().findByPrimaryKey(medicalFacilitiesSignInfoId);
	}

	/**
	 * Returns the medical facilities sign info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info, or <code>null</code> if a medical facilities sign info with the primary key could not be found
	 */
	public static MedicalFacilitiesSignInfo fetchByPrimaryKey(
		long medicalFacilitiesSignInfoId) {

		return getPersistence().fetchByPrimaryKey(medicalFacilitiesSignInfoId);
	}

	/**
	 * Returns all the medical facilities sign infos.
	 *
	 * @return the medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities sign infos
	 */
	public static List<MedicalFacilitiesSignInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesSignInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical facilities sign infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical facilities sign infos.
	 *
	 * @return the number of medical facilities sign infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalFacilitiesSignInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalFacilitiesSignInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalFacilitiesSignInfoPersistence _persistence;

}