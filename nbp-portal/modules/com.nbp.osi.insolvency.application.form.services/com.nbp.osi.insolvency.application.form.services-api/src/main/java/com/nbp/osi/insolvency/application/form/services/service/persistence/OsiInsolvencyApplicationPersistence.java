/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchOsiInsolvencyApplicationException;
import com.nbp.osi.insolvency.application.form.services.model.OsiInsolvencyApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi insolvency application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyApplicationUtil
 * @generated
 */
@ProviderType
public interface OsiInsolvencyApplicationPersistence
	extends BasePersistence<OsiInsolvencyApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiInsolvencyApplicationUtil} to access the osi insolvency application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi insolvency application where osiInsolvencyId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication findBygetOsiInsolvencyById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the osi insolvency application where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyById(
		long osiInsolvencyId);

	/**
	 * Returns the osi insolvency application where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyById(
		long osiInsolvencyId, boolean useFinderCache);

	/**
	 * Removes the osi insolvency application where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the osi insolvency application that was removed
	 */
	public OsiInsolvencyApplication removeBygetOsiInsolvencyById(
			long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the number of osi insolvency applications where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolvency applications
	 */
	public int countBygetOsiInsolvencyById(long osiInsolvencyId);

	/**
	 * Returns all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication> findBygetOsiByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplication> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication findBygetOsiByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication findBygetOsiByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public OsiInsolvencyApplication[] findBygetOsiByS_U_PrevAndNext(
			long osiInsolvencyId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Removes all the osi insolvency applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetOsiByS_U(long userId, int status);

	/**
	 * Returns the number of osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	public int countBygetOsiByS_U(long userId, int status);

	/**
	 * Returns the osi insolvency application where applicationNumber = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication findBygetOsiByAppNum(
			String applicationNumber)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the osi insolvency application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiByAppNum(
		String applicationNumber);

	/**
	 * Returns the osi insolvency application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiByAppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the osi insolvency application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the osi insolvency application that was removed
	 */
	public OsiInsolvencyApplication removeBygetOsiByAppNum(
			String applicationNumber)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the number of osi insolvency applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching osi insolvency applications
	 */
	public int countBygetOsiByAppNum(String applicationNumber);

	/**
	 * Returns the osi insolvency application where caseId = &#63; or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication findBygetOsiByCaseId(String caseId)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the osi insolvency application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiByCaseId(String caseId);

	/**
	 * Returns the osi insolvency application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the osi insolvency application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi insolvency application that was removed
	 */
	public OsiInsolvencyApplication removeBygetOsiByCaseId(String caseId)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the number of osi insolvency applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency applications
	 */
	public int countBygetOsiByCaseId(String caseId);

	/**
	 * Returns all the osi insolvency applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus(int status);

	/**
	 * Returns a range of all the osi insolvency applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus(int status, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus(
			int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the first osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns the last osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the last osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public OsiInsolvencyApplication[]
			findBygetOsiInsolvencyByStatus_PrevAndNext(
				long osiInsolvencyId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Removes all the osi insolvency applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetOsiInsolvencyByStatus(int status);

	/**
	 * Returns the number of osi insolvency applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	public int countBygetOsiInsolvencyByStatus(int status);

	/**
	 * Returns all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus_UserId(long userId, int status);

	/**
	 * Returns a range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus_UserId(
			long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus_UserId(
			long userId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByStatus_UserId(
			long userId, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_UserId_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the first osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByStatus_UserId_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication findBygetOsiInsolvencyByStatus_UserId_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the last osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication fetchBygetOsiInsolvencyByStatus_UserId_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public OsiInsolvencyApplication[]
			findBygetOsiInsolvencyByStatus_UserId_PrevAndNext(
				long osiInsolvencyId, long userId, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Removes all the osi insolvency applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetOsiInsolvencyByStatus_UserId(
		long userId, int status);

	/**
	 * Returns the number of osi insolvency applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	public int countBygetOsiInsolvencyByStatus_UserId(long userId, int status);

	/**
	 * Returns all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @return the matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status);

	/**
	 * Returns a range of all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status, int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication>
		findBygetOsiInsolvencyByApplicationStatus_Status(
			String applicantStatus, int status, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication
			findBygetOsiInsolvencyByApplicationStatus_Status_First(
				String applicantStatus, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the first osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByApplicationStatus_Status_First(
			String applicantStatus, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns the last osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication
			findBygetOsiInsolvencyByApplicationStatus_Status_Last(
				String applicantStatus, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the last osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency application, or <code>null</code> if a matching osi insolvency application could not be found
	 */
	public OsiInsolvencyApplication
		fetchBygetOsiInsolvencyByApplicationStatus_Status_Last(
			String applicantStatus, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns the osi insolvency applications before and after the current osi insolvency application in the ordered set where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param osiInsolvencyId the primary key of the current osi insolvency application
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public OsiInsolvencyApplication[]
			findBygetOsiInsolvencyByApplicationStatus_Status_PrevAndNext(
				long osiInsolvencyId, String applicantStatus, int status,
				com.liferay.portal.kernel.util.OrderByComparator
					<OsiInsolvencyApplication> orderByComparator)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Removes all the osi insolvency applications where applicantStatus = &#63; and status = &#63; from the database.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 */
	public void removeBygetOsiInsolvencyByApplicationStatus_Status(
		String applicantStatus, int status);

	/**
	 * Returns the number of osi insolvency applications where applicantStatus = &#63; and status = &#63;.
	 *
	 * @param applicantStatus the applicant status
	 * @param status the status
	 * @return the number of matching osi insolvency applications
	 */
	public int countBygetOsiInsolvencyByApplicationStatus_Status(
		String applicantStatus, int status);

	/**
	 * Caches the osi insolvency application in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplication the osi insolvency application
	 */
	public void cacheResult(OsiInsolvencyApplication osiInsolvencyApplication);

	/**
	 * Caches the osi insolvency applications in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyApplications the osi insolvency applications
	 */
	public void cacheResult(
		java.util.List<OsiInsolvencyApplication> osiInsolvencyApplications);

	/**
	 * Creates a new osi insolvency application with the primary key. Does not add the osi insolvency application to the database.
	 *
	 * @param osiInsolvencyId the primary key for the new osi insolvency application
	 * @return the new osi insolvency application
	 */
	public OsiInsolvencyApplication create(long osiInsolvencyId);

	/**
	 * Removes the osi insolvency application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application that was removed
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public OsiInsolvencyApplication remove(long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationException;

	public OsiInsolvencyApplication updateImpl(
		OsiInsolvencyApplication osiInsolvencyApplication);

	/**
	 * Returns the osi insolvency application with the primary key or throws a <code>NoSuchOsiInsolvencyApplicationException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application
	 * @throws NoSuchOsiInsolvencyApplicationException if a osi insolvency application with the primary key could not be found
	 */
	public OsiInsolvencyApplication findByPrimaryKey(long osiInsolvencyId)
		throws NoSuchOsiInsolvencyApplicationException;

	/**
	 * Returns the osi insolvency application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the primary key of the osi insolvency application
	 * @return the osi insolvency application, or <code>null</code> if a osi insolvency application with the primary key could not be found
	 */
	public OsiInsolvencyApplication fetchByPrimaryKey(long osiInsolvencyId);

	/**
	 * Returns all the osi insolvency applications.
	 *
	 * @return the osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication> findAll();

	/**
	 * Returns a range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @return the range of osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the osi insolvency applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency applications
	 * @param end the upper bound of the range of osi insolvency applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency applications
	 */
	public java.util.List<OsiInsolvencyApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<OsiInsolvencyApplication> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi insolvency applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi insolvency applications.
	 *
	 * @return the number of osi insolvency applications
	 */
	public int countAll();

}