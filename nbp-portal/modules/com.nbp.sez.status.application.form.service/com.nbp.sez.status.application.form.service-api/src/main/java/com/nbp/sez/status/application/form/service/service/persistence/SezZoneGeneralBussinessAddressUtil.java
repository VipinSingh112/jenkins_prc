/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez zone general bussiness address service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezZoneGeneralBussinessAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBussinessAddressPersistence
 * @generated
 */
public class SezZoneGeneralBussinessAddressUtil {

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
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		getPersistence().clearCache(sezZoneGeneralBussinessAddress);
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
	public static Map<Serializable, SezZoneGeneralBussinessAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezZoneGeneralBussinessAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezZoneGeneralBussinessAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezZoneGeneralBussinessAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezZoneGeneralBussinessAddress> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezZoneGeneralBussinessAddress update(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		return getPersistence().update(sezZoneGeneralBussinessAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezZoneGeneralBussinessAddress update(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			sezZoneGeneralBussinessAddress, serviceContext);
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a matching sez zone general bussiness address could not be found
	 */
	public static SezZoneGeneralBussinessAddress findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneGeneralBussinessAddressException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public static SezZoneGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public static SezZoneGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez zone general bussiness address where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone general bussiness address that was removed
	 */
	public static SezZoneGeneralBussinessAddress removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneGeneralBussinessAddressException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez zone general bussiness addresses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone general bussiness addresses
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a matching sez zone general bussiness address could not be found
	 */
	public static SezZoneGeneralBussinessAddress
			findBygetSezStatusByAddressType_SAI(
				long sezStatusApplicationId, String addresstype)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneGeneralBussinessAddressException {

		return getPersistence().findBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype);
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public static SezZoneGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype) {

		return getPersistence().fetchBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype);
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public static SezZoneGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype,
			boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype, useFinderCache);
	}

	/**
	 * Removes the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the sez zone general bussiness address that was removed
	 */
	public static SezZoneGeneralBussinessAddress
			removeBygetSezStatusByAddressType_SAI(
				long sezStatusApplicationId, String addresstype)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneGeneralBussinessAddressException {

		return getPersistence().removeBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype);
	}

	/**
	 * Returns the number of sez zone general bussiness addresses where sezStatusApplicationId = &#63; and addresstype = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez zone general bussiness addresses
	 */
	public static int countBygetSezStatusByAddressType_SAI(
		long sezStatusApplicationId, String addresstype) {

		return getPersistence().countBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype);
	}

	/**
	 * Returns the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a matching sez zone general bussiness address could not be found
	 */
	public static SezZoneGeneralBussinessAddress
			findBygetSezStatusByAddressType_GBI(
				long sezZoneGeneralBusinessInfoId, String addresstype)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneGeneralBussinessAddressException {

		return getPersistence().findBygetSezStatusByAddressType_GBI(
			sezZoneGeneralBusinessInfoId, addresstype);
	}

	/**
	 * Returns the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public static SezZoneGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_GBI(
			long sezZoneGeneralBusinessInfoId, String addresstype) {

		return getPersistence().fetchBygetSezStatusByAddressType_GBI(
			sezZoneGeneralBusinessInfoId, addresstype);
	}

	/**
	 * Returns the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public static SezZoneGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_GBI(
			long sezZoneGeneralBusinessInfoId, String addresstype,
			boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAddressType_GBI(
			sezZoneGeneralBusinessInfoId, addresstype, useFinderCache);
	}

	/**
	 * Removes the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the sez zone general bussiness address that was removed
	 */
	public static SezZoneGeneralBussinessAddress
			removeBygetSezStatusByAddressType_GBI(
				long sezZoneGeneralBusinessInfoId, String addresstype)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneGeneralBussinessAddressException {

		return getPersistence().removeBygetSezStatusByAddressType_GBI(
			sezZoneGeneralBusinessInfoId, addresstype);
	}

	/**
	 * Returns the number of sez zone general bussiness addresses where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63;.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez zone general bussiness addresses
	 */
	public static int countBygetSezStatusByAddressType_GBI(
		long sezZoneGeneralBusinessInfoId, String addresstype) {

		return getPersistence().countBygetSezStatusByAddressType_GBI(
			sezZoneGeneralBusinessInfoId, addresstype);
	}

	/**
	 * Caches the sez zone general bussiness address in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBussinessAddress the sez zone general bussiness address
	 */
	public static void cacheResult(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		getPersistence().cacheResult(sezZoneGeneralBussinessAddress);
	}

	/**
	 * Caches the sez zone general bussiness addresses in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBussinessAddresses the sez zone general bussiness addresses
	 */
	public static void cacheResult(
		List<SezZoneGeneralBussinessAddress> sezZoneGeneralBussinessAddresses) {

		getPersistence().cacheResult(sezZoneGeneralBussinessAddresses);
	}

	/**
	 * Creates a new sez zone general bussiness address with the primary key. Does not add the sez zone general bussiness address to the database.
	 *
	 * @param sezZoneGenBussAddressId the primary key for the new sez zone general bussiness address
	 * @return the new sez zone general bussiness address
	 */
	public static SezZoneGeneralBussinessAddress create(
		long sezZoneGenBussAddressId) {

		return getPersistence().create(sezZoneGenBussAddressId);
	}

	/**
	 * Removes the sez zone general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was removed
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a sez zone general bussiness address with the primary key could not be found
	 */
	public static SezZoneGeneralBussinessAddress remove(
			long sezZoneGenBussAddressId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneGeneralBussinessAddressException {

		return getPersistence().remove(sezZoneGenBussAddressId);
	}

	public static SezZoneGeneralBussinessAddress updateImpl(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		return getPersistence().updateImpl(sezZoneGeneralBussinessAddress);
	}

	/**
	 * Returns the sez zone general bussiness address with the primary key or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a sez zone general bussiness address with the primary key could not be found
	 */
	public static SezZoneGeneralBussinessAddress findByPrimaryKey(
			long sezZoneGenBussAddressId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneGeneralBussinessAddressException {

		return getPersistence().findByPrimaryKey(sezZoneGenBussAddressId);
	}

	/**
	 * Returns the sez zone general bussiness address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address, or <code>null</code> if a sez zone general bussiness address with the primary key could not be found
	 */
	public static SezZoneGeneralBussinessAddress fetchByPrimaryKey(
		long sezZoneGenBussAddressId) {

		return getPersistence().fetchByPrimaryKey(sezZoneGenBussAddressId);
	}

	/**
	 * Returns all the sez zone general bussiness addresses.
	 *
	 * @return the sez zone general bussiness addresses
	 */
	public static List<SezZoneGeneralBussinessAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez zone general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general bussiness addresses
	 * @param end the upper bound of the range of sez zone general bussiness addresses (not inclusive)
	 * @return the range of sez zone general bussiness addresses
	 */
	public static List<SezZoneGeneralBussinessAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez zone general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general bussiness addresses
	 * @param end the upper bound of the range of sez zone general bussiness addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone general bussiness addresses
	 */
	public static List<SezZoneGeneralBussinessAddress> findAll(
		int start, int end,
		OrderByComparator<SezZoneGeneralBussinessAddress> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez zone general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general bussiness addresses
	 * @param end the upper bound of the range of sez zone general bussiness addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone general bussiness addresses
	 */
	public static List<SezZoneGeneralBussinessAddress> findAll(
		int start, int end,
		OrderByComparator<SezZoneGeneralBussinessAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez zone general bussiness addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez zone general bussiness addresses.
	 *
	 * @return the number of sez zone general bussiness addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezZoneGeneralBussinessAddressPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezZoneGeneralBussinessAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezZoneGeneralBussinessAddressPersistence
		_persistence;

}