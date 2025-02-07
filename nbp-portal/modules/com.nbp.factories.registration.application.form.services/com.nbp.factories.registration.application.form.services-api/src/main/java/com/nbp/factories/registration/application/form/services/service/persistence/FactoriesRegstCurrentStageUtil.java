/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.application.form.services.model.FactoriesRegstCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the factories regst current stage service. This utility wraps <code>com.nbp.factories.registration.application.form.services.service.persistence.impl.FactoriesRegstCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesRegstCurrentStagePersistence
 * @generated
 */
public class FactoriesRegstCurrentStageUtil {

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
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		getPersistence().clearCache(factoriesRegstCurrentStage);
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
	public static Map<Serializable, FactoriesRegstCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FactoriesRegstCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FactoriesRegstCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FactoriesRegstCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FactoriesRegstCurrentStage update(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return getPersistence().update(factoriesRegstCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FactoriesRegstCurrentStage update(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			factoriesRegstCurrentStage, serviceContext);
	}

	/**
	 * Returns all the factories regst current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the factories regst current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of matching factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage fetchByUuid_First(
		String uuid,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the factories regst current stages before and after the current factories regst current stage in the ordered set where uuid = &#63;.
	 *
	 * @param factoriesCurrentStageId the primary key of the current factories regst current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	public static FactoriesRegstCurrentStage[] findByUuid_PrevAndNext(
			long factoriesCurrentStageId, String uuid,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().findByUuid_PrevAndNext(
			factoriesCurrentStageId, uuid, orderByComparator);
	}

	/**
	 * Removes all the factories regst current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of factories regst current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching factories regst current stages
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the factories regst current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFactoriesRegstCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the factories regst current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the factories regst current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the factories regst current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the factories regst current stage that was removed
	 */
	public static FactoriesRegstCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of factories regst current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching factories regst current stages
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of matching factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the factories regst current stages before and after the current factories regst current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param factoriesCurrentStageId the primary key of the current factories regst current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	public static FactoriesRegstCurrentStage[] findByUuid_C_PrevAndNext(
			long factoriesCurrentStageId, String uuid, long companyId,
			OrderByComparator<FactoriesRegstCurrentStage> orderByComparator)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().findByUuid_C_PrevAndNext(
			factoriesCurrentStageId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the factories regst current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of factories regst current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching factories regst current stages
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the factories regst current stage where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesRegstCurrentStageException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage findBygetByFactories_Stage(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().findBygetByFactories_Stage(
			factoriesApplicationId);
	}

	/**
	 * Returns the factories regst current stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage fetchBygetByFactories_Stage(
		long factoriesApplicationId) {

		return getPersistence().fetchBygetByFactories_Stage(
			factoriesApplicationId);
	}

	/**
	 * Returns the factories regst current stage where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories regst current stage, or <code>null</code> if a matching factories regst current stage could not be found
	 */
	public static FactoriesRegstCurrentStage fetchBygetByFactories_Stage(
		long factoriesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetByFactories_Stage(
			factoriesApplicationId, useFinderCache);
	}

	/**
	 * Removes the factories regst current stage where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories regst current stage that was removed
	 */
	public static FactoriesRegstCurrentStage removeBygetByFactories_Stage(
			long factoriesApplicationId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().removeBygetByFactories_Stage(
			factoriesApplicationId);
	}

	/**
	 * Returns the number of factories regst current stages where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories regst current stages
	 */
	public static int countBygetByFactories_Stage(long factoriesApplicationId) {
		return getPersistence().countBygetByFactories_Stage(
			factoriesApplicationId);
	}

	/**
	 * Caches the factories regst current stage in the entity cache if it is enabled.
	 *
	 * @param factoriesRegstCurrentStage the factories regst current stage
	 */
	public static void cacheResult(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		getPersistence().cacheResult(factoriesRegstCurrentStage);
	}

	/**
	 * Caches the factories regst current stages in the entity cache if it is enabled.
	 *
	 * @param factoriesRegstCurrentStages the factories regst current stages
	 */
	public static void cacheResult(
		List<FactoriesRegstCurrentStage> factoriesRegstCurrentStages) {

		getPersistence().cacheResult(factoriesRegstCurrentStages);
	}

	/**
	 * Creates a new factories regst current stage with the primary key. Does not add the factories regst current stage to the database.
	 *
	 * @param factoriesCurrentStageId the primary key for the new factories regst current stage
	 * @return the new factories regst current stage
	 */
	public static FactoriesRegstCurrentStage create(
		long factoriesCurrentStageId) {

		return getPersistence().create(factoriesCurrentStageId);
	}

	/**
	 * Removes the factories regst current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage that was removed
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	public static FactoriesRegstCurrentStage remove(
			long factoriesCurrentStageId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().remove(factoriesCurrentStageId);
	}

	public static FactoriesRegstCurrentStage updateImpl(
		FactoriesRegstCurrentStage factoriesRegstCurrentStage) {

		return getPersistence().updateImpl(factoriesRegstCurrentStage);
	}

	/**
	 * Returns the factories regst current stage with the primary key or throws a <code>NoSuchFactoriesRegstCurrentStageException</code> if it could not be found.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage
	 * @throws NoSuchFactoriesRegstCurrentStageException if a factories regst current stage with the primary key could not be found
	 */
	public static FactoriesRegstCurrentStage findByPrimaryKey(
			long factoriesCurrentStageId)
		throws com.nbp.factories.registration.application.form.services.
			exception.NoSuchFactoriesRegstCurrentStageException {

		return getPersistence().findByPrimaryKey(factoriesCurrentStageId);
	}

	/**
	 * Returns the factories regst current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesCurrentStageId the primary key of the factories regst current stage
	 * @return the factories regst current stage, or <code>null</code> if a factories regst current stage with the primary key could not be found
	 */
	public static FactoriesRegstCurrentStage fetchByPrimaryKey(
		long factoriesCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(factoriesCurrentStageId);
	}

	/**
	 * Returns all the factories regst current stages.
	 *
	 * @return the factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @return the range of factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the factories regst current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesRegstCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories regst current stages
	 * @param end the upper bound of the range of factories regst current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories regst current stages
	 */
	public static List<FactoriesRegstCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FactoriesRegstCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the factories regst current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of factories regst current stages.
	 *
	 * @return the number of factories regst current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FactoriesRegstCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FactoriesRegstCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FactoriesRegstCurrentStagePersistence _persistence;

}