/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirstAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new attraction form first address service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewAttractionFormFirstAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormFirstAddressPersistence
 * @generated
 */
public class TourismNewAttractionFormFirstAddressUtil {

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
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		getPersistence().clearCache(tourismNewAttractionFormFirstAddress);
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
	public static Map<Serializable, TourismNewAttractionFormFirstAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewAttractionFormFirstAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewAttractionFormFirstAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewAttractionFormFirstAddress>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<TourismNewAttractionFormFirstAddress>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewAttractionFormFirstAddress update(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		return getPersistence().update(tourismNewAttractionFormFirstAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewAttractionFormFirstAddress update(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewAttractionFormFirstAddress, serviceContext);
	}

	/**
	 * Returns the tourism new attraction form first address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a matching tourism new attraction form first address could not be found
	 */
	public static TourismNewAttractionFormFirstAddress findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstAddressException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	public static TourismNewAttractionFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	public static TourismNewAttractionFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new attraction form first address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction form first address that was removed
	 */
	public static TourismNewAttractionFormFirstAddress removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstAddressException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new attraction form first addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction form first addresses
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; or throws a <code>NoSuchTourismNewAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the matching tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a matching tourism new attraction form first address could not be found
	 */
	public static TourismNewAttractionFormFirstAddress findBygetTN_Attract_AT(
			String addressType, long tourismNewAttractFormFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstAddressException {

		return getPersistence().findBygetTN_Attract_AT(
			addressType, tourismNewAttractFormFirstId);
	}

	/**
	 * Returns the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	public static TourismNewAttractionFormFirstAddress fetchBygetTN_Attract_AT(
		String addressType, long tourismNewAttractFormFirstId) {

		return getPersistence().fetchBygetTN_Attract_AT(
			addressType, tourismNewAttractFormFirstId);
	}

	/**
	 * Returns the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	public static TourismNewAttractionFormFirstAddress fetchBygetTN_Attract_AT(
		String addressType, long tourismNewAttractFormFirstId,
		boolean useFinderCache) {

		return getPersistence().fetchBygetTN_Attract_AT(
			addressType, tourismNewAttractFormFirstId, useFinderCache);
	}

	/**
	 * Removes the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the tourism new attraction form first address that was removed
	 */
	public static TourismNewAttractionFormFirstAddress removeBygetTN_Attract_AT(
			String addressType, long tourismNewAttractFormFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstAddressException {

		return getPersistence().removeBygetTN_Attract_AT(
			addressType, tourismNewAttractFormFirstId);
	}

	/**
	 * Returns the number of tourism new attraction form first addresses where addressType = &#63; and tourismNewAttractFormFirstId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the number of matching tourism new attraction form first addresses
	 */
	public static int countBygetTN_Attract_AT(
		String addressType, long tourismNewAttractFormFirstId) {

		return getPersistence().countBygetTN_Attract_AT(
			addressType, tourismNewAttractFormFirstId);
	}

	/**
	 * Caches the tourism new attraction form first address in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirstAddress the tourism new attraction form first address
	 */
	public static void cacheResult(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		getPersistence().cacheResult(tourismNewAttractionFormFirstAddress);
	}

	/**
	 * Caches the tourism new attraction form first addresses in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirstAddresses the tourism new attraction form first addresses
	 */
	public static void cacheResult(
		List<TourismNewAttractionFormFirstAddress>
			tourismNewAttractionFormFirstAddresses) {

		getPersistence().cacheResult(tourismNewAttractionFormFirstAddresses);
	}

	/**
	 * Creates a new tourism new attraction form first address with the primary key. Does not add the tourism new attraction form first address to the database.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key for the new tourism new attraction form first address
	 * @return the new tourism new attraction form first address
	 */
	public static TourismNewAttractionFormFirstAddress create(
		long tourismNewAttractionFormFAOOId) {

		return getPersistence().create(tourismNewAttractionFormFAOOId);
	}

	/**
	 * Removes the tourism new attraction form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address that was removed
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a tourism new attraction form first address with the primary key could not be found
	 */
	public static TourismNewAttractionFormFirstAddress remove(
			long tourismNewAttractionFormFAOOId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstAddressException {

		return getPersistence().remove(tourismNewAttractionFormFAOOId);
	}

	public static TourismNewAttractionFormFirstAddress updateImpl(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		return getPersistence().updateImpl(
			tourismNewAttractionFormFirstAddress);
	}

	/**
	 * Returns the tourism new attraction form first address with the primary key or throws a <code>NoSuchTourismNewAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a tourism new attraction form first address with the primary key could not be found
	 */
	public static TourismNewAttractionFormFirstAddress findByPrimaryKey(
			long tourismNewAttractionFormFAOOId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewAttractionFormFirstAddressException {

		return getPersistence().findByPrimaryKey(
			tourismNewAttractionFormFAOOId);
	}

	/**
	 * Returns the tourism new attraction form first address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address, or <code>null</code> if a tourism new attraction form first address with the primary key could not be found
	 */
	public static TourismNewAttractionFormFirstAddress fetchByPrimaryKey(
		long tourismNewAttractionFormFAOOId) {

		return getPersistence().fetchByPrimaryKey(
			tourismNewAttractionFormFAOOId);
	}

	/**
	 * Returns all the tourism new attraction form first addresses.
	 *
	 * @return the tourism new attraction form first addresses
	 */
	public static List<TourismNewAttractionFormFirstAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @return the range of tourism new attraction form first addresses
	 */
	public static List<TourismNewAttractionFormFirstAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction form first addresses
	 */
	public static List<TourismNewAttractionFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormFirstAddress>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction form first addresses
	 */
	public static List<TourismNewAttractionFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormFirstAddress>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new attraction form first addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new attraction form first addresses.
	 *
	 * @return the number of tourism new attraction form first addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewAttractionFormFirstAddressPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		TourismNewAttractionFormFirstAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewAttractionFormFirstAddressPersistence
		_persistence;

}