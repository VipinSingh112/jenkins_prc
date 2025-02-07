/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeIndividualDetailsAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative individual details address service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeIndividualDetailsAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeIndividualDetailsAddressPersistence
 * @generated
 */
public class CreativeIndividualDetailsAddressUtil {

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
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		getPersistence().clearCache(creativeIndividualDetailsAddress);
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
	public static Map<Serializable, CreativeIndividualDetailsAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeIndividualDetailsAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeIndividualDetailsAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeIndividualDetailsAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeIndividualDetailsAddress> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeIndividualDetailsAddress update(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		return getPersistence().update(creativeIndividualDetailsAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeIndividualDetailsAddress update(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeIndividualDetailsAddress, serviceContext);
	}

	/**
	 * Returns the creative individual details address where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualDetailsAddressException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details address
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a matching creative individual details address could not be found
	 */
	public static CreativeIndividualDetailsAddress findBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeIndividualDetailsAddressException {

		return getPersistence().findBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative individual details address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details address, or <code>null</code> if a matching creative individual details address could not be found
	 */
	public static CreativeIndividualDetailsAddress fetchBygetCreativeById(
		long CreativeApplicationId) {

		return getPersistence().fetchBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative individual details address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual details address, or <code>null</code> if a matching creative individual details address could not be found
	 */
	public static CreativeIndividualDetailsAddress fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeById(
			CreativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative individual details address where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual details address that was removed
	 */
	public static CreativeIndividualDetailsAddress removeBygetCreativeById(
			long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeIndividualDetailsAddressException {

		return getPersistence().removeBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative individual details addresses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual details addresses
	 */
	public static int countBygetCreativeById(long CreativeApplicationId) {
		return getPersistence().countBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Caches the creative individual details address in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetailsAddress the creative individual details address
	 */
	public static void cacheResult(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		getPersistence().cacheResult(creativeIndividualDetailsAddress);
	}

	/**
	 * Caches the creative individual details addresses in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetailsAddresses the creative individual details addresses
	 */
	public static void cacheResult(
		List<CreativeIndividualDetailsAddress>
			creativeIndividualDetailsAddresses) {

		getPersistence().cacheResult(creativeIndividualDetailsAddresses);
	}

	/**
	 * Creates a new creative individual details address with the primary key. Does not add the creative individual details address to the database.
	 *
	 * @param creativeIndiDetailsAddressId the primary key for the new creative individual details address
	 * @return the new creative individual details address
	 */
	public static CreativeIndividualDetailsAddress create(
		long creativeIndiDetailsAddressId) {

		return getPersistence().create(creativeIndiDetailsAddressId);
	}

	/**
	 * Removes the creative individual details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address that was removed
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a creative individual details address with the primary key could not be found
	 */
	public static CreativeIndividualDetailsAddress remove(
			long creativeIndiDetailsAddressId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeIndividualDetailsAddressException {

		return getPersistence().remove(creativeIndiDetailsAddressId);
	}

	public static CreativeIndividualDetailsAddress updateImpl(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		return getPersistence().updateImpl(creativeIndividualDetailsAddress);
	}

	/**
	 * Returns the creative individual details address with the primary key or throws a <code>NoSuchCreativeIndividualDetailsAddressException</code> if it could not be found.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a creative individual details address with the primary key could not be found
	 */
	public static CreativeIndividualDetailsAddress findByPrimaryKey(
			long creativeIndiDetailsAddressId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeIndividualDetailsAddressException {

		return getPersistence().findByPrimaryKey(creativeIndiDetailsAddressId);
	}

	/**
	 * Returns the creative individual details address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address, or <code>null</code> if a creative individual details address with the primary key could not be found
	 */
	public static CreativeIndividualDetailsAddress fetchByPrimaryKey(
		long creativeIndiDetailsAddressId) {

		return getPersistence().fetchByPrimaryKey(creativeIndiDetailsAddressId);
	}

	/**
	 * Returns all the creative individual details addresses.
	 *
	 * @return the creative individual details addresses
	 */
	public static List<CreativeIndividualDetailsAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @return the range of creative individual details addresses
	 */
	public static List<CreativeIndividualDetailsAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual details addresses
	 */
	public static List<CreativeIndividualDetailsAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualDetailsAddress> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual details addresses
	 */
	public static List<CreativeIndividualDetailsAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualDetailsAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative individual details addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative individual details addresses.
	 *
	 * @return the number of creative individual details addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeIndividualDetailsAddressPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeIndividualDetailsAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeIndividualDetailsAddressPersistence
		_persistence;

}