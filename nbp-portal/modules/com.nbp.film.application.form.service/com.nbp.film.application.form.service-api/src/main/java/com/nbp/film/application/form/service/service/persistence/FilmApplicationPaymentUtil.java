/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.application.form.service.model.FilmApplicationPayment;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film application payment service. This utility wraps <code>com.nbp.film.application.form.service.service.persistence.impl.FilmApplicationPaymentPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationPaymentPersistence
 * @generated
 */
public class FilmApplicationPaymentUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		FilmApplicationPayment filmApplicationPayment) {

		getPersistence().clearCache(filmApplicationPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, FilmApplicationPayment> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmApplicationPayment> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmApplicationPayment> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmApplicationPayment update(
		FilmApplicationPayment filmApplicationPayment) {

		return getPersistence().update(filmApplicationPayment);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmApplicationPayment update(
		FilmApplicationPayment filmApplicationPayment,
		ServiceContext serviceContext) {

		return getPersistence().update(filmApplicationPayment, serviceContext);
	}

	/**
	 * Returns the film application payment where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationPaymentException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application payment
	 * @throws NoSuchFilmApplicationPaymentException if a matching film application payment could not be found
	 */
	public static FilmApplicationPayment findBygetFilm_Fee_Pay_FAI(
			long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationPaymentException {

		return getPersistence().findBygetFilm_Fee_Pay_FAI(filmApplicationId);
	}

	/**
	 * Returns the film application payment where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application payment, or <code>null</code> if a matching film application payment could not be found
	 */
	public static FilmApplicationPayment fetchBygetFilm_Fee_Pay_FAI(
		long filmApplicationId) {

		return getPersistence().fetchBygetFilm_Fee_Pay_FAI(filmApplicationId);
	}

	/**
	 * Returns the film application payment where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application payment, or <code>null</code> if a matching film application payment could not be found
	 */
	public static FilmApplicationPayment fetchBygetFilm_Fee_Pay_FAI(
		long filmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilm_Fee_Pay_FAI(
			filmApplicationId, useFinderCache);
	}

	/**
	 * Removes the film application payment where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application payment that was removed
	 */
	public static FilmApplicationPayment removeBygetFilm_Fee_Pay_FAI(
			long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationPaymentException {

		return getPersistence().removeBygetFilm_Fee_Pay_FAI(filmApplicationId);
	}

	/**
	 * Returns the number of film application payments where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film application payments
	 */
	public static int countBygetFilm_Fee_Pay_FAI(long filmApplicationId) {
		return getPersistence().countBygetFilm_Fee_Pay_FAI(filmApplicationId);
	}

	/**
	 * Caches the film application payment in the entity cache if it is enabled.
	 *
	 * @param filmApplicationPayment the film application payment
	 */
	public static void cacheResult(
		FilmApplicationPayment filmApplicationPayment) {

		getPersistence().cacheResult(filmApplicationPayment);
	}

	/**
	 * Caches the film application payments in the entity cache if it is enabled.
	 *
	 * @param filmApplicationPayments the film application payments
	 */
	public static void cacheResult(
		List<FilmApplicationPayment> filmApplicationPayments) {

		getPersistence().cacheResult(filmApplicationPayments);
	}

	/**
	 * Creates a new film application payment with the primary key. Does not add the film application payment to the database.
	 *
	 * @param filmApplicationPaymentId the primary key for the new film application payment
	 * @return the new film application payment
	 */
	public static FilmApplicationPayment create(long filmApplicationPaymentId) {
		return getPersistence().create(filmApplicationPaymentId);
	}

	/**
	 * Removes the film application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment that was removed
	 * @throws NoSuchFilmApplicationPaymentException if a film application payment with the primary key could not be found
	 */
	public static FilmApplicationPayment remove(long filmApplicationPaymentId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationPaymentException {

		return getPersistence().remove(filmApplicationPaymentId);
	}

	public static FilmApplicationPayment updateImpl(
		FilmApplicationPayment filmApplicationPayment) {

		return getPersistence().updateImpl(filmApplicationPayment);
	}

	/**
	 * Returns the film application payment with the primary key or throws a <code>NoSuchFilmApplicationPaymentException</code> if it could not be found.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment
	 * @throws NoSuchFilmApplicationPaymentException if a film application payment with the primary key could not be found
	 */
	public static FilmApplicationPayment findByPrimaryKey(
			long filmApplicationPaymentId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationPaymentException {

		return getPersistence().findByPrimaryKey(filmApplicationPaymentId);
	}

	/**
	 * Returns the film application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment, or <code>null</code> if a film application payment with the primary key could not be found
	 */
	public static FilmApplicationPayment fetchByPrimaryKey(
		long filmApplicationPaymentId) {

		return getPersistence().fetchByPrimaryKey(filmApplicationPaymentId);
	}

	/**
	 * Returns all the film application payments.
	 *
	 * @return the film application payments
	 */
	public static List<FilmApplicationPayment> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<FilmApplicationPayment> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<FilmApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationPayment> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<FilmApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationPayment> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film application payments from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film application payments.
	 *
	 * @return the number of film application payments
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmApplicationPaymentPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmApplicationPaymentPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmApplicationPaymentPersistence _persistence;

}