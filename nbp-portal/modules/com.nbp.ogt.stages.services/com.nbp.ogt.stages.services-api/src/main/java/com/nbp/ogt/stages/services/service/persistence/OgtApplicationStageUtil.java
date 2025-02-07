/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.stages.services.model.OgtApplicationStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ogt application stage service. This utility wraps <code>com.nbp.ogt.stages.services.service.persistence.impl.OgtApplicationStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationStagePersistence
 * @generated
 */
public class OgtApplicationStageUtil {

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
	public static void clearCache(OgtApplicationStage ogtApplicationStage) {
		getPersistence().clearCache(ogtApplicationStage);
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
	public static Map<Serializable, OgtApplicationStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OgtApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OgtApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OgtApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OgtApplicationStage update(
		OgtApplicationStage ogtApplicationStage) {

		return getPersistence().update(ogtApplicationStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OgtApplicationStage update(
		OgtApplicationStage ogtApplicationStage,
		ServiceContext serviceContext) {

		return getPersistence().update(ogtApplicationStage, serviceContext);
	}

	/**
	 * Returns all the ogt application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ogt application stages
	 */
	public static List<OgtApplicationStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the ogt application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchByUuid_First(
		String uuid, OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchByUuid_Last(
		String uuid, OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where uuid = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public static OgtApplicationStage[] findByUuid_PrevAndNext(
			long ogtStagesId, String uuid,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findByUuid_PrevAndNext(
			ogtStagesId, uuid, orderByComparator);
	}

	/**
	 * Removes all the ogt application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of ogt application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ogt application stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the ogt application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ogt application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ogt application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the ogt application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ogt application stage that was removed
	 */
	public static OgtApplicationStage removeByUUID_G(String uuid, long groupId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of ogt application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ogt application stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ogt application stages
	 */
	public static List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public static OgtApplicationStage[] findByUuid_C_PrevAndNext(
			long ogtStagesId, String uuid, long companyId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			ogtStagesId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the ogt application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of ogt application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ogt application stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the ogt application stage where ogtApplicationId = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findBygetOgt_AI(long ogtApplicationId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_AI(ogtApplicationId);
	}

	/**
	 * Returns the ogt application stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_AI(long ogtApplicationId) {
		return getPersistence().fetchBygetOgt_AI(ogtApplicationId);
	}

	/**
	 * Returns the ogt application stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_AI(
		long ogtApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOgt_AI(
			ogtApplicationId, useFinderCache);
	}

	/**
	 * Removes the ogt application stage where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt application stage that was removed
	 */
	public static OgtApplicationStage removeBygetOgt_AI(long ogtApplicationId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().removeBygetOgt_AI(ogtApplicationId);
	}

	/**
	 * Returns the number of ogt application stages where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt application stages
	 */
	public static int countBygetOgt_AI(long ogtApplicationId) {
		return getPersistence().countBygetOgt_AI(ogtApplicationId);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findBygetOgt_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetOgt_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetOgt_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the ogt application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the ogt application stage that was removed
	 */
	public static OgtApplicationStage removeBygetOgt_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().removeBygetOgt_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching ogt application stages
	 */
	public static int countBygetOgt_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetOgt_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findBygetOgt_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetOgt_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetOgt_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the ogt application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the ogt application stage that was removed
	 */
	public static OgtApplicationStage removeBygetOgt_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().removeBygetOgt_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching ogt application stages
	 */
	public static int countBygetOgt_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetOgt_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findBygetOgt_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetOgt_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetOgt_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the ogt application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the ogt application stage that was removed
	 */
	public static OgtApplicationStage removeBygetOgt_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().removeBygetOgt_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching ogt application stages
	 */
	public static int countBygetOgt_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetOgt_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the ogt application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application stages
	 */
	public static List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId) {

		return getPersistence().findBygetOgt_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the ogt application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetOgt_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().findBygetOgt_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findBygetOgt_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOgt_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findBygetOgt_By_CaseId_First(
			String caseId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CaseId_First(
		String caseId,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetOgt_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findBygetOgt_By_CaseId_Last(
			String caseId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CaseId_Last(
		String caseId,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetOgt_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where caseId = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public static OgtApplicationStage[] findBygetOgt_By_CaseId_PrevAndNext(
			long ogtStagesId, String caseId,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_CaseId_PrevAndNext(
			ogtStagesId, caseId, orderByComparator);
	}

	/**
	 * Removes all the ogt application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetOgt_By_CaseId(String caseId) {
		getPersistence().removeBygetOgt_By_CaseId(caseId);
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ogt application stages
	 */
	public static int countBygetOgt_By_CaseId(String caseId) {
		return getPersistence().countBygetOgt_By_CaseId(caseId);
	}

	/**
	 * Returns all the ogt application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching ogt application stages
	 */
	public static List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName) {

		return getPersistence().findBygetOgt_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the ogt application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetOgt_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().findBygetOgt_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt application stages
	 */
	public static List<OgtApplicationStage> findBygetOgt_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOgt_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findBygetOgt_By_StageName_First(
			String stageName,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_StageName_First(
		String stageName,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetOgt_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findBygetOgt_By_StageName_Last(
			String stageName,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_StageName_Last(
		String stageName,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetOgt_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the ogt application stages before and after the current ogt application stage in the ordered set where stageName = &#63;.
	 *
	 * @param ogtStagesId the primary key of the current ogt application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public static OgtApplicationStage[] findBygetOgt_By_StageName_PrevAndNext(
			long ogtStagesId, String stageName,
			OrderByComparator<OgtApplicationStage> orderByComparator)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_StageName_PrevAndNext(
			ogtStagesId, stageName, orderByComparator);
	}

	/**
	 * Removes all the ogt application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetOgt_By_StageName(String stageName) {
		getPersistence().removeBygetOgt_By_StageName(stageName);
	}

	/**
	 * Returns the number of ogt application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching ogt application stages
	 */
	public static int countBygetOgt_By_StageName(String stageName) {
		return getPersistence().countBygetOgt_By_StageName(stageName);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage findBygetOgt_By_CI(String caseId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findBygetOgt_By_CI(caseId);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CI(String caseId) {
		return getPersistence().fetchBygetOgt_By_CI(caseId);
	}

	/**
	 * Returns the ogt application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application stage, or <code>null</code> if a matching ogt application stage could not be found
	 */
	public static OgtApplicationStage fetchBygetOgt_By_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetOgt_By_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the ogt application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ogt application stage that was removed
	 */
	public static OgtApplicationStage removeBygetOgt_By_CI(String caseId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().removeBygetOgt_By_CI(caseId);
	}

	/**
	 * Returns the number of ogt application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ogt application stages
	 */
	public static int countBygetOgt_By_CI(String caseId) {
		return getPersistence().countBygetOgt_By_CI(caseId);
	}

	/**
	 * Caches the ogt application stage in the entity cache if it is enabled.
	 *
	 * @param ogtApplicationStage the ogt application stage
	 */
	public static void cacheResult(OgtApplicationStage ogtApplicationStage) {
		getPersistence().cacheResult(ogtApplicationStage);
	}

	/**
	 * Caches the ogt application stages in the entity cache if it is enabled.
	 *
	 * @param ogtApplicationStages the ogt application stages
	 */
	public static void cacheResult(
		List<OgtApplicationStage> ogtApplicationStages) {

		getPersistence().cacheResult(ogtApplicationStages);
	}

	/**
	 * Creates a new ogt application stage with the primary key. Does not add the ogt application stage to the database.
	 *
	 * @param ogtStagesId the primary key for the new ogt application stage
	 * @return the new ogt application stage
	 */
	public static OgtApplicationStage create(long ogtStagesId) {
		return getPersistence().create(ogtStagesId);
	}

	/**
	 * Removes the ogt application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage that was removed
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public static OgtApplicationStage remove(long ogtStagesId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().remove(ogtStagesId);
	}

	public static OgtApplicationStage updateImpl(
		OgtApplicationStage ogtApplicationStage) {

		return getPersistence().updateImpl(ogtApplicationStage);
	}

	/**
	 * Returns the ogt application stage with the primary key or throws a <code>NoSuchOgtApplicationStageException</code> if it could not be found.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage
	 * @throws NoSuchOgtApplicationStageException if a ogt application stage with the primary key could not be found
	 */
	public static OgtApplicationStage findByPrimaryKey(long ogtStagesId)
		throws com.nbp.ogt.stages.services.exception.
			NoSuchOgtApplicationStageException {

		return getPersistence().findByPrimaryKey(ogtStagesId);
	}

	/**
	 * Returns the ogt application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtStagesId the primary key of the ogt application stage
	 * @return the ogt application stage, or <code>null</code> if a ogt application stage with the primary key could not be found
	 */
	public static OgtApplicationStage fetchByPrimaryKey(long ogtStagesId) {
		return getPersistence().fetchByPrimaryKey(ogtStagesId);
	}

	/**
	 * Returns all the ogt application stages.
	 *
	 * @return the ogt application stages
	 */
	public static List<OgtApplicationStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @return the range of ogt application stages
	 */
	public static List<OgtApplicationStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt application stages
	 */
	public static List<OgtApplicationStage> findAll(
		int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt application stages
	 * @param end the upper bound of the range of ogt application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt application stages
	 */
	public static List<OgtApplicationStage> findAll(
		int start, int end,
		OrderByComparator<OgtApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ogt application stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ogt application stages.
	 *
	 * @return the number of ogt application stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OgtApplicationStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OgtApplicationStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OgtApplicationStagePersistence _persistence;

}