/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.application.form.service.model.HealthCareBusinessAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the health care business address service. This utility wraps <code>com.nbp.healthcare.application.form.service.service.persistence.impl.HealthCareBusinessAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HealthCareBusinessAddressPersistence
 * @generated
 */
public class HealthCareBusinessAddressUtil {

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
		HealthCareBusinessAddress healthCareBusinessAddress) {

		getPersistence().clearCache(healthCareBusinessAddress);
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
	public static Map<Serializable, HealthCareBusinessAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<HealthCareBusinessAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<HealthCareBusinessAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<HealthCareBusinessAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<HealthCareBusinessAddress> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static HealthCareBusinessAddress update(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		return getPersistence().update(healthCareBusinessAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static HealthCareBusinessAddress update(
		HealthCareBusinessAddress healthCareBusinessAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			healthCareBusinessAddress, serviceContext);
	}

	/**
	 * Returns the health care business address where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareBusinessAddressException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care business address
	 * @throws NoSuchHealthCareBusinessAddressException if a matching health care business address could not be found
	 */
	public static HealthCareBusinessAddress findBygetHealthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareBusinessAddressException {

		return getPersistence().findBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care business address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care business address, or <code>null</code> if a matching health care business address could not be found
	 */
	public static HealthCareBusinessAddress fetchBygetHealthCareById(
		long healthCareApplicationId) {

		return getPersistence().fetchBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the health care business address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care business address, or <code>null</code> if a matching health care business address could not be found
	 */
	public static HealthCareBusinessAddress fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHealthCareById(
			healthCareApplicationId, useFinderCache);
	}

	/**
	 * Removes the health care business address where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care business address that was removed
	 */
	public static HealthCareBusinessAddress removeBygetHealthCareById(
			long healthCareApplicationId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareBusinessAddressException {

		return getPersistence().removeBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Returns the number of health care business addresses where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care business addresses
	 */
	public static int countBygetHealthCareById(long healthCareApplicationId) {
		return getPersistence().countBygetHealthCareById(
			healthCareApplicationId);
	}

	/**
	 * Caches the health care business address in the entity cache if it is enabled.
	 *
	 * @param healthCareBusinessAddress the health care business address
	 */
	public static void cacheResult(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		getPersistence().cacheResult(healthCareBusinessAddress);
	}

	/**
	 * Caches the health care business addresses in the entity cache if it is enabled.
	 *
	 * @param healthCareBusinessAddresses the health care business addresses
	 */
	public static void cacheResult(
		List<HealthCareBusinessAddress> healthCareBusinessAddresses) {

		getPersistence().cacheResult(healthCareBusinessAddresses);
	}

	/**
	 * Creates a new health care business address with the primary key. Does not add the health care business address to the database.
	 *
	 * @param healthCareBusinessAddressId the primary key for the new health care business address
	 * @return the new health care business address
	 */
	public static HealthCareBusinessAddress create(
		long healthCareBusinessAddressId) {

		return getPersistence().create(healthCareBusinessAddressId);
	}

	/**
	 * Removes the health care business address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address that was removed
	 * @throws NoSuchHealthCareBusinessAddressException if a health care business address with the primary key could not be found
	 */
	public static HealthCareBusinessAddress remove(
			long healthCareBusinessAddressId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareBusinessAddressException {

		return getPersistence().remove(healthCareBusinessAddressId);
	}

	public static HealthCareBusinessAddress updateImpl(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		return getPersistence().updateImpl(healthCareBusinessAddress);
	}

	/**
	 * Returns the health care business address with the primary key or throws a <code>NoSuchHealthCareBusinessAddressException</code> if it could not be found.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address
	 * @throws NoSuchHealthCareBusinessAddressException if a health care business address with the primary key could not be found
	 */
	public static HealthCareBusinessAddress findByPrimaryKey(
			long healthCareBusinessAddressId)
		throws com.nbp.healthcare.application.form.service.exception.
			NoSuchHealthCareBusinessAddressException {

		return getPersistence().findByPrimaryKey(healthCareBusinessAddressId);
	}

	/**
	 * Returns the health care business address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address, or <code>null</code> if a health care business address with the primary key could not be found
	 */
	public static HealthCareBusinessAddress fetchByPrimaryKey(
		long healthCareBusinessAddressId) {

		return getPersistence().fetchByPrimaryKey(healthCareBusinessAddressId);
	}

	/**
	 * Returns all the health care business addresses.
	 *
	 * @return the health care business addresses
	 */
	public static List<HealthCareBusinessAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @return the range of health care business addresses
	 */
	public static List<HealthCareBusinessAddress> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care business addresses
	 */
	public static List<HealthCareBusinessAddress> findAll(
		int start, int end,
		OrderByComparator<HealthCareBusinessAddress> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care business addresses
	 */
	public static List<HealthCareBusinessAddress> findAll(
		int start, int end,
		OrderByComparator<HealthCareBusinessAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the health care business addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of health care business addresses.
	 *
	 * @return the number of health care business addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HealthCareBusinessAddressPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		HealthCareBusinessAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile HealthCareBusinessAddressPersistence _persistence;

}