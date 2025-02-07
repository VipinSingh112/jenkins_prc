/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.application.form.services.exception.NoSuchOsiApplicationException;
import com.nbp.osi.application.form.services.model.OsiApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationUtil
 * @generated
 */
@ProviderType
public interface OsiApplicationPersistence
	extends BasePersistence<OsiApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiApplicationUtil} to access the osi application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public OsiApplication[] findBygetOsiByS_U_PrevAndNext(
			long osiApplicationId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Removes all the osi applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetOsiByS_U(long userId, int status);

	/**
	 * Returns the number of osi applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching osi applications
	 */
	public int countBygetOsiByS_U(long userId, int status);

	/**
	 * Returns all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @return the matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus);

	/**
	 * Returns a range of all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus, int start, int end);

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByStatus_UserId(
		long userId, int applicationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByStatus_UserId_First(
			long userId, int applicationStatus,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the first osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByStatus_UserId_First(
		long userId, int applicationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByStatus_UserId_Last(
			long userId, int applicationStatus,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the last osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByStatus_UserId_Last(
		long userId, int applicationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public OsiApplication[] findBygetOsiByStatus_UserId_PrevAndNext(
			long osiApplicationId, long userId, int applicationStatus,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Removes all the osi applications where userId = &#63; and applicationStatus = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 */
	public void removeBygetOsiByStatus_UserId(
		long userId, int applicationStatus);

	/**
	 * Returns the number of osi applications where userId = &#63; and applicationStatus = &#63;.
	 *
	 * @param userId the user ID
	 * @param applicationStatus the application status
	 * @return the number of matching osi applications
	 */
	public int countBygetOsiByStatus_UserId(long userId, int applicationStatus);

	/**
	 * Returns all the osi applications where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @return the matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus);

	/**
	 * Returns a range of all the osi applications where applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus, int start, int end);

	/**
	 * Returns an ordered range of all the osi applications where applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi applications where applicationStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationStatus the application status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByAppStatus(
		int applicationStatus, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByAppStatus_First(
			int applicationStatus,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the first osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByAppStatus_First(
		int applicationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns the last osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByAppStatus_Last(
			int applicationStatus,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the last osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByAppStatus_Last(
		int applicationStatus,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where applicationStatus = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param applicationStatus the application status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public OsiApplication[] findBygetOsiByAppStatus_PrevAndNext(
			long osiApplicationId, int applicationStatus,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Removes all the osi applications where applicationStatus = &#63; from the database.
	 *
	 * @param applicationStatus the application status
	 */
	public void removeBygetOsiByAppStatus(int applicationStatus);

	/**
	 * Returns the number of osi applications where applicationStatus = &#63;.
	 *
	 * @param applicationStatus the application status
	 * @return the number of matching osi applications
	 */
	public int countBygetOsiByAppStatus(int applicationStatus);

	/**
	 * Returns all the osi applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByStatus(int status);

	/**
	 * Returns a range of all the osi applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the osi applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi applications
	 */
	public java.util.List<OsiApplication> findBygetOsiByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the first osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns the last osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the last osi application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns the osi applications before and after the current osi application in the ordered set where status = &#63;.
	 *
	 * @param osiApplicationId the primary key of the current osi application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public OsiApplication[] findBygetOsiByStatus_PrevAndNext(
			long osiApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
				orderByComparator)
		throws NoSuchOsiApplicationException;

	/**
	 * Removes all the osi applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetOsiByStatus(int status);

	/**
	 * Returns the number of osi applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi applications
	 */
	public int countBygetOsiByStatus(int status);

	/**
	 * Returns the osi application where applicationNumber = &#63; or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByAppNum(String applicationNumber)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the osi application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByAppNum(String applicationNumber);

	/**
	 * Returns the osi application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByAppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the osi application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the osi application that was removed
	 */
	public OsiApplication removeBygetOsiByAppNum(String applicationNumber)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the number of osi applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching osi applications
	 */
	public int countBygetOsiByAppNum(String applicationNumber);

	/**
	 * Returns the osi application where caseId = &#63; or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByCaseId(String caseId)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the osi application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByCaseId(String caseId);

	/**
	 * Returns the osi application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the osi application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi application that was removed
	 */
	public OsiApplication removeBygetOsiByCaseId(String caseId)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the number of osi applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi applications
	 */
	public int countBygetOsiByCaseId(String caseId);

	/**
	 * Returns the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi application
	 * @throws NoSuchOsiApplicationException if a matching osi application could not be found
	 */
	public OsiApplication findBygetOsiByAT_AppNo(
			String applicationType, String expiredLicenseAppNumber)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByAT_AppNo(
		String applicationType, String expiredLicenseAppNumber);

	/**
	 * Returns the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application, or <code>null</code> if a matching osi application could not be found
	 */
	public OsiApplication fetchBygetOsiByAT_AppNo(
		String applicationType, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the osi application where applicationType = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the osi application that was removed
	 */
	public OsiApplication removeBygetOsiByAT_AppNo(
			String applicationType, String expiredLicenseAppNumber)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the number of osi applications where applicationType = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param applicationType the application type
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching osi applications
	 */
	public int countBygetOsiByAT_AppNo(
		String applicationType, String expiredLicenseAppNumber);

	/**
	 * Caches the osi application in the entity cache if it is enabled.
	 *
	 * @param osiApplication the osi application
	 */
	public void cacheResult(OsiApplication osiApplication);

	/**
	 * Caches the osi applications in the entity cache if it is enabled.
	 *
	 * @param osiApplications the osi applications
	 */
	public void cacheResult(java.util.List<OsiApplication> osiApplications);

	/**
	 * Creates a new osi application with the primary key. Does not add the osi application to the database.
	 *
	 * @param osiApplicationId the primary key for the new osi application
	 * @return the new osi application
	 */
	public OsiApplication create(long osiApplicationId);

	/**
	 * Removes the osi application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application that was removed
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public OsiApplication remove(long osiApplicationId)
		throws NoSuchOsiApplicationException;

	public OsiApplication updateImpl(OsiApplication osiApplication);

	/**
	 * Returns the osi application with the primary key or throws a <code>NoSuchOsiApplicationException</code> if it could not be found.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application
	 * @throws NoSuchOsiApplicationException if a osi application with the primary key could not be found
	 */
	public OsiApplication findByPrimaryKey(long osiApplicationId)
		throws NoSuchOsiApplicationException;

	/**
	 * Returns the osi application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiApplicationId the primary key of the osi application
	 * @return the osi application, or <code>null</code> if a osi application with the primary key could not be found
	 */
	public OsiApplication fetchByPrimaryKey(long osiApplicationId);

	/**
	 * Returns all the osi applications.
	 *
	 * @return the osi applications
	 */
	public java.util.List<OsiApplication> findAll();

	/**
	 * Returns a range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @return the range of osi applications
	 */
	public java.util.List<OsiApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi applications
	 */
	public java.util.List<OsiApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi applications
	 * @param end the upper bound of the range of osi applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi applications
	 */
	public java.util.List<OsiApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi applications.
	 *
	 * @return the number of osi applications
	 */
	public int countAll();

}