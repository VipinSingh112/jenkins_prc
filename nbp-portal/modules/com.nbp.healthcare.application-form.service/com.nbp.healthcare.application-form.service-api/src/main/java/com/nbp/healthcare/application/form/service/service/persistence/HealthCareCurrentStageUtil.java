/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care current stage service. This utility wraps <code>com.nbp.healthcare.application.form.service.service.persistence.impl.HealthCareCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareCurrentStagePersistence
 * @generated
 */
public class HealthCareCurrentStageUtil {

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
		HealthCareCurrentStage healthCareCurrentStage) {

		getPersistence().clearCache(healthCareCurrentStage);
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
	public static Map<Serializable, HealthCareCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCareCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCareCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCareCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCareCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCareCurrentStage update(
		HealthCareCurrentStage healthCareCurrentStage) {

		return getPersistence().update(healthCareCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCareCurrentStage update(
		HealthCareCurrentStage healthCareCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(healthCareCurrentStage, serviceContext);
	}

	/**
	 * Returns the health care current stage where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareCurrentStageException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care current stage
	 * @throws NoSuchHealthCareCurrentStageException if a matching health care current stage could not be found
	 */
	public static HealthCareCurrentStage findBygethealthById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareCurrentStageException {

		return getPersistence().findBygethealthById(healthCareApplicationId);
	}

	/**
	 * Returns the health care current stage where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care current stage, or <code>null</code> if a matching health care current stage could not be found
	 */
	public static HealthCareCurrentStage fetchBygethealthById(
		long healthCareApplicationId) {

		return getPersistence().fetchBygethealthById(healthCareApplicationId);
	}

	/**
	 * Returns the health care current stage where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care current stage, or <code>null</code> if a matching health care current stage could not be found
	 */
	public static HealthCareCurrentStage fetchBygethealthById(
		long healthCareApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygethealthById(
			healthCareApplicationId, useFinderCache);
	}

	/**
	 * Removes the health care current stage where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care current stage that was removed
	 */
	public static HealthCareCurrentStage removeBygethealthById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareCurrentStageException {

		return getPersistence().removeBygethealthById(healthCareApplicationId);
	}

	/**
	 * Returns the number of health care current stages where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care current stages
	 */
	public static int countBygethealthById(long healthCareApplicationId) {
		return getPersistence().countBygethealthById(healthCareApplicationId);
	}

	/**
	 * Caches the health care current stage in the entity cache if it is enabled.
	 *
	 * @param healthCareCurrentStage the health care current stage
	 */
	public static void cacheResult(
		HealthCareCurrentStage healthCareCurrentStage) {

		getPersistence().cacheResult(healthCareCurrentStage);
	}

	/**
	 * Caches the health care current stages in the entity cache if it is enabled.
	 *
	 * @param healthCareCurrentStages the health care current stages
	 */
	public static void cacheResult(
		List<HealthCareCurrentStage> healthCareCurrentStages) {

		getPersistence().cacheResult(healthCareCurrentStages);
	}

	/**
	 * Creates a new health care current stage with the primary key. Does not add the health care current stage to the database.
	 *
	 * @param HealthCareCurrentStageId the primary key for the new health care current stage
	 * @return the new health care current stage
	 */
	public static HealthCareCurrentStage create(long HealthCareCurrentStageId) {
		return getPersistence().create(HealthCareCurrentStageId);
	}

	/**
	 * Removes the health care current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage that was removed
	 * @throws NoSuchHealthCareCurrentStageException if a health care current stage with the primary key could not be found
	 */
	public static HealthCareCurrentStage remove(long HealthCareCurrentStageId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareCurrentStageException {

		return getPersistence().remove(HealthCareCurrentStageId);
	}

	public static HealthCareCurrentStage updateImpl(
		HealthCareCurrentStage healthCareCurrentStage) {

		return getPersistence().updateImpl(healthCareCurrentStage);
	}

	/**
	 * Returns the health care current stage with the primary key or throws a <code>NoSuchHealthCareCurrentStageException</code> if it could not be found.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage
	 * @throws NoSuchHealthCareCurrentStageException if a health care current stage with the primary key could not be found
	 */
	public static HealthCareCurrentStage findByPrimaryKey(
			long HealthCareCurrentStageId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareCurrentStageException {

		return getPersistence().findByPrimaryKey(HealthCareCurrentStageId);
	}

	/**
	 * Returns the health care current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param HealthCareCurrentStageId the primary key of the health care current stage
	 * @return the health care current stage, or <code>null</code> if a health care current stage with the primary key could not be found
	 */
	public static HealthCareCurrentStage fetchByPrimaryKey(
		long HealthCareCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(HealthCareCurrentStageId);
	}

	/**
	 * Returns all the health care current stages.
	 *
	 * @return the health care current stages
	 */
	public static List<HealthCareCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @return the range of health care current stages
	 */
	public static List<HealthCareCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care current stages
	 */
	public static List<HealthCareCurrentStage> findAll(
		int start, int end,
		OrderByComparator<HealthCareCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care current stages
	 * @param end the upper bound of the range of health care current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care current stages
	 */
	public static List<HealthCareCurrentStage> findAll(
		int start, int end,
		OrderByComparator<HealthCareCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care current stages.
	 *
	 * @return the number of health care current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCareCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthCareCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthCareCurrentStagePersistence _persistence;

}