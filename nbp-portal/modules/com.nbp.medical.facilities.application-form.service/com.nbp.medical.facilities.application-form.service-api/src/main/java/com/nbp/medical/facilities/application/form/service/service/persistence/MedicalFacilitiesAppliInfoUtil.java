/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesAppliInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical facilities appli info service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalFacilitiesAppliInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppliInfoPersistence
 * @generated
 */
public class MedicalFacilitiesAppliInfoUtil {

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
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		getPersistence().clearCache(medicalFacilitiesAppliInfo);
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
	public static Map<Serializable, MedicalFacilitiesAppliInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalFacilitiesAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalFacilitiesAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalFacilitiesAppliInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalFacilitiesAppliInfo update(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		return getPersistence().update(medicalFacilitiesAppliInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalFacilitiesAppliInfo update(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalFacilitiesAppliInfo, serviceContext);
	}

	/**
	 * Returns all the medical facilities appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the medical facilities appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the medical facilities appli infos before and after the current medical facilities appli info in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the current medical facilities appli info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public static MedicalFacilitiesAppliInfo[] findByUuid_PrevAndNext(
			long medicalFacilitiesAppliId, String uuid,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findByUuid_PrevAndNext(
			medicalFacilitiesAppliId, uuid, orderByComparator);
	}

	/**
	 * Removes all the medical facilities appli infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of medical facilities appli infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities appli infos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the medical facilities appli info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppliInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities appli info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the medical facilities appli info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities appli info that was removed
	 */
	public static MedicalFacilitiesAppliInfo removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of medical facilities appli infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities appli infos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the medical facilities appli infos before and after the current medical facilities appli info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the current medical facilities appli info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public static MedicalFacilitiesAppliInfo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesAppliId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			medicalFacilitiesAppliId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities appli infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of medical facilities appli infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities appli infos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns a range of all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo
			findBygetMedicalFacilitiesById_First(
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo
		fetchBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo
			findBygetMedicalFacilitiesById_Last(
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	public static MedicalFacilitiesAppliInfo
		fetchBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the medical facilities appli infos before and after the current medical facilities appli info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the current medical facilities appli info
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public static MedicalFacilitiesAppliInfo[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesAppliId, long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findBygetMedicalFacilitiesById_PrevAndNext(
			medicalFacilitiesAppliId, medicalFacilitiesAppId,
			orderByComparator);
	}

	/**
	 * Removes all the medical facilities appli infos where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public static void removeBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		getPersistence().removeBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical facilities appli infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities appli infos
	 */
	public static int countBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return getPersistence().countBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Caches the medical facilities appli info in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesAppliInfo the medical facilities appli info
	 */
	public static void cacheResult(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		getPersistence().cacheResult(medicalFacilitiesAppliInfo);
	}

	/**
	 * Caches the medical facilities appli infos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesAppliInfos the medical facilities appli infos
	 */
	public static void cacheResult(
		List<MedicalFacilitiesAppliInfo> medicalFacilitiesAppliInfos) {

		getPersistence().cacheResult(medicalFacilitiesAppliInfos);
	}

	/**
	 * Creates a new medical facilities appli info with the primary key. Does not add the medical facilities appli info to the database.
	 *
	 * @param medicalFacilitiesAppliId the primary key for the new medical facilities appli info
	 * @return the new medical facilities appli info
	 */
	public static MedicalFacilitiesAppliInfo create(
		long medicalFacilitiesAppliId) {

		return getPersistence().create(medicalFacilitiesAppliId);
	}

	/**
	 * Removes the medical facilities appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info that was removed
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public static MedicalFacilitiesAppliInfo remove(
			long medicalFacilitiesAppliId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().remove(medicalFacilitiesAppliId);
	}

	public static MedicalFacilitiesAppliInfo updateImpl(
		MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		return getPersistence().updateImpl(medicalFacilitiesAppliInfo);
	}

	/**
	 * Returns the medical facilities appli info with the primary key or throws a <code>NoSuchMedicalFacilitiesAppliInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info
	 * @throws NoSuchMedicalFacilitiesAppliInfoException if a medical facilities appli info with the primary key could not be found
	 */
	public static MedicalFacilitiesAppliInfo findByPrimaryKey(
			long medicalFacilitiesAppliId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppliInfoException {

		return getPersistence().findByPrimaryKey(medicalFacilitiesAppliId);
	}

	/**
	 * Returns the medical facilities appli info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info, or <code>null</code> if a medical facilities appli info with the primary key could not be found
	 */
	public static MedicalFacilitiesAppliInfo fetchByPrimaryKey(
		long medicalFacilitiesAppliId) {

		return getPersistence().fetchByPrimaryKey(medicalFacilitiesAppliId);
	}

	/**
	 * Returns all the medical facilities appli infos.
	 *
	 * @return the medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities appli infos
	 */
	public static List<MedicalFacilitiesAppliInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesAppliInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical facilities appli infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical facilities appli infos.
	 *
	 * @return the number of medical facilities appli infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalFacilitiesAppliInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalFacilitiesAppliInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalFacilitiesAppliInfoPersistence _persistence;

}