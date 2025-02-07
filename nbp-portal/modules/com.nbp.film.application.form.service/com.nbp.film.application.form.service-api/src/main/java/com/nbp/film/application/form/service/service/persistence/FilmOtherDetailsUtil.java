/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.application.form.service.model.FilmOtherDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film other details service. This utility wraps <code>com.nbp.film.application.form.service.service.persistence.impl.FilmOtherDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmOtherDetailsPersistence
 * @generated
 */
public class FilmOtherDetailsUtil {

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
	public static void clearCache(FilmOtherDetails filmOtherDetails) {
		getPersistence().clearCache(filmOtherDetails);
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
	public static Map<Serializable, FilmOtherDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmOtherDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmOtherDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmOtherDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmOtherDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmOtherDetails update(FilmOtherDetails filmOtherDetails) {
		return getPersistence().update(filmOtherDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmOtherDetails update(
		FilmOtherDetails filmOtherDetails, ServiceContext serviceContext) {

		return getPersistence().update(filmOtherDetails, serviceContext);
	}

	/**
	 * Returns the film other details where filmApplicationId = &#63; or throws a <code>NoSuchFilmOtherDetailsException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film other details
	 * @throws NoSuchFilmOtherDetailsException if a matching film other details could not be found
	 */
	public static FilmOtherDetails findBygetFilmById(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmOtherDetailsException {

		return getPersistence().findBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film other details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film other details, or <code>null</code> if a matching film other details could not be found
	 */
	public static FilmOtherDetails fetchBygetFilmById(long filmApplicationId) {
		return getPersistence().fetchBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film other details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film other details, or <code>null</code> if a matching film other details could not be found
	 */
	public static FilmOtherDetails fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmById(
			filmApplicationId, useFinderCache);
	}

	/**
	 * Removes the film other details where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film other details that was removed
	 */
	public static FilmOtherDetails removeBygetFilmById(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmOtherDetailsException {

		return getPersistence().removeBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the number of film other detailses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film other detailses
	 */
	public static int countBygetFilmById(long filmApplicationId) {
		return getPersistence().countBygetFilmById(filmApplicationId);
	}

	/**
	 * Caches the film other details in the entity cache if it is enabled.
	 *
	 * @param filmOtherDetails the film other details
	 */
	public static void cacheResult(FilmOtherDetails filmOtherDetails) {
		getPersistence().cacheResult(filmOtherDetails);
	}

	/**
	 * Caches the film other detailses in the entity cache if it is enabled.
	 *
	 * @param filmOtherDetailses the film other detailses
	 */
	public static void cacheResult(List<FilmOtherDetails> filmOtherDetailses) {
		getPersistence().cacheResult(filmOtherDetailses);
	}

	/**
	 * Creates a new film other details with the primary key. Does not add the film other details to the database.
	 *
	 * @param filmOtherDetailsId the primary key for the new film other details
	 * @return the new film other details
	 */
	public static FilmOtherDetails create(long filmOtherDetailsId) {
		return getPersistence().create(filmOtherDetailsId);
	}

	/**
	 * Removes the film other details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details that was removed
	 * @throws NoSuchFilmOtherDetailsException if a film other details with the primary key could not be found
	 */
	public static FilmOtherDetails remove(long filmOtherDetailsId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmOtherDetailsException {

		return getPersistence().remove(filmOtherDetailsId);
	}

	public static FilmOtherDetails updateImpl(
		FilmOtherDetails filmOtherDetails) {

		return getPersistence().updateImpl(filmOtherDetails);
	}

	/**
	 * Returns the film other details with the primary key or throws a <code>NoSuchFilmOtherDetailsException</code> if it could not be found.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details
	 * @throws NoSuchFilmOtherDetailsException if a film other details with the primary key could not be found
	 */
	public static FilmOtherDetails findByPrimaryKey(long filmOtherDetailsId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmOtherDetailsException {

		return getPersistence().findByPrimaryKey(filmOtherDetailsId);
	}

	/**
	 * Returns the film other details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details, or <code>null</code> if a film other details with the primary key could not be found
	 */
	public static FilmOtherDetails fetchByPrimaryKey(long filmOtherDetailsId) {
		return getPersistence().fetchByPrimaryKey(filmOtherDetailsId);
	}

	/**
	 * Returns all the film other detailses.
	 *
	 * @return the film other detailses
	 */
	public static List<FilmOtherDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the film other detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmOtherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film other detailses
	 * @param end the upper bound of the range of film other detailses (not inclusive)
	 * @return the range of film other detailses
	 */
	public static List<FilmOtherDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the film other detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmOtherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film other detailses
	 * @param end the upper bound of the range of film other detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film other detailses
	 */
	public static List<FilmOtherDetails> findAll(
		int start, int end,
		OrderByComparator<FilmOtherDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film other detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmOtherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film other detailses
	 * @param end the upper bound of the range of film other detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film other detailses
	 */
	public static List<FilmOtherDetails> findAll(
		int start, int end,
		OrderByComparator<FilmOtherDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film other detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film other detailses.
	 *
	 * @return the number of film other detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmOtherDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(FilmOtherDetailsPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile FilmOtherDetailsPersistence _persistence;

}