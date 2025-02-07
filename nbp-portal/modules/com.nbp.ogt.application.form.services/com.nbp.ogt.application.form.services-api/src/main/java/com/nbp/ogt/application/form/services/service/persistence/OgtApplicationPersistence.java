/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.ogt.application.form.services.exception.NoSuchOgtApplicationException;
import com.nbp.ogt.application.form.services.model.OgtApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the ogt application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationUtil
 * @generated
 */
@ProviderType
public interface OgtApplicationPersistence
	extends BasePersistence<OgtApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OgtApplicationUtil} to access the ogt application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByS_U(
		long userId, int status);

	/**
	 * Returns a range of all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByS_U(
		long userId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByS_U(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByS_U_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the first ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByS_U_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns the last ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByS_U_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the last ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByS_U_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public OgtApplication[] findBygetOgtByS_U_PrevAndNext(
			long ogtApplicationId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Removes all the ogt applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeBygetOgtByS_U(long userId, int status);

	/**
	 * Returns the number of ogt applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching ogt applications
	 */
	public int countBygetOgtByS_U(long userId, int status);

	/**
	 * Returns all the ogt applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByStatus(int status);

	/**
	 * Returns a range of all the ogt applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the ogt applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the first ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns the last ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the last ogt application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where status = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public OgtApplication[] findBygetOgtByStatus_PrevAndNext(
			long ogtApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Removes all the ogt applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetOgtByStatus(int status);

	/**
	 * Returns the number of ogt applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ogt applications
	 */
	public int countBygetOgtByStatus(int status);

	/**
	 * Returns the ogt application where applicationNumber = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByAppNum(String applicationNumber)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the ogt application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByAppNum(String applicationNumber);

	/**
	 * Returns the ogt application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByAppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the ogt application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the ogt application that was removed
	 */
	public OgtApplication removeBygetOgtByAppNum(String applicationNumber)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the number of ogt applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ogt applications
	 */
	public int countBygetOgtByAppNum(String applicationNumber);

	/**
	 * Returns the ogt application where caseId = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByCaseId(String caseId)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the ogt application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByCaseId(String caseId);

	/**
	 * Returns the ogt application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the ogt application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ogt application that was removed
	 */
	public OgtApplication removeBygetOgtByCaseId(String caseId)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the number of ogt applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ogt applications
	 */
	public int countBygetOgtByCaseId(String caseId);

	/**
	 * Returns all the ogt applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByEntityId(
		String entityId);

	/**
	 * Returns a range of all the ogt applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByEntityId(
		String entityId, int start, int end);

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByEntityId(
		String entityId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByEntityId_First(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByEntityId_First(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByEntityId_Last(
			String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByEntityId_Last(
		String entityId,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where entityId = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public OgtApplication[] findBygetOgtByEntityId_PrevAndNext(
			long ogtApplicationId, String entityId,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Removes all the ogt applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	public void removeBygetOgtByEntityId(String entityId);

	/**
	 * Returns the number of ogt applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching ogt applications
	 */
	public int countBygetOgtByEntityId(String entityId);

	/**
	 * Returns all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status);

	/**
	 * Returns a range of all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status, int start, int end);

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ogt applications
	 */
	public java.util.List<OgtApplication> findBygetOgtByEntityId_Status(
		String entityId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByEntityId_Status_First(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the first ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByEntityId_Status_First(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByEntityId_Status_Last(
			String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the last ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByEntityId_Status_Last(
		String entityId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns the ogt applications before and after the current ogt application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param ogtApplicationId the primary key of the current ogt application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public OgtApplication[] findBygetOgtByEntityId_Status_PrevAndNext(
			long ogtApplicationId, String entityId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
				orderByComparator)
		throws NoSuchOgtApplicationException;

	/**
	 * Removes all the ogt applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	public void removeBygetOgtByEntityId_Status(String entityId, int status);

	/**
	 * Returns the number of ogt applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching ogt applications
	 */
	public int countBygetOgtByEntityId_Status(String entityId, int status);

	/**
	 * Returns the ogt application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByEI_CI(String entityId, String caseId)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the ogt application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByEI_CI(String entityId, String caseId);

	/**
	 * Returns the ogt application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByEI_CI(
		String entityId, String caseId, boolean useFinderCache);

	/**
	 * Removes the ogt application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the ogt application that was removed
	 */
	public OgtApplication removeBygetOgtByEI_CI(String entityId, String caseId)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the number of ogt applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching ogt applications
	 */
	public int countBygetOgtByEI_CI(String entityId, String caseId);

	/**
	 * Returns the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ogt application
	 * @throws NoSuchOgtApplicationException if a matching ogt application could not be found
	 */
	public OgtApplication findBygetOgtByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber);

	/**
	 * Returns the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ogt application, or <code>null</code> if a matching ogt application could not be found
	 */
	public OgtApplication fetchBygetOgtByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the ogt application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the ogt application that was removed
	 */
	public OgtApplication removeBygetOgtByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the number of ogt applications where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching ogt applications
	 */
	public int countBygetOgtByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber);

	/**
	 * Caches the ogt application in the entity cache if it is enabled.
	 *
	 * @param ogtApplication the ogt application
	 */
	public void cacheResult(OgtApplication ogtApplication);

	/**
	 * Caches the ogt applications in the entity cache if it is enabled.
	 *
	 * @param ogtApplications the ogt applications
	 */
	public void cacheResult(java.util.List<OgtApplication> ogtApplications);

	/**
	 * Creates a new ogt application with the primary key. Does not add the ogt application to the database.
	 *
	 * @param ogtApplicationId the primary key for the new ogt application
	 * @return the new ogt application
	 */
	public OgtApplication create(long ogtApplicationId);

	/**
	 * Removes the ogt application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application that was removed
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public OgtApplication remove(long ogtApplicationId)
		throws NoSuchOgtApplicationException;

	public OgtApplication updateImpl(OgtApplication ogtApplication);

	/**
	 * Returns the ogt application with the primary key or throws a <code>NoSuchOgtApplicationException</code> if it could not be found.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application
	 * @throws NoSuchOgtApplicationException if a ogt application with the primary key could not be found
	 */
	public OgtApplication findByPrimaryKey(long ogtApplicationId)
		throws NoSuchOgtApplicationException;

	/**
	 * Returns the ogt application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application, or <code>null</code> if a ogt application with the primary key could not be found
	 */
	public OgtApplication fetchByPrimaryKey(long ogtApplicationId);

	/**
	 * Returns all the ogt applications.
	 *
	 * @return the ogt applications
	 */
	public java.util.List<OgtApplication> findAll();

	/**
	 * Returns a range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of ogt applications
	 */
	public java.util.List<OgtApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ogt applications
	 */
	public java.util.List<OgtApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ogt applications
	 */
	public java.util.List<OgtApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OgtApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the ogt applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of ogt applications.
	 *
	 * @return the number of ogt applications
	 */
	public int countAll();

}