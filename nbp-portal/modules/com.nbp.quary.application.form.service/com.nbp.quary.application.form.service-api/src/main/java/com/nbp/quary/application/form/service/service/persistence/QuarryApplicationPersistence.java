/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.quary.application.form.service.exception.NoSuchQuarryApplicationException;
import com.nbp.quary.application.form.service.model.QuarryApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the quarry application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationUtil
 * @generated
 */
@ProviderType
public interface QuarryApplicationPersistence
	extends BasePersistence<QuarryApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuarryApplicationUtil} to access the quarry application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the quarry applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quarry applications
	 */
	public java.util.List<QuarryApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the quarry applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public QuarryApplication[] findByUuid_PrevAndNext(
			long quarryApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Removes all the quarry applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of quarry applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quarry applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the quarry application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the quarry application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the quarry application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the quarry application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quarry application that was removed
	 */
	public QuarryApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the number of quarry applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quarry applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quarry applications
	 */
	public java.util.List<QuarryApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public QuarryApplication[] findByUuid_C_PrevAndNext(
			long quarryApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Removes all the quarry applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quarry applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the quarry application where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryById(long quarryApplicationId)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the quarry application where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryById(long quarryApplicationId);

	/**
	 * Returns the quarry application where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryById(
		long quarryApplicationId, boolean useFinderCache);

	/**
	 * Removes the quarry application where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry application that was removed
	 */
	public QuarryApplication removeBygetQuarryById(long quarryApplicationId)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the number of quarry applications where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry applications
	 */
	public int countBygetQuarryById(long quarryApplicationId);

	/**
	 * Returns all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId);

	/**
	 * Returns a range of all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByS_U_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the first quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByS_U_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the last quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByS_U_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the last quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByS_U_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public QuarryApplication[] findBygetQuarryByS_U_PrevAndNext(
			long quarryApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Removes all the quarry applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetQuarryByS_U(int status, long userId);

	/**
	 * Returns the number of quarry applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching quarry applications
	 */
	public int countBygetQuarryByS_U(int status, long userId);

	/**
	 * Returns the quarry application where caseId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByCaseId(String caseId)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the quarry application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByCaseId(String caseId);

	/**
	 * Returns the quarry application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the quarry application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry application that was removed
	 */
	public QuarryApplication removeBygetQuarryByCaseId(String caseId)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the number of quarry applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry applications
	 */
	public int countBygetQuarryByCaseId(String caseId);

	/**
	 * Returns all the quarry applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByStatus(
		int status);

	/**
	 * Returns a range of all the quarry applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the first quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the last quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the last quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where status = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public QuarryApplication[] findBygetQuarryByStatus_PrevAndNext(
			long quarryApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Removes all the quarry applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetQuarryByStatus(int status);

	/**
	 * Returns the number of quarry applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching quarry applications
	 */
	public int countBygetQuarryByStatus(int status);

	/**
	 * Returns all the quarry applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId);

	/**
	 * Returns a range of all the quarry applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId, int start, int end);

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByEntityId_First(
			long entityId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByEntityId_First(
		long entityId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByEntityId_Last(
			long entityId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByEntityId_Last(
		long entityId,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public QuarryApplication[] findBygetQuarryByEntityId_PrevAndNext(
			long quarryApplicationId, long entityId,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Removes all the quarry applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetQuarryByEntityId(long entityId);

	/**
	 * Returns the number of quarry applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching quarry applications
	 */
	public int countBygetQuarryByEntityId(long entityId);

	/**
	 * Returns all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status);

	/**
	 * Returns a range of all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	public java.util.List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByEntityId_Status_First(
			long entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByEntityId_Status_First(
		long entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByEntityId_Status_Last(
			long entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByEntityId_Status_Last(
		long entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public QuarryApplication[] findBygetQuarryByEntityId_Status_PrevAndNext(
			long quarryApplicationId, long entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
				orderByComparator)
		throws NoSuchQuarryApplicationException;

	/**
	 * Removes all the quarry applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetQuarryByEntityId_Status(long entityId, int status);

	/**
	 * Returns the number of quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching quarry applications
	 */
	public int countBygetQuarryByEntityId_Status(long entityId, int status);

	/**
	 * Returns the quarry application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByEI_CI(
			long entityId, String caseId)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the quarry application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByEI_CI(
		long entityId, String caseId);

	/**
	 * Returns the quarry application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByEI_CI(
		long entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the quarry application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the quarry application that was removed
	 */
	public QuarryApplication removeBygetQuarryByEI_CI(
			long entityId, String caseId)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the number of quarry applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching quarry applications
	 */
	public int countBygetQuarryByEI_CI(long entityId, String caseId);

	/**
	 * Returns the quarry application where applicationNumber = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByAppNo(String applicationNumber)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the quarry application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByAppNo(String applicationNumber);

	/**
	 * Returns the quarry application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the quarry application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the quarry application that was removed
	 */
	public QuarryApplication removeBygetQuarryByAppNo(String applicationNumber)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the number of quarry applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching quarry applications
	 */
	public int countBygetQuarryByAppNo(String applicationNumber);

	/**
	 * Returns the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	public QuarryApplication findBygetQuarryByAppType_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByAppType_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Returns the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public QuarryApplication fetchBygetQuarryByAppType_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the quarry application that was removed
	 */
	public QuarryApplication removeBygetQuarryByAppType_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the number of quarry applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching quarry applications
	 */
	public int countBygetQuarryByAppType_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Caches the quarry application in the entity cache if it is enabled.
	 *
	 * @param quarryApplication the quarry application
	 */
	public void cacheResult(QuarryApplication quarryApplication);

	/**
	 * Caches the quarry applications in the entity cache if it is enabled.
	 *
	 * @param quarryApplications the quarry applications
	 */
	public void cacheResult(
		java.util.List<QuarryApplication> quarryApplications);

	/**
	 * Creates a new quarry application with the primary key. Does not add the quarry application to the database.
	 *
	 * @param quarryApplicationId the primary key for the new quarry application
	 * @return the new quarry application
	 */
	public QuarryApplication create(long quarryApplicationId);

	/**
	 * Removes the quarry application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application that was removed
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public QuarryApplication remove(long quarryApplicationId)
		throws NoSuchQuarryApplicationException;

	public QuarryApplication updateImpl(QuarryApplication quarryApplication);

	/**
	 * Returns the quarry application with the primary key or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	public QuarryApplication findByPrimaryKey(long quarryApplicationId)
		throws NoSuchQuarryApplicationException;

	/**
	 * Returns the quarry application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application, or <code>null</code> if a quarry application with the primary key could not be found
	 */
	public QuarryApplication fetchByPrimaryKey(long quarryApplicationId);

	/**
	 * Returns all the quarry applications.
	 *
	 * @return the quarry applications
	 */
	public java.util.List<QuarryApplication> findAll();

	/**
	 * Returns a range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of quarry applications
	 */
	public java.util.List<QuarryApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry applications
	 */
	public java.util.List<QuarryApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry applications
	 */
	public java.util.List<QuarryApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<QuarryApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the quarry applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of quarry applications.
	 *
	 * @return the number of quarry applications
	 */
	public int countAll();

}