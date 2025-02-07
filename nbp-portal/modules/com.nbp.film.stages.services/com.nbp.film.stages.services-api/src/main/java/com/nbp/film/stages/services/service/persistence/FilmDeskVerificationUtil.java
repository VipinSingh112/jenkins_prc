/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.stages.services.model.FilmDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film desk verification service. This utility wraps <code>com.nbp.film.stages.services.service.persistence.impl.FilmDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmDeskVerificationPersistence
 * @generated
 */
public class FilmDeskVerificationUtil {

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
	public static void clearCache(FilmDeskVerification filmDeskVerification) {
		getPersistence().clearCache(filmDeskVerification);
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
	public static Map<Serializable, FilmDeskVerification> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmDeskVerification update(
		FilmDeskVerification filmDeskVerification) {

		return getPersistence().update(filmDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmDeskVerification update(
		FilmDeskVerification filmDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(filmDeskVerification, serviceContext);
	}

	/**
	 * Returns all the film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verifications
	 */
	public static List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId) {

		return getPersistence().
			findBygetFilmDeskVerificationByStatus_ApplicationId(
				status, filmApplicationId);
	}

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
	public static List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId, int start, int end) {

		return getPersistence().
			findBygetFilmDeskVerificationByStatus_ApplicationId(
				status, filmApplicationId, start, end);
	}

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
	public static List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId, int start, int end,
			OrderByComparator<FilmDeskVerification> orderByComparator) {

		return getPersistence().
			findBygetFilmDeskVerificationByStatus_ApplicationId(
				status, filmApplicationId, start, end, orderByComparator);
	}

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
	public static List<FilmDeskVerification>
		findBygetFilmDeskVerificationByStatus_ApplicationId(
			String status, long filmApplicationId, int start, int end,
			OrderByComparator<FilmDeskVerification> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().
			findBygetFilmDeskVerificationByStatus_ApplicationId(
				status, filmApplicationId, start, end, orderByComparator,
				useFinderCache);
	}

	/**
	 * Returns the first film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification
			findBygetFilmDeskVerificationByStatus_ApplicationId_First(
				String status, long filmApplicationId,
				OrderByComparator<FilmDeskVerification> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().
			findBygetFilmDeskVerificationByStatus_ApplicationId_First(
				status, filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the first film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification
		fetchBygetFilmDeskVerificationByStatus_ApplicationId_First(
			String status, long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator) {

		return getPersistence().
			fetchBygetFilmDeskVerificationByStatus_ApplicationId_First(
				status, filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification
			findBygetFilmDeskVerificationByStatus_ApplicationId_Last(
				String status, long filmApplicationId,
				OrderByComparator<FilmDeskVerification> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().
			findBygetFilmDeskVerificationByStatus_ApplicationId_Last(
				status, filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last film desk verification in the ordered set where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification
		fetchBygetFilmDeskVerificationByStatus_ApplicationId_Last(
			String status, long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator) {

		return getPersistence().
			fetchBygetFilmDeskVerificationByStatus_ApplicationId_Last(
				status, filmApplicationId, orderByComparator);
	}

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
	public static FilmDeskVerification[]
			findBygetFilmDeskVerificationByStatus_ApplicationId_PrevAndNext(
				long filmDeskVerificaId, String status, long filmApplicationId,
				OrderByComparator<FilmDeskVerification> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().
			findBygetFilmDeskVerificationByStatus_ApplicationId_PrevAndNext(
				filmDeskVerificaId, status, filmApplicationId,
				orderByComparator);
	}

	/**
	 * Removes all the film desk verifications where status = &#63; and filmApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 */
	public static void removeBygetFilmDeskVerificationByStatus_ApplicationId(
		String status, long filmApplicationId) {

		getPersistence().removeBygetFilmDeskVerificationByStatus_ApplicationId(
			status, filmApplicationId);
	}

	/**
	 * Returns the number of film desk verifications where status = &#63; and filmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film desk verifications
	 */
	public static int countBygetFilmDeskVerificationByStatus_ApplicationId(
		String status, long filmApplicationId) {

		return getPersistence().
			countBygetFilmDeskVerificationByStatus_ApplicationId(
				status, filmApplicationId);
	}

	/**
	 * Returns the film desk verification where filmApplicationId = &#63; or throws a <code>NoSuchFilmDeskVerificationException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification findBygetFilmById(long filmApplicationId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().findBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film desk verification where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification fetchBygetFilmById(
		long filmApplicationId) {

		return getPersistence().fetchBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film desk verification where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmById(
			filmApplicationId, useFinderCache);
	}

	/**
	 * Removes the film desk verification where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film desk verification that was removed
	 */
	public static FilmDeskVerification removeBygetFilmById(
			long filmApplicationId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().removeBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the number of film desk verifications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film desk verifications
	 */
	public static int countBygetFilmById(long filmApplicationId) {
		return getPersistence().countBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns all the film desk verifications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film desk verifications
	 */
	public static List<FilmDeskVerification> findBygetDeskVerificationFilmById(
		long filmApplicationId) {

		return getPersistence().findBygetDeskVerificationFilmById(
			filmApplicationId);
	}

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
	public static List<FilmDeskVerification> findBygetDeskVerificationFilmById(
		long filmApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationFilmById(
			filmApplicationId, start, end);
	}

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
	public static List<FilmDeskVerification> findBygetDeskVerificationFilmById(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationFilmById(
			filmApplicationId, start, end, orderByComparator);
	}

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
	public static List<FilmDeskVerification> findBygetDeskVerificationFilmById(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationFilmById(
			filmApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification findBygetDeskVerificationFilmById_First(
			long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().findBygetDeskVerificationFilmById_First(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the first film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification fetchBygetDeskVerificationFilmById_First(
		long filmApplicationId,
		OrderByComparator<FilmDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationFilmById_First(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification findBygetDeskVerificationFilmById_Last(
			long filmApplicationId,
			OrderByComparator<FilmDeskVerification> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().findBygetDeskVerificationFilmById_Last(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the last film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film desk verification, or <code>null</code> if a matching film desk verification could not be found
	 */
	public static FilmDeskVerification fetchBygetDeskVerificationFilmById_Last(
		long filmApplicationId,
		OrderByComparator<FilmDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationFilmById_Last(
			filmApplicationId, orderByComparator);
	}

	/**
	 * Returns the film desk verifications before and after the current film desk verification in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmDeskVerificaId the primary key of the current film desk verification
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	public static FilmDeskVerification[]
			findBygetDeskVerificationFilmById_PrevAndNext(
				long filmDeskVerificaId, long filmApplicationId,
				OrderByComparator<FilmDeskVerification> orderByComparator)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().findBygetDeskVerificationFilmById_PrevAndNext(
			filmDeskVerificaId, filmApplicationId, orderByComparator);
	}

	/**
	 * Removes all the film desk verifications where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 */
	public static void removeBygetDeskVerificationFilmById(
		long filmApplicationId) {

		getPersistence().removeBygetDeskVerificationFilmById(filmApplicationId);
	}

	/**
	 * Returns the number of film desk verifications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film desk verifications
	 */
	public static int countBygetDeskVerificationFilmById(
		long filmApplicationId) {

		return getPersistence().countBygetDeskVerificationFilmById(
			filmApplicationId);
	}

	/**
	 * Caches the film desk verification in the entity cache if it is enabled.
	 *
	 * @param filmDeskVerification the film desk verification
	 */
	public static void cacheResult(FilmDeskVerification filmDeskVerification) {
		getPersistence().cacheResult(filmDeskVerification);
	}

	/**
	 * Caches the film desk verifications in the entity cache if it is enabled.
	 *
	 * @param filmDeskVerifications the film desk verifications
	 */
	public static void cacheResult(
		List<FilmDeskVerification> filmDeskVerifications) {

		getPersistence().cacheResult(filmDeskVerifications);
	}

	/**
	 * Creates a new film desk verification with the primary key. Does not add the film desk verification to the database.
	 *
	 * @param filmDeskVerificaId the primary key for the new film desk verification
	 * @return the new film desk verification
	 */
	public static FilmDeskVerification create(long filmDeskVerificaId) {
		return getPersistence().create(filmDeskVerificaId);
	}

	/**
	 * Removes the film desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification that was removed
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	public static FilmDeskVerification remove(long filmDeskVerificaId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().remove(filmDeskVerificaId);
	}

	public static FilmDeskVerification updateImpl(
		FilmDeskVerification filmDeskVerification) {

		return getPersistence().updateImpl(filmDeskVerification);
	}

	/**
	 * Returns the film desk verification with the primary key or throws a <code>NoSuchFilmDeskVerificationException</code> if it could not be found.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification
	 * @throws NoSuchFilmDeskVerificationException if a film desk verification with the primary key could not be found
	 */
	public static FilmDeskVerification findByPrimaryKey(long filmDeskVerificaId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmDeskVerificationException {

		return getPersistence().findByPrimaryKey(filmDeskVerificaId);
	}

	/**
	 * Returns the film desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmDeskVerificaId the primary key of the film desk verification
	 * @return the film desk verification, or <code>null</code> if a film desk verification with the primary key could not be found
	 */
	public static FilmDeskVerification fetchByPrimaryKey(
		long filmDeskVerificaId) {

		return getPersistence().fetchByPrimaryKey(filmDeskVerificaId);
	}

	/**
	 * Returns all the film desk verifications.
	 *
	 * @return the film desk verifications
	 */
	public static List<FilmDeskVerification> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<FilmDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<FilmDeskVerification> findAll(
		int start, int end,
		OrderByComparator<FilmDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<FilmDeskVerification> findAll(
		int start, int end,
		OrderByComparator<FilmDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film desk verifications.
	 *
	 * @return the number of film desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmDeskVerificationPersistence _persistence;

}