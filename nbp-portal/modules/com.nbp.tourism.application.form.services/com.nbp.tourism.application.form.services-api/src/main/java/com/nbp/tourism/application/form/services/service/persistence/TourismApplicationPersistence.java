/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.tourism.application.form.services.exception.NoSuchTourismApplicationException;
import com.nbp.tourism.application.form.services.model.TourismApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the tourism application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismApplicationUtil
 * @generated
 */
@ProviderType
public interface TourismApplicationPersistence
	extends BasePersistence<TourismApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TourismApplicationUtil} to access the tourism application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the tourism application where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public TourismApplication findBygetTourismById(long tourismApplicationId)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the tourism application where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismById(long tourismApplicationId);

	/**
	 * Returns the tourism application where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache);

	/**
	 * Removes the tourism application where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application that was removed
	 */
	public TourismApplication removeBygetTourismById(long tourismApplicationId)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the number of tourism applications where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism applications
	 */
	public int countBygetTourismById(long tourismApplicationId);

	/**
	 * Returns all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching tourism applications
	 */
	public java.util.List<TourismApplication>
		findBygetTourismApplicationByStatusUser(int status, long userId);

	/**
	 * Returns a range of all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of matching tourism applications
	 */
	public java.util.List<TourismApplication>
		findBygetTourismApplicationByStatusUser(
			int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism applications
	 */
	public java.util.List<TourismApplication>
		findBygetTourismApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
				orderByComparator);

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism applications
	 */
	public java.util.List<TourismApplication>
		findBygetTourismApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
				orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public TourismApplication findBygetTourismApplicationByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
				orderByComparator)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the first tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismApplicationByStatusUser_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
			orderByComparator);

	/**
	 * Returns the last tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public TourismApplication findBygetTourismApplicationByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
				orderByComparator)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the last tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismApplicationByStatusUser_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
			orderByComparator);

	/**
	 * Returns the tourism applications before and after the current tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param tourismApplicationId the primary key of the current tourism application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	public TourismApplication[]
			findBygetTourismApplicationByStatusUser_PrevAndNext(
				long tourismApplicationId, int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<TourismApplication> orderByComparator)
		throws NoSuchTourismApplicationException;

	/**
	 * Removes all the tourism applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetTourismApplicationByStatusUser(
		int status, long userId);

	/**
	 * Returns the number of tourism applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching tourism applications
	 */
	public int countBygetTourismApplicationByStatusUser(
		int status, long userId);

	/**
	 * Returns all the tourism applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching tourism applications
	 */
	public java.util.List<TourismApplication> findBygetTourismByStatus(
		int status);

	/**
	 * Returns a range of all the tourism applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of matching tourism applications
	 */
	public java.util.List<TourismApplication> findBygetTourismByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism applications
	 */
	public java.util.List<TourismApplication> findBygetTourismByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism applications
	 */
	public java.util.List<TourismApplication> findBygetTourismByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public TourismApplication findBygetTourismByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
				orderByComparator)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the first tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
			orderByComparator);

	/**
	 * Returns the last tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public TourismApplication findBygetTourismByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
				orderByComparator)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the last tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
			orderByComparator);

	/**
	 * Returns the tourism applications before and after the current tourism application in the ordered set where status = &#63;.
	 *
	 * @param tourismApplicationId the primary key of the current tourism application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	public TourismApplication[] findBygetTourismByStatus_PrevAndNext(
			long tourismApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
				orderByComparator)
		throws NoSuchTourismApplicationException;

	/**
	 * Removes all the tourism applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetTourismByStatus(int status);

	/**
	 * Returns the number of tourism applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching tourism applications
	 */
	public int countBygetTourismByStatus(int status);

	/**
	 * Returns the tourism application where applicationNumber = &#63; or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public TourismApplication findBygetTourismByAppNo(String applicationNumber)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the tourism application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismByAppNo(
		String applicationNumber);

	/**
	 * Returns the tourism application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismByAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the tourism application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the tourism application that was removed
	 */
	public TourismApplication removeBygetTourismByAppNo(
			String applicationNumber)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the number of tourism applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching tourism applications
	 */
	public int countBygetTourismByAppNo(String applicationNumber);

	/**
	 * Returns the tourism application where caseId = &#63; or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	public TourismApplication findBygetTourismByCaseId(String caseId)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the tourism application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismByCaseId(String caseId);

	/**
	 * Returns the tourism application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	public TourismApplication fetchBygetTourismByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the tourism application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the tourism application that was removed
	 */
	public TourismApplication removeBygetTourismByCaseId(String caseId)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the number of tourism applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism applications
	 */
	public int countBygetTourismByCaseId(String caseId);

	/**
	 * Caches the tourism application in the entity cache if it is enabled.
	 *
	 * @param tourismApplication the tourism application
	 */
	public void cacheResult(TourismApplication tourismApplication);

	/**
	 * Caches the tourism applications in the entity cache if it is enabled.
	 *
	 * @param tourismApplications the tourism applications
	 */
	public void cacheResult(
		java.util.List<TourismApplication> tourismApplications);

	/**
	 * Creates a new tourism application with the primary key. Does not add the tourism application to the database.
	 *
	 * @param tourismApplicationId the primary key for the new tourism application
	 * @return the new tourism application
	 */
	public TourismApplication create(long tourismApplicationId);

	/**
	 * Removes the tourism application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application that was removed
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	public TourismApplication remove(long tourismApplicationId)
		throws NoSuchTourismApplicationException;

	public TourismApplication updateImpl(TourismApplication tourismApplication);

	/**
	 * Returns the tourism application with the primary key or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	public TourismApplication findByPrimaryKey(long tourismApplicationId)
		throws NoSuchTourismApplicationException;

	/**
	 * Returns the tourism application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application, or <code>null</code> if a tourism application with the primary key could not be found
	 */
	public TourismApplication fetchByPrimaryKey(long tourismApplicationId);

	/**
	 * Returns all the tourism applications.
	 *
	 * @return the tourism applications
	 */
	public java.util.List<TourismApplication> findAll();

	/**
	 * Returns a range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of tourism applications
	 */
	public java.util.List<TourismApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism applications
	 */
	public java.util.List<TourismApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism applications
	 */
	public java.util.List<TourismApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TourismApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the tourism applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of tourism applications.
	 *
	 * @return the number of tourism applications
	 */
	public int countAll();

}