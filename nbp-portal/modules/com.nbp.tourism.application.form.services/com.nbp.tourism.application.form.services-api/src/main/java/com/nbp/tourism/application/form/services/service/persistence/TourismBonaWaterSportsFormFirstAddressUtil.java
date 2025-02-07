/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirstAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona water sports form first address service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaWaterSportsFormFirstAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormFirstAddressPersistence
 * @generated
 */
public class TourismBonaWaterSportsFormFirstAddressUtil {

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
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		getPersistence().clearCache(tourismBonaWaterSportsFormFirstAddress);
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
	public static Map<Serializable, TourismBonaWaterSportsFormFirstAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaWaterSportsFormFirstAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaWaterSportsFormFirstAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaWaterSportsFormFirstAddress>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<TourismBonaWaterSportsFormFirstAddress>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaWaterSportsFormFirstAddress update(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		return getPersistence().update(tourismBonaWaterSportsFormFirstAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaWaterSportsFormFirstAddress update(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaWaterSportsFormFirstAddress, serviceContext);
	}

	/**
	 * Returns the tourism bona water sports form first address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a matching tourism bona water sports form first address could not be found
	 */
	public static TourismBonaWaterSportsFormFirstAddress findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstAddressException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona water sports form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	public static TourismBonaWaterSportsFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona water sports form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	public static TourismBonaWaterSportsFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona water sports form first address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona water sports form first address that was removed
	 */
	public static TourismBonaWaterSportsFormFirstAddress removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstAddressException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona water sports form first addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona water sports form first addresses
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormFirstAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the matching tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a matching tourism bona water sports form first address could not be found
	 */
	public static TourismBonaWaterSportsFormFirstAddress findBygetTB_Water_AT(
			String addressType, long tourismBonaWaterSFFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstAddressException {

		return getPersistence().findBygetTB_Water_AT(
			addressType, tourismBonaWaterSFFirstId);
	}

	/**
	 * Returns the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	public static TourismBonaWaterSportsFormFirstAddress fetchBygetTB_Water_AT(
		String addressType, long tourismBonaWaterSFFirstId) {

		return getPersistence().fetchBygetTB_Water_AT(
			addressType, tourismBonaWaterSFFirstId);
	}

	/**
	 * Returns the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	public static TourismBonaWaterSportsFormFirstAddress fetchBygetTB_Water_AT(
		String addressType, long tourismBonaWaterSFFirstId,
		boolean useFinderCache) {

		return getPersistence().fetchBygetTB_Water_AT(
			addressType, tourismBonaWaterSFFirstId, useFinderCache);
	}

	/**
	 * Removes the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the tourism bona water sports form first address that was removed
	 */
	public static TourismBonaWaterSportsFormFirstAddress removeBygetTB_Water_AT(
			String addressType, long tourismBonaWaterSFFirstId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstAddressException {

		return getPersistence().removeBygetTB_Water_AT(
			addressType, tourismBonaWaterSFFirstId);
	}

	/**
	 * Returns the number of tourism bona water sports form first addresses where addressType = &#63; and tourismBonaWaterSFFirstId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the number of matching tourism bona water sports form first addresses
	 */
	public static int countBygetTB_Water_AT(
		String addressType, long tourismBonaWaterSFFirstId) {

		return getPersistence().countBygetTB_Water_AT(
			addressType, tourismBonaWaterSFFirstId);
	}

	/**
	 * Caches the tourism bona water sports form first address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirstAddress the tourism bona water sports form first address
	 */
	public static void cacheResult(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		getPersistence().cacheResult(tourismBonaWaterSportsFormFirstAddress);
	}

	/**
	 * Caches the tourism bona water sports form first addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirstAddresses the tourism bona water sports form first addresses
	 */
	public static void cacheResult(
		List<TourismBonaWaterSportsFormFirstAddress>
			tourismBonaWaterSportsFormFirstAddresses) {

		getPersistence().cacheResult(tourismBonaWaterSportsFormFirstAddresses);
	}

	/**
	 * Creates a new tourism bona water sports form first address with the primary key. Does not add the tourism bona water sports form first address to the database.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key for the new tourism bona water sports form first address
	 * @return the new tourism bona water sports form first address
	 */
	public static TourismBonaWaterSportsFormFirstAddress create(
		long tourismBonaWaterSportsFFAId) {

		return getPersistence().create(tourismBonaWaterSportsFFAId);
	}

	/**
	 * Removes the tourism bona water sports form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a tourism bona water sports form first address with the primary key could not be found
	 */
	public static TourismBonaWaterSportsFormFirstAddress remove(
			long tourismBonaWaterSportsFFAId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstAddressException {

		return getPersistence().remove(tourismBonaWaterSportsFFAId);
	}

	public static TourismBonaWaterSportsFormFirstAddress updateImpl(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		return getPersistence().updateImpl(
			tourismBonaWaterSportsFormFirstAddress);
	}

	/**
	 * Returns the tourism bona water sports form first address with the primary key or throws a <code>NoSuchTourismBonaWaterSportsFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a tourism bona water sports form first address with the primary key could not be found
	 */
	public static TourismBonaWaterSportsFormFirstAddress findByPrimaryKey(
			long tourismBonaWaterSportsFFAId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaWaterSportsFormFirstAddressException {

		return getPersistence().findByPrimaryKey(tourismBonaWaterSportsFFAId);
	}

	/**
	 * Returns the tourism bona water sports form first address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address, or <code>null</code> if a tourism bona water sports form first address with the primary key could not be found
	 */
	public static TourismBonaWaterSportsFormFirstAddress fetchByPrimaryKey(
		long tourismBonaWaterSportsFFAId) {

		return getPersistence().fetchByPrimaryKey(tourismBonaWaterSportsFFAId);
	}

	/**
	 * Returns all the tourism bona water sports form first addresses.
	 *
	 * @return the tourism bona water sports form first addresses
	 */
	public static List<TourismBonaWaterSportsFormFirstAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @return the range of tourism bona water sports form first addresses
	 */
	public static List<TourismBonaWaterSportsFormFirstAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona water sports form first addresses
	 */
	public static List<TourismBonaWaterSportsFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormFirstAddress>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona water sports form first addresses
	 */
	public static List<TourismBonaWaterSportsFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormFirstAddress>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona water sports form first addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona water sports form first addresses.
	 *
	 * @return the number of tourism bona water sports form first addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaWaterSportsFormFirstAddressPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		TourismBonaWaterSportsFormFirstAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaWaterSportsFormFirstAddressPersistence
		_persistence;

}