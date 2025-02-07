/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.film.application.form.service.exception.NoSuchFilmApplicationException;
import com.nbp.film.application.form.service.model.FilmApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the film application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationUtil
 * @generated
 */
@ProviderType
public interface FilmApplicationPersistence
	extends BasePersistence<FilmApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FilmApplicationUtil} to access the film application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the film applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching film applications
	 */
	public java.util.List<FilmApplication> findByUuid(String uuid);

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
	public java.util.List<FilmApplication> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<FilmApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

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
	public java.util.List<FilmApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the first film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

	/**
	 * Returns the last film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the last film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

	/**
	 * Returns the film applications before and after the current film application in the ordered set where uuid = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public FilmApplication[] findByUuid_PrevAndNext(
			long filmApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Removes all the film applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of film applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching film applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the film application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the film application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the film application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the film application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the film application that was removed
	 */
	public FilmApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the number of film applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching film applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching film applications
	 */
	public java.util.List<FilmApplication> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<FilmApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<FilmApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

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
	public java.util.List<FilmApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the first film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

	/**
	 * Returns the last film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the last film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

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
	public FilmApplication[] findByUuid_C_PrevAndNext(
			long filmApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Removes all the film applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching film applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the film application where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the film application where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmById(long filmApplicationId);

	/**
	 * Returns the film application where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache);

	/**
	 * Removes the film application where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application that was removed
	 */
	public FilmApplication removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the number of film applications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film applications
	 */
	public int countBygetFilmById(long filmApplicationId);

	/**
	 * Returns all the film applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching film applications
	 */
	public java.util.List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId);

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
	public java.util.List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId, int start, int end);

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
	public java.util.List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

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
	public java.util.List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findBygetFilmApplicationByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the first film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmApplicationByStatusUser_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

	/**
	 * Returns the last film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findBygetFilmApplicationByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the last film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmApplicationByStatusUser_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

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
	public FilmApplication[] findBygetFilmApplicationByStatusUser_PrevAndNext(
			long filmApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Removes all the film applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetFilmApplicationByStatusUser(int status, long userId);

	/**
	 * Returns the number of film applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching film applications
	 */
	public int countBygetFilmApplicationByStatusUser(int status, long userId);

	/**
	 * Returns the film application where caseId = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findBygetFilmByCaseId(String caseId)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the film application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmByCaseId(String caseId);

	/**
	 * Returns the film application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the film application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film application that was removed
	 */
	public FilmApplication removeBygetFilmByCaseId(String caseId)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the number of film applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film applications
	 */
	public int countBygetFilmByCaseId(String caseId);

	/**
	 * Returns all the film applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching film applications
	 */
	public java.util.List<FilmApplication> findBygetFilmByStatus(int status);

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
	public java.util.List<FilmApplication> findBygetFilmByStatus(
		int status, int start, int end);

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
	public java.util.List<FilmApplication> findBygetFilmByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

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
	public java.util.List<FilmApplication> findBygetFilmByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findBygetFilmByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the first film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

	/**
	 * Returns the last film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findBygetFilmByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the last film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

	/**
	 * Returns the film applications before and after the current film application in the ordered set where status = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public FilmApplication[] findBygetFilmByStatus_PrevAndNext(
			long filmApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
				orderByComparator)
		throws NoSuchFilmApplicationException;

	/**
	 * Removes all the film applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetFilmByStatus(int status);

	/**
	 * Returns the number of film applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching film applications
	 */
	public int countBygetFilmByStatus(int status);

	/**
	 * Returns the film application where applicationNumber = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	public FilmApplication findBygetFilmByAppNo(String applicationNumber)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the film application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmByAppNo(String applicationNumber);

	/**
	 * Returns the film application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	public FilmApplication fetchBygetFilmByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the film application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the film application that was removed
	 */
	public FilmApplication removeBygetFilmByAppNo(String applicationNumber)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the number of film applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching film applications
	 */
	public int countBygetFilmByAppNo(String applicationNumber);

	/**
	 * Caches the film application in the entity cache if it is enabled.
	 *
	 * @param filmApplication the film application
	 */
	public void cacheResult(FilmApplication filmApplication);

	/**
	 * Caches the film applications in the entity cache if it is enabled.
	 *
	 * @param filmApplications the film applications
	 */
	public void cacheResult(java.util.List<FilmApplication> filmApplications);

	/**
	 * Creates a new film application with the primary key. Does not add the film application to the database.
	 *
	 * @param filmApplicationId the primary key for the new film application
	 * @return the new film application
	 */
	public FilmApplication create(long filmApplicationId);

	/**
	 * Removes the film application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application that was removed
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public FilmApplication remove(long filmApplicationId)
		throws NoSuchFilmApplicationException;

	public FilmApplication updateImpl(FilmApplication filmApplication);

	/**
	 * Returns the film application with the primary key or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	public FilmApplication findByPrimaryKey(long filmApplicationId)
		throws NoSuchFilmApplicationException;

	/**
	 * Returns the film application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application, or <code>null</code> if a film application with the primary key could not be found
	 */
	public FilmApplication fetchByPrimaryKey(long filmApplicationId);

	/**
	 * Returns all the film applications.
	 *
	 * @return the film applications
	 */
	public java.util.List<FilmApplication> findAll();

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
	public java.util.List<FilmApplication> findAll(int start, int end);

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
	public java.util.List<FilmApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator);

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
	public java.util.List<FilmApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FilmApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the film applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of film applications.
	 *
	 * @return the number of film applications
	 */
	public int countAll();

}