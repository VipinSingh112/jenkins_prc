/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.application.form.service.model.FilmEquipmentList;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film equipment list service. This utility wraps <code>com.nbp.film.application.form.service.service.persistence.impl.FilmEquipmentListPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmEquipmentListPersistence
 * @generated
 */
public class FilmEquipmentListUtil {

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
	public static void clearCache(FilmEquipmentList filmEquipmentList) {
		getPersistence().clearCache(filmEquipmentList);
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
	public static Map<Serializable, FilmEquipmentList> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmEquipmentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmEquipmentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmEquipmentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmEquipmentList> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmEquipmentList update(
		FilmEquipmentList filmEquipmentList) {

		return getPersistence().update(filmEquipmentList);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmEquipmentList update(
		FilmEquipmentList filmEquipmentList, ServiceContext serviceContext) {

		return getPersistence().update(filmEquipmentList, serviceContext);
	}

	/**
	 * Returns the film equipment list where filmApplicationId = &#63; or throws a <code>NoSuchFilmEquipmentListException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film equipment list
	 * @throws NoSuchFilmEquipmentListException if a matching film equipment list could not be found
	 */
	public static FilmEquipmentList findBygetFilmById(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		return getPersistence().findBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	public static FilmEquipmentList fetchBygetFilmById(long filmApplicationId) {
		return getPersistence().fetchBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	public static FilmEquipmentList fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmById(
			filmApplicationId, useFinderCache);
	}

	/**
	 * Removes the film equipment list where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film equipment list that was removed
	 */
	public static FilmEquipmentList removeBygetFilmById(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		return getPersistence().removeBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the number of film equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film equipment lists
	 */
	public static int countBygetFilmById(long filmApplicationId) {
		return getPersistence().countBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns all the film equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film equipment lists
	 */
	public static List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId) {

		return getPersistence().findBygetFilmByAppId(filmApplicationId);
	}

	/**
	 * Returns a range of all the film equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @return the range of matching film equipment lists
	 */
	public static List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId, int start, int end) {

		return getPersistence().findBygetFilmByAppId(
			filmApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the film equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film equipment lists
	 */
	public static List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmEquipmentList> orderByComparator) {

		return getPersistence().findBygetFilmByAppId(
			filmApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film equipment lists
	 */
	public static List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmEquipmentList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFilmByAppId(
			filmApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film equipment list
	 * @throws NoSuchFilmEquipmentListException if a matching film equipment list could not be found
	 */
	public static FilmEquipmentList findBygetFilmByAppId_First(
			long filmApplicationId,
			OrderByComparator<FilmEquipmentList> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		return getPersistence().findBygetFilmByAppId_First(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the first film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	public static FilmEquipmentList fetchBygetFilmByAppId_First(
		long filmApplicationId,
		OrderByComparator<FilmEquipmentList> orderByComparator) {

		return getPersistence().fetchBygetFilmByAppId_First(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film equipment list
	 * @throws NoSuchFilmEquipmentListException if a matching film equipment list could not be found
	 */
	public static FilmEquipmentList findBygetFilmByAppId_Last(
			long filmApplicationId,
			OrderByComparator<FilmEquipmentList> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		return getPersistence().findBygetFilmByAppId_Last(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	public static FilmEquipmentList fetchBygetFilmByAppId_Last(
		long filmApplicationId,
		OrderByComparator<FilmEquipmentList> orderByComparator) {

		return getPersistence().fetchBygetFilmByAppId_Last(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the film equipment lists before and after the current film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmEquipmentListId the primary key of the current film equipment list
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film equipment list
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	public static FilmEquipmentList[] findBygetFilmByAppId_PrevAndNext(
			long filmEquipmentListId, long filmApplicationId,
			OrderByComparator<FilmEquipmentList> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		return getPersistence().findBygetFilmByAppId_PrevAndNext(
			filmEquipmentListId, filmApplicationId, orderByComparator);
	}

	/**
	 * Removes all the film equipment lists where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 */
	public static void removeBygetFilmByAppId(long filmApplicationId) {
		getPersistence().removeBygetFilmByAppId(filmApplicationId);
	}

	/**
	 * Returns the number of film equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film equipment lists
	 */
	public static int countBygetFilmByAppId(long filmApplicationId) {
		return getPersistence().countBygetFilmByAppId(filmApplicationId);
	}

	/**
	 * Caches the film equipment list in the entity cache if it is enabled.
	 *
	 * @param filmEquipmentList the film equipment list
	 */
	public static void cacheResult(FilmEquipmentList filmEquipmentList) {
		getPersistence().cacheResult(filmEquipmentList);
	}

	/**
	 * Caches the film equipment lists in the entity cache if it is enabled.
	 *
	 * @param filmEquipmentLists the film equipment lists
	 */
	public static void cacheResult(List<FilmEquipmentList> filmEquipmentLists) {
		getPersistence().cacheResult(filmEquipmentLists);
	}

	/**
	 * Creates a new film equipment list with the primary key. Does not add the film equipment list to the database.
	 *
	 * @param filmEquipmentListId the primary key for the new film equipment list
	 * @return the new film equipment list
	 */
	public static FilmEquipmentList create(long filmEquipmentListId) {
		return getPersistence().create(filmEquipmentListId);
	}

	/**
	 * Removes the film equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list that was removed
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	public static FilmEquipmentList remove(long filmEquipmentListId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		return getPersistence().remove(filmEquipmentListId);
	}

	public static FilmEquipmentList updateImpl(
		FilmEquipmentList filmEquipmentList) {

		return getPersistence().updateImpl(filmEquipmentList);
	}

	/**
	 * Returns the film equipment list with the primary key or throws a <code>NoSuchFilmEquipmentListException</code> if it could not be found.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	public static FilmEquipmentList findByPrimaryKey(long filmEquipmentListId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmEquipmentListException {

		return getPersistence().findByPrimaryKey(filmEquipmentListId);
	}

	/**
	 * Returns the film equipment list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list, or <code>null</code> if a film equipment list with the primary key could not be found
	 */
	public static FilmEquipmentList fetchByPrimaryKey(
		long filmEquipmentListId) {

		return getPersistence().fetchByPrimaryKey(filmEquipmentListId);
	}

	/**
	 * Returns all the film equipment lists.
	 *
	 * @return the film equipment lists
	 */
	public static List<FilmEquipmentList> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the film equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @return the range of film equipment lists
	 */
	public static List<FilmEquipmentList> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the film equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film equipment lists
	 */
	public static List<FilmEquipmentList> findAll(
		int start, int end,
		OrderByComparator<FilmEquipmentList> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film equipment lists
	 */
	public static List<FilmEquipmentList> findAll(
		int start, int end,
		OrderByComparator<FilmEquipmentList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film equipment lists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film equipment lists.
	 *
	 * @return the number of film equipment lists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmEquipmentListPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmEquipmentListPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmEquipmentListPersistence _persistence;

}