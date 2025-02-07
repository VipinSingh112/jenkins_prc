/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.stages.services.exception.NoSuchFilmDeskVerificationException;
import com.nbp.film.stages.services.model.FilmDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface FilmDeskVerificationPersistence
	extends BasePersistence<FilmDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmDeskVerificationUtil} to access the film desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verifications
	 */
	public java.util.List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId);

	/**
	 * Returns a range of all the film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @return the range of matching film desk verifications
	 */
	public java.util.List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film desk verifications
	 */
	public java.util.List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film desk verifications
	 */
	public java.util.List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public FilmDeskVerification
			findBygetFilmDeskVerificationByStatus_ApplicationId_First(
				String status, long filmApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException;

	/**
	 * Returns the first film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public FilmDeskVerification
		fetchBygetFilmDeskVerificationByStatus_ApplicationId_First(
			String status, long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmDeskVerification> orderByComparator);

	/**
	 * Returns the last film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public FilmDeskVerification
			findBygetFilmDeskVerificationByStatus_ApplicationId_Last(
				String status, long filmApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException;

	/**
	 * Returns the last film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public FilmDeskVerification
		fetchBygetFilmDeskVerificationByStatus_ApplicationId_Last(
			String status, long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmDeskVerification> orderByComparator);

	/**
	 * Returns the film desk verifications before and after the current film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param filmDeskVerificaId the primary key of the current film desk verification
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	public FilmDeskVerification[]
			findBygetFilmDeskVerificationByStatus_ApplicationId_PrevAndNext(
				long filmDeskVerificaId, String status, long filmApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException;

	/**
	 * Removes all the film desk verifications where status = &#63; and filmApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 */
	public void removeBygetFilmDeskVerificationByStatus_ApplicationId(
		String status, long filmApplicationId);

	/**
	 * Returns the number of film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film desk verifications
	 */
	public int countBygetFilmDeskVerificationByStatus_ApplicationId(
		String status, long filmApplicationId);

	/**
	 * Returns the film desk verification where filmApplicationId = &#63; or throws a <code>NoSuchFilmDeskVerificationException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public FilmDeskVerification findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmDeskVerificationException;

	/**
	 * Returns the film desk verification where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public FilmDeskVerification fetchBygetFilmById(long filmApplicationId);

	/**
	 * Returns the film desk verification where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public FilmDeskVerification fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film desk verification where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film desk verification that was removed
	 */
	public FilmDeskVerification removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmDeskVerificationException;

	/**
	 * Returns the number of film desk verifications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film desk verifications
	 */
	public int countBygetFilmById(long filmApplicationId);

	/**
	 * Returns all the film desk verifications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verifications
	 */
	public java.util.List<FilmDeskVerification>
		findBygetDeskVerificationFilmById(long filmApplicationId);

	/**
	 * Returns a range of all the film desk verifications where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @return the range of matching film desk verifications
	 */
	public java.util.List<FilmDeskVerification>
		findBygetDeskVerificationFilmById(
			long filmApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the film desk verifications where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film desk verifications
	 */
	public java.util.List<FilmDeskVerification>
		findBygetDeskVerificationFilmById(
			long filmApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the film desk verifications where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film desk verifications
	 */
	public java.util.List<FilmDeskVerification>
		findBygetDeskVerificationFilmById(
			long filmApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public FilmDeskVerification findBygetDeskVerificationFilmById_First(
			long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException;

	/**
	 * Returns the first film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public FilmDeskVerification fetchBygetDeskVerificationFilmById_First(
		long filmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmDeskVerification>
			orderByComparator);

	/**
	 * Returns the last film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public FilmDeskVerification findBygetDeskVerificationFilmById_Last(
			long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException;

	/**
	 * Returns the last film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public FilmDeskVerification fetchBygetDeskVerificationFilmById_Last(
		long filmApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmDeskVerification>
			orderByComparator);

	/**
	 * Returns the film desk verifications before and after the current film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmDeskVerificaId the primary key of the current film desk verification
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	public FilmDeskVerification[] findBygetDeskVerificationFilmById_PrevAndNext(
			long filmDeskVerificaId, long filmApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FilmDeskVerification> orderByComparator)
		throws NoSuchFilmDeskVerificationException;

	/**
	 * Removes all the film desk verifications where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 */
	public void removeBygetDeskVerificationFilmById(long filmApplicationId);

	/**
	 * Returns the number of film desk verifications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film desk verifications
	 */
	public int countBygetDeskVerificationFilmById(long filmApplicationId);

	/**
	 * Caches the film desk verification in the entity cache if it is enabled.
	 *
	 * @param filmDeskVerification the film desk verification
	 */
	public void cacheResult(FilmDeskVerification filmDeskVerification);

	/**
	 * Caches the film desk verifications in the entity cache if it is enabled.
	 *
	 * @param filmDeskVerifications the film desk verifications
	 */
	public void cacheResult(
		java.util.List<FilmDeskVerification> filmDeskVerifications);

	/**
	 * Creates a new film desk verification with the primary key. Does not add the film desk verification to the database.
	 *
	 * @param filmDeskVerificaId the primary key for the new film desk verification
	 * @return the new film desk verification
	 */
	public FilmDeskVerification create(long filmDeskVerificaId);

	/**
	 * Removes the film desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification that was removed
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	public FilmDeskVerification remove(long filmDeskVerificaId)
		throws NoSuchFilmDeskVerificationException;

	public FilmDeskVerification updateImpl(
		FilmDeskVerification filmDeskVerification);

	/**
	 * Returns the film desk verification with the primary key or throws a <code>NoSuchFilmDeskVerificationException</code> if it could not be found.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	public FilmDeskVerification findByPrimaryKey(long filmDeskVerificaId)
		throws NoSuchFilmDeskVerificationException;

	/**
	 * Returns the film desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification, or <code>null</code> if a film desk verification with the primary key could not be found
	 */
	public FilmDeskVerification fetchByPrimaryKey(long filmDeskVerificaId);

	/**
	 * Returns all the film desk verifications.
	 *
	 * @return the film desk verifications
	 */
	public java.util.List<FilmDeskVerification> findAll();

	/**
	 * Returns a range of all the film desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @return the range of film desk verifications
	 */
	public java.util.List<FilmDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the film desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film desk verifications
	 */
	public java.util.List<FilmDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmDeskVerification>
			orderByComparator);

	/**
	 * Returns an ordered range of all the film desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film desk verifications
	 * @param end the upper bound of the range of film desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film desk verifications
	 */
	public java.util.List<FilmDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmDeskVerification>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film desk verifications.
	 *
	 * @return the number of film desk verifications
	 */
	public int countAll();

}