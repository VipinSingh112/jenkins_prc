/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireApplicationException;
import com.nbp.acquire.application.form.service.model.AcquireApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the acquire application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquireApplicationUtil
 * @generated
 */
@ProviderType
public interface AcquireApplicationPersistence
	extends BasePersistence<AcquireApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AcquireApplicationUtil} to access the acquire application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the acquire applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acquire applications
	 */
	public java.util.List<AcquireApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the acquire applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	public java.util.List<AcquireApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	public java.util.List<AcquireApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	public java.util.List<AcquireApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public AcquireApplication[] findByUuid_PrevAndNext(
			long acquireApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Removes all the acquire applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of acquire applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acquire applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the acquire application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the acquire application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the acquire application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the acquire application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acquire application that was removed
	 */
	public AcquireApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the number of acquire applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acquire applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acquire applications
	 */
	public java.util.List<AcquireApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	public java.util.List<AcquireApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	public java.util.List<AcquireApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	public java.util.List<AcquireApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public AcquireApplication[] findByUuid_C_PrevAndNext(
			long acquireApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Removes all the acquire applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acquire applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the acquire application where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the acquire application where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireById(long acquireApplicationId);

	/**
	 * Returns the acquire application where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache);

	/**
	 * Removes the acquire application where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire application that was removed
	 */
	public AcquireApplication removeBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the number of acquire applications where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire applications
	 */
	public int countBygetAcquireById(long acquireApplicationId);

	/**
	 * Returns all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching acquire applications
	 */
	public java.util.List<AcquireApplication>
		findBygetAcquireApplicationByStatusUser(int status, long userId);

	/**
	 * Returns a range of all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	public java.util.List<AcquireApplication>
		findBygetAcquireApplicationByStatusUser(
			int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	public java.util.List<AcquireApplication>
		findBygetAcquireApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator);

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	public java.util.List<AcquireApplication>
		findBygetAcquireApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findBygetAcquireApplicationByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the first acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireApplicationByStatusUser_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns the last acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findBygetAcquireApplicationByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the last acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireApplicationByStatusUser_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public AcquireApplication[]
			findBygetAcquireApplicationByStatusUser_PrevAndNext(
				long acquireApplicationId, int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Removes all the acquire applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetAcquireApplicationByStatusUser(
		int status, long userId);

	/**
	 * Returns the number of acquire applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching acquire applications
	 */
	public int countBygetAcquireApplicationByStatusUser(
		int status, long userId);

	/**
	 * Returns all the acquire applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching acquire applications
	 */
	public java.util.List<AcquireApplication> findBygetAcquireByStatus(
		int status);

	/**
	 * Returns a range of all the acquire applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	public java.util.List<AcquireApplication> findBygetAcquireByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	public java.util.List<AcquireApplication> findBygetAcquireByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	public java.util.List<AcquireApplication> findBygetAcquireByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findBygetAcquireByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the first acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns the last acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findBygetAcquireByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the last acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where status = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public AcquireApplication[] findBygetAcquireByStatus_PrevAndNext(
			long acquireApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
				orderByComparator)
		throws NoSuchAcquireApplicationException;

	/**
	 * Removes all the acquire applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetAcquireByStatus(int status);

	/**
	 * Returns the number of acquire applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching acquire applications
	 */
	public int countBygetAcquireByStatus(int status);

	/**
	 * Returns the acquire application where applicationNumber = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findBygetAcquireByAppNo(String applicationNumber)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the acquire application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireByAppNo(
		String applicationNumber);

	/**
	 * Returns the acquire application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the acquire application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the acquire application that was removed
	 */
	public AcquireApplication removeBygetAcquireByAppNo(
			String applicationNumber)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the number of acquire applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching acquire applications
	 */
	public int countBygetAcquireByAppNo(String applicationNumber);

	/**
	 * Returns the acquire application where caseId = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	public AcquireApplication findBygetAcquireByCaseId(String caseId)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the acquire application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireByCaseId(String caseId);

	/**
	 * Returns the acquire application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	public AcquireApplication fetchBygetAcquireByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the acquire application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire application that was removed
	 */
	public AcquireApplication removeBygetAcquireByCaseId(String caseId)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the number of acquire applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire applications
	 */
	public int countBygetAcquireByCaseId(String caseId);

	/**
	 * Caches the acquire application in the entity cache if it is enabled.
	 *
	 * @param acquireApplication the acquire application
	 */
	public void cacheResult(AcquireApplication acquireApplication);

	/**
	 * Caches the acquire applications in the entity cache if it is enabled.
	 *
	 * @param acquireApplications the acquire applications
	 */
	public void cacheResult(
		java.util.List<AcquireApplication> acquireApplications);

	/**
	 * Creates a new acquire application with the primary key. Does not add the acquire application to the database.
	 *
	 * @param acquireApplicationId the primary key for the new acquire application
	 * @return the new acquire application
	 */
	public AcquireApplication create(long acquireApplicationId);

	/**
	 * Removes the acquire application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application that was removed
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public AcquireApplication remove(long acquireApplicationId)
		throws NoSuchAcquireApplicationException;

	public AcquireApplication updateImpl(AcquireApplication acquireApplication);

	/**
	 * Returns the acquire application with the primary key or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	public AcquireApplication findByPrimaryKey(long acquireApplicationId)
		throws NoSuchAcquireApplicationException;

	/**
	 * Returns the acquire application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application, or <code>null</code> if a acquire application with the primary key could not be found
	 */
	public AcquireApplication fetchByPrimaryKey(long acquireApplicationId);

	/**
	 * Returns all the acquire applications.
	 *
	 * @return the acquire applications
	 */
	public java.util.List<AcquireApplication> findAll();

	/**
	 * Returns a range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of acquire applications
	 */
	public java.util.List<AcquireApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire applications
	 */
	public java.util.List<AcquireApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire applications
	 */
	public java.util.List<AcquireApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AcquireApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the acquire applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of acquire applications.
	 *
	 * @return the number of acquire applications
	 */
	public int countAll();

}