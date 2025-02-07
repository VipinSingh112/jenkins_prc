/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the sez zone general bussiness address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneGeneralBussinessAddressUtil
 * @generated
 */
@ProviderType
public interface SezZoneGeneralBussinessAddressPersistence
	extends BasePersistence<SezZoneGeneralBussinessAddress> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SezZoneGeneralBussinessAddressUtil} to access the sez zone general bussiness address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a matching sez zone general bussiness address could not be found
	 */
	public SezZoneGeneralBussinessAddress findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId);

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache);

	/**
	 * Removes the sez zone general bussiness address where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone general bussiness address that was removed
	 */
	public SezZoneGeneralBussinessAddress removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	/**
	 * Returns the number of sez zone general bussiness addresses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone general bussiness addresses
	 */
	public int countBygetSezStatusByAppId(long sezStatusApplicationId);

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a matching sez zone general bussiness address could not be found
	 */
	public SezZoneGeneralBussinessAddress findBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAddressType_SAI(
		long sezStatusApplicationId, String addresstype);

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAddressType_SAI(
		long sezStatusApplicationId, String addresstype,
		boolean useFinderCache);

	/**
	 * Removes the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the sez zone general bussiness address that was removed
	 */
	public SezZoneGeneralBussinessAddress removeBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	/**
	 * Returns the number of sez zone general bussiness addresses where sezStatusApplicationId = &#63; and addresstype = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez zone general bussiness addresses
	 */
	public int countBygetSezStatusByAddressType_SAI(
		long sezStatusApplicationId, String addresstype);

	/**
	 * Returns the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a matching sez zone general bussiness address could not be found
	 */
	public SezZoneGeneralBussinessAddress findBygetSezStatusByAddressType_GBI(
			long sezZoneGeneralBusinessInfoId, String addresstype)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	/**
	 * Returns the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAddressType_GBI(
		long sezZoneGeneralBusinessInfoId, String addresstype);

	/**
	 * Returns the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAddressType_GBI(
		long sezZoneGeneralBusinessInfoId, String addresstype,
		boolean useFinderCache);

	/**
	 * Removes the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the sez zone general bussiness address that was removed
	 */
	public SezZoneGeneralBussinessAddress removeBygetSezStatusByAddressType_GBI(
			long sezZoneGeneralBusinessInfoId, String addresstype)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	/**
	 * Returns the number of sez zone general bussiness addresses where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63;.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez zone general bussiness addresses
	 */
	public int countBygetSezStatusByAddressType_GBI(
		long sezZoneGeneralBusinessInfoId, String addresstype);

	/**
	 * Caches the sez zone general bussiness address in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBussinessAddress the sez zone general bussiness address
	 */
	public void cacheResult(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress);

	/**
	 * Caches the sez zone general bussiness addresses in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBussinessAddresses the sez zone general bussiness addresses
	 */
	public void cacheResult(
		java.util.List<SezZoneGeneralBussinessAddress>
			sezZoneGeneralBussinessAddresses);

	/**
	 * Creates a new sez zone general bussiness address with the primary key. Does not add the sez zone general bussiness address to the database.
	 *
	 * @param sezZoneGenBussAddressId the primary key for the new sez zone general bussiness address
	 * @return the new sez zone general bussiness address
	 */
	public SezZoneGeneralBussinessAddress create(long sezZoneGenBussAddressId);

	/**
	 * Removes the sez zone general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was removed
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a sez zone general bussiness address with the primary key could not be found
	 */
	public SezZoneGeneralBussinessAddress remove(long sezZoneGenBussAddressId)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	public SezZoneGeneralBussinessAddress updateImpl(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress);

	/**
	 * Returns the sez zone general bussiness address with the primary key or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a sez zone general bussiness address with the primary key could not be found
	 */
	public SezZoneGeneralBussinessAddress findByPrimaryKey(
			long sezZoneGenBussAddressId)
		throws NoSuchSezZoneGeneralBussinessAddressException;

	/**
	 * Returns the sez zone general bussiness address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address, or <code>null</code> if a sez zone general bussiness address with the primary key could not be found
	 */
	public SezZoneGeneralBussinessAddress fetchByPrimaryKey(
		long sezZoneGenBussAddressId);

	/**
	 * Returns all the sez zone general bussiness addresses.
	 *
	 * @return the sez zone general bussiness addresses
	 */
	public java.util.List<SezZoneGeneralBussinessAddress> findAll();

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
	public java.util.List<SezZoneGeneralBussinessAddress> findAll(
		int start, int end);

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
	public java.util.List<SezZoneGeneralBussinessAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezZoneGeneralBussinessAddress> orderByComparator);

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
	public java.util.List<SezZoneGeneralBussinessAddress> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<SezZoneGeneralBussinessAddress> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the sez zone general bussiness addresses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of sez zone general bussiness addresses.
	 *
	 * @return the number of sez zone general bussiness addresses
	 */
	public int countAll();

}