/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareDescriptionOfService;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care description of service service. This utility wraps <code>com.nbp.healthcare.application.form.service.service.persistence.impl.HealthCareDescriptionOfServicePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareDescriptionOfServicePersistence
 * @generated
 */
public class HealthCareDescriptionOfServiceUtil {

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
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		getPersistence().clearCache(healthCareDescriptionOfService);
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
	public static Map<Serializable, HealthCareDescriptionOfService>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCareDescriptionOfService> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCareDescriptionOfService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCareDescriptionOfService> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCareDescriptionOfService> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCareDescriptionOfService update(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		return getPersistence().update(healthCareDescriptionOfService);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCareDescriptionOfService update(
		HealthCareDescriptionOfService healthCareDescriptionOfService,
		ServiceContext serviceContext) {

		return getPersistence().update(
			healthCareDescriptionOfService, serviceContext);
	}

	/**
	 * Returns the health care description of service where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareDescriptionOfServiceException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care description of service
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a matching health care description of service could not be found
	 */
	public static HealthCareDescriptionOfService findBygetHealthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareDescriptionOfServiceException {

		return getPersistence().findBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care description of service where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care description of service, or <code>null</code> if a matching health care description of service could not be found
	 */
	public static HealthCareDescriptionOfService fetchBygetHealthCareById(
		long healthCareApplicationId) {

		return getPersistence().fetchBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care description of service where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care description of service, or <code>null</code> if a matching health care description of service could not be found
	 */
	public static HealthCareDescriptionOfService fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareById(
			healthCareApplicationId, useFinderCache);
	}

	/**
	 * Removes the health care description of service where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care description of service that was removed
	 */
	public static HealthCareDescriptionOfService removeBygetHealthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareDescriptionOfServiceException {

		return getPersistence().removeBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the number of health care description of services where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care description of services
	 */
	public static int countBygetHealthCareById(long healthCareApplicationId) {
		return getPersistence().countBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Caches the health care description of service in the entity cache if it is enabled.
	 *
	 * @param healthCareDescriptionOfService the health care description of service
	 */
	public static void cacheResult(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		getPersistence().cacheResult(healthCareDescriptionOfService);
	}

	/**
	 * Caches the health care description of services in the entity cache if it is enabled.
	 *
	 * @param healthCareDescriptionOfServices the health care description of services
	 */
	public static void cacheResult(
		List<HealthCareDescriptionOfService> healthCareDescriptionOfServices) {

		getPersistence().cacheResult(healthCareDescriptionOfServices);
	}

	/**
	 * Creates a new health care description of service with the primary key. Does not add the health care description of service to the database.
	 *
	 * @param healthCareDescriptionId the primary key for the new health care description of service
	 * @return the new health care description of service
	 */
	public static HealthCareDescriptionOfService create(
		long healthCareDescriptionId) {

		return getPersistence().create(healthCareDescriptionId);
	}

	/**
	 * Removes the health care description of service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service that was removed
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a health care description of service with the primary key could not be found
	 */
	public static HealthCareDescriptionOfService remove(
			long healthCareDescriptionId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareDescriptionOfServiceException {

		return getPersistence().remove(healthCareDescriptionId);
	}

	public static HealthCareDescriptionOfService updateImpl(
		HealthCareDescriptionOfService healthCareDescriptionOfService) {

		return getPersistence().updateImpl(healthCareDescriptionOfService);
	}

	/**
	 * Returns the health care description of service with the primary key or throws a <code>NoSuchHealthCareDescriptionOfServiceException</code> if it could not be found.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service
	 * @throws NoSuchHealthCareDescriptionOfServiceException if a health care description of service with the primary key could not be found
	 */
	public static HealthCareDescriptionOfService findByPrimaryKey(
			long healthCareDescriptionId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareDescriptionOfServiceException {

		return getPersistence().findByPrimaryKey(healthCareDescriptionId);
	}

	/**
	 * Returns the health care description of service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareDescriptionId the primary key of the health care description of service
	 * @return the health care description of service, or <code>null</code> if a health care description of service with the primary key could not be found
	 */
	public static HealthCareDescriptionOfService fetchByPrimaryKey(
		long healthCareDescriptionId) {

		return getPersistence().fetchByPrimaryKey(healthCareDescriptionId);
	}

	/**
	 * Returns all the health care description of services.
	 *
	 * @return the health care description of services
	 */
	public static List<HealthCareDescriptionOfService> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @return the range of health care description of services
	 */
	public static List<HealthCareDescriptionOfService> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care description of services
	 */
	public static List<HealthCareDescriptionOfService> findAll(
		int start, int end,
		OrderByComparator<HealthCareDescriptionOfService> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care description of services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDescriptionOfServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care description of services
	 * @param end the upper bound of the range of health care description of services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care description of services
	 */
	public static List<HealthCareDescriptionOfService> findAll(
		int start, int end,
		OrderByComparator<HealthCareDescriptionOfService> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care description of services from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care description of services.
	 *
	 * @return the number of health care description of services
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCareDescriptionOfServicePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthCareDescriptionOfServicePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthCareDescriptionOfServicePersistence
		_persistence;

}