/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade application stage service. This utility wraps <code>com.nbp.fire.brigade.stage.service.service.persistence.impl.FireBrigadeApplicationStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationStagePersistence
 * @generated
 */
public class FireBrigadeApplicationStageUtil {

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
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		getPersistence().clearCache(fireBrigadeApplicationStage);
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
	public static Map<Serializable, FireBrigadeApplicationStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadeApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadeApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadeApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadeApplicationStage update(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		return getPersistence().update(fireBrigadeApplicationStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadeApplicationStage update(
		FireBrigadeApplicationStage fireBrigadeApplicationStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			fireBrigadeApplicationStage, serviceContext);
	}

	/**
	 * Returns all the fire brigade application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the fire brigade application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByUuid_First(
		String uuid,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public static FireBrigadeApplicationStage[] findByUuid_PrevAndNext(
			long fireBrigadeAppStageId, String uuid,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByUuid_PrevAndNext(
			fireBrigadeAppStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the fire brigade application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of fire brigade application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the fire brigade application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the fire brigade application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the fire brigade application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the fire brigade application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the fire brigade application stage that was removed
	 */
	public static FireBrigadeApplicationStage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of fire brigade application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public static FireBrigadeApplicationStage[] findByUuid_C_PrevAndNext(
			long fireBrigadeAppStageId, String uuid, long companyId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			fireBrigadeAppStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the fire brigade application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the fire brigade application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByget_FB_AppStage_By_CI(
		String caseId) {

		return getPersistence().findByget_FB_AppStage_By_CI(caseId);
	}

	/**
	 * Returns a range of all the fire brigade application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByget_FB_AppStage_By_CI(
		String caseId, int start, int end) {

		return getPersistence().findByget_FB_AppStage_By_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByget_FB_AppStage_By_CI(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().findByget_FB_AppStage_By_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByget_FB_AppStage_By_CI(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByget_FB_AppStage_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByget_FB_AppStage_By_CI_First(
			String caseId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_AppStage_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage
		fetchByget_FB_AppStage_By_CI_First(
			String caseId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().fetchByget_FB_AppStage_By_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByget_FB_AppStage_By_CI_Last(
			String caseId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_AppStage_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_AppStage_By_CI_Last(
		String caseId,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().fetchByget_FB_AppStage_By_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public static FireBrigadeApplicationStage[]
			findByget_FB_AppStage_By_CI_PrevAndNext(
				long fireBrigadeAppStageId, String caseId,
				OrderByComparator<FireBrigadeApplicationStage>
					orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_AppStage_By_CI_PrevAndNext(
			fireBrigadeAppStageId, caseId, orderByComparator);
	}

	/**
	 * Removes all the fire brigade application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeByget_FB_AppStage_By_CI(String caseId) {
		getPersistence().removeByget_FB_AppStage_By_CI(caseId);
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByget_FB_AppStage_By_CI(String caseId) {
		return getPersistence().countByget_FB_AppStage_By_CI(caseId);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByget_FB_AppStage_CI(
			String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_AppStage_CI(caseId);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_AppStage_CI(
		String caseId) {

		return getPersistence().fetchByget_FB_AppStage_CI(caseId);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_AppStage_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchByget_FB_AppStage_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the fire brigade application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade application stage that was removed
	 */
	public static FireBrigadeApplicationStage removeByget_FB_AppStage_CI(
			String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().removeByget_FB_AppStage_CI(caseId);
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByget_FB_AppStage_CI(String caseId) {
		return getPersistence().countByget_FB_AppStage_CI(caseId);
	}

	/**
	 * Returns all the fire brigade application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName) {

		return getPersistence().findByget_FB_By_SN(stageName);
	}

	/**
	 * Returns a range of all the fire brigade application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName, int start, int end) {

		return getPersistence().findByget_FB_By_SN(stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().findByget_FB_By_SN(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByget_FB_By_SN(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByget_FB_By_SN_First(
			String stageName,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_By_SN_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_SN_First(
		String stageName,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().fetchByget_FB_By_SN_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByget_FB_By_SN_Last(
			String stageName,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_By_SN_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_SN_Last(
		String stageName,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().fetchByget_FB_By_SN_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public static FireBrigadeApplicationStage[] findByget_FB_By_SN_PrevAndNext(
			long fireBrigadeAppStageId, String stageName,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_By_SN_PrevAndNext(
			fireBrigadeAppStageId, stageName, orderByComparator);
	}

	/**
	 * Removes all the fire brigade application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeByget_FB_By_SN(String stageName) {
		getPersistence().removeByget_FB_By_SN(stageName);
	}

	/**
	 * Returns the number of fire brigade application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByget_FB_By_SN(String stageName) {
		return getPersistence().countByget_FB_By_SN(stageName);
	}

	/**
	 * Returns the fire brigade application stage where stageStatus = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByget_FB_By_Status(
			String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_By_Status(stageStatus);
	}

	/**
	 * Returns the fire brigade application stage where stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_Status(
		String stageStatus) {

		return getPersistence().fetchByget_FB_By_Status(stageStatus);
	}

	/**
	 * Returns the fire brigade application stage where stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_Status(
		String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchByget_FB_By_Status(
			stageStatus, useFinderCache);
	}

	/**
	 * Removes the fire brigade application stage where stageStatus = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @return the fire brigade application stage that was removed
	 */
	public static FireBrigadeApplicationStage removeByget_FB_By_Status(
			String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().removeByget_FB_By_Status(stageStatus);
	}

	/**
	 * Returns the number of fire brigade application stages where stageStatus = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByget_FB_By_Status(String stageStatus) {
		return getPersistence().countByget_FB_By_Status(stageStatus);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByget_FB_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_By_CI_SN_SS(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().fetchByget_FB_By_CI_SN_SS(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		return getPersistence().fetchByget_FB_By_CI_SN_SS(
			caseId, stageName, stageStatus, useFinderCache);
	}

	/**
	 * Removes the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the fire brigade application stage that was removed
	 */
	public static FireBrigadeApplicationStage removeByget_FB_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().removeByget_FB_By_CI_SN_SS(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByget_FB_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus) {

		return getPersistence().countByget_FB_By_CI_SN_SS(
			caseId, stageName, stageStatus);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByget_FB_By_CI_SN(
			String caseId, String stageName)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_By_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_CI_SN(
		String caseId, String stageName) {

		return getPersistence().fetchByget_FB_By_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_CI_SN(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchByget_FB_By_CI_SN(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the fire brigade application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the fire brigade application stage that was removed
	 */
	public static FireBrigadeApplicationStage removeByget_FB_By_CI_SN(
			String caseId, String stageName)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().removeByget_FB_By_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByget_FB_By_CI_SN(String caseId, String stageName) {
		return getPersistence().countByget_FB_By_CI_SN(caseId, stageName);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage findByget_FB_By_CI_SS(
			String caseId, String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByget_FB_By_CI_SS(caseId, stageStatus);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_CI_SS(
		String caseId, String stageStatus) {

		return getPersistence().fetchByget_FB_By_CI_SS(caseId, stageStatus);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	public static FireBrigadeApplicationStage fetchByget_FB_By_CI_SS(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchByget_FB_By_CI_SS(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the fire brigade application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the fire brigade application stage that was removed
	 */
	public static FireBrigadeApplicationStage removeByget_FB_By_CI_SS(
			String caseId, String stageStatus)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().removeByget_FB_By_CI_SS(caseId, stageStatus);
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching fire brigade application stages
	 */
	public static int countByget_FB_By_CI_SS(
		String caseId, String stageStatus) {

		return getPersistence().countByget_FB_By_CI_SS(caseId, stageStatus);
	}

	/**
	 * Caches the fire brigade application stage in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 */
	public static void cacheResult(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		getPersistence().cacheResult(fireBrigadeApplicationStage);
	}

	/**
	 * Caches the fire brigade application stages in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplicationStages the fire brigade application stages
	 */
	public static void cacheResult(
		List<FireBrigadeApplicationStage> fireBrigadeApplicationStages) {

		getPersistence().cacheResult(fireBrigadeApplicationStages);
	}

	/**
	 * Creates a new fire brigade application stage with the primary key. Does not add the fire brigade application stage to the database.
	 *
	 * @param fireBrigadeAppStageId the primary key for the new fire brigade application stage
	 * @return the new fire brigade application stage
	 */
	public static FireBrigadeApplicationStage create(
		long fireBrigadeAppStageId) {

		return getPersistence().create(fireBrigadeAppStageId);
	}

	/**
	 * Removes the fire brigade application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public static FireBrigadeApplicationStage remove(long fireBrigadeAppStageId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().remove(fireBrigadeAppStageId);
	}

	public static FireBrigadeApplicationStage updateImpl(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		return getPersistence().updateImpl(fireBrigadeApplicationStage);
	}

	/**
	 * Returns the fire brigade application stage with the primary key or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	public static FireBrigadeApplicationStage findByPrimaryKey(
			long fireBrigadeAppStageId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeApplicationStageException {

		return getPersistence().findByPrimaryKey(fireBrigadeAppStageId);
	}

	/**
	 * Returns the fire brigade application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage, or <code>null</code> if a fire brigade application stage with the primary key could not be found
	 */
	public static FireBrigadeApplicationStage fetchByPrimaryKey(
		long fireBrigadeAppStageId) {

		return getPersistence().fetchByPrimaryKey(fireBrigadeAppStageId);
	}

	/**
	 * Returns all the fire brigade application stages.
	 *
	 * @return the fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade application stages
	 */
	public static List<FireBrigadeApplicationStage> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade application stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade application stages.
	 *
	 * @return the number of fire brigade application stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadeApplicationStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadeApplicationStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadeApplicationStagePersistence _persistence;

}