/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaApplicationException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the pharma application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationUtil
 * @generated
 */
@ProviderType
public interface PharmaApplicationPersistence
	extends BasePersistence<PharmaApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PharmaApplicationUtil} to access the pharma application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the pharma application where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public PharmaApplication findBygetPharmaByAppId(long pharmaApplicationId)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the pharma application where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByAppId(long pharmaApplicationId);

	/**
	 * Returns the pharma application where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache);

	/**
	 * Removes the pharma application where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application that was removed
	 */
	public PharmaApplication removeBygetPharmaByAppId(long pharmaApplicationId)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the number of pharma applications where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma applications
	 */
	public int countBygetPharmaByAppId(long pharmaApplicationId);

	/**
	 * Returns all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching pharma applications
	 */
	public java.util.List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId);

	/**
	 * Returns a range of all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of matching pharma applications
	 */
	public java.util.List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma applications
	 */
	public java.util.List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma applications
	 */
	public java.util.List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public PharmaApplication findBygetPharmaByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
				orderByComparator)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the first pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByStatusUser_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator);

	/**
	 * Returns the last pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public PharmaApplication findBygetPharmaByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
				orderByComparator)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the last pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByStatusUser_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator);

	/**
	 * Returns the pharma applications before and after the current pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param pharmaApplicationId the primary key of the current pharma application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	public PharmaApplication[] findBygetPharmaByStatusUser_PrevAndNext(
			long pharmaApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
				orderByComparator)
		throws NoSuchPharmaApplicationException;

	/**
	 * Removes all the pharma applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetPharmaByStatusUser(int status, long userId);

	/**
	 * Returns the number of pharma applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching pharma applications
	 */
	public int countBygetPharmaByStatusUser(int status, long userId);

	/**
	 * Returns all the pharma applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching pharma applications
	 */
	public java.util.List<PharmaApplication> findBygetPharmaByStatus(
		int status);

	/**
	 * Returns a range of all the pharma applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of matching pharma applications
	 */
	public java.util.List<PharmaApplication> findBygetPharmaByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma applications
	 */
	public java.util.List<PharmaApplication> findBygetPharmaByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma applications
	 */
	public java.util.List<PharmaApplication> findBygetPharmaByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public PharmaApplication findBygetPharmaByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
				orderByComparator)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the first pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator);

	/**
	 * Returns the last pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public PharmaApplication findBygetPharmaByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
				orderByComparator)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the last pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator);

	/**
	 * Returns the pharma applications before and after the current pharma application in the ordered set where status = &#63;.
	 *
	 * @param pharmaApplicationId the primary key of the current pharma application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	public PharmaApplication[] findBygetPharmaByStatus_PrevAndNext(
			long pharmaApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
				orderByComparator)
		throws NoSuchPharmaApplicationException;

	/**
	 * Removes all the pharma applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetPharmaByStatus(int status);

	/**
	 * Returns the number of pharma applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching pharma applications
	 */
	public int countBygetPharmaByStatus(int status);

	/**
	 * Returns the pharma application where applicationNumber = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public PharmaApplication findBygetPharmaByAppNum(String applicationNumber)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the pharma application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByAppNum(String applicationNumber);

	/**
	 * Returns the pharma application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByAppNum(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the pharma application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the pharma application that was removed
	 */
	public PharmaApplication removeBygetPharmaByAppNum(String applicationNumber)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the number of pharma applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching pharma applications
	 */
	public int countBygetPharmaByAppNum(String applicationNumber);

	/**
	 * Returns the pharma application where caseld = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param caseld the caseld
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public PharmaApplication findBypharmaApplicationByCaseId(String caseld)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the pharma application where caseld = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseld the caseld
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBypharmaApplicationByCaseId(String caseld);

	/**
	 * Returns the pharma application where caseld = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseld the caseld
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBypharmaApplicationByCaseId(
		String caseld, boolean useFinderCache);

	/**
	 * Removes the pharma application where caseld = &#63; from the database.
	 *
	 * @param caseld the caseld
	 * @return the pharma application that was removed
	 */
	public PharmaApplication removeBypharmaApplicationByCaseId(String caseld)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the number of pharma applications where caseld = &#63;.
	 *
	 * @param caseld the caseld
	 * @return the number of matching pharma applications
	 */
	public int countBypharmaApplicationByCaseId(String caseld);

	/**
	 * Returns the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	public PharmaApplication findBygetPharmaByAT_AppNo(
			String requesttype, String expiredLicenseAppNumber)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByAT_AppNo(
		String requesttype, String expiredLicenseAppNumber);

	/**
	 * Returns the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	public PharmaApplication fetchBygetPharmaByAT_AppNo(
		String requesttype, String expiredLicenseAppNumber,
		boolean useFinderCache);

	/**
	 * Removes the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the pharma application that was removed
	 */
	public PharmaApplication removeBygetPharmaByAT_AppNo(
			String requesttype, String expiredLicenseAppNumber)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the number of pharma applications where requesttype = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching pharma applications
	 */
	public int countBygetPharmaByAT_AppNo(
		String requesttype, String expiredLicenseAppNumber);

	/**
	 * Caches the pharma application in the entity cache if it is enabled.
	 *
	 * @param pharmaApplication the pharma application
	 */
	public void cacheResult(PharmaApplication pharmaApplication);

	/**
	 * Caches the pharma applications in the entity cache if it is enabled.
	 *
	 * @param pharmaApplications the pharma applications
	 */
	public void cacheResult(
		java.util.List<PharmaApplication> pharmaApplications);

	/**
	 * Creates a new pharma application with the primary key. Does not add the pharma application to the database.
	 *
	 * @param pharmaApplicationId the primary key for the new pharma application
	 * @return the new pharma application
	 */
	public PharmaApplication create(long pharmaApplicationId);

	/**
	 * Removes the pharma application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application that was removed
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	public PharmaApplication remove(long pharmaApplicationId)
		throws NoSuchPharmaApplicationException;

	public PharmaApplication updateImpl(PharmaApplication pharmaApplication);

	/**
	 * Returns the pharma application with the primary key or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	public PharmaApplication findByPrimaryKey(long pharmaApplicationId)
		throws NoSuchPharmaApplicationException;

	/**
	 * Returns the pharma application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application, or <code>null</code> if a pharma application with the primary key could not be found
	 */
	public PharmaApplication fetchByPrimaryKey(long pharmaApplicationId);

	/**
	 * Returns all the pharma applications.
	 *
	 * @return the pharma applications
	 */
	public java.util.List<PharmaApplication> findAll();

	/**
	 * Returns a range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of pharma applications
	 */
	public java.util.List<PharmaApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma applications
	 */
	public java.util.List<PharmaApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma applications
	 */
	public java.util.List<PharmaApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PharmaApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the pharma applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of pharma applications.
	 *
	 * @return the number of pharma applications
	 */
	public int countAll();

}