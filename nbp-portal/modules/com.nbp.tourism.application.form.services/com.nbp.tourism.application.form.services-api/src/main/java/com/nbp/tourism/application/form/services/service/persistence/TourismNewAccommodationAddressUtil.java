/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAccommodationAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new accommodation address service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewAccommodationAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccommodationAddressPersistence
 * @generated
 */
public class TourismNewAccommodationAddressUtil {

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
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		getPersistence().clearCache(tourismNewAccommodationAddress);
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
	public static Map<Serializable, TourismNewAccommodationAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewAccommodationAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewAccommodationAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewAccommodationAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewAccommodationAddress> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewAccommodationAddress update(
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		return getPersistence().update(tourismNewAccommodationAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewAccommodationAddress update(
		TourismNewAccommodationAddress tourismNewAccommodationAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewAccommodationAddress, serviceContext);
	}

	/**
	 * Returns the tourism new accommodation address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccommodationAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a matching tourism new accommodation address could not be found
	 */
	public static TourismNewAccommodationAddress findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationAddressException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new accommodation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	public static TourismNewAccommodationAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new accommodation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	public static TourismNewAccommodationAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new accommodation address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new accommodation address that was removed
	 */
	public static TourismNewAccommodationAddress removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationAddressException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new accommodation addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new accommodation addresses
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; or throws a <code>NoSuchTourismNewAccommodationAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the matching tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a matching tourism new accommodation address could not be found
	 */
	public static TourismNewAccommodationAddress findBygetTN_A_AT(
			String addressType, long tourismNewAccoFormId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationAddressException {

		return getPersistence().findBygetTN_A_AT(
			addressType, tourismNewAccoFormId);
	}

	/**
	 * Returns the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	public static TourismNewAccommodationAddress fetchBygetTN_A_AT(
		String addressType, long tourismNewAccoFormId) {

		return getPersistence().fetchBygetTN_A_AT(
			addressType, tourismNewAccoFormId);
	}

	/**
	 * Returns the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	public static TourismNewAccommodationAddress fetchBygetTN_A_AT(
		String addressType, long tourismNewAccoFormId, boolean useFinderCache) {

		return getPersistence().fetchBygetTN_A_AT(
			addressType, tourismNewAccoFormId, useFinderCache);
	}

	/**
	 * Removes the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the tourism new accommodation address that was removed
	 */
	public static TourismNewAccommodationAddress removeBygetTN_A_AT(
			String addressType, long tourismNewAccoFormId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationAddressException {

		return getPersistence().removeBygetTN_A_AT(
			addressType, tourismNewAccoFormId);
	}

	/**
	 * Returns the number of tourism new accommodation addresses where addressType = &#63; and tourismNewAccoFormId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the number of matching tourism new accommodation addresses
	 */
	public static int countBygetTN_A_AT(
		String addressType, long tourismNewAccoFormId) {

		return getPersistence().countBygetTN_A_AT(
			addressType, tourismNewAccoFormId);
	}

	/**
	 * Caches the tourism new accommodation address in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationAddress the tourism new accommodation address
	 */
	public static void cacheResult(
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		getPersistence().cacheResult(tourismNewAccommodationAddress);
	}

	/**
	 * Caches the tourism new accommodation addresses in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationAddresses the tourism new accommodation addresses
	 */
	public static void cacheResult(
		List<TourismNewAccommodationAddress> tourismNewAccommodationAddresses) {

		getPersistence().cacheResult(tourismNewAccommodationAddresses);
	}

	/**
	 * Creates a new tourism new accommodation address with the primary key. Does not add the tourism new accommodation address to the database.
	 *
	 * @param tourismNewAccommodationAOOId the primary key for the new tourism new accommodation address
	 * @return the new tourism new accommodation address
	 */
	public static TourismNewAccommodationAddress create(
		long tourismNewAccommodationAOOId) {

		return getPersistence().create(tourismNewAccommodationAOOId);
	}

	/**
	 * Removes the tourism new accommodation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address that was removed
	 * @throws NoSuchTourismNewAccommodationAddressException if a tourism new accommodation address with the primary key could not be found
	 */
	public static TourismNewAccommodationAddress remove(
			long tourismNewAccommodationAOOId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationAddressException {

		return getPersistence().remove(tourismNewAccommodationAOOId);
	}

	public static TourismNewAccommodationAddress updateImpl(
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		return getPersistence().updateImpl(tourismNewAccommodationAddress);
	}

	/**
	 * Returns the tourism new accommodation address with the primary key or throws a <code>NoSuchTourismNewAccommodationAddressException</code> if it could not be found.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a tourism new accommodation address with the primary key could not be found
	 */
	public static TourismNewAccommodationAddress findByPrimaryKey(
			long tourismNewAccommodationAOOId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAccommodationAddressException {

		return getPersistence().findByPrimaryKey(tourismNewAccommodationAOOId);
	}

	/**
	 * Returns the tourism new accommodation address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address, or <code>null</code> if a tourism new accommodation address with the primary key could not be found
	 */
	public static TourismNewAccommodationAddress fetchByPrimaryKey(
		long tourismNewAccommodationAOOId) {

		return getPersistence().fetchByPrimaryKey(tourismNewAccommodationAOOId);
	}

	/**
	 * Returns all the tourism new accommodation addresses.
	 *
	 * @return the tourism new accommodation addresses
	 */
	public static List<TourismNewAccommodationAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @return the range of tourism new accommodation addresses
	 */
	public static List<TourismNewAccommodationAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new accommodation addresses
	 */
	public static List<TourismNewAccommodationAddress> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccommodationAddress> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new accommodation addresses
	 */
	public static List<TourismNewAccommodationAddress> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccommodationAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new accommodation addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new accommodation addresses.
	 *
	 * @return the number of tourism new accommodation addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewAccommodationAddressPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewAccommodationAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewAccommodationAddressPersistence
		_persistence;

}