/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism application current stage service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationCurrentStagePersistence
 * @generated
 */
public class TourismApplicationCurrentStageUtil {

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
		TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		getPersistence().clearCache(tourismApplicationCurrentStage);
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
	public static Map<Serializable, TourismApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismApplicationCurrentStage update(
		TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		return getPersistence().update(tourismApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismApplicationCurrentStage update(
		TourismApplicationCurrentStage tourismApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns the tourism application current stage where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application current stage
	 * @throws NoSuchTourismApplicationCurrentStageException if a matching tourism application current stage could not be found
	 */
	public static TourismApplicationCurrentStage findBygetTA_Stage_TAI(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationCurrentStageException {

		return getPersistence().findBygetTA_Stage_TAI(tourismApplicationId);
	}

	/**
	 * Returns the tourism application current stage where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application current stage, or <code>null</code> if a matching tourism application current stage could not be found
	 */
	public static TourismApplicationCurrentStage fetchBygetTA_Stage_TAI(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTA_Stage_TAI(tourismApplicationId);
	}

	/**
	 * Returns the tourism application current stage where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application current stage, or <code>null</code> if a matching tourism application current stage could not be found
	 */
	public static TourismApplicationCurrentStage fetchBygetTA_Stage_TAI(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTA_Stage_TAI(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism application current stage where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application current stage that was removed
	 */
	public static TourismApplicationCurrentStage removeBygetTA_Stage_TAI(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationCurrentStageException {

		return getPersistence().removeBygetTA_Stage_TAI(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism application current stages where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism application current stages
	 */
	public static int countBygetTA_Stage_TAI(long tourismApplicationId) {
		return getPersistence().countBygetTA_Stage_TAI(tourismApplicationId);
	}

	/**
	 * Caches the tourism application current stage in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationCurrentStage the tourism application current stage
	 */
	public static void cacheResult(
		TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		getPersistence().cacheResult(tourismApplicationCurrentStage);
	}

	/**
	 * Caches the tourism application current stages in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationCurrentStages the tourism application current stages
	 */
	public static void cacheResult(
		List<TourismApplicationCurrentStage> tourismApplicationCurrentStages) {

		getPersistence().cacheResult(tourismApplicationCurrentStages);
	}

	/**
	 * Creates a new tourism application current stage with the primary key. Does not add the tourism application current stage to the database.
	 *
	 * @param tourismAppliCurrentStageId the primary key for the new tourism application current stage
	 * @return the new tourism application current stage
	 */
	public static TourismApplicationCurrentStage create(
		long tourismAppliCurrentStageId) {

		return getPersistence().create(tourismAppliCurrentStageId);
	}

	/**
	 * Removes the tourism application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismAppliCurrentStageId the primary key of the tourism application current stage
	 * @return the tourism application current stage that was removed
	 * @throws NoSuchTourismApplicationCurrentStageException if a tourism application current stage with the primary key could not be found
	 */
	public static TourismApplicationCurrentStage remove(
			long tourismAppliCurrentStageId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationCurrentStageException {

		return getPersistence().remove(tourismAppliCurrentStageId);
	}

	public static TourismApplicationCurrentStage updateImpl(
		TourismApplicationCurrentStage tourismApplicationCurrentStage) {

		return getPersistence().updateImpl(tourismApplicationCurrentStage);
	}

	/**
	 * Returns the tourism application current stage with the primary key or throws a <code>NoSuchTourismApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param tourismAppliCurrentStageId the primary key of the tourism application current stage
	 * @return the tourism application current stage
	 * @throws NoSuchTourismApplicationCurrentStageException if a tourism application current stage with the primary key could not be found
	 */
	public static TourismApplicationCurrentStage findByPrimaryKey(
			long tourismAppliCurrentStageId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(tourismAppliCurrentStageId);
	}

	/**
	 * Returns the tourism application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismAppliCurrentStageId the primary key of the tourism application current stage
	 * @return the tourism application current stage, or <code>null</code> if a tourism application current stage with the primary key could not be found
	 */
	public static TourismApplicationCurrentStage fetchByPrimaryKey(
		long tourismAppliCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(tourismAppliCurrentStageId);
	}

	/**
	 * Returns all the tourism application current stages.
	 *
	 * @return the tourism application current stages
	 */
	public static List<TourismApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application current stages
	 * @param end the upper bound of the range of tourism application current stages (not inclusive)
	 * @return the range of tourism application current stages
	 */
	public static List<TourismApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application current stages
	 * @param end the upper bound of the range of tourism application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism application current stages
	 */
	public static List<TourismApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application current stages
	 * @param end the upper bound of the range of tourism application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism application current stages
	 */
	public static List<TourismApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism application current stages.
	 *
	 * @return the number of tourism application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismApplicationCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismApplicationCurrentStagePersistence
		_persistence;

}