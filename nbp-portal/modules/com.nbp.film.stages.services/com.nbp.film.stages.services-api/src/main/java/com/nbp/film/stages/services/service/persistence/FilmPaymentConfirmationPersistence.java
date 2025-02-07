/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.stages.services.exception.NoSuchFilmPaymentConfirmationException;
import com.nbp.film.stages.services.model.FilmPaymentConfirmation;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmPaymentConfirmationUtil
 * @generated
 */
@ProviderType
public interface FilmPaymentConfirmationPersistence
	extends BasePersistence<FilmPaymentConfirmation> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmPaymentConfirmationUtil} to access the film payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film payment confirmation where caseId = &#63; or throws a <code>NoSuchFilmPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a matching film payment confirmation could not be found
	 */
	public FilmPaymentConfirmation findBygetFilmFullPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchFilmPaymentConfirmationException;

	/**
	 * Returns the film payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	public FilmPaymentConfirmation fetchBygetFilmFullPaymentConfirmationBy_CI(
		String caseId);

	/**
	 * Returns the film payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	public FilmPaymentConfirmation fetchBygetFilmFullPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the film payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film payment confirmation that was removed
	 */
	public FilmPaymentConfirmation removeBygetFilmFullPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchFilmPaymentConfirmationException;

	/**
	 * Returns the number of film payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film payment confirmations
	 */
	public int countBygetFilmFullPaymentConfirmationBy_CI(String caseId);

	/**
	 * Returns all the film payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching film payment confirmations
	 */
	public java.util.List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(String caseId);

	/**
	 * Returns a range of all the film payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @return the range of matching film payment confirmations
	 */
	public java.util.List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(
			String caseId, int start, int end);

	/**
	 * Returns an ordered range of all the film payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film payment confirmations
	 */
	public java.util.List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the film payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film payment confirmations
	 */
	public java.util.List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmPaymentConfirmation> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a matching film payment confirmation could not be found
	 */
	public FilmPaymentConfirmation
			findBygetFilmFullPaymentConfirmations_By_CI_First(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FilmPaymentConfirmation> orderByComparator)
		throws NoSuchFilmPaymentConfirmationException;

	/**
	 * Returns the first film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	public FilmPaymentConfirmation
		fetchBygetFilmFullPaymentConfirmations_By_CI_First(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmPaymentConfirmation> orderByComparator);

	/**
	 * Returns the last film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a matching film payment confirmation could not be found
	 */
	public FilmPaymentConfirmation
			findBygetFilmFullPaymentConfirmations_By_CI_Last(
				String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FilmPaymentConfirmation> orderByComparator)
		throws NoSuchFilmPaymentConfirmationException;

	/**
	 * Returns the last film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	public FilmPaymentConfirmation
		fetchBygetFilmFullPaymentConfirmations_By_CI_Last(
			String caseId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmPaymentConfirmation> orderByComparator);

	/**
	 * Returns the film payment confirmations before and after the current film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param filmPaymentId the primary key of the current film payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	public FilmPaymentConfirmation[]
			findBygetFilmFullPaymentConfirmations_By_CI_PrevAndNext(
				long filmPaymentId, String caseId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FilmPaymentConfirmation> orderByComparator)
		throws NoSuchFilmPaymentConfirmationException;

	/**
	 * Removes all the film payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public void removeBygetFilmFullPaymentConfirmations_By_CI(String caseId);

	/**
	 * Returns the number of film payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film payment confirmations
	 */
	public int countBygetFilmFullPaymentConfirmations_By_CI(String caseId);

	/**
	 * Caches the film payment confirmation in the entity cache if it is enabled.
	 *
	 * @param filmPaymentConfirmation the film payment confirmation
	 */
	public void cacheResult(FilmPaymentConfirmation filmPaymentConfirmation);

	/**
	 * Caches the film payment confirmations in the entity cache if it is enabled.
	 *
	 * @param filmPaymentConfirmations the film payment confirmations
	 */
	public void cacheResult(
		java.util.List<FilmPaymentConfirmation> filmPaymentConfirmations);

	/**
	 * Creates a new film payment confirmation with the primary key. Does not add the film payment confirmation to the database.
	 *
	 * @param filmPaymentId the primary key for the new film payment confirmation
	 * @return the new film payment confirmation
	 */
	public FilmPaymentConfirmation create(long filmPaymentId);

	/**
	 * Removes the film payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation that was removed
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	public FilmPaymentConfirmation remove(long filmPaymentId)
		throws NoSuchFilmPaymentConfirmationException;

	public FilmPaymentConfirmation updateImpl(
		FilmPaymentConfirmation filmPaymentConfirmation);

	/**
	 * Returns the film payment confirmation with the primary key or throws a <code>NoSuchFilmPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	public FilmPaymentConfirmation findByPrimaryKey(long filmPaymentId)
		throws NoSuchFilmPaymentConfirmationException;

	/**
	 * Returns the film payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation, or <code>null</code> if a film payment confirmation with the primary key could not be found
	 */
	public FilmPaymentConfirmation fetchByPrimaryKey(long filmPaymentId);

	/**
	 * Returns all the film payment confirmations.
	 *
	 * @return the film payment confirmations
	 */
	public java.util.List<FilmPaymentConfirmation> findAll();

	/**
	 * Returns a range of all the film payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @return the range of film payment confirmations
	 */
	public java.util.List<FilmPaymentConfirmation> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the film payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film payment confirmations
	 */
	public java.util.List<FilmPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmPaymentConfirmation> orderByComparator);

	/**
	 * Returns an ordered range of all the film payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film payment confirmations
	 * @param end the upper bound of the range of film payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film payment confirmations
	 */
	public java.util.List<FilmPaymentConfirmation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<FilmPaymentConfirmation> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film payment confirmations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film payment confirmations.
	 *
	 * @return the number of film payment confirmations
	 */
	public int countAll();

}