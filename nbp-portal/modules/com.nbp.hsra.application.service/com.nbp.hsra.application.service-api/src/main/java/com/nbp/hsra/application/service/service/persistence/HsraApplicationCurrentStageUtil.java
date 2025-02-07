/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.HsraApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the hsra application current stage service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.HsraApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationCurrentStagePersistence
 * @generated
 */
public class HsraApplicationCurrentStageUtil {

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
		HsraApplicationCurrentStage hsraApplicationCurrentStage) {

		getPersistence().clearCache(hsraApplicationCurrentStage);
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
	public static Map<Serializable, HsraApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HsraApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HsraApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HsraApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HsraApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HsraApplicationCurrentStage update(
		HsraApplicationCurrentStage hsraApplicationCurrentStage) {

		return getPersistence().update(hsraApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HsraApplicationCurrentStage update(
		HsraApplicationCurrentStage hsraApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			hsraApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns the hsra application current stage where hsraApplicationId = &#63; or throws a <code>NoSuchHsraApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application current stage
	 * @throws NoSuchHsraApplicationCurrentStageException if a matching hsra application current stage could not be found
	 */
	public static HsraApplicationCurrentStage findBygetHsra_Stage_HAI(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationCurrentStageException {

		return getPersistence().findBygetHsra_Stage_HAI(hsraApplicationId);
	}

	/**
	 * Returns the hsra application current stage where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application current stage, or <code>null</code> if a matching hsra application current stage could not be found
	 */
	public static HsraApplicationCurrentStage fetchBygetHsra_Stage_HAI(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsra_Stage_HAI(hsraApplicationId);
	}

	/**
	 * Returns the hsra application current stage where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application current stage, or <code>null</code> if a matching hsra application current stage could not be found
	 */
	public static HsraApplicationCurrentStage fetchBygetHsra_Stage_HAI(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsra_Stage_HAI(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the hsra application current stage where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application current stage that was removed
	 */
	public static HsraApplicationCurrentStage removeBygetHsra_Stage_HAI(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationCurrentStageException {

		return getPersistence().removeBygetHsra_Stage_HAI(hsraApplicationId);
	}

	/**
	 * Returns the number of hsra application current stages where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application current stages
	 */
	public static int countBygetHsra_Stage_HAI(long hsraApplicationId) {
		return getPersistence().countBygetHsra_Stage_HAI(hsraApplicationId);
	}

	/**
	 * Caches the hsra application current stage in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationCurrentStage the hsra application current stage
	 */
	public static void cacheResult(
		HsraApplicationCurrentStage hsraApplicationCurrentStage) {

		getPersistence().cacheResult(hsraApplicationCurrentStage);
	}

	/**
	 * Caches the hsra application current stages in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationCurrentStages the hsra application current stages
	 */
	public static void cacheResult(
		List<HsraApplicationCurrentStage> hsraApplicationCurrentStages) {

		getPersistence().cacheResult(hsraApplicationCurrentStages);
	}

	/**
	 * Creates a new hsra application current stage with the primary key. Does not add the hsra application current stage to the database.
	 *
	 * @param hsraApplicationCurrentStageId the primary key for the new hsra application current stage
	 * @return the new hsra application current stage
	 */
	public static HsraApplicationCurrentStage create(
		long hsraApplicationCurrentStageId) {

		return getPersistence().create(hsraApplicationCurrentStageId);
	}

	/**
	 * Removes the hsra application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage that was removed
	 * @throws NoSuchHsraApplicationCurrentStageException if a hsra application current stage with the primary key could not be found
	 */
	public static HsraApplicationCurrentStage remove(
			long hsraApplicationCurrentStageId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationCurrentStageException {

		return getPersistence().remove(hsraApplicationCurrentStageId);
	}

	public static HsraApplicationCurrentStage updateImpl(
		HsraApplicationCurrentStage hsraApplicationCurrentStage) {

		return getPersistence().updateImpl(hsraApplicationCurrentStage);
	}

	/**
	 * Returns the hsra application current stage with the primary key or throws a <code>NoSuchHsraApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage
	 * @throws NoSuchHsraApplicationCurrentStageException if a hsra application current stage with the primary key could not be found
	 */
	public static HsraApplicationCurrentStage findByPrimaryKey(
			long hsraApplicationCurrentStageId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(hsraApplicationCurrentStageId);
	}

	/**
	 * Returns the hsra application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationCurrentStageId the primary key of the hsra application current stage
	 * @return the hsra application current stage, or <code>null</code> if a hsra application current stage with the primary key could not be found
	 */
	public static HsraApplicationCurrentStage fetchByPrimaryKey(
		long hsraApplicationCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(
			hsraApplicationCurrentStageId);
	}

	/**
	 * Returns all the hsra application current stages.
	 *
	 * @return the hsra application current stages
	 */
	public static List<HsraApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @return the range of hsra application current stages
	 */
	public static List<HsraApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application current stages
	 */
	public static List<HsraApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the hsra application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application current stages
	 * @param end the upper bound of the range of hsra application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application current stages
	 */
	public static List<HsraApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the hsra application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of hsra application current stages.
	 *
	 * @return the number of hsra application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HsraApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HsraApplicationCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HsraApplicationCurrentStagePersistence _persistence;

}