/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagement;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev disaster management service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevDisasterManagementPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementPersistence
 * @generated
 */
public class SezDevDisasterManagementUtil {

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
		SezDevDisasterManagement sezDevDisasterManagement) {

		getPersistence().clearCache(sezDevDisasterManagement);
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
	public static Map<Serializable, SezDevDisasterManagement>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevDisasterManagement> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevDisasterManagement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevDisasterManagement> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevDisasterManagement> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevDisasterManagement update(
		SezDevDisasterManagement sezDevDisasterManagement) {

		return getPersistence().update(sezDevDisasterManagement);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevDisasterManagement update(
		SezDevDisasterManagement sezDevDisasterManagement,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezDevDisasterManagement, serviceContext);
	}

	/**
	 * Returns the sez dev disaster management where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevDisasterManagementException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev disaster management
	 * @throws NoSuchSezDevDisasterManagementException if a matching sez dev disaster management could not be found
	 */
	public static SezDevDisasterManagement findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevDisasterManagementException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev disaster management where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev disaster management, or <code>null</code> if a matching sez dev disaster management could not be found
	 */
	public static SezDevDisasterManagement fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev disaster management where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev disaster management, or <code>null</code> if a matching sez dev disaster management could not be found
	 */
	public static SezDevDisasterManagement fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez dev disaster management where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev disaster management that was removed
	 */
	public static SezDevDisasterManagement removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevDisasterManagementException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev disaster managements where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev disaster managements
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev disaster management in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagement the sez dev disaster management
	 */
	public static void cacheResult(
		SezDevDisasterManagement sezDevDisasterManagement) {

		getPersistence().cacheResult(sezDevDisasterManagement);
	}

	/**
	 * Caches the sez dev disaster managements in the entity cache if it is enabled.
	 *
	 * @param sezDevDisasterManagements the sez dev disaster managements
	 */
	public static void cacheResult(
		List<SezDevDisasterManagement> sezDevDisasterManagements) {

		getPersistence().cacheResult(sezDevDisasterManagements);
	}

	/**
	 * Creates a new sez dev disaster management with the primary key. Does not add the sez dev disaster management to the database.
	 *
	 * @param sezDevDisasterManagementId the primary key for the new sez dev disaster management
	 * @return the new sez dev disaster management
	 */
	public static SezDevDisasterManagement create(
		long sezDevDisasterManagementId) {

		return getPersistence().create(sezDevDisasterManagementId);
	}

	/**
	 * Removes the sez dev disaster management with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management that was removed
	 * @throws NoSuchSezDevDisasterManagementException if a sez dev disaster management with the primary key could not be found
	 */
	public static SezDevDisasterManagement remove(
			long sezDevDisasterManagementId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevDisasterManagementException {

		return getPersistence().remove(sezDevDisasterManagementId);
	}

	public static SezDevDisasterManagement updateImpl(
		SezDevDisasterManagement sezDevDisasterManagement) {

		return getPersistence().updateImpl(sezDevDisasterManagement);
	}

	/**
	 * Returns the sez dev disaster management with the primary key or throws a <code>NoSuchSezDevDisasterManagementException</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management
	 * @throws NoSuchSezDevDisasterManagementException if a sez dev disaster management with the primary key could not be found
	 */
	public static SezDevDisasterManagement findByPrimaryKey(
			long sezDevDisasterManagementId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevDisasterManagementException {

		return getPersistence().findByPrimaryKey(sezDevDisasterManagementId);
	}

	/**
	 * Returns the sez dev disaster management with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management, or <code>null</code> if a sez dev disaster management with the primary key could not be found
	 */
	public static SezDevDisasterManagement fetchByPrimaryKey(
		long sezDevDisasterManagementId) {

		return getPersistence().fetchByPrimaryKey(sezDevDisasterManagementId);
	}

	/**
	 * Returns all the sez dev disaster managements.
	 *
	 * @return the sez dev disaster managements
	 */
	public static List<SezDevDisasterManagement> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @return the range of sez dev disaster managements
	 */
	public static List<SezDevDisasterManagement> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev disaster managements
	 */
	public static List<SezDevDisasterManagement> findAll(
		int start, int end,
		OrderByComparator<SezDevDisasterManagement> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev disaster managements
	 */
	public static List<SezDevDisasterManagement> findAll(
		int start, int end,
		OrderByComparator<SezDevDisasterManagement> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev disaster managements from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev disaster managements.
	 *
	 * @return the number of sez dev disaster managements
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevDisasterManagementPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevDisasterManagementPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevDisasterManagementPersistence _persistence;

}