/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.stages.services.model.NcraApplicationStages;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncra application stages service. This utility wraps <code>com.nbp.ncra.stages.services.service.persistence.impl.NcraApplicationStagesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationStagesPersistence
 * @generated
 */
public class NcraApplicationStagesUtil {

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
	public static void clearCache(NcraApplicationStages ncraApplicationStages) {
		getPersistence().clearCache(ncraApplicationStages);
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
	public static Map<Serializable, NcraApplicationStages> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcraApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcraApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcraApplicationStages> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcraApplicationStages update(
		NcraApplicationStages ncraApplicationStages) {

		return getPersistence().update(ncraApplicationStages);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcraApplicationStages update(
		NcraApplicationStages ncraApplicationStages,
		ServiceContext serviceContext) {

		return getPersistence().update(ncraApplicationStages, serviceContext);
	}

	/**
	 * Returns all the ncra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the ncra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public static NcraApplicationStages[] findByUuid_PrevAndNext(
			long ncraApplciationStage, String uuid,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByUuid_PrevAndNext(
			ncraApplciationStage, uuid, orderByComparator);
	}

	/**
	 * Removes all the ncra application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of ncra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncra application stageses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the ncra application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByUUID_G(String uuid, long groupId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ncra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the ncra application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncra application stages that was removed
	 */
	public static NcraApplicationStages removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of ncra application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncra application stageses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public static NcraApplicationStages[] findByUuid_C_PrevAndNext(
			long ncraApplciationStage, String uuid, long companyId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			ncraApplciationStage, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the ncra application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncra application stageses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the ncra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId) {

		return getPersistence().findByget_NCRA_AppStage_By_CI(caseId);
	}

	/**
	 * Returns a range of all the ncra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId, int start, int end) {

		return getPersistence().findByget_NCRA_AppStage_By_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().findByget_NCRA_AppStage_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByget_NCRA_AppStage_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByget_NCRA_AppStage_By_CI_First(
			String caseId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_AppStage_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_AppStage_By_CI_First(
		String caseId,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().fetchByget_NCRA_AppStage_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByget_NCRA_AppStage_By_CI_Last(
			String caseId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_AppStage_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_AppStage_By_CI_Last(
		String caseId,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().fetchByget_NCRA_AppStage_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public static NcraApplicationStages[]
			findByget_NCRA_AppStage_By_CI_PrevAndNext(
				long ncraApplciationStage, String caseId,
				OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_AppStage_By_CI_PrevAndNext(
			ncraApplciationStage, caseId, orderByComparator);
	}

	/**
	 * Removes all the ncra application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeByget_NCRA_AppStage_By_CI(String caseId) {
		getPersistence().removeByget_NCRA_AppStage_By_CI(caseId);
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra application stageses
	 */
	public static int countByget_NCRA_AppStage_By_CI(String caseId) {
		return getPersistence().countByget_NCRA_AppStage_By_CI(caseId);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByget_NCRA_AppStage_CI(
			String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_AppStage_CI(caseId);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_AppStage_CI(
		String caseId) {

		return getPersistence().fetchByget_NCRA_AppStage_CI(caseId);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_AppStage_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchByget_NCRA_AppStage_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the ncra application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncra application stages that was removed
	 */
	public static NcraApplicationStages removeByget_NCRA_AppStage_CI(
			String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().removeByget_NCRA_AppStage_CI(caseId);
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra application stageses
	 */
	public static int countByget_NCRA_AppStage_CI(String caseId) {
		return getPersistence().countByget_NCRA_AppStage_CI(caseId);
	}

	/**
	 * Returns all the ncra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName) {

		return getPersistence().findByget_NCRA_By_SN(stageName);
	}

	/**
	 * Returns a range of all the ncra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName, int start, int end) {

		return getPersistence().findByget_NCRA_By_SN(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().findByget_NCRA_By_SN(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	public static List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByget_NCRA_By_SN(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByget_NCRA_By_SN_First(
			String stageName,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_By_SN_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_SN_First(
		String stageName,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().fetchByget_NCRA_By_SN_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByget_NCRA_By_SN_Last(
			String stageName,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_By_SN_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_SN_Last(
		String stageName,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().fetchByget_NCRA_By_SN_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public static NcraApplicationStages[] findByget_NCRA_By_SN_PrevAndNext(
			long ncraApplciationStage, String stageName,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_By_SN_PrevAndNext(
			ncraApplciationStage, stageName, orderByComparator);
	}

	/**
	 * Removes all the ncra application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeByget_NCRA_By_SN(String stageName) {
		getPersistence().removeByget_NCRA_By_SN(stageName);
	}

	/**
	 * Returns the number of ncra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching ncra application stageses
	 */
	public static int countByget_NCRA_By_SN(String stageName) {
		return getPersistence().countByget_NCRA_By_SN(stageName);
	}

	/**
	 * Returns the ncra application stages where stageStatus = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByget_NCRA_By_Status(
			String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_By_Status(stageStatus);
	}

	/**
	 * Returns the ncra application stages where stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_Status(
		String stageStatus) {

		return getPersistence().fetchByget_NCRA_By_Status(stageStatus);
	}

	/**
	 * Returns the ncra application stages where stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_Status(
		String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchByget_NCRA_By_Status(
			stageStatus, useFinderCache);
	}

	/**
	 * Removes the ncra application stages where stageStatus = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @return the ncra application stages that was removed
	 */
	public static NcraApplicationStages removeByget_NCRA_By_Status(
			String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().removeByget_NCRA_By_Status(stageStatus);
	}

	/**
	 * Returns the number of ncra application stageses where stageStatus = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @return the number of matching ncra application stageses
	 */
	public static int countByget_NCRA_By_Status(String stageStatus) {
		return getPersistence().countByget_NCRA_By_Status(stageStatus);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByget_NCRA_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_By_CI_SN_SS(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchByget_NCRA_By_CI_SN_SS(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchByget_NCRA_By_CI_SN_SS(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the ncra application stages that was removed
	 */
	public static NcraApplicationStages removeByget_NCRA_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().removeByget_NCRA_By_CI_SN_SS(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching ncra application stageses
	 */
	public static int countByget_NCRA_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countByget_NCRA_By_CI_SN_SS(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByget_NCRA_By_CI_SN(
			String caseId, String stageName)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_By_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_CI_SN(
		String caseId, String stageName) {

		return getPersistence().fetchByget_NCRA_By_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_CI_SN(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchByget_NCRA_By_CI_SN(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the ncra application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the ncra application stages that was removed
	 */
	public static NcraApplicationStages removeByget_NCRA_By_CI_SN(
			String caseId, String stageName)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().removeByget_NCRA_By_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching ncra application stageses
	 */
	public static int countByget_NCRA_By_CI_SN(
		String caseId, String stageName) {

		return getPersistence().countByget_NCRA_By_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages findByget_NCRA_By_CI_SS(
			String caseId, String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByget_NCRA_By_CI_SS(caseId, stageStatus);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_CI_SS(
		String caseId, String stageStatus) {

		return getPersistence().fetchByget_NCRA_By_CI_SS(caseId, stageStatus);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	public static NcraApplicationStages fetchByget_NCRA_By_CI_SS(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchByget_NCRA_By_CI_SS(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the ncra application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the ncra application stages that was removed
	 */
	public static NcraApplicationStages removeByget_NCRA_By_CI_SS(
			String caseId, String stageStatus)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().removeByget_NCRA_By_CI_SS(caseId, stageStatus);
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching ncra application stageses
	 */
	public static int countByget_NCRA_By_CI_SS(
		String caseId, String stageStatus) {

		return getPersistence().countByget_NCRA_By_CI_SS(caseId, stageStatus);
	}

	/**
	 * Caches the ncra application stages in the entity cache if it is enabled.
	 *
	 * @param ncraApplicationStages the ncra application stages
	 */
	public static void cacheResult(
		NcraApplicationStages ncraApplicationStages) {

		getPersistence().cacheResult(ncraApplicationStages);
	}

	/**
	 * Caches the ncra application stageses in the entity cache if it is enabled.
	 *
	 * @param ncraApplicationStageses the ncra application stageses
	 */
	public static void cacheResult(
		List<NcraApplicationStages> ncraApplicationStageses) {

		getPersistence().cacheResult(ncraApplicationStageses);
	}

	/**
	 * Creates a new ncra application stages with the primary key. Does not add the ncra application stages to the database.
	 *
	 * @param ncraApplciationStage the primary key for the new ncra application stages
	 * @return the new ncra application stages
	 */
	public static NcraApplicationStages create(long ncraApplciationStage) {
		return getPersistence().create(ncraApplciationStage);
	}

	/**
	 * Removes the ncra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages that was removed
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public static NcraApplicationStages remove(long ncraApplciationStage)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().remove(ncraApplciationStage);
	}

	public static NcraApplicationStages updateImpl(
		NcraApplicationStages ncraApplicationStages) {

		return getPersistence().updateImpl(ncraApplicationStages);
	}

	/**
	 * Returns the ncra application stages with the primary key or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	public static NcraApplicationStages findByPrimaryKey(
			long ncraApplciationStage)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraApplicationStagesException {

		return getPersistence().findByPrimaryKey(ncraApplciationStage);
	}

	/**
	 * Returns the ncra application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages, or <code>null</code> if a ncra application stages with the primary key could not be found
	 */
	public static NcraApplicationStages fetchByPrimaryKey(
		long ncraApplciationStage) {

		return getPersistence().fetchByPrimaryKey(ncraApplciationStage);
	}

	/**
	 * Returns all the ncra application stageses.
	 *
	 * @return the ncra application stageses
	 */
	public static List<NcraApplicationStages> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of ncra application stageses
	 */
	public static List<NcraApplicationStages> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra application stageses
	 */
	public static List<NcraApplicationStages> findAll(
		int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra application stageses
	 */
	public static List<NcraApplicationStages> findAll(
		int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncra application stageses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncra application stageses.
	 *
	 * @return the number of ncra application stageses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcraApplicationStagesPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcraApplicationStagesPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcraApplicationStagesPersistence _persistence;

}