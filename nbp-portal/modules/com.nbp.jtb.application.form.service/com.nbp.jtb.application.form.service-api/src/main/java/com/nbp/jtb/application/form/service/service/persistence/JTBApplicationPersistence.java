/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.jtb.application.form.service.exception.NoSuchJTBApplicationException;
import com.nbp.jtb.application.form.service.model.JTBApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the jtb application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplicationUtil
 * @generated
 */
@ProviderType
public interface JTBApplicationPersistence
	extends BasePersistence<JTBApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JTBApplicationUtil} to access the jtb application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the jtb applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jtb applications
	 */
	public java.util.List<JTBApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the jtb applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public JTBApplication[] findByUuid_PrevAndNext(
			long jtbApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Removes all the jtb applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of jtb applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jtb applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the jtb application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the jtb application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the jtb application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the jtb application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jtb application that was removed
	 */
	public JTBApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the number of jtb applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jtb applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jtb applications
	 */
	public java.util.List<JTBApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public JTBApplication[] findByUuid_C_PrevAndNext(
			long jtbApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Removes all the jtb applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jtb applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findBygetJTB_ByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the first jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_ByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the last jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findBygetJTB_ByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the last jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_ByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public JTBApplication[] findBygetJTB_ByS_U_PrevAndNext(
			long jtbApplicationId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Removes all the jtb applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetJTB_ByS_U(long userId, int status);

	/**
	 * Returns the number of jtb applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching jtb applications
	 */
	public int countBygetJTB_ByS_U(long userId, int status);

	/**
	 * Returns all the jtb applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_By_Status(int status);

	/**
	 * Returns a range of all the jtb applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_By_Status(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_By_Status(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_By_Status(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findBygetJTB_By_Status_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the first jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_By_Status_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the last jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findBygetJTB_By_Status_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the last jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_By_Status_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where status = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public JTBApplication[] findBygetJTB_By_Status_PrevAndNext(
			long jtbApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Removes all the jtb applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetJTB_By_Status(int status);

	/**
	 * Returns the number of jtb applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching jtb applications
	 */
	public int countBygetJTB_By_Status(int status);

	/**
	 * Returns the jtb application where applicationNumber = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findBygetJTB_By_AppNum(String applicationNumber)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the jtb application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_By_AppNum(String applicationNumber);

	/**
	 * Returns the jtb application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_By_AppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the jtb application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the jtb application that was removed
	 */
	public JTBApplication removeBygetJTB_By_AppNum(String applicationNumber)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the number of jtb applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching jtb applications
	 */
	public int countBygetJTB_By_AppNum(String applicationNumber);

	/**
	 * Returns the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findBygetJTB_By_RT_AppNo(
			String jtbTransactionTypeVal, String expiredLicenseAppNumber)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_By_RT_AppNo(
		String jtbTransactionTypeVal, String expiredLicenseAppNumber);

	/**
	 * Returns the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_By_RT_AppNo(
		String jtbTransactionTypeVal, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the jtb application that was removed
	 */
	public JTBApplication removeBygetJTB_By_RT_AppNo(
			String jtbTransactionTypeVal, String expiredLicenseAppNumber)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the number of jtb applications where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching jtb applications
	 */
	public int countBygetJTB_By_RT_AppNo(
		String jtbTransactionTypeVal, String expiredLicenseAppNumber);

	/**
	 * Returns the jtb application where caseId = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findBygetJTB_ByCaseId(String caseId)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the jtb application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_ByCaseId(String caseId);

	/**
	 * Returns the jtb application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_ByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the jtb application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb application that was removed
	 */
	public JTBApplication removeBygetJTB_ByCaseId(String caseId)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the number of jtb applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb applications
	 */
	public int countBygetJTB_ByCaseId(String caseId);

	/**
	 * Returns all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @return the matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication);

	/**
	 * Returns a range of all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication, int start, int end);

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	public java.util.List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findBygetJTB_By_AppType_Status_First(
			int status, String typeOfApplication,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the first jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_By_AppType_Status_First(
		int status, String typeOfApplication,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the last jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	public JTBApplication findBygetJTB_By_AppType_Status_Last(
			int status, String typeOfApplication,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the last jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public JTBApplication fetchBygetJTB_By_AppType_Status_Last(
		int status, String typeOfApplication,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public JTBApplication[] findBygetJTB_By_AppType_Status_PrevAndNext(
			long jtbApplicationId, int status, String typeOfApplication,
			com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
				orderByComparator)
		throws NoSuchJTBApplicationException;

	/**
	 * Removes all the jtb applications where status = &#63; and typeOfApplication = &#63; from the database.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 */
	public void removeBygetJTB_By_AppType_Status(
		int status, String typeOfApplication);

	/**
	 * Returns the number of jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @return the number of matching jtb applications
	 */
	public int countBygetJTB_By_AppType_Status(
		int status, String typeOfApplication);

	/**
	 * Caches the jtb application in the entity cache if it is enabled.
	 *
	 * @param jtbApplication the jtb application
	 */
	public void cacheResult(JTBApplication jtbApplication);

	/**
	 * Caches the jtb applications in the entity cache if it is enabled.
	 *
	 * @param jtbApplications the jtb applications
	 */
	public void cacheResult(java.util.List<JTBApplication> jtbApplications);

	/**
	 * Creates a new jtb application with the primary key. Does not add the jtb application to the database.
	 *
	 * @param jtbApplicationId the primary key for the new jtb application
	 * @return the new jtb application
	 */
	public JTBApplication create(long jtbApplicationId);

	/**
	 * Removes the jtb application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application that was removed
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public JTBApplication remove(long jtbApplicationId)
		throws NoSuchJTBApplicationException;

	public JTBApplication updateImpl(JTBApplication jtbApplication);

	/**
	 * Returns the jtb application with the primary key or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	public JTBApplication findByPrimaryKey(long jtbApplicationId)
		throws NoSuchJTBApplicationException;

	/**
	 * Returns the jtb application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application, or <code>null</code> if a jtb application with the primary key could not be found
	 */
	public JTBApplication fetchByPrimaryKey(long jtbApplicationId);

	/**
	 * Returns all the jtb applications.
	 *
	 * @return the jtb applications
	 */
	public java.util.List<JTBApplication> findAll();

	/**
	 * Returns a range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of jtb applications
	 */
	public java.util.List<JTBApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb applications
	 */
	public java.util.List<JTBApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb applications
	 */
	public java.util.List<JTBApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JTBApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the jtb applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of jtb applications.
	 *
	 * @return the number of jtb applications
	 */
	public int countAll();

}