/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence;

import com.agriculture.application.form.service.exception.NoSuchAgricultureApplicationException;
import com.agriculture.application.form.service.model.AgricultureApplication;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureApplicationUtil
 * @generated
 */
@ProviderType
public interface AgricultureApplicationPersistence
	extends BasePersistence<AgricultureApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgricultureApplicationUtil} to access the agriculture application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture application where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public AgricultureApplication findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the agriculture application where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgricultureById(
		long agricultureApplicationId);

	/**
	 * Returns the agriculture application where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache);

	/**
	 * Removes the agriculture application where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture application that was removed
	 */
	public AgricultureApplication removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the number of agriculture applications where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture applications
	 */
	public int countBygetAgricultureById(long agricultureApplicationId);

	/**
	 * Returns all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching agriculture applications
	 */
	public java.util.List<AgricultureApplication>
		findBygetAgriApplicationByStatusUser(int status, long userId);

	/**
	 * Returns a range of all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of matching agriculture applications
	 */
	public java.util.List<AgricultureApplication>
		findBygetAgriApplicationByStatusUser(
			int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture applications
	 */
	public java.util.List<AgricultureApplication>
		findBygetAgriApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplication> orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture applications
	 */
	public java.util.List<AgricultureApplication>
		findBygetAgriApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplication> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public AgricultureApplication findBygetAgriApplicationByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgriApplicationByStatusUser_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApplication>
			orderByComparator);

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public AgricultureApplication findBygetAgriApplicationByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgriApplicationByStatusUser_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApplication>
			orderByComparator);

	/**
	 * Returns the agriculture applications before and after the current agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param agricultureApplicationId the primary key of the current agriculture application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	public AgricultureApplication[]
			findBygetAgriApplicationByStatusUser_PrevAndNext(
				long agricultureApplicationId, int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Removes all the agriculture applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetAgriApplicationByStatusUser(int status, long userId);

	/**
	 * Returns the number of agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching agriculture applications
	 */
	public int countBygetAgriApplicationByStatusUser(int status, long userId);

	/**
	 * Returns the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public AgricultureApplication findBygetAgriApplicationByRT_AppNo(
			String expiredLicenseAppNo, String requestType)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgriApplicationByRT_AppNo(
		String expiredLicenseAppNo, String requestType);

	/**
	 * Returns the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgriApplicationByRT_AppNo(
		String expiredLicenseAppNo, String requestType, boolean useFinderCache);

	/**
	 * Removes the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; from the database.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the agriculture application that was removed
	 */
	public AgricultureApplication removeBygetAgriApplicationByRT_AppNo(
			String expiredLicenseAppNo, String requestType)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the number of agriculture applications where expiredLicenseAppNo = &#63; and requestType = &#63;.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the number of matching agriculture applications
	 */
	public int countBygetAgriApplicationByRT_AppNo(
		String expiredLicenseAppNo, String requestType);

	/**
	 * Returns all the agriculture applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching agriculture applications
	 */
	public java.util.List<AgricultureApplication> findBygetAgricultureByStatus(
		int status);

	/**
	 * Returns a range of all the agriculture applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of matching agriculture applications
	 */
	public java.util.List<AgricultureApplication> findBygetAgricultureByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture applications
	 */
	public java.util.List<AgricultureApplication> findBygetAgricultureByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture applications
	 */
	public java.util.List<AgricultureApplication> findBygetAgricultureByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public AgricultureApplication findBygetAgricultureByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgricultureByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApplication>
			orderByComparator);

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public AgricultureApplication findBygetAgricultureByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgricultureByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApplication>
			orderByComparator);

	/**
	 * Returns the agriculture applications before and after the current agriculture application in the ordered set where status = &#63;.
	 *
	 * @param agricultureApplicationId the primary key of the current agriculture application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	public AgricultureApplication[] findBygetAgricultureByStatus_PrevAndNext(
			long agricultureApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Removes all the agriculture applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetAgricultureByStatus(int status);

	/**
	 * Returns the number of agriculture applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching agriculture applications
	 */
	public int countBygetAgricultureByStatus(int status);

	/**
	 * Returns the agriculture application where applicationNumber = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public AgricultureApplication findBygetAgricultureByAppNo(
			String applicationNumber)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the agriculture application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgricultureByAppNo(
		String applicationNumber);

	/**
	 * Returns the agriculture application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgricultureByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the agriculture application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the agriculture application that was removed
	 */
	public AgricultureApplication removeBygetAgricultureByAppNo(
			String applicationNumber)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the number of agriculture applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching agriculture applications
	 */
	public int countBygetAgricultureByAppNo(String applicationNumber);

	/**
	 * Returns the agriculture application where caseId = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	public AgricultureApplication findBygetAgricultureBy_CI(String caseId)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the agriculture application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgricultureBy_CI(String caseId);

	/**
	 * Returns the agriculture application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	public AgricultureApplication fetchBygetAgricultureBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the agriculture application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the agriculture application that was removed
	 */
	public AgricultureApplication removeBygetAgricultureBy_CI(String caseId)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the number of agriculture applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture applications
	 */
	public int countBygetAgricultureBy_CI(String caseId);

	/**
	 * Caches the agriculture application in the entity cache if it is enabled.
	 *
	 * @param agricultureApplication the agriculture application
	 */
	public void cacheResult(AgricultureApplication agricultureApplication);

	/**
	 * Caches the agriculture applications in the entity cache if it is enabled.
	 *
	 * @param agricultureApplications the agriculture applications
	 */
	public void cacheResult(
		java.util.List<AgricultureApplication> agricultureApplications);

	/**
	 * Creates a new agriculture application with the primary key. Does not add the agriculture application to the database.
	 *
	 * @param agricultureApplicationId the primary key for the new agriculture application
	 * @return the new agriculture application
	 */
	public AgricultureApplication create(long agricultureApplicationId);

	/**
	 * Removes the agriculture application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application that was removed
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	public AgricultureApplication remove(long agricultureApplicationId)
		throws NoSuchAgricultureApplicationException;

	public AgricultureApplication updateImpl(
		AgricultureApplication agricultureApplication);

	/**
	 * Returns the agriculture application with the primary key or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	public AgricultureApplication findByPrimaryKey(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationException;

	/**
	 * Returns the agriculture application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application, or <code>null</code> if a agriculture application with the primary key could not be found
	 */
	public AgricultureApplication fetchByPrimaryKey(
		long agricultureApplicationId);

	/**
	 * Returns all the agriculture applications.
	 *
	 * @return the agriculture applications
	 */
	public java.util.List<AgricultureApplication> findAll();

	/**
	 * Returns a range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of agriculture applications
	 */
	public java.util.List<AgricultureApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture applications
	 */
	public java.util.List<AgricultureApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture applications
	 */
	public java.util.List<AgricultureApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgricultureApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture applications.
	 *
	 * @return the number of agriculture applications
	 */
	public int countAll();

}