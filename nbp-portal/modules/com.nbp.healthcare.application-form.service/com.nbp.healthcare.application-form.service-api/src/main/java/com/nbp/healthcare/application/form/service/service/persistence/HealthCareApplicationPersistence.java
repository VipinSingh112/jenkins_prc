/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareApplicationException;
import com.nbp.healthcare.application.form.service.model.HealthCareApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the health care application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareApplicationUtil
 * @generated
 */
@ProviderType
public interface HealthCareApplicationPersistence
	extends BasePersistence<HealthCareApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HealthCareApplicationUtil} to access the health care application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the health care application where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public HealthCareApplication findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the health care application where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareById(
		long healthCareApplicationId);

	/**
	 * Returns the health care application where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache);

	/**
	 * Removes the health care application where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care application that was removed
	 */
	public HealthCareApplication removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the number of health care applications where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care applications
	 */
	public int countBygetHealthCareById(long healthCareApplicationId);

	/**
	 * Returns all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching health care applications
	 */
	public java.util.List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId);

	/**
	 * Returns a range of all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of matching health care applications
	 */
	public java.util.List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health care applications
	 */
	public java.util.List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health care applications
	 */
	public java.util.List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public HealthCareApplication findBygetHealthCareByS_U_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the first health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareByS_U_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator);

	/**
	 * Returns the last health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public HealthCareApplication findBygetHealthCareByS_U_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the last health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareByS_U_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator);

	/**
	 * Returns the health care applications before and after the current health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param healthCareApplicationId the primary key of the current health care application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	public HealthCareApplication[] findBygetHealthCareByS_U_PrevAndNext(
			long healthCareApplicationId, int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Removes all the health care applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetHealthCareByS_U(int status, long userId);

	/**
	 * Returns the number of health care applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching health care applications
	 */
	public int countBygetHealthCareByS_U(int status, long userId);

	/**
	 * Returns the health care application where applicationNumber = &#63; or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public HealthCareApplication findBygetHealthCareByAppNo(
			String applicationNumber)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the health care application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareByAppNo(
		String applicationNumber);

	/**
	 * Returns the health care application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the health care application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the health care application that was removed
	 */
	public HealthCareApplication removeBygetHealthCareByAppNo(
			String applicationNumber)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the number of health care applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching health care applications
	 */
	public int countBygetHealthCareByAppNo(String applicationNumber);

	/**
	 * Returns all the health care applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching health care applications
	 */
	public java.util.List<HealthCareApplication> findBygetHealthCareByStatus(
		int status);

	/**
	 * Returns a range of all the health care applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of matching health care applications
	 */
	public java.util.List<HealthCareApplication> findBygetHealthCareByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the health care applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health care applications
	 */
	public java.util.List<HealthCareApplication> findBygetHealthCareByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the health care applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health care applications
	 */
	public java.util.List<HealthCareApplication> findBygetHealthCareByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public HealthCareApplication findBygetHealthCareByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the first health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator);

	/**
	 * Returns the last health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public HealthCareApplication findBygetHealthCareByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the last health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator);

	/**
	 * Returns the health care applications before and after the current health care application in the ordered set where status = &#63;.
	 *
	 * @param healthCareApplicationId the primary key of the current health care application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	public HealthCareApplication[] findBygetHealthCareByStatus_PrevAndNext(
			long healthCareApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator
				<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Removes all the health care applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetHealthCareByStatus(int status);

	/**
	 * Returns the number of health care applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching health care applications
	 */
	public int countBygetHealthCareByStatus(int status);

	/**
	 * Returns the health care application where caseId = &#63; or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	public HealthCareApplication findBygetHealthCareByCaseId(String caseId)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the health care application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareByCaseId(String caseId);

	/**
	 * Returns the health care application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	public HealthCareApplication fetchBygetHealthCareByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the health care application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the health care application that was removed
	 */
	public HealthCareApplication removeBygetHealthCareByCaseId(String caseId)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the number of health care applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health care applications
	 */
	public int countBygetHealthCareByCaseId(String caseId);

	/**
	 * Caches the health care application in the entity cache if it is enabled.
	 *
	 * @param healthCareApplication the health care application
	 */
	public void cacheResult(HealthCareApplication healthCareApplication);

	/**
	 * Caches the health care applications in the entity cache if it is enabled.
	 *
	 * @param healthCareApplications the health care applications
	 */
	public void cacheResult(
		java.util.List<HealthCareApplication> healthCareApplications);

	/**
	 * Creates a new health care application with the primary key. Does not add the health care application to the database.
	 *
	 * @param healthCareApplicationId the primary key for the new health care application
	 * @return the new health care application
	 */
	public HealthCareApplication create(long healthCareApplicationId);

	/**
	 * Removes the health care application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application that was removed
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	public HealthCareApplication remove(long healthCareApplicationId)
		throws NoSuchHealthCareApplicationException;

	public HealthCareApplication updateImpl(
		HealthCareApplication healthCareApplication);

	/**
	 * Returns the health care application with the primary key or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	public HealthCareApplication findByPrimaryKey(long healthCareApplicationId)
		throws NoSuchHealthCareApplicationException;

	/**
	 * Returns the health care application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application, or <code>null</code> if a health care application with the primary key could not be found
	 */
	public HealthCareApplication fetchByPrimaryKey(
		long healthCareApplicationId);

	/**
	 * Returns all the health care applications.
	 *
	 * @return the health care applications
	 */
	public java.util.List<HealthCareApplication> findAll();

	/**
	 * Returns a range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of health care applications
	 */
	public java.util.List<HealthCareApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care applications
	 */
	public java.util.List<HealthCareApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care applications
	 */
	public java.util.List<HealthCareApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<HealthCareApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the health care applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of health care applications.
	 *
	 * @return the number of health care applications
	 */
	public int countAll();

}