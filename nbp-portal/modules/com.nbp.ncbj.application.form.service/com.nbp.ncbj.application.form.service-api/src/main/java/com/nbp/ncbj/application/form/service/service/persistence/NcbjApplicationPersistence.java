/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjApplicationException;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncbj application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationUtil
 * @generated
 */
@ProviderType
public interface NcbjApplicationPersistence
	extends BasePersistence<NcbjApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcbjApplicationUtil} to access the ncbj application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ncbj applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the ncbj applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public NcbjApplication[] findByUuid_PrevAndNext(
			long ncbjApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Removes all the ncbj applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of ncbj applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncbj applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the ncbj application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the ncbj application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the ncbj application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the ncbj application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncbj application that was removed
	 */
	public NcbjApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the number of ncbj applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncbj applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public NcbjApplication[] findByUuid_C_PrevAndNext(
			long ncbjApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Removes all the ncbj applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncbj applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findBygetNCBJByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the first ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNCBJByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the last ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findBygetNCBJByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the last ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNCBJByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public NcbjApplication[] findBygetNCBJByS_U_PrevAndNext(
			long ncbjApplicationId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Removes all the ncbj applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetNCBJByS_U(long userId, int status);

	/**
	 * Returns the number of ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching ncbj applications
	 */
	public int countBygetNCBJByS_U(long userId, int status);

	/**
	 * Returns all the ncbj applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByStatus(int status);

	/**
	 * Returns a range of all the ncbj applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findBygetNCBJByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the first ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNCBJByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the last ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findBygetNCBJByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the last ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNCBJByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where status = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public NcbjApplication[] findBygetNCBJByStatus_PrevAndNext(
			long ncbjApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Removes all the ncbj applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetNCBJByStatus(int status);

	/**
	 * Returns the number of ncbj applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncbj applications
	 */
	public int countBygetNCBJByStatus(int status);

	/**
	 * Returns the ncbj application where caseId = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findBygetNCBJByCaseId(String caseId)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the ncbj application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNCBJByCaseId(String caseId);

	/**
	 * Returns the ncbj application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNCBJByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncbj application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj application that was removed
	 */
	public NcbjApplication removeBygetNCBJByCaseId(String caseId)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the number of ncbj applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj applications
	 */
	public int countBygetNCBJByCaseId(String caseId);

	/**
	 * Returns all the ncbj applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber);

	/**
	 * Returns a range of all the ncbj applications where applicationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationNumber the application number
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber, int start, int end);

	/**
	 * Returns an ordered range of all the ncbj applications where applicationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationNumber the application number
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj applications where applicationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationNumber the application number
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	public java.util.List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findBygetNCBJByAppNum_First(
			String applicationNumber,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the first ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNCBJByAppNum_First(
		String applicationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the last ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findBygetNCBJByAppNum_Last(
			String applicationNumber,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the last ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNCBJByAppNum_Last(
		String applicationNumber,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public NcbjApplication[] findBygetNCBJByAppNum_PrevAndNext(
			long ncbjApplicationId, String applicationNumber,
			com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
				orderByComparator)
		throws NoSuchNcbjApplicationException;

	/**
	 * Removes all the ncbj applications where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 */
	public void removeBygetNCBJByAppNum(String applicationNumber);

	/**
	 * Returns the number of ncbj applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ncbj applications
	 */
	public int countBygetNCBJByAppNum(String applicationNumber);

	/**
	 * Returns the ncbj application where applicationNumber = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findBygetNcbj_By_App_Num(String applicationNumber)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the ncbj application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNcbj_By_App_Num(String applicationNumber);

	/**
	 * Returns the ncbj application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNcbj_By_App_Num(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the ncbj application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the ncbj application that was removed
	 */
	public NcbjApplication removeBygetNcbj_By_App_Num(String applicationNumber)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the number of ncbj applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ncbj applications
	 */
	public int countBygetNcbj_By_App_Num(String applicationNumber);

	/**
	 * Returns the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	public NcbjApplication findBygetNcbjByRT_AppNo(
			String typeOfServices, String expiredLicenseAppNumber)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNcbjByRT_AppNo(
		String typeOfServices, String expiredLicenseAppNumber);

	/**
	 * Returns the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	public NcbjApplication fetchBygetNcbjByRT_AppNo(
		String typeOfServices, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the ncbj application that was removed
	 */
	public NcbjApplication removeBygetNcbjByRT_AppNo(
			String typeOfServices, String expiredLicenseAppNumber)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the number of ncbj applications where typeOfServices = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching ncbj applications
	 */
	public int countBygetNcbjByRT_AppNo(
		String typeOfServices, String expiredLicenseAppNumber);

	/**
	 * Caches the ncbj application in the entity cache if it is enabled.
	 *
	 * @param ncbjApplication the ncbj application
	 */
	public void cacheResult(NcbjApplication ncbjApplication);

	/**
	 * Caches the ncbj applications in the entity cache if it is enabled.
	 *
	 * @param ncbjApplications the ncbj applications
	 */
	public void cacheResult(java.util.List<NcbjApplication> ncbjApplications);

	/**
	 * Creates a new ncbj application with the primary key. Does not add the ncbj application to the database.
	 *
	 * @param ncbjApplicationId the primary key for the new ncbj application
	 * @return the new ncbj application
	 */
	public NcbjApplication create(long ncbjApplicationId);

	/**
	 * Removes the ncbj application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application that was removed
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public NcbjApplication remove(long ncbjApplicationId)
		throws NoSuchNcbjApplicationException;

	public NcbjApplication updateImpl(NcbjApplication ncbjApplication);

	/**
	 * Returns the ncbj application with the primary key or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	public NcbjApplication findByPrimaryKey(long ncbjApplicationId)
		throws NoSuchNcbjApplicationException;

	/**
	 * Returns the ncbj application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application, or <code>null</code> if a ncbj application with the primary key could not be found
	 */
	public NcbjApplication fetchByPrimaryKey(long ncbjApplicationId);

	/**
	 * Returns all the ncbj applications.
	 *
	 * @return the ncbj applications
	 */
	public java.util.List<NcbjApplication> findAll();

	/**
	 * Returns a range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of ncbj applications
	 */
	public java.util.List<NcbjApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj applications
	 */
	public java.util.List<NcbjApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj applications
	 */
	public java.util.List<NcbjApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcbjApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncbj applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncbj applications.
	 *
	 * @return the number of ncbj applications
	 */
	public int countAll();

}