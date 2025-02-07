/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationFormAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism bona accommodation form address service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismBonaAccommodationFormAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccommodationFormAddressPersistence
 * @generated
 */
public class TourismBonaAccommodationFormAddressUtil {

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
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		getPersistence().clearCache(tourismBonaAccommodationFormAddress);
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
	public static Map<Serializable, TourismBonaAccommodationFormAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismBonaAccommodationFormAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismBonaAccommodationFormAddress>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismBonaAccommodationFormAddress>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<TourismBonaAccommodationFormAddress>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismBonaAccommodationFormAddress update(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		return getPersistence().update(tourismBonaAccommodationFormAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismBonaAccommodationFormAddress update(
		TourismBonaAccommodationFormAddress tourismBonaAccommodationFormAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismBonaAccommodationFormAddress, serviceContext);
	}

	/**
	 * Returns the tourism bona accommodation form address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccommodationFormAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a matching tourism bona accommodation form address could not be found
	 */
	public static TourismBonaAccommodationFormAddress findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccommodationFormAddressException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona accommodation form address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	public static TourismBonaAccommodationFormAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona accommodation form address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	public static TourismBonaAccommodationFormAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism bona accommodation form address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona accommodation form address that was removed
	 */
	public static TourismBonaAccommodationFormAddress removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccommodationFormAddressException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism bona accommodation form addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona accommodation form addresses
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; or throws a <code>NoSuchTourismBonaAccommodationFormAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the matching tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a matching tourism bona accommodation form address could not be found
	 */
	public static TourismBonaAccommodationFormAddress findBygetTB_Acco_AT(
			String addressType, long tourismBonaAFId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccommodationFormAddressException {

		return getPersistence().findBygetTB_Acco_AT(
			addressType, tourismBonaAFId);
	}

	/**
	 * Returns the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	public static TourismBonaAccommodationFormAddress fetchBygetTB_Acco_AT(
		String addressType, long tourismBonaAFId) {

		return getPersistence().fetchBygetTB_Acco_AT(
			addressType, tourismBonaAFId);
	}

	/**
	 * Returns the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	public static TourismBonaAccommodationFormAddress fetchBygetTB_Acco_AT(
		String addressType, long tourismBonaAFId, boolean useFinderCache) {

		return getPersistence().fetchBygetTB_Acco_AT(
			addressType, tourismBonaAFId, useFinderCache);
	}

	/**
	 * Removes the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the tourism bona accommodation form address that was removed
	 */
	public static TourismBonaAccommodationFormAddress removeBygetTB_Acco_AT(
			String addressType, long tourismBonaAFId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccommodationFormAddressException {

		return getPersistence().removeBygetTB_Acco_AT(
			addressType, tourismBonaAFId);
	}

	/**
	 * Returns the number of tourism bona accommodation form addresses where addressType = &#63; and tourismBonaAFId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the number of matching tourism bona accommodation form addresses
	 */
	public static int countBygetTB_Acco_AT(
		String addressType, long tourismBonaAFId) {

		return getPersistence().countBygetTB_Acco_AT(
			addressType, tourismBonaAFId);
	}

	/**
	 * Caches the tourism bona accommodation form address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationFormAddress the tourism bona accommodation form address
	 */
	public static void cacheResult(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		getPersistence().cacheResult(tourismBonaAccommodationFormAddress);
	}

	/**
	 * Caches the tourism bona accommodation form addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationFormAddresses the tourism bona accommodation form addresses
	 */
	public static void cacheResult(
		List<TourismBonaAccommodationFormAddress>
			tourismBonaAccommodationFormAddresses) {

		getPersistence().cacheResult(tourismBonaAccommodationFormAddresses);
	}

	/**
	 * Creates a new tourism bona accommodation form address with the primary key. Does not add the tourism bona accommodation form address to the database.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key for the new tourism bona accommodation form address
	 * @return the new tourism bona accommodation form address
	 */
	public static TourismBonaAccommodationFormAddress create(
		long tourismBonaAccommodationFAOOId) {

		return getPersistence().create(tourismBonaAccommodationFAOOId);
	}

	/**
	 * Removes the tourism bona accommodation form address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address that was removed
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a tourism bona accommodation form address with the primary key could not be found
	 */
	public static TourismBonaAccommodationFormAddress remove(
			long tourismBonaAccommodationFAOOId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccommodationFormAddressException {

		return getPersistence().remove(tourismBonaAccommodationFAOOId);
	}

	public static TourismBonaAccommodationFormAddress updateImpl(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		return getPersistence().updateImpl(tourismBonaAccommodationFormAddress);
	}

	/**
	 * Returns the tourism bona accommodation form address with the primary key or throws a <code>NoSuchTourismBonaAccommodationFormAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a tourism bona accommodation form address with the primary key could not be found
	 */
	public static TourismBonaAccommodationFormAddress findByPrimaryKey(
			long tourismBonaAccommodationFAOOId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismBonaAccommodationFormAddressException {

		return getPersistence().findByPrimaryKey(
			tourismBonaAccommodationFAOOId);
	}

	/**
	 * Returns the tourism bona accommodation form address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address, or <code>null</code> if a tourism bona accommodation form address with the primary key could not be found
	 */
	public static TourismBonaAccommodationFormAddress fetchByPrimaryKey(
		long tourismBonaAccommodationFAOOId) {

		return getPersistence().fetchByPrimaryKey(
			tourismBonaAccommodationFAOOId);
	}

	/**
	 * Returns all the tourism bona accommodation form addresses.
	 *
	 * @return the tourism bona accommodation form addresses
	 */
	public static List<TourismBonaAccommodationFormAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @return the range of tourism bona accommodation form addresses
	 */
	public static List<TourismBonaAccommodationFormAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona accommodation form addresses
	 */
	public static List<TourismBonaAccommodationFormAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccommodationFormAddress>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona accommodation form addresses
	 */
	public static List<TourismBonaAccommodationFormAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccommodationFormAddress>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism bona accommodation form addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism bona accommodation form addresses.
	 *
	 * @return the number of tourism bona accommodation form addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismBonaAccommodationFormAddressPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		TourismBonaAccommodationFormAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismBonaAccommodationFormAddressPersistence
		_persistence;

}