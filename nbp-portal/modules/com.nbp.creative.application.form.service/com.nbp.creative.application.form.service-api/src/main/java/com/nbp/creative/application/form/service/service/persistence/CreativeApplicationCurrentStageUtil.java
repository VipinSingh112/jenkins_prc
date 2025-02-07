/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative application current stage service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationCurrentStagePersistence
 * @generated
 */
public class CreativeApplicationCurrentStageUtil {

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
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		getPersistence().clearCache(creativeApplicationCurrentStage);
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
	public static Map<Serializable, CreativeApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeApplicationCurrentStage update(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		return getPersistence().update(creativeApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeApplicationCurrentStage update(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a matching creative application current stage could not be found
	 */
	public static CreativeApplicationCurrentStage findBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationCurrentStageException {

		return getPersistence().findBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	public static CreativeApplicationCurrentStage fetchBygetCreativeById(
		long CreativeApplicationId) {

		return getPersistence().fetchBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	public static CreativeApplicationCurrentStage fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeById(
			CreativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative application current stage where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative application current stage that was removed
	 */
	public static CreativeApplicationCurrentStage removeBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationCurrentStageException {

		return getPersistence().removeBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative application current stages where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative application current stages
	 */
	public static int countBygetCreativeById(long CreativeApplicationId) {
		return getPersistence().countBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a matching creative application current stage could not be found
	 */
	public static CreativeApplicationCurrentStage findBygetCA_Stage_CAI(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationCurrentStageException {

		return getPersistence().findBygetCA_Stage_CAI(CreativeApplicationId);
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	public static CreativeApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long CreativeApplicationId) {

		return getPersistence().fetchBygetCA_Stage_CAI(CreativeApplicationId);
	}

	/**
	 * Returns the creative application current stage where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application current stage, or <code>null</code> if a matching creative application current stage could not be found
	 */
	public static CreativeApplicationCurrentStage fetchBygetCA_Stage_CAI(
		long CreativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCA_Stage_CAI(
			CreativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative application current stage where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative application current stage that was removed
	 */
	public static CreativeApplicationCurrentStage removeBygetCA_Stage_CAI(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationCurrentStageException {

		return getPersistence().removeBygetCA_Stage_CAI(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative application current stages where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative application current stages
	 */
	public static int countBygetCA_Stage_CAI(long CreativeApplicationId) {
		return getPersistence().countBygetCA_Stage_CAI(CreativeApplicationId);
	}

	/**
	 * Caches the creative application current stage in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationCurrentStage the creative application current stage
	 */
	public static void cacheResult(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		getPersistence().cacheResult(creativeApplicationCurrentStage);
	}

	/**
	 * Caches the creative application current stages in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationCurrentStages the creative application current stages
	 */
	public static void cacheResult(
		List<CreativeApplicationCurrentStage>
			creativeApplicationCurrentStages) {

		getPersistence().cacheResult(creativeApplicationCurrentStages);
	}

	/**
	 * Creates a new creative application current stage with the primary key. Does not add the creative application current stage to the database.
	 *
	 * @param creativeAppliCurrentStageId the primary key for the new creative application current stage
	 * @return the new creative application current stage
	 */
	public static CreativeApplicationCurrentStage create(
		long creativeAppliCurrentStageId) {

		return getPersistence().create(creativeAppliCurrentStageId);
	}

	/**
	 * Removes the creative application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage that was removed
	 * @throws NoSuchCreativeApplicationCurrentStageException if a creative application current stage with the primary key could not be found
	 */
	public static CreativeApplicationCurrentStage remove(
			long creativeAppliCurrentStageId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationCurrentStageException {

		return getPersistence().remove(creativeAppliCurrentStageId);
	}

	public static CreativeApplicationCurrentStage updateImpl(
		CreativeApplicationCurrentStage creativeApplicationCurrentStage) {

		return getPersistence().updateImpl(creativeApplicationCurrentStage);
	}

	/**
	 * Returns the creative application current stage with the primary key or throws a <code>NoSuchCreativeApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage
	 * @throws NoSuchCreativeApplicationCurrentStageException if a creative application current stage with the primary key could not be found
	 */
	public static CreativeApplicationCurrentStage findByPrimaryKey(
			long creativeAppliCurrentStageId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(creativeAppliCurrentStageId);
	}

	/**
	 * Returns the creative application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeAppliCurrentStageId the primary key of the creative application current stage
	 * @return the creative application current stage, or <code>null</code> if a creative application current stage with the primary key could not be found
	 */
	public static CreativeApplicationCurrentStage fetchByPrimaryKey(
		long creativeAppliCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(creativeAppliCurrentStageId);
	}

	/**
	 * Returns all the creative application current stages.
	 *
	 * @return the creative application current stages
	 */
	public static List<CreativeApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @return the range of creative application current stages
	 */
	public static List<CreativeApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative application current stages
	 */
	public static List<CreativeApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<CreativeApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application current stages
	 * @param end the upper bound of the range of creative application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative application current stages
	 */
	public static List<CreativeApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<CreativeApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative application current stages.
	 *
	 * @return the number of creative application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeApplicationCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeApplicationCurrentStagePersistence
		_persistence;

}