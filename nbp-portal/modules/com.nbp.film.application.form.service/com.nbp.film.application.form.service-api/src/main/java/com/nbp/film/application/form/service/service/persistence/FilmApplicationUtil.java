/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.film.application.form.service.model.FilmApplication;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the film application service. This utility wraps <code>com.nbp.film.application.form.service.service.persistence.impl.FilmApplicationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationPersistence
 * @generated
 */
public class FilmApplicationUtil {

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
	public static void clearCache(FilmApplication filmApplication) {
		getPersistence().clearCache(filmApplication);
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
	public static Map<Serializable, FilmApplication> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FilmApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FilmApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FilmApplication> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FilmApplication update(FilmApplication filmApplication) {
		return getPersistence().update(filmApplication);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FilmApplication update(
		FilmApplication filmApplication, ServiceContext serviceContext) {

		return getPersistence().update(filmApplication, serviceContext);
	}

	/**
	 * Returns all the film applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching film applications
	 */
	public static List<FilmApplication> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the film applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of matching film applications
	 */
	public static List<FilmApplication> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the film applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film applications
	 */
	public static List<FilmApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film applications
	 */
	public static List<FilmApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findByUuid_First(
			String uuid, OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchByUuid_First(
		String uuid, OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findByUuid_Last(
			String uuid, OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchByUuid_Last(
		String uuid, OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the film applications before and after the current film application in the ordered set where uuid = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public static FilmApplication[] findByUuid_PrevAndNext(
			long filmApplicationId, String uuid,
			OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findByUuid_PrevAndNext(
			filmApplicationId, uuid, orderByComparator);
	}

	/**
	 * Removes all the film applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of film applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching film applications
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the film application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findByUUID_G(String uuid, long groupId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the film application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the film application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the film application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the film application that was removed
	 */
	public static FilmApplication removeByUUID_G(String uuid, long groupId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of film applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching film applications
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching film applications
	 */
	public static List<FilmApplication> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of matching film applications
	 */
	public static List<FilmApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film applications
	 */
	public static List<FilmApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film applications
	 */
	public static List<FilmApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the film applications before and after the current film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public static FilmApplication[] findByUuid_C_PrevAndNext(
			long filmApplicationId, String uuid, long companyId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findByUuid_C_PrevAndNext(
			filmApplicationId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the film applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching film applications
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the film application where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findBygetFilmById(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film application where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmById(long filmApplicationId) {
		return getPersistence().fetchBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the film application where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmById(
			filmApplicationId, useFinderCache);
	}

	/**
	 * Removes the film application where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application that was removed
	 */
	public static FilmApplication removeBygetFilmById(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().removeBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns the number of film applications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film applications
	 */
	public static int countBygetFilmById(long filmApplicationId) {
		return getPersistence().countBygetFilmById(filmApplicationId);
	}

	/**
	 * Returns all the film applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching film applications
	 */
	public static List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId) {

		return getPersistence().findBygetFilmApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns a range of all the film applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of matching film applications
	 */
	public static List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId, int start, int end) {

		return getPersistence().findBygetFilmApplicationByStatusUser(
			status, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the film applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film applications
	 */
	public static List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().findBygetFilmApplicationByStatusUser(
			status, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film applications
	 */
	public static List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFilmApplicationByStatusUser(
			status, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findBygetFilmApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findBygetFilmApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the first film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmApplicationByStatusUser_First(
		int status, long userId,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().fetchBygetFilmApplicationByStatusUser_First(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findBygetFilmApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findBygetFilmApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the last film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmApplicationByStatusUser_Last(
		int status, long userId,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().fetchBygetFilmApplicationByStatusUser_Last(
			status, userId, orderByComparator);
	}

	/**
	 * Returns the film applications before and after the current film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public static FilmApplication[]
			findBygetFilmApplicationByStatusUser_PrevAndNext(
				long filmApplicationId, int status, long userId,
				OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().
			findBygetFilmApplicationByStatusUser_PrevAndNext(
				filmApplicationId, status, userId, orderByComparator);
	}

	/**
	 * Removes all the film applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public static void removeBygetFilmApplicationByStatusUser(
		int status, long userId) {

		getPersistence().removeBygetFilmApplicationByStatusUser(status, userId);
	}

	/**
	 * Returns the number of film applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching film applications
	 */
	public static int countBygetFilmApplicationByStatusUser(
		int status, long userId) {

		return getPersistence().countBygetFilmApplicationByStatusUser(
			status, userId);
	}

	/**
	 * Returns the film application where caseId = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findBygetFilmByCaseId(String caseId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findBygetFilmByCaseId(caseId);
	}

	/**
	 * Returns the film application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmByCaseId(String caseId) {
		return getPersistence().fetchBygetFilmByCaseId(caseId);
	}

	/**
	 * Returns the film application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmByCaseId(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmByCaseId(caseId, useFinderCache);
	}

	/**
	 * Removes the film application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film application that was removed
	 */
	public static FilmApplication removeBygetFilmByCaseId(String caseId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().removeBygetFilmByCaseId(caseId);
	}

	/**
	 * Returns the number of film applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film applications
	 */
	public static int countBygetFilmByCaseId(String caseId) {
		return getPersistence().countBygetFilmByCaseId(caseId);
	}

	/**
	 * Returns all the film applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching film applications
	 */
	public static List<FilmApplication> findBygetFilmByStatus(int status) {
		return getPersistence().findBygetFilmByStatus(status);
	}

	/**
	 * Returns a range of all the film applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of matching film applications
	 */
	public static List<FilmApplication> findBygetFilmByStatus(
		int status, int start, int end) {

		return getPersistence().findBygetFilmByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the film applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film applications
	 */
	public static List<FilmApplication> findBygetFilmByStatus(
		int status, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().findBygetFilmByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film applications
	 */
	public static List<FilmApplication> findBygetFilmByStatus(
		int status, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetFilmByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findBygetFilmByStatus_First(
			int status, OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findBygetFilmByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the first film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmByStatus_First(
		int status, OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().fetchBygetFilmByStatus_First(
			status, orderByComparator);
	}

	/**
	 * Returns the last film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findBygetFilmByStatus_Last(
			int status, OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findBygetFilmByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the last film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmByStatus_Last(
		int status, OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().fetchBygetFilmByStatus_Last(
			status, orderByComparator);
	}

	/**
	 * Returns the film applications before and after the current film application in the ordered set where status = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public static FilmApplication[] findBygetFilmByStatus_PrevAndNext(
			long filmApplicationId, int status,
			OrderByComparator<FilmApplication> orderByComparator)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findBygetFilmByStatus_PrevAndNext(
			filmApplicationId, status, orderByComparator);
	}

	/**
	 * Removes all the film applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeBygetFilmByStatus(int status) {
		getPersistence().removeBygetFilmByStatus(status);
	}

	/**
	 * Returns the number of film applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching film applications
	 */
	public static int countBygetFilmByStatus(int status) {
		return getPersistence().countBygetFilmByStatus(status);
	}

	/**
	 * Returns the film application where applicationNumber = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public static FilmApplication findBygetFilmByAppNo(String applicationNumber)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findBygetFilmByAppNo(applicationNumber);
	}

	/**
	 * Returns the film application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmByAppNo(
		String applicationNumber) {

		return getPersistence().fetchBygetFilmByAppNo(applicationNumber);
	}

	/**
	 * Returns the film application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public static FilmApplication fetchBygetFilmByAppNo(
		String applicationNumber, boolean useFinderCache) {

		return getPersistence().fetchBygetFilmByAppNo(
			applicationNumber, useFinderCache);
	}

	/**
	 * Removes the film application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the film application that was removed
	 */
	public static FilmApplication removeBygetFilmByAppNo(
			String applicationNumber)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().removeBygetFilmByAppNo(applicationNumber);
	}

	/**
	 * Returns the number of film applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching film applications
	 */
	public static int countBygetFilmByAppNo(String applicationNumber) {
		return getPersistence().countBygetFilmByAppNo(applicationNumber);
	}

	/**
	 * Caches the film application in the entity cache if it is enabled.
	 *
	 * @param filmApplication the film application
	 */
	public static void cacheResult(FilmApplication filmApplication) {
		getPersistence().cacheResult(filmApplication);
	}

	/**
	 * Caches the film applications in the entity cache if it is enabled.
	 *
	 * @param filmApplications the film applications
	 */
	public static void cacheResult(List<FilmApplication> filmApplications) {
		getPersistence().cacheResult(filmApplications);
	}

	/**
	 * Creates a new film application with the primary key. Does not add the film application to the database.
	 *
	 * @param filmApplicationId the primary key for the new film application
	 * @return the new film application
	 */
	public static FilmApplication create(long filmApplicationId) {
		return getPersistence().create(filmApplicationId);
	}

	/**
	 * Removes the film application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application that was removed
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public static FilmApplication remove(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().remove(filmApplicationId);
	}

	public static FilmApplication updateImpl(FilmApplication filmApplication) {
		return getPersistence().updateImpl(filmApplication);
	}

	/**
	 * Returns the film application with the primary key or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public static FilmApplication findByPrimaryKey(long filmApplicationId)
		throws com.nbp.film.application.form.service.exception.
			NoSuchFilmApplicationException {

		return getPersistence().findByPrimaryKey(filmApplicationId);
	}

	/**
	 * Returns the film application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application, or <code>null</code> if a film application with the primary key could not be found
	 */
	public static FilmApplication fetchByPrimaryKey(long filmApplicationId) {
		return getPersistence().fetchByPrimaryKey(filmApplicationId);
	}

	/**
	 * Returns all the film applications.
	 *
	 * @return the film applications
	 */
	public static List<FilmApplication> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the film applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of film applications
	 */
	public static List<FilmApplication> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the film applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film applications
	 */
	public static List<FilmApplication> findAll(
		int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the film applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film applications
	 */
	public static List<FilmApplication> findAll(
		int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the film applications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of film applications.
	 *
	 * @return the number of film applications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FilmApplicationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(FilmApplicationPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile FilmApplicationPersistence _persistence;

}