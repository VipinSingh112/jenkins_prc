/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the quarry current stage service. This utility wraps <code>com.nbp.quary.application.form.service.service.persistence.impl.QuarryCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryCurrentStagePersistence
 * @generated
 */
public class QuarryCurrentStageUtil {

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
	public static void clearCache(QuarryCurrentStage quarryCurrentStage) {
		getPersistence().clearCache(quarryCurrentStage);
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
	public static Map<Serializable, QuarryCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QuarryCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QuarryCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QuarryCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QuarryCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QuarryCurrentStage update(
		QuarryCurrentStage quarryCurrentStage) {

		return getPersistence().update(quarryCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QuarryCurrentStage update(
		QuarryCurrentStage quarryCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(quarryCurrentStage, serviceContext);
	}

	/**
	 * Returns the quarry current stage where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryCurrentStageException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a matching quarry current stage could not be found
	 */
	public static QuarryCurrentStage findBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryCurrentStageException {

		return getPersistence().findBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry current stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	public static QuarryCurrentStage fetchBygetQuarry_ById(
		long quarryApplicationId) {

		return getPersistence().fetchBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the quarry current stage where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	public static QuarryCurrentStage fetchBygetQuarry_ById(
		long quarryApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetQuarry_ById(
			quarryApplicationId, useFinderCache);
	}

	/**
	 * Removes the quarry current stage where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry current stage that was removed
	 */
	public static QuarryCurrentStage removeBygetQuarry_ById(
			long quarryApplicationId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryCurrentStageException {

		return getPersistence().removeBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry current stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry current stages
	 */
	public static int countBygetQuarry_ById(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_ById(quarryApplicationId);
	}

	/**
	 * Returns all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry current stages
	 */
	public static List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId) {

		return getPersistence().findBygetQuarry_CS_AI(quarryApplicationId);
	}

	/**
	 * Returns a range of all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @return the range of matching quarry current stages
	 */
	public static List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId, int start, int end) {

		return getPersistence().findBygetQuarry_CS_AI(
			quarryApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry current stages
	 */
	public static List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryCurrentStage> orderByComparator) {

		return getPersistence().findBygetQuarry_CS_AI(
			quarryApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry current stages where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry current stages
	 */
	public static List<QuarryCurrentStage> findBygetQuarry_CS_AI(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetQuarry_CS_AI(
			quarryApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a matching quarry current stage could not be found
	 */
	public static QuarryCurrentStage findBygetQuarry_CS_AI_First(
			long quarryApplicationId,
			OrderByComparator<QuarryCurrentStage> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryCurrentStageException {

		return getPersistence().findBygetQuarry_CS_AI_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the first quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	public static QuarryCurrentStage fetchBygetQuarry_CS_AI_First(
		long quarryApplicationId,
		OrderByComparator<QuarryCurrentStage> orderByComparator) {

		return getPersistence().fetchBygetQuarry_CS_AI_First(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a matching quarry current stage could not be found
	 */
	public static QuarryCurrentStage findBygetQuarry_CS_AI_Last(
			long quarryApplicationId,
			OrderByComparator<QuarryCurrentStage> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryCurrentStageException {

		return getPersistence().findBygetQuarry_CS_AI_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the last quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry current stage, or <code>null</code> if a matching quarry current stage could not be found
	 */
	public static QuarryCurrentStage fetchBygetQuarry_CS_AI_Last(
		long quarryApplicationId,
		OrderByComparator<QuarryCurrentStage> orderByComparator) {

		return getPersistence().fetchBygetQuarry_CS_AI_Last(
			quarryApplicationId, orderByComparator);
	}

	/**
	 * Returns the quarry current stages before and after the current quarry current stage in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param auarryStageId the primary key of the current quarry current stage
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	public static QuarryCurrentStage[] findBygetQuarry_CS_AI_PrevAndNext(
			long auarryStageId, long quarryApplicationId,
			OrderByComparator<QuarryCurrentStage> orderByComparator)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryCurrentStageException {

		return getPersistence().findBygetQuarry_CS_AI_PrevAndNext(
			auarryStageId, quarryApplicationId, orderByComparator);
	}

	/**
	 * Removes all the quarry current stages where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	public static void removeBygetQuarry_CS_AI(long quarryApplicationId) {
		getPersistence().removeBygetQuarry_CS_AI(quarryApplicationId);
	}

	/**
	 * Returns the number of quarry current stages where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry current stages
	 */
	public static int countBygetQuarry_CS_AI(long quarryApplicationId) {
		return getPersistence().countBygetQuarry_CS_AI(quarryApplicationId);
	}

	/**
	 * Caches the quarry current stage in the entity cache if it is enabled.
	 *
	 * @param quarryCurrentStage the quarry current stage
	 */
	public static void cacheResult(QuarryCurrentStage quarryCurrentStage) {
		getPersistence().cacheResult(quarryCurrentStage);
	}

	/**
	 * Caches the quarry current stages in the entity cache if it is enabled.
	 *
	 * @param quarryCurrentStages the quarry current stages
	 */
	public static void cacheResult(
		List<QuarryCurrentStage> quarryCurrentStages) {

		getPersistence().cacheResult(quarryCurrentStages);
	}

	/**
	 * Creates a new quarry current stage with the primary key. Does not add the quarry current stage to the database.
	 *
	 * @param auarryStageId the primary key for the new quarry current stage
	 * @return the new quarry current stage
	 */
	public static QuarryCurrentStage create(long auarryStageId) {
		return getPersistence().create(auarryStageId);
	}

	/**
	 * Removes the quarry current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage that was removed
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	public static QuarryCurrentStage remove(long auarryStageId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryCurrentStageException {

		return getPersistence().remove(auarryStageId);
	}

	public static QuarryCurrentStage updateImpl(
		QuarryCurrentStage quarryCurrentStage) {

		return getPersistence().updateImpl(quarryCurrentStage);
	}

	/**
	 * Returns the quarry current stage with the primary key or throws a <code>NoSuchQuarryCurrentStageException</code> if it could not be found.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage
	 * @throws NoSuchQuarryCurrentStageException if a quarry current stage with the primary key could not be found
	 */
	public static QuarryCurrentStage findByPrimaryKey(long auarryStageId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryCurrentStageException {

		return getPersistence().findByPrimaryKey(auarryStageId);
	}

	/**
	 * Returns the quarry current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param auarryStageId the primary key of the quarry current stage
	 * @return the quarry current stage, or <code>null</code> if a quarry current stage with the primary key could not be found
	 */
	public static QuarryCurrentStage fetchByPrimaryKey(long auarryStageId) {
		return getPersistence().fetchByPrimaryKey(auarryStageId);
	}

	/**
	 * Returns all the quarry current stages.
	 *
	 * @return the quarry current stages
	 */
	public static List<QuarryCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @return the range of quarry current stages
	 */
	public static List<QuarryCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry current stages
	 */
	public static List<QuarryCurrentStage> findAll(
		int start, int end,
		OrderByComparator<QuarryCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the quarry current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry current stages
	 * @param end the upper bound of the range of quarry current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry current stages
	 */
	public static List<QuarryCurrentStage> findAll(
		int start, int end,
		OrderByComparator<QuarryCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the quarry current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of quarry current stages.
	 *
	 * @return the number of quarry current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QuarryCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QuarryCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QuarryCurrentStagePersistence _persistence;

}