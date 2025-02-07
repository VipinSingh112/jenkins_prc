/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportationAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona ground transportation address service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaGroundTransportationAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportationAddressPersistence
 * @generated
 */
public class TourismBonaGroundTransportationAddressUtil {

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
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		getPersistence().clearCache(tourismBonaGroundTransportationAddress);
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
	public static Map<Serializable, TourismBonaGroundTransportationAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaGroundTransportationAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaGroundTransportationAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaGroundTransportationAddress>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<TourismBonaGroundTransportationAddress>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaGroundTransportationAddress update(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		return getPersistence().update(tourismBonaGroundTransportationAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaGroundTransportationAddress update(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaGroundTransportationAddress, serviceContext);
	}

	/**
	 * Returns the tourism bona ground transportation address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportationAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a matching tourism bona ground transportation address could not be found
	 */
	public static TourismBonaGroundTransportationAddress findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationAddressException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground transportation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	public static TourismBonaGroundTransportationAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground transportation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	public static TourismBonaGroundTransportationAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona ground transportation address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground transportation address that was removed
	 */
	public static TourismBonaGroundTransportationAddress removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationAddressException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona ground transportation addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground transportation addresses
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportationAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the matching tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a matching tourism bona ground transportation address could not be found
	 */
	public static TourismBonaGroundTransportationAddress findBygetTB_Ground_AT(
			String addressType, long tourismBonaGroundTransportId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationAddressException {

		return getPersistence().findBygetTB_Ground_AT(
			addressType, tourismBonaGroundTransportId);
	}

	/**
	 * Returns the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	public static TourismBonaGroundTransportationAddress fetchBygetTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId) {

		return getPersistence().fetchBygetTB_Ground_AT(
			addressType, tourismBonaGroundTransportId);
	}

	/**
	 * Returns the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	public static TourismBonaGroundTransportationAddress fetchBygetTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId,
		boolean useFinderCache) {

		return getPersistence().fetchBygetTB_Ground_AT(
			addressType, tourismBonaGroundTransportId, useFinderCache);
	}

	/**
	 * Removes the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the tourism bona ground transportation address that was removed
	 */
	public static TourismBonaGroundTransportationAddress
			removeBygetTB_Ground_AT(
				String addressType, long tourismBonaGroundTransportId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationAddressException {

		return getPersistence().removeBygetTB_Ground_AT(
			addressType, tourismBonaGroundTransportId);
	}

	/**
	 * Returns the number of tourism bona ground transportation addresses where addressType = &#63; and tourismBonaGroundTransportId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the number of matching tourism bona ground transportation addresses
	 */
	public static int countBygetTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId) {

		return getPersistence().countBygetTB_Ground_AT(
			addressType, tourismBonaGroundTransportId);
	}

	/**
	 * Caches the tourism bona ground transportation address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportationAddress the tourism bona ground transportation address
	 */
	public static void cacheResult(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		getPersistence().cacheResult(tourismBonaGroundTransportationAddress);
	}

	/**
	 * Caches the tourism bona ground transportation addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportationAddresses the tourism bona ground transportation addresses
	 */
	public static void cacheResult(
		List<TourismBonaGroundTransportationAddress>
			tourismBonaGroundTransportationAddresses) {

		getPersistence().cacheResult(tourismBonaGroundTransportationAddresses);
	}

	/**
	 * Creates a new tourism bona ground transportation address with the primary key. Does not add the tourism bona ground transportation address to the database.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key for the new tourism bona ground transportation address
	 * @return the new tourism bona ground transportation address
	 */
	public static TourismBonaGroundTransportationAddress create(
		long tourismBonaGroundTransAddresId) {

		return getPersistence().create(tourismBonaGroundTransAddresId);
	}

	/**
	 * Removes the tourism bona ground transportation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address that was removed
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a tourism bona ground transportation address with the primary key could not be found
	 */
	public static TourismBonaGroundTransportationAddress remove(
			long tourismBonaGroundTransAddresId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationAddressException {

		return getPersistence().remove(tourismBonaGroundTransAddresId);
	}

	public static TourismBonaGroundTransportationAddress updateImpl(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		return getPersistence().updateImpl(
			tourismBonaGroundTransportationAddress);
	}

	/**
	 * Returns the tourism bona ground transportation address with the primary key or throws a <code>NoSuchTourismBonaGroundTransportationAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a tourism bona ground transportation address with the primary key could not be found
	 */
	public static TourismBonaGroundTransportationAddress findByPrimaryKey(
			long tourismBonaGroundTransAddresId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaGroundTransportationAddressException {

		return getPersistence().findByPrimaryKey(
			tourismBonaGroundTransAddresId);
	}

	/**
	 * Returns the tourism bona ground transportation address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address, or <code>null</code> if a tourism bona ground transportation address with the primary key could not be found
	 */
	public static TourismBonaGroundTransportationAddress fetchByPrimaryKey(
		long tourismBonaGroundTransAddresId) {

		return getPersistence().fetchByPrimaryKey(
			tourismBonaGroundTransAddresId);
	}

	/**
	 * Returns all the tourism bona ground transportation addresses.
	 *
	 * @return the tourism bona ground transportation addresses
	 */
	public static List<TourismBonaGroundTransportationAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @return the range of tourism bona ground transportation addresses
	 */
	public static List<TourismBonaGroundTransportationAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground transportation addresses
	 */
	public static List<TourismBonaGroundTransportationAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportationAddress>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground transportation addresses
	 */
	public static List<TourismBonaGroundTransportationAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportationAddress>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona ground transportation addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona ground transportation addresses.
	 *
	 * @return the number of tourism bona ground transportation addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaGroundTransportationAddressPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		TourismBonaGroundTransportationAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaGroundTransportationAddressPersistence
		_persistence;

}