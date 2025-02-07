/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.janaac.application.form.service.exception.NoSuchJanaacApplicationException;
import com.nbp.janaac.application.form.service.model.JanaacApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the janaac application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JanaacApplicationUtil
 * @generated
 */
@ProviderType
public interface JanaacApplicationPersistence
	extends BasePersistence<JanaacApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JanaacApplicationUtil} to access the janaac application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the janaac applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching janaac applications
	 */
	public java.util.List<JanaacApplication> findByUuid(String uuid);

	/**
	 * Returns a range of all the janaac applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public JanaacApplication[] findByUuid_PrevAndNext(
			long janaacApplicationId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Removes all the janaac applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of janaac applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching janaac applications
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the janaac application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the janaac application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the janaac application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the janaac application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the janaac application that was removed
	 */
	public JanaacApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the number of janaac applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching janaac applications
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching janaac applications
	 */
	public java.util.List<JanaacApplication> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public JanaacApplication[] findByUuid_C_PrevAndNext(
			long janaacApplicationId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Removes all the janaac applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching janaac applications
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching janaac applications
	 */
	public java.util.List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findBygetJANAAC_ByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the first janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchBygetJANAAC_ByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns the last janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findBygetJANAAC_ByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the last janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchBygetJANAAC_ByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public JanaacApplication[] findBygetJANAAC_ByS_U_PrevAndNext(
			long janaacApplicationId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Removes all the janaac applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetJANAAC_ByS_U(long userId, int status);

	/**
	 * Returns the number of janaac applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching janaac applications
	 */
	public int countBygetJANAAC_ByS_U(long userId, int status);

	/**
	 * Returns all the janaac applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching janaac applications
	 */
	public java.util.List<JanaacApplication> findBygetJANAAC_By_Status(
		int status);

	/**
	 * Returns a range of all the janaac applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findBygetJANAAC_By_Status(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the janaac applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findBygetJANAAC_By_Status(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	public java.util.List<JanaacApplication> findBygetJANAAC_By_Status(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findBygetJANAAC_By_Status_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the first janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchBygetJANAAC_By_Status_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns the last janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findBygetJANAAC_By_Status_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the last janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchBygetJANAAC_By_Status_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where status = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public JanaacApplication[] findBygetJANAAC_By_Status_PrevAndNext(
			long janaacApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
				orderByComparator)
		throws NoSuchJanaacApplicationException;

	/**
	 * Removes all the janaac applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetJANAAC_By_Status(int status);

	/**
	 * Returns the number of janaac applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching janaac applications
	 */
	public int countBygetJANAAC_By_Status(int status);

	/**
	 * Returns the janaac application where applicationNumber = &#63; or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findBygetJANAAC_By_AppNum(String applicationNumber)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the janaac application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchBygetJANAAC_By_AppNum(
		String applicationNumber);

	/**
	 * Returns the janaac application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchBygetJANAAC_By_AppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the janaac application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the janaac application that was removed
	 */
	public JanaacApplication removeBygetJANAAC_By_AppNum(
			String applicationNumber)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the number of janaac applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching janaac applications
	 */
	public int countBygetJANAAC_By_AppNum(String applicationNumber);

	/**
	 * Returns the janaac application where caseId = &#63; or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	public JanaacApplication findBygetJANAAC_ByCaseId(String caseId)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the janaac application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchBygetJANAAC_ByCaseId(String caseId);

	/**
	 * Returns the janaac application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	public JanaacApplication fetchBygetJANAAC_ByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the janaac application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac application that was removed
	 */
	public JanaacApplication removeBygetJANAAC_ByCaseId(String caseId)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the number of janaac applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac applications
	 */
	public int countBygetJANAAC_ByCaseId(String caseId);

	/**
	 * Caches the janaac application in the entity cache if it is enabled.
	 *
	 * @param janaacApplication the janaac application
	 */
	public void cacheResult(JanaacApplication janaacApplication);

	/**
	 * Caches the janaac applications in the entity cache if it is enabled.
	 *
	 * @param janaacApplications the janaac applications
	 */
	public void cacheResult(
		java.util.List<JanaacApplication> janaacApplications);

	/**
	 * Creates a new janaac application with the primary key. Does not add the janaac application to the database.
	 *
	 * @param janaacApplicationId the primary key for the new janaac application
	 * @return the new janaac application
	 */
	public JanaacApplication create(long janaacApplicationId);

	/**
	 * Removes the janaac application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application that was removed
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public JanaacApplication remove(long janaacApplicationId)
		throws NoSuchJanaacApplicationException;

	public JanaacApplication updateImpl(JanaacApplication janaacApplication);

	/**
	 * Returns the janaac application with the primary key or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	public JanaacApplication findByPrimaryKey(long janaacApplicationId)
		throws NoSuchJanaacApplicationException;

	/**
	 * Returns the janaac application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application, or <code>null</code> if a janaac application with the primary key could not be found
	 */
	public JanaacApplication fetchByPrimaryKey(long janaacApplicationId);

	/**
	 * Returns all the janaac applications.
	 *
	 * @return the janaac applications
	 */
	public java.util.List<JanaacApplication> findAll();

	/**
	 * Returns a range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of janaac applications
	 */
	public java.util.List<JanaacApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac applications
	 */
	public java.util.List<JanaacApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac applications
	 */
	public java.util.List<JanaacApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JanaacApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the janaac applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of janaac applications.
	 *
	 * @return the number of janaac applications
	 */
	public int countAll();

}