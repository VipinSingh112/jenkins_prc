/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeCompanyDetailsAddress;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the creative company details address service. This utility wraps <code>com.nbp.creative.application.form.service.service.persistence.impl.CreativeCompanyDetailsAddressPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDetailsAddressPersistence
 * @generated
 */
public class CreativeCompanyDetailsAddressUtil {

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
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		getPersistence().clearCache(creativeCompanyDetailsAddress);
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
	public static Map<Serializable, CreativeCompanyDetailsAddress>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CreativeCompanyDetailsAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CreativeCompanyDetailsAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CreativeCompanyDetailsAddress> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CreativeCompanyDetailsAddress> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CreativeCompanyDetailsAddress update(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		return getPersistence().update(creativeCompanyDetailsAddress);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CreativeCompanyDetailsAddress update(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress,
		ServiceContext serviceContext) {

		return getPersistence().update(
			creativeCompanyDetailsAddress, serviceContext);
	}

	/**
	 * Returns the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; or throws a <code>NoSuchCreativeCompanyDetailsAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the matching creative company details address
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a matching creative company details address could not be found
	 */
	public static CreativeCompanyDetailsAddress findBygetCreative_Com_Detail_AT(
			String addressType, long creativeCompanyDetailsId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDetailsAddressException {

		return getPersistence().findBygetCreative_Com_Detail_AT(
			addressType, creativeCompanyDetailsId);
	}

	/**
	 * Returns the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the matching creative company details address, or <code>null</code> if a matching creative company details address could not be found
	 */
	public static CreativeCompanyDetailsAddress
		fetchBygetCreative_Com_Detail_AT(
			String addressType, long creativeCompanyDetailsId) {

		return getPersistence().fetchBygetCreative_Com_Detail_AT(
			addressType, creativeCompanyDetailsId);
	}

	/**
	 * Returns the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company details address, or <code>null</code> if a matching creative company details address could not be found
	 */
	public static CreativeCompanyDetailsAddress
		fetchBygetCreative_Com_Detail_AT(
			String addressType, long creativeCompanyDetailsId,
			boolean useFinderCache) {

		return getPersistence().fetchBygetCreative_Com_Detail_AT(
			addressType, creativeCompanyDetailsId, useFinderCache);
	}

	/**
	 * Removes the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the creative company details address that was removed
	 */
	public static CreativeCompanyDetailsAddress
			removeBygetCreative_Com_Detail_AT(
				String addressType, long creativeCompanyDetailsId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDetailsAddressException {

		return getPersistence().removeBygetCreative_Com_Detail_AT(
			addressType, creativeCompanyDetailsId);
	}

	/**
	 * Returns the number of creative company details addresses where addressType = &#63; and creativeCompanyDetailsId = &#63;.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the number of matching creative company details addresses
	 */
	public static int countBygetCreative_Com_Detail_AT(
		String addressType, long creativeCompanyDetailsId) {

		return getPersistence().countBygetCreative_Com_Detail_AT(
			addressType, creativeCompanyDetailsId);
	}

	/**
	 * Caches the creative company details address in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetailsAddress the creative company details address
	 */
	public static void cacheResult(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		getPersistence().cacheResult(creativeCompanyDetailsAddress);
	}

	/**
	 * Caches the creative company details addresses in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetailsAddresses the creative company details addresses
	 */
	public static void cacheResult(
		List<CreativeCompanyDetailsAddress> creativeCompanyDetailsAddresses) {

		getPersistence().cacheResult(creativeCompanyDetailsAddresses);
	}

	/**
	 * Creates a new creative company details address with the primary key. Does not add the creative company details address to the database.
	 *
	 * @param creativeComDetailsAddressId the primary key for the new creative company details address
	 * @return the new creative company details address
	 */
	public static CreativeCompanyDetailsAddress create(
		long creativeComDetailsAddressId) {

		return getPersistence().create(creativeComDetailsAddressId);
	}

	/**
	 * Removes the creative company details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address that was removed
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a creative company details address with the primary key could not be found
	 */
	public static CreativeCompanyDetailsAddress remove(
			long creativeComDetailsAddressId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDetailsAddressException {

		return getPersistence().remove(creativeComDetailsAddressId);
	}

	public static CreativeCompanyDetailsAddress updateImpl(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		return getPersistence().updateImpl(creativeCompanyDetailsAddress);
	}

	/**
	 * Returns the creative company details address with the primary key or throws a <code>NoSuchCreativeCompanyDetailsAddressException</code> if it could not be found.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a creative company details address with the primary key could not be found
	 */
	public static CreativeCompanyDetailsAddress findByPrimaryKey(
			long creativeComDetailsAddressId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeCompanyDetailsAddressException {

		return getPersistence().findByPrimaryKey(creativeComDetailsAddressId);
	}

	/**
	 * Returns the creative company details address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address, or <code>null</code> if a creative company details address with the primary key could not be found
	 */
	public static CreativeCompanyDetailsAddress fetchByPrimaryKey(
		long creativeComDetailsAddressId) {

		return getPersistence().fetchByPrimaryKey(creativeComDetailsAddressId);
	}

	/**
	 * Returns all the creative company details addresses.
	 *
	 * @return the creative company details addresses
	 */
	public static List<CreativeCompanyDetailsAddress> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the creative company details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company details addresses
	 * @param end the upper bound of the range of creative company details addresses (not inclusive)
	 * @return the range of creative company details addresses
	 */
	public static List<CreativeCompanyDetailsAddress> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the creative company details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company details addresses
	 * @param end the upper bound of the range of creative company details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company details addresses
	 */
	public static List<CreativeCompanyDetailsAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDetailsAddress> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the creative company details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company details addresses
	 * @param end the upper bound of the range of creative company details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company details addresses
	 */
	public static List<CreativeCompanyDetailsAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDetailsAddress> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the creative company details addresses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of creative company details addresses.
	 *
	 * @return the number of creative company details addresses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CreativeCompanyDetailsAddressPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CreativeCompanyDetailsAddressPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CreativeCompanyDetailsAddressPersistence
		_persistence;

}