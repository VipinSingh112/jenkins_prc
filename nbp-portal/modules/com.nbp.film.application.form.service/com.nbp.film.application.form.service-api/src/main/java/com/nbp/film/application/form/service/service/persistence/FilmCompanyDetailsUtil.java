/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.application.form.service.model.FilmCompanyDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film company details service. This utility wraps <code>com.nbp.film.application.form.service.service.persistence.impl.FilmCompanyDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmCompanyDetailsPersistence
 * @generated
 */
public class FilmCompanyDetailsUtil {

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
	public static void clearCache(FilmCompanyDetails filmCompanyDetails) {
		getPersistence().clearCache(filmCompanyDetails);
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
	public static Map<Serializable, FilmCompanyDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmCompanyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmCompanyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmCompanyDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmCompanyDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmCompanyDetails update(
		FilmCompanyDetails filmCompanyDetails) {

		return getPersistence().update(filmCompanyDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmCompanyDetails update(
		FilmCompanyDetails filmCompanyDetails, ServiceContext serviceContext) {

		return getPersistence().update(filmCompanyDetails, serviceContext);
	}

	/**
	 * Returns the film company details where filmApplicationId = &#63; or throws a <code>NoSuchFilmCompanyDetailsException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film company details
	 * @throws NoSuchFilmCompanyDetailsException if a matching film company details could not be found
	 */
	public static FilmCompanyDetails findBygetFilmById(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmCompanyDetailsException {

		return getPersistence().findBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film company details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film company details, or <code>null</code> if a matching film company details could not be found
	 */
	public static FilmCompanyDetails fetchBygetFilmById(
		long filmApplicationId) {

		return getPersistence().fetchBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film company details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film company details, or <code>null</code> if a matching film company details could not be found
	 */
	public static FilmCompanyDetails fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmById(
			filmApplicationId, useFinderCache);
	}

	/**
	 * Removes the film company details where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film company details that was removed
	 */
	public static FilmCompanyDetails removeBygetFilmById(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmCompanyDetailsException {

		return getPersistence().removeBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the number of film company detailses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film company detailses
	 */
	public static int countBygetFilmById(long filmApplicationId) {
		return getPersistence().countBygetFilmById(filmApplicationId);
	}

	/**
	 * Caches the film company details in the entity cache if it is enabled.
	 *
	 * @param filmCompanyDetails the film company details
	 */
	public static void cacheResult(FilmCompanyDetails filmCompanyDetails) {
		getPersistence().cacheResult(filmCompanyDetails);
	}

	/**
	 * Caches the film company detailses in the entity cache if it is enabled.
	 *
	 * @param filmCompanyDetailses the film company detailses
	 */
	public static void cacheResult(
		List<FilmCompanyDetails> filmCompanyDetailses) {

		getPersistence().cacheResult(filmCompanyDetailses);
	}

	/**
	 * Creates a new film company details with the primary key. Does not add the film company details to the database.
	 *
	 * @param filmCompanyDetailsId the primary key for the new film company details
	 * @return the new film company details
	 */
	public static FilmCompanyDetails create(long filmCompanyDetailsId) {
		return getPersistence().create(filmCompanyDetailsId);
	}

	/**
	 * Removes the film company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details that was removed
	 * @throws NoSuchFilmCompanyDetailsException if a film company details with the primary key could not be found
	 */
	public static FilmCompanyDetails remove(long filmCompanyDetailsId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmCompanyDetailsException {

		return getPersistence().remove(filmCompanyDetailsId);
	}

	public static FilmCompanyDetails updateImpl(
		FilmCompanyDetails filmCompanyDetails) {

		return getPersistence().updateImpl(filmCompanyDetails);
	}

	/**
	 * Returns the film company details with the primary key or throws a <code>NoSuchFilmCompanyDetailsException</code> if it could not be found.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details
	 * @throws NoSuchFilmCompanyDetailsException if a film company details with the primary key could not be found
	 */
	public static FilmCompanyDetails findByPrimaryKey(long filmCompanyDetailsId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmCompanyDetailsException {

		return getPersistence().findByPrimaryKey(filmCompanyDetailsId);
	}

	/**
	 * Returns the film company details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details, or <code>null</code> if a film company details with the primary key could not be found
	 */
	public static FilmCompanyDetails fetchByPrimaryKey(
		long filmCompanyDetailsId) {

		return getPersistence().fetchByPrimaryKey(filmCompanyDetailsId);
	}

	/**
	 * Returns all the film company detailses.
	 *
	 * @return the film company detailses
	 */
	public static List<FilmCompanyDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the film company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film company detailses
	 * @param end the upper bound of the range of film company detailses (not inclusive)
	 * @return the range of film company detailses
	 */
	public static List<FilmCompanyDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the film company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film company detailses
	 * @param end the upper bound of the range of film company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film company detailses
	 */
	public static List<FilmCompanyDetails> findAll(
		int start, int end,
		OrderByComparator<FilmCompanyDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film company detailses
	 * @param end the upper bound of the range of film company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film company detailses
	 */
	public static List<FilmCompanyDetails> findAll(
		int start, int end,
		OrderByComparator<FilmCompanyDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film company detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film company detailses.
	 *
	 * @return the number of film company detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmCompanyDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmCompanyDetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmCompanyDetailsPersistence _persistence;

}