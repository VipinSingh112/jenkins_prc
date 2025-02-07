/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.application.form.service.exception.NoSuchFilmApplicationPaymentException;
import com.nbp.film.application.form.service.model.FilmApplicationPayment;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationPaymentUtil
 * @generated
 */
@ProviderType
public interface FilmApplicationPaymentPersistence
	extends BasePersistence<FilmApplicationPayment> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmApplicationPaymentUtil} to access the film application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the film application payment where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationPaymentException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application payment
	 * @throws NoSuchFilmApplicationPaymentException if a matching film application payment could not be found
	 */
	public FilmApplicationPayment findBygetFilm_Fee_Pay_FAI(
			long filmApplicationId)
		throws NoSuchFilmApplicationPaymentException;

	/**
	 * Returns the film application payment where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application payment, or <code>null</code> if a matching film application payment could not be found
	 */
	public FilmApplicationPayment fetchBygetFilm_Fee_Pay_FAI(
		long filmApplicationId);

	/**
	 * Returns the film application payment where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application payment, or <code>null</code> if a matching film application payment could not be found
	 */
	public FilmApplicationPayment fetchBygetFilm_Fee_Pay_FAI(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film application payment where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application payment that was removed
	 */
	public FilmApplicationPayment removeBygetFilm_Fee_Pay_FAI(
			long filmApplicationId)
		throws NoSuchFilmApplicationPaymentException;

	/**
	 * Returns the number of film application payments where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film application payments
	 */
	public int countBygetFilm_Fee_Pay_FAI(long filmApplicationId);

	/**
	 * Caches the film application payment in the entity cache if it is enabled.
	 *
	 * @param filmApplicationPayment the film application payment
	 */
	public void cacheResult(FilmApplicationPayment filmApplicationPayment);

	/**
	 * Caches the film application payments in the entity cache if it is enabled.
	 *
	 * @param filmApplicationPayments the film application payments
	 */
	public void cacheResult(
		java.util.List<FilmApplicationPayment> filmApplicationPayments);

	/**
	 * Creates a new film application payment with the primary key. Does not add the film application payment to the database.
	 *
	 * @param filmApplicationPaymentId the primary key for the new film application payment
	 * @return the new film application payment
	 */
	public FilmApplicationPayment create(long filmApplicationPaymentId);

	/**
	 * Removes the film application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment that was removed
	 * @throws NoSuchFilmApplicationPaymentException if a film application payment with the primary key could not be found
	 */
	public FilmApplicationPayment remove(long filmApplicationPaymentId)
		throws NoSuchFilmApplicationPaymentException;

	public FilmApplicationPayment updateImpl(
		FilmApplicationPayment filmApplicationPayment);

	/**
	 * Returns the film application payment with the primary key or throws a <code>NoSuchFilmApplicationPaymentException</code> if it could not be found.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment
	 * @throws NoSuchFilmApplicationPaymentException if a film application payment with the primary key could not be found
	 */
	public FilmApplicationPayment findByPrimaryKey(
			long filmApplicationPaymentId)
		throws NoSuchFilmApplicationPaymentException;

	/**
	 * Returns the film application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment, or <code>null</code> if a film application payment with the primary key could not be found
	 */
	public FilmApplicationPayment fetchByPrimaryKey(
		long filmApplicationPaymentId);

	/**
	 * Returns all the film application payments.
	 *
	 * @return the film application payments
	 */
	public java.util.List<FilmApplicationPayment> findAll();

	/**
	 * Returns a range of all the film application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application payments
	 * @param end the upper bound of the range of film application payments (not inclusive)
	 * @return the range of film application payments
	 */
	public java.util.List<FilmApplicationPayment> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the film application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application payments
	 * @param end the upper bound of the range of film application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film application payments
	 */
	public java.util.List<FilmApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationPayment>
			orderByComparator);

	/**
	 * Returns an ordered range of all the film application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application payments
	 * @param end the upper bound of the range of film application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film application payments
	 */
	public java.util.List<FilmApplicationPayment> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplicationPayment>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film application payments from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film application payments.
	 *
	 * @return the number of film application payments
	 */
	public int countAll();

}