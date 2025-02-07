/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.stages.services.model.FilmApplicationRegister;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film application register service. This utility wraps <code>com.nbp.film.stages.services.service.persistence.impl.FilmApplicationRegisterPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationRegisterPersistence
 * @generated
 */
public class FilmApplicationRegisterUtil {

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
		FilmApplicationRegister filmApplicationRegister) {

		getPersistence().clearCache(filmApplicationRegister);
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
	public static Map<Serializable, FilmApplicationRegister> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmApplicationRegister> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmApplicationRegister> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmApplicationRegister> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmApplicationRegister> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmApplicationRegister update(
		FilmApplicationRegister filmApplicationRegister) {

		return getPersistence().update(filmApplicationRegister);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmApplicationRegister update(
		FilmApplicationRegister filmApplicationRegister,
		ServiceContext serviceContext) {

		return getPersistence().update(filmApplicationRegister, serviceContext);
	}

	/**
	 * Returns the film application register where caseId = &#63; or throws a <code>NoSuchFilmApplicationRegisterException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film application register
	 * @throws NoSuchFilmApplicationRegisterException if a matching film application register could not be found
	 */
	public static FilmApplicationRegister findBygetFilmByCI(String caseId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationRegisterException {

		return getPersistence().findBygetFilmByCI(caseId);
	}

	/**
	 * Returns the film application register where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film application register, or <code>null</code> if a matching film application register could not be found
	 */
	public static FilmApplicationRegister fetchBygetFilmByCI(String caseId) {
		return getPersistence().fetchBygetFilmByCI(caseId);
	}

	/**
	 * Returns the film application register where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application register, or <code>null</code> if a matching film application register could not be found
	 */
	public static FilmApplicationRegister fetchBygetFilmByCI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmByCI(caseId, useFinderCache);
	}

	/**
	 * Removes the film application register where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film application register that was removed
	 */
	public static FilmApplicationRegister removeBygetFilmByCI(String caseId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationRegisterException {

		return getPersistence().removeBygetFilmByCI(caseId);
	}

	/**
	 * Returns the number of film application registers where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film application registers
	 */
	public static int countBygetFilmByCI(String caseId) {
		return getPersistence().countBygetFilmByCI(caseId);
	}

	/**
	 * Caches the film application register in the entity cache if it is enabled.
	 *
	 * @param filmApplicationRegister the film application register
	 */
	public static void cacheResult(
		FilmApplicationRegister filmApplicationRegister) {

		getPersistence().cacheResult(filmApplicationRegister);
	}

	/**
	 * Caches the film application registers in the entity cache if it is enabled.
	 *
	 * @param filmApplicationRegisters the film application registers
	 */
	public static void cacheResult(
		List<FilmApplicationRegister> filmApplicationRegisters) {

		getPersistence().cacheResult(filmApplicationRegisters);
	}

	/**
	 * Creates a new film application register with the primary key. Does not add the film application register to the database.
	 *
	 * @param filmApplicationRegisterId the primary key for the new film application register
	 * @return the new film application register
	 */
	public static FilmApplicationRegister create(
		long filmApplicationRegisterId) {

		return getPersistence().create(filmApplicationRegisterId);
	}

	/**
	 * Removes the film application register with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register that was removed
	 * @throws NoSuchFilmApplicationRegisterException if a film application register with the primary key could not be found
	 */
	public static FilmApplicationRegister remove(long filmApplicationRegisterId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationRegisterException {

		return getPersistence().remove(filmApplicationRegisterId);
	}

	public static FilmApplicationRegister updateImpl(
		FilmApplicationRegister filmApplicationRegister) {

		return getPersistence().updateImpl(filmApplicationRegister);
	}

	/**
	 * Returns the film application register with the primary key or throws a <code>NoSuchFilmApplicationRegisterException</code> if it could not be found.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register
	 * @throws NoSuchFilmApplicationRegisterException if a film application register with the primary key could not be found
	 */
	public static FilmApplicationRegister findByPrimaryKey(
			long filmApplicationRegisterId)
		throws com.nbp.film.stages.services.exception.
			NoSuchFilmApplicationRegisterException {

		return getPersistence().findByPrimaryKey(filmApplicationRegisterId);
	}

	/**
	 * Returns the film application register with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationRegisterId the primary key of the film application register
	 * @return the film application register, or <code>null</code> if a film application register with the primary key could not be found
	 */
	public static FilmApplicationRegister fetchByPrimaryKey(
		long filmApplicationRegisterId) {

		return getPersistence().fetchByPrimaryKey(filmApplicationRegisterId);
	}

	/**
	 * Returns all the film application registers.
	 *
	 * @return the film application registers
	 */
	public static List<FilmApplicationRegister> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @return the range of film application registers
	 */
	public static List<FilmApplicationRegister> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film application registers
	 */
	public static List<FilmApplicationRegister> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationRegister> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film application registers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationRegisterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application registers
	 * @param end the upper bound of the range of film application registers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film application registers
	 */
	public static List<FilmApplicationRegister> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationRegister> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film application registers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film application registers.
	 *
	 * @return the number of film application registers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmApplicationRegisterPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FilmApplicationRegisterPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FilmApplicationRegisterPersistence _persistence;

}