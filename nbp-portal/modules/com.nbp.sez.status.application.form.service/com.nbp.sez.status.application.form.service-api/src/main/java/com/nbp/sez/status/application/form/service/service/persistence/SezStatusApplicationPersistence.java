/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusApplicationException;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez status application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationUtil
 * @generated
 */
@ProviderType
public interface SezStatusApplicationPersistence
	extends BasePersistence<SezStatusApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezStatusApplicationUtil} to access the sez status application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId);

	/**
	 * Returns a range of all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezByS_U_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezByS_U_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezByS_U_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezByS_U_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public SezStatusApplication[] findBygetSezByS_U_PrevAndNext(
			long sezStatusApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Removes all the sez status applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetSezByS_U(int status, long userId);

	/**
	 * Returns the number of sez status applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching sez status applications
	 */
	public int countBygetSezByS_U(int status, long userId);

	/**
	 * Returns the sez status application where caseId = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezStatusByCaseId(String caseId)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the sez status application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByCaseId(String caseId);

	/**
	 * Returns the sez status application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the sez status application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status application that was removed
	 */
	public SezStatusApplication removeBygetSezStatusByCaseId(String caseId)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the number of sez status applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status applications
	 */
	public int countBygetSezStatusByCaseId(String caseId);

	/**
	 * Returns all the sez status applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezByStatus(
		int status);

	/**
	 * Returns a range of all the sez status applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the first sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the last sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the last sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where status = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public SezStatusApplication[] findBygetSezByStatus_PrevAndNext(
			long sezStatusApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Removes all the sez status applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetSezByStatus(int status);

	/**
	 * Returns the number of sez status applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching sez status applications
	 */
	public int countBygetSezByStatus(int status);

	/**
	 * Returns all the sez status applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId);

	/**
	 * Returns a range of all the sez status applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId, int start, int end);

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezStatusByEntityId_First(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByEntityId_First(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezStatusByEntityId_Last(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByEntityId_Last(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public SezStatusApplication[] findBygetSezStatusByEntityId_PrevAndNext(
			long sezStatusApplicationId, String entityId,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Removes all the sez status applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetSezStatusByEntityId(String entityId);

	/**
	 * Returns the number of sez status applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching sez status applications
	 */
	public int countBygetSezStatusByEntityId(String entityId);

	/**
	 * Returns all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching sez status applications
	 */
	public java.util.List<SezStatusApplication>
		findBygetSezStatusByEntityId_Status(String entityId, int status);

	/**
	 * Returns a range of all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication>
		findBygetSezStatusByEntityId_Status(
			String entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication>
		findBygetSezStatusByEntityId_Status(
			String entityId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication>
		findBygetSezStatusByEntityId_Status(
			String entityId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezStatusByEntityId_Status_First(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByEntityId_Status_First(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezStatusByEntityId_Status_Last(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByEntityId_Status_Last(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public SezStatusApplication[]
			findBygetSezStatusByEntityId_Status_PrevAndNext(
				long sezStatusApplicationId, String entityId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Removes all the sez status applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetSezStatusByEntityId_Status(
		String entityId, int status);

	/**
	 * Returns the number of sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching sez status applications
	 */
	public int countBygetSezStatusByEntityId_Status(
		String entityId, int status);

	/**
	 * Returns the sez status application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezStatusByEI_CI(
			String entityId, String caseId)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the sez status application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByEI_CI(
		String entityId, String caseId);

	/**
	 * Returns the sez status application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByEI_CI(
		String entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the sez status application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the sez status application that was removed
	 */
	public SezStatusApplication removeBygetSezStatusByEI_CI(
			String entityId, String caseId)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the number of sez status applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching sez status applications
	 */
	public int countBygetSezStatusByEI_CI(String entityId, String caseId);

	/**
	 * Returns the sez status application where applicationNumber = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezStatusByAppNo(
			String applicationNumber)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the sez status application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByAppNo(
		String applicationNumber);

	/**
	 * Returns the sez status application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the sez status application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the sez status application that was removed
	 */
	public SezStatusApplication removeBygetSezStatusByAppNo(
			String applicationNumber)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the number of sez status applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching sez status applications
	 */
	public int countBygetSezStatusByAppNo(String applicationNumber);

	/**
	 * Returns the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSezStatusByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Returns the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSezStatusByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the sez status application that was removed
	 */
	public SezStatusApplication removeBygetSezStatusByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the number of sez status applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching sez status applications
	 */
	public int countBygetSezStatusByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber);

	/**
	 * Returns all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @return the matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo);

	/**
	 * Returns a range of all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo, int start, int end);

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	public java.util.List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSez_By_App_Status_First(
			int status, String doYouWantTo,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSez_By_App_Status_First(
		int status, String doYouWantTo,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	public SezStatusApplication findBygetSez_By_App_Status_Last(
			int status, String doYouWantTo,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	public SezStatusApplication fetchBygetSez_By_App_Status_Last(
		int status, String doYouWantTo,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public SezStatusApplication[] findBygetSez_By_App_Status_PrevAndNext(
			long sezStatusApplicationId, int status, String doYouWantTo,
			com.liferay.portal.kernel.util.OrderByComparator
				<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Removes all the sez status applications where status = &#63; and doYouWantTo = &#63; from the database.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 */
	public void removeBygetSez_By_App_Status(int status, String doYouWantTo);

	/**
	 * Returns the number of sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @return the number of matching sez status applications
	 */
	public int countBygetSez_By_App_Status(int status, String doYouWantTo);

	/**
	 * Caches the sez status application in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplication the sez status application
	 */
	public void cacheResult(SezStatusApplication sezStatusApplication);

	/**
	 * Caches the sez status applications in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplications the sez status applications
	 */
	public void cacheResult(
		java.util.List<SezStatusApplication> sezStatusApplications);

	/**
	 * Creates a new sez status application with the primary key. Does not add the sez status application to the database.
	 *
	 * @param sezStatusApplicationId the primary key for the new sez status application
	 * @return the new sez status application
	 */
	public SezStatusApplication create(long sezStatusApplicationId);

	/**
	 * Removes the sez status application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application that was removed
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public SezStatusApplication remove(long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationException;

	public SezStatusApplication updateImpl(
		SezStatusApplication sezStatusApplication);

	/**
	 * Returns the sez status application with the primary key or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	public SezStatusApplication findByPrimaryKey(long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationException;

	/**
	 * Returns the sez status application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application, or <code>null</code> if a sez status application with the primary key could not be found
	 */
	public SezStatusApplication fetchByPrimaryKey(long sezStatusApplicationId);

	/**
	 * Returns all the sez status applications.
	 *
	 * @return the sez status applications
	 */
	public java.util.List<SezStatusApplication> findAll();

	/**
	 * Returns a range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of sez status applications
	 */
	public java.util.List<SezStatusApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status applications
	 */
	public java.util.List<SezStatusApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status applications
	 */
	public java.util.List<SezStatusApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SezStatusApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez status applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez status applications.
	 *
	 * @return the number of sez status applications
	 */
	public int countAll();

}