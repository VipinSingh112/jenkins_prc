/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.stages.services.exception.NoSuchFilmFullRegistrationException;
import com.nbp.film.stages.services.model.FilmFullRegistration;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film full registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmFullRegistrationUtil
 * @generated
 */
@ProviderType
public interface FilmFullRegistrationPersistence
	extends BasePersistence<FilmFullRegistration> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmFullRegistrationUtil} to access the film full registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film full registration where caseId = &#63; or throws a <code>NoSuchFilmFullRegistrationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film full registration
	 * @throws NoSuchFilmFullRegistrationException if a matching film full registration could not be found
	 */
	public FilmFullRegistration findBygetFilmFullRegistrationBy_CI(
			String caseId)
		throws NoSuchFilmFullRegistrationException;

	/**
	 * Returns the film full registration where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	public FilmFullRegistration fetchBygetFilmFullRegistrationBy_CI(
		String caseId);

	/**
	 * Returns the film full registration where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	public FilmFullRegistration fetchBygetFilmFullRegistrationBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the film full registration where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film full registration that was removed
	 */
	public FilmFullRegistration removeBygetFilmFullRegistrationBy_CI(
			String caseId)
		throws NoSuchFilmFullRegistrationException;

	/**
	 * Returns the number of film full registrations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film full registrations
	 */
	public int countBygetFilmFullRegistrationBy_CI(String caseId);

	/**
	 * Returns the film full registration where registrationNumber = &#63; or throws a <code>NoSuchFilmFullRegistrationException</code> if it could not be found.
	 *
	 * @param registrationNumber the registration number
	 * @return the matching film full registration
	 * @throws NoSuchFilmFullRegistrationException if a matching film full registration could not be found
	 */
	public FilmFullRegistration findBygetFilmFullRegistrationBy_RN(
			String registrationNumber)
		throws NoSuchFilmFullRegistrationException;

	/**
	 * Returns the film full registration where registrationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param registrationNumber the registration number
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	public FilmFullRegistration fetchBygetFilmFullRegistrationBy_RN(
		String registrationNumber);

	/**
	 * Returns the film full registration where registrationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param registrationNumber the registration number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	public FilmFullRegistration fetchBygetFilmFullRegistrationBy_RN(
		String registrationNumber, boolean useFinderCache);

	/**
	 * Removes the film full registration where registrationNumber = &#63; from the database.
	 *
	 * @param registrationNumber the registration number
	 * @return the film full registration that was removed
	 */
	public FilmFullRegistration removeBygetFilmFullRegistrationBy_RN(
			String registrationNumber)
		throws NoSuchFilmFullRegistrationException;

	/**
	 * Returns the number of film full registrations where registrationNumber = &#63;.
	 *
	 * @param registrationNumber the registration number
	 * @return the number of matching film full registrations
	 */
	public int countBygetFilmFullRegistrationBy_RN(String registrationNumber);

	/**
	 * Caches the film full registration in the entity cache if it is enabled.
	 *
	 * @param filmFullRegistration the film full registration
	 */
	public void cacheResult(FilmFullRegistration filmFullRegistration);

	/**
	 * Caches the film full registrations in the entity cache if it is enabled.
	 *
	 * @param filmFullRegistrations the film full registrations
	 */
	public void cacheResult(
		java.util.List<FilmFullRegistration> filmFullRegistrations);

	/**
	 * Creates a new film full registration with the primary key. Does not add the film full registration to the database.
	 *
	 * @param filmFullRegistrationId the primary key for the new film full registration
	 * @return the new film full registration
	 */
	public FilmFullRegistration create(long filmFullRegistrationId);

	/**
	 * Removes the film full registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration that was removed
	 * @throws NoSuchFilmFullRegistrationException if a film full registration with the primary key could not be found
	 */
	public FilmFullRegistration remove(long filmFullRegistrationId)
		throws NoSuchFilmFullRegistrationException;

	public FilmFullRegistration updateImpl(
		FilmFullRegistration filmFullRegistration);

	/**
	 * Returns the film full registration with the primary key or throws a <code>NoSuchFilmFullRegistrationException</code> if it could not be found.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration
	 * @throws NoSuchFilmFullRegistrationException if a film full registration with the primary key could not be found
	 */
	public FilmFullRegistration findByPrimaryKey(long filmFullRegistrationId)
		throws NoSuchFilmFullRegistrationException;

	/**
	 * Returns the film full registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration, or <code>null</code> if a film full registration with the primary key could not be found
	 */
	public FilmFullRegistration fetchByPrimaryKey(long filmFullRegistrationId);

	/**
	 * Returns all the film full registrations.
	 *
	 * @return the film full registrations
	 */
	public java.util.List<FilmFullRegistration> findAll();

	/**
	 * Returns a range of all the film full registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmFullRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film full registrations
	 * @param end the upper bound of the range of film full registrations (not inclusive)
	 * @return the range of film full registrations
	 */
	public java.util.List<FilmFullRegistration> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the film full registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmFullRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film full registrations
	 * @param end the upper bound of the range of film full registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film full registrations
	 */
	public java.util.List<FilmFullRegistration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmFullRegistration>
			orderByComparator);

	/**
	 * Returns an ordered range of all the film full registrations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmFullRegistrationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film full registrations
	 * @param end the upper bound of the range of film full registrations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film full registrations
	 */
	public java.util.List<FilmFullRegistration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmFullRegistration>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film full registrations from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film full registrations.
	 *
	 * @return the number of film full registrations
	 */
	public int countAll();

}