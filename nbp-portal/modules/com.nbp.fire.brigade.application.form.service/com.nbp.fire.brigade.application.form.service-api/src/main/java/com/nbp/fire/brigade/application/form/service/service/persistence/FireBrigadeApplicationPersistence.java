/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeApplicationException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the fire brigade application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationUtil
 * @generated
 */
@ProviderType
public interface FireBrigadeApplicationPersistence
	extends BasePersistence<FireBrigadeApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FireBrigadeApplicationUtil} to access the fire brigade application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the fire brigade applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the fire brigade applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public FireBrigadeApplication[] findByUuid_PrevAndNext(
			long fireBrigadeApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Removes all the fire brigade applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of fire brigade applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fire brigade applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the fire brigade application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the fire brigade application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the fire brigade application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the fire brigade application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the fire brigade application that was removed
	 */
	public FireBrigadeApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the number of fire brigade applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching fire brigade applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public FireBrigadeApplication[] findByUuid_C_PrevAndNext(
			long fireBrigadeApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Removes all the fire brigade applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching fire brigade applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId);

	/**
	 * Returns a range of all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByS_U_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByS_U_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByS_U_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByS_U_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public FireBrigadeApplication[] findBygetFireBrigadeByS_U_PrevAndNext(
			long fireBrigadeApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Removes all the fire brigade applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetFireBrigadeByS_U(int status, long userId);

	/**
	 * Returns the number of fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching fire brigade applications
	 */
	public int countBygetFireBrigadeByS_U(int status, long userId);

	/**
	 * Returns the fire brigade application where caseId = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeStatusByCaseId(
			String caseId)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the fire brigade application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeStatusByCaseId(
		String caseId);

	/**
	 * Returns the fire brigade application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeStatusByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the fire brigade application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade application that was removed
	 */
	public FireBrigadeApplication removeBygetFireBrigadeStatusByCaseId(
			String caseId)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the number of fire brigade applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade applications
	 */
	public int countBygetFireBrigadeStatusByCaseId(String caseId);

	/**
	 * Returns all the fire brigade applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status);

	/**
	 * Returns a range of all the fire brigade applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public FireBrigadeApplication[] findBygetFireBrigadeByStatus_PrevAndNext(
			long fireBrigadeApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Removes all the fire brigade applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetFireBrigadeByStatus(int status);

	/**
	 * Returns the number of fire brigade applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching fire brigade applications
	 */
	public int countBygetFireBrigadeByStatus(int status);

	/**
	 * Returns all the fire brigade applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId(String entityId);

	/**
	 * Returns a range of all the fire brigade applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId(String entityId, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId(
			String entityId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId(
			String entityId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByEntityId_First(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByEntityId_First(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByEntityId_Last(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByEntityId_Last(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public FireBrigadeApplication[] findBygetFireBrigadeByEntityId_PrevAndNext(
			long fireBrigadeApplicationId, String entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Removes all the fire brigade applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetFireBrigadeByEntityId(String entityId);

	/**
	 * Returns the number of fire brigade applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching fire brigade applications
	 */
	public int countBygetFireBrigadeByEntityId(String entityId);

	/**
	 * Returns all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId_Status(String entityId, int status);

	/**
	 * Returns a range of all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId_Status(
			String entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId_Status(
			String entityId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication>
		findBygetFireBrigadeByEntityId_Status(
			String entityId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByEntityId_Status_First(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByEntityId_Status_First(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByEntityId_Status_Last(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByEntityId_Status_Last(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public FireBrigadeApplication[]
			findBygetFireBrigadeByEntityId_Status_PrevAndNext(
				long fireBrigadeApplicationId, String entityId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Removes all the fire brigade applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetFireBrigadeByEntityId_Status(
		String entityId, int status);

	/**
	 * Returns the number of fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching fire brigade applications
	 */
	public int countBygetFireBrigadeByEntityId_Status(
		String entityId, int status);

	/**
	 * Returns the fire brigade application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByEI_CI(
			String entityId, String caseId)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the fire brigade application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByEI_CI(
		String entityId, String caseId);

	/**
	 * Returns the fire brigade application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByEI_CI(
		String entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the fire brigade application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the fire brigade application that was removed
	 */
	public FireBrigadeApplication removeBygetFireBrigadeByEI_CI(
			String entityId, String caseId)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the number of fire brigade applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching fire brigade applications
	 */
	public int countBygetFireBrigadeByEI_CI(String entityId, String caseId);

	/**
	 * Returns the fire brigade application where applicationNumber = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFireBrigadeByAppNo(
			String applicationNumber)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the fire brigade application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByAppNo(
		String applicationNumber);

	/**
	 * Returns the fire brigade application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFireBrigadeByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the fire brigade application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the fire brigade application that was removed
	 */
	public FireBrigadeApplication removeBygetFireBrigadeByAppNo(
			String applicationNumber)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the number of fire brigade applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching fire brigade applications
	 */
	public int countBygetFireBrigadeByAppNo(String applicationNumber);

	/**
	 * Returns the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication findBygetFB_AppType_AppNo(
			String typeOfTransaction, String applicationNumber)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFB_AppType_AppNo(
		String typeOfTransaction, String applicationNumber);

	/**
	 * Returns the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public FireBrigadeApplication fetchBygetFB_AppType_AppNo(
		String typeOfTransaction, String applicationNumber,
		boolean useFinderCache);

	/**
	 * Removes the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the fire brigade application that was removed
	 */
	public FireBrigadeApplication removeBygetFB_AppType_AppNo(
			String typeOfTransaction, String applicationNumber)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the number of fire brigade applications where typeOfTransaction = &#63; and applicationNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the number of matching fire brigade applications
	 */
	public int countBygetFB_AppType_AppNo(
		String typeOfTransaction, String applicationNumber);

	/**
	 * Caches the fire brigade application in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplication the fire brigade application
	 */
	public void cacheResult(FireBrigadeApplication fireBrigadeApplication);

	/**
	 * Caches the fire brigade applications in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplications the fire brigade applications
	 */
	public void cacheResult(
		java.util.List<FireBrigadeApplication> fireBrigadeApplications);

	/**
	 * Creates a new fire brigade application with the primary key. Does not add the fire brigade application to the database.
	 *
	 * @param fireBrigadeApplicationId the primary key for the new fire brigade application
	 * @return the new fire brigade application
	 */
	public FireBrigadeApplication create(long fireBrigadeApplicationId);

	/**
	 * Removes the fire brigade application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application that was removed
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public FireBrigadeApplication remove(long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeApplicationException;

	public FireBrigadeApplication updateImpl(
		FireBrigadeApplication fireBrigadeApplication);

	/**
	 * Returns the fire brigade application with the primary key or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	public FireBrigadeApplication findByPrimaryKey(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeApplicationException;

	/**
	 * Returns the fire brigade application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application, or <code>null</code> if a fire brigade application with the primary key could not be found
	 */
	public FireBrigadeApplication fetchByPrimaryKey(
		long fireBrigadeApplicationId);

	/**
	 * Returns all the fire brigade applications.
	 *
	 * @return the fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findAll();

	/**
	 * Returns a range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade applications
	 */
	public java.util.List<FireBrigadeApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FireBrigadeApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fire brigade applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fire brigade applications.
	 *
	 * @return the number of fire brigade applications
	 */
	public int countAll();

}