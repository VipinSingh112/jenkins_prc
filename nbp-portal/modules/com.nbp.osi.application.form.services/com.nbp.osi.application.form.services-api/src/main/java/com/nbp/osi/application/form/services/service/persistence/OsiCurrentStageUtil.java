/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.OsiCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi current stage service. This utility wraps <code>com.nbp.osi.application.form.services.service.persistence.impl.OsiCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiCurrentStagePersistence
 * @generated
 */
public class OsiCurrentStageUtil {

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
	public static void clearCache(OsiCurrentStage osiCurrentStage) {
		getPersistence().clearCache(osiCurrentStage);
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
	public static Map<Serializable, OsiCurrentStage> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiCurrentStage update(OsiCurrentStage osiCurrentStage) {
		return getPersistence().update(osiCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiCurrentStage update(
		OsiCurrentStage osiCurrentStage, ServiceContext serviceContext) {

		return getPersistence().update(osiCurrentStage, serviceContext);
	}

	/**
	 * Returns the osi current stage where osiApplicationId = &#63; or throws a <code>NoSuchOsiCurrentStageException</code> if it could not be found.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi current stage
	 * @throws NoSuchOsiCurrentStageException if a matching osi current stage could not be found
	 */
	public static OsiCurrentStage findBygetOsiById(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiCurrentStageException {

		return getPersistence().findBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the osi current stage where osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi current stage, or <code>null</code> if a matching osi current stage could not be found
	 */
	public static OsiCurrentStage fetchBygetOsiById(long osiApplicationId) {
		return getPersistence().fetchBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the osi current stage where osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi current stage, or <code>null</code> if a matching osi current stage could not be found
	 */
	public static OsiCurrentStage fetchBygetOsiById(
		long osiApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiApplicationId, useFinderCache);
	}

	/**
	 * Removes the osi current stage where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the osi current stage that was removed
	 */
	public static OsiCurrentStage removeBygetOsiById(long osiApplicationId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiCurrentStageException {

		return getPersistence().removeBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the number of osi current stages where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi current stages
	 */
	public static int countBygetOsiById(long osiApplicationId) {
		return getPersistence().countBygetOsiById(osiApplicationId);
	}

	/**
	 * Caches the osi current stage in the entity cache if it is enabled.
	 *
	 * @param osiCurrentStage the osi current stage
	 */
	public static void cacheResult(OsiCurrentStage osiCurrentStage) {
		getPersistence().cacheResult(osiCurrentStage);
	}

	/**
	 * Caches the osi current stages in the entity cache if it is enabled.
	 *
	 * @param osiCurrentStages the osi current stages
	 */
	public static void cacheResult(List<OsiCurrentStage> osiCurrentStages) {
		getPersistence().cacheResult(osiCurrentStages);
	}

	/**
	 * Creates a new osi current stage with the primary key. Does not add the osi current stage to the database.
	 *
	 * @param osiCurrentStageId the primary key for the new osi current stage
	 * @return the new osi current stage
	 */
	public static OsiCurrentStage create(long osiCurrentStageId) {
		return getPersistence().create(osiCurrentStageId);
	}

	/**
	 * Removes the osi current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage that was removed
	 * @throws NoSuchOsiCurrentStageException if a osi current stage with the primary key could not be found
	 */
	public static OsiCurrentStage remove(long osiCurrentStageId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiCurrentStageException {

		return getPersistence().remove(osiCurrentStageId);
	}

	public static OsiCurrentStage updateImpl(OsiCurrentStage osiCurrentStage) {
		return getPersistence().updateImpl(osiCurrentStage);
	}

	/**
	 * Returns the osi current stage with the primary key or throws a <code>NoSuchOsiCurrentStageException</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage
	 * @throws NoSuchOsiCurrentStageException if a osi current stage with the primary key could not be found
	 */
	public static OsiCurrentStage findByPrimaryKey(long osiCurrentStageId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchOsiCurrentStageException {

		return getPersistence().findByPrimaryKey(osiCurrentStageId);
	}

	/**
	 * Returns the osi current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiCurrentStageId the primary key of the osi current stage
	 * @return the osi current stage, or <code>null</code> if a osi current stage with the primary key could not be found
	 */
	public static OsiCurrentStage fetchByPrimaryKey(long osiCurrentStageId) {
		return getPersistence().fetchByPrimaryKey(osiCurrentStageId);
	}

	/**
	 * Returns all the osi current stages.
	 *
	 * @return the osi current stages
	 */
	public static List<OsiCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @return the range of osi current stages
	 */
	public static List<OsiCurrentStage> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi current stages
	 */
	public static List<OsiCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OsiCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi current stages
	 * @param end the upper bound of the range of osi current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi current stages
	 */
	public static List<OsiCurrentStage> findAll(
		int start, int end,
		OrderByComparator<OsiCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi current stages.
	 *
	 * @return the number of osi current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(OsiCurrentStagePersistence persistence) {
		_persistence = persistence;
	}

	private static volatile OsiCurrentStagePersistence _persistence;

}