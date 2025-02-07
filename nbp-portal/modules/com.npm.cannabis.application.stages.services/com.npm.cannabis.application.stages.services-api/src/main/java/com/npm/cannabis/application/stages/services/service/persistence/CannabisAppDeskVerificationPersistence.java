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

package com.npm.cannabis.application.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisAppDeskVerificationException;
import com.npm.cannabis.application.stages.services.model.CannabisAppDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis app desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisAppDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface CannabisAppDeskVerificationPersistence
	extends BasePersistence<CannabisAppDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisAppDeskVerificationUtil} to access the cannabis app desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis app desk verifications
	 */
	public java.util.List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @return the range of matching cannabis app desk verifications
	 */
	public java.util.List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis app desk verifications
	 */
	public java.util.List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisAppDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis app desk verifications
	 */
	public java.util.List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisAppDeskVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a matching cannabis app desk verification could not be found
	 */
	public CannabisAppDeskVerification findBygetCannabisDV_ById_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisAppDeskVerification> orderByComparator)
		throws NoSuchCannabisAppDeskVerificationException;

	/**
	 * Returns the first cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis app desk verification, or <code>null</code> if a matching cannabis app desk verification could not be found
	 */
	public CannabisAppDeskVerification fetchBygetCannabisDV_ById_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisAppDeskVerification> orderByComparator);

	/**
	 * Returns the last cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a matching cannabis app desk verification could not be found
	 */
	public CannabisAppDeskVerification findBygetCannabisDV_ById_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisAppDeskVerification> orderByComparator)
		throws NoSuchCannabisAppDeskVerificationException;

	/**
	 * Returns the last cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis app desk verification, or <code>null</code> if a matching cannabis app desk verification could not be found
	 */
	public CannabisAppDeskVerification fetchBygetCannabisDV_ById_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisAppDeskVerification> orderByComparator);

	/**
	 * Returns the cannabis app desk verifications before and after the current cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDeskVerificationId the primary key of the current cannabis app desk verification
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	public CannabisAppDeskVerification[] findBygetCannabisDV_ById_PrevAndNext(
			long cannabisDeskVerificationId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisAppDeskVerification> orderByComparator)
		throws NoSuchCannabisAppDeskVerificationException;

	/**
	 * Removes all the cannabis app desk verifications where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetCannabisDV_ById(long cannabisApplicationId);

	/**
	 * Returns the number of cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis app desk verifications
	 */
	public int countBygetCannabisDV_ById(long cannabisApplicationId);

	/**
	 * Caches the cannabis app desk verification in the entity cache if it is enabled.
	 *
	 * @param cannabisAppDeskVerification the cannabis app desk verification
	 */
	public void cacheResult(
		CannabisAppDeskVerification cannabisAppDeskVerification);

	/**
	 * Caches the cannabis app desk verifications in the entity cache if it is enabled.
	 *
	 * @param cannabisAppDeskVerifications the cannabis app desk verifications
	 */
	public void cacheResult(
		java.util.List<CannabisAppDeskVerification>
			cannabisAppDeskVerifications);

	/**
	 * Creates a new cannabis app desk verification with the primary key. Does not add the cannabis app desk verification to the database.
	 *
	 * @param cannabisDeskVerificationId the primary key for the new cannabis app desk verification
	 * @return the new cannabis app desk verification
	 */
	public CannabisAppDeskVerification create(long cannabisDeskVerificationId);

	/**
	 * Removes the cannabis app desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification that was removed
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	public CannabisAppDeskVerification remove(long cannabisDeskVerificationId)
		throws NoSuchCannabisAppDeskVerificationException;

	public CannabisAppDeskVerification updateImpl(
		CannabisAppDeskVerification cannabisAppDeskVerification);

	/**
	 * Returns the cannabis app desk verification with the primary key or throws a <code>NoSuchCannabisAppDeskVerificationException</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	public CannabisAppDeskVerification findByPrimaryKey(
			long cannabisDeskVerificationId)
		throws NoSuchCannabisAppDeskVerificationException;

	/**
	 * Returns the cannabis app desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification, or <code>null</code> if a cannabis app desk verification with the primary key could not be found
	 */
	public CannabisAppDeskVerification fetchByPrimaryKey(
		long cannabisDeskVerificationId);

	/**
	 * Returns all the cannabis app desk verifications.
	 *
	 * @return the cannabis app desk verifications
	 */
	public java.util.List<CannabisAppDeskVerification> findAll();

	/**
	 * Returns a range of all the cannabis app desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @return the range of cannabis app desk verifications
	 */
	public java.util.List<CannabisAppDeskVerification> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the cannabis app desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis app desk verifications
	 */
	public java.util.List<CannabisAppDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisAppDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis app desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis app desk verifications
	 */
	public java.util.List<CannabisAppDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisAppDeskVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis app desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis app desk verifications.
	 *
	 * @return the number of cannabis app desk verifications
	 */
	public int countAll();

}