/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.application.form.service.exception.NoSuchFilmApplicationCurrentStageException;
import com.nbp.film.application.form.service.model.FilmApplicationCurrentStage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationCurrentStageUtil
 * @generated
 */
@ProviderType
public interface FilmApplicationCurrentStagePersistence
	extends BasePersistence<FilmApplicationCurrentStage> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmApplicationCurrentStageUtil} to access the film application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film application current stage where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application current stage
	 * @throws NoSuchFilmApplicationCurrentStageException if a matching film application current stage could not be found
	 */
	public FilmApplicationCurrentStage findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmApplicationCurrentStageException;

	/**
	 * Returns the film application current stage where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application current stage, or <code>null</code> if a matching film application current stage could not be found
	 */
	public FilmApplicationCurrentStage fetchBygetFilmById(
		long filmApplicationId);

	/**
	 * Returns the film application current stage where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application current stage, or <code>null</code> if a matching film application current stage could not be found
	 */
	public FilmApplicationCurrentStage fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film application current stage where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application current stage that was removed
	 */
	public FilmApplicationCurrentStage removeBygetFilmById(
			long filmApplicationId)
		throws NoSuchFilmApplicationCurrentStageException;

	/**
	 * Returns the number of film application current stages where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film application current stages
	 */
	public int countBygetFilmById(long filmApplicationId);

	/**
	 * Caches the film application current stage in the entity cache if it is enabled.
	 *
	 * @param filmApplicationCurrentStage the film application current stage
	 */
	public void cacheResult(
		FilmApplicationCurrentStage filmApplicationCurrentStage);

	/**
	 * Caches the film application current stages in the entity cache if it is enabled.
	 *
	 * @param filmApplicationCurrentStages the film application current stages
	 */
	public void cacheResult(
		java.util.List<FilmApplicationCurrentStage>
			filmApplicationCurrentStages);

	/**
	 * Creates a new film application current stage with the primary key. Does not add the film application current stage to the database.
	 *
	 * @param filmApplicationCurrentStageId the primary key for the new film application current stage
	 * @return the new film application current stage
	 */
	public FilmApplicationCurrentStage create(
		long filmApplicationCurrentStageId);

	/**
	 * Removes the film application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage that was removed
	 * @throws NoSuchFilmApplicationCurrentStageException if a film application current stage with the primary key could not be found
	 */
	public FilmApplicationCurrentStage remove(
			long filmApplicationCurrentStageId)
		throws NoSuchFilmApplicationCurrentStageException;

	public FilmApplicationCurrentStage updateImpl(
		FilmApplicationCurrentStage filmApplicationCurrentStage);

	/**
	 * Returns the film application current stage with the primary key or throws a <code>NoSuchFilmApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage
	 * @throws NoSuchFilmApplicationCurrentStageException if a film application current stage with the primary key could not be found
	 */
	public FilmApplicationCurrentStage findByPrimaryKey(
			long filmApplicationCurrentStageId)
		throws NoSuchFilmApplicationCurrentStageException;

	/**
	 * Returns the film application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage, or <code>null</code> if a film application current stage with the primary key could not be found
	 */
	public FilmApplicationCurrentStage fetchByPrimaryKey(
		long filmApplicationCurrentStageId);

	/**
	 * Returns all the film application current stages.
	 *
	 * @return the film application current stages
	 */
	public java.util.List<FilmApplicationCurrentStage> findAll();

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
	public java.util.List<FilmApplicationCurrentStage> findAll(
		int start, int end);

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
	public java.util.List<FilmApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmApplicationCurrentStage> orderByComparator);

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
	public java.util.List<FilmApplicationCurrentStage> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmApplicationCurrentStage> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film application current stages from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film application current stages.
	 *
	 * @return the number of film application current stages
	 */
	public int countAll();

}