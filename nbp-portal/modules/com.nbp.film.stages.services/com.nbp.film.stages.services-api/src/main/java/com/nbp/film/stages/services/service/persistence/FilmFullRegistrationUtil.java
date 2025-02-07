/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.stages.services.model.FilmFullRegistration;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film full registration service. This utility wraps <code>com.nbp.film.stages.services.service.persistence.impl.FilmFullRegistrationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmFullRegistrationPersistence
 * @generated
 */
public class FilmFullRegistrationUtil {

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
	public static void clearCache(FilmFullRegistration filmFullRegistration) {
		getPersistence().clearCache(filmFullRegistration);
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
	public static Map<Serializable, FilmFullRegistration> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmFullRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmFullRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmFullRegistration> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmFullRegistration> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmFullRegistration update(
		FilmFullRegistration filmFullRegistration) {

		return getPersistence().update(filmFullRegistration);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmFullRegistration update(
		FilmFullRegistration filmFullRegistration,
		ServiceContext serviceContext) {

		return getPersistence().update(filmFullRegistration, serviceContext);
	}

	/**
	 * Returns the film full registration where caseId = &#63; or throws a <code>NoSuchFilmFullRegistrationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film full registration
	 * @throws NoSuchFilmFullRegistrationException if a matching film full registration could not be found
	 */
	public static FilmFullRegistration findBygetFilmFullRegistrationBy_CI(
			String caseId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return getPersistence().findBygetFilmFullRegistrationBy_CI(caseId);
	}

	/**
	 * Returns the film full registration where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	public static FilmFullRegistration fetchBygetFilmFullRegistrationBy_CI(
		String caseId) {

		return getPersistence().fetchBygetFilmFullRegistrationBy_CI(caseId);
	}

	/**
	 * Returns the film full registration where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	public static FilmFullRegistration fetchBygetFilmFullRegistrationBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmFullRegistrationBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the film full registration where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film full registration that was removed
	 */
	public static FilmFullRegistration removeBygetFilmFullRegistrationBy_CI(
			String caseId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return getPersistence().removeBygetFilmFullRegistrationBy_CI(caseId);
	}

	/**
	 * Returns the number of film full registrations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film full registrations
	 */
	public static int countBygetFilmFullRegistrationBy_CI(String caseId) {
		return getPersistence().countBygetFilmFullRegistrationBy_CI(caseId);
	}

	/**
	 * Returns the film full registration where registrationNumber = &#63; or throws a <code>NoSuchFilmFullRegistrationException</code> if it could not be found.
	 *
	 * @param registrationNumber the registration number
	 * @return the matching film full registration
	 * @throws NoSuchFilmFullRegistrationException if a matching film full registration could not be found
	 */
	public static FilmFullRegistration findBygetFilmFullRegistrationBy_RN(
			String registrationNumber)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return getPersistence().findBygetFilmFullRegistrationBy_RN(
			registrationNumber);
	}

	/**
	 * Returns the film full registration where registrationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param registrationNumber the registration number
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	public static FilmFullRegistration fetchBygetFilmFullRegistrationBy_RN(
		String registrationNumber) {

		return getPersistence().fetchBygetFilmFullRegistrationBy_RN(
			registrationNumber);
	}

	/**
	 * Returns the film full registration where registrationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param registrationNumber the registration number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film full registration, or <code>null</code> if a matching film full registration could not be found
	 */
	public static FilmFullRegistration fetchBygetFilmFullRegistrationBy_RN(
		String registrationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmFullRegistrationBy_RN(
			registrationNumber, useFinderCache);
	}

	/**
	 * Removes the film full registration where registrationNumber = &#63; from the database.
	 *
	 * @param registrationNumber the registration number
	 * @return the film full registration that was removed
	 */
	public static FilmFullRegistration removeBygetFilmFullRegistrationBy_RN(
			String registrationNumber)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return getPersistence().removeBygetFilmFullRegistrationBy_RN(
			registrationNumber);
	}

	/**
	 * Returns the number of film full registrations where registrationNumber = &#63;.
	 *
	 * @param registrationNumber the registration number
	 * @return the number of matching film full registrations
	 */
	public static int countBygetFilmFullRegistrationBy_RN(
		String registrationNumber) {

		return getPersistence().countBygetFilmFullRegistrationBy_RN(
			registrationNumber);
	}

	/**
	 * Caches the film full registration in the entity cache if it is enabled.
	 *
	 * @param filmFullRegistration the film full registration
	 */
	public static void cacheResult(FilmFullRegistration filmFullRegistration) {
		getPersistence().cacheResult(filmFullRegistration);
	}

	/**
	 * Caches the film full registrations in the entity cache if it is enabled.
	 *
	 * @param filmFullRegistrations the film full registrations
	 */
	public static void cacheResult(
		List<FilmFullRegistration> filmFullRegistrations) {

		getPersistence().cacheResult(filmFullRegistrations);
	}

	/**
	 * Creates a new film full registration with the primary key. Does not add the film full registration to the database.
	 *
	 * @param filmFullRegistrationId the primary key for the new film full registration
	 * @return the new film full registration
	 */
	public static FilmFullRegistration create(long filmFullRegistrationId) {
		return getPersistence().create(filmFullRegistrationId);
	}

	/**
	 * Removes the film full registration with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration that was removed
	 * @throws NoSuchFilmFullRegistrationException if a film full registration with the primary key could not be found
	 */
	public static FilmFullRegistration remove(long filmFullRegistrationId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return getPersistence().remove(filmFullRegistrationId);
	}

	public static FilmFullRegistration updateImpl(
		FilmFullRegistration filmFullRegistration) {

		return getPersistence().updateImpl(filmFullRegistration);
	}

	/**
	 * Returns the film full registration with the primary key or throws a <code>NoSuchFilmFullRegistrationException</code> if it could not be found.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration
	 * @throws NoSuchFilmFullRegistrationException if a film full registration with the primary key could not be found
	 */
	public static FilmFullRegistration findByPrimaryKey(
			long filmFullRegistrationId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmFullRegistrationException {

		return getPersistence().findByPrimaryKey(filmFullRegistrationId);
	}

	/**
	 * Returns the film full registration with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmFullRegistrationId the primary key of the film full registration
	 * @return the film full registration, or <code>null</code> if a film full registration with the primary key could not be found
	 */
	public static FilmFullRegistration fetchByPrimaryKey(
		long filmFullRegistrationId) {

		return getPersistence().fetchByPrimaryKey(filmFullRegistrationId);
	}

	/**
	 * Returns all the film full registrations.
	 *
	 * @return the film full registrations
	 */
	public static List<FilmFullRegistration> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<FilmFullRegistration> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<FilmFullRegistration> findAll(
		int start, int end,
		OrderByComparator<FilmFullRegistration> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<FilmFullRegistration> findAll(
		int start, int end,
		OrderByComparator<FilmFullRegistration> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film full registrations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film full registrations.
	 *
	 * @return the number of film full registrations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmFullRegistrationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmFullRegistrationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmFullRegistrationPersistence _persistence;

}