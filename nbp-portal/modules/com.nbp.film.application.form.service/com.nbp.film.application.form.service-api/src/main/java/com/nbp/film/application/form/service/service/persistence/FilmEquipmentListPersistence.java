/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.application.form.service.exception.NoSuchFilmEquipmentListException;
import com.nbp.film.application.form.service.model.FilmEquipmentList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film equipment list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmEquipmentListUtil
 * @generated
 */
@ProviderType
public interface FilmEquipmentListPersistence
	extends BasePersistence<FilmEquipmentList> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmEquipmentListUtil} to access the film equipment list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film equipment list where filmApplicationId = &#63; or throws a <code>NoSuchFilmEquipmentListException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film equipment list
	 * @throws NoSuchFilmEquipmentListException if a matching film equipment list could not be found
	 */
	public FilmEquipmentList findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmEquipmentListException;

	/**
	 * Returns the film equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	public FilmEquipmentList fetchBygetFilmById(long filmApplicationId);

	/**
	 * Returns the film equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	public FilmEquipmentList fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film equipment list where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film equipment list that was removed
	 */
	public FilmEquipmentList removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmEquipmentListException;

	/**
	 * Returns the number of film equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film equipment lists
	 */
	public int countBygetFilmById(long filmApplicationId);

	/**
	 * Returns all the film equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film equipment lists
	 */
	public java.util.List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId);

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
	public java.util.List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId, int start, int end);

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
	public java.util.List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmEquipmentList>
			orderByComparator);

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
	public java.util.List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmEquipmentList>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film equipment list
	 * @throws NoSuchFilmEquipmentListException if a matching film equipment list could not be found
	 */
	public FilmEquipmentList findBygetFilmByAppId_First(
			long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FilmEquipmentList>
				orderByComparator)
		throws NoSuchFilmEquipmentListException;

	/**
	 * Returns the first film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	public FilmEquipmentList fetchBygetFilmByAppId_First(
		long filmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmEquipmentList>
			orderByComparator);

	/**
	 * Returns the last film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film equipment list
	 * @throws NoSuchFilmEquipmentListException if a matching film equipment list could not be found
	 */
	public FilmEquipmentList findBygetFilmByAppId_Last(
			long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FilmEquipmentList>
				orderByComparator)
		throws NoSuchFilmEquipmentListException;

	/**
	 * Returns the last film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	public FilmEquipmentList fetchBygetFilmByAppId_Last(
		long filmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmEquipmentList>
			orderByComparator);

	/**
	 * Returns the film equipment lists before and after the current film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmEquipmentListId the primary key of the current film equipment list
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film equipment list
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	public FilmEquipmentList[] findBygetFilmByAppId_PrevAndNext(
			long filmEquipmentListId, long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator<FilmEquipmentList>
				orderByComparator)
		throws NoSuchFilmEquipmentListException;

	/**
	 * Removes all the film equipment lists where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 */
	public void removeBygetFilmByAppId(long filmApplicationId);

	/**
	 * Returns the number of film equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film equipment lists
	 */
	public int countBygetFilmByAppId(long filmApplicationId);

	/**
	 * Caches the film equipment list in the entity cache if it is enabled.
	 *
	 * @param filmEquipmentList the film equipment list
	 */
	public void cacheResult(FilmEquipmentList filmEquipmentList);

	/**
	 * Caches the film equipment lists in the entity cache if it is enabled.
	 *
	 * @param filmEquipmentLists the film equipment lists
	 */
	public void cacheResult(
		java.util.List<FilmEquipmentList> filmEquipmentLists);

	/**
	 * Creates a new film equipment list with the primary key. Does not add the film equipment list to the database.
	 *
	 * @param filmEquipmentListId the primary key for the new film equipment list
	 * @return the new film equipment list
	 */
	public FilmEquipmentList create(long filmEquipmentListId);

	/**
	 * Removes the film equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list that was removed
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	public FilmEquipmentList remove(long filmEquipmentListId)
		throws NoSuchFilmEquipmentListException;

	public FilmEquipmentList updateImpl(FilmEquipmentList filmEquipmentList);

	/**
	 * Returns the film equipment list with the primary key or throws a <code>NoSuchFilmEquipmentListException</code> if it could not be found.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	public FilmEquipmentList findByPrimaryKey(long filmEquipmentListId)
		throws NoSuchFilmEquipmentListException;

	/**
	 * Returns the film equipment list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list, or <code>null</code> if a film equipment list with the primary key could not be found
	 */
	public FilmEquipmentList fetchByPrimaryKey(long filmEquipmentListId);

	/**
	 * Returns all the film equipment lists.
	 *
	 * @return the film equipment lists
	 */
	public java.util.List<FilmEquipmentList> findAll();

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
	public java.util.List<FilmEquipmentList> findAll(int start, int end);

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
	public java.util.List<FilmEquipmentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmEquipmentList>
			orderByComparator);

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
	public java.util.List<FilmEquipmentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmEquipmentList>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film equipment lists from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film equipment lists.
	 *
	 * @return the number of film equipment lists
	 */
	public int countAll();

}