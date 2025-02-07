/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film additional equipment list service. This utility wraps <code>com.nbp.film.application.form.service.service.persistence.impl.FilmAdditionalEquipmentListPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmAdditionalEquipmentListPersistence
 * @generated
 */
public class FilmAdditionalEquipmentListUtil {

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
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		getPersistence().clearCache(filmAdditionalEquipmentList);
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
	public static Map<Serializable, FilmAdditionalEquipmentList>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmAdditionalEquipmentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmAdditionalEquipmentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmAdditionalEquipmentList> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmAdditionalEquipmentList> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmAdditionalEquipmentList update(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		return getPersistence().update(filmAdditionalEquipmentList);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmAdditionalEquipmentList update(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList,
		ServiceContext serviceContext) {

		return getPersistence().update(
			filmAdditionalEquipmentList, serviceContext);
	}

	/**
	 * Returns the film additional equipment list where filmApplicationId = &#63; or throws a <code>NoSuchFilmAdditionalEquipmentListException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a matching film additional equipment list could not be found
	 */
	public static FilmAdditionalEquipmentList findBygetFilmById(
			long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmAdditionalEquipmentListException {

		return getPersistence().findBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film additional equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	public static FilmAdditionalEquipmentList fetchBygetFilmById(
		long filmApplicationId) {

		return getPersistence().fetchBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film additional equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	public static FilmAdditionalEquipmentList fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmById(
			filmApplicationId, useFinderCache);
	}

	/**
	 * Removes the film additional equipment list where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film additional equipment list that was removed
	 */
	public static FilmAdditionalEquipmentList removeBygetFilmById(
			long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmAdditionalEquipmentListException {

		return getPersistence().removeBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the number of film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film additional equipment lists
	 */
	public static int countBygetFilmById(long filmApplicationId) {
		return getPersistence().countBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns all the film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film additional equipment lists
	 */
	public static List<FilmAdditionalEquipmentList>
		findBygetFilmAddEquipByAppId(long filmApplicationId) {

		return getPersistence().findBygetFilmAddEquipByAppId(filmApplicationId);
	}

	/**
	 * Returns a range of all the film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @return the range of matching film additional equipment lists
	 */
	public static List<FilmAdditionalEquipmentList>
		findBygetFilmAddEquipByAppId(
			long filmApplicationId, int start, int end) {

		return getPersistence().findBygetFilmAddEquipByAppId(
			filmApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film additional equipment lists
	 */
	public static List<FilmAdditionalEquipmentList>
		findBygetFilmAddEquipByAppId(
			long filmApplicationId, int start, int end,
			OrderByComparator<FilmAdditionalEquipmentList> orderByComparator) {

		return getPersistence().findBygetFilmAddEquipByAppId(
			filmApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film additional equipment lists
	 */
	public static List<FilmAdditionalEquipmentList>
		findBygetFilmAddEquipByAppId(
			long filmApplicationId, int start, int end,
			OrderByComparator<FilmAdditionalEquipmentList> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetFilmAddEquipByAppId(
			filmApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a matching film additional equipment list could not be found
	 */
	public static FilmAdditionalEquipmentList
			findBygetFilmAddEquipByAppId_First(
				long filmApplicationId,
				OrderByComparator<FilmAdditionalEquipmentList>
					orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmAdditionalEquipmentListException {

		return getPersistence().findBygetFilmAddEquipByAppId_First(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the first film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	public static FilmAdditionalEquipmentList
		fetchBygetFilmAddEquipByAppId_First(
			long filmApplicationId,
			OrderByComparator<FilmAdditionalEquipmentList> orderByComparator) {

		return getPersistence().fetchBygetFilmAddEquipByAppId_First(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a matching film additional equipment list could not be found
	 */
	public static FilmAdditionalEquipmentList findBygetFilmAddEquipByAppId_Last(
			long filmApplicationId,
			OrderByComparator<FilmAdditionalEquipmentList> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmAdditionalEquipmentListException {

		return getPersistence().findBygetFilmAddEquipByAppId_Last(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	public static FilmAdditionalEquipmentList
		fetchBygetFilmAddEquipByAppId_Last(
			long filmApplicationId,
			OrderByComparator<FilmAdditionalEquipmentList> orderByComparator) {

		return getPersistence().fetchBygetFilmAddEquipByAppId_Last(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the film additional equipment lists before and after the current film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the current film additional equipment list
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	public static FilmAdditionalEquipmentList[]
			findBygetFilmAddEquipByAppId_PrevAndNext(
				long FilmAdditionalEquipmentListId, long filmApplicationId,
				OrderByComparator<FilmAdditionalEquipmentList>
					orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmAdditionalEquipmentListException {

		return getPersistence().findBygetFilmAddEquipByAppId_PrevAndNext(
			FilmAdditionalEquipmentListId, filmApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the film additional equipment lists where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 */
	public static void removeBygetFilmAddEquipByAppId(long filmApplicationId) {
		getPersistence().removeBygetFilmAddEquipByAppId(filmApplicationId);
	}

	/**
	 * Returns the number of film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film additional equipment lists
	 */
	public static int countBygetFilmAddEquipByAppId(long filmApplicationId) {
		return getPersistence().countBygetFilmAddEquipByAppId(
			filmApplicationId);
	}

	/**
	 * Caches the film additional equipment list in the entity cache if it is enabled.
	 *
	 * @param filmAdditionalEquipmentList the film additional equipment list
	 */
	public static void cacheResult(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		getPersistence().cacheResult(filmAdditionalEquipmentList);
	}

	/**
	 * Caches the film additional equipment lists in the entity cache if it is enabled.
	 *
	 * @param filmAdditionalEquipmentLists the film additional equipment lists
	 */
	public static void cacheResult(
		List<FilmAdditionalEquipmentList> filmAdditionalEquipmentLists) {

		getPersistence().cacheResult(filmAdditionalEquipmentLists);
	}

	/**
	 * Creates a new film additional equipment list with the primary key. Does not add the film additional equipment list to the database.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key for the new film additional equipment list
	 * @return the new film additional equipment list
	 */
	public static FilmAdditionalEquipmentList create(
		long FilmAdditionalEquipmentListId) {

		return getPersistence().create(FilmAdditionalEquipmentListId);
	}

	/**
	 * Removes the film additional equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list that was removed
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	public static FilmAdditionalEquipmentList remove(
			long FilmAdditionalEquipmentListId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmAdditionalEquipmentListException {

		return getPersistence().remove(FilmAdditionalEquipmentListId);
	}

	public static FilmAdditionalEquipmentList updateImpl(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		return getPersistence().updateImpl(filmAdditionalEquipmentList);
	}

	/**
	 * Returns the film additional equipment list with the primary key or throws a <code>NoSuchFilmAdditionalEquipmentListException</code> if it could not be found.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	public static FilmAdditionalEquipmentList findByPrimaryKey(
			long FilmAdditionalEquipmentListId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmAdditionalEquipmentListException {

		return getPersistence().findByPrimaryKey(FilmAdditionalEquipmentListId);
	}

	/**
	 * Returns the film additional equipment list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list, or <code>null</code> if a film additional equipment list with the primary key could not be found
	 */
	public static FilmAdditionalEquipmentList fetchByPrimaryKey(
		long FilmAdditionalEquipmentListId) {

		return getPersistence().fetchByPrimaryKey(
			FilmAdditionalEquipmentListId);
	}

	/**
	 * Returns all the film additional equipment lists.
	 *
	 * @return the film additional equipment lists
	 */
	public static List<FilmAdditionalEquipmentList> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the film additional equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @return the range of film additional equipment lists
	 */
	public static List<FilmAdditionalEquipmentList> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the film additional equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film additional equipment lists
	 */
	public static List<FilmAdditionalEquipmentList> findAll(
		int start, int end,
		OrderByComparator<FilmAdditionalEquipmentList> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film additional equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film additional equipment lists
	 */
	public static List<FilmAdditionalEquipmentList> findAll(
		int start, int end,
		OrderByComparator<FilmAdditionalEquipmentList> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film additional equipment lists from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film additional equipment lists.
	 *
	 * @return the number of film additional equipment lists
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmAdditionalEquipmentListPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmAdditionalEquipmentListPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmAdditionalEquipmentListPersistence _persistence;

}