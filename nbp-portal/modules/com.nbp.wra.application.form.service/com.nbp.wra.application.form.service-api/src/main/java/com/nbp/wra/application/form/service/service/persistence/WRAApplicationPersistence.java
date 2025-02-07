/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.wra.application.form.service.exception.NoSuchWRAApplicationException;
import com.nbp.wra.application.form.service.model.WRAApplication;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the wra application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WRAApplicationUtil
 * @generated
 */
@ProviderType
public interface WRAApplicationPersistence
	extends BasePersistence<WRAApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link WRAApplicationUtil} to access the wra application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId);

	/**
	 * Returns a range of all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_ByS_U_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the first wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_ByS_U_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns the last wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_ByS_U_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the last wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_ByS_U_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public WRAApplication[] findBygetWRA_ByS_U_PrevAndNext(
			long wraApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Removes all the wra applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetWRA_ByS_U(int status, long userId);

	/**
	 * Returns the number of wra applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching wra applications
	 */
	public int countBygetWRA_ByS_U(int status, long userId);

	/**
	 * Returns the wra application where caseId = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_By_CaseId(String caseId)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the wra application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_CaseId(String caseId);

	/**
	 * Returns the wra application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_CaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the wra application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra application that was removed
	 */
	public WRAApplication removeBygetWRA_By_CaseId(String caseId)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the number of wra applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra applications
	 */
	public int countBygetWRA_By_CaseId(String caseId);

	/**
	 * Returns all the wra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_Status(int status);

	/**
	 * Returns a range of all the wra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_Status(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the wra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_Status(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_Status(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_By_Status_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the first wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_Status_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns the last wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_By_Status_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the last wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_Status_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where status = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public WRAApplication[] findBygetWRA_By_Status_PrevAndNext(
			long wraApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Removes all the wra applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetWRA_By_Status(int status);

	/**
	 * Returns the number of wra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching wra applications
	 */
	public int countBygetWRA_By_Status(int status);

	/**
	 * Returns all the wra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId);

	/**
	 * Returns a range of all the wra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId, int start, int end);

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_By_EntityId_First(
			Date entityId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_EntityId_First(
		Date entityId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_By_EntityId_Last(
			Date entityId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_EntityId_Last(
		Date entityId,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where entityId = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public WRAApplication[] findBygetWRA_By_EntityId_PrevAndNext(
			long wraApplicationId, Date entityId,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Removes all the wra applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetWRA_By_EntityId(Date entityId);

	/**
	 * Returns the number of wra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching wra applications
	 */
	public int countBygetWRA_By_EntityId(Date entityId);

	/**
	 * Returns all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status);

	/**
	 * Returns a range of all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	public java.util.List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_By_EntityId_Status_First(
			Date entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_EntityId_Status_First(
		Date entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_By_EntityId_Status_Last(
			Date entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_EntityId_Status_Last(
		Date entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public WRAApplication[] findBygetWRA_By_EntityId_Status_PrevAndNext(
			long wraApplicationId, Date entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
				orderByComparator)
		throws NoSuchWRAApplicationException;

	/**
	 * Removes all the wra applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetWRA_By_EntityId_Status(Date entityId, int status);

	/**
	 * Returns the number of wra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching wra applications
	 */
	public int countBygetWRA_By_EntityId_Status(Date entityId, int status);

	/**
	 * Returns the wra application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRA_By_EI_CI(Date entityId, String caseId)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the wra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_EI_CI(Date entityId, String caseId);

	/**
	 * Returns the wra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRA_By_EI_CI(
		Date entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the wra application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the wra application that was removed
	 */
	public WRAApplication removeBygetWRA_By_EI_CI(Date entityId, String caseId)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the number of wra applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching wra applications
	 */
	public int countBygetWRA_By_EI_CI(Date entityId, String caseId);

	/**
	 * Returns the wra application where applicationNumber = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWRAByAppNo(String applicationNumber)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRAByAppNo(String applicationNumber);

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWRAByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the wra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the wra application that was removed
	 */
	public WRAApplication removeBygetWRAByAppNo(String applicationNumber)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the number of wra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching wra applications
	 */
	public int countBygetWRAByAppNo(String applicationNumber);

	/**
	 * Returns the wra application where applicationNumber = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findByget_WraBy_Case_Id(String applicationNumber)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchByget_WraBy_Case_Id(String applicationNumber);

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchByget_WraBy_Case_Id(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the wra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the wra application that was removed
	 */
	public WRAApplication removeByget_WraBy_Case_Id(String applicationNumber)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the number of wra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching wra applications
	 */
	public int countByget_WraBy_Case_Id(String applicationNumber);

	/**
	 * Returns the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	public WRAApplication findBygetWraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Returns the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	public WRAApplication fetchBygetWraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the wra application that was removed
	 */
	public WRAApplication removeBygetWraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the number of wra applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching wra applications
	 */
	public int countBygetWraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Caches the wra application in the entity cache if it is enabled.
	 *
	 * @param wraApplication the wra application
	 */
	public void cacheResult(WRAApplication wraApplication);

	/**
	 * Caches the wra applications in the entity cache if it is enabled.
	 *
	 * @param wraApplications the wra applications
	 */
	public void cacheResult(java.util.List<WRAApplication> wraApplications);

	/**
	 * Creates a new wra application with the primary key. Does not add the wra application to the database.
	 *
	 * @param wraApplicationId the primary key for the new wra application
	 * @return the new wra application
	 */
	public WRAApplication create(long wraApplicationId);

	/**
	 * Removes the wra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application that was removed
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public WRAApplication remove(long wraApplicationId)
		throws NoSuchWRAApplicationException;

	public WRAApplication updateImpl(WRAApplication wraApplication);

	/**
	 * Returns the wra application with the primary key or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	public WRAApplication findByPrimaryKey(long wraApplicationId)
		throws NoSuchWRAApplicationException;

	/**
	 * Returns the wra application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application, or <code>null</code> if a wra application with the primary key could not be found
	 */
	public WRAApplication fetchByPrimaryKey(long wraApplicationId);

	/**
	 * Returns all the wra applications.
	 *
	 * @return the wra applications
	 */
	public java.util.List<WRAApplication> findAll();

	/**
	 * Returns a range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of wra applications
	 */
	public java.util.List<WRAApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra applications
	 */
	public java.util.List<WRAApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra applications
	 */
	public java.util.List<WRAApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<WRAApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the wra applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of wra applications.
	 *
	 * @return the number of wra applications
	 */
	public int countAll();

}