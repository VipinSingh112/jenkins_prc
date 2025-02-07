/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.model.AgriApplicationCurrentStage;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the agri application current stage service. This utility wraps <code>com.agriculture.application.form.service.service.persistence.impl.AgriApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriApplicationCurrentStagePersistence
 * @generated
 */
public class AgriApplicationCurrentStageUtil {

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
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		getPersistence().clearCache(agriApplicationCurrentStage);
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
	public static Map<Serializable, AgriApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AgriApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AgriApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AgriApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AgriApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AgriApplicationCurrentStage update(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		return getPersistence().update(agriApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AgriApplicationCurrentStage update(
		AgriApplicationCurrentStage agriApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			agriApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a matching agri application current stage could not be found
	 */
	public static AgriApplicationCurrentStage findBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriApplicationCurrentStageException {

		return getPersistence().findBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	public static AgriApplicationCurrentStage fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	public static AgriApplicationCurrentStage fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAgricultureById(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agri application current stage where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agri application current stage that was removed
	 */
	public static AgriApplicationCurrentStage removeBygetAgricultureById(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriApplicationCurrentStageException {

		return getPersistence().removeBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agri application current stages where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agri application current stages
	 */
	public static int countBygetAgricultureById(long agricultureApplicationId) {
		return getPersistence().countBygetAgricultureById(
			agricultureApplicationId);
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a matching agri application current stage could not be found
	 */
	public static AgriApplicationCurrentStage findBygetAA_Stage_AAI(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriApplicationCurrentStageException {

		return getPersistence().findBygetAA_Stage_AAI(agricultureApplicationId);
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	public static AgriApplicationCurrentStage fetchBygetAA_Stage_AAI(
		long agricultureApplicationId) {

		return getPersistence().fetchBygetAA_Stage_AAI(
			agricultureApplicationId);
	}

	/**
	 * Returns the agri application current stage where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agri application current stage, or <code>null</code> if a matching agri application current stage could not be found
	 */
	public static AgriApplicationCurrentStage fetchBygetAA_Stage_AAI(
		long agricultureApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAA_Stage_AAI(
			agricultureApplicationId, useFinderCache);
	}

	/**
	 * Removes the agri application current stage where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agri application current stage that was removed
	 */
	public static AgriApplicationCurrentStage removeBygetAA_Stage_AAI(
			long agricultureApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriApplicationCurrentStageException {

		return getPersistence().removeBygetAA_Stage_AAI(
			agricultureApplicationId);
	}

	/**
	 * Returns the number of agri application current stages where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agri application current stages
	 */
	public static int countBygetAA_Stage_AAI(long agricultureApplicationId) {
		return getPersistence().countBygetAA_Stage_AAI(
			agricultureApplicationId);
	}

	/**
	 * Caches the agri application current stage in the entity cache if it is enabled.
	 *
	 * @param agriApplicationCurrentStage the agri application current stage
	 */
	public static void cacheResult(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		getPersistence().cacheResult(agriApplicationCurrentStage);
	}

	/**
	 * Caches the agri application current stages in the entity cache if it is enabled.
	 *
	 * @param agriApplicationCurrentStages the agri application current stages
	 */
	public static void cacheResult(
		List<AgriApplicationCurrentStage> agriApplicationCurrentStages) {

		getPersistence().cacheResult(agriApplicationCurrentStages);
	}

	/**
	 * Creates a new agri application current stage with the primary key. Does not add the agri application current stage to the database.
	 *
	 * @param agriApplicationCurrentStageId the primary key for the new agri application current stage
	 * @return the new agri application current stage
	 */
	public static AgriApplicationCurrentStage create(
		long agriApplicationCurrentStageId) {

		return getPersistence().create(agriApplicationCurrentStageId);
	}

	/**
	 * Removes the agri application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage that was removed
	 * @throws NoSuchAgriApplicationCurrentStageException if a agri application current stage with the primary key could not be found
	 */
	public static AgriApplicationCurrentStage remove(
			long agriApplicationCurrentStageId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriApplicationCurrentStageException {

		return getPersistence().remove(agriApplicationCurrentStageId);
	}

	public static AgriApplicationCurrentStage updateImpl(
		AgriApplicationCurrentStage agriApplicationCurrentStage) {

		return getPersistence().updateImpl(agriApplicationCurrentStage);
	}

	/**
	 * Returns the agri application current stage with the primary key or throws a <code>NoSuchAgriApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage
	 * @throws NoSuchAgriApplicationCurrentStageException if a agri application current stage with the primary key could not be found
	 */
	public static AgriApplicationCurrentStage findByPrimaryKey(
			long agriApplicationCurrentStageId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(agriApplicationCurrentStageId);
	}

	/**
	 * Returns the agri application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriApplicationCurrentStageId the primary key of the agri application current stage
	 * @return the agri application current stage, or <code>null</code> if a agri application current stage with the primary key could not be found
	 */
	public static AgriApplicationCurrentStage fetchByPrimaryKey(
		long agriApplicationCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(
			agriApplicationCurrentStageId);
	}

	/**
	 * Returns all the agri application current stages.
	 *
	 * @return the agri application current stages
	 */
	public static List<AgriApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @return the range of agri application current stages
	 */
	public static List<AgriApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agri application current stages
	 */
	public static List<AgriApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<AgriApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the agri application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agri application current stages
	 * @param end the upper bound of the range of agri application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agri application current stages
	 */
	public static List<AgriApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<AgriApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the agri application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of agri application current stages.
	 *
	 * @return the number of agri application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AgriApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AgriApplicationCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AgriApplicationCurrentStagePersistence _persistence;

}