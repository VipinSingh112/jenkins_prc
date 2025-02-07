/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppliCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade appli current stage service. This utility wraps <code>com.nbp.fire.brigade.application.form.service.service.persistence.impl.FireBrigadeAppliCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeAppliCurrentStagePersistence
 * @generated
 */
public class FireBrigadeAppliCurrentStageUtil {

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
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		getPersistence().clearCache(fireBrigadeAppliCurrentStage);
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
	public static Map<Serializable, FireBrigadeAppliCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadeAppliCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadeAppliCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadeAppliCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadeAppliCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadeAppliCurrentStage update(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		return getPersistence().update(fireBrigadeAppliCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadeAppliCurrentStage update(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			fireBrigadeAppliCurrentStage, serviceContext);
	}

	/**
	 * Returns the fire brigade appli current stage where fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade appli current stage
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a matching fire brigade appli current stage could not be found
	 */
	public static FireBrigadeAppliCurrentStage findBygetFireBrigade_Stage_FBAI(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeAppliCurrentStageException {

		return getPersistence().findBygetFireBrigade_Stage_FBAI(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade appli current stage where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade appli current stage, or <code>null</code> if a matching fire brigade appli current stage could not be found
	 */
	public static FireBrigadeAppliCurrentStage fetchBygetFireBrigade_Stage_FBAI(
		long fireBrigadeApplicationId) {

		return getPersistence().fetchBygetFireBrigade_Stage_FBAI(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade appli current stage where fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade appli current stage, or <code>null</code> if a matching fire brigade appli current stage could not be found
	 */
	public static FireBrigadeAppliCurrentStage fetchBygetFireBrigade_Stage_FBAI(
		long fireBrigadeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigade_Stage_FBAI(
			fireBrigadeApplicationId, useFinderCache);
	}

	/**
	 * Removes the fire brigade appli current stage where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade appli current stage that was removed
	 */
	public static FireBrigadeAppliCurrentStage
			removeBygetFireBrigade_Stage_FBAI(long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeAppliCurrentStageException {

		return getPersistence().removeBygetFireBrigade_Stage_FBAI(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the number of fire brigade appli current stages where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade appli current stages
	 */
	public static int countBygetFireBrigade_Stage_FBAI(
		long fireBrigadeApplicationId) {

		return getPersistence().countBygetFireBrigade_Stage_FBAI(
			fireBrigadeApplicationId);
	}

	/**
	 * Caches the fire brigade appli current stage in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppliCurrentStage the fire brigade appli current stage
	 */
	public static void cacheResult(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		getPersistence().cacheResult(fireBrigadeAppliCurrentStage);
	}

	/**
	 * Caches the fire brigade appli current stages in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeAppliCurrentStages the fire brigade appli current stages
	 */
	public static void cacheResult(
		List<FireBrigadeAppliCurrentStage> fireBrigadeAppliCurrentStages) {

		getPersistence().cacheResult(fireBrigadeAppliCurrentStages);
	}

	/**
	 * Creates a new fire brigade appli current stage with the primary key. Does not add the fire brigade appli current stage to the database.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key for the new fire brigade appli current stage
	 * @return the new fire brigade appli current stage
	 */
	public static FireBrigadeAppliCurrentStage create(
		long fireBrigadeAppliCurrentStageId) {

		return getPersistence().create(fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Removes the fire brigade appli current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage that was removed
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a fire brigade appli current stage with the primary key could not be found
	 */
	public static FireBrigadeAppliCurrentStage remove(
			long fireBrigadeAppliCurrentStageId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeAppliCurrentStageException {

		return getPersistence().remove(fireBrigadeAppliCurrentStageId);
	}

	public static FireBrigadeAppliCurrentStage updateImpl(
		FireBrigadeAppliCurrentStage fireBrigadeAppliCurrentStage) {

		return getPersistence().updateImpl(fireBrigadeAppliCurrentStage);
	}

	/**
	 * Returns the fire brigade appli current stage with the primary key or throws a <code>NoSuchFireBrigadeAppliCurrentStageException</code> if it could not be found.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage
	 * @throws NoSuchFireBrigadeAppliCurrentStageException if a fire brigade appli current stage with the primary key could not be found
	 */
	public static FireBrigadeAppliCurrentStage findByPrimaryKey(
			long fireBrigadeAppliCurrentStageId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeAppliCurrentStageException {

		return getPersistence().findByPrimaryKey(
			fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Returns the fire brigade appli current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeAppliCurrentStageId the primary key of the fire brigade appli current stage
	 * @return the fire brigade appli current stage, or <code>null</code> if a fire brigade appli current stage with the primary key could not be found
	 */
	public static FireBrigadeAppliCurrentStage fetchByPrimaryKey(
		long fireBrigadeAppliCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(
			fireBrigadeAppliCurrentStageId);
	}

	/**
	 * Returns all the fire brigade appli current stages.
	 *
	 * @return the fire brigade appli current stages
	 */
	public static List<FireBrigadeAppliCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @return the range of fire brigade appli current stages
	 */
	public static List<FireBrigadeAppliCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade appli current stages
	 */
	public static List<FireBrigadeAppliCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeAppliCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade appli current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeAppliCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade appli current stages
	 * @param end the upper bound of the range of fire brigade appli current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade appli current stages
	 */
	public static List<FireBrigadeAppliCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeAppliCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade appli current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade appli current stages.
	 *
	 * @return the number of fire brigade appli current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadeAppliCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadeAppliCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadeAppliCurrentStagePersistence
		_persistence;

}