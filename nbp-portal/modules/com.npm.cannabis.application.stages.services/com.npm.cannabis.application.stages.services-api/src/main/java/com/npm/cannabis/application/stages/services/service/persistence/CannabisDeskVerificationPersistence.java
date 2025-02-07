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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisDeskVerificationException;
import com.npm.cannabis.application.stages.services.model.CannabisDeskVerification;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the cannabis desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeskVerificationUtil
 * @generated
 */
@ProviderType
public interface CannabisDeskVerificationPersistence
	extends BasePersistence<CannabisDeskVerification> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CannabisDeskVerificationUtil} to access the cannabis desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis desk verifications
	 */
	public java.util.List<CannabisDeskVerification>
		findBygetDeskVerificationPharmaById(long cannabisApplicationId);

	/**
	 * Returns a range of all the cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @return the range of matching cannabis desk verifications
	 */
	public java.util.List<CannabisDeskVerification>
		findBygetDeskVerificationPharmaById(
			long cannabisApplicationId, int start, int end);

	/**
	 * Returns an ordered range of all the cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis desk verifications
	 */
	public java.util.List<CannabisDeskVerification>
		findBygetDeskVerificationPharmaById(
			long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis desk verifications
	 */
	public java.util.List<CannabisDeskVerification>
		findBygetDeskVerificationPharmaById(
			long cannabisApplicationId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeskVerification> orderByComparator,
			boolean useFinderCache);

	/**
	 * Returns the first cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a matching cannabis desk verification could not be found
	 */
	public CannabisDeskVerification findBygetDeskVerificationPharmaById_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeskVerification> orderByComparator)
		throws NoSuchCannabisDeskVerificationException;

	/**
	 * Returns the first cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis desk verification, or <code>null</code> if a matching cannabis desk verification could not be found
	 */
	public CannabisDeskVerification fetchBygetDeskVerificationPharmaById_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeskVerification> orderByComparator);

	/**
	 * Returns the last cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a matching cannabis desk verification could not be found
	 */
	public CannabisDeskVerification findBygetDeskVerificationPharmaById_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<CannabisDeskVerification> orderByComparator)
		throws NoSuchCannabisDeskVerificationException;

	/**
	 * Returns the last cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis desk verification, or <code>null</code> if a matching cannabis desk verification could not be found
	 */
	public CannabisDeskVerification fetchBygetDeskVerificationPharmaById_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeskVerification> orderByComparator);

	/**
	 * Returns the cannabis desk verifications before and after the current cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDeskVerificationId the primary key of the current cannabis desk verification
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	public CannabisDeskVerification[]
			findBygetDeskVerificationPharmaById_PrevAndNext(
				long cannabisDeskVerificationId, long cannabisApplicationId,
				com.liferay.portal.kernel.util.OrderByComparator
					<CannabisDeskVerification> orderByComparator)
		throws NoSuchCannabisDeskVerificationException;

	/**
	 * Removes all the cannabis desk verifications where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetDeskVerificationPharmaById(
		long cannabisApplicationId);

	/**
	 * Returns the number of cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis desk verifications
	 */
	public int countBygetDeskVerificationPharmaById(long cannabisApplicationId);

	/**
	 * Caches the cannabis desk verification in the entity cache if it is enabled.
	 *
	 * @param cannabisDeskVerification the cannabis desk verification
	 */
	public void cacheResult(CannabisDeskVerification cannabisDeskVerification);

	/**
	 * Caches the cannabis desk verifications in the entity cache if it is enabled.
	 *
	 * @param cannabisDeskVerifications the cannabis desk verifications
	 */
	public void cacheResult(
		java.util.List<CannabisDeskVerification> cannabisDeskVerifications);

	/**
	 * Creates a new cannabis desk verification with the primary key. Does not add the cannabis desk verification to the database.
	 *
	 * @param cannabisDeskVerificationId the primary key for the new cannabis desk verification
	 * @return the new cannabis desk verification
	 */
	public CannabisDeskVerification create(long cannabisDeskVerificationId);

	/**
	 * Removes the cannabis desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification that was removed
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	public CannabisDeskVerification remove(long cannabisDeskVerificationId)
		throws NoSuchCannabisDeskVerificationException;

	public CannabisDeskVerification updateImpl(
		CannabisDeskVerification cannabisDeskVerification);

	/**
	 * Returns the cannabis desk verification with the primary key or throws a <code>NoSuchCannabisDeskVerificationException</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	public CannabisDeskVerification findByPrimaryKey(
			long cannabisDeskVerificationId)
		throws NoSuchCannabisDeskVerificationException;

	/**
	 * Returns the cannabis desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification, or <code>null</code> if a cannabis desk verification with the primary key could not be found
	 */
	public CannabisDeskVerification fetchByPrimaryKey(
		long cannabisDeskVerificationId);

	/**
	 * Returns all the cannabis desk verifications.
	 *
	 * @return the cannabis desk verifications
	 */
	public java.util.List<CannabisDeskVerification> findAll();

	/**
	 * Returns a range of all the cannabis desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @return the range of cannabis desk verifications
	 */
	public java.util.List<CannabisDeskVerification> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the cannabis desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis desk verifications
	 */
	public java.util.List<CannabisDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeskVerification> orderByComparator);

	/**
	 * Returns an ordered range of all the cannabis desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis desk verifications
	 */
	public java.util.List<CannabisDeskVerification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<CannabisDeskVerification> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the cannabis desk verifications from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of cannabis desk verifications.
	 *
	 * @return the number of cannabis desk verifications
	 */
	public int countAll();

}