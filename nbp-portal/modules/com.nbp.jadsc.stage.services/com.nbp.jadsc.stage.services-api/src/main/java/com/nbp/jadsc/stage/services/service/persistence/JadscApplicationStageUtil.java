/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscApplicationStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc application stage service. This utility wraps <code>com.nbp.jadsc.stage.services.service.persistence.impl.JadscApplicationStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscApplicationStagePersistence
 * @generated
 */
public class JadscApplicationStageUtil {

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
	public static void clearCache(JadscApplicationStage jadscApplicationStage) {
		getPersistence().clearCache(jadscApplicationStage);
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
	public static Map<Serializable, JadscApplicationStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JadscApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JadscApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JadscApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JadscApplicationStage update(
		JadscApplicationStage jadscApplicationStage) {

		return getPersistence().update(jadscApplicationStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JadscApplicationStage update(
		JadscApplicationStage jadscApplicationStage,
		ServiceContext serviceContext) {

		return getPersistence().update(jadscApplicationStage, serviceContext);
	}

	/**
	 * Returns all the jadsc application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the jadsc application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchByUuid_First(
		String uuid,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where uuid = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public static JadscApplicationStage[] findByUuid_PrevAndNext(
			long jadscAppStageId, String uuid,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findByUuid_PrevAndNext(
			jadscAppStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the jadsc application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of jadsc application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc application stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the jadsc application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findByUUID_G(String uuid, long groupId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the jadsc application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the jadsc application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc application stage that was removed
	 */
	public static JadscApplicationStage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of jadsc application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc application stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public static JadscApplicationStage[] findByUuid_C_PrevAndNext(
			long jadscAppStageId, String uuid, long companyId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			jadscAppStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the jadsc application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of jadsc application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc application stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the jadsc application stage where jadscApplicationId = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findBygetJadsc_By_AI(
			long jadscApplicationId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_AI(jadscApplicationId);
	}

	/**
	 * Returns the jadsc application stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_AI(
		long jadscApplicationId) {

		return getPersistence().fetchBygetJadsc_By_AI(jadscApplicationId);
	}

	/**
	 * Returns the jadsc application stage where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_AI(
		long jadscApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_By_AI(
			jadscApplicationId, useFinderCache);
	}

	/**
	 * Removes the jadsc application stage where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc application stage that was removed
	 */
	public static JadscApplicationStage removeBygetJadsc_By_AI(
			long jadscApplicationId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().removeBygetJadsc_By_AI(jadscApplicationId);
	}

	/**
	 * Returns the number of jadsc application stages where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc application stages
	 */
	public static int countBygetJadsc_By_AI(long jadscApplicationId) {
		return getPersistence().countBygetJadsc_By_AI(jadscApplicationId);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findBygetJadsc_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().fetchBygetJadsc_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the jadsc application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the jadsc application stage that was removed
	 */
	public static JadscApplicationStage removeBygetJadsc_By_CaseIdStageName(
			String caseId, String stageName)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().removeBygetJadsc_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching jadsc application stages
	 */
	public static int countBygetJadsc_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetJadsc_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findBygetJadsc_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetJadsc_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the jadsc application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the jadsc application stage that was removed
	 */
	public static JadscApplicationStage removeBygetJadsc_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().removeBygetJadsc_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching jadsc application stages
	 */
	public static int countBygetJadsc_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetJadsc_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findBygetJadsc_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().fetchBygetJadsc_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the jadsc application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the jadsc application stage that was removed
	 */
	public static JadscApplicationStage removeBygetJadsc_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().removeBygetJadsc_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching jadsc application stages
	 */
	public static int countBygetJadsc_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetJadsc_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the jadsc application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId) {

		return getPersistence().findBygetJadsc_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the jadsc application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetJadsc_By_CaseId(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().findBygetJadsc_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findBygetJadsc_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJadsc_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findBygetJadsc_By_CaseId_First(
			String caseId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_CaseId_First(
		String caseId,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findBygetJadsc_By_CaseId_Last(
			String caseId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_CaseId_Last(
		String caseId,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where caseId = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public static JadscApplicationStage[] findBygetJadsc_By_CaseId_PrevAndNext(
			long jadscAppStageId, String caseId,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_CaseId_PrevAndNext(
			jadscAppStageId, caseId, orderByComparator);
	}

	/**
	 * Removes all the jadsc application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetJadsc_By_CaseId(String caseId) {
		getPersistence().removeBygetJadsc_By_CaseId(caseId);
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application stages
	 */
	public static int countBygetJadsc_By_CaseId(String caseId) {
		return getPersistence().countBygetJadsc_By_CaseId(caseId);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findBygetJadsc_ByCaseId(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_ByCaseId(caseId);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_ByCaseId(
		String caseId) {

		return getPersistence().fetchBygetJadsc_ByCaseId(caseId);
	}

	/**
	 * Returns the jadsc application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_ByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_ByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the jadsc application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application stage that was removed
	 */
	public static JadscApplicationStage removeBygetJadsc_ByCaseId(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().removeBygetJadsc_ByCaseId(caseId);
	}

	/**
	 * Returns the number of jadsc application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc application stages
	 */
	public static int countBygetJadsc_ByCaseId(String caseId) {
		return getPersistence().countBygetJadsc_ByCaseId(caseId);
	}

	/**
	 * Returns all the jadsc application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName) {

		return getPersistence().findBygetJadsc_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the jadsc application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName, int start, int end) {

		return getPersistence().findBygetJadsc_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().findBygetJadsc_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc application stages
	 */
	public static List<JadscApplicationStage> findBygetJadsc_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJadsc_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findBygetJadsc_By_StageName_First(
			String stageName,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_StageName_First(
		String stageName,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage findBygetJadsc_By_StageName_Last(
			String stageName,
			OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application stage, or <code>null</code> if a matching jadsc application stage could not be found
	 */
	public static JadscApplicationStage fetchBygetJadsc_By_StageName_Last(
		String stageName,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the jadsc application stages before and after the current jadsc application stage in the ordered set where stageName = &#63;.
	 *
	 * @param jadscAppStageId the primary key of the current jadsc application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public static JadscApplicationStage[]
			findBygetJadsc_By_StageName_PrevAndNext(
				long jadscAppStageId, String stageName,
				OrderByComparator<JadscApplicationStage> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findBygetJadsc_By_StageName_PrevAndNext(
			jadscAppStageId, stageName, orderByComparator);
	}

	/**
	 * Removes all the jadsc application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetJadsc_By_StageName(String stageName) {
		getPersistence().removeBygetJadsc_By_StageName(stageName);
	}

	/**
	 * Returns the number of jadsc application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching jadsc application stages
	 */
	public static int countBygetJadsc_By_StageName(String stageName) {
		return getPersistence().countBygetJadsc_By_StageName(stageName);
	}

	/**
	 * Caches the jadsc application stage in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationStage the jadsc application stage
	 */
	public static void cacheResult(
		JadscApplicationStage jadscApplicationStage) {

		getPersistence().cacheResult(jadscApplicationStage);
	}

	/**
	 * Caches the jadsc application stages in the entity cache if it is enabled.
	 *
	 * @param jadscApplicationStages the jadsc application stages
	 */
	public static void cacheResult(
		List<JadscApplicationStage> jadscApplicationStages) {

		getPersistence().cacheResult(jadscApplicationStages);
	}

	/**
	 * Creates a new jadsc application stage with the primary key. Does not add the jadsc application stage to the database.
	 *
	 * @param jadscAppStageId the primary key for the new jadsc application stage
	 * @return the new jadsc application stage
	 */
	public static JadscApplicationStage create(long jadscAppStageId) {
		return getPersistence().create(jadscAppStageId);
	}

	/**
	 * Removes the jadsc application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage that was removed
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public static JadscApplicationStage remove(long jadscAppStageId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().remove(jadscAppStageId);
	}

	public static JadscApplicationStage updateImpl(
		JadscApplicationStage jadscApplicationStage) {

		return getPersistence().updateImpl(jadscApplicationStage);
	}

	/**
	 * Returns the jadsc application stage with the primary key or throws a <code>NoSuchJadscApplicationStageException</code> if it could not be found.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage
	 * @throws NoSuchJadscApplicationStageException if a jadsc application stage with the primary key could not be found
	 */
	public static JadscApplicationStage findByPrimaryKey(long jadscAppStageId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscApplicationStageException {

		return getPersistence().findByPrimaryKey(jadscAppStageId);
	}

	/**
	 * Returns the jadsc application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppStageId the primary key of the jadsc application stage
	 * @return the jadsc application stage, or <code>null</code> if a jadsc application stage with the primary key could not be found
	 */
	public static JadscApplicationStage fetchByPrimaryKey(
		long jadscAppStageId) {

		return getPersistence().fetchByPrimaryKey(jadscAppStageId);
	}

	/**
	 * Returns all the jadsc application stages.
	 *
	 * @return the jadsc application stages
	 */
	public static List<JadscApplicationStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @return the range of jadsc application stages
	 */
	public static List<JadscApplicationStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc application stages
	 */
	public static List<JadscApplicationStage> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc application stages
	 * @param end the upper bound of the range of jadsc application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc application stages
	 */
	public static List<JadscApplicationStage> findAll(
		int start, int end,
		OrderByComparator<JadscApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc application stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc application stages.
	 *
	 * @return the number of jadsc application stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JadscApplicationStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JadscApplicationStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JadscApplicationStagePersistence _persistence;

}