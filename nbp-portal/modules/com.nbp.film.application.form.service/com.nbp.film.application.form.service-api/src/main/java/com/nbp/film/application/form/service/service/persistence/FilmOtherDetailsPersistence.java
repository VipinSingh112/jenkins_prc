/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.application.form.service.exception.NoSuchFilmOtherDetailsException;
import com.nbp.film.application.form.service.model.FilmOtherDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film other details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmOtherDetailsUtil
 * @generated
 */
@ProviderType
public interface FilmOtherDetailsPersistence
	extends BasePersistence<FilmOtherDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmOtherDetailsUtil} to access the film other details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film other details where filmApplicationId = &#63; or throws a <code>NoSuchFilmOtherDetailsException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film other details
	 * @throws NoSuchFilmOtherDetailsException if a matching film other details could not be found
	 */
	public FilmOtherDetails findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmOtherDetailsException;

	/**
	 * Returns the film other details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film other details, or <code>null</code> if a matching film other details could not be found
	 */
	public FilmOtherDetails fetchBygetFilmById(long filmApplicationId);

	/**
	 * Returns the film other details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film other details, or <code>null</code> if a matching film other details could not be found
	 */
	public FilmOtherDetails fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film other details where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film other details that was removed
	 */
	public FilmOtherDetails removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmOtherDetailsException;

	/**
	 * Returns the number of film other detailses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film other detailses
	 */
	public int countBygetFilmById(long filmApplicationId);

	/**
	 * Caches the film other details in the entity cache if it is enabled.
	 *
	 * @param filmOtherDetails the film other details
	 */
	public void cacheResult(FilmOtherDetails filmOtherDetails);

	/**
	 * Caches the film other detailses in the entity cache if it is enabled.
	 *
	 * @param filmOtherDetailses the film other detailses
	 */
	public void cacheResult(
		java.util.List<FilmOtherDetails> filmOtherDetailses);

	/**
	 * Creates a new film other details with the primary key. Does not add the film other details to the database.
	 *
	 * @param filmOtherDetailsId the primary key for the new film other details
	 * @return the new film other details
	 */
	public FilmOtherDetails create(long filmOtherDetailsId);

	/**
	 * Removes the film other details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details that was removed
	 * @throws NoSuchFilmOtherDetailsException if a film other details with the primary key could not be found
	 */
	public FilmOtherDetails remove(long filmOtherDetailsId)
		throws NoSuchFilmOtherDetailsException;

	public FilmOtherDetails updateImpl(FilmOtherDetails filmOtherDetails);

	/**
	 * Returns the film other details with the primary key or throws a <code>NoSuchFilmOtherDetailsException</code> if it could not be found.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details
	 * @throws NoSuchFilmOtherDetailsException if a film other details with the primary key could not be found
	 */
	public FilmOtherDetails findByPrimaryKey(long filmOtherDetailsId)
		throws NoSuchFilmOtherDetailsException;

	/**
	 * Returns the film other details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details, or <code>null</code> if a film other details with the primary key could not be found
	 */
	public FilmOtherDetails fetchByPrimaryKey(long filmOtherDetailsId);

	/**
	 * Returns all the film other detailses.
	 *
	 * @return the film other detailses
	 */
	public java.util.List<FilmOtherDetails> findAll();

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
	public java.util.List<FilmOtherDetails> findAll(int start, int end);

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
	public java.util.List<FilmOtherDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmOtherDetails>
			orderByComparator);

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
	public java.util.List<FilmOtherDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmOtherDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film other detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film other detailses.
	 *
	 * @return the number of film other detailses
	 */
	public int countAll();

}