/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.application.form.service.model.AcquireCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the acquire current stage service. This utility wraps <code>com.nbp.acquire.application.form.service.service.persistence.impl.AcquireCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireCurrentStagePersistence
 * @generated
 */
public class AcquireCurrentStageUtil {

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
	public static void clearCache(AcquireCurrentStage acquireCurrentStage) {
		getPersistence().clearCache(acquireCurrentStage);
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
	public static Map<Serializable, AcquireCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AcquireCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AcquireCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AcquireCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AcquireCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AcquireCurrentStage update(
		AcquireCurrentStage acquireCurrentStage) {

		return getPersistence().update(acquireCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AcquireCurrentStage update(
		AcquireCurrentStage acquireCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(acquireCurrentStage, serviceContext);
	}

	/**
	 * Returns the acquire current stage where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireCurrentStageException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire current stage
	 * @throws NoSuchAcquireCurrentStageException if a matching acquire current stage could not be found
	 */
	public static AcquireCurrentStage findBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireCurrentStageException {

		return getPersistence().findBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire current stage where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire current stage, or <code>null</code> if a matching acquire current stage could not be found
	 */
	public static AcquireCurrentStage fetchBygetAcquireById(
		long acquireApplicationId) {

		return getPersistence().fetchBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the acquire current stage where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire current stage, or <code>null</code> if a matching acquire current stage could not be found
	 */
	public static AcquireCurrentStage fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetAcquireById(
			acquireApplicationId, useFinderCache);
	}

	/**
	 * Removes the acquire current stage where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire current stage that was removed
	 */
	public static AcquireCurrentStage removeBygetAcquireById(
			long acquireApplicationId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireCurrentStageException {

		return getPersistence().removeBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Returns the number of acquire current stages where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire current stages
	 */
	public static int countBygetAcquireById(long acquireApplicationId) {
		return getPersistence().countBygetAcquireById(acquireApplicationId);
	}

	/**
	 * Caches the acquire current stage in the entity cache if it is enabled.
	 *
	 * @param acquireCurrentStage the acquire current stage
	 */
	public static void cacheResult(AcquireCurrentStage acquireCurrentStage) {
		getPersistence().cacheResult(acquireCurrentStage);
	}

	/**
	 * Caches the acquire current stages in the entity cache if it is enabled.
	 *
	 * @param acquireCurrentStages the acquire current stages
	 */
	public static void cacheResult(
		List<AcquireCurrentStage> acquireCurrentStages) {

		getPersistence().cacheResult(acquireCurrentStages);
	}

	/**
	 * Creates a new acquire current stage with the primary key. Does not add the acquire current stage to the database.
	 *
	 * @param acquireCurrentStageId the primary key for the new acquire current stage
	 * @return the new acquire current stage
	 */
	public static AcquireCurrentStage create(long acquireCurrentStageId) {
		return getPersistence().create(acquireCurrentStageId);
	}

	/**
	 * Removes the acquire current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage that was removed
	 * @throws NoSuchAcquireCurrentStageException if a acquire current stage with the primary key could not be found
	 */
	public static AcquireCurrentStage remove(long acquireCurrentStageId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireCurrentStageException {

		return getPersistence().remove(acquireCurrentStageId);
	}

	public static AcquireCurrentStage updateImpl(
		AcquireCurrentStage acquireCurrentStage) {

		return getPersistence().updateImpl(acquireCurrentStage);
	}

	/**
	 * Returns the acquire current stage with the primary key or throws a <code>NoSuchAcquireCurrentStageException</code> if it could not be found.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage
	 * @throws NoSuchAcquireCurrentStageException if a acquire current stage with the primary key could not be found
	 */
	public static AcquireCurrentStage findByPrimaryKey(
			long acquireCurrentStageId)
		throws com.nbp.acquire.application.form.service.exception.
			NoSuchAcquireCurrentStageException {

		return getPersistence().findByPrimaryKey(acquireCurrentStageId);
	}

	/**
	 * Returns the acquire current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireCurrentStageId the primary key of the acquire current stage
	 * @return the acquire current stage, or <code>null</code> if a acquire current stage with the primary key could not be found
	 */
	public static AcquireCurrentStage fetchByPrimaryKey(
		long acquireCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(acquireCurrentStageId);
	}

	/**
	 * Returns all the acquire current stages.
	 *
	 * @return the acquire current stages
	 */
	public static List<AcquireCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @return the range of acquire current stages
	 */
	public static List<AcquireCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire current stages
	 */
	public static List<AcquireCurrentStage> findAll(
		int start, int end,
		OrderByComparator<AcquireCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the acquire current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire current stages
	 * @param end the upper bound of the range of acquire current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire current stages
	 */
	public static List<AcquireCurrentStage> findAll(
		int start, int end,
		OrderByComparator<AcquireCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the acquire current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of acquire current stages.
	 *
	 * @return the number of acquire current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AcquireCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		AcquireCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AcquireCurrentStagePersistence _persistence;

}