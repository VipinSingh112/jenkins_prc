/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.application.form.service.exception.NoSuchFilmProductionDetailsException;
import com.nbp.film.application.form.service.model.FilmProductionDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film production details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmProductionDetailsUtil
 * @generated
 */
@ProviderType
public interface FilmProductionDetailsPersistence
	extends BasePersistence<FilmProductionDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmProductionDetailsUtil} to access the film production details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film production details where filmApplicationId = &#63; or throws a <code>NoSuchFilmProductionDetailsException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film production details
	 * @throws NoSuchFilmProductionDetailsException if a matching film production details could not be found
	 */
	public FilmProductionDetails findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmProductionDetailsException;

	/**
	 * Returns the film production details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film production details, or <code>null</code> if a matching film production details could not be found
	 */
	public FilmProductionDetails fetchBygetFilmById(long filmApplicationId);

	/**
	 * Returns the film production details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film production details, or <code>null</code> if a matching film production details could not be found
	 */
	public FilmProductionDetails fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film production details where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film production details that was removed
	 */
	public FilmProductionDetails removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmProductionDetailsException;

	/**
	 * Returns the number of film production detailses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film production detailses
	 */
	public int countBygetFilmById(long filmApplicationId);

	/**
	 * Caches the film production details in the entity cache if it is enabled.
	 *
	 * @param filmProductionDetails the film production details
	 */
	public void cacheResult(FilmProductionDetails filmProductionDetails);

	/**
	 * Caches the film production detailses in the entity cache if it is enabled.
	 *
	 * @param filmProductionDetailses the film production detailses
	 */
	public void cacheResult(
		java.util.List<FilmProductionDetails> filmProductionDetailses);

	/**
	 * Creates a new film production details with the primary key. Does not add the film production details to the database.
	 *
	 * @param filmProductionDetailsId the primary key for the new film production details
	 * @return the new film production details
	 */
	public FilmProductionDetails create(long filmProductionDetailsId);

	/**
	 * Removes the film production details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmProductionDetailsId the primary key of the film production details
	 * @return the film production details that was removed
	 * @throws NoSuchFilmProductionDetailsException if a film production details with the primary key could not be found
	 */
	public FilmProductionDetails remove(long filmProductionDetailsId)
		throws NoSuchFilmProductionDetailsException;

	public FilmProductionDetails updateImpl(
		FilmProductionDetails filmProductionDetails);

	/**
	 * Returns the film production details with the primary key or throws a <code>NoSuchFilmProductionDetailsException</code> if it could not be found.
	 *
	 * @param filmProductionDetailsId the primary key of the film production details
	 * @return the film production details
	 * @throws NoSuchFilmProductionDetailsException if a film production details with the primary key could not be found
	 */
	public FilmProductionDetails findByPrimaryKey(long filmProductionDetailsId)
		throws NoSuchFilmProductionDetailsException;

	/**
	 * Returns the film production details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmProductionDetailsId the primary key of the film production details
	 * @return the film production details, or <code>null</code> if a film production details with the primary key could not be found
	 */
	public FilmProductionDetails fetchByPrimaryKey(
		long filmProductionDetailsId);

	/**
	 * Returns all the film production detailses.
	 *
	 * @return the film production detailses
	 */
	public java.util.List<FilmProductionDetails> findAll();

	/**
	 * Returns a range of all the film production detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmProductionDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film production detailses
	 * @param end the upper bound of the range of film production detailses (not inclusive)
	 * @return the range of film production detailses
	 */
	public java.util.List<FilmProductionDetails> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the film production detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmProductionDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film production detailses
	 * @param end the upper bound of the range of film production detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film production detailses
	 */
	public java.util.List<FilmProductionDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmProductionDetails>
			orderByComparator);

	/**
	 * Returns an ordered range of all the film production detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmProductionDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film production detailses
	 * @param end the upper bound of the range of film production detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film production detailses
	 */
	public java.util.List<FilmProductionDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmProductionDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film production detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film production detailses.
	 *
	 * @return the number of film production detailses
	 */
	public int countAll();

}