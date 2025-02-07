/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez occupant general bussiness address service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezOccupantGeneralBussinessAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessAddressPersistence
 * @generated
 */
public class SezOccupantGeneralBussinessAddressUtil {

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
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		getPersistence().clearCache(sezOccupantGeneralBussinessAddress);
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
	public static Map<Serializable, SezOccupantGeneralBussinessAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezOccupantGeneralBussinessAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezOccupantGeneralBussinessAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezOccupantGeneralBussinessAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessAddress>
			orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezOccupantGeneralBussinessAddress update(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		return getPersistence().update(sezOccupantGeneralBussinessAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezOccupantGeneralBussinessAddress update(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezOccupantGeneralBussinessAddress, serviceContext);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a matching sez occupant general bussiness address could not be found
	 */
	public static SezOccupantGeneralBussinessAddress findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessAddressException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public static SezOccupantGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public static SezOccupantGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez occupant general bussiness address where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant general bussiness address that was removed
	 */
	public static SezOccupantGeneralBussinessAddress
			removeBygetSezStatusByAppId(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessAddressException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez occupant general bussiness addresses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant general bussiness addresses
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a matching sez occupant general bussiness address could not be found
	 */
	public static SezOccupantGeneralBussinessAddress
			findBygetSezStatusByAddressType_SAI(
				long sezStatusApplicationId, String addresstype)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessAddressException {

		return getPersistence().findBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public static SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype) {

		return getPersistence().fetchBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public static SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype,
			boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype, useFinderCache);
	}

	/**
	 * Removes the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the sez occupant general bussiness address that was removed
	 */
	public static SezOccupantGeneralBussinessAddress
			removeBygetSezStatusByAddressType_SAI(
				long sezStatusApplicationId, String addresstype)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessAddressException {

		return getPersistence().removeBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype);
	}

	/**
	 * Returns the number of sez occupant general bussiness addresses where sezStatusApplicationId = &#63; and addresstype = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez occupant general bussiness addresses
	 */
	public static int countBygetSezStatusByAddressType_SAI(
		long sezStatusApplicationId, String addresstype) {

		return getPersistence().countBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a matching sez occupant general bussiness address could not be found
	 */
	public static SezOccupantGeneralBussinessAddress
			findBygetSezStatusByAddressType_GBI(
				long sezOccGenBussId, String addresstype)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessAddressException {

		return getPersistence().findBygetSezStatusByAddressType_GBI(
			sezOccGenBussId, addresstype);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public static SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_GBI(
			long sezOccGenBussId, String addresstype) {

		return getPersistence().fetchBygetSezStatusByAddressType_GBI(
			sezOccGenBussId, addresstype);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	public static SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_GBI(
			long sezOccGenBussId, String addresstype, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAddressType_GBI(
			sezOccGenBussId, addresstype, useFinderCache);
	}

	/**
	 * Removes the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the sez occupant general bussiness address that was removed
	 */
	public static SezOccupantGeneralBussinessAddress
			removeBygetSezStatusByAddressType_GBI(
				long sezOccGenBussId, String addresstype)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessAddressException {

		return getPersistence().removeBygetSezStatusByAddressType_GBI(
			sezOccGenBussId, addresstype);
	}

	/**
	 * Returns the number of sez occupant general bussiness addresses where sezOccGenBussId = &#63; and addresstype = &#63;.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez occupant general bussiness addresses
	 */
	public static int countBygetSezStatusByAddressType_GBI(
		long sezOccGenBussId, String addresstype) {

		return getPersistence().countBygetSezStatusByAddressType_GBI(
			sezOccGenBussId, addresstype);
	}

	/**
	 * Caches the sez occupant general bussiness address in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessAddress the sez occupant general bussiness address
	 */
	public static void cacheResult(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		getPersistence().cacheResult(sezOccupantGeneralBussinessAddress);
	}

	/**
	 * Caches the sez occupant general bussiness addresses in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessAddresses the sez occupant general bussiness addresses
	 */
	public static void cacheResult(
		List<SezOccupantGeneralBussinessAddress>
			sezOccupantGeneralBussinessAddresses) {

		getPersistence().cacheResult(sezOccupantGeneralBussinessAddresses);
	}

	/**
	 * Creates a new sez occupant general bussiness address with the primary key. Does not add the sez occupant general bussiness address to the database.
	 *
	 * @param sezOccGenBussAddressId the primary key for the new sez occupant general bussiness address
	 * @return the new sez occupant general bussiness address
	 */
	public static SezOccupantGeneralBussinessAddress create(
		long sezOccGenBussAddressId) {

		return getPersistence().create(sezOccGenBussAddressId);
	}

	/**
	 * Removes the sez occupant general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address that was removed
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a sez occupant general bussiness address with the primary key could not be found
	 */
	public static SezOccupantGeneralBussinessAddress remove(
			long sezOccGenBussAddressId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessAddressException {

		return getPersistence().remove(sezOccGenBussAddressId);
	}

	public static SezOccupantGeneralBussinessAddress updateImpl(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		return getPersistence().updateImpl(sezOccupantGeneralBussinessAddress);
	}

	/**
	 * Returns the sez occupant general bussiness address with the primary key or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a sez occupant general bussiness address with the primary key could not be found
	 */
	public static SezOccupantGeneralBussinessAddress findByPrimaryKey(
			long sezOccGenBussAddressId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezOccupantGeneralBussinessAddressException {

		return getPersistence().findByPrimaryKey(sezOccGenBussAddressId);
	}

	/**
	 * Returns the sez occupant general bussiness address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address, or <code>null</code> if a sez occupant general bussiness address with the primary key could not be found
	 */
	public static SezOccupantGeneralBussinessAddress fetchByPrimaryKey(
		long sezOccGenBussAddressId) {

		return getPersistence().fetchByPrimaryKey(sezOccGenBussAddressId);
	}

	/**
	 * Returns all the sez occupant general bussiness addresses.
	 *
	 * @return the sez occupant general bussiness addresses
	 */
	public static List<SezOccupantGeneralBussinessAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez occupant general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness addresses
	 * @param end the upper bound of the range of sez occupant general bussiness addresses (not inclusive)
	 * @return the range of sez occupant general bussiness addresses
	 */
	public static List<SezOccupantGeneralBussinessAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez occupant general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness addresses
	 * @param end the upper bound of the range of sez occupant general bussiness addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant general bussiness addresses
	 */
	public static List<SezOccupantGeneralBussinessAddress> findAll(
		int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessAddress>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez occupant general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness addresses
	 * @param end the upper bound of the range of sez occupant general bussiness addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant general bussiness addresses
	 */
	public static List<SezOccupantGeneralBussinessAddress> findAll(
		int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez occupant general bussiness addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez occupant general bussiness addresses.
	 *
	 * @return the number of sez occupant general bussiness addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezOccupantGeneralBussinessAddressPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		SezOccupantGeneralBussinessAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezOccupantGeneralBussinessAddressPersistence
		_persistence;

}