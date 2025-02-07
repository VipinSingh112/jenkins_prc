/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.application.form.service.model.FilmApplicationCurrentStage;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film application current stage service. This utility wraps <code>com.nbp.film.application.form.service.service.persistence.impl.FilmApplicationCurrentStagePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationCurrentStagePersistence
 * @generated
 */
public class FilmApplicationCurrentStageUtil {

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
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		getPersistence().clearCache(filmApplicationCurrentStage);
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
	public static Map<Serializable, FilmApplicationCurrentStage>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmApplicationCurrentStage> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmApplicationCurrentStage> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmApplicationCurrentStage update(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		return getPersistence().update(filmApplicationCurrentStage);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmApplicationCurrentStage update(
		FilmApplicationCurrentStage filmApplicationCurrentStage,
		ServiceContext serviceContext) {

		return getPersistence().update(
			filmApplicationCurrentStage, serviceContext);
	}

	/**
	 * Returns the film application current stage where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application current stage
	 * @throws NoSuchFilmApplicationCurrentStageException if a matching film application current stage could not be found
	 */
	public static FilmApplicationCurrentStage findBygetFilmById(
			long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationCurrentStageException {

		return getPersistence().findBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film application current stage where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application current stage, or <code>null</code> if a matching film application current stage could not be found
	 */
	public static FilmApplicationCurrentStage fetchBygetFilmById(
		long filmApplicationId) {

		return getPersistence().fetchBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film application current stage where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application current stage, or <code>null</code> if a matching film application current stage could not be found
	 */
	public static FilmApplicationCurrentStage fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmById(
			filmApplicationId, useFinderCache);
	}

	/**
	 * Removes the film application current stage where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application current stage that was removed
	 */
	public static FilmApplicationCurrentStage removeBygetFilmById(
			long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationCurrentStageException {

		return getPersistence().removeBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the number of film application current stages where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film application current stages
	 */
	public static int countBygetFilmById(long filmApplicationId) {
		return getPersistence().countBygetFilmById(filmApplicationId);
	}

	/**
	 * Caches the film application current stage in the entity cache if it is enabled.
	 *
	 * @param filmApplicationCurrentStage the film application current stage
	 */
	public static void cacheResult(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		getPersistence().cacheResult(filmApplicationCurrentStage);
	}

	/**
	 * Caches the film application current stages in the entity cache if it is enabled.
	 *
	 * @param filmApplicationCurrentStages the film application current stages
	 */
	public static void cacheResult(
		List<FilmApplicationCurrentStage> filmApplicationCurrentStages) {

		getPersistence().cacheResult(filmApplicationCurrentStages);
	}

	/**
	 * Creates a new film application current stage with the primary key. Does not add the film application current stage to the database.
	 *
	 * @param filmApplicationCurrentStageId the primary key for the new film application current stage
	 * @return the new film application current stage
	 */
	public static FilmApplicationCurrentStage create(
		long filmApplicationCurrentStageId) {

		return getPersistence().create(filmApplicationCurrentStageId);
	}

	/**
	 * Removes the film application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage that was removed
	 * @throws NoSuchFilmApplicationCurrentStageException if a film application current stage with the primary key could not be found
	 */
	public static FilmApplicationCurrentStage remove(
			long filmApplicationCurrentStageId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationCurrentStageException {

		return getPersistence().remove(filmApplicationCurrentStageId);
	}

	public static FilmApplicationCurrentStage updateImpl(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		return getPersistence().updateImpl(filmApplicationCurrentStage);
	}

	/**
	 * Returns the film application current stage with the primary key or throws a <code>NoSuchFilmApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage
	 * @throws NoSuchFilmApplicationCurrentStageException if a film application current stage with the primary key could not be found
	 */
	public static FilmApplicationCurrentStage findByPrimaryKey(
			long filmApplicationCurrentStageId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationCurrentStageException {

		return getPersistence().findByPrimaryKey(filmApplicationCurrentStageId);
	}

	/**
	 * Returns the film application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage, or <code>null</code> if a film application current stage with the primary key could not be found
	 */
	public static FilmApplicationCurrentStage fetchByPrimaryKey(
		long filmApplicationCurrentStageId) {

		return getPersistence().fetchByPrimaryKey(
			filmApplicationCurrentStageId);
	}

	/**
	 * Returns all the film application current stages.
	 *
	 * @return the film application current stages
	 */
	public static List<FilmApplicationCurrentStage> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the film application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application current stages
	 * @param end the upper bound of the range of film application current stages (not inclusive)
	 * @return the range of film application current stages
	 */
	public static List<FilmApplicationCurrentStage> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the film application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application current stages
	 * @param end the upper bound of the range of film application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film application current stages
	 */
	public static List<FilmApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationCurrentStage> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application current stages
	 * @param end the upper bound of the range of film application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film application current stages
	 */
	public static List<FilmApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationCurrentStage> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film application current stages from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film application current stages.
	 *
	 * @return the number of film application current stages
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmApplicationCurrentStagePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmApplicationCurrentStagePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmApplicationCurrentStagePersistence _persistence;

}