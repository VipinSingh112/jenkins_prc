/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical current stage service. This utility wraps <code>com.nbp.medical.facilities.application.form.service.service.persistence.impl.MedicalCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalCurrentStagePersistence
 * @generated
 */
public class MedicalCurrentStageUtil {

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
	public static void clearCache(MedicalCurrentStage medicalCurrentStage) {
		getPersistence().clearCache(medicalCurrentStage);
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
	public static Map<Serializable, MedicalCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalCurrentStage update(
		MedicalCurrentStage medicalCurrentStage) {

		return getPersistence().update(medicalCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalCurrentStage update(
		MedicalCurrentStage medicalCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(medicalCurrentStage, serviceContext);
	}

	/**
	 * Returns all the medical current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical current stages
	 */
	public static List<MedicalCurrentStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the medical current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of matching medical current stages
	 */
	public static List<MedicalCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical current stages
	 */
	public static List<MedicalCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical current stages
	 */
	public static List<MedicalCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the medical current stages before and after the current medical current stage in the ordered set where uuid = &#63;.
	 *
	 * @param medicalCurrentStageId the primary key of the current medical current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	public static MedicalCurrentStage[] findByUuid_PrevAndNext(
			long medicalCurrentStageId, String uuid,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			medicalCurrentStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the medical current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of medical current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the medical current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the medical current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical current stage that was removed
	 */
	public static MedicalCurrentStage removeByUUID_G(String uuid, long groupId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of medical current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical current stages
	 */
	public static List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of matching medical current stages
	 */
	public static List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical current stages
	 */
	public static List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical current stages
	 */
	public static List<MedicalCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the medical current stages before and after the current medical current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalCurrentStageId the primary key of the current medical current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	public static MedicalCurrentStage[] findByUuid_C_PrevAndNext(
			long medicalCurrentStageId, String uuid, long companyId,
			OrderByComparator<MedicalCurrentStage> orderByComparator)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			medicalCurrentStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the medical current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of medical current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the medical current stage where medicalFacilitiesAppId = &#63; or throws a <code>NoSuchMedicalCurrentStageException</code> if it could not be found.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage findBygetByMED_Stage(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().findBygetByMED_Stage(medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical current stage where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage fetchBygetByMED_Stage(
		long medicalFacilitiesAppId) {

		return getPersistence().fetchBygetByMED_Stage(medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical current stage where medicalFacilitiesAppId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical current stage, or <code>null</code> if a matching medical current stage could not be found
	 */
	public static MedicalCurrentStage fetchBygetByMED_Stage(
		long medicalFacilitiesAppId, boolean useFinderCache) {

		return getPersistence().fetchBygetByMED_Stage(
			medicalFacilitiesAppId, useFinderCache);
	}

	/**
	 * Removes the medical current stage where medicalFacilitiesAppId = &#63; from the database.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the medical current stage that was removed
	 */
	public static MedicalCurrentStage removeBygetByMED_Stage(
			long medicalFacilitiesAppId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().removeBygetByMED_Stage(medicalFacilitiesAppId);
	}

	/**
	 * Returns the number of medical current stages where medicalFacilitiesAppId = &#63;.
	 *
	 * @param medicalFacilitiesAppId the medical facilities app ID
	 * @return the number of matching medical current stages
	 */
	public static int countBygetByMED_Stage(long medicalFacilitiesAppId) {
		return getPersistence().countBygetByMED_Stage(medicalFacilitiesAppId);
	}

	/**
	 * Caches the medical current stage in the entity cache if it is enabled.
	 *
	 * @param medicalCurrentStage the medical current stage
	 */
	public static void cacheResult(MedicalCurrentStage medicalCurrentStage) {
		getPersistence().cacheResult(medicalCurrentStage);
	}

	/**
	 * Caches the medical current stages in the entity cache if it is enabled.
	 *
	 * @param medicalCurrentStages the medical current stages
	 */
	public static void cacheResult(
		List<MedicalCurrentStage> medicalCurrentStages) {

		getPersistence().cacheResult(medicalCurrentStages);
	}

	/**
	 * Creates a new medical current stage with the primary key. Does not add the medical current stage to the database.
	 *
	 * @param medicalCurrentStageId the primary key for the new medical current stage
	 * @return the new medical current stage
	 */
	public static MedicalCurrentStage create(long medicalCurrentStageId) {
		return getPersistence().create(medicalCurrentStageId);
	}

	/**
	 * Removes the medical current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage that was removed
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	public static MedicalCurrentStage remove(long medicalCurrentStageId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().remove(medicalCurrentStageId);
	}

	public static MedicalCurrentStage updateImpl(
		MedicalCurrentStage medicalCurrentStage) {

		return getPersistence().updateImpl(medicalCurrentStage);
	}

	/**
	 * Returns the medical current stage with the primary key or throws a <code>NoSuchMedicalCurrentStageException</code> if it could not be found.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage
	 * @throws NoSuchMedicalCurrentStageException if a medical current stage with the primary key could not be found
	 */
	public static MedicalCurrentStage findByPrimaryKey(
			long medicalCurrentStageId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalCurrentStageException {

		return getPersistence().findByPrimaryKey(medicalCurrentStageId);
	}

	/**
	 * Returns the medical current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalCurrentStageId the primary key of the medical current stage
	 * @return the medical current stage, or <code>null</code> if a medical current stage with the primary key could not be found
	 */
	public static MedicalCurrentStage fetchByPrimaryKey(
		long medicalCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(medicalCurrentStageId);
	}

	/**
	 * Returns all the medical current stages.
	 *
	 * @return the medical current stages
	 */
	public static List<MedicalCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @return the range of medical current stages
	 */
	public static List<MedicalCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical current stages
	 */
	public static List<MedicalCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical current stages
	 * @param end the upper bound of the range of medical current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical current stages
	 */
	public static List<MedicalCurrentStage> findAll(
		int start, int end,
		OrderByComparator<MedicalCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical current stages.
	 *
	 * @return the number of medical current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalCurrentStagePersistence _persistence;

}