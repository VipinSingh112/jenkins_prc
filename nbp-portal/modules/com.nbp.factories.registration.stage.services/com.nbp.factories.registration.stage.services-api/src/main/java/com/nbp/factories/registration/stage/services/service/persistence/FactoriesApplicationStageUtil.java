/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.stage.services.model.FactoriesApplicationStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories application stage service. This utility wraps <code>com.nbp.factories.registration.stage.services.service.persistence.impl.FactoriesApplicationStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesApplicationStagePersistence
 * @generated
 */
public class FactoriesApplicationStageUtil {

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
		FactoriesApplicationStage factoriesApplicationStage) {

		getPersistence().clearCache(factoriesApplicationStage);
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
	public static Map<Serializable, FactoriesApplicationStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesApplicationStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesApplicationStage update(
		FactoriesApplicationStage factoriesApplicationStage) {

		return getPersistence().update(factoriesApplicationStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesApplicationStage update(
		FactoriesApplicationStage factoriesApplicationStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			factoriesApplicationStage, serviceContext);
	}

	/**
	 * Returns all the factories application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the factories application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchByUuid_First(
		String uuid,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where uuid = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public static FactoriesApplicationStage[] findByUuid_PrevAndNext(
			long factoriesApplicationStageId, String uuid,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findByUuid_PrevAndNext(
			factoriesApplicationStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the factories application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of factories application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching factories application stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the factories application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the factories application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the factories application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the factories application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the factories application stage that was removed
	 */
	public static FactoriesApplicationStage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of factories application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching factories application stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public static FactoriesApplicationStage[] findByUuid_C_PrevAndNext(
			long factoriesApplicationStageId, String uuid, long companyId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			factoriesApplicationStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the factories application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of factories application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching factories application stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the factories application stage where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage findBygetFactories_By_AI(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_AI(
			factoriesApplicationId);
	}

	/**
	 * Returns the factories application stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchBygetFactories_By_AI(
		long factoriesApplicationId) {

		return getPersistence().fetchBygetFactories_By_AI(
			factoriesApplicationId);
	}

	/**
	 * Returns the factories application stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchBygetFactories_By_AI(
		long factoriesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFactories_By_AI(
			factoriesApplicationId, useFinderCache);
	}

	/**
	 * Removes the factories application stage where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories application stage that was removed
	 */
	public static FactoriesApplicationStage removeBygetFactories_By_AI(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().removeBygetFactories_By_AI(
			factoriesApplicationId);
	}

	/**
	 * Returns the number of factories application stages where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories application stages
	 */
	public static int countBygetFactories_By_AI(long factoriesApplicationId) {
		return getPersistence().countBygetFactories_By_AI(
			factoriesApplicationId);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
			findBygetFactories_By_CaseIdStageName(
				String caseId, String stageName)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
		fetchBygetFactories_By_CaseIdStageName(
			String caseId, String stageName) {

		return getPersistence().fetchBygetFactories_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
		fetchBygetFactories_By_CaseIdStageName(
			String caseId, String stageName, boolean useFinderCache) {

		return getPersistence().fetchBygetFactories_By_CaseIdStageName(
			caseId, stageName, useFinderCache);
	}

	/**
	 * Removes the factories application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the factories application stage that was removed
	 */
	public static FactoriesApplicationStage
			removeBygetFactories_By_CaseIdStageName(
				String caseId, String stageName)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().removeBygetFactories_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching factories application stages
	 */
	public static int countBygetFactories_By_CaseIdStageName(
		String caseId, String stageName) {

		return getPersistence().countBygetFactories_By_CaseIdStageName(
			caseId, stageName);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage findByget_Factories_By_CaseId(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findByget_Factories_By_CaseId(caseId);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchByget_Factories_By_CaseId(
		String caseId) {

		return getPersistence().fetchByget_Factories_By_CaseId(caseId);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchByget_Factories_By_CaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchByget_Factories_By_CaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the factories application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories application stage that was removed
	 */
	public static FactoriesApplicationStage removeByget_Factories_By_CaseId(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().removeByget_Factories_By_CaseId(caseId);
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application stages
	 */
	public static int countByget_Factories_By_CaseId(String caseId) {
		return getPersistence().countByget_Factories_By_CaseId(caseId);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
			findBygetFactories_By_CaseIdStageStatus(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
		fetchBygetFactories_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName) {

		return getPersistence().fetchBygetFactories_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
		fetchBygetFactories_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName,
			boolean useFinderCache) {

		return getPersistence().fetchBygetFactories_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, useFinderCache);
	}

	/**
	 * Removes the factories application stage where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the factories application stage that was removed
	 */
	public static FactoriesApplicationStage
			removeBygetFactories_By_CaseIdStageStatus(
				String caseId, String stageStatus, String stageName)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().removeBygetFactories_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching factories application stages
	 */
	public static int countBygetFactories_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return getPersistence().countBygetFactories_By_CaseIdStageStatus(
			caseId, stageStatus, stageName);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
			findBygetFactories_By_CaseIdAndStatus(
				String caseId, String stageStatus)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
		fetchBygetFactories_By_CaseIdAndStatus(
			String caseId, String stageStatus) {

		return getPersistence().fetchBygetFactories_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the factories application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
		fetchBygetFactories_By_CaseIdAndStatus(
			String caseId, String stageStatus, boolean useFinderCache) {

		return getPersistence().fetchBygetFactories_By_CaseIdAndStatus(
			caseId, stageStatus, useFinderCache);
	}

	/**
	 * Removes the factories application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the factories application stage that was removed
	 */
	public static FactoriesApplicationStage
			removeBygetFactories_By_CaseIdAndStatus(
				String caseId, String stageStatus)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().removeBygetFactories_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching factories application stages
	 */
	public static int countBygetFactories_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return getPersistence().countBygetFactories_By_CaseIdAndStatus(
			caseId, stageStatus);
	}

	/**
	 * Returns all the factories application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findBygetFactories_By_CaseId(
		String caseId) {

		return getPersistence().findBygetFactories_By_CaseId(caseId);
	}

	/**
	 * Returns a range of all the factories application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findBygetFactories_By_CaseId(
		String caseId, int start, int end) {

		return getPersistence().findBygetFactories_By_CaseId(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findBygetFactories_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().findBygetFactories_By_CaseId(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage> findBygetFactories_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFactories_By_CaseId(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage findBygetFactories_By_CaseId_First(
			String caseId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchBygetFactories_By_CaseId_First(
		String caseId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetFactories_By_CaseId_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage findBygetFactories_By_CaseId_Last(
			String caseId,
			OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage fetchBygetFactories_By_CaseId_Last(
		String caseId,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetFactories_By_CaseId_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where caseId = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public static FactoriesApplicationStage[]
			findBygetFactories_By_CaseId_PrevAndNext(
				long factoriesApplicationStageId, String caseId,
				OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_CaseId_PrevAndNext(
			factoriesApplicationStageId, caseId, orderByComparator);
	}

	/**
	 * Removes all the factories application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetFactories_By_CaseId(String caseId) {
		getPersistence().removeBygetFactories_By_CaseId(caseId);
	}

	/**
	 * Returns the number of factories application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories application stages
	 */
	public static int countBygetFactories_By_CaseId(String caseId) {
		return getPersistence().countBygetFactories_By_CaseId(caseId);
	}

	/**
	 * Returns all the factories application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching factories application stages
	 */
	public static List<FactoriesApplicationStage>
		findBygetFactories_By_StageName(String stageName) {

		return getPersistence().findBygetFactories_By_StageName(stageName);
	}

	/**
	 * Returns a range of all the factories application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage>
		findBygetFactories_By_StageName(String stageName, int start, int end) {

		return getPersistence().findBygetFactories_By_StageName(
			stageName, start, end);
	}

	/**
	 * Returns an ordered range of all the factories application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage>
		findBygetFactories_By_StageName(
			String stageName, int start, int end,
			OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().findBygetFactories_By_StageName(
			stageName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories application stages
	 */
	public static List<FactoriesApplicationStage>
		findBygetFactories_By_StageName(
			String stageName, int start, int end,
			OrderByComparator<FactoriesApplicationStage> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetFactories_By_StageName(
			stageName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
			findBygetFactories_By_StageName_First(
				String stageName,
				OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the first factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
		fetchBygetFactories_By_StageName_First(
			String stageName,
			OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetFactories_By_StageName_First(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
			findBygetFactories_By_StageName_Last(
				String stageName,
				OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the last factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories application stage, or <code>null</code> if a matching factories application stage could not be found
	 */
	public static FactoriesApplicationStage
		fetchBygetFactories_By_StageName_Last(
			String stageName,
			OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().fetchBygetFactories_By_StageName_Last(
			stageName, orderByComparator);
	}

	/**
	 * Returns the factories application stages before and after the current factories application stage in the ordered set where stageName = &#63;.
	 *
	 * @param factoriesApplicationStageId the primary key of the current factories application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public static FactoriesApplicationStage[]
			findBygetFactories_By_StageName_PrevAndNext(
				long factoriesApplicationStageId, String stageName,
				OrderByComparator<FactoriesApplicationStage> orderByComparator)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findBygetFactories_By_StageName_PrevAndNext(
			factoriesApplicationStageId, stageName, orderByComparator);
	}

	/**
	 * Removes all the factories application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	public static void removeBygetFactories_By_StageName(String stageName) {
		getPersistence().removeBygetFactories_By_StageName(stageName);
	}

	/**
	 * Returns the number of factories application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching factories application stages
	 */
	public static int countBygetFactories_By_StageName(String stageName) {
		return getPersistence().countBygetFactories_By_StageName(stageName);
	}

	/**
	 * Caches the factories application stage in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationStage the factories application stage
	 */
	public static void cacheResult(
		FactoriesApplicationStage factoriesApplicationStage) {

		getPersistence().cacheResult(factoriesApplicationStage);
	}

	/**
	 * Caches the factories application stages in the entity cache if it is enabled.
	 *
	 * @param factoriesApplicationStages the factories application stages
	 */
	public static void cacheResult(
		List<FactoriesApplicationStage> factoriesApplicationStages) {

		getPersistence().cacheResult(factoriesApplicationStages);
	}

	/**
	 * Creates a new factories application stage with the primary key. Does not add the factories application stage to the database.
	 *
	 * @param factoriesApplicationStageId the primary key for the new factories application stage
	 * @return the new factories application stage
	 */
	public static FactoriesApplicationStage create(
		long factoriesApplicationStageId) {

		return getPersistence().create(factoriesApplicationStageId);
	}

	/**
	 * Removes the factories application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage that was removed
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public static FactoriesApplicationStage remove(
			long factoriesApplicationStageId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().remove(factoriesApplicationStageId);
	}

	public static FactoriesApplicationStage updateImpl(
		FactoriesApplicationStage factoriesApplicationStage) {

		return getPersistence().updateImpl(factoriesApplicationStage);
	}

	/**
	 * Returns the factories application stage with the primary key or throws a <code>NoSuchFactoriesApplicationStageException</code> if it could not be found.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage
	 * @throws NoSuchFactoriesApplicationStageException if a factories application stage with the primary key could not be found
	 */
	public static FactoriesApplicationStage findByPrimaryKey(
			long factoriesApplicationStageId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesApplicationStageException {

		return getPersistence().findByPrimaryKey(factoriesApplicationStageId);
	}

	/**
	 * Returns the factories application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesApplicationStageId the primary key of the factories application stage
	 * @return the factories application stage, or <code>null</code> if a factories application stage with the primary key could not be found
	 */
	public static FactoriesApplicationStage fetchByPrimaryKey(
		long factoriesApplicationStageId) {

		return getPersistence().fetchByPrimaryKey(factoriesApplicationStageId);
	}

	/**
	 * Returns all the factories application stages.
	 *
	 * @return the factories application stages
	 */
	public static List<FactoriesApplicationStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @return the range of factories application stages
	 */
	public static List<FactoriesApplicationStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories application stages
	 */
	public static List<FactoriesApplicationStage> findAll(
		int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories application stages
	 * @param end the upper bound of the range of factories application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories application stages
	 */
	public static List<FactoriesApplicationStage> findAll(
		int start, int end,
		OrderByComparator<FactoriesApplicationStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories application stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories application stages.
	 *
	 * @return the number of factories application stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesApplicationStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesApplicationStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesApplicationStagePersistence _persistence;

}