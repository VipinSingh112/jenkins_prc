/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical facilities app service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalFacilitiesAppPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppPersistence
 * @generated
 */
public class MedicalFacilitiesAppUtil {

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
	public static void clearCache(MedicalFacilitiesApp medicalFacilitiesApp) {
		getPersistence().clearCache(medicalFacilitiesApp);
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
	public static Map<Serializable, MedicalFacilitiesApp> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalFacilitiesApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalFacilitiesApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalFacilitiesApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalFacilitiesApp update(
		MedicalFacilitiesApp medicalFacilitiesApp) {

		return getPersistence().update(medicalFacilitiesApp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalFacilitiesApp update(
		MedicalFacilitiesApp medicalFacilitiesApp,
		ServiceContext serviceContext) {

		return getPersistence().update(medicalFacilitiesApp, serviceContext);
	}

	/**
	 * Returns all the medical facilities apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the medical facilities apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findByUuid_First(
			String uuid,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where uuid = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public static MedicalFacilitiesApp[] findByUuid_PrevAndNext(
			long medicalFacilitiesAppId, String uuid,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findByUuid_PrevAndNext(
			medicalFacilitiesAppId, uuid, orderByComparator);
	}

	/**
	 * Removes all the medical facilities apps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of medical facilities apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical facilities apps
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the medical facilities app where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findByUUID_G(String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical facilities app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the medical facilities app where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical facilities app that was removed
	 */
	public static MedicalFacilitiesApp removeByUUID_G(String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of medical facilities apps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical facilities apps
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public static MedicalFacilitiesApp[] findByUuid_C_PrevAndNext(
			long medicalFacilitiesAppId, String uuid, long companyId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findByUuid_C_PrevAndNext(
			medicalFacilitiesAppId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities apps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of medical facilities apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical facilities apps
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the medical facilities app where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities app where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return getPersistence().fetchBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities app where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		return getPersistence().fetchBygetMedicalFacilitiesById(
			medicalFacilitiesAppId, useFinderCache);
	}

	/**
	 * Removes the medical facilities app where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical facilities app that was removed
	 */
	public static MedicalFacilitiesApp removeBygetMedicalFacilitiesById(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().removeBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical facilities apps where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical facilities apps
	 */
	public static int countBygetMedicalFacilitiesById(
		long medicalFacilitiesAppId) {

		return getPersistence().countBygetMedicalFacilitiesById(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_S_U(
		int status, long userId) {

		return getPersistence().findBygetMedicalFacilitiesBy_S_U(
			status, userId);
	}

	/**
	 * Returns a range of all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_S_U(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetMedicalFacilitiesBy_S_U(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_S_U(
		int status, long userId, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().findBygetMedicalFacilitiesBy_S_U(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findBygetMedicalFacilitiesBy_S_U(
		int status, long userId, int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMedicalFacilitiesBy_S_U(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findBygetMedicalFacilitiesBy_S_U_First(
			int status, long userId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalFacilitiesBy_S_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_S_U_First(
		int status, long userId,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesBy_S_U_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findBygetMedicalFacilitiesBy_S_U_Last(
			int status, long userId,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalFacilitiesBy_S_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalFacilitiesBy_S_U_Last(
		int status, long userId,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesBy_S_U_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public static MedicalFacilitiesApp[]
			findBygetMedicalFacilitiesBy_S_U_PrevAndNext(
				long medicalFacilitiesAppId, int status, long userId,
				OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalFacilitiesBy_S_U_PrevAndNext(
			medicalFacilitiesAppId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the medical facilities apps where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetMedicalFacilitiesBy_S_U(
		int status, long userId) {

		getPersistence().removeBygetMedicalFacilitiesBy_S_U(status, userId);
	}

	/**
	 * Returns the number of medical facilities apps where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching medical facilities apps
	 */
	public static int countBygetMedicalFacilitiesBy_S_U(
		int status, long userId) {

		return getPersistence().countBygetMedicalFacilitiesBy_S_U(
			status, userId);
	}

	/**
	 * Returns all the medical facilities apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_Status(int status) {

		return getPersistence().findBygetMedicalFacilitiesBy_Status(status);
	}

	/**
	 * Returns a range of all the medical facilities apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_Status(int status, int start, int end) {

		return getPersistence().findBygetMedicalFacilitiesBy_Status(
			status, start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_Status(
			int status, int start, int end,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().findBygetMedicalFacilitiesBy_Status(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical facilities apps
	 */
	public static List<MedicalFacilitiesApp>
		findBygetMedicalFacilitiesBy_Status(
			int status, int start, int end,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetMedicalFacilitiesBy_Status(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp
			findBygetMedicalFacilitiesBy_Status_First(
				int status,
				OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalFacilitiesBy_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp
		fetchBygetMedicalFacilitiesBy_Status_First(
			int status,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesBy_Status_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findBygetMedicalFacilitiesBy_Status_Last(
			int status,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalFacilitiesBy_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp
		fetchBygetMedicalFacilitiesBy_Status_Last(
			int status,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().fetchBygetMedicalFacilitiesBy_Status_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the medical facilities apps before and after the current medical facilities app in the ordered set where status = &#63;.
	 *
	 * @param medicalFacilitiesAppId the primary key of the current medical facilities app
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public static MedicalFacilitiesApp[]
			findBygetMedicalFacilitiesBy_Status_PrevAndNext(
				long medicalFacilitiesAppId, int status,
				OrderByComparator<MedicalFacilitiesApp> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalFacilitiesBy_Status_PrevAndNext(
			medicalFacilitiesAppId, status, orderByComparator);
	}

	/**
	 * Removes all the medical facilities apps where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetMedicalFacilitiesBy_Status(int status) {
		getPersistence().removeBygetMedicalFacilitiesBy_Status(status);
	}

	/**
	 * Returns the number of medical facilities apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching medical facilities apps
	 */
	public static int countBygetMedicalFacilitiesBy_Status(int status) {
		return getPersistence().countBygetMedicalFacilitiesBy_Status(status);
	}

	/**
	 * Returns the medical facilities app where applicationNumber = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findBygetMedicalByAppNo(
			String applicationNumber)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalByAppNo(applicationNumber);
	}

	/**
	 * Returns the medical facilities app where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetMedicalByAppNo(applicationNumber);
	}

	/**
	 * Returns the medical facilities app where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetMedicalByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the medical facilities app where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the medical facilities app that was removed
	 */
	public static MedicalFacilitiesApp removeBygetMedicalByAppNo(
			String applicationNumber)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().removeBygetMedicalByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of medical facilities apps where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching medical facilities apps
	 */
	public static int countBygetMedicalByAppNo(String applicationNumber) {
		return getPersistence().countBygetMedicalByAppNo(applicationNumber);
	}

	/**
	 * Returns the medical facilities app where caseId = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findBygetMedicalByCaseID(String caseId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalByCaseID(caseId);
	}

	/**
	 * Returns the medical facilities app where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalByCaseID(
		String caseId) {

		return getPersistence().fetchBygetMedicalByCaseID(caseId);
	}

	/**
	 * Returns the medical facilities app where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalByCaseID(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetMedicalByCaseID(
			caseId, useFinderCache);
	}

	/**
	 * Removes the medical facilities app where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical facilities app that was removed
	 */
	public static MedicalFacilitiesApp removeBygetMedicalByCaseID(String caseId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().removeBygetMedicalByCaseID(caseId);
	}

	/**
	 * Returns the number of medical facilities apps where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical facilities apps
	 */
	public static int countBygetMedicalByCaseID(String caseId) {
		return getPersistence().countBygetMedicalByCaseID(caseId);
	}

	/**
	 * Returns the medical facilities app where expiredLicenseAppNumber = &#63; or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp findBygetMedicalByExpiredLicNum(
			String expiredLicenseAppNumber)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findBygetMedicalByExpiredLicNum(
			expiredLicenseAppNumber);
	}

	/**
	 * Returns the medical facilities app where expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalByExpiredLicNum(
		String expiredLicenseAppNumber) {

		return getPersistence().fetchBygetMedicalByExpiredLicNum(
			expiredLicenseAppNumber);
	}

	/**
	 * Returns the medical facilities app where expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp fetchBygetMedicalByExpiredLicNum(
		String expiredLicenseAppNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetMedicalByExpiredLicNum(
			expiredLicenseAppNumber, useFinderCache);
	}

	/**
	 * Removes the medical facilities app where expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the medical facilities app that was removed
	 */
	public static MedicalFacilitiesApp removeBygetMedicalByExpiredLicNum(
			String expiredLicenseAppNumber)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().removeBygetMedicalByExpiredLicNum(
			expiredLicenseAppNumber);
	}

	/**
	 * Returns the number of medical facilities apps where expiredLicenseAppNumber = &#63;.
	 *
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching medical facilities apps
	 */
	public static int countBygetMedicalByExpiredLicNum(
		String expiredLicenseAppNumber) {

		return getPersistence().countBygetMedicalByExpiredLicNum(
			expiredLicenseAppNumber);
	}

	/**
	 * Caches the medical facilities app in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesApp the medical facilities app
	 */
	public static void cacheResult(MedicalFacilitiesApp medicalFacilitiesApp) {
		getPersistence().cacheResult(medicalFacilitiesApp);
	}

	/**
	 * Caches the medical facilities apps in the entity cache if it is enabled.
	 *
	 * @param medicalFacilitiesApps the medical facilities apps
	 */
	public static void cacheResult(
		List<MedicalFacilitiesApp> medicalFacilitiesApps) {

		getPersistence().cacheResult(medicalFacilitiesApps);
	}

	/**
	 * Creates a new medical facilities app with the primary key. Does not add the medical facilities app to the database.
	 *
	 * @param medicalFacilitiesAppId the primary key for the new medical facilities app
	 * @return the new medical facilities app
	 */
	public static MedicalFacilitiesApp create(long medicalFacilitiesAppId) {
		return getPersistence().create(medicalFacilitiesAppId);
	}

	/**
	 * Removes the medical facilities app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app that was removed
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public static MedicalFacilitiesApp remove(long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().remove(medicalFacilitiesAppId);
	}

	public static MedicalFacilitiesApp updateImpl(
		MedicalFacilitiesApp medicalFacilitiesApp) {

		return getPersistence().updateImpl(medicalFacilitiesApp);
	}

	/**
	 * Returns the medical facilities app with the primary key or throws a <code>NoSuchMedicalFacilitiesAppException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app
	 * @throws NoSuchMedicalFacilitiesAppException if a medical facilities app with the primary key could not be found
	 */
	public static MedicalFacilitiesApp findByPrimaryKey(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getPersistence().findByPrimaryKey(medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities app with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app, or <code>null</code> if a medical facilities app with the primary key could not be found
	 */
	public static MedicalFacilitiesApp fetchByPrimaryKey(
		long medicalFacilitiesAppId) {

		return getPersistence().fetchByPrimaryKey(medicalFacilitiesAppId);
	}

	/**
	 * Returns all the medical facilities apps.
	 *
	 * @return the medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical facilities apps
	 */
	public static List<MedicalFacilitiesApp> findAll(
		int start, int end,
		OrderByComparator<MedicalFacilitiesApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical facilities apps from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical facilities apps.
	 *
	 * @return the number of medical facilities apps
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalFacilitiesAppPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalFacilitiesAppPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalFacilitiesAppPersistence _persistence;

}