/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.farm.application.form.service.exception.NoSuchFarmerApplicationException;
import com.nbp.farm.application.form.service.model.FarmerApplication;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the farmer application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FarmerApplicationUtil
 * @generated
 */
@ProviderType
public interface FarmerApplicationPersistence
	extends BasePersistence<FarmerApplication> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FarmerApplicationUtil} to access the farmer application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the farmer application where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findBygetFarmerById(long farmerApplicationId)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the farmer application where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer application where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerById(
		long farmerApplicationId, boolean useFinderCache);

	/**
	 * Removes the farmer application where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer application that was removed
	 */
	public FarmerApplication removeBygetFarmerById(long farmerApplicationId)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the number of farmer applications where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer applications
	 */
	public int countBygetFarmerById(long farmerApplicationId);

	/**
	 * Returns the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findBygetFarmerByRT_AppNo(
			String expiredLicenseappNumber, String requestType)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerByRT_AppNo(
		String expiredLicenseappNumber, String requestType);

	/**
	 * Returns the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerByRT_AppNo(
		String expiredLicenseappNumber, String requestType,
		boolean useFinderCache);

	/**
	 * Removes the farmer application where expiredLicenseappNumber = &#63; and requestType = &#63; from the database.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the farmer application that was removed
	 */
	public FarmerApplication removeBygetFarmerByRT_AppNo(
			String expiredLicenseappNumber, String requestType)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the number of farmer applications where expiredLicenseappNumber = &#63; and requestType = &#63;.
	 *
	 * @param expiredLicenseappNumber the expired licenseapp number
	 * @param requestType the request type
	 * @return the number of matching farmer applications
	 */
	public int countBygetFarmerByRT_AppNo(
		String expiredLicenseappNumber, String requestType);

	/**
	 * Returns all the farmer applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching farmer applications
	 */
	public java.util.List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status);

	/**
	 * Returns a range of all the farmer applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of matching farmer applications
	 */
	public java.util.List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status, int start, int end);

	/**
	 * Returns an ordered range of all the farmer applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer applications
	 */
	public java.util.List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer applications
	 */
	public java.util.List<FarmerApplication> findBygetFarmerApplicationByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findBygetFarmerApplicationByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the first farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerApplicationByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator);

	/**
	 * Returns the last farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findBygetFarmerApplicationByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the last farmer application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerApplicationByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator);

	/**
	 * Returns the farmer applications before and after the current farmer application in the ordered set where status = &#63;.
	 *
	 * @param farmerApplicationId the primary key of the current farmer application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	public FarmerApplication[] findBygetFarmerApplicationByStatus_PrevAndNext(
			long farmerApplicationId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator)
		throws NoSuchFarmerApplicationException;

	/**
	 * Removes all the farmer applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeBygetFarmerApplicationByStatus(int status);

	/**
	 * Returns the number of farmer applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching farmer applications
	 */
	public int countBygetFarmerApplicationByStatus(int status);

	/**
	 * Returns all the farmer applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching farmer applications
	 */
	public java.util.List<FarmerApplication>
		findBygetFarmerApplicationByStatusUser(int status, long userId);

	/**
	 * Returns a range of all the farmer applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of matching farmer applications
	 */
	public java.util.List<FarmerApplication>
		findBygetFarmerApplicationByStatusUser(
			int status, long userId, int start, int end);

	/**
	 * Returns an ordered range of all the farmer applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer applications
	 */
	public java.util.List<FarmerApplication>
		findBygetFarmerApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator);

	/**
	 * Returns an ordered range of all the farmer applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer applications
	 */
	public java.util.List<FarmerApplication>
		findBygetFarmerApplicationByStatusUser(
			int status, long userId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findBygetFarmerApplicationByStatusUser_First(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the first farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerApplicationByStatusUser_First(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator);

	/**
	 * Returns the last farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findBygetFarmerApplicationByStatusUser_Last(
			int status, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the last farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerApplicationByStatusUser_Last(
		int status, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator);

	/**
	 * Returns the farmer applications before and after the current farmer application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param farmerApplicationId the primary key of the current farmer application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	public FarmerApplication[]
			findBygetFarmerApplicationByStatusUser_PrevAndNext(
				long farmerApplicationId, int status, long userId,
				com.liferay.portal.kernel.util.OrderByComparator
					<FarmerApplication> orderByComparator)
		throws NoSuchFarmerApplicationException;

	/**
	 * Removes all the farmer applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	public void removeBygetFarmerApplicationByStatusUser(
		int status, long userId);

	/**
	 * Returns the number of farmer applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching farmer applications
	 */
	public int countBygetFarmerApplicationByStatusUser(int status, long userId);

	/**
	 * Returns all the farmer applications where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching farmer applications
	 */
	public java.util.List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId);

	/**
	 * Returns a range of all the farmer applications where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of matching farmer applications
	 */
	public java.util.List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId, int start, int end);

	/**
	 * Returns an ordered range of all the farmer applications where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer applications
	 */
	public java.util.List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer applications where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer applications
	 */
	public java.util.List<FarmerApplication> findBygetFarmerApplicationByUser(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findBygetFarmerApplicationByUser_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the first farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerApplicationByUser_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator);

	/**
	 * Returns the last farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findBygetFarmerApplicationByUser_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the last farmer application in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerApplicationByUser_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator);

	/**
	 * Returns the farmer applications before and after the current farmer application in the ordered set where userId = &#63;.
	 *
	 * @param farmerApplicationId the primary key of the current farmer application
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	public FarmerApplication[] findBygetFarmerApplicationByUser_PrevAndNext(
			long farmerApplicationId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
				orderByComparator)
		throws NoSuchFarmerApplicationException;

	/**
	 * Removes all the farmer applications where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeBygetFarmerApplicationByUser(long userId);

	/**
	 * Returns the number of farmer applications where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching farmer applications
	 */
	public int countBygetFarmerApplicationByUser(long userId);

	/**
	 * Returns the farmer application where applicationNumber = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findBygetFarmerApplicationAppNo(
			String applicationNumber)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the farmer application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerApplicationAppNo(
		String applicationNumber);

	/**
	 * Returns the farmer application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchBygetFarmerApplicationAppNo(
		String applicationNumber, boolean useFinderCache);

	/**
	 * Removes the farmer application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the farmer application that was removed
	 */
	public FarmerApplication removeBygetFarmerApplicationAppNo(
			String applicationNumber)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the number of farmer applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching farmer applications
	 */
	public int countBygetFarmerApplicationAppNo(String applicationNumber);

	/**
	 * Returns the farmer application where caseld = &#63; or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param caseld the caseld
	 * @return the matching farmer application
	 * @throws NoSuchFarmerApplicationException if a matching farmer application could not be found
	 */
	public FarmerApplication findByfarmerApplicationByCaseId(String caseld)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the farmer application where caseld = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseld the caseld
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchByfarmerApplicationByCaseId(String caseld);

	/**
	 * Returns the farmer application where caseld = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseld the caseld
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application, or <code>null</code> if a matching farmer application could not be found
	 */
	public FarmerApplication fetchByfarmerApplicationByCaseId(
		String caseld, boolean useFinderCache);

	/**
	 * Removes the farmer application where caseld = &#63; from the database.
	 *
	 * @param caseld the caseld
	 * @return the farmer application that was removed
	 */
	public FarmerApplication removeByfarmerApplicationByCaseId(String caseld)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the number of farmer applications where caseld = &#63;.
	 *
	 * @param caseld the caseld
	 * @return the number of matching farmer applications
	 */
	public int countByfarmerApplicationByCaseId(String caseld);

	/**
	 * Caches the farmer application in the entity cache if it is enabled.
	 *
	 * @param farmerApplication the farmer application
	 */
	public void cacheResult(FarmerApplication farmerApplication);

	/**
	 * Caches the farmer applications in the entity cache if it is enabled.
	 *
	 * @param farmerApplications the farmer applications
	 */
	public void cacheResult(
		java.util.List<FarmerApplication> farmerApplications);

	/**
	 * Creates a new farmer application with the primary key. Does not add the farmer application to the database.
	 *
	 * @param farmerApplicationId the primary key for the new farmer application
	 * @return the new farmer application
	 */
	public FarmerApplication create(long farmerApplicationId);

	/**
	 * Removes the farmer application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application that was removed
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	public FarmerApplication remove(long farmerApplicationId)
		throws NoSuchFarmerApplicationException;

	public FarmerApplication updateImpl(FarmerApplication farmerApplication);

	/**
	 * Returns the farmer application with the primary key or throws a <code>NoSuchFarmerApplicationException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application
	 * @throws NoSuchFarmerApplicationException if a farmer application with the primary key could not be found
	 */
	public FarmerApplication findByPrimaryKey(long farmerApplicationId)
		throws NoSuchFarmerApplicationException;

	/**
	 * Returns the farmer application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerApplicationId the primary key of the farmer application
	 * @return the farmer application, or <code>null</code> if a farmer application with the primary key could not be found
	 */
	public FarmerApplication fetchByPrimaryKey(long farmerApplicationId);

	/**
	 * Returns all the farmer applications.
	 *
	 * @return the farmer applications
	 */
	public java.util.List<FarmerApplication> findAll();

	/**
	 * Returns a range of all the farmer applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @return the range of farmer applications
	 */
	public java.util.List<FarmerApplication> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the farmer applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer applications
	 */
	public java.util.List<FarmerApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator);

	/**
	 * Returns an ordered range of all the farmer applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer applications
	 * @param end the upper bound of the range of farmer applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer applications
	 */
	public java.util.List<FarmerApplication> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<FarmerApplication>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the farmer applications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of farmer applications.
	 *
	 * @return the number of farmer applications
	 */
	public int countAll();

}