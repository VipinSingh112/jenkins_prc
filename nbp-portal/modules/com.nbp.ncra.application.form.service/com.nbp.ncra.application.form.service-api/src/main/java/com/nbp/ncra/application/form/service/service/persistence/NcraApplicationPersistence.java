/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ncra.application.form.service.exception.NoSuchNcraApplicationException;
import com.nbp.ncra.application.form.service.model.NcraApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ncra application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationUtil
 * @generated
 */
@ProviderType
public interface NcraApplicationPersistence
	extends BasePersistence<NcraApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NcraApplicationUtil} to access the ncra application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the first ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns the last ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the last ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public NcraApplication[] findBygetNcraByS_U_PrevAndNext(
			long ncraApplicationId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Removes all the ncra applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetNcraByS_U(long userId, int status);

	/**
	 * Returns the number of ncra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching ncra applications
	 */
	public int countBygetNcraByS_U(long userId, int status);

	/**
	 * Returns all the ncra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByStatus(int status);

	/**
	 * Returns a range of all the ncra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the ncra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the first ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns the last ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the last ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where status = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public NcraApplication[] findBygetNcraByStatus_PrevAndNext(
			long ncraApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Removes all the ncra applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetNcraByStatus(int status);

	/**
	 * Returns the number of ncra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncra applications
	 */
	public int countBygetNcraByStatus(int status);

	/**
	 * Returns the ncra application where applicationNumber = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByAppNum(String applicationNumber)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the ncra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByAppNum(String applicationNumber);

	/**
	 * Returns the ncra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByAppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the ncra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the ncra application that was removed
	 */
	public NcraApplication removeBygetNcraByAppNum(String applicationNumber)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the number of ncra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ncra applications
	 */
	public int countBygetNcraByAppNum(String applicationNumber);

	/**
	 * Returns the ncra application where caseId = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByCaseId(String caseId)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the ncra application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByCaseId(String caseId);

	/**
	 * Returns the ncra application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ncra application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncra application that was removed
	 */
	public NcraApplication removeBygetNcraByCaseId(String caseId)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the number of ncra applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra applications
	 */
	public int countBygetNcraByCaseId(String caseId);

	/**
	 * Returns all the ncra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByEntityId(
		String entityId);

	/**
	 * Returns a range of all the ncra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByEntityId(
		String entityId, int start, int end);

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByEntityId_First(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByEntityId_First(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByEntityId_Last(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByEntityId_Last(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public NcraApplication[] findBygetNcraByEntityId_PrevAndNext(
			long ncraApplicationId, String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Removes all the ncra applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetNcraByEntityId(String entityId);

	/**
	 * Returns the number of ncra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching ncra applications
	 */
	public int countBygetNcraByEntityId(String entityId);

	/**
	 * Returns all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status);

	/**
	 * Returns a range of all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	public java.util.List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByEntityId_Status_First(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByEntityId_Status_First(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByEntityId_Status_Last(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByEntityId_Status_Last(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public NcraApplication[] findBygetNcraByEntityId_Status_PrevAndNext(
			long ncraApplicationId, String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
				orderByComparator)
		throws NoSuchNcraApplicationException;

	/**
	 * Removes all the ncra applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetNcraByEntityId_Status(String entityId, int status);

	/**
	 * Returns the number of ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching ncra applications
	 */
	public int countBygetNcraByEntityId_Status(String entityId, int status);

	/**
	 * Returns the ncra application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByEI_CI(String entityId, String caseId)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the ncra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByEI_CI(
		String entityId, String caseId);

	/**
	 * Returns the ncra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByEI_CI(
		String entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the ncra application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the ncra application that was removed
	 */
	public NcraApplication removeBygetNcraByEI_CI(
			String entityId, String caseId)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the number of ncra applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching ncra applications
	 */
	public int countBygetNcraByEI_CI(String entityId, String caseId);

	/**
	 * Returns the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	public NcraApplication findBygetNcraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Returns the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	public NcraApplication fetchBygetNcraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the ncra application that was removed
	 */
	public NcraApplication removeBygetNcraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the number of ncra applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching ncra applications
	 */
	public int countBygetNcraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Caches the ncra application in the entity cache if it is enabled.
	 *
	 * @param ncraApplication the ncra application
	 */
	public void cacheResult(NcraApplication ncraApplication);

	/**
	 * Caches the ncra applications in the entity cache if it is enabled.
	 *
	 * @param ncraApplications the ncra applications
	 */
	public void cacheResult(java.util.List<NcraApplication> ncraApplications);

	/**
	 * Creates a new ncra application with the primary key. Does not add the ncra application to the database.
	 *
	 * @param ncraApplicationId the primary key for the new ncra application
	 * @return the new ncra application
	 */
	public NcraApplication create(long ncraApplicationId);

	/**
	 * Removes the ncra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application that was removed
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public NcraApplication remove(long ncraApplicationId)
		throws NoSuchNcraApplicationException;

	public NcraApplication updateImpl(NcraApplication ncraApplication);

	/**
	 * Returns the ncra application with the primary key or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	public NcraApplication findByPrimaryKey(long ncraApplicationId)
		throws NoSuchNcraApplicationException;

	/**
	 * Returns the ncra application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application, or <code>null</code> if a ncra application with the primary key could not be found
	 */
	public NcraApplication fetchByPrimaryKey(long ncraApplicationId);

	/**
	 * Returns all the ncra applications.
	 *
	 * @return the ncra applications
	 */
	public java.util.List<NcraApplication> findAll();

	/**
	 * Returns a range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of ncra applications
	 */
	public java.util.List<NcraApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra applications
	 */
	public java.util.List<NcraApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra applications
	 */
	public java.util.List<NcraApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NcraApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ncra applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ncra applications.
	 *
	 * @return the number of ncra applications
	 */
	public int countAll();

}