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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis desk verification service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeskVerificationPersistence
 * @generated
 */
public class CannabisDeskVerificationUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		CannabisDeskVerification cannabisDeskVerification) {

		getPersistence().clearCache(cannabisDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, CannabisDeskVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisDeskVerification update(
		CannabisDeskVerification cannabisDeskVerification) {

		return getPersistence().update(cannabisDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisDeskVerification update(
		CannabisDeskVerification cannabisDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisDeskVerification, serviceContext);
	}

	/**
	 * Returns all the cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis desk verifications
	 */
	public static List<CannabisDeskVerification>
		findBygetDeskVerificationPharmaById(long cannabisApplicationId) {

		return getPersistence().findBygetDeskVerificationPharmaById(
			cannabisApplicationId);
	}

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
	public static List<CannabisDeskVerification>
		findBygetDeskVerificationPharmaById(
			long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetDeskVerificationPharmaById(
			cannabisApplicationId, start, end);
	}

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
	public static List<CannabisDeskVerification>
		findBygetDeskVerificationPharmaById(
			long cannabisApplicationId, int start, int end,
			OrderByComparator<CannabisDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationPharmaById(
			cannabisApplicationId, start, end, orderByComparator);
	}

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
	public static List<CannabisDeskVerification>
		findBygetDeskVerificationPharmaById(
			long cannabisApplicationId, int start, int end,
			OrderByComparator<CannabisDeskVerification> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationPharmaById(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a matching cannabis desk verification could not be found
	 */
	public static CannabisDeskVerification
			findBygetDeskVerificationPharmaById_First(
				long cannabisApplicationId,
				OrderByComparator<CannabisDeskVerification> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisDeskVerificationException {

		return getPersistence().findBygetDeskVerificationPharmaById_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis desk verification, or <code>null</code> if a matching cannabis desk verification could not be found
	 */
	public static CannabisDeskVerification
		fetchBygetDeskVerificationPharmaById_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationPharmaById_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a matching cannabis desk verification could not be found
	 */
	public static CannabisDeskVerification
			findBygetDeskVerificationPharmaById_Last(
				long cannabisApplicationId,
				OrderByComparator<CannabisDeskVerification> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisDeskVerificationException {

		return getPersistence().findBygetDeskVerificationPharmaById_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis desk verification, or <code>null</code> if a matching cannabis desk verification could not be found
	 */
	public static CannabisDeskVerification
		fetchBygetDeskVerificationPharmaById_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetDeskVerificationPharmaById_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis desk verifications before and after the current cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDeskVerificationId the primary key of the current cannabis desk verification
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	public static CannabisDeskVerification[]
			findBygetDeskVerificationPharmaById_PrevAndNext(
				long cannabisDeskVerificationId, long cannabisApplicationId,
				OrderByComparator<CannabisDeskVerification> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisDeskVerificationException {

		return getPersistence().findBygetDeskVerificationPharmaById_PrevAndNext(
			cannabisDeskVerificationId, cannabisApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis desk verifications where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetDeskVerificationPharmaById(
		long cannabisApplicationId) {

		getPersistence().removeBygetDeskVerificationPharmaById(
			cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis desk verifications
	 */
	public static int countBygetDeskVerificationPharmaById(
		long cannabisApplicationId) {

		return getPersistence().countBygetDeskVerificationPharmaById(
			cannabisApplicationId);
	}

	/**
	 * Caches the cannabis desk verification in the entity cache if it is enabled.
	 *
	 * @param cannabisDeskVerification the cannabis desk verification
	 */
	public static void cacheResult(
		CannabisDeskVerification cannabisDeskVerification) {

		getPersistence().cacheResult(cannabisDeskVerification);
	}

	/**
	 * Caches the cannabis desk verifications in the entity cache if it is enabled.
	 *
	 * @param cannabisDeskVerifications the cannabis desk verifications
	 */
	public static void cacheResult(
		List<CannabisDeskVerification> cannabisDeskVerifications) {

		getPersistence().cacheResult(cannabisDeskVerifications);
	}

	/**
	 * Creates a new cannabis desk verification with the primary key. Does not add the cannabis desk verification to the database.
	 *
	 * @param cannabisDeskVerificationId the primary key for the new cannabis desk verification
	 * @return the new cannabis desk verification
	 */
	public static CannabisDeskVerification create(
		long cannabisDeskVerificationId) {

		return getPersistence().create(cannabisDeskVerificationId);
	}

	/**
	 * Removes the cannabis desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification that was removed
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	public static CannabisDeskVerification remove(
			long cannabisDeskVerificationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisDeskVerificationException {

		return getPersistence().remove(cannabisDeskVerificationId);
	}

	public static CannabisDeskVerification updateImpl(
		CannabisDeskVerification cannabisDeskVerification) {

		return getPersistence().updateImpl(cannabisDeskVerification);
	}

	/**
	 * Returns the cannabis desk verification with the primary key or throws a <code>NoSuchCannabisDeskVerificationException</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	public static CannabisDeskVerification findByPrimaryKey(
			long cannabisDeskVerificationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisDeskVerificationException {

		return getPersistence().findByPrimaryKey(cannabisDeskVerificationId);
	}

	/**
	 * Returns the cannabis desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification, or <code>null</code> if a cannabis desk verification with the primary key could not be found
	 */
	public static CannabisDeskVerification fetchByPrimaryKey(
		long cannabisDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(cannabisDeskVerificationId);
	}

	/**
	 * Returns all the cannabis desk verifications.
	 *
	 * @return the cannabis desk verifications
	 */
	public static List<CannabisDeskVerification> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CannabisDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<CannabisDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CannabisDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CannabisDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CannabisDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis desk verifications.
	 *
	 * @return the number of cannabis desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile CannabisDeskVerificationPersistence _persistence;

}