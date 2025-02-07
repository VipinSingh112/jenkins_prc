/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.stages.service.model.MedicalApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical application stages service. This utility wraps <code>com.nbp.medical.stages.service.service.persistence.impl.MedicalApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalApplicationStagesPersistence
 * @generated
 */
public class MedicalApplicationStagesUtil {

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
		MedicalApplicationStages medicalApplicationStages) {

		getPersistence().clearCache(medicalApplicationStages);
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
	public static Map<Serializable, MedicalApplicationStages>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalApplicationStages update(
		MedicalApplicationStages medicalApplicationStages) {

		return getPersistence().update(medicalApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalApplicationStages update(
		MedicalApplicationStages medicalApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(
			medicalApplicationStages, serviceContext);
	}

	/**
	 * Returns all the medical application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the medical application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where uuid = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public static MedicalApplicationStages[] findByUuid_PrevAndNext(
			long medicalStagesId, String uuid,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			medicalStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the medical application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of medical application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching medical application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the medical application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the medical application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the medical application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the medical application stages that was removed
	 */
	public static MedicalApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of medical application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching medical application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public static MedicalApplicationStages[] findByUuid_C_PrevAndNext(
			long medicalStagesId, String uuid, long companyId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			medicalStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the medical application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of medical application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching medical application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the medical application stages where medicalApplicationId = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findBygetMedical_AI(
			long medicalApplicationId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_AI(medicalApplicationId);
	}

	/**
	 * Returns the medical application stages where medicalApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_AI(
		long medicalApplicationId) {

		return getPersistence().fetchBygetMedical_AI(medicalApplicationId);
	}

	/**
	 * Returns the medical application stages where medicalApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_AI(
		long medicalApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMedical_AI(
			medicalApplicationId, useFinderCache);
	}

	/**
	 * Removes the medical application stages where medicalApplicationId = &#63; from the database.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the medical application stages that was removed
	 */
	public static MedicalApplicationStages removeBygetMedical_AI(
			long medicalApplicationId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().removeBygetMedical_AI(medicalApplicationId);
	}

	/**
	 * Returns the number of medical application stageses where medicalApplicationId = &#63;.
	 *
	 * @param medicalApplicationId the medical application ID
	 * @return the number of matching medical application stageses
	 */
	public static int countBygetMedical_AI(long medicalApplicationId) {
		return getPersistence().countBygetMedical_AI(medicalApplicationId);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findBygetMedical_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetMedical_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetMedical_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the medical application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the medical application stages that was removed
	 */
	public static MedicalApplicationStages
			removeBygetMedical_By_CaseIdStageName(
				String caseId, String stageName)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().removeBygetMedical_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching medical application stageses
	 */
	public static int countBygetMedical_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetMedical_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findByget_Medical_By_CaseId(
			String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findByget_Medical_By_CaseId(caseId);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchByget_Medical_By_CaseId(
		String caseId) {

		return getPersistence().fetchByget_Medical_By_CaseId(caseId);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchByget_Medical_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchByget_Medical_By_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the medical application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the medical application stages that was removed
	 */
	public static MedicalApplicationStages removeByget_Medical_By_CaseId(
			String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().removeByget_Medical_By_CaseId(caseId);
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical application stageses
	 */
	public static int countByget_Medical_By_CaseId(String caseId) {
		return getPersistence().countByget_Medical_By_CaseId(caseId);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages
			findBygetMedical_By_CaseIdStageStatus(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages
		fetchBygetMedical_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetMedical_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages
		fetchBygetMedical_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName,
			boolean useFinderCache) {

		return getPersistence().fetchBygetMedical_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the medical application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the medical application stages that was removed
	 */
	public static MedicalApplicationStages
			removeBygetMedical_By_CaseIdStageStatus(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().removeBygetMedical_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching medical application stageses
	 */
	public static int countBygetMedical_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetMedical_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findBygetMedical_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetMedical_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the medical application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetMedical_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the medical application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the medical application stages that was removed
	 */
	public static MedicalApplicationStages
			removeBygetMedical_By_CaseIdAndStatus(
				String caseId, String stageStatus)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().removeBygetMedical_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching medical application stageses
	 */
	public static int countBygetMedical_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetMedical_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the medical application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId) {

		return getPersistence().findBygetMedical_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the medical application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetMedical_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().findBygetMedical_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findBygetMedical_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMedical_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findBygetMedical_By_CaseId_First(
			String caseId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_By_CaseId_First(
		String caseId,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMedical_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findBygetMedical_By_CaseId_Last(
			String caseId,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_By_CaseId_Last(
		String caseId,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMedical_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where caseId = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public static MedicalApplicationStages[]
			findBygetMedical_By_CaseId_PrevAndNext(
				long medicalStagesId, String caseId,
				OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_By_CaseId_PrevAndNext(
			medicalStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the medical application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetMedical_By_CaseId(String caseId) {
		getPersistence().removeBygetMedical_By_CaseId(caseId);
	}

	/**
	 * Returns the number of medical application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching medical application stageses
	 */
	public static int countBygetMedical_By_CaseId(String caseId) {
		return getPersistence().countBygetMedical_By_CaseId(caseId);
	}

	/**
	 * Returns all the medical application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findBygetMedical_By_StageName(
		String stageName) {

		return getPersistence().findBygetMedical_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the medical application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findBygetMedical_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetMedical_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findBygetMedical_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().findBygetMedical_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical application stageses
	 */
	public static List<MedicalApplicationStages> findBygetMedical_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMedical_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findBygetMedical_By_StageName_First(
			String stageName,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_By_StageName_First(
		String stageName,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMedical_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages findBygetMedical_By_StageName_Last(
			String stageName,
			OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical application stages, or <code>null</code> if a matching medical application stages could not be found
	 */
	public static MedicalApplicationStages fetchBygetMedical_By_StageName_Last(
		String stageName,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().fetchBygetMedical_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the medical application stageses before and after the current medical application stages in the ordered set where stageName = &#63;.
	 *
	 * @param medicalStagesId the primary key of the current medical application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public static MedicalApplicationStages[]
			findBygetMedical_By_StageName_PrevAndNext(
				long medicalStagesId, String stageName,
				OrderByComparator<MedicalApplicationStages> orderByComparator)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findBygetMedical_By_StageName_PrevAndNext(
			medicalStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the medical application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetMedical_By_StageName(String stageName) {
		getPersistence().removeBygetMedical_By_StageName(stageName);
	}

	/**
	 * Returns the number of medical application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching medical application stageses
	 */
	public static int countBygetMedical_By_StageName(String stageName) {
		return getPersistence().countBygetMedical_By_StageName(stageName);
	}

	/**
	 * Caches the medical application stages in the entity cache if it is enabled.
	 *
	 * @param medicalApplicationStages the medical application stages
	 */
	public static void cacheResult(
		MedicalApplicationStages medicalApplicationStages) {

		getPersistence().cacheResult(medicalApplicationStages);
	}

	/**
	 * Caches the medical application stageses in the entity cache if it is enabled.
	 *
	 * @param medicalApplicationStageses the medical application stageses
	 */
	public static void cacheResult(
		List<MedicalApplicationStages> medicalApplicationStageses) {

		getPersistence().cacheResult(medicalApplicationStageses);
	}

	/**
	 * Creates a new medical application stages with the primary key. Does not add the medical application stages to the database.
	 *
	 * @param medicalStagesId the primary key for the new medical application stages
	 * @return the new medical application stages
	 */
	public static MedicalApplicationStages create(long medicalStagesId) {
		return getPersistence().create(medicalStagesId);
	}

	/**
	 * Removes the medical application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages that was removed
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public static MedicalApplicationStages remove(long medicalStagesId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().remove(medicalStagesId);
	}

	public static MedicalApplicationStages updateImpl(
		MedicalApplicationStages medicalApplicationStages) {

		return getPersistence().updateImpl(medicalApplicationStages);
	}

	/**
	 * Returns the medical application stages with the primary key or throws a <code>NoSuchMedicalApplicationStagesException</code> if it could not be found.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages
	 * @throws NoSuchMedicalApplicationStagesException if a medical application stages with the primary key could not be found
	 */
	public static MedicalApplicationStages findByPrimaryKey(
			long medicalStagesId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalApplicationStagesException {

		return getPersistence().findByPrimaryKey(medicalStagesId);
	}

	/**
	 * Returns the medical application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalStagesId the primary key of the medical application stages
	 * @return the medical application stages, or <code>null</code> if a medical application stages with the primary key could not be found
	 */
	public static MedicalApplicationStages fetchByPrimaryKey(
		long medicalStagesId) {

		return getPersistence().fetchByPrimaryKey(medicalStagesId);
	}

	/**
	 * Returns all the medical application stageses.
	 *
	 * @return the medical application stageses
	 */
	public static List<MedicalApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @return the range of medical application stageses
	 */
	public static List<MedicalApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical application stageses
	 */
	public static List<MedicalApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical application stageses
	 * @param end the upper bound of the range of medical application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical application stageses
	 */
	public static List<MedicalApplicationStages> findAll(
		int start, int end,
		OrderByComparator<MedicalApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical application stageses.
	 *
	 * @return the number of medical application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalApplicationStagesPersistence _persistence;

}