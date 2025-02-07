/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.creative.application.form.service.exception.NoSuchCreativeApplicationException;
import com.nbp.creative.application.form.service.model.CreativeApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the creative application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationUtil
 * @generated
 */
@ProviderType
public interface CreativeApplicationPersistence
	extends BasePersistence<CreativeApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CreativeApplicationUtil} to access the creative application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the creative applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching creative applications
	 */
	public java.util.List<CreativeApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the creative applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	public java.util.List<CreativeApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	public java.util.List<CreativeApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	public java.util.List<CreativeApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where uuid = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public CreativeApplication[] findByUuid_PrevAndNext(
			long CreativeApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Removes all the creative applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of creative applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching creative applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the creative application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the creative application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the creative application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the creative application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the creative application that was removed
	 */
	public CreativeApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the number of creative applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching creative applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching creative applications
	 */
	public java.util.List<CreativeApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	public java.util.List<CreativeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	public java.util.List<CreativeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	public java.util.List<CreativeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public CreativeApplication[] findByUuid_C_PrevAndNext(
			long CreativeApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Removes all the creative applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching creative applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the creative application where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findBygetCreativeById(long CreativeApplicationId)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the creative application where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeById(
		long CreativeApplicationId);

	/**
	 * Returns the creative application where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache);

	/**
	 * Removes the creative application where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative application that was removed
	 */
	public CreativeApplication removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the number of creative applications where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative applications
	 */
	public int countBygetCreativeById(long CreativeApplicationId);

	/**
	 * Returns all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching creative applications
	 */
	public java.util.List<CreativeApplication>
		findBygetCreativeApplicationByStatusUser(int status, long userId);

	/**
	 * Returns a range of all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	public java.util.List<CreativeApplication>
		findBygetCreativeApplicationByStatusUser(
			int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	public java.util.List<CreativeApplication>
		findBygetCreativeApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	public java.util.List<CreativeApplication>
		findBygetCreativeApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findBygetCreativeApplicationByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the first creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeApplicationByStatusUser_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns the last creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findBygetCreativeApplicationByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the last creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeApplicationByStatusUser_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public CreativeApplication[]
			findBygetCreativeApplicationByStatusUser_PrevAndNext(
				long CreativeApplicationId, int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Removes all the creative applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetCreativeApplicationByStatusUser(
		int status, long userId);

	/**
	 * Returns the number of creative applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching creative applications
	 */
	public int countBygetCreativeApplicationByStatusUser(
		int status, long userId);

	/**
	 * Returns all the creative applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching creative applications
	 */
	public java.util.List<CreativeApplication> findBygetCreativeByStatus(
		int status);

	/**
	 * Returns a range of all the creative applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	public java.util.List<CreativeApplication> findBygetCreativeByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the creative applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	public java.util.List<CreativeApplication> findBygetCreativeByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	public java.util.List<CreativeApplication> findBygetCreativeByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findBygetCreativeByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the first creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns the last creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findBygetCreativeByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the last creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where status = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public CreativeApplication[] findBygetCreativeByStatus_PrevAndNext(
			long CreativeApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException;

	/**
	 * Removes all the creative applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetCreativeByStatus(int status);

	/**
	 * Returns the number of creative applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching creative applications
	 */
	public int countBygetCreativeByStatus(int status);

	/**
	 * Returns the creative application where applicationNumber = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findBygetCreativeByAppNo(
			String applicationNumber)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the creative application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeByAppNo(
		String applicationNumber);

	/**
	 * Returns the creative application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the creative application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the creative application that was removed
	 */
	public CreativeApplication removeBygetCreativeByAppNo(
			String applicationNumber)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the number of creative applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching creative applications
	 */
	public int countBygetCreativeByAppNo(String applicationNumber);

	/**
	 * Returns the creative application where caseId = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	public CreativeApplication findBygetCreativeBy_CI(String caseId)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the creative application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeBy_CI(String caseId);

	/**
	 * Returns the creative application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public CreativeApplication fetchBygetCreativeBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the creative application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the creative application that was removed
	 */
	public CreativeApplication removeBygetCreativeBy_CI(String caseId)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the number of creative applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative applications
	 */
	public int countBygetCreativeBy_CI(String caseId);

	/**
	 * Caches the creative application in the entity cache if it is enabled.
	 *
	 * @param creativeApplication the creative application
	 */
	public void cacheResult(CreativeApplication creativeApplication);

	/**
	 * Caches the creative applications in the entity cache if it is enabled.
	 *
	 * @param creativeApplications the creative applications
	 */
	public void cacheResult(
		java.util.List<CreativeApplication> creativeApplications);

	/**
	 * Creates a new creative application with the primary key. Does not add the creative application to the database.
	 *
	 * @param CreativeApplicationId the primary key for the new creative application
	 * @return the new creative application
	 */
	public CreativeApplication create(long CreativeApplicationId);

	/**
	 * Removes the creative application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application that was removed
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public CreativeApplication remove(long CreativeApplicationId)
		throws NoSuchCreativeApplicationException;

	public CreativeApplication updateImpl(
		CreativeApplication creativeApplication);

	/**
	 * Returns the creative application with the primary key or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	public CreativeApplication findByPrimaryKey(long CreativeApplicationId)
		throws NoSuchCreativeApplicationException;

	/**
	 * Returns the creative application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application, or <code>null</code> if a creative application with the primary key could not be found
	 */
	public CreativeApplication fetchByPrimaryKey(long CreativeApplicationId);

	/**
	 * Returns all the creative applications.
	 *
	 * @return the creative applications
	 */
	public java.util.List<CreativeApplication> findAll();

	/**
	 * Returns a range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of creative applications
	 */
	public java.util.List<CreativeApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative applications
	 */
	public java.util.List<CreativeApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative applications
	 */
	public java.util.List<CreativeApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CreativeApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the creative applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of creative applications.
	 *
	 * @return the number of creative applications
	 */
	public int countAll();

}