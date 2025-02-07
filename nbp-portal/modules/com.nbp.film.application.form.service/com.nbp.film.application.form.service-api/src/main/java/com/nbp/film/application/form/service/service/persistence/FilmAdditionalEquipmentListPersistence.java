/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.application.form.service.exception.NoSuchFilmAdditionalEquipmentListException;
import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film additional equipment list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmAdditionalEquipmentListUtil
 * @generated
 */
@ProviderType
public interface FilmAdditionalEquipmentListPersistence
	extends BasePersistence<FilmAdditionalEquipmentList> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmAdditionalEquipmentListUtil} to access the film additional equipment list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film additional equipment list where filmApplicationId = &#63; or throws a <code>NoSuchFilmAdditionalEquipmentListException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a matching film additional equipment list could not be found
	 */
	public FilmAdditionalEquipmentList findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmAdditionalEquipmentListException;

	/**
	 * Returns the film additional equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	public FilmAdditionalEquipmentList fetchBygetFilmById(
		long filmApplicationId);

	/**
	 * Returns the film additional equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	public FilmAdditionalEquipmentList fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film additional equipment list where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film additional equipment list that was removed
	 */
	public FilmAdditionalEquipmentList removeBygetFilmById(
			long filmApplicationId)
		throws NoSuchFilmAdditionalEquipmentListException;

	/**
	 * Returns the number of film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film additional equipment lists
	 */
	public int countBygetFilmById(long filmApplicationId);

	/**
	 * Returns all the film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film additional equipment lists
	 */
	public java.util.List<FilmAdditionalEquipmentList>
		findBygetFilmAddEquipByAppId(long filmApplicationId);

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
	public java.util.List<FilmAdditionalEquipmentList>
		findBygetFilmAddEquipByAppId(
			long filmApplicationId, int start, int end);

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
	public java.util.List<FilmAdditionalEquipmentList>
		findBygetFilmAddEquipByAppId(
			long filmApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmAdditionalEquipmentList> orderByComparator);

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
	public java.util.List<FilmAdditionalEquipmentList>
		findBygetFilmAddEquipByAppId(
			long filmApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmAdditionalEquipmentList> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a matching film additional equipment list could not be found
	 */
	public FilmAdditionalEquipmentList findBygetFilmAddEquipByAppId_First(
			long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmAdditionalEquipmentList> orderByComparator)
		throws NoSuchFilmAdditionalEquipmentListException;

	/**
	 * Returns the first film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	public FilmAdditionalEquipmentList fetchBygetFilmAddEquipByAppId_First(
		long filmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmAdditionalEquipmentList> orderByComparator);

	/**
	 * Returns the last film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a matching film additional equipment list could not be found
	 */
	public FilmAdditionalEquipmentList findBygetFilmAddEquipByAppId_Last(
			long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmAdditionalEquipmentList> orderByComparator)
		throws NoSuchFilmAdditionalEquipmentListException;

	/**
	 * Returns the last film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	public FilmAdditionalEquipmentList fetchBygetFilmAddEquipByAppId_Last(
		long filmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmAdditionalEquipmentList> orderByComparator);

	/**
	 * Returns the film additional equipment lists before and after the current film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the current film additional equipment list
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	public FilmAdditionalEquipmentList[]
			findBygetFilmAddEquipByAppId_PrevAndNext(
				long FilmAdditionalEquipmentListId, long filmApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FilmAdditionalEquipmentList> orderByComparator)
		throws NoSuchFilmAdditionalEquipmentListException;

	/**
	 * Removes all the film additional equipment lists where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 */
	public void removeBygetFilmAddEquipByAppId(long filmApplicationId);

	/**
	 * Returns the number of film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film additional equipment lists
	 */
	public int countBygetFilmAddEquipByAppId(long filmApplicationId);

	/**
	 * Caches the film additional equipment list in the entity cache if it is enabled.
	 *
	 * @param filmAdditionalEquipmentList the film additional equipment list
	 */
	public void cacheResult(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList);

	/**
	 * Caches the film additional equipment lists in the entity cache if it is enabled.
	 *
	 * @param filmAdditionalEquipmentLists the film additional equipment lists
	 */
	public void cacheResult(
		java.util.List<FilmAdditionalEquipmentList>
			filmAdditionalEquipmentLists);

	/**
	 * Creates a new film additional equipment list with the primary key. Does not add the film additional equipment list to the database.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key for the new film additional equipment list
	 * @return the new film additional equipment list
	 */
	public FilmAdditionalEquipmentList create(
		long FilmAdditionalEquipmentListId);

	/**
	 * Removes the film additional equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list that was removed
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	public FilmAdditionalEquipmentList remove(
			long FilmAdditionalEquipmentListId)
		throws NoSuchFilmAdditionalEquipmentListException;

	public FilmAdditionalEquipmentList updateImpl(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList);

	/**
	 * Returns the film additional equipment list with the primary key or throws a <code>NoSuchFilmAdditionalEquipmentListException</code> if it could not be found.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	public FilmAdditionalEquipmentList findByPrimaryKey(
			long FilmAdditionalEquipmentListId)
		throws NoSuchFilmAdditionalEquipmentListException;

	/**
	 * Returns the film additional equipment list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list, or <code>null</code> if a film additional equipment list with the primary key could not be found
	 */
	public FilmAdditionalEquipmentList fetchByPrimaryKey(
		long FilmAdditionalEquipmentListId);

	/**
	 * Returns all the film additional equipment lists.
	 *
	 * @return the film additional equipment lists
	 */
	public java.util.List<FilmAdditionalEquipmentList> findAll();

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
	public java.util.List<FilmAdditionalEquipmentList> findAll(
		int start, int end);

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
	public java.util.List<FilmAdditionalEquipmentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmAdditionalEquipmentList> orderByComparator);

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
	public java.util.List<FilmAdditionalEquipmentList> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmAdditionalEquipmentList> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film additional equipment lists from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film additional equipment lists.
	 *
	 * @return the number of film additional equipment lists
	 */
	public int countAll();

}