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

import com.npm.cannabis.application.stages.services.model.CannabisAppDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the cannabis app desk verification service. This utility wraps <code>com.npm.cannabis.application.stages.services.service.persistence.impl.CannabisAppDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CannabisAppDeskVerificationPersistence
 * @generated
 */
public class CannabisAppDeskVerificationUtil {

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
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		getPersistence().clearCache(cannabisAppDeskVerification);
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
	public static Map<Serializable, CannabisAppDeskVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CannabisAppDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CannabisAppDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CannabisAppDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CannabisAppDeskVerification update(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		return getPersistence().update(cannabisAppDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CannabisAppDeskVerification update(
		CannabisAppDeskVerification cannabisAppDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			cannabisAppDeskVerification, serviceContext);
	}

	/**
	 * Returns all the cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis app desk verifications
	 */
	public static List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId) {

		return getPersistence().findBygetCannabisDV_ById(cannabisApplicationId);
	}

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
	public static List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetCannabisDV_ById(
			cannabisApplicationId, start, end);
	}

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
	public static List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator) {

		return getPersistence().findBygetCannabisDV_ById(
			cannabisApplicationId, start, end, orderByComparator);
	}

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
	public static List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetCannabisDV_ById(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a matching cannabis app desk verification could not be found
	 */
	public static CannabisAppDeskVerification findBygetCannabisDV_ById_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisAppDeskVerification> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisAppDeskVerificationException {

		return getPersistence().findBygetCannabisDV_ById_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis app desk verification, or <code>null</code> if a matching cannabis app desk verification could not be found
	 */
	public static CannabisAppDeskVerification fetchBygetCannabisDV_ById_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetCannabisDV_ById_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a matching cannabis app desk verification could not be found
	 */
	public static CannabisAppDeskVerification findBygetCannabisDV_ById_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisAppDeskVerification> orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisAppDeskVerificationException {

		return getPersistence().findBygetCannabisDV_ById_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis app desk verification, or <code>null</code> if a matching cannabis app desk verification could not be found
	 */
	public static CannabisAppDeskVerification fetchBygetCannabisDV_ById_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator) {

		return getPersistence().fetchBygetCannabisDV_ById_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the cannabis app desk verifications before and after the current cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDeskVerificationId the primary key of the current cannabis app desk verification
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	public static CannabisAppDeskVerification[]
			findBygetCannabisDV_ById_PrevAndNext(
				long cannabisDeskVerificationId, long cannabisApplicationId,
				OrderByComparator<CannabisAppDeskVerification>
					orderByComparator)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisAppDeskVerificationException {

		return getPersistence().findBygetCannabisDV_ById_PrevAndNext(
			cannabisDeskVerificationId, cannabisApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the cannabis app desk verifications where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetCannabisDV_ById(long cannabisApplicationId) {
		getPersistence().removeBygetCannabisDV_ById(cannabisApplicationId);
	}

	/**
	 * Returns the number of cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis app desk verifications
	 */
	public static int countBygetCannabisDV_ById(long cannabisApplicationId) {
		return getPersistence().countBygetCannabisDV_ById(
			cannabisApplicationId);
	}

	/**
	 * Caches the cannabis app desk verification in the entity cache if it is enabled.
	 *
	 * @param cannabisAppDeskVerification the cannabis app desk verification
	 */
	public static void cacheResult(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		getPersistence().cacheResult(cannabisAppDeskVerification);
	}

	/**
	 * Caches the cannabis app desk verifications in the entity cache if it is enabled.
	 *
	 * @param cannabisAppDeskVerifications the cannabis app desk verifications
	 */
	public static void cacheResult(
		List<CannabisAppDeskVerification> cannabisAppDeskVerifications) {

		getPersistence().cacheResult(cannabisAppDeskVerifications);
	}

	/**
	 * Creates a new cannabis app desk verification with the primary key. Does not add the cannabis app desk verification to the database.
	 *
	 * @param cannabisDeskVerificationId the primary key for the new cannabis app desk verification
	 * @return the new cannabis app desk verification
	 */
	public static CannabisAppDeskVerification create(
		long cannabisDeskVerificationId) {

		return getPersistence().create(cannabisDeskVerificationId);
	}

	/**
	 * Removes the cannabis app desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification that was removed
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	public static CannabisAppDeskVerification remove(
			long cannabisDeskVerificationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisAppDeskVerificationException {

		return getPersistence().remove(cannabisDeskVerificationId);
	}

	public static CannabisAppDeskVerification updateImpl(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		return getPersistence().updateImpl(cannabisAppDeskVerification);
	}

	/**
	 * Returns the cannabis app desk verification with the primary key or throws a <code>NoSuchCannabisAppDeskVerificationException</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	public static CannabisAppDeskVerification findByPrimaryKey(
			long cannabisDeskVerificationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisAppDeskVerificationException {

		return getPersistence().findByPrimaryKey(cannabisDeskVerificationId);
	}

	/**
	 * Returns the cannabis app desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification, or <code>null</code> if a cannabis app desk verification with the primary key could not be found
	 */
	public static CannabisAppDeskVerification fetchByPrimaryKey(
		long cannabisDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(cannabisDeskVerificationId);
	}

	/**
	 * Returns all the cannabis app desk verifications.
	 *
	 * @return the cannabis app desk verifications
	 */
	public static List<CannabisAppDeskVerification> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CannabisAppDeskVerification> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

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
	public static List<CannabisAppDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CannabisAppDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the cannabis app desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of cannabis app desk verifications.
	 *
	 * @return the number of cannabis app desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CannabisAppDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	private static volatile CannabisAppDeskVerificationPersistence _persistence;

}