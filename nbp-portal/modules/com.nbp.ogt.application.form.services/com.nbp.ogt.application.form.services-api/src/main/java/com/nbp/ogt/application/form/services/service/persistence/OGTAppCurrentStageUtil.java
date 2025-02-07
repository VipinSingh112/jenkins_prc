/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OGTAppCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ogt app current stage service. This utility wraps <code>com.nbp.ogt.application.form.services.service.persistence.impl.OGTAppCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OGTAppCurrentStagePersistence
 * @generated
 */
public class OGTAppCurrentStageUtil {

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
	public static void clearCache(OGTAppCurrentStage ogtAppCurrentStage) {
		getPersistence().clearCache(ogtAppCurrentStage);
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
	public static Map<Serializable, OGTAppCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OGTAppCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OGTAppCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OGTAppCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OGTAppCurrentStage update(
		OGTAppCurrentStage ogtAppCurrentStage) {

		return getPersistence().update(ogtAppCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OGTAppCurrentStage update(
		OGTAppCurrentStage ogtAppCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(ogtAppCurrentStage, serviceContext);
	}

	/**
	 * Returns all the ogt app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the ogt app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of matching ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the ogt app current stages before and after the current ogt app current stage in the ordered set where uuid = &#63;.
	 *
	 * @param ogtAppCurrentStageId the primary key of the current ogt app current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	public static OGTAppCurrentStage[] findByUuid_PrevAndNext(
			long ogtAppCurrentStageId, String uuid,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			ogtAppCurrentStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the ogt app current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of ogt app current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ogt app current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the ogt app current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOGTAppCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ogt app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the ogt app current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the ogt app current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ogt app current stage that was removed
	 */
	public static OGTAppCurrentStage removeByUUID_G(String uuid, long groupId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of ogt app current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ogt app current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of matching ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the ogt app current stages before and after the current ogt app current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ogtAppCurrentStageId the primary key of the current ogt app current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	public static OGTAppCurrentStage[] findByUuid_C_PrevAndNext(
			long ogtAppCurrentStageId, String uuid, long companyId,
			OrderByComparator<OGTAppCurrentStage> orderByComparator)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			ogtAppCurrentStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the ogt app current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of ogt app current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ogt app current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the ogt app current stage where ogtApplicationId = &#63; or throws a <code>NoSuchOGTAppCurrentStageException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage findBygetByOGT_Stage(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().findBygetByOGT_Stage(ogtApplicationId);
	}

	/**
	 * Returns the ogt app current stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage fetchBygetByOGT_Stage(
		long ogtApplicationId) {

		return getPersistence().fetchBygetByOGT_Stage(ogtApplicationId);
	}

	/**
	 * Returns the ogt app current stage where ogtApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt app current stage, or <code>null</code> if a matching ogt app current stage could not be found
	 */
	public static OGTAppCurrentStage fetchBygetByOGT_Stage(
		long ogtApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetByOGT_Stage(
			ogtApplicationId, useFinderCache);
	}

	/**
	 * Removes the ogt app current stage where ogtApplicationId = &#63; from the database.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the ogt app current stage that was removed
	 */
	public static OGTAppCurrentStage removeBygetByOGT_Stage(
			long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().removeBygetByOGT_Stage(ogtApplicationId);
	}

	/**
	 * Returns the number of ogt app current stages where ogtApplicationId = &#63;.
	 *
	 * @param ogtApplicationId the ogt application ID
	 * @return the number of matching ogt app current stages
	 */
	public static int countBygetByOGT_Stage(long ogtApplicationId) {
		return getPersistence().countBygetByOGT_Stage(ogtApplicationId);
	}

	/**
	 * Caches the ogt app current stage in the entity cache if it is enabled.
	 *
	 * @param ogtAppCurrentStage the ogt app current stage
	 */
	public static void cacheResult(OGTAppCurrentStage ogtAppCurrentStage) {
		getPersistence().cacheResult(ogtAppCurrentStage);
	}

	/**
	 * Caches the ogt app current stages in the entity cache if it is enabled.
	 *
	 * @param ogtAppCurrentStages the ogt app current stages
	 */
	public static void cacheResult(
		List<OGTAppCurrentStage> ogtAppCurrentStages) {

		getPersistence().cacheResult(ogtAppCurrentStages);
	}

	/**
	 * Creates a new ogt app current stage with the primary key. Does not add the ogt app current stage to the database.
	 *
	 * @param ogtAppCurrentStageId the primary key for the new ogt app current stage
	 * @return the new ogt app current stage
	 */
	public static OGTAppCurrentStage create(long ogtAppCurrentStageId) {
		return getPersistence().create(ogtAppCurrentStageId);
	}

	/**
	 * Removes the ogt app current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage that was removed
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	public static OGTAppCurrentStage remove(long ogtAppCurrentStageId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().remove(ogtAppCurrentStageId);
	}

	public static OGTAppCurrentStage updateImpl(
		OGTAppCurrentStage ogtAppCurrentStage) {

		return getPersistence().updateImpl(ogtAppCurrentStage);
	}

	/**
	 * Returns the ogt app current stage with the primary key or throws a <code>NoSuchOGTAppCurrentStageException</code> if it could not be found.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage
	 * @throws NoSuchOGTAppCurrentStageException if a ogt app current stage with the primary key could not be found
	 */
	public static OGTAppCurrentStage findByPrimaryKey(long ogtAppCurrentStageId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOGTAppCurrentStageException {

		return getPersistence().findByPrimaryKey(ogtAppCurrentStageId);
	}

	/**
	 * Returns the ogt app current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtAppCurrentStageId the primary key of the ogt app current stage
	 * @return the ogt app current stage, or <code>null</code> if a ogt app current stage with the primary key could not be found
	 */
	public static OGTAppCurrentStage fetchByPrimaryKey(
		long ogtAppCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(ogtAppCurrentStageId);
	}

	/**
	 * Returns all the ogt app current stages.
	 *
	 * @return the ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @return the range of ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ogt app current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OGTAppCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt app current stages
	 * @param end the upper bound of the range of ogt app current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt app current stages
	 */
	public static List<OGTAppCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OGTAppCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ogt app current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ogt app current stages.
	 *
	 * @return the number of ogt app current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OGTAppCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OGTAppCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OGTAppCurrentStagePersistence _persistence;

}