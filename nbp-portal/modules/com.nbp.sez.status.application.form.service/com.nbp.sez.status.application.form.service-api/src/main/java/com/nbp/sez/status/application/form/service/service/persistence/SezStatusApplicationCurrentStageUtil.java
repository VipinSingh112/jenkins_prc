/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezStatusApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez status application current stage service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezStatusApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationCurrentStagePersistence
 * @generated
 */
public class SezStatusApplicationCurrentStageUtil {

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
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		getPersistence().clearCache(sezStatusApplicationCurrentStage);
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
	public static Map<Serializable, SezStatusApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezStatusApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezStatusApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezStatusApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezStatusApplicationCurrentStage update(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		return getPersistence().update(sezStatusApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezStatusApplicationCurrentStage update(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezStatusApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns all the sez status application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid) {

		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the sez status application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of matching sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage fetchByUuid_First(
		String uuid,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the sez status application current stages before and after the current sez status application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param sezStageId the primary key of the current sez status application current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	public static SezStatusApplicationCurrentStage[] findByUuid_PrevAndNext(
			long sezStageId, String uuid,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			sezStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the sez status application current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of sez status application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching sez status application current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the sez status application current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSezStatusApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the sez status application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the sez status application current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the sez status application current stage that was removed
	 */
	public static SezStatusApplicationCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of sez status application current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching sez status application current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of matching sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the sez status application current stages before and after the current sez status application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param sezStageId the primary key of the current sez status application current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	public static SezStatusApplicationCurrentStage[] findByUuid_C_PrevAndNext(
			long sezStageId, String uuid, long companyId,
			OrderByComparator<SezStatusApplicationCurrentStage>
				orderByComparator)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			sezStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the sez status application current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of sez status application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching sez status application current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the sez status application current stage where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage findBygetSEZ_Stage_SAI(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().findBygetSEZ_Stage_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the sez status application current stage where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage fetchBygetSEZ_Stage_SAI(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSEZ_Stage_SAI(sezStatusApplicationId);
	}

	/**
	 * Returns the sez status application current stage where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application current stage, or <code>null</code> if a matching sez status application current stage could not be found
	 */
	public static SezStatusApplicationCurrentStage fetchBygetSEZ_Stage_SAI(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSEZ_Stage_SAI(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez status application current stage where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status application current stage that was removed
	 */
	public static SezStatusApplicationCurrentStage removeBygetSEZ_Stage_SAI(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().removeBygetSEZ_Stage_SAI(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez status application current stages where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status application current stages
	 */
	public static int countBygetSEZ_Stage_SAI(long sezStatusApplicationId) {
		return getPersistence().countBygetSEZ_Stage_SAI(sezStatusApplicationId);
	}

	/**
	 * Caches the sez status application current stage in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationCurrentStage the sez status application current stage
	 */
	public static void cacheResult(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		getPersistence().cacheResult(sezStatusApplicationCurrentStage);
	}

	/**
	 * Caches the sez status application current stages in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplicationCurrentStages the sez status application current stages
	 */
	public static void cacheResult(
		List<SezStatusApplicationCurrentStage>
			sezStatusApplicationCurrentStages) {

		getPersistence().cacheResult(sezStatusApplicationCurrentStages);
	}

	/**
	 * Creates a new sez status application current stage with the primary key. Does not add the sez status application current stage to the database.
	 *
	 * @param sezStageId the primary key for the new sez status application current stage
	 * @return the new sez status application current stage
	 */
	public static SezStatusApplicationCurrentStage create(long sezStageId) {
		return getPersistence().create(sezStageId);
	}

	/**
	 * Removes the sez status application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage that was removed
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	public static SezStatusApplicationCurrentStage remove(long sezStageId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().remove(sezStageId);
	}

	public static SezStatusApplicationCurrentStage updateImpl(
		SezStatusApplicationCurrentStage sezStatusApplicationCurrentStage) {

		return getPersistence().updateImpl(sezStatusApplicationCurrentStage);
	}

	/**
	 * Returns the sez status application current stage with the primary key or throws a <code>NoSuchSezStatusApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage
	 * @throws NoSuchSezStatusApplicationCurrentStageException if a sez status application current stage with the primary key could not be found
	 */
	public static SezStatusApplicationCurrentStage findByPrimaryKey(
			long sezStageId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(sezStageId);
	}

	/**
	 * Returns the sez status application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStageId the primary key of the sez status application current stage
	 * @return the sez status application current stage, or <code>null</code> if a sez status application current stage with the primary key could not be found
	 */
	public static SezStatusApplicationCurrentStage fetchByPrimaryKey(
		long sezStageId) {

		return getPersistence().fetchByPrimaryKey(sezStageId);
	}

	/**
	 * Returns all the sez status application current stages.
	 *
	 * @return the sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @return the range of sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez status application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status application current stages
	 * @param end the upper bound of the range of sez status application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status application current stages
	 */
	public static List<SezStatusApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez status application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez status application current stages.
	 *
	 * @return the number of sez status application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezStatusApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezStatusApplicationCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezStatusApplicationCurrentStagePersistence
		_persistence;

}