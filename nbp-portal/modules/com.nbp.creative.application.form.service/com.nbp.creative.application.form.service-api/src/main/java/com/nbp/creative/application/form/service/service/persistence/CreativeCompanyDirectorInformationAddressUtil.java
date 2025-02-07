/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformationAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative company director information address service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeCompanyDirectorInformationAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationAddressPersistence
 * @generated
 */
public class CreativeCompanyDirectorInformationAddressUtil {

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
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress) {

		getPersistence().clearCache(creativeCompanyDirectorInformationAddress);
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
	public static Map<Serializable, CreativeCompanyDirectorInformationAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeCompanyDirectorInformationAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeCompanyDirectorInformationAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeCompanyDirectorInformationAddress>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<CreativeCompanyDirectorInformationAddress>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeCompanyDirectorInformationAddress update(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress) {

		return getPersistence().update(
			creativeCompanyDirectorInformationAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeCompanyDirectorInformationAddress update(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeCompanyDirectorInformationAddress, serviceContext);
	}

	/**
	 * Returns the creative company director information address where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyDirectorInformationAddressException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information address
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a matching creative company director information address could not be found
	 */
	public static CreativeCompanyDirectorInformationAddress
			findBygetCreativeById(long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDirectorInformationAddressException {

		return getPersistence().findBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative company director information address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information address, or <code>null</code> if a matching creative company director information address could not be found
	 */
	public static CreativeCompanyDirectorInformationAddress
		fetchBygetCreativeById(long CreativeApplicationId) {

		return getPersistence().fetchBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the creative company director information address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company director information address, or <code>null</code> if a matching creative company director information address could not be found
	 */
	public static CreativeCompanyDirectorInformationAddress
		fetchBygetCreativeById(
			long CreativeApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetCreativeById(
			CreativeApplicationId, useFinderCache);
	}

	/**
	 * Removes the creative company director information address where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company director information address that was removed
	 */
	public static CreativeCompanyDirectorInformationAddress
			removeBygetCreativeById(long CreativeApplicationId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDirectorInformationAddressException {

		return getPersistence().removeBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Returns the number of creative company director information addresses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company director information addresses
	 */
	public static int countBygetCreativeById(long CreativeApplicationId) {
		return getPersistence().countBygetCreativeById(CreativeApplicationId);
	}

	/**
	 * Caches the creative company director information address in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformationAddress the creative company director information address
	 */
	public static void cacheResult(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress) {

		getPersistence().cacheResult(creativeCompanyDirectorInformationAddress);
	}

	/**
	 * Caches the creative company director information addresses in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformationAddresses the creative company director information addresses
	 */
	public static void cacheResult(
		List<CreativeCompanyDirectorInformationAddress>
			creativeCompanyDirectorInformationAddresses) {

		getPersistence().cacheResult(
			creativeCompanyDirectorInformationAddresses);
	}

	/**
	 * Creates a new creative company director information address with the primary key. Does not add the creative company director information address to the database.
	 *
	 * @param creativeComDirectorAddressId the primary key for the new creative company director information address
	 * @return the new creative company director information address
	 */
	public static CreativeCompanyDirectorInformationAddress create(
		long creativeComDirectorAddressId) {

		return getPersistence().create(creativeComDirectorAddressId);
	}

	/**
	 * Removes the creative company director information address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address that was removed
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a creative company director information address with the primary key could not be found
	 */
	public static CreativeCompanyDirectorInformationAddress remove(
			long creativeComDirectorAddressId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDirectorInformationAddressException {

		return getPersistence().remove(creativeComDirectorAddressId);
	}

	public static CreativeCompanyDirectorInformationAddress updateImpl(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress) {

		return getPersistence().updateImpl(
			creativeCompanyDirectorInformationAddress);
	}

	/**
	 * Returns the creative company director information address with the primary key or throws a <code>NoSuchCreativeCompanyDirectorInformationAddressException</code> if it could not be found.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a creative company director information address with the primary key could not be found
	 */
	public static CreativeCompanyDirectorInformationAddress findByPrimaryKey(
			long creativeComDirectorAddressId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDirectorInformationAddressException {

		return getPersistence().findByPrimaryKey(creativeComDirectorAddressId);
	}

	/**
	 * Returns the creative company director information address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address, or <code>null</code> if a creative company director information address with the primary key could not be found
	 */
	public static CreativeCompanyDirectorInformationAddress fetchByPrimaryKey(
		long creativeComDirectorAddressId) {

		return getPersistence().fetchByPrimaryKey(creativeComDirectorAddressId);
	}

	/**
	 * Returns all the creative company director information addresses.
	 *
	 * @return the creative company director information addresses
	 */
	public static List<CreativeCompanyDirectorInformationAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @return the range of creative company director information addresses
	 */
	public static List<CreativeCompanyDirectorInformationAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company director information addresses
	 */
	public static List<CreativeCompanyDirectorInformationAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDirectorInformationAddress>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company director information addresses
	 */
	public static List<CreativeCompanyDirectorInformationAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDirectorInformationAddress>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative company director information addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative company director information addresses.
	 *
	 * @return the number of creative company director information addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeCompanyDirectorInformationAddressPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		CreativeCompanyDirectorInformationAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeCompanyDirectorInformationAddressPersistence
		_persistence;

}