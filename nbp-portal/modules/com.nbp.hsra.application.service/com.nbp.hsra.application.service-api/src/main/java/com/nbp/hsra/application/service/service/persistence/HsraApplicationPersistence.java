/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.hsra.application.service.exception.NoSuchHsraApplicationException;
import com.nbp.hsra.application.service.model.HsraApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the hsra application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationUtil
 * @generated
 */
@ProviderType
public interface HsraApplicationPersistence
	extends BasePersistence<HsraApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HsraApplicationUtil} to access the hsra application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the hsra applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching hsra applications
	 */
	public java.util.List<HsraApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the hsra applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public HsraApplication[] findByUuid_PrevAndNext(
			long hsraApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Removes all the hsra applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of hsra applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching hsra applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the hsra application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the hsra application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the hsra application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the hsra application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the hsra application that was removed
	 */
	public HsraApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the number of hsra applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching hsra applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching hsra applications
	 */
	public java.util.List<HsraApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public HsraApplication[] findByUuid_C_PrevAndNext(
			long hsraApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Removes all the hsra applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching hsra applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the first hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the last hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the last hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public HsraApplication[] findBygetHsraByS_U_PrevAndNext(
			long hsraApplicationId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Removes all the hsra applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetHsraByS_U(long userId, int status);

	/**
	 * Returns the number of hsra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching hsra applications
	 */
	public int countBygetHsraByS_U(long userId, int status);

	/**
	 * Returns all the hsra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByStatus(int status);

	/**
	 * Returns a range of all the hsra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the hsra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the first hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the last hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the last hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where status = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public HsraApplication[] findBygetHsraByStatus_PrevAndNext(
			long hsraApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Removes all the hsra applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetHsraByStatus(int status);

	/**
	 * Returns the number of hsra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching hsra applications
	 */
	public int countBygetHsraByStatus(int status);

	/**
	 * Returns the hsra application where applicationNumber = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByAppNum(String applicationNumber)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the hsra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByAppNum(String applicationNumber);

	/**
	 * Returns the hsra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByAppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the hsra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the hsra application that was removed
	 */
	public HsraApplication removeBygetHsraByAppNum(String applicationNumber)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the number of hsra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching hsra applications
	 */
	public int countBygetHsraByAppNum(String applicationNumber);

	/**
	 * Returns the hsra application where caseId = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByCaseId(String caseId)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the hsra application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByCaseId(String caseId);

	/**
	 * Returns the hsra application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the hsra application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application that was removed
	 */
	public HsraApplication removeBygetHsraByCaseId(String caseId)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the number of hsra applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra applications
	 */
	public int countBygetHsraByCaseId(String caseId);

	/**
	 * Returns all the hsra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByEntityId(
		String entityId);

	/**
	 * Returns a range of all the hsra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByEntityId(
		String entityId, int start, int end);

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByEntityId_First(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByEntityId_First(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByEntityId_Last(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByEntityId_Last(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public HsraApplication[] findBygetHsraByEntityId_PrevAndNext(
			long hsraApplicationId, String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Removes all the hsra applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetHsraByEntityId(String entityId);

	/**
	 * Returns the number of hsra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching hsra applications
	 */
	public int countBygetHsraByEntityId(String entityId);

	/**
	 * Returns all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status);

	/**
	 * Returns a range of all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	public java.util.List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByEntityId_Status_First(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByEntityId_Status_First(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByEntityId_Status_Last(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByEntityId_Status_Last(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public HsraApplication[] findBygetHsraByEntityId_Status_PrevAndNext(
			long hsraApplicationId, String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
				orderByComparator)
		throws NoSuchHsraApplicationException;

	/**
	 * Removes all the hsra applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetHsraByEntityId_Status(String entityId, int status);

	/**
	 * Returns the number of hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching hsra applications
	 */
	public int countBygetHsraByEntityId_Status(String entityId, int status);

	/**
	 * Returns the hsra application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByEI_CI(String entityId, String caseId)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the hsra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByEI_CI(
		String entityId, String caseId);

	/**
	 * Returns the hsra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByEI_CI(
		String entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the hsra application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the hsra application that was removed
	 */
	public HsraApplication removeBygetHsraByEI_CI(
			String entityId, String caseId)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the number of hsra applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching hsra applications
	 */
	public int countBygetHsraByEI_CI(String entityId, String caseId);

	/**
	 * Returns the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	public HsraApplication findBygetHsraByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber);

	/**
	 * Returns the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public HsraApplication fetchBygetHsraByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the hsra application that was removed
	 */
	public HsraApplication removeBygetHsraByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the number of hsra applications where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching hsra applications
	 */
	public int countBygetHsraByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber);

	/**
	 * Caches the hsra application in the entity cache if it is enabled.
	 *
	 * @param hsraApplication the hsra application
	 */
	public void cacheResult(HsraApplication hsraApplication);

	/**
	 * Caches the hsra applications in the entity cache if it is enabled.
	 *
	 * @param hsraApplications the hsra applications
	 */
	public void cacheResult(java.util.List<HsraApplication> hsraApplications);

	/**
	 * Creates a new hsra application with the primary key. Does not add the hsra application to the database.
	 *
	 * @param hsraApplicationId the primary key for the new hsra application
	 * @return the new hsra application
	 */
	public HsraApplication create(long hsraApplicationId);

	/**
	 * Removes the hsra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application that was removed
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public HsraApplication remove(long hsraApplicationId)
		throws NoSuchHsraApplicationException;

	public HsraApplication updateImpl(HsraApplication hsraApplication);

	/**
	 * Returns the hsra application with the primary key or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	public HsraApplication findByPrimaryKey(long hsraApplicationId)
		throws NoSuchHsraApplicationException;

	/**
	 * Returns the hsra application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application, or <code>null</code> if a hsra application with the primary key could not be found
	 */
	public HsraApplication fetchByPrimaryKey(long hsraApplicationId);

	/**
	 * Returns all the hsra applications.
	 *
	 * @return the hsra applications
	 */
	public java.util.List<HsraApplication> findAll();

	/**
	 * Returns a range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of hsra applications
	 */
	public java.util.List<HsraApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra applications
	 */
	public java.util.List<HsraApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra applications
	 */
	public java.util.List<HsraApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HsraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the hsra applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of hsra applications.
	 *
	 * @return the number of hsra applications
	 */
	public int countAll();

}