/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.model.ExplosivesCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the explosives current stage service. This utility wraps <code>com.nbp.explosives.competency.application.form.service.service.persistence.impl.ExplosivesCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesCurrentStagePersistence
 * @generated
 */
public class ExplosivesCurrentStageUtil {

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
		ExplosivesCurrentStage explosivesCurrentStage) {

		getPersistence().clearCache(explosivesCurrentStage);
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
	public static Map<Serializable, ExplosivesCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ExplosivesCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ExplosivesCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ExplosivesCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ExplosivesCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ExplosivesCurrentStage update(
		ExplosivesCurrentStage explosivesCurrentStage) {

		return getPersistence().update(explosivesCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ExplosivesCurrentStage update(
		ExplosivesCurrentStage explosivesCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(explosivesCurrentStage, serviceContext);
	}

	/**
	 * Returns the explosives current stage where explosivesApplicationId = &#63; or throws a <code>NoSuchExplosivesCurrentStageException</code> if it could not be found.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives current stage
	 * @throws NoSuchExplosivesCurrentStageException if a matching explosives current stage could not be found
	 */
	public static ExplosivesCurrentStage findBygetByExplosive_Stage(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesCurrentStageException {

		return getPersistence().findBygetByExplosive_Stage(
			explosivesApplicationId);
	}

	/**
	 * Returns the explosives current stage where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the matching explosives current stage, or <code>null</code> if a matching explosives current stage could not be found
	 */
	public static ExplosivesCurrentStage fetchBygetByExplosive_Stage(
		long explosivesApplicationId) {

		return getPersistence().fetchBygetByExplosive_Stage(
			explosivesApplicationId);
	}

	/**
	 * Returns the explosives current stage where explosivesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching explosives current stage, or <code>null</code> if a matching explosives current stage could not be found
	 */
	public static ExplosivesCurrentStage fetchBygetByExplosive_Stage(
		long explosivesApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetByExplosive_Stage(
			explosivesApplicationId, useFinderCache);
	}

	/**
	 * Removes the explosives current stage where explosivesApplicationId = &#63; from the database.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the explosives current stage that was removed
	 */
	public static ExplosivesCurrentStage removeBygetByExplosive_Stage(
			long explosivesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesCurrentStageException {

		return getPersistence().removeBygetByExplosive_Stage(
			explosivesApplicationId);
	}

	/**
	 * Returns the number of explosives current stages where explosivesApplicationId = &#63;.
	 *
	 * @param explosivesApplicationId the explosives application ID
	 * @return the number of matching explosives current stages
	 */
	public static int countBygetByExplosive_Stage(
		long explosivesApplicationId) {

		return getPersistence().countBygetByExplosive_Stage(
			explosivesApplicationId);
	}

	/**
	 * Caches the explosives current stage in the entity cache if it is enabled.
	 *
	 * @param explosivesCurrentStage the explosives current stage
	 */
	public static void cacheResult(
		ExplosivesCurrentStage explosivesCurrentStage) {

		getPersistence().cacheResult(explosivesCurrentStage);
	}

	/**
	 * Caches the explosives current stages in the entity cache if it is enabled.
	 *
	 * @param explosivesCurrentStages the explosives current stages
	 */
	public static void cacheResult(
		List<ExplosivesCurrentStage> explosivesCurrentStages) {

		getPersistence().cacheResult(explosivesCurrentStages);
	}

	/**
	 * Creates a new explosives current stage with the primary key. Does not add the explosives current stage to the database.
	 *
	 * @param explosiveStageId the primary key for the new explosives current stage
	 * @return the new explosives current stage
	 */
	public static ExplosivesCurrentStage create(long explosiveStageId) {
		return getPersistence().create(explosiveStageId);
	}

	/**
	 * Removes the explosives current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage that was removed
	 * @throws NoSuchExplosivesCurrentStageException if a explosives current stage with the primary key could not be found
	 */
	public static ExplosivesCurrentStage remove(long explosiveStageId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesCurrentStageException {

		return getPersistence().remove(explosiveStageId);
	}

	public static ExplosivesCurrentStage updateImpl(
		ExplosivesCurrentStage explosivesCurrentStage) {

		return getPersistence().updateImpl(explosivesCurrentStage);
	}

	/**
	 * Returns the explosives current stage with the primary key or throws a <code>NoSuchExplosivesCurrentStageException</code> if it could not be found.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage
	 * @throws NoSuchExplosivesCurrentStageException if a explosives current stage with the primary key could not be found
	 */
	public static ExplosivesCurrentStage findByPrimaryKey(long explosiveStageId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesCurrentStageException {

		return getPersistence().findByPrimaryKey(explosiveStageId);
	}

	/**
	 * Returns the explosives current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param explosiveStageId the primary key of the explosives current stage
	 * @return the explosives current stage, or <code>null</code> if a explosives current stage with the primary key could not be found
	 */
	public static ExplosivesCurrentStage fetchByPrimaryKey(
		long explosiveStageId) {

		return getPersistence().fetchByPrimaryKey(explosiveStageId);
	}

	/**
	 * Returns all the explosives current stages.
	 *
	 * @return the explosives current stages
	 */
	public static List<ExplosivesCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @return the range of explosives current stages
	 */
	public static List<ExplosivesCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of explosives current stages
	 */
	public static List<ExplosivesCurrentStage> findAll(
		int start, int end,
		OrderByComparator<ExplosivesCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the explosives current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ExplosivesCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives current stages
	 * @param end the upper bound of the range of explosives current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of explosives current stages
	 */
	public static List<ExplosivesCurrentStage> findAll(
		int start, int end,
		OrderByComparator<ExplosivesCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the explosives current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of explosives current stages.
	 *
	 * @return the number of explosives current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ExplosivesCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ExplosivesCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ExplosivesCurrentStagePersistence _persistence;

}