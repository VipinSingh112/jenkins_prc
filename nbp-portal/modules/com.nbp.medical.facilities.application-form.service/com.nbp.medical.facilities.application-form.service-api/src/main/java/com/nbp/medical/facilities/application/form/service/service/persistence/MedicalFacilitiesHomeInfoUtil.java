/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesHomeInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical facilities home info service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalFacilitiesHomeInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeInfoPersistence
 * @generated
 */
public class MedicalFacilitiesHomeInfoUtil {

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
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		getPersistence().clearCache(medicalFacilitiesHomeInfo);
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
	public static Map<Serializable, MedicalFacilitiesHomeInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalFacilitiesHomeInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalFacilitiesHomeInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalFacilitiesHomeInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalFacilitiesHomeInfo update(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return getPersistence().update(medicalFacilitiesHomeInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalFacilitiesHomeInfo update(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalFacilitiesHomeInfo, serviceContext);
	}

	/**
	 * Returns all the medical facilities home infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the medical facilities home infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the medical facilities home infos before and after the current medical facilities home info in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the current medical facilities home info
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeInfo[] findByUuid_PrevAndNext(
			long medicalFacilitiesHomeInfoId, String uuid,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findByUuid_PrevAndNext(
			medicalFacilitiesHomeInfoId, uuid, orderByComparator);
	}

	/**
	 * Removes all the medical facilities home infos where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of medical facilities home infos where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities home infos
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the medical facilities home info where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesHomeInfoException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities home info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities home info where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the medical facilities home info where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities home info that was removed
	 */
	public static MedicalFacilitiesHomeInfo removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of medical facilities home infos where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities home infos
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the medical facilities home infos before and after the current medical facilities home info in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the current medical facilities home info
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeInfo[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesHomeInfoId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findByUuid_C_PrevAndNext(
			medicalFacilitiesHomeInfoId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities home infos where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of medical facilities home infos where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities home infos
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo>
		findBygetMedicalFacilitiesById(long medicalFacilitiesAppId) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns a range of all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo>
		findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId, int start, int end,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo
			findBygetMedicalFacilitiesById_First(
				long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo
		fetchBygetMedicalFacilitiesById_First(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_First(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo findBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo
		fetchBygetMedicalFacilitiesById_Last(
			long medicalFacilitiesAppId,
			OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesById_Last(
			medicalFacilitiesAppId, orderByComparator);
	}

	/**
	 * Returns the medical facilities home infos before and after the current medical facilities home info in the ordered set where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the current medical facilities home info
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeInfo[]
			findBygetMedicalFacilitiesById_PrevAndNext(
				long medicalFacilitiesHomeInfoId, long medicalFacilitiesAppId,
				OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findBygetMedicalFacilitiesById_PrevAndNext(
			medicalFacilitiesHomeInfoId, medicalFacilitiesAppId,
			orderByComparator);
	}

	/**
	 * Removes all the medical facilities home infos where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 */
	public static void removeBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		getPersistence().removeBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities home infos
	 */
	public static int countBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return getPersistence().countBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities home info where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesHomeInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo findBygetMedicalFacilities_ByAppId(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities home info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId) {

		return getPersistence().fetchBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities home info where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	public static MedicalFacilitiesHomeInfo fetchBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		return getPersistence().fetchBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId, useFinderCache);
	}

	/**
	 * Removes the medical facilities home info where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities home info that was removed
	 */
	public static MedicalFacilitiesHomeInfo
			removeBygetMedicalFacilities_ByAppId(long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().removeBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical facilities home infos where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities home infos
	 */
	public static int countBygetMedicalFacilities_ByAppId(
		long medicalFacilitiesAppId) {

		return getPersistence().countBygetMedicalFacilities_ByAppId(
			medicalFacilitiesAppId);
	}

	/**
	 * Caches the medical facilities home info in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 */
	public static void cacheResult(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		getPersistence().cacheResult(medicalFacilitiesHomeInfo);
	}

	/**
	 * Caches the medical facilities home infos in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesHomeInfos the medical facilities home infos
	 */
	public static void cacheResult(
		List<MedicalFacilitiesHomeInfo> medicalFacilitiesHomeInfos) {

		getPersistence().cacheResult(medicalFacilitiesHomeInfos);
	}

	/**
	 * Creates a new medical facilities home info with the primary key. Does not add the medical facilities home info to the database.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key for the new medical facilities home info
	 * @return the new medical facilities home info
	 */
	public static MedicalFacilitiesHomeInfo create(
		long medicalFacilitiesHomeInfoId) {

		return getPersistence().create(medicalFacilitiesHomeInfoId);
	}

	/**
	 * Removes the medical facilities home info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info that was removed
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeInfo remove(
			long medicalFacilitiesHomeInfoId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().remove(medicalFacilitiesHomeInfoId);
	}

	public static MedicalFacilitiesHomeInfo updateImpl(
		MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return getPersistence().updateImpl(medicalFacilitiesHomeInfo);
	}

	/**
	 * Returns the medical facilities home info with the primary key or throws a <code>NoSuchMedicalFacilitiesHomeInfoException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info
	 * @throws NoSuchMedicalFacilitiesHomeInfoException if a medical facilities home info with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeInfo findByPrimaryKey(
			long medicalFacilitiesHomeInfoId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesHomeInfoException {

		return getPersistence().findByPrimaryKey(medicalFacilitiesHomeInfoId);
	}

	/**
	 * Returns the medical facilities home info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info, or <code>null</code> if a medical facilities home info with the primary key could not be found
	 */
	public static MedicalFacilitiesHomeInfo fetchByPrimaryKey(
		long medicalFacilitiesHomeInfoId) {

		return getPersistence().fetchByPrimaryKey(medicalFacilitiesHomeInfoId);
	}

	/**
	 * Returns all the medical facilities home infos.
	 *
	 * @return the medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities home infos
	 */
	public static List<MedicalFacilitiesHomeInfo> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesHomeInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical facilities home infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical facilities home infos.
	 *
	 * @return the number of medical facilities home infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalFacilitiesHomeInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalFacilitiesHomeInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalFacilitiesHomeInfoPersistence _persistence;

}