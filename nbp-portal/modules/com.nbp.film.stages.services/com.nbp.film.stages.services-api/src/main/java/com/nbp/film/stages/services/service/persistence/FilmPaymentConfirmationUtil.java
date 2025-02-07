/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.stages.services.model.FilmPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film payment confirmation service. This utility wraps <code>com.nbp.film.stages.services.service.persistence.impl.FilmPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmPaymentConfirmationPersistence
 * @generated
 */
public class FilmPaymentConfirmationUtil {

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
		FilmPaymentConfirmation filmPaymentConfirmation) {

		getPersistence().clearCache(filmPaymentConfirmation);
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
	public static Map<Serializable, FilmPaymentConfirmation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmPaymentConfirmation update(
		FilmPaymentConfirmation filmPaymentConfirmation) {

		return getPersistence().update(filmPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmPaymentConfirmation update(
		FilmPaymentConfirmation filmPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(filmPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the film payment confirmation where caseId = &#63; or throws a <code>NoSuchFilmPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a matching film payment confirmation could not be found
	 */
	public static FilmPaymentConfirmation
			findBygetFilmFullPaymentConfirmationBy_CI(String caseId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmPaymentConfirmationException {

		return getPersistence().findBygetFilmFullPaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the film payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	public static FilmPaymentConfirmation
		fetchBygetFilmFullPaymentConfirmationBy_CI(String caseId) {

		return getPersistence().fetchBygetFilmFullPaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the film payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	public static FilmPaymentConfirmation
		fetchBygetFilmFullPaymentConfirmationBy_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmFullPaymentConfirmationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the film payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film payment confirmation that was removed
	 */
	public static FilmPaymentConfirmation
			removeBygetFilmFullPaymentConfirmationBy_CI(String caseId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmPaymentConfirmationException {

		return getPersistence().removeBygetFilmFullPaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns the number of film payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film payment confirmations
	 */
	public static int countBygetFilmFullPaymentConfirmationBy_CI(
		String caseId) {

		return getPersistence().countBygetFilmFullPaymentConfirmationBy_CI(
			caseId);
	}

	/**
	 * Returns all the film payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching film payment confirmations
	 */
	public static List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(String caseId) {

		return getPersistence().findBygetFilmFullPaymentConfirmations_By_CI(
			caseId);
	}

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
	public static List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(
			String caseId, int start, int end) {

		return getPersistence().findBygetFilmFullPaymentConfirmations_By_CI(
			caseId, start, end);
	}

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
	public static List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<FilmPaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetFilmFullPaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator);
	}

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
	public static List<FilmPaymentConfirmation>
		findBygetFilmFullPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<FilmPaymentConfirmation> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetFilmFullPaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a matching film payment confirmation could not be found
	 */
	public static FilmPaymentConfirmation
			findBygetFilmFullPaymentConfirmations_By_CI_First(
				String caseId,
				OrderByComparator<FilmPaymentConfirmation> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmPaymentConfirmationException {

		return getPersistence().
			findBygetFilmFullPaymentConfirmations_By_CI_First(
				caseId, orderByComparator);
	}

	/**
	 * Returns the first film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	public static FilmPaymentConfirmation
		fetchBygetFilmFullPaymentConfirmations_By_CI_First(
			String caseId,
			OrderByComparator<FilmPaymentConfirmation> orderByComparator) {

		return getPersistence().
			fetchBygetFilmFullPaymentConfirmations_By_CI_First(
				caseId, orderByComparator);
	}

	/**
	 * Returns the last film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a matching film payment confirmation could not be found
	 */
	public static FilmPaymentConfirmation
			findBygetFilmFullPaymentConfirmations_By_CI_Last(
				String caseId,
				OrderByComparator<FilmPaymentConfirmation> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmPaymentConfirmationException {

		return getPersistence().
			findBygetFilmFullPaymentConfirmations_By_CI_Last(
				caseId, orderByComparator);
	}

	/**
	 * Returns the last film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film payment confirmation, or <code>null</code> if a matching film payment confirmation could not be found
	 */
	public static FilmPaymentConfirmation
		fetchBygetFilmFullPaymentConfirmations_By_CI_Last(
			String caseId,
			OrderByComparator<FilmPaymentConfirmation> orderByComparator) {

		return getPersistence().
			fetchBygetFilmFullPaymentConfirmations_By_CI_Last(
				caseId, orderByComparator);
	}

	/**
	 * Returns the film payment confirmations before and after the current film payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param filmPaymentId the primary key of the current film payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	public static FilmPaymentConfirmation[]
			findBygetFilmFullPaymentConfirmations_By_CI_PrevAndNext(
				long filmPaymentId, String caseId,
				OrderByComparator<FilmPaymentConfirmation> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmPaymentConfirmationException {

		return getPersistence().
			findBygetFilmFullPaymentConfirmations_By_CI_PrevAndNext(
				filmPaymentId, caseId, orderByComparator);
	}

	/**
	 * Removes all the film payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetFilmFullPaymentConfirmations_By_CI(
		String caseId) {

		getPersistence().removeBygetFilmFullPaymentConfirmations_By_CI(caseId);
	}

	/**
	 * Returns the number of film payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film payment confirmations
	 */
	public static int countBygetFilmFullPaymentConfirmations_By_CI(
		String caseId) {

		return getPersistence().countBygetFilmFullPaymentConfirmations_By_CI(
			caseId);
	}

	/**
	 * Caches the film payment confirmation in the entity cache if it is enabled.
	 *
	 * @param filmPaymentConfirmation the film payment confirmation
	 */
	public static void cacheResult(
		FilmPaymentConfirmation filmPaymentConfirmation) {

		getPersistence().cacheResult(filmPaymentConfirmation);
	}

	/**
	 * Caches the film payment confirmations in the entity cache if it is enabled.
	 *
	 * @param filmPaymentConfirmations the film payment confirmations
	 */
	public static void cacheResult(
		List<FilmPaymentConfirmation> filmPaymentConfirmations) {

		getPersistence().cacheResult(filmPaymentConfirmations);
	}

	/**
	 * Creates a new film payment confirmation with the primary key. Does not add the film payment confirmation to the database.
	 *
	 * @param filmPaymentId the primary key for the new film payment confirmation
	 * @return the new film payment confirmation
	 */
	public static FilmPaymentConfirmation create(long filmPaymentId) {
		return getPersistence().create(filmPaymentId);
	}

	/**
	 * Removes the film payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation that was removed
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	public static FilmPaymentConfirmation remove(long filmPaymentId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmPaymentConfirmationException {

		return getPersistence().remove(filmPaymentId);
	}

	public static FilmPaymentConfirmation updateImpl(
		FilmPaymentConfirmation filmPaymentConfirmation) {

		return getPersistence().updateImpl(filmPaymentConfirmation);
	}

	/**
	 * Returns the film payment confirmation with the primary key or throws a <code>NoSuchFilmPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation
	 * @throws NoSuchFilmPaymentConfirmationException if a film payment confirmation with the primary key could not be found
	 */
	public static FilmPaymentConfirmation findByPrimaryKey(long filmPaymentId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(filmPaymentId);
	}

	/**
	 * Returns the film payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmPaymentId the primary key of the film payment confirmation
	 * @return the film payment confirmation, or <code>null</code> if a film payment confirmation with the primary key could not be found
	 */
	public static FilmPaymentConfirmation fetchByPrimaryKey(
		long filmPaymentId) {

		return getPersistence().fetchByPrimaryKey(filmPaymentId);
	}

	/**
	 * Returns all the film payment confirmations.
	 *
	 * @return the film payment confirmations
	 */
	public static List<FilmPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<FilmPaymentConfirmation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<FilmPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<FilmPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<FilmPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<FilmPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film payment confirmations.
	 *
	 * @return the number of film payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmPaymentConfirmationPersistence _persistence;

}