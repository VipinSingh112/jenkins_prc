/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the pharma current stage service. This utility wraps <code>com.nbp.pharmaceutical.application.form.service.service.persistence.impl.PharmaCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaCurrentStagePersistence
 * @generated
 */
public class PharmaCurrentStageUtil {

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
	public static void clearCache(PharmaCurrentStage pharmaCurrentStage) {
		getPersistence().clearCache(pharmaCurrentStage);
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
	public static Map<Serializable, PharmaCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PharmaCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PharmaCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PharmaCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PharmaCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PharmaCurrentStage update(
		PharmaCurrentStage pharmaCurrentStage) {

		return getPersistence().update(pharmaCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PharmaCurrentStage update(
		PharmaCurrentStage pharmaCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(pharmaCurrentStage, serviceContext);
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaCurrentStageException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a matching pharma current stage could not be found
	 */
	public static PharmaCurrentStage findBygetpharmaById(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCurrentStageException {

		return getPersistence().findBygetpharmaById(pharmaApplicationId);
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	public static PharmaCurrentStage fetchBygetpharmaById(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetpharmaById(pharmaApplicationId);
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	public static PharmaCurrentStage fetchBygetpharmaById(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetpharmaById(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma current stage where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma current stage that was removed
	 */
	public static PharmaCurrentStage removeBygetpharmaById(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCurrentStageException {

		return getPersistence().removeBygetpharmaById(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma current stages where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma current stages
	 */
	public static int countBygetpharmaById(long pharmaApplicationId) {
		return getPersistence().countBygetpharmaById(pharmaApplicationId);
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaCurrentStageException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a matching pharma current stage could not be found
	 */
	public static PharmaCurrentStage findBygetPA_CS_PAI(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCurrentStageException {

		return getPersistence().findBygetPA_CS_PAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	public static PharmaCurrentStage fetchBygetPA_CS_PAI(
		long pharmaApplicationId) {

		return getPersistence().fetchBygetPA_CS_PAI(pharmaApplicationId);
	}

	/**
	 * Returns the pharma current stage where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma current stage, or <code>null</code> if a matching pharma current stage could not be found
	 */
	public static PharmaCurrentStage fetchBygetPA_CS_PAI(
		long pharmaApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetPA_CS_PAI(
			pharmaApplicationId, useFinderCache);
	}

	/**
	 * Removes the pharma current stage where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma current stage that was removed
	 */
	public static PharmaCurrentStage removeBygetPA_CS_PAI(
			long pharmaApplicationId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCurrentStageException {

		return getPersistence().removeBygetPA_CS_PAI(pharmaApplicationId);
	}

	/**
	 * Returns the number of pharma current stages where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma current stages
	 */
	public static int countBygetPA_CS_PAI(long pharmaApplicationId) {
		return getPersistence().countBygetPA_CS_PAI(pharmaApplicationId);
	}

	/**
	 * Caches the pharma current stage in the entity cache if it is enabled.
	 *
	 * @param pharmaCurrentStage the pharma current stage
	 */
	public static void cacheResult(PharmaCurrentStage pharmaCurrentStage) {
		getPersistence().cacheResult(pharmaCurrentStage);
	}

	/**
	 * Caches the pharma current stages in the entity cache if it is enabled.
	 *
	 * @param pharmaCurrentStages the pharma current stages
	 */
	public static void cacheResult(
		List<PharmaCurrentStage> pharmaCurrentStages) {

		getPersistence().cacheResult(pharmaCurrentStages);
	}

	/**
	 * Creates a new pharma current stage with the primary key. Does not add the pharma current stage to the database.
	 *
	 * @param pharmaCurrentStageId the primary key for the new pharma current stage
	 * @return the new pharma current stage
	 */
	public static PharmaCurrentStage create(long pharmaCurrentStageId) {
		return getPersistence().create(pharmaCurrentStageId);
	}

	/**
	 * Removes the pharma current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage that was removed
	 * @throws NoSuchPharmaCurrentStageException if a pharma current stage with the primary key could not be found
	 */
	public static PharmaCurrentStage remove(long pharmaCurrentStageId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCurrentStageException {

		return getPersistence().remove(pharmaCurrentStageId);
	}

	public static PharmaCurrentStage updateImpl(
		PharmaCurrentStage pharmaCurrentStage) {

		return getPersistence().updateImpl(pharmaCurrentStage);
	}

	/**
	 * Returns the pharma current stage with the primary key or throws a <code>NoSuchPharmaCurrentStageException</code> if it could not be found.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage
	 * @throws NoSuchPharmaCurrentStageException if a pharma current stage with the primary key could not be found
	 */
	public static PharmaCurrentStage findByPrimaryKey(long pharmaCurrentStageId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaCurrentStageException {

		return getPersistence().findByPrimaryKey(pharmaCurrentStageId);
	}

	/**
	 * Returns the pharma current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaCurrentStageId the primary key of the pharma current stage
	 * @return the pharma current stage, or <code>null</code> if a pharma current stage with the primary key could not be found
	 */
	public static PharmaCurrentStage fetchByPrimaryKey(
		long pharmaCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(pharmaCurrentStageId);
	}

	/**
	 * Returns all the pharma current stages.
	 *
	 * @return the pharma current stages
	 */
	public static List<PharmaCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @return the range of pharma current stages
	 */
	public static List<PharmaCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma current stages
	 */
	public static List<PharmaCurrentStage> findAll(
		int start, int end,
		OrderByComparator<PharmaCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the pharma current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma current stages
	 * @param end the upper bound of the range of pharma current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma current stages
	 */
	public static List<PharmaCurrentStage> findAll(
		int start, int end,
		OrderByComparator<PharmaCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the pharma current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of pharma current stages.
	 *
	 * @return the number of pharma current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PharmaCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		PharmaCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile PharmaCurrentStagePersistence _persistence;

}