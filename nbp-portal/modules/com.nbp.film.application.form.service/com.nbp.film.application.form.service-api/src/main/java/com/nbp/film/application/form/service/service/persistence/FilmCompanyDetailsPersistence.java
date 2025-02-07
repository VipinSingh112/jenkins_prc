/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.application.form.service.exception.NoSuchFilmCompanyDetailsException;
import com.nbp.film.application.form.service.model.FilmCompanyDetails;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film company details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmCompanyDetailsUtil
 * @generated
 */
@ProviderType
public interface FilmCompanyDetailsPersistence
	extends BasePersistence<FilmCompanyDetails> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmCompanyDetailsUtil} to access the film company details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film company details where filmApplicationId = &#63; or throws a <code>NoSuchFilmCompanyDetailsException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film company details
	 * @throws NoSuchFilmCompanyDetailsException if a matching film company details could not be found
	 */
	public FilmCompanyDetails findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmCompanyDetailsException;

	/**
	 * Returns the film company details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film company details, or <code>null</code> if a matching film company details could not be found
	 */
	public FilmCompanyDetails fetchBygetFilmById(long filmApplicationId);

	/**
	 * Returns the film company details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film company details, or <code>null</code> if a matching film company details could not be found
	 */
	public FilmCompanyDetails fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film company details where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film company details that was removed
	 */
	public FilmCompanyDetails removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmCompanyDetailsException;

	/**
	 * Returns the number of film company detailses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film company detailses
	 */
	public int countBygetFilmById(long filmApplicationId);

	/**
	 * Caches the film company details in the entity cache if it is enabled.
	 *
	 * @param filmCompanyDetails the film company details
	 */
	public void cacheResult(FilmCompanyDetails filmCompanyDetails);

	/**
	 * Caches the film company detailses in the entity cache if it is enabled.
	 *
	 * @param filmCompanyDetailses the film company detailses
	 */
	public void cacheResult(
		java.util.List<FilmCompanyDetails> filmCompanyDetailses);

	/**
	 * Creates a new film company details with the primary key. Does not add the film company details to the database.
	 *
	 * @param filmCompanyDetailsId the primary key for the new film company details
	 * @return the new film company details
	 */
	public FilmCompanyDetails create(long filmCompanyDetailsId);

	/**
	 * Removes the film company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details that was removed
	 * @throws NoSuchFilmCompanyDetailsException if a film company details with the primary key could not be found
	 */
	public FilmCompanyDetails remove(long filmCompanyDetailsId)
		throws NoSuchFilmCompanyDetailsException;

	public FilmCompanyDetails updateImpl(FilmCompanyDetails filmCompanyDetails);

	/**
	 * Returns the film company details with the primary key or throws a <code>NoSuchFilmCompanyDetailsException</code> if it could not be found.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details
	 * @throws NoSuchFilmCompanyDetailsException if a film company details with the primary key could not be found
	 */
	public FilmCompanyDetails findByPrimaryKey(long filmCompanyDetailsId)
		throws NoSuchFilmCompanyDetailsException;

	/**
	 * Returns the film company details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details, or <code>null</code> if a film company details with the primary key could not be found
	 */
	public FilmCompanyDetails fetchByPrimaryKey(long filmCompanyDetailsId);

	/**
	 * Returns all the film company detailses.
	 *
	 * @return the film company detailses
	 */
	public java.util.List<FilmCompanyDetails> findAll();

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
	public java.util.List<FilmCompanyDetails> findAll(int start, int end);

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
	public java.util.List<FilmCompanyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmCompanyDetails>
			orderByComparator);

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
	public java.util.List<FilmCompanyDetails> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmCompanyDetails>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film company detailses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film company detailses.
	 *
	 * @return the number of film company detailses
	 */
	public int countAll();

}