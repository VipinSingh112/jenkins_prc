/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.application.form.service.model.JADSCCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc current stage service. This utility wraps <code>com.nbp.jadsc.application.form.service.service.persistence.impl.JADSCCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCurrentStagePersistence
 * @generated
 */
public class JADSCCurrentStageUtil {

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
	public static void clearCache(JADSCCurrentStage jadscCurrentStage) {
		getPersistence().clearCache(jadscCurrentStage);
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
	public static Map<Serializable, JADSCCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JADSCCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JADSCCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JADSCCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JADSCCurrentStage update(
		JADSCCurrentStage jadscCurrentStage) {

		return getPersistence().update(jadscCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JADSCCurrentStage update(
		JADSCCurrentStage jadscCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(jadscCurrentStage, serviceContext);
	}

	/**
	 * Returns all the jadsc current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc current stages
	 */
	public static List<JADSCCurrentStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of matching jadsc current stages
	 */
	public static List<JADSCCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc current stages
	 */
	public static List<JADSCCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc current stages
	 */
	public static List<JADSCCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage findByUuid_First(
			String uuid, OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage fetchByUuid_First(
		String uuid, OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage findByUuid_Last(
			String uuid, OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage fetchByUuid_Last(
		String uuid, OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc current stages before and after the current jadsc current stage in the ordered set where uuid = &#63;.
	 *
	 * @param jadscCurrentStageId the primary key of the current jadsc current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	public static JADSCCurrentStage[] findByUuid_PrevAndNext(
			long jadscCurrentStageId, String uuid,
			OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscCurrentStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc current stage that was removed
	 */
	public static JADSCCurrentStage removeByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc current stages
	 */
	public static List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of matching jadsc current stages
	 */
	public static List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc current stages
	 */
	public static List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc current stages
	 */
	public static List<JADSCCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc current stages before and after the current jadsc current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscCurrentStageId the primary key of the current jadsc current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	public static JADSCCurrentStage[] findByUuid_C_PrevAndNext(
			long jadscCurrentStageId, String uuid, long companyId,
			OrderByComparator<JADSCCurrentStage> orderByComparator)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscCurrentStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the jadsc current stage where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCCurrentStageException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage findBygetByJadsc_Stage(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().findBygetByJadsc_Stage(jadscApplicationId);
	}

	/**
	 * Returns the jadsc current stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage fetchBygetByJadsc_Stage(
		long jadscApplicationId) {

		return getPersistence().fetchBygetByJadsc_Stage(jadscApplicationId);
	}

	/**
	 * Returns the jadsc current stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc current stage, or <code>null</code> if a matching jadsc current stage could not be found
	 */
	public static JADSCCurrentStage fetchBygetByJadsc_Stage(
		long jadscApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetByJadsc_Stage(
			jadscApplicationId, useFinderCache);
	}

	/**
	 * Removes the jadsc current stage where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc current stage that was removed
	 */
	public static JADSCCurrentStage removeBygetByJadsc_Stage(
			long jadscApplicationId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().removeBygetByJadsc_Stage(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc current stages where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc current stages
	 */
	public static int countBygetByJadsc_Stage(long jadscApplicationId) {
		return getPersistence().countBygetByJadsc_Stage(jadscApplicationId);
	}

	/**
	 * Caches the jadsc current stage in the entity cache if it is enabled.
	 *
	 * @param jadscCurrentStage the jadsc current stage
	 */
	public static void cacheResult(JADSCCurrentStage jadscCurrentStage) {
		getPersistence().cacheResult(jadscCurrentStage);
	}

	/**
	 * Caches the jadsc current stages in the entity cache if it is enabled.
	 *
	 * @param jadscCurrentStages the jadsc current stages
	 */
	public static void cacheResult(List<JADSCCurrentStage> jadscCurrentStages) {
		getPersistence().cacheResult(jadscCurrentStages);
	}

	/**
	 * Creates a new jadsc current stage with the primary key. Does not add the jadsc current stage to the database.
	 *
	 * @param jadscCurrentStageId the primary key for the new jadsc current stage
	 * @return the new jadsc current stage
	 */
	public static JADSCCurrentStage create(long jadscCurrentStageId) {
		return getPersistence().create(jadscCurrentStageId);
	}

	/**
	 * Removes the jadsc current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage that was removed
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	public static JADSCCurrentStage remove(long jadscCurrentStageId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().remove(jadscCurrentStageId);
	}

	public static JADSCCurrentStage updateImpl(
		JADSCCurrentStage jadscCurrentStage) {

		return getPersistence().updateImpl(jadscCurrentStage);
	}

	/**
	 * Returns the jadsc current stage with the primary key or throws a <code>NoSuchJADSCCurrentStageException</code> if it could not be found.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage
	 * @throws NoSuchJADSCCurrentStageException if a jadsc current stage with the primary key could not be found
	 */
	public static JADSCCurrentStage findByPrimaryKey(long jadscCurrentStageId)
		throws com.nbp.jadsc.application.form.service.exception.
			NoSuchJADSCCurrentStageException {

		return getPersistence().findByPrimaryKey(jadscCurrentStageId);
	}

	/**
	 * Returns the jadsc current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscCurrentStageId the primary key of the jadsc current stage
	 * @return the jadsc current stage, or <code>null</code> if a jadsc current stage with the primary key could not be found
	 */
	public static JADSCCurrentStage fetchByPrimaryKey(
		long jadscCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(jadscCurrentStageId);
	}

	/**
	 * Returns all the jadsc current stages.
	 *
	 * @return the jadsc current stages
	 */
	public static List<JADSCCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @return the range of jadsc current stages
	 */
	public static List<JADSCCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc current stages
	 */
	public static List<JADSCCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc current stages
	 * @param end the upper bound of the range of jadsc current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc current stages
	 */
	public static List<JADSCCurrentStage> findAll(
		int start, int end,
		OrderByComparator<JADSCCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc current stages.
	 *
	 * @return the number of jadsc current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JADSCCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JADSCCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JADSCCurrentStagePersistence _persistence;

}